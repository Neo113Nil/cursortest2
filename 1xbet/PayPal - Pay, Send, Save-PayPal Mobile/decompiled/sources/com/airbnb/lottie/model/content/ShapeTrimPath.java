package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class ShapeTrimPath implements com.airbnb.lottie.model.content.ContentModel {
    private final boolean Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoFpsRangesFor;
    private final java.lang.String getHighSpeedVideoSizes;
    private final com.airbnb.lottie.model.content.ShapeTrimPath.Type getOutputFormats;

    public enum Type {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static com.airbnb.lottie.model.content.ShapeTrimPath.Type forId(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new java.lang.IllegalArgumentException("Unknown trim path type ".concat(java.lang.String.valueOf(i)));
        }
    }

    public ShapeTrimPath(java.lang.String str, com.airbnb.lottie.model.content.ShapeTrimPath.Type type, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue3, boolean z) {
        this.getHighSpeedVideoSizes = str;
        this.getOutputFormats = type;
        this.getHighSpeedVideoFpsRangesFor = animatableFloatValue;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableFloatValue2;
        this.getHighSpeedVideoFpsRanges = animatableFloatValue3;
        this.Camera2StreamConfigurationMap = z;
    }

    public java.lang.String getName() {
        return this.getHighSpeedVideoSizes;
    }

    public com.airbnb.lottie.model.content.ShapeTrimPath.Type getType() {
        return this.getOutputFormats;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getEnd() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getStart() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getOffset() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public boolean isHidden() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.TrimPathContent(baseLayer, this);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Trim Path: {start: ");
        sb.append(this.getHighSpeedVideoFpsRangesFor);
        sb.append(", end: ");
        sb.append(this.getHighResolutionOutputSizeshNQ4ISI);
        sb.append(", offset: ");
        sb.append(this.getHighSpeedVideoFpsRanges);
        sb.append("}");
        return sb.toString();
    }
}
