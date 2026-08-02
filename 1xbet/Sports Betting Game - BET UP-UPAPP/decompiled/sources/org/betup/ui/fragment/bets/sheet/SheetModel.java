package org.betup.ui.fragment.bets.sheet;

import java.io.Serializable;

/* loaded from: classes4.dex */
public class SheetModel implements Serializable {
    private String date;
    private int grabbedBetId;
    private String pick;
    private double singleOdd;
    private String sport;
    private String teamNames;
    private String time;

    public int getGrabbedBetId() {
        return this.grabbedBetId;
    }

    public void setGrabbedBetId(int grabbedBetId) {
        this.grabbedBetId = grabbedBetId;
    }

    public String getTeamNames() {
        return this.teamNames;
    }

    public void setTeamNames(String teamNames) {
        this.teamNames = teamNames;
    }

    public String getPick() {
        return this.pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    public String getSport() {
        return this.sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public double getSingleOdd() {
        return this.singleOdd;
    }

    public void setSingleOdd(double singleOdd) {
        this.singleOdd = singleOdd;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
