package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class CircleShape implements com.airbnb.lottie.model.content.ContentModel {
    private final com.airbnb.lottie.model.animatable.AnimatablePointValue Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public CircleShape(java.lang.String str, com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue, com.airbnb.lottie.model.animatable.AnimatablePointValue animatablePointValue, boolean z, boolean z2) {
        this.getHighSpeedVideoFpsRanges = str;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableValue;
        this.Camera2StreamConfigurationMap = animatablePointValue;
        this.getHighSpeedVideoFpsRangesFor = z;
        this.getHighSpeedVideoSizes = z2;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.EllipseContent(lottieDrawable, baseLayer, this);
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getPosition() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatablePointValue getSize() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isReversed() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoSizes;
    }
}
