package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public class Layer {
    private final java.lang.String ArtificialStackFrames;
    final com.airbnb.lottie.LottieComposition Camera2StreamConfigurationMap;
    private final boolean CoroutineDebuggingKt;
    private final java.lang.String accessartificialFrame;
    private final com.airbnb.lottie.model.layer.Layer.LayerType coroutineBoundary;
    private final long coroutineCreation;
    final java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Float>> getHighResolutionOutputSizeshNQ4ISI;
    final java.util.List<com.airbnb.lottie.model.content.Mask> getHighSpeedVideoFpsRanges;
    final com.airbnb.lottie.model.layer.Layer.MatteType getHighSpeedVideoFpsRangesFor;
    final long getHighSpeedVideoSizes;
    final float getHighSpeedVideoSizesFor;
    final int getInputFormats;
    final int getInputSizeshNQ4ISI;
    final java.util.List<com.airbnb.lottie.model.content.ContentModel> getOutputFormats;
    final float getOutputMinFrameDuration;
    final float getOutputMinFrameDurationlomOqCM;
    final com.airbnb.lottie.model.animatable.AnimatableFloatValue getOutputSizes;
    final com.airbnb.lottie.model.animatable.AnimatableTextProperties getOutputSizeshNQ4ISI;
    final com.airbnb.lottie.model.animatable.AnimatableTextFrame getOutputStallDuration;
    final int getOutputStallDurationlomOqCM;
    final float getValidOutputFormatsForInputhNQ4ISI;
    final com.airbnb.lottie.model.animatable.AnimatableTransform isOutputSupportedFor;
    private final com.airbnb.lottie.parser.DropShadowEffect isOutputSupportedForhNQ4ISI;
    private final com.airbnb.lottie.model.content.BlurEffect toString;
    private final com.airbnb.lottie.model.content.LBlendMode unwrapAs;

    public enum LayerType {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum MatteType {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public Layer(java.util.List<com.airbnb.lottie.model.content.ContentModel> list, com.airbnb.lottie.LottieComposition lottieComposition, java.lang.String str, long j, com.airbnb.lottie.model.layer.Layer.LayerType layerType, long j2, java.lang.String str2, java.util.List<com.airbnb.lottie.model.content.Mask> list2, com.airbnb.lottie.model.animatable.AnimatableTransform animatableTransform, int i, int i2, int i3, float f, float f2, float f3, float f4, com.airbnb.lottie.model.animatable.AnimatableTextFrame animatableTextFrame, com.airbnb.lottie.model.animatable.AnimatableTextProperties animatableTextProperties, java.util.List<com.airbnb.lottie.value.Keyframe<java.lang.Float>> list3, com.airbnb.lottie.model.layer.Layer.MatteType matteType, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, boolean z, com.airbnb.lottie.model.content.BlurEffect blurEffect, com.airbnb.lottie.parser.DropShadowEffect dropShadowEffect, com.airbnb.lottie.model.content.LBlendMode lBlendMode) {
        this.getOutputFormats = list;
        this.Camera2StreamConfigurationMap = lottieComposition;
        this.ArtificialStackFrames = str;
        this.coroutineCreation = j;
        this.coroutineBoundary = layerType;
        this.getHighSpeedVideoSizes = j2;
        this.accessartificialFrame = str2;
        this.getHighSpeedVideoFpsRanges = list2;
        this.isOutputSupportedFor = animatableTransform;
        this.getOutputStallDurationlomOqCM = i;
        this.getInputFormats = i2;
        this.getInputSizeshNQ4ISI = i3;
        this.getValidOutputFormatsForInputhNQ4ISI = f;
        this.getOutputMinFrameDurationlomOqCM = f2;
        this.getOutputMinFrameDuration = f3;
        this.getHighSpeedVideoSizesFor = f4;
        this.getOutputStallDuration = animatableTextFrame;
        this.getOutputSizeshNQ4ISI = animatableTextProperties;
        this.getHighResolutionOutputSizeshNQ4ISI = list3;
        this.getHighSpeedVideoFpsRangesFor = matteType;
        this.getOutputSizes = animatableFloatValue;
        this.CoroutineDebuggingKt = z;
        this.toString = blurEffect;
        this.isOutputSupportedForhNQ4ISI = dropShadowEffect;
        this.unwrapAs = lBlendMode;
    }

    public long getId() {
        return this.coroutineCreation;
    }

    public java.lang.String getName() {
        return this.ArtificialStackFrames;
    }

    public java.lang.String getRefId() {
        return this.accessartificialFrame;
    }

    public com.airbnb.lottie.model.layer.Layer.LayerType getLayerType() {
        return this.coroutineBoundary;
    }

    public java.lang.String toString() {
        return toString("");
    }

    public boolean isHidden() {
        return this.CoroutineDebuggingKt;
    }

    public com.airbnb.lottie.model.content.LBlendMode getBlendMode() {
        return this.unwrapAs;
    }

    public com.airbnb.lottie.model.content.BlurEffect getBlurEffect() {
        return this.toString;
    }

    public com.airbnb.lottie.parser.DropShadowEffect getDropShadowEffect() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public java.lang.String toString(java.lang.String str) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(str);
        sb.append(getName());
        sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        com.airbnb.lottie.model.layer.Layer layerModelForId = this.Camera2StreamConfigurationMap.layerModelForId(this.getHighSpeedVideoSizes);
        if (layerModelForId != null) {
            sb.append("\t\tParents: ");
            sb.append(layerModelForId.getName());
            com.airbnb.lottie.model.layer.Layer layerModelForId2 = this.Camera2StreamConfigurationMap.layerModelForId(layerModelForId.getHighSpeedVideoSizes);
            while (layerModelForId2 != null) {
                sb.append("->");
                sb.append(layerModelForId2.getName());
                layerModelForId2 = this.Camera2StreamConfigurationMap.layerModelForId(layerModelForId2.getHighSpeedVideoSizes);
            }
            sb.append(str);
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (!this.getHighSpeedVideoFpsRanges.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(this.getHighSpeedVideoFpsRanges.size());
            sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
        }
        if (this.getOutputStallDurationlomOqCM != 0 && this.getInputFormats != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(java.lang.String.format(java.util.Locale.US, "%dx%d %X\n", java.lang.Integer.valueOf(this.getOutputStallDurationlomOqCM), java.lang.Integer.valueOf(this.getInputFormats), java.lang.Integer.valueOf(this.getInputSizeshNQ4ISI)));
        }
        if (!this.getOutputFormats.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (com.airbnb.lottie.model.content.ContentModel contentModel : this.getOutputFormats) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(contentModel);
                sb.append(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE);
            }
        }
        return sb.toString();
    }
}
