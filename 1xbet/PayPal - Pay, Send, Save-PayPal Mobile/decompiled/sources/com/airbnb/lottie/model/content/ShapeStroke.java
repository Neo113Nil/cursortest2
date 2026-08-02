package com.airbnb.lottie.model.content;

/* loaded from: classes7.dex */
public class ShapeStroke implements com.airbnb.lottie.model.content.ContentModel {
    private final com.airbnb.lottie.model.content.ShapeStroke.LineCapType Camera2StreamConfigurationMap;
    private final java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.model.content.ShapeStroke.LineJoinType getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.model.animatable.AnimatableColorValue getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizes;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.model.animatable.AnimatableFloatValue getInputFormats;
    private final com.airbnb.lottie.model.animatable.AnimatableIntegerValue getInputSizeshNQ4ISI;
    private final float getOutputFormats;
    private final java.lang.String getOutputMinFrameDuration;

    public enum LineCapType {
        BUTT,
        ROUND,
        UNKNOWN;

        public final android.graphics.Paint.Cap toPaintCap() {
            int i = com.airbnb.lottie.model.content.ShapeStroke.AnonymousClass1.getHighResolutionOutputSizeshNQ4ISI[ordinal()];
            if (i == 1) {
                return android.graphics.Paint.Cap.BUTT;
            }
            if (i == 2) {
                return android.graphics.Paint.Cap.ROUND;
            }
            return android.graphics.Paint.Cap.SQUARE;
        }
    }

    /* renamed from: com.airbnb.lottie.model.content.ShapeStroke$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighResolutionOutputSizeshNQ4ISI;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.BEVEL.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.MITER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.content.ShapeStroke.LineJoinType.ROUND.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[com.airbnb.lottie.model.content.ShapeStroke.LineCapType.values().length];
            getHighResolutionOutputSizeshNQ4ISI = iArr2;
            try {
                iArr2[com.airbnb.lottie.model.content.ShapeStroke.LineCapType.BUTT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.airbnb.lottie.model.content.ShapeStroke.LineCapType.ROUND.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                getHighResolutionOutputSizeshNQ4ISI[com.airbnb.lottie.model.content.ShapeStroke.LineCapType.UNKNOWN.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    public enum LineJoinType {
        MITER,
        ROUND,
        BEVEL;

        public final android.graphics.Paint.Join toPaintJoin() {
            int i = com.airbnb.lottie.model.content.ShapeStroke.AnonymousClass1.getHighSpeedVideoFpsRanges[ordinal()];
            if (i == 1) {
                return android.graphics.Paint.Join.BEVEL;
            }
            if (i == 2) {
                return android.graphics.Paint.Join.MITER;
            }
            if (i != 3) {
                return null;
            }
            return android.graphics.Paint.Join.ROUND;
        }
    }

    public ShapeStroke(java.lang.String str, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> list, com.airbnb.lottie.model.animatable.AnimatableColorValue animatableColorValue, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2, com.airbnb.lottie.model.content.ShapeStroke.LineCapType lineCapType, com.airbnb.lottie.model.content.ShapeStroke.LineJoinType lineJoinType, float f, boolean z) {
        this.getOutputMinFrameDuration = str;
        this.getHighSpeedVideoSizesFor = animatableFloatValue;
        this.getHighResolutionOutputSizeshNQ4ISI = list;
        this.getHighSpeedVideoFpsRangesFor = animatableColorValue;
        this.getInputSizeshNQ4ISI = animatableIntegerValue;
        this.getInputFormats = animatableFloatValue2;
        this.Camera2StreamConfigurationMap = lineCapType;
        this.getHighSpeedVideoFpsRanges = lineJoinType;
        this.getOutputFormats = f;
        this.getHighSpeedVideoSizes = z;
    }

    @Override // com.airbnb.lottie.model.content.ContentModel
    public com.airbnb.lottie.animation.content.Content toContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        return new com.airbnb.lottie.animation.content.StrokeContent(lottieDrawable, baseLayer, this);
    }

    public java.lang.String getName() {
        return this.getOutputMinFrameDuration;
    }

    public com.airbnb.lottie.model.animatable.AnimatableColorValue getColor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    public com.airbnb.lottie.model.animatable.AnimatableIntegerValue getOpacity() {
        return this.getInputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getWidth() {
        return this.getInputFormats;
    }

    public java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> getLineDashPattern() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public com.airbnb.lottie.model.animatable.AnimatableFloatValue getDashOffset() {
        return this.getHighSpeedVideoSizesFor;
    }

    public com.airbnb.lottie.model.content.ShapeStroke.LineCapType getCapType() {
        return this.Camera2StreamConfigurationMap;
    }

    public com.airbnb.lottie.model.content.ShapeStroke.LineJoinType getJoinType() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public float getMiterLimit() {
        return this.getOutputFormats;
    }

    public boolean isHidden() {
        return this.getHighSpeedVideoSizes;
    }
}
