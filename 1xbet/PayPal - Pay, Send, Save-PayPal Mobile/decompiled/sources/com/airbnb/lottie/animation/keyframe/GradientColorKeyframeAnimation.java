package com.airbnb.lottie.animation.keyframe;

/* loaded from: classes7.dex */
public class GradientColorKeyframeAnimation extends com.airbnb.lottie.animation.keyframe.KeyframeAnimation<com.airbnb.lottie.model.content.GradientColor> {
    private final com.airbnb.lottie.model.content.GradientColor getHighSpeedVideoSizes;

    public GradientColorKeyframeAnimation(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor>> list) {
        super(list);
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            com.airbnb.lottie.model.content.GradientColor gradientColor = list.get(i2).startValue;
            if (gradientColor != null) {
                i = java.lang.Math.max(i, gradientColor.getSize());
            }
        }
        this.getHighSpeedVideoSizes = new com.airbnb.lottie.model.content.GradientColor(new float[i], new int[i]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation
    /* synthetic */ java.lang.Object getValue(com.airbnb.lottie.value.Keyframe keyframe, float f) {
        this.getHighSpeedVideoSizes.lerp((com.airbnb.lottie.model.content.GradientColor) keyframe.startValue, (com.airbnb.lottie.model.content.GradientColor) keyframe.endValue, f);
        return this.getHighSpeedVideoSizes;
    }
}
