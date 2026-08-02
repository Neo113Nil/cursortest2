package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class Font {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final float getHighSpeedVideoFpsRanges;
    private android.graphics.Typeface getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;

    public Font(java.lang.String str, java.lang.String str2, java.lang.String str3, float f) {
        this.getHighSpeedVideoSizes = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
        this.Camera2StreamConfigurationMap = str3;
        this.getHighSpeedVideoFpsRanges = f;
    }

    public java.lang.String getFamily() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getName() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public java.lang.String getStyle() {
        return this.Camera2StreamConfigurationMap;
    }

    public android.graphics.Typeface getTypeface() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public void setTypeface(android.graphics.Typeface typeface) {
        this.getHighSpeedVideoFpsRangesFor = typeface;
    }
}
