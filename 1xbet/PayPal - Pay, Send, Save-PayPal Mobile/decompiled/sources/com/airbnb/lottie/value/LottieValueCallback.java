package com.airbnb.lottie.value;

/* loaded from: classes7.dex */
public class LottieValueCallback<T> {
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.value.LottieFrameInfo<T> getHighSpeedVideoSizes;
    protected T value;

    public LottieValueCallback() {
        this.getHighSpeedVideoSizes = new com.airbnb.lottie.value.LottieFrameInfo<>();
        this.value = null;
    }

    public LottieValueCallback(T t) {
        this.getHighSpeedVideoSizes = new com.airbnb.lottie.value.LottieFrameInfo<>();
        this.value = t;
    }

    public T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
        return this.value;
    }

    public final void setValue(T t) {
        this.value = t;
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> baseKeyframeAnimation = this.getHighSpeedVideoFpsRanges;
        if (baseKeyframeAnimation != null) {
            baseKeyframeAnimation.notifyListeners();
        }
    }

    public final T getValueInternal(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        return getValue(this.getHighSpeedVideoSizes.set(f, f2, t, t2, f3, f4, f5));
    }

    public final void setAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.getHighSpeedVideoFpsRanges = baseKeyframeAnimation;
    }
}
