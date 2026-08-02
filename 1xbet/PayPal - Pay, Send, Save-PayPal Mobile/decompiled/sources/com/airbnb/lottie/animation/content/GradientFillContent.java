package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class GradientFillContent implements com.airbnb.lottie.animation.content.DrawingContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent {
    private final android.graphics.RectF Camera2StreamConfigurationMap;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighResolutionOutputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.GradientColor, com.airbnb.lottie.model.content.GradientColor> getHighSpeedVideoFpsRanges;
    private final int getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    private com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation getHighSpeedVideoSizesFor;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> getInputFormats;
    private final com.airbnb.lottie.model.layer.BaseLayer getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> getOutputFormats;
    private final boolean getOutputMinFrameDuration;
    private final android.graphics.Paint getOutputMinFrameDurationlomOqCM;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getOutputSizes;
    private final com.airbnb.lottie.LottieDrawable getOutputStallDuration;
    private final java.lang.String getOutputStallDurationlomOqCM;
    private final com.airbnb.lottie.model.content.GradientType getValidOutputFormatsForInputhNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> isOutputSupportedForhNQ4ISI;
    private final java.util.List<com.airbnb.lottie.animation.content.PathContent> toString;
    private final android.graphics.Path unwrapAs;
    private final androidx.collection.LongSparseArray<android.graphics.LinearGradient> getOutputSizeshNQ4ISI = new androidx.collection.LongSparseArray<>();
    private final androidx.collection.LongSparseArray<android.graphics.RadialGradient> isOutputSupportedFor = new androidx.collection.LongSparseArray<>();

    public GradientFillContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.LottieComposition lottieComposition, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.GradientFill gradientFill) {
        android.graphics.Path path = new android.graphics.Path();
        this.unwrapAs = path;
        this.getOutputMinFrameDurationlomOqCM = new com.airbnb.lottie.animation.LPaint(1);
        this.Camera2StreamConfigurationMap = new android.graphics.RectF();
        this.toString = new java.util.ArrayList();
        this.getHighSpeedVideoSizes = 0.0f;
        this.getInputSizeshNQ4ISI = baseLayer;
        this.getOutputStallDurationlomOqCM = gradientFill.getName();
        this.getOutputMinFrameDuration = gradientFill.isHidden();
        this.getOutputStallDuration = lottieDrawable;
        this.getValidOutputFormatsForInputhNQ4ISI = gradientFill.getGradientType();
        path.setFillType(gradientFill.getFillType());
        this.getHighSpeedVideoFpsRangesFor = (int) (lottieComposition.getDuration() / 32.0f);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.GradientColor, com.airbnb.lottie.model.content.GradientColor> createAnimation = gradientFill.getGradientColor().createAnimation();
        this.getHighSpeedVideoFpsRanges = createAnimation;
        createAnimation.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation2 = gradientFill.getOpacity().createAnimation();
        this.getOutputSizes = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation3 = gradientFill.getStartPoint().createAnimation();
        this.isOutputSupportedForhNQ4ISI = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.PointF, android.graphics.PointF> createAnimation4 = gradientFill.getEndPoint().createAnimation();
        this.getOutputFormats = createAnimation4;
        createAnimation4.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation4);
        if (baseLayer.getBlurEffect() != null) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation5 = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.getHighResolutionOutputSizeshNQ4ISI = createAnimation5;
            createAnimation5.addUpdateListener(this);
            baseLayer.addAnimation(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getOutputStallDuration.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list2.get(i);
            if (content instanceof com.airbnb.lottie.animation.content.PathContent) {
                this.toString.add((com.airbnb.lottie.animation.content.PathContent) content);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        android.graphics.RadialGradient radialGradient;
        if (this.getOutputMinFrameDuration) {
            return;
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("GradientFillContent#draw");
        }
        this.unwrapAs.reset();
        for (int i2 = 0; i2 < this.toString.size(); i2++) {
            this.unwrapAs.addPath(this.toString.get(i2).getPath(), matrix);
        }
        this.unwrapAs.computeBounds(this.Camera2StreamConfigurationMap, false);
        if (this.getValidOutputFormatsForInputhNQ4ISI == com.airbnb.lottie.model.content.GradientType.LINEAR) {
            long highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
            radialGradient = this.getOutputSizeshNQ4ISI.get(highSpeedVideoFpsRanges);
            if (radialGradient == null) {
                android.graphics.PointF value = this.isOutputSupportedForhNQ4ISI.getValue();
                android.graphics.PointF value2 = this.getOutputFormats.getValue();
                com.airbnb.lottie.model.content.GradientColor value3 = this.getHighSpeedVideoFpsRanges.getValue();
                int[] highSpeedVideoSizes = getHighSpeedVideoSizes(value3.getColors());
                float[] positions = value3.getPositions();
                if (highSpeedVideoSizes.length < 2) {
                    int i3 = highSpeedVideoSizes[0];
                    highSpeedVideoSizes = new int[]{i3, i3};
                    positions = new float[]{0.0f, 1.0f};
                }
                android.graphics.LinearGradient linearGradient = new android.graphics.LinearGradient(value.x, value.y, value2.x, value2.y, highSpeedVideoSizes, positions, android.graphics.Shader.TileMode.CLAMP);
                this.getOutputSizeshNQ4ISI.put(highSpeedVideoFpsRanges, linearGradient);
                radialGradient = linearGradient;
            }
        } else {
            long highSpeedVideoFpsRanges2 = getHighSpeedVideoFpsRanges();
            radialGradient = this.isOutputSupportedFor.get(highSpeedVideoFpsRanges2);
            if (radialGradient == null) {
                android.graphics.PointF value4 = this.isOutputSupportedForhNQ4ISI.getValue();
                android.graphics.PointF value5 = this.getOutputFormats.getValue();
                com.airbnb.lottie.model.content.GradientColor value6 = this.getHighSpeedVideoFpsRanges.getValue();
                int[] highSpeedVideoSizes2 = getHighSpeedVideoSizes(value6.getColors());
                float[] positions2 = value6.getPositions();
                if (highSpeedVideoSizes2.length < 2) {
                    int i4 = highSpeedVideoSizes2[0];
                    highSpeedVideoSizes2 = new int[]{i4, i4};
                    positions2 = new float[]{0.0f, 1.0f};
                }
                float[] fArr = positions2;
                int[] iArr = highSpeedVideoSizes2;
                float f = value4.x;
                float f2 = value4.y;
                float hypot = (float) java.lang.Math.hypot(value5.x - f, value5.y - f2);
                if (hypot <= 0.0f) {
                    hypot = 0.001f;
                }
                radialGradient = new android.graphics.RadialGradient(f, f2, hypot, iArr, fArr, android.graphics.Shader.TileMode.CLAMP);
                this.isOutputSupportedFor.put(highSpeedVideoFpsRanges2, radialGradient);
            }
        }
        radialGradient.setLocalMatrix(matrix);
        this.getOutputMinFrameDurationlomOqCM.setShader(radialGradient);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getInputFormats;
        if (baseKeyframeAnimation != null) {
            this.getOutputMinFrameDurationlomOqCM.setColorFilter(baseKeyframeAnimation.getValue());
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (floatValue == 0.0f) {
                this.getOutputMinFrameDurationlomOqCM.setMaskFilter(null);
            } else if (floatValue != this.getHighSpeedVideoSizes) {
                this.getOutputMinFrameDurationlomOqCM.setMaskFilter(new android.graphics.BlurMaskFilter(floatValue, android.graphics.BlurMaskFilter.Blur.NORMAL));
            }
            this.getHighSpeedVideoSizes = floatValue;
        }
        float intValue = this.getOutputSizes.getValue().intValue() / 100.0f;
        this.getOutputMinFrameDurationlomOqCM.setAlpha(com.airbnb.lottie.utils.MiscUtils.clamp((int) (i * intValue), 0, 255));
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (intValue * 255.0f), this.getOutputMinFrameDurationlomOqCM);
        }
        canvas.drawPath(this.unwrapAs, this.getOutputMinFrameDurationlomOqCM);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("GradientFillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.unwrapAs.reset();
        for (int i = 0; i < this.toString.size(); i++) {
            this.unwrapAs.addPath(this.toString.get(i).getPath(), matrix);
        }
        this.unwrapAs.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getOutputStallDurationlomOqCM;
    }

    private int getHighSpeedVideoFpsRanges() {
        int round = java.lang.Math.round(this.isOutputSupportedForhNQ4ISI.getProgress() * this.getHighSpeedVideoFpsRangesFor);
        int round2 = java.lang.Math.round(this.getOutputFormats.getProgress() * this.getHighSpeedVideoFpsRangesFor);
        int round3 = java.lang.Math.round(this.getHighSpeedVideoFpsRanges.getProgress() * this.getHighSpeedVideoFpsRangesFor);
        int i = round != 0 ? round * 527 : 17;
        if (round2 != 0) {
            i = i * 31 * round2;
        }
        return round3 != 0 ? i * 31 * round3 : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private int[] getHighSpeedVideoSizes(int[] iArr) {
        com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = this.getHighSpeedVideoSizesFor;
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

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.OPACITY) {
            this.getOutputSizes.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.COLOR_FILTER) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getInputFormats;
            if (baseKeyframeAnimation != null) {
                this.getInputSizeshNQ4ISI.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.getInputFormats = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getInputFormats = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.getInputSizeshNQ4ISI.addAnimation(this.getInputFormats);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.GRADIENT_COLOR) {
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = this.getHighSpeedVideoSizesFor;
            if (valueCallbackKeyframeAnimation2 != null) {
                this.getInputSizeshNQ4ISI.removeAnimation(valueCallbackKeyframeAnimation2);
            }
            if (lottieValueCallback == null) {
                this.getHighSpeedVideoSizesFor = null;
                return;
            }
            this.getOutputSizeshNQ4ISI.clear();
            this.isOutputSupportedFor.clear();
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation3 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighSpeedVideoSizesFor = valueCallbackKeyframeAnimation3;
            valueCallbackKeyframeAnimation3.addUpdateListener(this);
            this.getInputSizeshNQ4ISI.addAnimation(this.getHighSpeedVideoSizesFor);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.BLUR_RADIUS) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2 = this.getHighResolutionOutputSizeshNQ4ISI;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation4 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighResolutionOutputSizeshNQ4ISI = valueCallbackKeyframeAnimation4;
            valueCallbackKeyframeAnimation4.addUpdateListener(this);
            this.getInputSizeshNQ4ISI.addAnimation(this.getHighResolutionOutputSizeshNQ4ISI);
        }
    }
}
