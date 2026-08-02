package org.betup.model.remote.entity.shop;

import org.betup.model.remote.api.rest.user.bets.models.BetsListModel;

/* loaded from: classes2.dex */
public class SellBetResultModel {
    private BetsListModel betList;
    private boolean sellAvailable;
    private double sellCoefficient;
    private boolean sellSuccessful;

    public double getSellCoefficient() {
        return this.sellCoefficient;
    }

    public void setSellCoefficient(double sellCoefficient) {
        this.sellCoefficient = sellCoefficient;
    }

    public boolean isSellAvailable() {
        return this.sellAvailable;
    }

    public void setSellAvailable(boolean sellAvailable) {
        this.sellAvailable = sellAvailable;
    }

    public boolean isSellSuccessful() {
        return this.sellSuccessful;
    }

    public void setSellSuccessful(boolean sellSuccessful) {
        this.sellSuccessful = sellSuccessful;
    }

    public BetsListModel getBetList() {
        return this.betList;
    }

    public void setBetList(BetsListModel betList) {
        this.betList = betList;
    }
}
