package com.airbnb.lottie.model.animatable;

/* loaded from: classes7.dex */
public class AnimatableSplitDimensionPathValue implements com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> {
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoFpsRanges;

    public AnimatableSplitDimensionPathValue(com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2) {
        this.getHighSpeedVideoFpsRanges = animatableFloatValue;
        this.Camera2StreamConfigurationMap = animatableFloatValue2;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> getKeyframes() {
        throw new java.lang.UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.getHighSpeedVideoFpsRanges.isStatic() && this.Camera2StreamConfigurationMap.isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation() {
        return new com.airbnb.lottie.animation.keyframe.SplitDimensionPathKeyframeAnimation(this.getHighSpeedVideoFpsRanges.createAnimation(), this.Camera2StreamConfigurationMap.createAnimation());
    }
}
