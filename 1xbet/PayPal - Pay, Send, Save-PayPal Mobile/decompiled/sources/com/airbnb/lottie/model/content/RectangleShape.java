package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class RectangleShape implements com.airbnb.lottie.model.content.ContentModel {
    private final com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoSizes;

    public RectangleShape(java.lang.String str, com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue, com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, boolean z) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighSpeedVideoFpsRangesFor = animatableValue;
        this.Camera2StreamConfigurationMap = animatableValue2;
        this.getHighSpeedVideoSizes = animatableFloatValue;
        this.getHighResolutionOutputSizeshNQ4ISI = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getCornerRadius() {
        return this.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getSize() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getPosition() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isHidden() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.RectangleContent(lottieDrawable, baseLayer, this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("RectangleShape{position=");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", size=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
