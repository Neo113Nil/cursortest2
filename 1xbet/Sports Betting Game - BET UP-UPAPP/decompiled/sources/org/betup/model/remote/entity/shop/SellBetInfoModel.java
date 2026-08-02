package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SellBetInfoModel {

    @SerializedName("feeAmount")
    private long betcoinPrice;

    @SerializedName("returnAmount")
    private long moneyReturn;
    private boolean sellAvailable;
    private double sellCoefficient;

    public boolean isSellAvailable() {
        return this.sellAvailable;
    }

    public void setSellAvailable(boolean sellAvailable) {
        this.sellAvailable = sellAvailable;
    }

    public double getSellCoefficient() {
        return this.sellCoefficient;
    }

    public void setSellCoefficient(double sellCoefficient) {
        this.sellCoefficient = sellCoefficient;
    }

    public long getMoneyReturn() {
        return this.moneyReturn;
    }

    public void setMoneyReturn(long moneyReturn) {
        this.moneyReturn = moneyReturn;
    }

    public long getBetcoinPrice() {
        return this.betcoinPrice;
    }

    public void setBetcoinPrice(long betcoinPrice) {
        this.betcoinPrice = betcoinPrice;
    }
}
