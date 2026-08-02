package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class PolystarShape implements com.airbnb.lottie.model.content.ContentModel {
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    private final boolean getHighSpeedVideoFpsRanges;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoSizes;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getInputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputMinFrameDuration;
    private final com.airbnb.lottie.model.content.PolystarShape.Type getOutputStallDurationlomOqCM;

    public enum Type {
        STAR(1),
        POLYGON(2);

        private final int getHighSpeedVideoFpsRanges;

        Type(int i) {
            this.getHighSpeedVideoFpsRanges = i;
        }

        public static com.airbnb.lottie.model.content.PolystarShape.Type forValue(int i) {
            for (com.airbnb.lottie.model.content.PolystarShape.Type type : values()) {
                if (type.getHighSpeedVideoFpsRanges == i) {
                    return type;
                }
            }
            return null;
        }
    }

    public PolystarShape(java.lang.String str, com.airbnb.lottie.model.content.PolystarShape.Type type, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> animatableValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue4, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue5, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue6, boolean z, boolean z2) {
        this.getHighSpeedVideoFpsRangesFor = str;
        this.getOutputStallDurationlomOqCM = type;
        this.getInputSizeshNQ4ISI = animatableFloatValue;
        this.getInputFormats = animatableValue;
        this.getHighSpeedVideoSizesFor = animatableFloatValue2;
        this.getHighSpeedVideoSizes = animatableFloatValue3;
        this.getOutputFormats = animatableFloatValue4;
        this.Camera2StreamConfigurationMap = animatableFloatValue5;
        this.getOutputMinFrameDuration = animatableFloatValue6;
        this.getHighSpeedVideoFpsRanges = z;
        this.getHighResolutionOutputSizeshNQ4ISI = z2;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.content.PolystarShape.Type getType() {
        return this.getOutputStallDurationlomOqCM;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getPoints() {
        return this.getInputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableValue<android.graphics.PointF, android.graphics.PointF> getPosition() {
        return this.getInputFormats;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getRotation() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getInnerRadius() {
        return this.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getOuterRadius() {
        return this.getOutputFormats;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getInnerRoundedness() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getOuterRoundedness() {
        return this.getOutputMinFrameDuration;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isReversed() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.PolystarContent(lottieDrawable, baseLayer, this);
    }
}
