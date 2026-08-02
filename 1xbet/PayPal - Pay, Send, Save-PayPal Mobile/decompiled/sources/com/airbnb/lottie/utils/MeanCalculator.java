package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class MeanCalculator {
    private int getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoSizes;

    public void add(float f) {
        float f2 = this.getHighSpeedVideoSizes + f;
        this.getHighSpeedVideoSizes = f2;
        int i = this.getHighResolutionOutputSizeshNQ4ISI + 1;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        if (i == Integer.MAX_VALUE) {
            this.getHighSpeedVideoSizes = f2 / 2.0f;
            this.getHighResolutionOutputSizeshNQ4ISI = i / 2;
        }
    }

    public float getMean() {
        int i = this.getHighResolutionOutputSizeshNQ4ISI;
        if (i == 0) {
            return 0.0f;
        }
        return this.getHighSpeedVideoSizes / i;
    }
}
