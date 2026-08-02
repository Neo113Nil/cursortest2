package com.daon.dmds.models;

/* loaded from: classes7.dex */
public class DMDSIDCaptureResult {
    private final java.util.Map<java.lang.String, java.lang.String> getHighSpeedVideoFpsRanges;
    private final android.graphics.Bitmap getHighSpeedVideoFpsRangesFor;

    public DMDSIDCaptureResult(android.graphics.Bitmap bitmap, java.util.Map<java.lang.String, java.lang.String> map) {
        this.getHighSpeedVideoFpsRangesFor = bitmap;
        this.getHighSpeedVideoFpsRanges = map;
    }

    public android.graphics.Bitmap getQualityImage() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public java.util.Map<java.lang.String, java.lang.String> getQualityResult() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean hasResult() {
        return (this.getHighSpeedVideoFpsRangesFor == null || this.getHighSpeedVideoFpsRanges == null) ? false : true;
    }
}
