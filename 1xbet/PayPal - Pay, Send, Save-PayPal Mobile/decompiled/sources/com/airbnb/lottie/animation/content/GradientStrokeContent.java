package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class GradientStrokeContent extends com.airbnb.lottie.animation.content.BaseStrokeContent {
    private final int getHighResolutionOutputSizeshNQ4ISI;
    private final android.graphics.RectF getHighSpeedVideoFpsRanges;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.GradientColor, com.airbnb.lottie.model.content.GradientColor> getHighSpeedVideoFpsRangesFor;
    private final boolean getHighSpeedVideoSizesFor;
    private com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation getInputFormats;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> getInputSizeshNQ4ISI;
    private final java.lang.String getOutputFormats;
    private final androidx.collection.LongSparseArray<android.graphics.LinearGradient> getOutputMinFrameDuration;
    private final com.airbnb.lottie.model.content.GradientType getOutputSizeshNQ4ISI;
    private final androidx.collection.LongSparseArray<android.graphics.RadialGradient> getOutputStallDuration;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> getOutputStallDurationlomOqCM;

    public GradientStrokeContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.GradientStroke gradientStroke) {
        super(lottieDrawable, baseLayer, gradientStroke.getCapType().toPaintCap(), gradientStroke.getJoinType().toPaintJoin(), gradientStroke.getMiterLimit(), gradientStroke.getOpacity(), gradientStroke.getWidth(), gradientStroke.getLineDashPattern(), gradientStroke.getDashOffset());
        this.getOutputMinFrameDuration = new androidx.collection.LongSparseArray<>();
        this.getOutputStallDuration = new androidx.collection.LongSparseArray<>();
        this.getHighSpeedVideoFpsRanges = new android.graphics.RectF();
        this.getOutputFormats = gradientStroke.getName();
        this.getOutputSizeshNQ4ISI = gradientStroke.getGradientType();
        this.getHighSpeedVideoSizesFor = gradientStroke.isHidden();
        this.getHighResolutionOutputSizeshNQ4ISI = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.GradientColor, com.airbnb.lottie.model.content.GradientColor> createAnimation = gradientStroke.getGradientColor().createAnimation();
        this.getHighSpeedVideoFpsRangesFor = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation2 = gradientStroke.getStartPoint().createAnimation();
        this.getOutputStallDurationlomOqCM = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation3 = gradientStroke.getEndPoint().createAnimation();
        this.getInputSizeshNQ4ISI = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        android.graphics.RadialGradient radialGradient;
        if (this.getHighSpeedVideoSizesFor) {
            return;
        }
        getBounds(this.getHighSpeedVideoFpsRanges, matrix, false);
        if (this.getOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.GradientType.LINEAR) {
            long highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
            radialGradient = this.getOutputMinFrameDuration.get(highResolutionOutputSizeshNQ4ISI);
            if (radialGradient == null) {
                android.graphics.PointF value = this.getOutputStallDurationlomOqCM.getValue();
                android.graphics.PointF value2 = this.getInputSizeshNQ4ISI.getValue();
                com.airbnb.lottie.model.content.GradientColor value3 = this.getHighSpeedVideoFpsRangesFor.getValue();
                radialGradient = new android.graphics.LinearGradient(value.x, value.y, value2.x, value2.y, getHighSpeedVideoSizes(value3.getColors()), value3.getPositions(), android.graphics.Shader.TileMode.CLAMP);
                this.getOutputMinFrameDuration.put(highResolutionOutputSizeshNQ4ISI, radialGradient);
            }
        } else {
            long highResolutionOutputSizeshNQ4ISI2 = getHighResolutionOutputSizeshNQ4ISI();
            radialGradient = this.getOutputStallDuration.get(highResolutionOutputSizeshNQ4ISI2);
            if (radialGradient == null) {
                android.graphics.PointF value4 = this.getOutputStallDurationlomOqCM.getValue();
                android.graphics.PointF value5 = this.getInputSizeshNQ4ISI.getValue();
                com.airbnb.lottie.model.content.GradientColor value6 = this.getHighSpeedVideoFpsRangesFor.getValue();
                int[] highSpeedVideoSizes = getHighSpeedVideoSizes(value6.getColors());
                float[] positions = value6.getPositions();
                radialGradient = new android.graphics.RadialGradient(value4.x, value4.y, (float) java.lang.Math.hypot(value5.x - r9, value5.y - r10), highSpeedVideoSizes, positions, android.graphics.Shader.TileMode.CLAMP);
                this.getOutputStallDuration.put(highResolutionOutputSizeshNQ4ISI2, radialGradient);
            }
        }
        this.Camera2StreamConfigurationMap.setShader(radialGradient);
        super.draw(canvas, matrix, i, dropShadow);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getOutputFormats;
    }

    private int getHighResolutionOutputSizeshNQ4ISI() {
        int round = java.lang.Math.round(this.getOutputStallDurationlomOqCM.getProgress() * this.getHighResolutionOutputSizeshNQ4ISI);
        int round2 = java.lang.Math.round(this.getInputSizeshNQ4ISI.getProgress() * this.getHighResolutionOutputSizeshNQ4ISI);
        int round3 = java.lang.Math.round(this.getHighSpeedVideoFpsRangesFor.getProgress() * this.getHighResolutionOutputSizeshNQ4ISI);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] getHighSpeedVideoSizes(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.getInputFormats;
        if (valueCallbackKeyframeAnimation != null) {
            java.lang.Integer[] numArr = (java.lang.Integer[]) valueCallbackKeyframeAnimation.getValue();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.BaseStrokeContent, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.GRADIENT_COLOR) {
            if (this.getInputFormats != null) {
                this.layer.removeAnimation(this.getInputFormats);
            }
            if (lottieValueCallback == null) {
                this.getInputFormats = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getInputFormats = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.getInputFormats);
        }
    }
}
