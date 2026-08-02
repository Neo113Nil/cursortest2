package org.betup.model.remote.entity.shop;

/* loaded from: classes2.dex */
public class SellResultModel {
    private float sellCoefficient;
    private boolean sellSuccessful;

    public boolean isSellSuccessful() {
        return this.sellSuccessful;
    }

    public void setSellSuccessful(boolean sellSuccessful) {
        this.sellSuccessful = sellSuccessful;
    }

    public float getSellCoefficient() {
        return this.sellCoefficient;
    }

    public void setSellCoefficient(float sellCoefficient) {
        this.sellCoefficient = sellCoefficient;
    }
}
