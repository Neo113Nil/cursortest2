package com.airbnb.lottie.model.animatable;

/* loaded from: classes7.dex */
public class AnimatableTransform implements com.airbnb.lottie.animation.content.ModifierContent, com.airbnb.lottie.model.content.ContentModel {
    private boolean Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatablePathValue getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoSizes;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getInputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatableScaleValue getOutputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputMinFrameDuration;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputMinFrameDurationlomOqCM;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputSizes;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputStallDurationlomOqCM;

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return null;
    }

    public AnimatableTransform() {
        this(null, null, null, null, null, null, null, null, null, null, null, null);
    }

    public AnimatableTransform(com.airbnb.lottie.model.animatable.AnimatablePathValue animatablePathValue, com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue, com.airbnb.lottie.model.animatable.AnimatableScaleValue animatableScaleValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue4, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue5) {
        this(animatablePathValue, animatableValue, animatableScaleValue, animatableFloatValue, animatableIntegerValue, animatableFloatValue2, animatableFloatValue3, animatableFloatValue4, animatableFloatValue5, null, null, null);
    }

    public AnimatableTransform(com.airbnb.lottie.model.animatable.AnimatablePathValue animatablePathValue, com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue, com.airbnb.lottie.model.animatable.AnimatableScaleValue animatableScaleValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue4, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue5, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue6, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue7, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue8) {
        this.Camera2StreamConfigurationMap = false;
        this.getHighSpeedVideoFpsRanges = animatablePathValue;
        this.getHighSpeedVideoFpsRangesFor = animatableValue;
        this.getOutputFormats = animatableScaleValue;
        this.getHighSpeedVideoSizesFor = animatableFloatValue;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableIntegerValue;
        this.getOutputMinFrameDurationlomOqCM = animatableFloatValue2;
        this.getHighSpeedVideoSizes = animatableFloatValue3;
        this.getOutputStallDurationlomOqCM = animatableFloatValue4;
        this.getOutputSizes = animatableFloatValue5;
        this.getInputFormats = animatableFloatValue6;
        this.getInputSizeshNQ4ISI = animatableFloatValue7;
        this.getOutputMinFrameDuration = animatableFloatValue8;
    }

    public void setAutoOrient(boolean z) {
        this.Camera2StreamConfigurationMap = z;
    }

    public com.airbnb.lottie.model.animatable.AnimatablePathValue getAnchorPoint() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getPosition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableScaleValue getScale() {
        return this.getOutputFormats;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getRotation() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getStartOpacity() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getEndOpacity() {
        return this.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getSkew() {
        return this.getOutputStallDurationlomOqCM;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getSkewAngle() {
        return this.getOutputSizes;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getRotationX() {
        return this.getInputFormats;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getRotationY() {
        return this.getInputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getRotationZ() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isAutoOrient() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean has3DRotation() {
        return (this.getInputFormats == null && this.getInputSizeshNQ4ISI == null && this.getOutputMinFrameDuration == null) ? false : true;
    }

    public com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation createAnimation() {
        return new com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation(this);
    }
}
