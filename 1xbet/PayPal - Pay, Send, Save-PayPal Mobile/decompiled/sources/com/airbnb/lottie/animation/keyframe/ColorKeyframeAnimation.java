package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class ColorKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<java.lang.Integer> {
    public ColorKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Integer>> list) {
        super(list);
    }

    public int getIntValue(com.airbnb.lottie.value.Keyframe<java.lang.Integer> keyframe, float f) {
        java.lang.Integer num;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueCallback != null && keyframe.endFrame != null && (num = (java.lang.Integer) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f, getHighSpeedVideoSizes(), getProgress())) != null) {
            return num.intValue();
        }
        return com.airbnb.lottie.utils.GammaEvaluator.evaluate(com.airbnb.lottie.utils.MiscUtils.clamp(f, 0.0f, 1.0f), keyframe.startValue.intValue(), keyframe.endValue.intValue());
    }

    public int getIntValue() {
        return getIntValue(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return java.lang.Integer.valueOf(getIntValue(keyframe, f));
    }
}
