package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class BoostLevelResultModel {

    @SerializedName("level")
    private int level;

    @SerializedName("money_balance")
    private long moneyBalance;

    public long getMoneyBalance() {
        return this.moneyBalance;
    }

    public void setMoneyBalance(long moneyBalance) {
        this.moneyBalance = moneyBalance;
    }

    public int getLevel() {
        return this.level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
