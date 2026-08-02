package org.betup.model.remote.entity.challenge;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class ChallengeStats {

    @SerializedName("avg_buy_in")
    private double averateBuyIn;

    @SerializedName("biggest_lost")
    private long biggestLost;

    @SerializedName("biggest_won")
    private long biggestWon;

    @SerializedName("challenges_lost")
    private int challengesLost;

    @SerializedName("challenges_won")
    private int challengesWon;

    @SerializedName("win_ratio")
    private double winRatio;

    public int getChallengesWon() {
        return this.challengesWon;
    }

    public void setChallengesWon(int challengesWon) {
        this.challengesWon = challengesWon;
    }

    public int getChallengesLost() {
        return this.challengesLost;
    }

    public void setChallengesLost(int challengesLost) {
        this.challengesLost = challengesLost;
    }

    public double getAverateBuyIn() {
        return this.averateBuyIn;
    }

    public void setAverateBuyIn(double averateBuyIn) {
        this.averateBuyIn = averateBuyIn;
    }

    public long getBiggestLost() {
        return this.biggestLost;
    }

    public void setBiggestLost(long biggestLost) {
        this.biggestLost = biggestLost;
    }

    public long getBiggestWon() {
        return this.biggestWon;
    }

    public void setBiggestWon(long biggestWon) {
        this.biggestWon = biggestWon;
    }

    public double getWinRatio() {
        return this.winRatio;
    }

    public void setWinRatio(double winRatio) {
        this.winRatio = winRatio;
    }
}
