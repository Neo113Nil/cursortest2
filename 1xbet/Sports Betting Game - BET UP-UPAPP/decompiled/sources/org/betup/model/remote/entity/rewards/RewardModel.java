package org.betup.model.remote.entity.rewards;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class RewardModel {

    @SerializedName("added_just_now")
    private boolean addedJustNow;

    @SerializedName("amount")
    private int amount;

    @SerializedName("created_at")
    private String createdAt;

    @SerializedName("money_balance")
    private double moneyBalance;

    @SerializedName("type")
    private String type;

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAddedJustNow() {
        return this.addedJustNow;
    }

    public void setAddedJustNow(boolean addedJustNow) {
        this.addedJustNow = addedJustNow;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(double moneyBalance) {
        this.moneyBalance = moneyBalance;
    }
}
