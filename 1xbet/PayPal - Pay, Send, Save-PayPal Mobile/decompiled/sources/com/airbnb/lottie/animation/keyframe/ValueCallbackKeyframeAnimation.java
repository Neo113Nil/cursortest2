package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class ValueCallbackKeyframeAnimation<K, A> extends com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<K, A> {
    private final A getHighSpeedVideoFpsRangesFor;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    final float Camera2StreamConfigurationMap() {
        return 1.0f;
    }

    public ValueCallbackKeyframeAnimation(com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback) {
        this(lottieValueCallback, null);
    }

    public ValueCallbackKeyframeAnimation(com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback, A a2) {
        super(java.util.Collections.emptyList());
        setValueCallback(lottieValueCallback);
        this.getHighSpeedVideoFpsRangesFor = a2;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.progress = f;
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void notifyListeners() {
        if (this.valueCallback != null) {
            super.notifyListeners();
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public A getValue() {
        com.airbnb.lottie.value.LottieValueCallback<A> lottieValueCallback = this.valueCallback;
        A a2 = this.getHighSpeedVideoFpsRangesFor;
        return lottieValueCallback.getValueInternal(0.0f, 0.0f, a2, a2, getProgress(), getProgress(), getProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    A getValue(com.airbnb.lottie.value.Keyframe<K> keyframe, float f) {
        return getValue();
    }
}
