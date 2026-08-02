package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class ShapePath implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean Camera2StreamConfigurationMap;
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatableShapeValue getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    public ShapePath(java.lang.String str, int i, com.airbnb.lottie.model.animatable.AnimatableShapeValue animatableShapeValue, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getHighResolutionOutputSizeshNQ4ISI = i;
        this.getHighSpeedVideoFpsRanges = animatableShapeValue;
        this.Camera2StreamConfigurationMap = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableShapeValue getShapePath() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.ShapeContent(lottieDrawable, baseLayer, this);
    }

    public boolean isHidden() {
        return this.Camera2StreamConfigurationMap;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ShapePath{name=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", index=");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
