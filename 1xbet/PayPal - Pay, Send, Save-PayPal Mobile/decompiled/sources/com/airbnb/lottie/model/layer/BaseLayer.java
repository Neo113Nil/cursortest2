package com.airbnb.lottie.model.layer;

/* loaded from: classes7.dex */
public abstract class BaseLayer implements com.airbnb.lottie.animation.content.DrawingContent, com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener, com.airbnb.lottie.model.KeyPathElement {
    private com.airbnb.lottie.model.layer.BaseLayer ArtificialStackFrames;
    final com.airbnb.lottie.model.layer.Layer Camera2StreamConfigurationMap;
    private java.util.List<com.airbnb.lottie.model.layer.BaseLayer> CoroutineDebuggingKt;

    /* renamed from: a, reason: collision with root package name */
    private final android.graphics.RectF f2826a;
    private final android.graphics.Paint accessartificialFrame;
    protected final android.graphics.Matrix boundsMatrix;
    private boolean coroutineBoundary;
    private android.graphics.Paint coroutineCreation;
    private final android.graphics.RectF getARTIFICIAL_FRAME_PACKAGE_NAME;
    android.graphics.BlurMaskFilter getHighResolutionOutputSizeshNQ4ISI;
    float getHighSpeedVideoFpsRanges;
    final com.airbnb.lottie.LottieDrawable getHighSpeedVideoFpsRangesFor;
    com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation getHighSpeedVideoSizes;
    boolean getHighSpeedVideoSizesFor;
    com.airbnb.lottie.animation.LPaint getInputFormats;
    private final android.graphics.RectF getInputSizeshNQ4ISI;
    private final java.util.List<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?>> getOutputFormats;
    private final java.lang.String getOutputMinFrameDurationlomOqCM;
    private final android.graphics.Paint getOutputSizeshNQ4ISI;
    private com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation getValidOutputFormatsForInputhNQ4ISI;
    private com.airbnb.lottie.model.layer.BaseLayer isOutputSupportedFor;
    private final android.graphics.RectF toString;
    public final com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation transform;
    private final android.graphics.RectF unwrapAs;
    private final android.graphics.Path b = new android.graphics.Path();
    private final android.graphics.Matrix isOutputSupportedForhNQ4ISI = new android.graphics.Matrix();
    private final android.graphics.Matrix getOutputMinFrameDuration = new android.graphics.Matrix();
    private final android.graphics.Paint getOutputStallDurationlomOqCM = new com.airbnb.lottie.animation.LPaint(1);
    private final android.graphics.Paint getOutputSizes = new com.airbnb.lottie.animation.LPaint(1, android.graphics.PorterDuff.Mode.DST_IN);
    private final android.graphics.Paint getOutputStallDuration = new com.airbnb.lottie.animation.LPaint(1, android.graphics.PorterDuff.Mode.DST_OUT);

    abstract void drawLayer(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow);

    void resolveChildKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public void setContents(java.util.List<com.airbnb.lottie.animation.content.Content> list, java.util.List<com.airbnb.lottie.animation.content.Content> list2) {
    }

