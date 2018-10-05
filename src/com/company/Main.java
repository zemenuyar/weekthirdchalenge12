package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //print out the time table for 5 using a while loop

        int mynumber = 1;
        while (mynumber < 11){
            System.out.println(mynumber*5);
            mynumber++;
            }
            //print out the the time for table for 7 using a while loop
        for (int g =1; g < 11; g++) {
            System.out.println(g * 7);
            Scanner Keybord = new Scanner(System.in);
            String userImput;
            System.out.println("Enter a number");
            userImput = Keybord.next();

            while (!userImput.equals("no")){
                System.out.println("Enter a number");
                userImput = Keybord.next();
                System.out.println(userImput);
                System.out.println("do you want add more? type no to quit.");
                userImput = Keybord.next();
            }
        }


        }
    }



