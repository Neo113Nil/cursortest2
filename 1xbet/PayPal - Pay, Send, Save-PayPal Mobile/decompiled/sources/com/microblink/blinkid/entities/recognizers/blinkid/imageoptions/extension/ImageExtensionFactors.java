package com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension;

/* loaded from: classes10.dex */
public class ImageExtensionFactors {
    private final float Camera2StreamConfigurationMap;
    private final float getHighSpeedVideoFpsRanges;
    private final float getHighSpeedVideoFpsRangesFor;
    private final float getHighSpeedVideoSizes;

    public ImageExtensionFactors(float f, float f2, float f3, float f4) {
        getHighSpeedVideoFpsRangesFor(f);
        getHighSpeedVideoFpsRangesFor(f2);
        getHighSpeedVideoFpsRangesFor(f3);
        getHighSpeedVideoFpsRangesFor(f4);
        this.getHighSpeedVideoFpsRanges = f;
        this.getHighSpeedVideoFpsRangesFor = f2;
        this.Camera2StreamConfigurationMap = f3;
        this.getHighSpeedVideoSizes = f4;
    }

    public static final com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors createFromArray(float[] fArr) {
        if (fArr == null) {
            return new com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (fArr.length != 4) {
            throw new java.lang.IllegalArgumentException("Expected array of 4 factors!");
        }
        for (float f : fArr) {
            getHighSpeedVideoFpsRangesFor(f);
        }
        return new com.microblink.blinkid.entities.recognizers.blinkid.imageoptions.extension.ImageExtensionFactors(fArr[0], fArr[2], fArr[3], fArr[1]);
    }

    private static final void getHighSpeedVideoFpsRangesFor(float f) {
        double d = f;
        if (d > 1.0d || d < 0.0d) {
            throw new java.lang.IllegalArgumentException("Extension factor must be in range [0.0, 1.0], current factor value: ".concat(java.lang.String.valueOf(f)));
        }
    }

    public float getDownFactor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getLeftFactor() {
        return this.Camera2StreamConfigurationMap;
    }

    public float getRightFactor() {
        return this.getHighSpeedVideoSizes;
    }

    public float getUpFactor() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float[] serializeToArray() {
        return new float[]{this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRangesFor, this.Camera2StreamConfigurationMap};
    }
}
