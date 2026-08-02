package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
public class LottieFrameInfo<T> {
    private float Camera2StreamConfigurationMap;
    private float getHighResolutionOutputSizeshNQ4ISI;
    private float getHighSpeedVideoFpsRanges;
    private float getHighSpeedVideoFpsRangesFor;
    private T getHighSpeedVideoSizes;
    private float getHighSpeedVideoSizesFor;
    private T getOutputFormats;

    public com.airbnb.lottie.value.LottieFrameInfo<T> set(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.getHighSpeedVideoSizesFor = f;
        this.getHighResolutionOutputSizeshNQ4ISI = f2;
        this.getOutputFormats = t;
        this.getHighSpeedVideoSizes = t2;
        this.getHighSpeedVideoFpsRangesFor = f3;
        this.getHighSpeedVideoFpsRanges = f4;
        this.Camera2StreamConfigurationMap = f5;
        return this;
    }

    public float getStartFrame() {
        return this.getHighSpeedVideoSizesFor;
    }

    public float getEndFrame() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public T getStartValue() {
        return this.getOutputFormats;
    }

    public T getEndValue() {
        return this.getHighSpeedVideoSizes;
    }

    public float getLinearKeyframeProgress() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getOverallProgress() {
        return this.Camera2StreamConfigurationMap;
    }
}
