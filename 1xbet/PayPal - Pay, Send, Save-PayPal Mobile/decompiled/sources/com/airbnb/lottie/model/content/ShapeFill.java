package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class ShapeFill implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableColorValue getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.Path.FillType getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue getInputFormats;

    public ShapeFill(java.lang.String str, boolean z, android.graphics.Path.FillType fillType, com.airbnb.lottie.model.animatable.AnimatableColorValue animatableColorValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, boolean z2) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = fillType;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableColorValue;
        this.getInputFormats = animatableIntegerValue;
        this.getHighSpeedVideoSizes = z2;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableColorValue getColor() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.getInputFormats;
    }

    public android.graphics.Path.FillType getFillType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.FillContent(lottieDrawable, baseLayer, this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapeFill{color=, fillEnabled=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
