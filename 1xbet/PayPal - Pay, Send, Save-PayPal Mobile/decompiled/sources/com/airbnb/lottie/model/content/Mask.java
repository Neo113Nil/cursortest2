package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class Mask {
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue Camera2StreamConfigurationMap;
    private final com.airbnb.lottie.model.animatable.AnimatableShapeValue getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.content.Mask.MaskMode getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;

    public enum MaskMode {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public Mask(com.airbnb.lottie.model.content.Mask.MaskMode maskMode, com.airbnb.lottie.model.animatable.AnimatableShapeValue animatableShapeValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, boolean z) {
        this.getHighSpeedVideoFpsRangesFor = maskMode;
        this.getHighResolutionOutputSizeshNQ4ISI = animatableShapeValue;
        this.Camera2StreamConfigurationMap = animatableIntegerValue;
        this.getHighSpeedVideoSizes = z;
    }

    public com.airbnb.lottie.model.content.Mask.MaskMode getMaskMode() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableShapeValue getMaskPath() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.Camera2StreamConfigurationMap;
    }

    public boolean isInverted() {
        return this.getHighSpeedVideoSizes;
    }
}
