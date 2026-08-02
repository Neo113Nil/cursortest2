package com.airbnb.lottie.model.animatable;

/* loaded from: classes7.dex */
public class AnimatableGradientColorValue extends com.airbnb.lottie.model.animatable.BaseAnimatableValue<com.airbnb.lottie.model.content.GradientColor, com.airbnb.lottie.model.content.GradientColor> {
    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ java.util.List getKeyframes() {
        return super.getKeyframes();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue, com.airbnb.lottie.model.animatable.AnimatableValue
    public /* bridge */ /* synthetic */ boolean isStatic() {
        return super.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.BaseAnimatableValue
    public /* bridge */ /* synthetic */ java.lang.String toString() {
        return super.toString();
    }

    public AnimatableGradientColorValue(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor>> list) {
        super((java.util.List) getHighSpeedVideoSizes(list));
    }

    private static java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor>> getHighSpeedVideoSizes(java.util.List<com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor>> list) {
        for (int i = 0; i < list.size(); i++) {
            com.airbnb.lottie.value.Keyframe<com.airbnb.lottie.model.content.GradientColor> keyframe = list.get(i);
            com.airbnb.lottie.model.content.GradientColor gradientColor = keyframe.startValue;
            com.airbnb.lottie.model.content.GradientColor gradientColor2 = keyframe.endValue;
            if (gradientColor != null && gradientColor2 != null && gradientColor.getPositions().length != gradientColor2.getPositions().length) {
                float[] positions = gradientColor.getPositions();
                float[] positions2 = gradientColor2.getPositions();
                int length = positions.length + positions2.length;
                float[] fArr = new float[length];
                java.lang.System.arraycopy(positions, 0, fArr, 0, positions.length);
                java.lang.System.arraycopy(positions2, 0, fArr, positions.length, positions2.length);
                java.util.Arrays.sort(fArr);
                float f = Float.NaN;
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    float f2 = fArr[i3];
                    if (f2 != f) {
                        fArr[i2] = f2;
                        i2++;
                        f = fArr[i3];
                    }
                }
                float[] copyOfRange = java.util.Arrays.copyOfRange(fArr, 0, i2);
                keyframe = keyframe.copyWith(gradientColor.copyWithPositions(copyOfRange), gradientColor2.copyWithPositions(copyOfRange));
            }
            list.set(i, keyframe);
        }
        return list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.GradientColor, com.airbnb.lottie.model.content.GradientColor> createAnimation() {
        return new com.airbnb.lottie.animation.keyframe.GradientColorKeyframeAnimation(this.getHighResolutionOutputSizeshNQ4ISI);
    }
}
