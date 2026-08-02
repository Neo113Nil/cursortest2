package com.airbnb.lottie.utils;

/* loaded from: classes7.dex */
public class OffscreenLayer {
    private static final android.graphics.Matrix getHighSpeedVideoFpsRanges = new android.graphics.Matrix();
    private com.airbnb.lottie.animation.LPaint ArtificialStackFrames;
    float[] Camera2StreamConfigurationMap;
    private android.graphics.BlurMaskFilter CoroutineDebuggingKt;
    private android.graphics.RectF _BOUNDARY;

    /* renamed from: a, reason: collision with root package name */
    private android.graphics.RenderNode f2828a;
    private android.graphics.Canvas accessartificialFrame;
    private android.graphics.RectF b;
    private android.graphics.Rect coroutineBoundary;
    private android.graphics.Bitmap coroutineCreation;
    android.graphics.Matrix getHighResolutionOutputSizeshNQ4ISI;
    private android.graphics.Canvas getHighSpeedVideoFpsRangesFor;
    private android.graphics.Bitmap getHighSpeedVideoSizes;
    private com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy getHighSpeedVideoSizesFor;
    private com.airbnb.lottie.animation.LPaint getInputFormats;
    private android.graphics.Paint getInputSizeshNQ4ISI;
    private android.graphics.Rect getOutputFormats;
    private android.graphics.Rect getOutputMinFrameDuration;
    private float getOutputMinFrameDurationlomOqCM = 0.0f;
    private com.airbnb.lottie.utils.OffscreenLayer.ComposeOp getOutputSizes;
    private android.graphics.RectF getOutputSizeshNQ4ISI;
    private com.airbnb.lottie.utils.DropShadow getOutputStallDuration;
    private android.graphics.Canvas getOutputStallDurationlomOqCM;
    private android.graphics.Bitmap getValidOutputFormatsForInputhNQ4ISI;
    private android.graphics.Canvas isOutputSupportedFor;
    private android.graphics.RenderNode isOutputSupportedForhNQ4ISI;
    private android.graphics.RectF toString;
    private android.graphics.RectF unwrapAs;

    protected enum RenderStrategy {
        DIRECT,
        SAVE_LAYER,
        BITMAP,
        RENDER_NODE
    }

    public static class ComposeOp {
        public int alpha;
        public androidx.core.graphics.BlendModeCompat blendMode;
        public android.graphics.ColorFilter colorFilter;
        public com.airbnb.lottie.utils.DropShadow shadow;

        public ComposeOp() {
            reset();
        }

        public boolean isTranslucent() {
            return this.alpha < 255;
        }

        public boolean hasBlendMode() {
            androidx.core.graphics.BlendModeCompat blendModeCompat = this.blendMode;
            return (blendModeCompat == null || blendModeCompat == androidx.core.graphics.BlendModeCompat.SRC_OVER) ? false : true;
        }

        public boolean hasShadow() {
            return this.shadow != null;
        }

        public boolean hasColorFilter() {
            return this.colorFilter != null;
        }

        public boolean isNoop() {
            return (isTranslucent() || hasBlendMode() || hasShadow() || hasColorFilter()) ? false : true;
        }

        public void reset() {
            this.alpha = 255;
            this.blendMode = null;
            this.colorFilter = null;
            this.shadow = null;
        }
    }

    private static android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI(android.graphics.RectF rectF, android.graphics.Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(java.lang.Math.max((int) java.lang.Math.ceil(rectF.width() * 1.05d), 1), java.lang.Math.max((int) java.lang.Math.ceil(rectF.height() * 1.05d), 1), config);
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.Bitmap bitmap, android.graphics.RectF rectF) {
        return bitmap == null || rectF.width() >= ((float) bitmap.getWidth()) || rectF.height() >= ((float) bitmap.getHeight()) || rectF.width() < ((float) bitmap.getWidth()) * 0.75f || rectF.height() < ((float) bitmap.getHeight()) * 0.75f;
    }

