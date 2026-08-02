package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class GradientFill implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableGradientColorValue getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Path.FillType getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.content.GradientType getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.animatable.AnimatablePointValue getHighSpeedVideoSizes;
    private final java.lang.String getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getInputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatablePointValue getOutputMinFrameDuration;

    public GradientFill(java.lang.String str, com.airbnb.lottie.model.content.GradientType gradientType, android.graphics.Path.FillType fillType, com.airbnb.lottie.model.animatable.AnimatableGradientColorValue animatableGradientColorValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue, com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = gradientType;
        this.getHighSpeedVideoFpsRanges = fillType;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableGradientColorValue;
        this.getInputSizeshNQ4ISI = animatableIntegerValue;
        this.getOutputMinFrameDuration = animatablePointValue;
        this.getHighSpeedVideoSizes = animatablePointValue2;
        this.getHighSpeedVideoSizesFor = str;
        this.getInputFormats = animatableFloatValue;
        this.getOutputFormats = animatableFloatValue2;
        this.Camera2StreamConfigurationMap = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.airbnb.lottie.model.content.GradientType getGradientType() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public android.graphics.Path.FillType getFillType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.animatable.AnimatableGradientColorValue getGradientColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.getInputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatablePointValue getStartPoint() {
        return this.getOutputMinFrameDuration;
    }

    public com.airbnb.lottie.model.animatable.AnimatablePointValue getEndPoint() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isHidden() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.GradientFillContent(lottieDrawable, lottieComposition, baseLayer, this);
    }
}
