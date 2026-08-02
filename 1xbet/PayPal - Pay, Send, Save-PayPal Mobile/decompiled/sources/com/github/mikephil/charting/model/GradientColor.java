package com.github.mikephil.charting.model;

/* loaded from: classes8.dex */
public class GradientColor {
    private int getHighSpeedVideoFpsRanges;
    private int getHighSpeedVideoFpsRangesFor;

    public GradientColor(int i, int i2) {
        this.getHighSpeedVideoFpsRangesFor = i;
        this.getHighSpeedVideoFpsRanges = i2;
    }

    public int getStartColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setStartColor(int i) {
        this.getHighSpeedVideoFpsRangesFor = i;
    }

    public int getEndColor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public void setEndColor(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }
}
