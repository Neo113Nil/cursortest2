package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public class FillContent implements com.airbnb.lottie.animation.content.DrawingContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent {
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> Camera2StreamConfigurationMap;
    private final boolean getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> getHighSpeedVideoFpsRangesFor;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighSpeedVideoSizes;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> getHighSpeedVideoSizesFor;
    private final java.lang.String getInputFormats;
    private final com.airbnb.lottie.model.layer.BaseLayer getInputSizeshNQ4ISI;
    private final android.graphics.Paint getOutputFormats;
    private final com.airbnb.lottie.LottieDrawable getOutputMinFrameDuration;
    private final java.util.List<com.airbnb.lottie.animation.content.PathContent> getOutputMinFrameDurationlomOqCM;
    private final android.graphics.Path getOutputSizeshNQ4ISI;

    public FillContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, com.airbnb.lottie.model.content.ShapeFill shapeFill) {
        android.graphics.Path path = new android.graphics.Path();
        this.getOutputSizeshNQ4ISI = path;
        this.getOutputFormats = new com.airbnb.lottie.animation.LPaint(1);
        this.getOutputMinFrameDurationlomOqCM = new java.util.ArrayList();
        this.getInputSizeshNQ4ISI = baseLayer;
        this.getInputFormats = shapeFill.getName();
        this.getHighResolutionOutputSizeshNQ4ISI = shapeFill.isHidden();
        this.getOutputMinFrameDuration = lottieDrawable;
        if (baseLayer.getBlurEffect() != null) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.getHighSpeedVideoSizes = createAnimation;
            createAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.getHighSpeedVideoSizes);
        }
        if (shapeFill.getColor() == null || shapeFill.getOpacity() == null) {
            this.Camera2StreamConfigurationMap = null;
            this.getHighSpeedVideoSizesFor = null;
            return;
        }
        path.setFillType(shapeFill.getFillType());
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation2 = shapeFill.getColor().createAnimation();
        this.Camera2StreamConfigurationMap = createAnimation2;
        createAnimation2.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation2);
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> createAnimation3 = shapeFill.getOpacity().createAnimation();
        this.getHighSpeedVideoSizesFor = createAnimation3;
        createAnimation3.addUpdateListener(this);
        baseLayer.addAnimation(createAnimation3);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getOutputMinFrameDuration.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        for (int i = 0; i < list2.size(); i++) {
            com.airbnb.lottie.animation.content.Content content = list2.get(i);
            if (content instanceof com.airbnb.lottie.animation.content.PathContent) {
                this.getOutputMinFrameDurationlomOqCM.add((com.airbnb.lottie.animation.content.PathContent) content);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.getInputFormats;
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        if (this.getHighResolutionOutputSizeshNQ4ISI) {
            return;
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("FillContent#draw");
        }
        float intValue = this.getHighSpeedVideoSizesFor.getValue().intValue() / 100.0f;
        this.getOutputFormats.setColor((com.airbnb.lottie.utils.MiscUtils.clamp((int) (i * intValue), 0, 255) << 24) | (((com.airbnb.lottie.animation.keyframe.ColorKeyframeAnimation) this.Camera2StreamConfigurationMap).getIntValue() & 16777215));
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getHighSpeedVideoFpsRangesFor;
        if (baseKeyframeAnimation != null) {
            this.getOutputFormats.setColorFilter(baseKeyframeAnimation.getValue());
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2 = this.getHighSpeedVideoSizes;
        if (baseKeyframeAnimation2 != null) {
            float floatValue = baseKeyframeAnimation2.getValue().floatValue();
            if (floatValue == 0.0f) {
                this.getOutputFormats.setMaskFilter(null);
            } else if (floatValue != this.getHighSpeedVideoFpsRanges) {
                this.getOutputFormats.setMaskFilter(this.getInputSizeshNQ4ISI.getBlurMaskFilter(floatValue));
            }
            this.getHighSpeedVideoFpsRanges = floatValue;
        }
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (intValue * 255.0f), this.getOutputFormats);
        } else {
            this.getOutputFormats.clearShadowLayer();
        }
        this.getOutputSizeshNQ4ISI.reset();
        for (int i2 = 0; i2 < this.getOutputMinFrameDurationlomOqCM.size(); i2++) {
            this.getOutputSizeshNQ4ISI.addPath(this.getOutputMinFrameDurationlomOqCM.get(i2).getPath(), matrix);
        }
        canvas.drawPath(this.getOutputSizeshNQ4ISI, this.getOutputFormats);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("FillContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.getOutputSizeshNQ4ISI.reset();
        for (int i = 0; i < this.getOutputMinFrameDurationlomOqCM.size(); i++) {
            this.getOutputSizeshNQ4ISI.addPath(this.getOutputMinFrameDurationlomOqCM.get(i).getPath(), matrix);
        }
        this.getOutputSizeshNQ4ISI.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.COLOR) {
            this.Camera2StreamConfigurationMap.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.OPACITY) {
            this.getHighSpeedVideoSizesFor.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.COLOR_FILTER) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getHighSpeedVideoFpsRangesFor;
            if (baseKeyframeAnimation != null) {
                this.getInputSizeshNQ4ISI.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.getHighSpeedVideoFpsRangesFor = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighSpeedVideoFpsRangesFor = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.getInputSizeshNQ4ISI.addAnimation(this.getHighSpeedVideoFpsRangesFor);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.BLUR_RADIUS) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2 = this.getHighSpeedVideoSizes;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighSpeedVideoSizes = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.getInputSizeshNQ4ISI.addAnimation(this.getHighSpeedVideoSizes);
        }
    }
}
