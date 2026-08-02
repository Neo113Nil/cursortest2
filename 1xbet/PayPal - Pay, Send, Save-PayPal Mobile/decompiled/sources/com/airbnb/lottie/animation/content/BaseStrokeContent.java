package com.airbnb.lottie.animation.content;

/* loaded from: classes7.dex */
public abstract class BaseStrokeContent implements com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.animation.content.KeyPathElementContent, com.airbnb.lottie.animation.content.DrawingContent {
    final android.graphics.Paint Camera2StreamConfigurationMap;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> getHighResolutionOutputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> getHighSpeedVideoFpsRanges;
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float>> getHighSpeedVideoFpsRangesFor;
    float getHighSpeedVideoSizes;
    private final float[] getHighSpeedVideoSizesFor;
    private final com.airbnb.lottie.LottieDrawable getInputFormats;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Integer> getInputSizeshNQ4ISI;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOutputMinFrameDuration;
    private final com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> getOutputSizes;
    protected final com.airbnb.lottie.model.layer.BaseLayer layer;
    private final android.graphics.PathMeasure getOutputStallDuration = new android.graphics.PathMeasure();
    private final android.graphics.Path getOutputFormats = new android.graphics.Path();
    private final android.graphics.Path getOutputSizeshNQ4ISI = new android.graphics.Path();
    private final android.graphics.RectF getOutputMinFrameDurationlomOqCM = new android.graphics.RectF();
    private final java.util.List<com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup> getOutputStallDurationlomOqCM = new java.util.ArrayList();

