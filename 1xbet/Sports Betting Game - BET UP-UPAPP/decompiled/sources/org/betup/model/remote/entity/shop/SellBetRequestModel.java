package org.betup.model.remote.entity.shop;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class SellBetRequestModel {

    @SerializedName("sellCoefficient")
    private double sellCoefficient;

    public SellBetRequestModel(double sellCoefficient) {
        this.sellCoefficient = sellCoefficient;
    }

    public double getSellCoefficient() {
        return this.sellCoefficient;
    }

    public void setSellCoefficient(double sellCoefficient) {
        this.sellCoefficient = sellCoefficient;
    }
}
