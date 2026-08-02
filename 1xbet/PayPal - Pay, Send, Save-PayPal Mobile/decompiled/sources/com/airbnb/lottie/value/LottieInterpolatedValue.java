package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
abstract class LottieInterpolatedValue<T> extends com.airbnb.lottie.value.LottieValueCallback<T> {
    private final T Camera2StreamConfigurationMap;
    private final T getHighSpeedVideoFpsRanges;
    private final android.view.animation.Interpolator getHighSpeedVideoFpsRangesFor;

    abstract T Camera2StreamConfigurationMap(T t, T t2, float f);

    LottieInterpolatedValue(T t, T t2) {
        this(t, t2, new android.view.animation.LinearInterpolator());
    }

    LottieInterpolatedValue(T t, T t2, android.view.animation.Interpolator interpolator) {
        this.Camera2StreamConfigurationMap = t;
        this.getHighSpeedVideoFpsRanges = t2;
        this.getHighSpeedVideoFpsRangesFor = interpolator;
    }

    @Override // com.airbnb.lottie.value.LottieValueCallback
    public T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
        return Camera2StreamConfigurationMap(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor.getInterpolation(lottieFrameInfo.getOverallProgress()));
    }
}