    BaseStrokeContent(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.BaseLayer baseLayer, android.graphics.Paint.Cap cap, android.graphics.Paint.Join join, float f, com.airbnb.lottie.model.animatable.AnimatableIntegerValue animatableIntegerValue, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue, java.util.List<com.airbnb.lottie.model.animatable.AnimatableFloatValue> list, com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue2) {
        com.airbnb.lottie.animation.LPaint lPaint = new com.airbnb.lottie.animation.LPaint(1);
        this.Camera2StreamConfigurationMap = lPaint;
        this.getHighSpeedVideoSizes = 0.0f;
        this.getInputFormats = lottieDrawable;
        this.layer = baseLayer;
        lPaint.setStyle(android.graphics.Paint.Style.STROKE);
        lPaint.setStrokeCap(cap);
        lPaint.setStrokeJoin(join);
        lPaint.setStrokeMiter(f);
        this.getInputSizeshNQ4ISI = animatableIntegerValue.createAnimation();
        this.getOutputSizes = animatableFloatValue.createAnimation();
        if (animatableFloatValue2 == null) {
            this.getOutputMinFrameDuration = null;
        } else {
            this.getOutputMinFrameDuration = animatableFloatValue2.createAnimation();
        }
        this.getHighSpeedVideoFpsRangesFor = new java.util.ArrayList(list.size());
        this.getHighSpeedVideoSizesFor = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.getHighSpeedVideoFpsRangesFor.add(list.get(i).createAnimation());
        }
        baseLayer.addAnimation(this.getInputSizeshNQ4ISI);
        baseLayer.addAnimation(this.getOutputSizes);
        for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor.size(); i2++) {
            baseLayer.addAnimation(this.getHighSpeedVideoFpsRangesFor.get(i2));
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation = this.getOutputMinFrameDuration;
        if (baseKeyframeAnimation != null) {
            baseLayer.addAnimation(baseKeyframeAnimation);
        }
        this.getInputSizeshNQ4ISI.addUpdateListener(this);
        this.getOutputSizes.addUpdateListener(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.getHighSpeedVideoFpsRangesFor.get(i3).addUpdateListener(this);
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation2 = this.getOutputMinFrameDuration;
        if (baseKeyframeAnimation2 != null) {
            baseKeyframeAnimation2.addUpdateListener(this);
        }
        if (baseLayer.getBlurEffect() != null) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation = baseLayer.getBlurEffect().getBlurriness().createAnimation();
            this.getHighSpeedVideoFpsRanges = createAnimation;
            createAnimation.addUpdateListener(this);
            baseLayer.addAnimation(this.getHighSpeedVideoFpsRanges);
        }
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getInputFormats.invalidateSelf();
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
        com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup pathGroup = null;
        com.airbnb.lottie.animation.content.TrimPathContent trimPathContent = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.animation.content.Content content = list.get(size);
            if (content instanceof com.airbnb.lottie.animation.content.TrimPathContent) {
                com.airbnb.lottie.animation.content.TrimPathContent trimPathContent2 = (com.airbnb.lottie.animation.content.TrimPathContent) content;
                if (trimPathContent2.getHighResolutionOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.ShapeTrimPath.Type.INDIVIDUALLY) {
                    trimPathContent = trimPathContent2;
                }
            }
        }
        if (trimPathContent != null) {
            trimPathContent.Camera2StreamConfigurationMap.add(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            com.airbnb.lottie.animation.content.Content content2 = list2.get(size2);
            byte b = 0;
            if (content2 instanceof com.airbnb.lottie.animation.content.TrimPathContent) {
                com.airbnb.lottie.animation.content.TrimPathContent trimPathContent3 = (com.airbnb.lottie.animation.content.TrimPathContent) content2;
                if (trimPathContent3.getHighResolutionOutputSizeshNQ4ISI == com.airbnb.lottie.model.content.ShapeTrimPath.Type.INDIVIDUALLY) {
                    if (pathGroup != null) {
                        this.getOutputStallDurationlomOqCM.add(pathGroup);
                    }
                    com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup pathGroup2 = new com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup(trimPathContent3, b);
                    trimPathContent3.Camera2StreamConfigurationMap.add(this);
                    pathGroup = pathGroup2;
                }
            }
            if (content2 instanceof com.airbnb.lottie.animation.content.PathContent) {
                if (pathGroup == null) {
                    pathGroup = new com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup(trimPathContent, b);
                }
                pathGroup.getHighResolutionOutputSizeshNQ4ISI.add((com.airbnb.lottie.animation.content.PathContent) content2);
            }
        }
        if (pathGroup != null) {
            this.getOutputStallDurationlomOqCM.add(pathGroup);
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        float f;
        float f2;
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("StrokeContent#draw");
        }
        if (com.airbnb.lottie.utils.Utils.hasZeroScaleAxis(matrix)) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        float f3 = 100.0f;
        float intValue = this.getInputSizeshNQ4ISI.getValue().intValue() / 100.0f;
        boolean z = false;
        this.Camera2StreamConfigurationMap.setAlpha(com.airbnb.lottie.utils.MiscUtils.clamp((int) (i * intValue), 0, 255));
        this.Camera2StreamConfigurationMap.setStrokeWidth(((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) this.getOutputSizes).getFloatValue());
        if (this.Camera2StreamConfigurationMap.getStrokeWidth() <= 0.0f) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("StrokeContent#draw");
                return;
            }
            return;
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("StrokeContent#applyDashPattern");
        }
        float f4 = 1.0f;
        if (this.getHighSpeedVideoFpsRangesFor.isEmpty()) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("StrokeContent#applyDashPattern");
            }
        } else {
            for (int i2 = 0; i2 < this.getHighSpeedVideoFpsRangesFor.size(); i2++) {
                this.getHighSpeedVideoSizesFor[i2] = this.getHighSpeedVideoFpsRangesFor.get(i2).getValue().floatValue();
                if (i2 % 2 == 0) {
                    float[] fArr = this.getHighSpeedVideoSizesFor;
                    if (fArr[i2] < 1.0f) {
                        fArr[i2] = 1.0f;
                    }
                } else {
                    float[] fArr2 = this.getHighSpeedVideoSizesFor;
                    if (fArr2[i2] < 0.1f) {
                        fArr2[i2] = 0.1f;
                    }
                }
            }
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Float> baseKeyframeAnimation = this.getOutputMinFrameDuration;
            this.Camera2StreamConfigurationMap.setPathEffect(new android.graphics.DashPathEffect(this.getHighSpeedVideoSizesFor, baseKeyframeAnimation == null ? 0.0f : baseKeyframeAnimation.getValue().floatValue()));
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("StrokeContent#applyDashPattern");
            }
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation2 = this.getHighResolutionOutputSizeshNQ4ISI;
        if (baseKeyframeAnimation2 != null) {
            this.Camera2StreamConfigurationMap.setColorFilter(baseKeyframeAnimation2.getValue());
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation3 = this.getHighSpeedVideoFpsRanges;
        if (baseKeyframeAnimation3 != null) {
            float floatValue = baseKeyframeAnimation3.getValue().floatValue();
            if (floatValue == 0.0f) {
                this.Camera2StreamConfigurationMap.setMaskFilter(null);
            } else if (floatValue != this.getHighSpeedVideoSizes) {
                this.Camera2StreamConfigurationMap.setMaskFilter(this.layer.getBlurMaskFilter(floatValue));
            }
            this.getHighSpeedVideoSizes = floatValue;
        }
        if (dropShadow != null) {
            dropShadow.applyWithAlpha((int) (intValue * 255.0f), this.Camera2StreamConfigurationMap);
        }
        canvas.save();
        canvas.concat(matrix);
        int i3 = 0;
        while (i3 < this.getOutputStallDurationlomOqCM.size()) {
            com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup pathGroup = this.getOutputStallDurationlomOqCM.get(i3);
            if (pathGroup.getHighSpeedVideoFpsRangesFor == null) {
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.beginSection("StrokeContent#buildPath");
                }
                this.getOutputFormats.reset();
                for (int size = pathGroup.getHighResolutionOutputSizeshNQ4ISI.size() - 1; size >= 0; size--) {
                    this.getOutputFormats.addPath(((com.airbnb.lottie.animation.content.PathContent) pathGroup.getHighResolutionOutputSizeshNQ4ISI.get(size)).getPath());
                }
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.endSection("StrokeContent#buildPath");
                    com.airbnb.lottie.L.beginSection("StrokeContent#drawPath");
                }
                canvas.drawPath(this.getOutputFormats, this.Camera2StreamConfigurationMap);
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.endSection("StrokeContent#drawPath");
                }
            } else {
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.beginSection("StrokeContent#applyTrimPath");
                }
                if (pathGroup.getHighSpeedVideoFpsRangesFor == null) {
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("StrokeContent#applyTrimPath");
                    }
                } else {
                    this.getOutputFormats.reset();
                    for (int size2 = pathGroup.getHighResolutionOutputSizeshNQ4ISI.size() - 1; size2 >= 0; size2--) {
                        this.getOutputFormats.addPath(((com.airbnb.lottie.animation.content.PathContent) pathGroup.getHighResolutionOutputSizeshNQ4ISI.get(size2)).getPath());
                    }
                    float floatValue2 = pathGroup.getHighSpeedVideoFpsRangesFor.getStart().getValue().floatValue() / f3;
                    float floatValue3 = pathGroup.getHighSpeedVideoFpsRangesFor.getEnd().getValue().floatValue() / f3;
                    float floatValue4 = pathGroup.getHighSpeedVideoFpsRangesFor.getOffset().getValue().floatValue() / 360.0f;
                    if (floatValue2 < 0.01f && floatValue3 > 0.99f) {
                        canvas.drawPath(this.getOutputFormats, this.Camera2StreamConfigurationMap);
                        if (com.airbnb.lottie.L.isTraceEnabled()) {
                            com.airbnb.lottie.L.endSection("StrokeContent#applyTrimPath");
                        }
                    } else {
                        this.getOutputStallDuration.setPath(this.getOutputFormats, z);
                        float length = this.getOutputStallDuration.getLength();
                        while (this.getOutputStallDuration.nextContour()) {
                            length += this.getOutputStallDuration.getLength();
                        }
                        float f5 = floatValue4 * length;
                        float f6 = (floatValue2 * length) + f5;
                        float min = java.lang.Math.min((floatValue3 * length) + f5, (f6 + length) - f4);
                        int size3 = pathGroup.getHighResolutionOutputSizeshNQ4ISI.size() - 1;
                        float f7 = 0.0f;
                        while (size3 >= 0) {
                            this.getOutputSizeshNQ4ISI.set(((com.airbnb.lottie.animation.content.PathContent) pathGroup.getHighResolutionOutputSizeshNQ4ISI.get(size3)).getPath());
                            this.getOutputStallDuration.setPath(this.getOutputSizeshNQ4ISI, z);
                            float length2 = this.getOutputStallDuration.getLength();
                            if (min > length) {
                                float f8 = min - length;
                                if (f8 < f7 + length2 && f7 < f8) {
                                    f = f6 > length ? (f6 - length) / length2 : 0.0f;
                                    f2 = java.lang.Math.min(f8 / length2, f4);
                                    com.airbnb.lottie.utils.Utils.applyTrimPathIfNeeded(this.getOutputSizeshNQ4ISI, f, f2, 0.0f);
                                    canvas.drawPath(this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                                    f7 += length2;
                                    size3--;
                                    z = false;
                                    f4 = 1.0f;
                                }
                            }
                            float f9 = f7 + length2;
                            if (f9 >= f6 && f7 <= min) {
                                if (f9 <= min && f6 < f7) {
                                    canvas.drawPath(this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                                } else {
                                    f = f6 < f7 ? 0.0f : (f6 - f7) / length2;
                                    f2 = min > f9 ? f4 : (min - f7) / length2;
                                    com.airbnb.lottie.utils.Utils.applyTrimPathIfNeeded(this.getOutputSizeshNQ4ISI, f, f2, 0.0f);
                                    canvas.drawPath(this.getOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap);
                                }
                            }
                            f7 += length2;
                            size3--;
                            z = false;
                            f4 = 1.0f;
                        }
                        if (com.airbnb.lottie.L.isTraceEnabled()) {
                            com.airbnb.lottie.L.endSection("StrokeContent#applyTrimPath");
                        }
                    }
                }
            }
            i3++;
            f3 = 100.0f;
            z = false;
            f4 = 1.0f;
        }
        canvas.restore();
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("StrokeContent#draw");
        }
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("StrokeContent#getBounds");
        }
        this.getOutputFormats.reset();
        for (int i = 0; i < this.getOutputStallDurationlomOqCM.size(); i++) {
            com.airbnb.lottie.animation.content.BaseStrokeContent.PathGroup pathGroup = this.getOutputStallDurationlomOqCM.get(i);
            for (int i2 = 0; i2 < pathGroup.getHighResolutionOutputSizeshNQ4ISI.size(); i2++) {
                this.getOutputFormats.addPath(((com.airbnb.lottie.animation.content.PathContent) pathGroup.getHighResolutionOutputSizeshNQ4ISI.get(i2)).getPath(), matrix);
            }
        }
        this.getOutputFormats.computeBounds(this.getOutputMinFrameDurationlomOqCM, false);
        float floatValue = ((com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation) this.getOutputSizes).getFloatValue();
        android.graphics.RectF rectF2 = this.getOutputMinFrameDurationlomOqCM;
        float f = floatValue / 2.0f;
        rectF2.set(rectF2.left - f, this.getOutputMinFrameDurationlomOqCM.top - f, this.getOutputMinFrameDurationlomOqCM.right + f, this.getOutputMinFrameDurationlomOqCM.bottom + f);
        rectF.set(this.getOutputMinFrameDurationlomOqCM);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("StrokeContent#getBounds");
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.utils.MiscUtils.resolveKeyPath(keyPath, i, list, keyPath2, this);
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (t == com.airbnb.lottie.LottieProperty.OPACITY) {
            this.getInputSizeshNQ4ISI.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.STROKE_WIDTH) {
            this.getOutputSizes.setValueCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.COLOR_FILTER) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<android.graphics.ColorFilter, android.graphics.ColorFilter> baseKeyframeAnimation = this.getHighResolutionOutputSizeshNQ4ISI;
            if (baseKeyframeAnimation != null) {
                this.layer.removeAnimation(baseKeyframeAnimation);
            }
            if (lottieValueCallback == null) {
                this.getHighResolutionOutputSizeshNQ4ISI = null;
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighResolutionOutputSizeshNQ4ISI = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            this.layer.addAnimation(this.getHighResolutionOutputSizeshNQ4ISI);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.BLUR_RADIUS) {
            com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation2 = this.getHighSpeedVideoFpsRanges;
            if (baseKeyframeAnimation2 != null) {
                baseKeyframeAnimation2.setValueCallback(lottieValueCallback);
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation2 = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.getHighSpeedVideoFpsRanges = valueCallbackKeyframeAnimation2;
            valueCallbackKeyframeAnimation2.addUpdateListener(this);
            this.layer.addAnimation(this.getHighSpeedVideoFpsRanges);
        }
    }

    static final class PathGroup {
        private final java.util.List<com.airbnb.lottie.animation.content.PathContent> getHighResolutionOutputSizeshNQ4ISI;
        private final com.airbnb.lottie.animation.content.TrimPathContent getHighSpeedVideoFpsRangesFor;

        /* synthetic */ PathGroup(com.airbnb.lottie.animation.content.TrimPathContent trimPathContent, byte b) {
            this(trimPathContent);
        }

        private PathGroup(com.airbnb.lottie.animation.content.TrimPathContent trimPathContent) {
            this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList();
            this.getHighSpeedVideoFpsRangesFor = trimPathContent;
        }
    }
}
