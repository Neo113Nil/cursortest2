package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class FloatKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<java.lang.Float> {
    public FloatKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Float>> list) {
        super(list);
    }

    private float getHighSpeedVideoSizes(com.airbnb.lottie.value.Keyframe<java.lang.Float> keyframe, float f) {
        java.lang.Float f2;
        if (keyframe.startValue == null || keyframe.endValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        if (this.valueCallback != null && (f2 = (java.lang.Float) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, keyframe.endValue, f, getHighSpeedVideoSizes(), getProgress())) != null) {
            return f2.floatValue();
        }
        return com.airbnb.lottie.utils.MiscUtils.lerp(keyframe.getStartValueFloat(), keyframe.getEndValueFloat(), f);
    }

    public float getFloatValue() {
        return getHighSpeedVideoSizes(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return java.lang.Float.valueOf(getHighSpeedVideoSizes(keyframe, f));
    }
}
