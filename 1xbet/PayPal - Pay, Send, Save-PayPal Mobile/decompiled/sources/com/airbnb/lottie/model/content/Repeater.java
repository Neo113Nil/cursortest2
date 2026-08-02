package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class Repeater implements com.airbnb.lottie.model.content.ContentModel {
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighResolutionOutputSizeshNQ4ISI;
    private final java.lang.String getHighSpeedVideoFpsRanges;
    private final boolean getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableTransform getHighSpeedVideoSizes;

    public Repeater(java.lang.String str, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform, boolean z) {
        this.getHighSpeedVideoFpsRanges = str;
        this.Camera2StreamConfigurationMap = animatableFloatValue;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableFloatValue2;
        this.getHighSpeedVideoSizes = animatableTransform;
        this.getHighSpeedVideoFpsRangesFor = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getCopies() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getOffset() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableTransform getTransform() {
        return this.getHighSpeedVideoSizes;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.RepeaterContent(lottieDrawable, baseLayer, this);
    }
}
