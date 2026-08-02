package org.betup.model.remote.entity.bets;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SavingBetInfo {

    @SerializedName("exchangePossible")
    private boolean exchangePossible;

    @SerializedName("tickets")
    private int tickets;

    public boolean isExchangePossible() {
        return this.exchangePossible;
    }

    public void setExchangePossible(boolean exchangePossible) {
        this.exchangePossible = exchangePossible;
    }

    public int getTickets() {
        return this.tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }
}
