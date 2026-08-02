package org.betup.model.local.entity;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class TicketBetlistConfig {

    @SerializedName("odds")
    private float odds = 1.8f;

    @SerializedName("bonus")
    private int bonus = 1;

    public float getOdds() {
        return this.odds;
    }

    public void setOdds(float odds) {
        this.odds = odds;
    }

    public int getBonus() {
        return this.bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}
