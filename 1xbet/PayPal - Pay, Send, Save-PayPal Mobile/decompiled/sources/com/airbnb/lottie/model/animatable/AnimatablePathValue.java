package com.airbnb.lottie.model.animatable;

/* loaded from: classes7.dex */
public class AnimatablePathValue implements com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> {
    private final java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> getHighSpeedVideoFpsRangesFor;

    public AnimatablePathValue(java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> list) {
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public java.util.List<com.airbnb.lottie.value.Keyframe<android.graphics.PointF>> getKeyframes() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public boolean isStatic() {
        return this.getHighSpeedVideoFpsRangesFor.size() == 1 && this.getHighSpeedVideoFpsRangesFor.get(0).isStatic();
    }

    @Override // com.airbnb.lottie.model.animatable.AnimatableValue
    public com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation() {
        if (this.getHighSpeedVideoFpsRangesFor.get(0).isStatic()) {
            return new com.airbnb.lottie.animation.keyframe.PointKeyframeAnimation(this.getHighSpeedVideoFpsRangesFor);
        }
        return new com.airbnb.lottie.animation.keyframe.PathKeyframeAnimation(this.getHighSpeedVideoFpsRangesFor);
    }
}
