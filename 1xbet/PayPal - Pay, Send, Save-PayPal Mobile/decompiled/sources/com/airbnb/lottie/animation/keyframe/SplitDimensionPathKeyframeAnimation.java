package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class SplitDimensionPathKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> {
    private final android.graphics.PointF Camera2StreamConfigurationMap;
    private final android.graphics.PointF getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighSpeedVideoSizes;
    protected com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> xValueCallback;
    protected com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> yValueCallback;

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* synthetic */ android.graphics.PointF getValue(com.airbnb.lottie.value.Keyframe<android.graphics.PointF> keyframe, float f) {
        return getHighSpeedVideoFpsRangesFor();
    }

    public SplitDimensionPathKeyframeAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2) {
        super(java.util.Collections.emptyList());
        this.Camera2StreamConfigurationMap = new android.graphics.PointF();
        this.getHighSpeedVideoFpsRanges = new android.graphics.PointF();
        this.getHighSpeedVideoFpsRangesFor = baseKeyframeAnimation;
        this.getHighSpeedVideoSizes = baseKeyframeAnimation2;
        setProgress(getProgress());
    }

    public void setXValueCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback2 = this.xValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.xValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    public void setYValueCallback(com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback) {
        com.airbnb.lottie.value.LottieValueCallback<java.lang.Float> lottieValueCallback2 = this.yValueCallback;
        if (lottieValueCallback2 != null) {
            lottieValueCallback2.setAnimation(null);
        }
        this.yValueCallback = lottieValueCallback;
        if (lottieValueCallback != null) {
            lottieValueCallback.setAnimation(this);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public void setProgress(float f) {
        this.getHighSpeedVideoFpsRangesFor.setProgress(f);
        this.getHighSpeedVideoSizes.setProgress(f);
        this.Camera2StreamConfigurationMap.set(this.getHighSpeedVideoFpsRangesFor.getValue().floatValue(), this.getHighSpeedVideoSizes.getValue().floatValue());
        for (int i = 0; i < this.getHighResolutionOutputSizeshNQ4ISI.size(); i++) {
            this.getHighResolutionOutputSizeshNQ4ISI.get(i).onValueChanged();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    public android.graphics.PointF getValue() {
        return getHighSpeedVideoFpsRangesFor();
    }

    private android.graphics.PointF getHighSpeedVideoFpsRangesFor() {
        java.lang.Float f;
        com.airbnb.lottie.value.Keyframe<java.lang.Float> currentKeyframe;
        com.airbnb.lottie.value.Keyframe<java.lang.Float> currentKeyframe2;
        java.lang.Float f2 = null;
        if (this.xValueCallback == null || (currentKeyframe2 = this.getHighSpeedVideoFpsRangesFor.getCurrentKeyframe()) == null) {
            f = null;
        } else {
            java.lang.Float f3 = currentKeyframe2.endFrame;
            f = this.xValueCallback.getValueInternal(currentKeyframe2.startFrame, f3 == null ? currentKeyframe2.startFrame : f3.floatValue(), currentKeyframe2.startValue, currentKeyframe2.endValue, this.getHighSpeedVideoFpsRangesFor.getInterpolatedCurrentKeyframeProgress(), this.getHighSpeedVideoFpsRangesFor.getHighSpeedVideoSizes(), this.getHighSpeedVideoFpsRangesFor.getProgress());
        }
        if (this.yValueCallback != null && (currentKeyframe = this.getHighSpeedVideoSizes.getCurrentKeyframe()) != null) {
            java.lang.Float f4 = currentKeyframe.endFrame;
            f2 = this.yValueCallback.getValueInternal(currentKeyframe.startFrame, f4 == null ? currentKeyframe.startFrame : f4.floatValue(), currentKeyframe.startValue, currentKeyframe.endValue, this.getHighSpeedVideoSizes.getInterpolatedCurrentKeyframeProgress(), this.getHighSpeedVideoSizes.getHighSpeedVideoSizes(), this.getHighSpeedVideoSizes.getProgress());
        }
        if (f == null) {
            this.getHighSpeedVideoFpsRanges.set(this.Camera2StreamConfigurationMap.x, 0.0f);
        } else {
            this.getHighSpeedVideoFpsRanges.set(f.floatValue(), 0.0f);
        }
        if (f2 == null) {
            android.graphics.PointF pointF = this.getHighSpeedVideoFpsRanges;
            pointF.set(pointF.x, this.Camera2StreamConfigurationMap.y);
        } else {
            android.graphics.PointF pointF2 = this.getHighSpeedVideoFpsRanges;
            pointF2.set(pointF2.x, f2.floatValue());
        }
        return this.getHighSpeedVideoFpsRanges;
    }
}