    BaseLayer(com.airbnb.lottie.LottieDrawable lottieDrawable, com.airbnb.lottie.model.layer.Layer layer) {
        com.airbnb.lottie.animation.LPaint lPaint = new com.airbnb.lottie.animation.LPaint(1);
        this.accessartificialFrame = lPaint;
        this.getOutputSizeshNQ4ISI = new com.airbnb.lottie.animation.LPaint(android.graphics.PorterDuff.Mode.CLEAR);
        this.f2826a = new android.graphics.RectF();
        this.getInputSizeshNQ4ISI = new android.graphics.RectF();
        this.toString = new android.graphics.RectF();
        this.unwrapAs = new android.graphics.RectF();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = new android.graphics.RectF();
        this.boundsMatrix = new android.graphics.Matrix();
        this.getOutputFormats = new java.util.ArrayList();
        this.getHighSpeedVideoSizesFor = true;
        this.getHighSpeedVideoFpsRanges = 0.0f;
        this.getHighSpeedVideoFpsRangesFor = lottieDrawable;
        this.Camera2StreamConfigurationMap = layer;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(layer.getName());
        sb.append("#draw");
        this.getOutputMinFrameDurationlomOqCM = sb.toString();
        if (layer.getHighSpeedVideoFpsRangesFor == com.airbnb.lottie.model.layer.Layer.MatteType.INVERT) {
            lPaint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_OUT));
        } else {
            lPaint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.DST_IN));
        }
        com.airbnb.lottie.animation.keyframe.TransformKeyframeAnimation createAnimation = layer.isOutputSupportedFor.createAnimation();
        this.transform = createAnimation;
        createAnimation.addListener(this);
        if (layer.getHighSpeedVideoFpsRanges != null && !layer.getHighSpeedVideoFpsRanges.isEmpty()) {
            com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation maskKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation(layer.getHighSpeedVideoFpsRanges);
            this.getValidOutputFormatsForInputhNQ4ISI = maskKeyframeAnimation;
            java.util.Iterator<com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path>> it = maskKeyframeAnimation.getMaskAnimations().iterator();
            while (it.hasNext()) {
                it.next().addUpdateListener(this);
            }
            for (com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation : this.getValidOutputFormatsForInputhNQ4ISI.getOpacityAnimations()) {
                addAnimation(baseKeyframeAnimation);
                baseKeyframeAnimation.addUpdateListener(this);
            }
        }
        if (!this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI.isEmpty()) {
            com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation floatKeyframeAnimation = new com.airbnb.lottie.animation.keyframe.FloatKeyframeAnimation(this.Camera2StreamConfigurationMap.getHighResolutionOutputSizeshNQ4ISI);
            this.getHighSpeedVideoSizes = floatKeyframeAnimation;
            floatKeyframeAnimation.setIsDiscrete();
            this.getHighSpeedVideoSizes.addUpdateListener(new com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener() { // from class: com.airbnb.lottie.model.layer.BaseLayer$$ExternalSyntheticLambda0
                @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
                public final void onValueChanged() {
                    com.airbnb.lottie.model.layer.BaseLayer baseLayer = com.airbnb.lottie.model.layer.BaseLayer.this;
                    boolean z = baseLayer.getHighSpeedVideoSizes.getFloatValue() == 1.0f;
                    if (z != baseLayer.getHighSpeedVideoSizesFor) {
                        baseLayer.getHighSpeedVideoSizesFor = z;
                        baseLayer.getHighSpeedVideoFpsRangesFor.invalidateSelf();
                    }
                }
            });
            boolean z = this.getHighSpeedVideoSizes.getValue().floatValue() == 1.0f;
            if (z != this.getHighSpeedVideoSizesFor) {
                this.getHighSpeedVideoSizesFor = z;
                this.getHighSpeedVideoFpsRangesFor.invalidateSelf();
            }
            addAnimation(this.getHighSpeedVideoSizes);
            return;
        }
        if (true != this.getHighSpeedVideoSizesFor) {
            this.getHighSpeedVideoSizesFor = true;
            this.getHighSpeedVideoFpsRangesFor.invalidateSelf();
        }
    }

    void setOutlineMasksAndMattes(boolean z) {
        if (z && this.coroutineCreation == null) {
            this.coroutineCreation = new com.airbnb.lottie.animation.LPaint();
        }
        this.coroutineBoundary = z;
    }

    final void Camera2StreamConfigurationMap(com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        this.isOutputSupportedFor = baseLayer;
    }

    final boolean getHighResolutionOutputSizeshNQ4ISI() {
        return this.isOutputSupportedFor != null;
    }

    final void getHighSpeedVideoFpsRangesFor(com.airbnb.lottie.model.layer.BaseLayer baseLayer) {
        this.ArtificialStackFrames = baseLayer;
    }

    public void addAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        if (baseKeyframeAnimation == null) {
            return;
        }
        this.getOutputFormats.add(baseKeyframeAnimation);
    }

    public void removeAnimation(com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, ?> baseKeyframeAnimation) {
        this.getOutputFormats.remove(baseKeyframeAnimation);
    }

    @Override // com.airbnb.lottie.animation.content.DrawingContent
    public void getBounds(android.graphics.RectF rectF, android.graphics.Matrix matrix, boolean z) {
        this.f2826a.set(0.0f, 0.0f, 0.0f, 0.0f);
        getHighSpeedVideoFpsRangesFor();
        this.boundsMatrix.set(matrix);
        if (z) {
            java.util.List<com.airbnb.lottie.model.layer.BaseLayer> list = this.CoroutineDebuggingKt;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.boundsMatrix.preConcat(this.CoroutineDebuggingKt.get(size).transform.getMatrix());
                }
            } else {
                com.airbnb.lottie.model.layer.BaseLayer baseLayer = this.ArtificialStackFrames;
                if (baseLayer != null) {
                    this.boundsMatrix.preConcat(baseLayer.transform.getMatrix());
                }
            }
        }
        this.boundsMatrix.preConcat(this.transform.getMatrix());
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x054b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0557  */
    @Override // com.airbnb.lottie.animation.content.DrawingContent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix, int i, com.airbnb.lottie.utils.DropShadow dropShadow) {
        float f;
        android.graphics.Paint paint;
        int i2;
        com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation maskKeyframeAnimation;
        int i3;
        android.graphics.Matrix matrix2;
        int i4;
        com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation maskKeyframeAnimation2;
        java.lang.Integer value;
        com.airbnb.lottie.L.beginSection(this.getOutputMinFrameDurationlomOqCM);
        if (!this.getHighSpeedVideoSizesFor || this.Camera2StreamConfigurationMap.isHidden()) {
            com.airbnb.lottie.L.endSection(this.getOutputMinFrameDurationlomOqCM);
            return;
        }
        getHighSpeedVideoFpsRangesFor();
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("Layer#parentMatrix");
        }
        this.isOutputSupportedForhNQ4ISI.reset();
        this.isOutputSupportedForhNQ4ISI.set(matrix);
        int i5 = 1;
        for (int size = this.CoroutineDebuggingKt.size() - 1; size >= 0; size--) {
            this.isOutputSupportedForhNQ4ISI.preConcat(this.CoroutineDebuggingKt.get(size).transform.getMatrix());
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("Layer#parentMatrix");
        }
        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<?, java.lang.Integer> opacity = this.transform.getOpacity();
        int intValue = (int) ((((i / 255.0f) * ((opacity == null || (value = opacity.getValue()) == null) ? 100 : value.intValue())) / 100.0f) * 255.0f);
        if (this.isOutputSupportedFor == null && (((maskKeyframeAnimation2 = this.getValidOutputFormatsForInputhNQ4ISI) == null || maskKeyframeAnimation2.getMaskAnimations().isEmpty()) && getBlendMode() == com.airbnb.lottie.model.content.LBlendMode.NORMAL)) {
            this.isOutputSupportedForhNQ4ISI.preConcat(this.transform.getMatrix());
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.beginSection("Layer#drawLayer");
            }
            drawLayer(canvas, this.isOutputSupportedForhNQ4ISI, intValue, dropShadow);
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("Layer#drawLayer");
            }
            this.getHighSpeedVideoFpsRangesFor.getComposition().getPerformanceTracker().recordRenderTime(this.Camera2StreamConfigurationMap.getName(), com.airbnb.lottie.L.endSection(this.getOutputMinFrameDurationlomOqCM));
            return;
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("Layer#computeBounds");
        }
        int i6 = 0;
        getBounds(this.f2826a, this.isOutputSupportedForhNQ4ISI, false);
        android.graphics.RectF rectF = this.f2826a;
        if (this.isOutputSupportedFor != null && this.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor != com.airbnb.lottie.model.layer.Layer.MatteType.INVERT) {
            this.unwrapAs.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.isOutputSupportedFor.getBounds(this.unwrapAs, matrix, true);
            if (!rectF.intersect(this.unwrapAs)) {
                rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            }
        }
        this.isOutputSupportedForhNQ4ISI.preConcat(this.transform.getMatrix());
        android.graphics.RectF rectF2 = this.f2826a;
        android.graphics.Matrix matrix3 = this.isOutputSupportedForhNQ4ISI;
        this.toString.set(0.0f, 0.0f, 0.0f, 0.0f);
        com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation maskKeyframeAnimation3 = this.getValidOutputFormatsForInputhNQ4ISI;
        if (maskKeyframeAnimation3 != null && !maskKeyframeAnimation3.getMaskAnimations().isEmpty()) {
            int size2 = this.getValidOutputFormatsForInputhNQ4ISI.getMasks().size();
            while (true) {
                if (i6 < size2) {
                    com.airbnb.lottie.model.content.Mask mask = this.getValidOutputFormatsForInputhNQ4ISI.getMasks().get(i6);
                    android.graphics.Path value2 = this.getValidOutputFormatsForInputhNQ4ISI.getMaskAnimations().get(i6).getValue();
                    if (value2 != null) {
                        this.b.set(value2);
                        this.b.transform(matrix3);
                        int i7 = com.airbnb.lottie.model.layer.BaseLayer.AnonymousClass1.getHighSpeedVideoFpsRangesFor[mask.getMaskMode().ordinal()];
                        if (i7 == i5 || i7 == 2 || ((i7 == 3 || i7 == 4) && mask.isInverted())) {
                            break;
                        }
                        this.b.computeBounds(this.getARTIFICIAL_FRAME_PACKAGE_NAME, false);
                        if (i6 == 0) {
                            this.toString.set(this.getARTIFICIAL_FRAME_PACKAGE_NAME);
                        } else {
                            android.graphics.RectF rectF3 = this.toString;
                            matrix2 = matrix3;
                            i4 = size2;
                            rectF3.set(java.lang.Math.min(rectF3.left, this.getARTIFICIAL_FRAME_PACKAGE_NAME.left), java.lang.Math.min(this.toString.top, this.getARTIFICIAL_FRAME_PACKAGE_NAME.top), java.lang.Math.max(this.toString.right, this.getARTIFICIAL_FRAME_PACKAGE_NAME.right), java.lang.Math.max(this.toString.bottom, this.getARTIFICIAL_FRAME_PACKAGE_NAME.bottom));
                            i6++;
                            matrix3 = matrix2;
                            size2 = i4;
                            i5 = 1;
                        }
                    }
                    matrix2 = matrix3;
                    i4 = size2;
                    i6++;
                    matrix3 = matrix2;
                    size2 = i4;
                    i5 = 1;
                } else if (!rectF2.intersect(this.toString)) {
                    f = 0.0f;
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        f = 0.0f;
        this.getInputSizeshNQ4ISI.set(f, f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.getOutputMinFrameDuration);
        if (!this.getOutputMinFrameDuration.isIdentity()) {
            android.graphics.Matrix matrix4 = this.getOutputMinFrameDuration;
            matrix4.invert(matrix4);
            this.getOutputMinFrameDuration.mapRect(this.getInputSizeshNQ4ISI);
        }
        if (!this.f2826a.intersect(this.getInputSizeshNQ4ISI)) {
            this.f2826a.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("Layer#computeBounds");
        }
        if (this.f2826a.width() >= 1.0f && this.f2826a.height() >= 1.0f) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.beginSection("Layer#saveLayer");
            }
            this.getOutputStallDurationlomOqCM.setAlpha(255);
            androidx.core.graphics.PaintCompat.setBlendMode(this.getOutputStallDurationlomOqCM, getBlendMode().toNativeBlendMode());
            com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputStallDurationlomOqCM);
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("Layer#saveLayer");
            }
            if (getBlendMode() != com.airbnb.lottie.model.content.LBlendMode.MULTIPLY) {
                getHighSpeedVideoFpsRanges(canvas);
            } else if (android.os.Build.VERSION.SDK_INT < 29) {
                if (this.getInputFormats == null) {
                    com.airbnb.lottie.animation.LPaint lPaint = new com.airbnb.lottie.animation.LPaint();
                    this.getInputFormats = lPaint;
                    lPaint.setColor(-1);
                }
                i2 = 2;
                canvas.drawRect(this.f2826a.left - 1.0f, this.f2826a.top - 1.0f, this.f2826a.right + 1.0f, this.f2826a.bottom + 1.0f, this.getInputFormats);
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.beginSection("Layer#drawLayer");
                }
                drawLayer(canvas, this.isOutputSupportedForhNQ4ISI, intValue, dropShadow);
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.endSection("Layer#drawLayer");
                }
                maskKeyframeAnimation = this.getValidOutputFormatsForInputhNQ4ISI;
                if (maskKeyframeAnimation != null && !maskKeyframeAnimation.getMaskAnimations().isEmpty()) {
                    android.graphics.Matrix matrix5 = this.isOutputSupportedForhNQ4ISI;
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.beginSection("Layer#saveLayer");
                    }
                    com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputSizes, 19);
                    if (android.os.Build.VERSION.SDK_INT < 28) {
                        getHighSpeedVideoFpsRanges(canvas);
                    }
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("Layer#saveLayer");
                    }
                    for (i3 = 0; i3 < this.getValidOutputFormatsForInputhNQ4ISI.getMasks().size(); i3++) {
                        com.airbnb.lottie.model.content.Mask mask2 = this.getValidOutputFormatsForInputhNQ4ISI.getMasks().get(i3);
                        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<com.airbnb.lottie.model.content.ShapeData, android.graphics.Path> baseKeyframeAnimation = this.getValidOutputFormatsForInputhNQ4ISI.getMaskAnimations().get(i3);
                        com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation<java.lang.Integer, java.lang.Integer> baseKeyframeAnimation2 = this.getValidOutputFormatsForInputhNQ4ISI.getOpacityAnimations().get(i3);
                        int i8 = com.airbnb.lottie.model.layer.BaseLayer.AnonymousClass1.getHighSpeedVideoFpsRangesFor[mask2.getMaskMode().ordinal()];
                        if (i8 != 1) {
                            if (i8 == i2) {
                                if (i3 == 0) {
                                    this.getOutputStallDurationlomOqCM.setColor(-16777216);
                                    this.getOutputStallDurationlomOqCM.setAlpha(255);
                                    canvas.drawRect(this.f2826a, this.getOutputStallDurationlomOqCM);
                                }
                                if (mask2.isInverted()) {
                                    com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputStallDuration);
                                    canvas.drawRect(this.f2826a, this.getOutputStallDurationlomOqCM);
                                    this.getOutputStallDuration.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                    this.b.set(baseKeyframeAnimation.getValue());
                                    this.b.transform(matrix5);
                                    canvas.drawPath(this.b, this.getOutputStallDuration);
                                    canvas.restore();
                                } else {
                                    this.b.set(baseKeyframeAnimation.getValue());
                                    this.b.transform(matrix5);
                                    canvas.drawPath(this.b, this.getOutputStallDuration);
                                }
                            } else if (i8 != 3) {
                                if (i8 == 4) {
                                    if (mask2.isInverted()) {
                                        com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputStallDurationlomOqCM);
                                        canvas.drawRect(this.f2826a, this.getOutputStallDurationlomOqCM);
                                        this.b.set(baseKeyframeAnimation.getValue());
                                        this.b.transform(matrix5);
                                        this.getOutputStallDurationlomOqCM.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                        canvas.drawPath(this.b, this.getOutputStallDuration);
                                        canvas.restore();
                                    } else {
                                        this.b.set(baseKeyframeAnimation.getValue());
                                        this.b.transform(matrix5);
                                        this.getOutputStallDurationlomOqCM.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                        canvas.drawPath(this.b, this.getOutputStallDurationlomOqCM);
                                    }
                                }
                            } else if (mask2.isInverted()) {
                                com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputSizes);
                                canvas.drawRect(this.f2826a, this.getOutputStallDurationlomOqCM);
                                this.getOutputStallDuration.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                this.b.set(baseKeyframeAnimation.getValue());
                                this.b.transform(matrix5);
                                canvas.drawPath(this.b, this.getOutputStallDuration);
                                canvas.restore();
                            } else {
                                com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputSizes);
                                this.b.set(baseKeyframeAnimation.getValue());
                                this.b.transform(matrix5);
                                this.getOutputStallDurationlomOqCM.setAlpha((int) (baseKeyframeAnimation2.getValue().intValue() * 2.55f));
                                canvas.drawPath(this.b, this.getOutputStallDurationlomOqCM);
                                canvas.restore();
                            }
                        } else if (!this.getValidOutputFormatsForInputhNQ4ISI.getMaskAnimations().isEmpty()) {
                            for (int i9 = 0; i9 < this.getValidOutputFormatsForInputhNQ4ISI.getMasks().size(); i9++) {
                                if (this.getValidOutputFormatsForInputhNQ4ISI.getMasks().get(i9).getMaskMode() == com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE) {
                                }
                            }
                            this.getOutputStallDurationlomOqCM.setAlpha(255);
                            canvas.drawRect(this.f2826a, this.getOutputStallDurationlomOqCM);
                        }
                    }
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.beginSection("Layer#restoreLayer");
                    }
                    canvas.restore();
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("Layer#restoreLayer");
                    }
                }
                if (this.isOutputSupportedFor != null) {
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.beginSection("Layer#drawMatte");
                        com.airbnb.lottie.L.beginSection("Layer#saveLayer");
                    }
                    com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.accessartificialFrame, 19);
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("Layer#saveLayer");
                    }
                    getHighSpeedVideoFpsRanges(canvas);
                    this.isOutputSupportedFor.draw(canvas, matrix, i, null);
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.beginSection("Layer#restoreLayer");
                    }
                    canvas.restore();
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("Layer#restoreLayer");
                        com.airbnb.lottie.L.endSection("Layer#drawMatte");
                    }
                }
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.beginSection("Layer#restoreLayer");
                }
                canvas.restore();
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                    com.airbnb.lottie.L.endSection("Layer#restoreLayer");
                }
            }
            i2 = 2;
            if (com.airbnb.lottie.L.isTraceEnabled()) {
            }
            drawLayer(canvas, this.isOutputSupportedForhNQ4ISI, intValue, dropShadow);
            if (com.airbnb.lottie.L.isTraceEnabled()) {
            }
            maskKeyframeAnimation = this.getValidOutputFormatsForInputhNQ4ISI;
            if (maskKeyframeAnimation != null) {
                android.graphics.Matrix matrix52 = this.isOutputSupportedForhNQ4ISI;
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                }
                com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, this.f2826a, this.getOutputSizes, 19);
                if (android.os.Build.VERSION.SDK_INT < 28) {
                }
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                }
                while (i3 < this.getValidOutputFormatsForInputhNQ4ISI.getMasks().size()) {
                }
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                }
                canvas.restore();
                if (com.airbnb.lottie.L.isTraceEnabled()) {
                }
            }
            if (this.isOutputSupportedFor != null) {
            }
            if (com.airbnb.lottie.L.isTraceEnabled()) {
            }
            canvas.restore();
            if (com.airbnb.lottie.L.isTraceEnabled()) {
            }
        }
        if (this.coroutineBoundary && (paint = this.coroutineCreation) != null) {
            paint.setStyle(android.graphics.Paint.Style.STROKE);
            this.coroutineCreation.setColor(-251901);
            this.coroutineCreation.setStrokeWidth(4.0f);
            canvas.drawRect(this.f2826a, this.coroutineCreation);
            this.coroutineCreation.setStyle(android.graphics.Paint.Style.FILL);
            this.coroutineCreation.setColor(1357638635);
            canvas.drawRect(this.f2826a, this.coroutineCreation);
        }
        this.getHighSpeedVideoFpsRangesFor.getComposition().getPerformanceTracker().recordRenderTime(this.Camera2StreamConfigurationMap.getName(), com.airbnb.lottie.L.endSection(this.getOutputMinFrameDurationlomOqCM));
    }

    private void getHighSpeedVideoFpsRanges(android.graphics.Canvas canvas) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("Layer#clearLayer");
        }
        canvas.drawRect(this.f2826a.left - 1.0f, this.f2826a.top - 1.0f, this.f2826a.right + 1.0f, this.f2826a.bottom + 1.0f, this.getOutputSizeshNQ4ISI);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("Layer#clearLayer");
        }
    }

    /* renamed from: com.airbnb.lottie.model.layer.BaseLayer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;
        static final /* synthetic */ int[] getHighSpeedVideoFpsRangesFor;

        static {
            int[] iArr = new int[com.airbnb.lottie.model.content.Mask.MaskMode.values().length];
            getHighSpeedVideoFpsRangesFor = iArr;
            try {
                iArr[com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_NONE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                getHighSpeedVideoFpsRangesFor[com.airbnb.lottie.model.content.Mask.MaskMode.MASK_MODE_ADD.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[com.airbnb.lottie.model.layer.Layer.LayerType.values().length];
            Camera2StreamConfigurationMap = iArr2;
            try {
                iArr2[com.airbnb.lottie.model.layer.Layer.LayerType.SHAPE.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.LayerType.PRE_COMP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.LayerType.SOLID.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.LayerType.IMAGE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.LayerType.NULL.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.LayerType.TEXT.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.model.layer.Layer.LayerType.UNKNOWN.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    final boolean getHighSpeedVideoFpsRanges() {
        com.airbnb.lottie.animation.keyframe.MaskKeyframeAnimation maskKeyframeAnimation = this.getValidOutputFormatsForInputhNQ4ISI;
        return (maskKeyframeAnimation == null || maskKeyframeAnimation.getMaskAnimations().isEmpty()) ? false : true;
    }

    void setProgress(float f) {
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("BaseLayer#setProgress");
            com.airbnb.lottie.L.beginSection("BaseLayer#setProgress.transform");
        }
        this.transform.setProgress(f);
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("BaseLayer#setProgress.transform");
        }
        if (this.getValidOutputFormatsForInputhNQ4ISI != null) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.beginSection("BaseLayer#setProgress.mask");
            }
            for (int i = 0; i < this.getValidOutputFormatsForInputhNQ4ISI.getMaskAnimations().size(); i++) {
                this.getValidOutputFormatsForInputhNQ4ISI.getMaskAnimations().get(i).setProgress(f);
            }
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("BaseLayer#setProgress.mask");
            }
        }
        if (this.getHighSpeedVideoSizes != null) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.beginSection("BaseLayer#setProgress.inout");
            }
            this.getHighSpeedVideoSizes.setProgress(f);
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("BaseLayer#setProgress.inout");
            }
        }
        if (this.isOutputSupportedFor != null) {
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.beginSection("BaseLayer#setProgress.matte");
            }
            this.isOutputSupportedFor.setProgress(f);
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("BaseLayer#setProgress.matte");
            }
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("BaseLayer#setProgress.animations.");
            sb.append(this.getOutputFormats.size());
            com.airbnb.lottie.L.beginSection(sb.toString());
        }
        for (int i2 = 0; i2 < this.getOutputFormats.size(); i2++) {
            this.getOutputFormats.get(i2).setProgress(f);
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("BaseLayer#setProgress.animations.");
            sb2.append(this.getOutputFormats.size());
            com.airbnb.lottie.L.endSection(sb2.toString());
            com.airbnb.lottie.L.endSection("BaseLayer#setProgress");
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        if (this.CoroutineDebuggingKt == null) {
            if (this.ArtificialStackFrames == null) {
                this.CoroutineDebuggingKt = java.util.Collections.emptyList();
                return;
            }
            this.CoroutineDebuggingKt = new java.util.ArrayList();
            for (com.airbnb.lottie.model.layer.BaseLayer baseLayer = this.ArtificialStackFrames; baseLayer != null; baseLayer = baseLayer.ArtificialStackFrames) {
                this.CoroutineDebuggingKt.add(baseLayer);
            }
        }
    }

    @Override // com.airbnb.lottie.animation.content.Content
    public java.lang.String getName() {
        return this.Camera2StreamConfigurationMap.getName();
    }

    public com.airbnb.lottie.model.content.BlurEffect getBlurEffect() {
        return this.Camera2StreamConfigurationMap.getBlurEffect();
    }

    public com.airbnb.lottie.model.content.LBlendMode getBlendMode() {
        return this.Camera2StreamConfigurationMap.getBlendMode();
    }

    public android.graphics.BlurMaskFilter getBlurMaskFilter(float f) {
        if (this.getHighSpeedVideoFpsRanges == f) {
            return this.getHighResolutionOutputSizeshNQ4ISI;
        }
        android.graphics.BlurMaskFilter blurMaskFilter = new android.graphics.BlurMaskFilter(f / 2.0f, android.graphics.BlurMaskFilter.Blur.NORMAL);
        this.getHighResolutionOutputSizeshNQ4ISI = blurMaskFilter;
        this.getHighSpeedVideoFpsRanges = f;
        return blurMaskFilter;
    }

    public com.airbnb.lottie.parser.DropShadowEffect getDropShadowEffect() {
        return this.Camera2StreamConfigurationMap.getDropShadowEffect();
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public void resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath, int i, java.util.List<com.airbnb.lottie.model.KeyPath> list, com.airbnb.lottie.model.KeyPath keyPath2) {
        com.airbnb.lottie.model.layer.BaseLayer baseLayer = this.isOutputSupportedFor;
        if (baseLayer != null) {
            com.airbnb.lottie.model.KeyPath addKey = keyPath2.addKey(baseLayer.getName());
            if (keyPath.fullyResolvesTo(this.isOutputSupportedFor.getName(), i)) {
                list.add(addKey.resolve(this.isOutputSupportedFor));
            }
            if (keyPath.matches(this.isOutputSupportedFor.getName(), i) && keyPath.propagateToChildren(getName(), i)) {
                this.isOutputSupportedFor.resolveChildKeyPath(keyPath, keyPath.incrementDepthBy(this.isOutputSupportedFor.getName(), i) + i, list, addKey);
            }
        }
        if (keyPath.matches(getName(), i)) {
            if (!"__container".equals(getName())) {
                keyPath2 = keyPath2.addKey(getName());
                if (keyPath.fullyResolvesTo(getName(), i)) {
                    list.add(keyPath2.resolve(this));
                }
            }
            if (keyPath.propagateToChildren(getName(), i)) {
                resolveChildKeyPath(keyPath, i + keyPath.incrementDepthBy(getName(), i), list, keyPath2);
            }
        }
    }

    @Override // com.airbnb.lottie.model.KeyPathElement
    public <T> void addValueCallback(T t, com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        this.transform.applyValueCallback(t, lottieValueCallback);
    }

    @Override // com.airbnb.lottie.animation.keyframe.BaseKeyframeAnimation.AnimationListener
    public void onValueChanged() {
        this.getHighSpeedVideoFpsRangesFor.invalidateSelf();
    }
}
