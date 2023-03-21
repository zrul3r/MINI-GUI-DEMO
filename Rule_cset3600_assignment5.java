/*
This code is my own work. I did not get any help from any online source such as chegg.com; 
from a classmate, or any other person other than the instructor for this course. I understand 
that getting outside help from this course other than from the instructor will result in a 
grade of 0 in this assignment and other disciplinary actions for academic dishonesty.

name: Zak Rule
class: CSET 3600
instructor: Dr. Oluoch
homework: 5
date: 030521
summary: create a square home with the apps maps, photos, camera,
and LinkedIn.
 */
package rule_cset3600_assignment5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Rule_cset3600_assignment5 extends Application {
    
    @Override
    public void start(Stage primaryStage) 
    {
        //creating the home page for the apps to sit
        FlowPane home = new FlowPane();
        
        //setting the color of the home page
        home.setStyle("-fx-background-color: coral");
        
        //adding the apps to the home page
        home.getChildren().addAll(new Button("Maps"),
                new Button("Photos"),
                new Button("Camera"),
                new Button("LinkedIn"));
        
        //setting the size of the home page
        Scene scene = new Scene(home, 250, 100);
        
        //setting the title of the home page
        primaryStage.setTitle("Home");
        primaryStage.setScene(scene);
        
        //showing the stage
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}