package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public class CompositionLayer extends com.airbnb.lottie.model.layer.BaseLayer {
    private com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation getInputSizeshNQ4ISI;
    private java.lang.Boolean getOutputFormats;
    private boolean getOutputMinFrameDuration;
    private final android.graphics.RectF getOutputMinFrameDurationlomOqCM;
    private final java.util.List<com.airbnb.lottie.model.layer.BaseLayer> getOutputSizes;
    private final com.airbnb.lottie.utils.OffscreenLayer getOutputSizeshNQ4ISI;
    private java.lang.Boolean getOutputStallDuration;
    private final android.graphics.RectF getOutputStallDurationlomOqCM;
    private final com.airbnb.lottie.utils.OffscreenLayer.ComposeOp getValidOutputFormatsForInputhNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> isOutputSupportedFor;
    private float isOutputSupportedForhNQ4ISI;
    private final android.graphics.RectF unwrapAs;

    public CompositionLayer(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer, java.util.List<com.airbnb.lottie.model.layer.Layer> list, com.airbnb.lottie.LottieComposition lottieComposition) {
        super(lottieDrawable, layer);
        com.airbnb.lottie.model.layer.BaseLayer baseLayer;
        com.airbnb.lottie.model.layer.BaseLayer shapeLayer;
        this.getOutputSizes = new java.util.ArrayList();
        this.unwrapAs = new android.graphics.RectF();
        this.getOutputStallDurationlomOqCM = new android.graphics.RectF();
        this.getOutputMinFrameDurationlomOqCM = new android.graphics.RectF();
        this.getOutputSizeshNQ4ISI = new com.airbnb.lottie.utils.OffscreenLayer();
        this.getValidOutputFormatsForInputhNQ4ISI = new com.airbnb.lottie.utils.OffscreenLayer.ComposeOp();
        this.getOutputMinFrameDuration = true;
        com.airbnb.lottie.model.animatable.AnimatableFloatValue animatableFloatValue = layer.getOutputSizes;
        if (animatableFloatValue != null) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation createAnimation = animatableFloatValue.createAnimation();
            this.isOutputSupportedFor = createAnimation;
            addAnimation(createAnimation);
            this.isOutputSupportedFor.addUpdateListener(this);
        } else {
            this.isOutputSupportedFor = null;
        }
        androidx.collection.LongSparseArray longSparseArray = new androidx.collection.LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        com.airbnb.lottie.model.layer.BaseLayer baseLayer2 = null;
        while (true) {
            if (size >= 0) {
                com.airbnb.lottie.model.layer.Layer layer2 = list.get(size);
                switch (com.airbnb.lottie.model.layer.BaseLayer.AnonymousClass1.Camera2StreamConfigurationMap[layer2.getLayerType().ordinal()]) {
                    case 1:
                        shapeLayer = new com.airbnb.lottie.model.layer.ShapeLayer(lottieDrawable, layer2, this, lottieComposition);
                        break;
                    case 2:
                        shapeLayer = new com.airbnb.lottie.model.layer.CompositionLayer(lottieDrawable, layer2, lottieComposition.getPrecomps(layer2.getRefId()), lottieComposition);
                        break;
                    case 3:
                        shapeLayer = new com.airbnb.lottie.model.layer.SolidLayer(lottieDrawable, layer2);
                        break;
                    case 4:
                        shapeLayer = new com.airbnb.lottie.model.layer.ImageLayer(lottieDrawable, layer2);
                        break;
                    case 5:
                        shapeLayer = new com.airbnb.lottie.model.layer.NullLayer(lottieDrawable, layer2);
                        break;
                    case 6:
                        shapeLayer = new com.airbnb.lottie.model.layer.TextLayer(lottieDrawable, layer2);
                        break;
                    default:
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Unknown layer type ");
                        sb.append(layer2.getLayerType());
                        com.airbnb.lottie.utils.Logger.warning(sb.toString());
                        shapeLayer = null;
                        break;
                }
                if (shapeLayer != null) {
                    longSparseArray.put(shapeLayer.Camera2StreamConfigurationMap.getId(), shapeLayer);
                    if (baseLayer2 != null) {
                        baseLayer2.Camera2StreamConfigurationMap(shapeLayer);
                        baseLayer2 = null;
                    } else {
                        this.getOutputSizes.add(0, shapeLayer);
                        int i = com.airbnb.lottie.model.layer.CompositionLayer.AnonymousClass1.getHighSpeedVideoFpsRanges[layer2.getHighSpeedVideoFpsRangesFor.ordinal()];
                        if (i == 1 || i == 2) {
                            baseLayer2 = shapeLayer;
                        }
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    com.airbnb.lottie.model.layer.BaseLayer baseLayer3 = (com.airbnb.lottie.model.layer.BaseLayer) longSparseArray.get(longSparseArray.keyAt(i2));
                    if (baseLayer3 != null && (baseLayer = (com.airbnb.lottie.model.layer.BaseLayer) longSparseArray.get(baseLayer3.Camera2StreamConfigurationMap.getHighSpeedVideoSizes)) != null) {
                        baseLayer3.getHighSpeedVideoFpsRangesFor(baseLayer);
                    }
                }
                if (getDropShadowEffect() != null) {
                    this.getInputSizeshNQ4ISI = new com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation(this, this, getDropShadowEffect());
                    return;
                }
                return;
            }
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.CompositionLayer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] getHighSpeedVideoFpsRanges;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.layer.Layer.MatteType.values().length];
            getHighSpeedVideoFpsRanges = iArr;
            try {
                iArr[com.airbnb.lottie.model.layer.Layer.MatteType.ADD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRanges[com.airbnb.lottie.model.layer.Layer.MatteType.INVERT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    public void setClipToCompositionBounds(boolean z) {
        this.getOutputMinFrameDuration = z;
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setOutlineMasksAndMattes(boolean z) {
        super.setOutlineMasksAndMattes(z);
        java.util.Iterator<com.airbnb.lottie.model.layer.BaseLayer> it = this.getOutputSizes.iterator();
        while (it.hasNext()) {
            it.next().setOutlineMasksAndMattes(z);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    void drawLayer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        android.graphics.Canvas canvas2;
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("CompositionLayer#draw");
        }
        boolean z = false;
        boolean z2 = (dropShadow == null && this.getInputSizeshNQ4ISI == null) ? false : true;
        if ((this.getHighSpeedVideoFpsRangesFor.isApplyingOpacityToLayersEnabled() && this.getOutputSizes.size() > 1 && i != 255) || (z2 && this.getHighSpeedVideoFpsRangesFor.isApplyingShadowToLayersEnabled())) {
            z = true;
        }
        int i2 = z ? 255 : i;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation = this.getInputSizeshNQ4ISI;
        if (dropShadowKeyframeAnimation != null) {
            dropShadow = dropShadowKeyframeAnimation.evaluate(matrix, i2);
        }
        if (this.getOutputMinFrameDuration || !"__container".equals(this.Camera2StreamConfigurationMap.getName())) {
            this.getOutputStallDurationlomOqCM.set(0.0f, 0.0f, this.Camera2StreamConfigurationMap.getOutputMinFrameDuration, this.Camera2StreamConfigurationMap.getHighSpeedVideoSizesFor);
            matrix.mapRect(this.getOutputStallDurationlomOqCM);
        } else {
            this.getOutputStallDurationlomOqCM.setEmpty();
            java.util.Iterator<com.airbnb.lottie.model.layer.BaseLayer> it = this.getOutputSizes.iterator();
            while (it.hasNext()) {
                it.next().getBounds(this.getOutputMinFrameDurationlomOqCM, matrix, true);
                this.getOutputStallDurationlomOqCM.union(this.getOutputMinFrameDurationlomOqCM);
            }
        }
        if (z) {
            this.getValidOutputFormatsForInputhNQ4ISI.reset();
            this.getValidOutputFormatsForInputhNQ4ISI.alpha = i;
            if (dropShadow != null) {
                dropShadow.applyTo(this.getValidOutputFormatsForInputhNQ4ISI);
                dropShadow = null;
            }
            canvas2 = this.getOutputSizeshNQ4ISI.start(canvas, this.getOutputStallDurationlomOqCM, this.getValidOutputFormatsForInputhNQ4ISI);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.getOutputStallDurationlomOqCM)) {
            for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
                this.getOutputSizes.get(size).draw(canvas2, matrix, i2, dropShadow);
            }
        }
        if (z) {
            this.getOutputSizeshNQ4ISI.finish();
        }
        canvas.restore();
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("CompositionLayer#draw");
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        super.getBounds(rectF, matrix, z);
        for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
            this.unwrapAs.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.getOutputSizes.get(size).getBounds(this.unwrapAs, this.boundsMatrix, true);
            rectF.union(this.unwrapAs);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    public void setProgress(float f) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("CompositionLayer#setProgress");
        }
        this.isOutputSupportedForhNQ4ISI = f;
        super.setProgress(f);
        if (this.isOutputSupportedFor != null) {
            f = ((this.isOutputSupportedFor.getValue().floatValue() * this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getFrameRate()) - this.Camera2StreamConfigurationMap.Camera2StreamConfigurationMap.getStartFrame()) / (this.getHighSpeedVideoFpsRangesFor.getComposition().getDurationFrames() + 0.01f);
        }
        if (this.isOutputSupportedFor == null) {
            com.airbnb.lottie.model.layer.Layer layer = this.Camera2StreamConfigurationMap;
            f -= layer.getOutputMinFrameDurationlomOqCM / layer.Camera2StreamConfigurationMap.getDurationFrames();
        }
        if (this.Camera2StreamConfigurationMap.getValidOutputFormatsForInputhNQ4ISI != 0.0f && !"__container".equals(this.Camera2StreamConfigurationMap.getName())) {
            f /= this.Camera2StreamConfigurationMap.getValidOutputFormatsForInputhNQ4ISI;
        }
        for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
            this.getOutputSizes.get(size).setProgress(f);
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("CompositionLayer#setProgress");
        }
    }

    public float getProgress() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public boolean hasMasks() {
        if (this.getOutputFormats == null) {
            for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
                com.airbnb.lottie.model.layer.BaseLayer baseLayer = this.getOutputSizes.get(size);
                if (baseLayer instanceof com.airbnb.lottie.model.layer.ShapeLayer) {
                    if (baseLayer.getHighSpeedVideoFpsRanges()) {
                        this.getOutputFormats = java.lang.Boolean.TRUE;
                        return true;
                    }
                } else if ((baseLayer instanceof com.airbnb.lottie.model.layer.CompositionLayer) && ((com.airbnb.lottie.model.layer.CompositionLayer) baseLayer).hasMasks()) {
                    this.getOutputFormats = java.lang.Boolean.TRUE;
                    return true;
                }
            }
            this.getOutputFormats = java.lang.Boolean.FALSE;
        }
        return this.getOutputFormats.booleanValue();
    }

    public boolean hasMatte() {
        if (this.getOutputStallDuration == null) {
            if (getHighResolutionOutputSizeshNQ4ISI()) {
                this.getOutputStallDuration = java.lang.Boolean.TRUE;
                return true;
            }
            for (int size = this.getOutputSizes.size() - 1; size >= 0; size--) {
                if (this.getOutputSizes.get(size).getHighResolutionOutputSizeshNQ4ISI()) {
                    this.getOutputStallDuration = java.lang.Boolean.TRUE;
                    return true;
                }
            }
            this.getOutputStallDuration = java.lang.Boolean.FALSE;
        }
        return this.getOutputStallDuration.booleanValue();
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer
    protected void resolveChildKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        for (int i2 = 0; i2 < this.getOutputSizes.size(); i2++) {
            this.getOutputSizes.get(i2).resolveKeyPath(keyPath, i, list, keyPath2);
        }
    }

    @Override // com.airbnb.lottie.model.layer.BaseLayer, com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation2;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation3;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation4;
        com.airbnb.lottie.animation.keyframe.DropShadowKeyframeAnimation dropShadowKeyframeAnimation5;
        super.addValueCallback(t, lottieValueCallback);
        if (t == com.airbnb.lottie.LottieProperty.TIME_REMAP) {
            if (lottieValueCallback == null) {
                com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Float, java.lang.Float> baseKeyframeAnimation = this.isOutputSupportedFor;
                if (baseKeyframeAnimation != null) {
                    baseKeyframeAnimation.setValueCallback(null);
                    return;
                }
                return;
            }
            com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation valueCallbackKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.ValueCallbackKeyframeAnimation(lottieValueCallback);
            this.isOutputSupportedFor = valueCallbackKeyframeAnimation;
            valueCallbackKeyframeAnimation.addUpdateListener(this);
            addAnimation(this.isOutputSupportedFor);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_COLOR && (dropShadowKeyframeAnimation5 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation5.setColorCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_OPACITY && (dropShadowKeyframeAnimation4 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation4.setOpacityCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_DIRECTION && (dropShadowKeyframeAnimation3 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation3.setDirectionCallback(lottieValueCallback);
            return;
        }
        if (t == com.airbnb.lottie.LottieProperty.DROP_SHADOW_DISTANCE && (dropShadowKeyframeAnimation2 = this.getInputSizeshNQ4ISI) != null) {
            dropShadowKeyframeAnimation2.setDistanceCallback(lottieValueCallback);
        } else {
            if (t != com.airbnb.lottie.LottieProperty.DROP_SHADOW_RADIUS || (dropShadowKeyframeAnimation = this.getInputSizeshNQ4ISI) == null) {
                return;
            }
            dropShadowKeyframeAnimation.setRadiusCallback(lottieValueCallback);
        }
    }
}
