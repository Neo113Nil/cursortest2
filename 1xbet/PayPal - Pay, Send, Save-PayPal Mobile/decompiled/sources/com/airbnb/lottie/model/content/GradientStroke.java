package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class GradientStroke implements com.airbnb.lottie.model.content.ContentModel {
    private final com.airbnb.lottie.model.content.ShapeStroke.LineCapType Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableGradientColorValue getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatablePointValue getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.content.GradientType getHighSpeedVideoSizes;
    private final boolean getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final float getInputSizeshNQ4ISI;
    private final java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> getOutputFormats;
    private final com.airbnb.lottie.model.content.ShapeStroke.LineJoinType getOutputMinFrameDuration;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputMinFrameDurationlomOqCM;
    private final com.airbnb.lottie.model.animatable.AnimatablePointValue getOutputSizes;
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOutputStallDurationlomOqCM;

    public GradientStroke(java.lang.String str, com.airbnb.lottie.model.content.GradientType gradientType, com.airbnb.lottie.model.animatable.AnimatableGradientColorValue animatableGradientColorValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue, com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.content.ShapeStroke.LineCapType lineCapType, com.airbnb.lottie.model.content.ShapeStroke.LineJoinType lineJoinType, float f, java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> list, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.getInputFormats = str;
        this.getHighSpeedVideoSizes = gradientType;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableGradientColorValue;
        this.getOutputStallDurationlomOqCM = animatableIntegerValue;
        this.getOutputSizes = animatablePointValue;
        this.getHighSpeedVideoFpsRanges = animatablePointValue2;
        this.getOutputMinFrameDurationlomOqCM = animatableFloatValue;
        this.Camera2StreamConfigurationMap = lineCapType;
        this.getOutputMinFrameDuration = lineJoinType;
        this.getInputSizeshNQ4ISI = f;
        this.getOutputFormats = list;
        this.getHighSpeedVideoFpsRangesFor = animatableFloatValue2;
        this.getHighSpeedVideoSizesFor = z;
    }

    public java.lang.String getName() {
        return this.getInputFormats;
    }

    public com.airbnb.lottie.model.content.GradientType getGradientType() {
        return this.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.model.animatable.AnimatableGradientColorValue getGradientColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.getOutputStallDurationlomOqCM;
    }

    public com.airbnb.lottie.model.animatable.AnimatablePointValue getStartPoint() {
        return this.getOutputSizes;
    }

    public com.airbnb.lottie.model.animatable.AnimatablePointValue getEndPoint() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getWidth() {
        return this.getOutputMinFrameDurationlomOqCM;
    }

    public com.airbnb.lottie.model.content.ShapeStroke.LineCapType getCapType() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.airbnb.lottie.model.content.ShapeStroke.LineJoinType getJoinType() {
        return this.getOutputMinFrameDuration;
    }

    public java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> getLineDashPattern() {
        return this.getOutputFormats;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getDashOffset() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public float getMiterLimit() {
        return this.getInputSizeshNQ4ISI;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoSizesFor;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.GradientStrokeContent(lottieDrawable, baseLayer, this);
    }
}
