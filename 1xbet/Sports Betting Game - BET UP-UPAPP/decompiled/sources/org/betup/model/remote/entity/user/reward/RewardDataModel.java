package org.betup.model.remote.entity.user.reward;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class RewardDataModel {

    @SerializedName("added_just_now")
    private boolean added;

    @SerializedName("amount")
    private int amount;

    @SerializedName("created_at")
    private String date;

    @SerializedName("money_balance")
    private long moneyBalance;

    @SerializedName("tickets")
    private int tickets;

    public int getTickets() {
        return this.tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public String getDate() {
        return this.date;
    }

    public int getAmount() {
        return this.amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isAdded() {
        return this.added;
    }

    public void setAdded(boolean added) {
        this.added = added;
    }

    public boolean isActive() {
        return this.added;
    }
}
