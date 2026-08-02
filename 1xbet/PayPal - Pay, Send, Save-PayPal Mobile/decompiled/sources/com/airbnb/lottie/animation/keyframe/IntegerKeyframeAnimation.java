package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class IntegerKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<java.lang.Integer> {
    public IntegerKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Integer>> list) {
        super(list);
    }

    private int getHighResolutionOutputSizeshNQ4ISI(com.airbnb.lottie.value.Keyframe<java.lang.Integer> keyframe, float f) {
        if (keyframe.startValue == null) {
            throw new java.lang.IllegalStateException("Missing values for keyframe.");
        }
        int startValueInt = keyframe.endValue == null ? keyframe.getStartValueInt() : keyframe.getEndValueInt();
        if (this.valueCallback != null) {
            java.lang.Integer num = (java.lang.Integer) this.valueCallback.getValueInternal(keyframe.startFrame, keyframe.endFrame.floatValue(), keyframe.startValue, java.lang.Integer.valueOf(startValueInt), f, getHighSpeedVideoSizes(), getProgress());
            if (num != null) {
                return num.intValue();
            }
        }
        return com.airbnb.lottie.utils.MiscUtils.lerp(keyframe.getStartValueInt(), startValueInt, f);
    }

    public int getIntValue() {
        return getHighResolutionOutputSizeshNQ4ISI(getCurrentKeyframe(), getInterpolatedCurrentKeyframeProgress());
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        return java.lang.Integer.valueOf(getHighResolutionOutputSizeshNQ4ISI(keyframe, f));
    }
}
