package com.airbnb.lottie.model;

/* loaded from: classes7.dex */
public class FontCharacter {
    private final double Camera2StreamConfigurationMap;
    private final java.lang.String getHighResolutionOutputSizeshNQ4ISI;
    private final char getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.util.List<com.airbnb.lottie.model.content.ShapeGroup> getHighSpeedVideoSizes;
    private final double getInputFormats;

    public static int hashFor(char c, java.lang.String str, java.lang.String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public FontCharacter(java.util.List<com.airbnb.lottie.model.content.ShapeGroup> list, char c, double d, double d2, java.lang.String str, java.lang.String str2) {
        this.getHighSpeedVideoSizes = list;
        this.getHighSpeedVideoFpsRanges = c;
        this.Camera2StreamConfigurationMap = d;
        this.getInputFormats = d2;
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = str2;
    }

    public java.util.List<com.airbnb.lottie.model.content.ShapeGroup> getShapes() {
        return this.getHighSpeedVideoSizes;
    }

    public double getWidth() {
        return this.getInputFormats;
    }

    public int hashCode() {
        return hashFor(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoFpsRangesFor);
    }
}
