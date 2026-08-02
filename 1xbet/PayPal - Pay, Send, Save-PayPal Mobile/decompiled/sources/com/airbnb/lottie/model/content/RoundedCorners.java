package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class RoundedCorners implements com.airbnb.lottie.model.content.ContentModel {
    private final java.lang.String Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableValue<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRanges;

    public RoundedCorners(java.lang.String str, com.airbnb.lottie.model.animatable.AnimatableValue<java.lang.Float, java.lang.Float> animatableValue) {
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = animatableValue;
    }

    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.airbnb.lottie.model.animatable.AnimatableValue<java.lang.Float, java.lang.Float> getCornerRadius() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.RoundedCornersContent(lottieDrawable, baseLayer, this);
    }
}
