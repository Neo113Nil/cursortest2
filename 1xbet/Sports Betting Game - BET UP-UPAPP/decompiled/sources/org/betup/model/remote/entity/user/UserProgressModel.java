package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class UserProgressModel {

    @SerializedName("dailyBonus")
    private boolean dailyBonus;

    @SerializedName("expToNextLevel")
    private long expToNextLevel;

    @SerializedName("level")
    private int level;

    @SerializedName("levelStartExp")
    private long levelStartExp;

    @SerializedName("max_bets_per_day")
    private long maxBetsPerDay;

    @SerializedName("max_money_place")
    private double maxMoneyPlaced;

    @SerializedName("money_balance")
    private long moneyBalance;

    @SerializedName("money_inplay")
    private long moneyInPlay;

    @SerializedName("money_potential")
    private double moneyPotential;

    @SerializedName("money_to_next")
    private long moneyToNextLevel;

    @SerializedName("one_click_bet_unlocked")
    private boolean oneClickBetUnlocked;

    @SerializedName("vip")
    private boolean vip;

    public boolean isOneClickBetUnlocked() {
        return this.oneClickBetUnlocked;
    }

    public void setOneClickBetUnlocked(boolean oneClickBetUnlocked) {
        this.oneClickBetUnlocked = oneClickBetUnlocked;
    }

    public boolean isVip() {
        return this.vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public boolean isDailyBonus() {
        return this.dailyBonus;
    }

    public void setDailyBonus(boolean dailyBonus) {
        this.dailyBonus = dailyBonus;
    }

    public long getExpToNextLevel() {
        return this.expToNextLevel;
    }

    public void setExpToNextLevel(long expToNextLevel) {
        this.expToNextLevel = expToNextLevel;
    }

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(long moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public long getMoneyInPlay() {
        return this.moneyInPlay;
    }

    public void setMoneyInPlay(long moneyInPlay) {
        this.moneyInPlay = moneyInPlay;
    }

    public double getMoneyPotential() {
        return this.moneyPotential;
    }

    public void setMoneyPotential(double moneyPotential) {
        this.moneyPotential = moneyPotential;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getLevelStartExp() {
        return this.levelStartExp;
    }

    public void setLevelStartExp(long levelStartExp) {
        this.levelStartExp = levelStartExp;
    }

    public long getMoneyToNextLevel() {
        return this.moneyToNextLevel;
    }

    public void setMoneyToNextLevel(long moneyToNextLevel) {
        this.moneyToNextLevel = moneyToNextLevel;
    }

    public long getMaxBetsPerDay() {
        return this.maxBetsPerDay;
    }

    public void setMaxBetsPerDay(long maxBetsPerDay) {
        this.maxBetsPerDay = maxBetsPerDay;
    }

    public double getMaxMoneyPlaced() {
        return this.maxMoneyPlaced;
    }

    public void setMaxMoneyPlaced(double maxMoneyPlaced) {
        this.maxMoneyPlaced = maxMoneyPlaced;
    }
}
