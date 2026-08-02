package com.airbnb.lottie;

/* loaded from: classes7.dex */
public class LottieImageAsset {
    private final java.lang.String Camera2StreamConfigurationMap;
    private android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI;
    private final int getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final int getInputSizeshNQ4ISI;

    public LottieImageAsset(int i, int i2, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.getInputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = i2;
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoSizes = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
    }

    public int getWidth() {
        return this.getInputSizeshNQ4ISI;
    }

    public int getHeight() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public java.lang.String getId() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String getFileName() {
        return this.getHighSpeedVideoSizes;
    }

    public java.lang.String getDirName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.graphics.Bitmap getBitmap() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public void setBitmap(android.graphics.Bitmap bitmap) {
        this.getHighResolutionOutputSizeshNQ4ISI = bitmap;
    }

    public com.airbnb.lottie.LottieImageAsset copyWithScale(float f) {
        com.airbnb.lottie.LottieImageAsset lottieImageAsset = new com.airbnb.lottie.LottieImageAsset((int) (this.getInputSizeshNQ4ISI * f), (int) (this.getHighSpeedVideoFpsRanges * f), this.Camera2StreamConfigurationMap, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor);
        android.graphics.Bitmap bitmap = this.getHighResolutionOutputSizeshNQ4ISI;
        if (bitmap != null) {
            lottieImageAsset.setBitmap(android.graphics.Bitmap.createScaledBitmap(bitmap, lottieImageAsset.getInputSizeshNQ4ISI, lottieImageAsset.getHighSpeedVideoFpsRanges, true));
        }
        return lottieImageAsset;
    }

    public boolean hasBitmap() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            return this.getHighSpeedVideoSizes.startsWith("data:") && this.getHighSpeedVideoSizes.indexOf("base64,") > 0;
        }
        return true;
    }
}
