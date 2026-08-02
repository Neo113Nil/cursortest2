package org.betup.model.remote.entity.user.stats;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserExBetsStatsModel {

    @SerializedName("all_bets")
    private int allBets;

    @SerializedName("average_bet_amount")
    private double averageBetAmount;

    @SerializedName("average_odds")
    private double averageOdds;

    @SerializedName("high_score")
    private long highscore;

    @SerializedName("lost")
    private int lost;

    @SerializedName("max_lost")
    private long maxLost;

    @SerializedName("pending")
    private int pending;

    @SerializedName("returned")
    private int returned;

    @SerializedName("total_money_lost")
    private long totalMoneyLost;

    @SerializedName("total_money_won")
    private long totalMoneyWon;

    @SerializedName("type")
    private String type;

    @SerializedName("won")
    private int won;

    public long getTotalMoneyWon() {
        return this.totalMoneyWon;
    }

    public void setTotalMoneyWon(long totalMoneyWon) {
        this.totalMoneyWon = totalMoneyWon;
    }

    public long getTotalMoneyLost() {
        return this.totalMoneyLost;
    }

    public void setTotalMoneyLost(long totalMoneyLost) {
        this.totalMoneyLost = totalMoneyLost;
    }

    public int getAllBets() {
        return this.allBets;
    }

    public void setAllBets(int allBets) {
        this.allBets = allBets;
    }

    public int getReturned() {
        return this.returned;
    }

    public void setReturned(int returned) {
        this.returned = returned;
    }

    public int getPending() {
        return this.pending;
    }

    public void setPending(int pending) {
        this.pending = pending;
    }

    public int getWon() {
        return this.won;
    }

    public void setWon(int won) {
        this.won = won;
    }

    public int getLost() {
        return this.lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public long getHighscore() {
        return this.highscore;
    }

    public void setHighscore(long highscore) {
        this.highscore = highscore;
    }

    public long getMaxLost() {
        return this.maxLost;
    }

    public void setMaxLost(long maxLost) {
        this.maxLost = maxLost;
    }

    public double getAverageOdds() {
        return this.averageOdds;
    }

    public void setAverageOdds(double averageOdds) {
        this.averageOdds = averageOdds;
    }

    public double getAverageBetAmount() {
        return this.averageBetAmount;
    }

    public void setAverageBetAmount(double averageBetAmount) {
        this.averageBetAmount = averageBetAmount;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