    public android.graphics.Canvas start(android.graphics.Canvas canvas, android.graphics.RectF rectF, com.airbnb.lottie.utils.OffscreenLayer.ComposeOp composeOp) {
        com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy renderStrategy;
        if (this.getOutputStallDurationlomOqCM != null) {
            throw new java.lang.IllegalStateException("Cannot nest start() calls on a single OffscreenBitmap - call finish() first");
        }
        if (this.Camera2StreamConfigurationMap == null) {
            this.Camera2StreamConfigurationMap = new float[9];
        }
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.getHighResolutionOutputSizeshNQ4ISI = new android.graphics.Matrix();
        }
        canvas.getMatrix(this.getHighResolutionOutputSizeshNQ4ISI);
        this.getHighResolutionOutputSizeshNQ4ISI.getValues(this.Camera2StreamConfigurationMap);
        float[] fArr = this.Camera2StreamConfigurationMap;
        float f = fArr[0];
        float f2 = fArr[4];
        if (this.unwrapAs == null) {
            this.unwrapAs = new android.graphics.RectF();
        }
        this.unwrapAs.set(rectF.left * f, rectF.top * f2, rectF.right * f, rectF.bottom * f2);
        this.getOutputStallDurationlomOqCM = canvas;
        this.getOutputSizes = composeOp;
        if (composeOp.isNoop()) {
            renderStrategy = com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.DIRECT;
        } else if (!composeOp.hasShadow()) {
            renderStrategy = com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.SAVE_LAYER;
        } else if (android.os.Build.VERSION.SDK_INT < 29 || !canvas.isHardwareAccelerated() || android.os.Build.VERSION.SDK_INT <= 31) {
            renderStrategy = com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.BITMAP;
        } else {
            renderStrategy = com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.RENDER_NODE;
        }
        this.getHighSpeedVideoSizesFor = renderStrategy;
        if (this.b == null) {
            this.b = new android.graphics.RectF();
        }
        this.b.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        if (this.getInputSizeshNQ4ISI == null) {
            this.getInputSizeshNQ4ISI = new com.airbnb.lottie.animation.LPaint();
        }
        this.getInputSizeshNQ4ISI.reset();
        int i = com.airbnb.lottie.utils.OffscreenLayer.AnonymousClass1.Camera2StreamConfigurationMap[this.getHighSpeedVideoSizesFor.ordinal()];
        if (i == 1) {
            canvas.save();
            return canvas;
        }
        if (i == 2) {
            this.getInputSizeshNQ4ISI.setAlpha(composeOp.alpha);
            this.getInputSizeshNQ4ISI.setColorFilter(composeOp.colorFilter);
            if (composeOp.hasBlendMode()) {
                androidx.core.graphics.PaintCompat.setBlendMode(this.getInputSizeshNQ4ISI, composeOp.blendMode);
            }
            com.airbnb.lottie.utils.Utils.saveLayerCompat(canvas, rectF, this.getInputSizeshNQ4ISI);
            return canvas;
        }
        if (i == 3) {
            if (this.getInputFormats == null) {
                com.airbnb.lottie.animation.LPaint lPaint = new com.airbnb.lottie.animation.LPaint();
                this.getInputFormats = lPaint;
                lPaint.setXfermode(new android.graphics.PorterDuffXfermode(android.graphics.PorterDuff.Mode.CLEAR));
            }
            if (getHighResolutionOutputSizeshNQ4ISI(this.getHighSpeedVideoSizes, this.unwrapAs)) {
                android.graphics.Bitmap bitmap = this.getHighSpeedVideoSizes;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                this.getHighSpeedVideoSizes = getHighResolutionOutputSizeshNQ4ISI(this.unwrapAs, android.graphics.Bitmap.Config.ARGB_8888);
                this.getHighSpeedVideoFpsRangesFor = new android.graphics.Canvas(this.getHighSpeedVideoSizes);
            } else {
                android.graphics.Canvas canvas2 = this.getHighSpeedVideoFpsRangesFor;
                if (canvas2 == null) {
                    throw new java.lang.IllegalStateException("If needNewBitmap() returns true, we should have a canvas ready");
                }
                canvas2.setMatrix(getHighSpeedVideoFpsRanges);
                this.getHighSpeedVideoFpsRangesFor.drawRect(-1.0f, -1.0f, this.unwrapAs.width() + 1.0f, this.unwrapAs.height() + 1.0f, this.getInputFormats);
            }
            androidx.core.graphics.PaintCompat.setBlendMode(this.getInputSizeshNQ4ISI, composeOp.blendMode);
            this.getInputSizeshNQ4ISI.setColorFilter(composeOp.colorFilter);
            this.getInputSizeshNQ4ISI.setAlpha(composeOp.alpha);
            android.graphics.Canvas canvas3 = this.getHighSpeedVideoFpsRangesFor;
            canvas3.scale(f, f2);
            canvas3.translate(-rectF.left, -rectF.top);
            return canvas3;
        }
        if (i == 4) {
            if (android.os.Build.VERSION.SDK_INT < 29) {
                throw new java.lang.IllegalStateException("RenderNode not supported but we chose it as render strategy");
            }
            if (this.isOutputSupportedForhNQ4ISI == null) {
                this.isOutputSupportedForhNQ4ISI = new android.graphics.RenderNode("OffscreenLayer.main");
            }
            if (composeOp.hasShadow() && this.f2828a == null) {
                this.f2828a = new android.graphics.RenderNode("OffscreenLayer.shadow");
                this.getOutputStallDuration = null;
            }
            if (composeOp.hasBlendMode() || composeOp.hasColorFilter()) {
                if (this.getInputSizeshNQ4ISI == null) {
                    this.getInputSizeshNQ4ISI = new com.airbnb.lottie.animation.LPaint();
                }
                this.getInputSizeshNQ4ISI.reset();
                androidx.core.graphics.PaintCompat.setBlendMode(this.getInputSizeshNQ4ISI, composeOp.blendMode);
                this.getInputSizeshNQ4ISI.setColorFilter(composeOp.colorFilter);
                this.isOutputSupportedForhNQ4ISI.setUseCompositingLayer(true, this.getInputSizeshNQ4ISI);
                if (composeOp.hasShadow()) {
                    android.graphics.RenderNode renderNode = this.f2828a;
                    if (renderNode == null) {
                        throw new java.lang.IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                    }
                    renderNode.setUseCompositingLayer(true, this.getInputSizeshNQ4ISI);
                }
            }
            this.isOutputSupportedForhNQ4ISI.setAlpha(composeOp.alpha / 255.0f);
            if (composeOp.hasShadow()) {
                android.graphics.RenderNode renderNode2 = this.f2828a;
                if (renderNode2 == null) {
                    throw new java.lang.IllegalStateException("Must initialize shadowRenderNode when we have shadow");
                }
                renderNode2.setAlpha(composeOp.alpha / 255.0f);
            }
            this.isOutputSupportedForhNQ4ISI.setHasOverlappingRendering(true);
            this.isOutputSupportedForhNQ4ISI.setPosition((int) this.unwrapAs.left, (int) this.unwrapAs.top, (int) this.unwrapAs.right, (int) this.unwrapAs.bottom);
            android.graphics.RecordingCanvas beginRecording = this.isOutputSupportedForhNQ4ISI.beginRecording((int) this.unwrapAs.width(), (int) this.unwrapAs.height());
            beginRecording.setMatrix(getHighSpeedVideoFpsRanges);
            beginRecording.scale(f, f2);
            beginRecording.translate(-rectF.left, -rectF.top);
            return beginRecording;
        }
        throw new java.lang.RuntimeException("Invalid render strategy for OffscreenLayer");
    }

    /* renamed from: com.airbnb.lottie.utils.OffscreenLayer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] Camera2StreamConfigurationMap;

        static {
            int[] iArr = new int[com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.values().length];
            Camera2StreamConfigurationMap = iArr;
            try {
                iArr[com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.DIRECT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.SAVE_LAYER.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.BITMAP.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                Camera2StreamConfigurationMap[com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.RENDER_NODE.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
        }
    }

    public void finish() {
        float f;
        com.airbnb.lottie.animation.LPaint lPaint;
        if (this.getOutputStallDurationlomOqCM == null || this.getOutputSizes == null || this.Camera2StreamConfigurationMap == null || this.b == null) {
            throw new java.lang.IllegalStateException("OffscreenBitmap: finish() call without matching start()");
        }
        int i = com.airbnb.lottie.utils.OffscreenLayer.AnonymousClass1.Camera2StreamConfigurationMap[this.getHighSpeedVideoSizesFor.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (this.isOutputSupportedForhNQ4ISI == null) {
                            throw new java.lang.IllegalStateException("RenderNode is not ready; should've been initialized at start() time");
                        }
                        if (android.os.Build.VERSION.SDK_INT < 29) {
                            throw new java.lang.IllegalStateException("RenderNode not supported but we chose it as render strategy");
                        }
                        this.getOutputStallDurationlomOqCM.save();
                        android.graphics.Canvas canvas = this.getOutputStallDurationlomOqCM;
                        float[] fArr = this.Camera2StreamConfigurationMap;
                        canvas.scale(1.0f / fArr[0], 1.0f / fArr[4]);
                        this.isOutputSupportedForhNQ4ISI.endRecording();
                        if (this.getOutputSizes.hasShadow()) {
                            android.graphics.Canvas canvas2 = this.getOutputStallDurationlomOqCM;
                            com.airbnb.lottie.utils.DropShadow dropShadow = this.getOutputSizes.shadow;
                            if (this.isOutputSupportedForhNQ4ISI == null || this.f2828a == null) {
                                throw new java.lang.IllegalStateException("Cannot render to render node outside a start()/finish() block");
                            }
                            if (android.os.Build.VERSION.SDK_INT < 31) {
                                throw new java.lang.RuntimeException("RenderEffect is not supported on API level <31");
                            }
                            float[] fArr2 = this.Camera2StreamConfigurationMap;
                            float f2 = fArr2 != null ? fArr2[0] : 1.0f;
                            f = fArr2 != null ? fArr2[4] : 1.0f;
                            com.airbnb.lottie.utils.DropShadow dropShadow2 = this.getOutputStallDuration;
                            if (dropShadow2 == null || !dropShadow.sameAs(dropShadow2)) {
                                android.graphics.RenderEffect createColorFilterEffect = android.graphics.RenderEffect.createColorFilterEffect(new android.graphics.PorterDuffColorFilter(dropShadow.getColor(), android.graphics.PorterDuff.Mode.SRC_IN));
                                if (dropShadow.getRadius() > 0.0f) {
                                    float radius = (dropShadow.getRadius() * (f2 + f)) / 2.0f;
                                    createColorFilterEffect = android.graphics.RenderEffect.createBlurEffect(radius, radius, createColorFilterEffect, android.graphics.Shader.TileMode.CLAMP);
                                }
                                this.f2828a.setRenderEffect(createColorFilterEffect);
                                this.getOutputStallDuration = dropShadow;
                            }
                            android.graphics.RectF Camera2StreamConfigurationMap = Camera2StreamConfigurationMap(this.b, dropShadow);
                            android.graphics.RectF rectF = new android.graphics.RectF(Camera2StreamConfigurationMap.left * f2, Camera2StreamConfigurationMap.top * f, Camera2StreamConfigurationMap.right * f2, Camera2StreamConfigurationMap.bottom * f);
                            this.f2828a.setPosition(0, 0, (int) rectF.width(), (int) rectF.height());
                            android.graphics.RecordingCanvas beginRecording = this.f2828a.beginRecording((int) rectF.width(), (int) rectF.height());
                            beginRecording.translate((-rectF.left) + (dropShadow.getDx() * f2), (-rectF.top) + (dropShadow.getDy() * f));
                            beginRecording.drawRenderNode(this.isOutputSupportedForhNQ4ISI);
                            this.f2828a.endRecording();
                            canvas2.save();
                            canvas2.translate(rectF.left, rectF.top);
                            canvas2.drawRenderNode(this.f2828a);
                            canvas2.restore();
                        }
                        this.getOutputStallDurationlomOqCM.drawRenderNode(this.isOutputSupportedForhNQ4ISI);
                    }
                } else {
                    if (this.getHighSpeedVideoSizes == null) {
                        throw new java.lang.IllegalStateException("Bitmap is not ready; should've been initialized at start() time");
                    }
                    if (this.getOutputSizes.hasShadow()) {
                        android.graphics.Canvas canvas3 = this.getOutputStallDurationlomOqCM;
                        com.airbnb.lottie.utils.DropShadow dropShadow3 = this.getOutputSizes.shadow;
                        android.graphics.RectF rectF2 = this.b;
                        if (rectF2 == null || this.getHighSpeedVideoSizes == null) {
                            throw new java.lang.IllegalStateException("Cannot render to bitmap outside a start()/finish() block");
                        }
                        android.graphics.RectF Camera2StreamConfigurationMap2 = Camera2StreamConfigurationMap(rectF2, dropShadow3);
                        if (this.getOutputFormats == null) {
                            this.getOutputFormats = new android.graphics.Rect();
                        }
                        this.getOutputFormats.set((int) java.lang.Math.floor(Camera2StreamConfigurationMap2.left), (int) java.lang.Math.floor(Camera2StreamConfigurationMap2.top), (int) java.lang.Math.ceil(Camera2StreamConfigurationMap2.right), (int) java.lang.Math.ceil(Camera2StreamConfigurationMap2.bottom));
                        float[] fArr3 = this.Camera2StreamConfigurationMap;
                        float f3 = fArr3 != null ? fArr3[0] : 1.0f;
                        f = fArr3 != null ? fArr3[4] : 1.0f;
                        if (this.toString == null) {
                            this.toString = new android.graphics.RectF();
                        }
                        this.toString.set(Camera2StreamConfigurationMap2.left * f3, Camera2StreamConfigurationMap2.top * f, Camera2StreamConfigurationMap2.right * f3, Camera2StreamConfigurationMap2.bottom * f);
                        if (this.coroutineBoundary == null) {
                            this.coroutineBoundary = new android.graphics.Rect();
                        }
                        this.coroutineBoundary.set(0, 0, java.lang.Math.round(this.toString.width()), java.lang.Math.round(this.toString.height()));
                        if (getHighResolutionOutputSizeshNQ4ISI(this.getValidOutputFormatsForInputhNQ4ISI, this.toString)) {
                            android.graphics.Bitmap bitmap = this.getValidOutputFormatsForInputhNQ4ISI;
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            android.graphics.Bitmap bitmap2 = this.coroutineCreation;
                            if (bitmap2 != null) {
                                bitmap2.recycle();
                            }
                            this.getValidOutputFormatsForInputhNQ4ISI = getHighResolutionOutputSizeshNQ4ISI(this.toString, android.graphics.Bitmap.Config.ARGB_8888);
                            this.coroutineCreation = getHighResolutionOutputSizeshNQ4ISI(this.toString, android.graphics.Bitmap.Config.ALPHA_8);
                            this.isOutputSupportedFor = new android.graphics.Canvas(this.getValidOutputFormatsForInputhNQ4ISI);
                            this.accessartificialFrame = new android.graphics.Canvas(this.coroutineCreation);
                        } else {
                            android.graphics.Canvas canvas4 = this.isOutputSupportedFor;
                            if (canvas4 == null || this.accessartificialFrame == null || (lPaint = this.getInputFormats) == null) {
                                throw new java.lang.IllegalStateException("If needNewBitmap() returns true, we should have a canvas and bitmap ready");
                            }
                            canvas4.drawRect(this.coroutineBoundary, lPaint);
                            this.accessartificialFrame.drawRect(this.coroutineBoundary, this.getInputFormats);
                        }
                        if (this.coroutineCreation == null) {
                            throw new java.lang.IllegalStateException("Expected to have allocated a shadow mask bitmap");
                        }
                        if (this.ArtificialStackFrames == null) {
                            this.ArtificialStackFrames = new com.airbnb.lottie.animation.LPaint(1);
                        }
                        this.accessartificialFrame.drawBitmap(this.getHighSpeedVideoSizes, java.lang.Math.round((this.b.left - Camera2StreamConfigurationMap2.left) * f3), java.lang.Math.round((this.b.top - Camera2StreamConfigurationMap2.top) * f), (android.graphics.Paint) null);
                        if (this.CoroutineDebuggingKt == null || this.getOutputMinFrameDurationlomOqCM != dropShadow3.getRadius()) {
                            float radius2 = (dropShadow3.getRadius() * (f3 + f)) / 2.0f;
                            if (radius2 > 0.0f) {
                                this.CoroutineDebuggingKt = new android.graphics.BlurMaskFilter(radius2, android.graphics.BlurMaskFilter.Blur.NORMAL);
                            } else {
                                this.CoroutineDebuggingKt = null;
                            }
                            this.getOutputMinFrameDurationlomOqCM = dropShadow3.getRadius();
                        }
                        this.ArtificialStackFrames.setColor(dropShadow3.getColor());
                        if (dropShadow3.getRadius() > 0.0f) {
                            this.ArtificialStackFrames.setMaskFilter(this.CoroutineDebuggingKt);
                        } else {
                            this.ArtificialStackFrames.setMaskFilter(null);
                        }
                        this.ArtificialStackFrames.setFilterBitmap(true);
                        this.isOutputSupportedFor.drawBitmap(this.coroutineCreation, java.lang.Math.round(dropShadow3.getDx() * f3), java.lang.Math.round(dropShadow3.getDy() * f), this.ArtificialStackFrames);
                        canvas3.drawBitmap(this.getValidOutputFormatsForInputhNQ4ISI, this.coroutineBoundary, this.getOutputFormats, this.getInputSizeshNQ4ISI);
                    }
                    if (this.getOutputMinFrameDuration == null) {
                        this.getOutputMinFrameDuration = new android.graphics.Rect();
                    }
                    this.getOutputMinFrameDuration.set(0, 0, (int) (this.b.width() * this.Camera2StreamConfigurationMap[0]), (int) (this.b.height() * this.Camera2StreamConfigurationMap[4]));
                    this.getOutputStallDurationlomOqCM.drawBitmap(this.getHighSpeedVideoSizes, this.getOutputMinFrameDuration, this.b, this.getInputSizeshNQ4ISI);
                }
            } else {
                this.getOutputStallDurationlomOqCM.restore();
            }
            this.getOutputStallDurationlomOqCM = null;
        }
        this.getOutputStallDurationlomOqCM.restore();
        this.getOutputStallDurationlomOqCM = null;
    }

    private android.graphics.RectF Camera2StreamConfigurationMap(android.graphics.RectF rectF, com.airbnb.lottie.utils.DropShadow dropShadow) {
        if (this.getOutputSizeshNQ4ISI == null) {
            this.getOutputSizeshNQ4ISI = new android.graphics.RectF();
        }
        if (this._BOUNDARY == null) {
            this._BOUNDARY = new android.graphics.RectF();
        }
        this.getOutputSizeshNQ4ISI.set(rectF);
        this.getOutputSizeshNQ4ISI.offsetTo(rectF.left + dropShadow.getDx(), rectF.top + dropShadow.getDy());
        this.getOutputSizeshNQ4ISI.inset(-dropShadow.getRadius(), -dropShadow.getRadius());
        this._BOUNDARY.set(rectF);
        this.getOutputSizeshNQ4ISI.union(this._BOUNDARY);
        return this.getOutputSizeshNQ4ISI;
    }

    public boolean finishDecrementsCanvasSaveCount() {
        return this.getHighSpeedVideoSizesFor == com.airbnb.lottie.utils.OffscreenLayer.RenderStrategy.RENDER_NODE;
    }
}
