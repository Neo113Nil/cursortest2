package org.betup.model.remote.entity.betslip;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BetListModel {

    @SerializedName("exp_added")
    @Expose
    private long expAdded;

    @SerializedName("id")
    private int id;

    @SerializedName("money_placed")
    @Expose
    private long moneyPlaced;

    public long getMoneyPlaced() {
        return this.moneyPlaced;
    }

    public long getExpAdded() {
        return this.expAdded;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setExpAdded(long expAdded) {
        this.expAdded = expAdded;
    }

    public void setMoneyPlaced(long moneyPlaced) {
        this.moneyPlaced = moneyPlaced;
    }
}
