package org.betup.model.remote.entity.user;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes2.dex */
public class TourMarketingRewardsModel {

    @SerializedName("completeBonusBetcoins")
    private long completeBonusBetcoins;

    @SerializedName("skipBetcoins")
    private long skipBetcoins;

    @SerializedName("demoStakeBetcoins")
    private long demoStakeBetcoins = 1000;

    @SerializedName("coefficientWin1")
    private double coefficientWin1 = 2.2d;

    @SerializedName("coefficientDraw")
    private double coefficientDraw = 3.5d;

    @SerializedName("coefficientWin2")
    private double coefficientWin2 = 2.5d;

    public long getSkipBetcoins() {
        return this.skipBetcoins;
    }

    public long getCompleteBonusBetcoins() {
        return this.completeBonusBetcoins;
    }

    public long getDemoStakeBetcoins() {
        return this.demoStakeBetcoins;
    }

    public double getCoefficientWin1() {
        return this.coefficientWin1;
    }

    public double getCoefficientDraw() {
        return this.coefficientDraw;
    }

    public double getCoefficientWin2() {
        return this.coefficientWin2;
    }
}
