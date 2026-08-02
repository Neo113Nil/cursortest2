package com.airbnb.lottie;

/* loaded from: classes.dex */
public class LottieDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Drawable.Callback, android.graphics.drawable.Animatable {
    static final boolean Camera2StreamConfigurationMap = false;
    public static final int INFINITE = -1;
    public static final int RESTART = 1;
    public static final int REVERSE = 2;
    private boolean AMEXKernel;
    private android.graphics.RectF AMEXKernelCallback;
    private android.graphics.Paint AMEXKernelJNI;
    private boolean AMEXKernela;
    private com.airbnb.lottie.manager.ImageAssetManager ArtificialStackFrames;
    private java.util.Map<java.lang.String, android.graphics.Typeface> CoroutineDebuggingKt;
    private boolean _BOUNDARY;
    private boolean _CREATION;

    /* renamed from: a, reason: collision with root package name */
    private java.lang.String f2825a;
    private com.airbnb.lottie.manager.FontAssetManager accessartificialFrame;
    private final java.util.ArrayList<com.airbnb.lottie.LottieDrawable.LazyCompositionTask> b;
    private boolean c;
    private boolean coroutineBoundary;
    private com.airbnb.lottie.ImageAssetDelegate coroutineCreation;
    private final com.airbnb.lottie.LottieFeatureFlags d;
    private com.airbnb.lottie.RenderMode exchange;
    private android.graphics.Rect free;
    private android.graphics.RectF freeTransaction;
    private float getARTIFICIAL_FRAME_PACKAGE_NAME;
    com.airbnb.lottie.model.layer.CompositionLayer getHighResolutionOutputSizeshNQ4ISI;
    java.lang.String getHighSpeedVideoFpsRanges;
    com.airbnb.lottie.FontAssetDelegate getHighSpeedVideoFpsRangesFor;
    final com.airbnb.lottie.utils.LottieValueAnimator getHighSpeedVideoSizes;
    com.airbnb.lottie.LottieDrawable.OnVisibleAction getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    android.os.Handler getInputSizeshNQ4ISI;
    java.lang.Runnable getOutputFormats;
    final java.util.concurrent.Semaphore getOutputMinFrameDuration;
    private com.airbnb.lottie.AsyncUpdates getOutputMinFrameDurationlomOqCM;
    private int getOutputSizes;
    com.airbnb.lottie.TextDelegate getOutputSizeshNQ4ISI;
    private com.airbnb.lottie.LottieComposition getValidOutputFormatsForInputhNQ4ISI;
    private boolean init;
    private boolean isOutputSupportedFor;
    private boolean isOutputSupportedForhNQ4ISI;
    private final android.animation.ValueAnimator.AnimatorUpdateListener kernelVersion;
    private android.graphics.Matrix l;
    private android.graphics.Canvas release;
    private android.graphics.Matrix requestGoOnline;
    private android.graphics.Rect requestPINEntry;
    private final android.graphics.Matrix resetTransaction;
    private final java.lang.Runnable rsaCipher;
    private boolean setup;
    private boolean sha1;
    private android.graphics.Bitmap startTransaction;
    private android.graphics.Rect toString;
    private android.graphics.RectF unwrapAs;
    private float[] updateUI;
    private static final java.util.List<java.lang.String> getOutputStallDurationlomOqCM = java.util.Arrays.asList("reduced motion", "reduced_motion", "reduced-motion", "reducedmotion");
    private static final java.util.concurrent.Executor getOutputStallDuration = new java.util.concurrent.ThreadPoolExecutor(0, 2, 35, java.util.concurrent.TimeUnit.MILLISECONDS, new java.util.concurrent.LinkedBlockingQueue(), new com.airbnb.lottie.utils.LottieThreadFactory());

    /* loaded from: classes7.dex */
    interface LazyCompositionTask {
        void run(com.airbnb.lottie.LottieComposition lottieComposition);
    }

    /* loaded from: classes7.dex */
    enum OnVisibleAction {
        NONE,
        PLAY,
        RESUME
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface RepeatMode {
    }

    @java.lang.Deprecated
    public void disableExtraScaleModeInFitXY() {
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public LottieDrawable() {
        com.airbnb.lottie.utils.LottieValueAnimator lottieValueAnimator = new com.airbnb.lottie.utils.LottieValueAnimator();
        this.getHighSpeedVideoSizes = lottieValueAnimator;
        this.sha1 = true;
        this.coroutineBoundary = false;
        this.AMEXKernela = false;
        this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
        this.b = new java.util.ArrayList<>();
        this.d = new com.airbnb.lottie.LottieFeatureFlags();
        this.init = false;
        this.isOutputSupportedForhNQ4ISI = true;
        this.getOutputSizes = 255;
        this.isOutputSupportedFor = false;
        this.exchange = com.airbnb.lottie.RenderMode.AUTOMATIC;
        this.setup = false;
        this.resetTransaction = new android.graphics.Matrix();
        this.updateUI = new float[9];
        this.getInputFormats = false;
        android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda13
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                com.airbnb.lottie.LottieDrawable lottieDrawable = com.airbnb.lottie.LottieDrawable.this;
                if (lottieDrawable.getAsyncUpdatesEnabled()) {
                    lottieDrawable.invalidateSelf();
                    return;
                }
                com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = lottieDrawable.getHighResolutionOutputSizeshNQ4ISI;
                if (compositionLayer != null) {
                    compositionLayer.setProgress(lottieDrawable.getHighSpeedVideoSizes.getAnimatedValueAbsolute());
                }
            }
        };
        this.kernelVersion = animatorUpdateListener;
        this.getOutputMinFrameDuration = new java.util.concurrent.Semaphore(1);
        this.rsaCipher = new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda14
            @Override // java.lang.Runnable
            public final void run() {
                final com.airbnb.lottie.LottieDrawable lottieDrawable = com.airbnb.lottie.LottieDrawable.this;
                com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = lottieDrawable.getHighResolutionOutputSizeshNQ4ISI;
                if (compositionLayer != null) {
                    try {
                        lottieDrawable.getOutputMinFrameDuration.acquire();
                        compositionLayer.setProgress(lottieDrawable.getHighSpeedVideoSizes.getAnimatedValueAbsolute());
                        if (com.airbnb.lottie.LottieDrawable.Camera2StreamConfigurationMap && lottieDrawable.getInputFormats) {
                            if (lottieDrawable.getInputSizeshNQ4ISI == null) {
                                lottieDrawable.getInputSizeshNQ4ISI = new android.os.Handler(android.os.Looper.getMainLooper());
                                lottieDrawable.getOutputFormats = new java.lang.Runnable() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda8
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        com.airbnb.lottie.LottieDrawable lottieDrawable2 = com.airbnb.lottie.LottieDrawable.this;
                                        android.graphics.drawable.Drawable.Callback callback = lottieDrawable2.getCallback();
                                        if (callback != null) {
                                            callback.invalidateDrawable(lottieDrawable2);
                                        }
                                    }
                                };
                            }
                            lottieDrawable.getInputSizeshNQ4ISI.post(lottieDrawable.getOutputFormats);
                        }
                    } catch (java.lang.InterruptedException unused) {
                    } catch (java.lang.Throwable th) {
                        lottieDrawable.getOutputMinFrameDuration.release();
                        throw th;
                    }
                    lottieDrawable.getOutputMinFrameDuration.release();
                }
            }
        };
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = -3.4028235E38f;
        lottieValueAnimator.addUpdateListener(animatorUpdateListener);
    }

    public boolean hasMasks() {
        com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
        return compositionLayer != null && compositionLayer.hasMasks();
    }

    public boolean hasMatte() {
        com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
        return compositionLayer != null && compositionLayer.hasMatte();
    }

    @java.lang.Deprecated
    public boolean enableMergePathsForKitKatAndAbove() {
        com.airbnb.lottie.LottieFeatureFlags lottieFeatureFlags = this.d;
        return lottieFeatureFlags.getHighSpeedVideoFpsRanges.contains(com.airbnb.lottie.LottieFeatureFlag.MergePathsApi19);
    }

    @java.lang.Deprecated
    public void enableMergePathsForKitKatAndAbove(boolean z) {
        boolean Camera2StreamConfigurationMap2 = this.d.Camera2StreamConfigurationMap(com.airbnb.lottie.LottieFeatureFlag.MergePathsApi19, z);
        if (this.getValidOutputFormatsForInputhNQ4ISI == null || !Camera2StreamConfigurationMap2) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    @java.lang.Deprecated
    public boolean isMergePathsEnabledForKitKatAndAbove() {
        com.airbnb.lottie.LottieFeatureFlags lottieFeatureFlags = this.d;
        return lottieFeatureFlags.getHighSpeedVideoFpsRanges.contains(com.airbnb.lottie.LottieFeatureFlag.MergePathsApi19);
    }

    public void enableFeatureFlag(com.airbnb.lottie.LottieFeatureFlag lottieFeatureFlag, boolean z) {
        boolean Camera2StreamConfigurationMap2 = this.d.Camera2StreamConfigurationMap(lottieFeatureFlag, z);
        if (this.getValidOutputFormatsForInputhNQ4ISI == null || !Camera2StreamConfigurationMap2) {
            return;
        }
        getHighSpeedVideoFpsRangesFor();
    }

    public boolean isFeatureFlagEnabled(com.airbnb.lottie.LottieFeatureFlag lottieFeatureFlag) {
        return this.d.getHighSpeedVideoFpsRanges.contains(lottieFeatureFlag);
    }

    public void setClipToCompositionBounds(boolean z) {
        if (z != this.isOutputSupportedForhNQ4ISI) {
            this.isOutputSupportedForhNQ4ISI = z;
            com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
            if (compositionLayer != null) {
                compositionLayer.setClipToCompositionBounds(z);
            }
            invalidateSelf();
        }
    }

    public boolean getClipToCompositionBounds() {
        return this.isOutputSupportedForhNQ4ISI;
    }

    public void setImagesAssetsFolder(java.lang.String str) {
        this.f2825a = str;
    }

    public java.lang.String getImageAssetsFolder() {
        return this.f2825a;
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.init = z;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.init;
    }

    public boolean setComposition(com.airbnb.lottie.LottieComposition lottieComposition) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == lottieComposition) {
            return false;
        }
        this.getInputFormats = true;
        clearComposition();
        this.getValidOutputFormatsForInputhNQ4ISI = lottieComposition;
        getHighSpeedVideoFpsRangesFor();
        this.getHighSpeedVideoSizes.setComposition(lottieComposition);
        setProgress(this.getHighSpeedVideoSizes.getAnimatedFraction());
        java.util.Iterator it = new java.util.ArrayList(this.b).iterator();
        while (it.hasNext()) {
            com.airbnb.lottie.LottieDrawable.LazyCompositionTask lazyCompositionTask = (com.airbnb.lottie.LottieDrawable.LazyCompositionTask) it.next();
            if (lazyCompositionTask != null) {
                lazyCompositionTask.run(lottieComposition);
            }
            it.remove();
        }
        this.b.clear();
        lottieComposition.setPerformanceTrackingEnabled(this.AMEXKernel);
        getHighSpeedVideoFpsRanges();
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback instanceof android.widget.ImageView) {
            android.widget.ImageView imageView = (android.widget.ImageView) callback;
            imageView.setImageDrawable(null);
            imageView.setImageDrawable(this);
        }
        return true;
    }

    public void setRenderMode(com.airbnb.lottie.RenderMode renderMode) {
        this.exchange = renderMode;
        getHighSpeedVideoFpsRanges();
    }

    public com.airbnb.lottie.AsyncUpdates getAsyncUpdates() {
        com.airbnb.lottie.AsyncUpdates asyncUpdates = this.getOutputMinFrameDurationlomOqCM;
        return asyncUpdates != null ? asyncUpdates : com.airbnb.lottie.L.getDefaultAsyncUpdates();
    }

    public boolean getAsyncUpdatesEnabled() {
        return getAsyncUpdates() == com.airbnb.lottie.AsyncUpdates.ENABLED;
    }

    public void setAsyncUpdates(com.airbnb.lottie.AsyncUpdates asyncUpdates) {
        this.getOutputMinFrameDurationlomOqCM = asyncUpdates;
    }

    public com.airbnb.lottie.RenderMode getRenderMode() {
        return this.setup ? com.airbnb.lottie.RenderMode.SOFTWARE : com.airbnb.lottie.RenderMode.HARDWARE;
    }

    private void getHighSpeedVideoFpsRanges() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            return;
        }
        this.setup = this.exchange.useSoftwareRendering(android.os.Build.VERSION.SDK_INT, lottieComposition.hasDashPattern(), lottieComposition.getMaskAndMatteCount());
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.AMEXKernel = z;
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition != null) {
            lottieComposition.setPerformanceTrackingEnabled(z);
        }
    }

    public void setOutlineMasksAndMattes(boolean z) {
        if (this.c != z) {
            this.c = z;
            com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
            if (compositionLayer != null) {
                compositionLayer.setOutlineMasksAndMattes(z);
            }
        }
    }

    public com.airbnb.lottie.PerformanceTracker getPerformanceTracker() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition != null) {
            return lottieComposition.getPerformanceTracker();
        }
        return null;
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this._BOUNDARY = z;
    }

    public void setApplyingShadowToLayersEnabled(boolean z) {
        this._CREATION = z;
    }

    public boolean isApplyingOpacityToLayersEnabled() {
        return this._BOUNDARY;
    }

    public boolean isApplyingShadowToLayersEnabled() {
        return this._CREATION;
    }

    public boolean getClipTextToBoundingBox() {
        return this.isOutputSupportedFor;
    }

    public void setClipTextToBoundingBox(boolean z) {
        if (z != this.isOutputSupportedFor) {
            this.isOutputSupportedFor = z;
            invalidateSelf();
        }
    }

    private void getHighSpeedVideoFpsRangesFor() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            return;
        }
        com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = new com.airbnb.lottie.model.layer.CompositionLayer(this, com.airbnb.lottie.parser.LayerParser.parse(lottieComposition), lottieComposition.getLayers(), lottieComposition);
        this.getHighResolutionOutputSizeshNQ4ISI = compositionLayer;
        if (this.c) {
            compositionLayer.setOutlineMasksAndMattes(true);
        }
        this.getHighResolutionOutputSizeshNQ4ISI.setClipToCompositionBounds(this.isOutputSupportedForhNQ4ISI);
    }

    public void clearComposition() {
        if (this.getHighSpeedVideoSizes.isRunning()) {
            this.getHighSpeedVideoSizes.cancel();
            if (!isVisible()) {
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
            }
        }
        this.getValidOutputFormatsForInputhNQ4ISI = null;
        this.getHighResolutionOutputSizeshNQ4ISI = null;
        this.ArtificialStackFrames = null;
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = -3.4028235E38f;
        this.getHighSpeedVideoSizes.clearComposition();
        invalidateSelf();
    }

    public void setSafeMode(boolean z) {
        this.AMEXKernela = z;
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        android.graphics.drawable.Drawable.Callback callback;
        if (this.getInputFormats) {
            return;
        }
        this.getInputFormats = true;
        if ((!Camera2StreamConfigurationMap || android.os.Looper.getMainLooper() == android.os.Looper.myLooper()) && (callback = getCallback()) != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.getOutputSizes = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.getOutputSizes;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        com.airbnb.lottie.utils.Logger.warning("Use addColorFilter instead.");
    }

    private boolean getInputFormats() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            return false;
        }
        float f = this.getARTIFICIAL_FRAME_PACKAGE_NAME;
        float animatedValueAbsolute = this.getHighSpeedVideoSizes.getAnimatedValueAbsolute();
        this.getARTIFICIAL_FRAME_PACKAGE_NAME = animatedValueAbsolute;
        return java.lang.Math.abs(animatedValueAbsolute - f) * lottieComposition.getDuration() >= 50.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
        if (compositionLayer != null) {
            boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
            if (asyncUpdatesEnabled) {
                try {
                    this.getOutputMinFrameDuration.acquire();
                } catch (java.lang.InterruptedException unused) {
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("Drawable#draw");
                    }
                    if (!asyncUpdatesEnabled) {
                        return;
                    }
                    this.getOutputMinFrameDuration.release();
                    if (compositionLayer.getProgress() == this.getHighSpeedVideoSizes.getAnimatedValueAbsolute()) {
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    if (com.airbnb.lottie.L.isTraceEnabled()) {
                        com.airbnb.lottie.L.endSection("Drawable#draw");
                    }
                    if (asyncUpdatesEnabled) {
                        this.getOutputMinFrameDuration.release();
                        if (compositionLayer.getProgress() != this.getHighSpeedVideoSizes.getAnimatedValueAbsolute()) {
                            getOutputStallDuration.execute(this.rsaCipher);
                        }
                    }
                    throw th;
                }
            }
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.beginSection("Drawable#draw");
            }
            if (asyncUpdatesEnabled && getInputFormats()) {
                setProgress(this.getHighSpeedVideoSizes.getAnimatedValueAbsolute());
            }
            if (this.AMEXKernela) {
                try {
                    if (this.setup) {
                        getHighResolutionOutputSizeshNQ4ISI(canvas, compositionLayer);
                    } else {
                        getHighResolutionOutputSizeshNQ4ISI(canvas);
                    }
                } catch (java.lang.Throwable th2) {
                    com.airbnb.lottie.utils.Logger.error("Lottie crashed in draw!", th2);
                }
            } else if (this.setup) {
                getHighResolutionOutputSizeshNQ4ISI(canvas, compositionLayer);
            } else {
                getHighResolutionOutputSizeshNQ4ISI(canvas);
            }
            this.getInputFormats = false;
            if (com.airbnb.lottie.L.isTraceEnabled()) {
                com.airbnb.lottie.L.endSection("Drawable#draw");
            }
            if (asyncUpdatesEnabled) {
                this.getOutputMinFrameDuration.release();
                if (compositionLayer.getProgress() == this.getHighSpeedVideoSizes.getAnimatedValueAbsolute()) {
                    return;
                }
                getOutputStallDuration.execute(this.rsaCipher);
            }
        }
    }

    public void draw(android.graphics.Canvas canvas, android.graphics.Matrix matrix) {
        com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        boolean asyncUpdatesEnabled = getAsyncUpdatesEnabled();
        if (asyncUpdatesEnabled) {
            try {
                this.getOutputMinFrameDuration.acquire();
                if (getInputFormats()) {
                    setProgress(this.getHighSpeedVideoSizes.getAnimatedValueAbsolute());
                }
            } catch (java.lang.InterruptedException unused) {
                if (!asyncUpdatesEnabled) {
                    return;
                }
                this.getOutputMinFrameDuration.release();
                if (compositionLayer.getProgress() == this.getHighSpeedVideoSizes.getAnimatedValueAbsolute()) {
                    return;
                }
            } catch (java.lang.Throwable th) {
                if (asyncUpdatesEnabled) {
                    this.getOutputMinFrameDuration.release();
                    if (compositionLayer.getProgress() != this.getHighSpeedVideoSizes.getAnimatedValueAbsolute()) {
                        getOutputStallDuration.execute(this.rsaCipher);
                    }
                }
                throw th;
            }
        }
        if (this.AMEXKernela) {
            try {
                getHighSpeedVideoSizes(canvas, matrix, compositionLayer, this.getOutputSizes);
            } catch (java.lang.Throwable th2) {
                com.airbnb.lottie.utils.Logger.error("Lottie crashed in draw!", th2);
            }
        } else {
            getHighSpeedVideoSizes(canvas, matrix, compositionLayer, this.getOutputSizes);
        }
        this.getInputFormats = false;
        if (asyncUpdatesEnabled) {
            this.getOutputMinFrameDuration.release();
            if (compositionLayer.getProgress() == this.getHighSpeedVideoSizes.getAnimatedValueAbsolute()) {
                return;
            }
            getOutputStallDuration.execute(this.rsaCipher);
        }
    }

    private void getHighSpeedVideoSizes(android.graphics.Canvas canvas, android.graphics.Matrix matrix, com.airbnb.lottie.model.layer.CompositionLayer compositionLayer, int i) {
        if (this.setup) {
            canvas.save();
            canvas.concat(matrix);
            getHighResolutionOutputSizeshNQ4ISI(canvas, compositionLayer);
            canvas.restore();
            return;
        }
        compositionLayer.draw(canvas, matrix, i, null);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if ((callback instanceof android.view.View) && ((android.view.View) callback).isInEditMode()) {
            return;
        }
        playAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        endAnimation();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return isAnimating();
    }

    public void playAnimation() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda15
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.playAnimation();
                }
            });
            return;
        }
        getHighSpeedVideoFpsRanges();
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        android.content.Context context = null;
        if (animationsEnabled((callback == null || !(callback instanceof android.view.View)) ? null : ((android.view.View) callback).getContext()) || getRepeatCount() == 0) {
            if (isVisible()) {
                this.getHighSpeedVideoSizes.playAnimation();
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
            } else {
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.PLAY;
            }
        }
        android.graphics.drawable.Drawable.Callback callback2 = getCallback();
        if (callback2 != null && (callback2 instanceof android.view.View)) {
            context = ((android.view.View) callback2).getContext();
        }
        if (animationsEnabled(context)) {
            return;
        }
        com.airbnb.lottie.model.Marker markerForAnimationsDisabled = getMarkerForAnimationsDisabled();
        if (markerForAnimationsDisabled != null) {
            setFrame((int) markerForAnimationsDisabled.startFrame);
        } else {
            setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        }
        this.getHighSpeedVideoSizes.endAnimation();
        if (isVisible()) {
            return;
        }
        this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
    }

    public com.airbnb.lottie.model.Marker getMarkerForAnimationsDisabled() {
        java.util.Iterator<java.lang.String> it = getOutputStallDurationlomOqCM.iterator();
        com.airbnb.lottie.model.Marker marker = null;
        while (it.hasNext()) {
            marker = this.getValidOutputFormatsForInputhNQ4ISI.getMarker(it.next());
            if (marker != null) {
                break;
            }
        }
        return marker;
    }

    public void endAnimation() {
        this.b.clear();
        this.getHighSpeedVideoSizes.endAnimation();
        if (isVisible()) {
            return;
        }
        this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
    }

    public void resumeAnimation() {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda9
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.resumeAnimation();
                }
            });
            return;
        }
        getHighSpeedVideoFpsRanges();
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        android.content.Context context = null;
        if (animationsEnabled((callback == null || !(callback instanceof android.view.View)) ? null : ((android.view.View) callback).getContext()) || getRepeatCount() == 0) {
            if (isVisible()) {
                this.getHighSpeedVideoSizes.resumeAnimation();
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
            } else {
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.RESUME;
            }
        }
        android.graphics.drawable.Drawable.Callback callback2 = getCallback();
        if (callback2 != null && (callback2 instanceof android.view.View)) {
            context = ((android.view.View) callback2).getContext();
        }
        if (animationsEnabled(context)) {
            return;
        }
        setFrame((int) (getSpeed() < 0.0f ? getMinFrame() : getMaxFrame()));
        this.getHighSpeedVideoSizes.endAnimation();
        if (isVisible()) {
            return;
        }
        this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
    }

    public void setMinFrame(final int i) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda5
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.setMinFrame(i);
                }
            });
        } else {
            this.getHighSpeedVideoSizes.setMinFrame(i);
        }
    }

    public float getMinFrame() {
        return this.getHighSpeedVideoSizes.getMinFrame();
    }

    public void setMinProgress(final float f) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda16
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMinProgress(f);
                }
            });
        } else {
            setMinFrame((int) com.airbnb.lottie.utils.MiscUtils.lerp(lottieComposition.getStartFrame(), this.getValidOutputFormatsForInputhNQ4ISI.getEndFrame(), f));
        }
    }

    public void setMaxFrame(final int i) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda4
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.setMaxFrame(i);
                }
            });
        } else {
            this.getHighSpeedVideoSizes.setMaxFrame(i + 0.99f);
        }
    }

    public float getMaxFrame() {
        return this.getHighSpeedVideoSizes.getMaxFrame();
    }

    public void setMaxProgress(final float f) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda7
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMaxProgress(f);
                }
            });
        } else {
            this.getHighSpeedVideoSizes.setMaxFrame(com.airbnb.lottie.utils.MiscUtils.lerp(lottieComposition.getStartFrame(), this.getValidOutputFormatsForInputhNQ4ISI.getEndFrame(), f));
        }
    }

    public void setMinFrame(final java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda12
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMinFrame(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.Marker marker = lottieComposition.getMarker(str);
        if (marker == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        setMinFrame((int) marker.startFrame);
    }

    public void setMaxFrame(final java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda11
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMaxFrame(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.Marker marker = lottieComposition.getMarker(str);
        if (marker == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        setMaxFrame((int) (marker.startFrame + marker.durationFrames));
    }

    public void setMinAndMaxFrame(final java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda0
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMinAndMaxFrame(str);
                }
            });
            return;
        }
        com.airbnb.lottie.model.Marker marker = lottieComposition.getMarker(str);
        if (marker == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = (int) marker.startFrame;
        setMinAndMaxFrame(i, ((int) marker.durationFrames) + i);
    }

    public void setMinAndMaxFrame(final java.lang.String str, final java.lang.String str2, final boolean z) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda10
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMinAndMaxFrame(str, str2, z);
                }
            });
            return;
        }
        com.airbnb.lottie.model.Marker marker = lottieComposition.getMarker(str);
        if (marker == null) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Cannot find marker with name ");
            sb.append(str);
            sb.append(".");
            throw new java.lang.IllegalArgumentException(sb.toString());
        }
        int i = (int) marker.startFrame;
        com.airbnb.lottie.model.Marker marker2 = this.getValidOutputFormatsForInputhNQ4ISI.getMarker(str2);
        if (marker2 == null) {
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Cannot find marker with name ");
            sb2.append(str2);
            sb2.append(".");
            throw new java.lang.IllegalArgumentException(sb2.toString());
        }
        setMinAndMaxFrame(i, (int) (marker2.startFrame + (z ? 1.0f : 0.0f)));
    }

    public void setMinAndMaxFrame(final int i, final int i2) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda3
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.setMinAndMaxFrame(i, i2);
                }
            });
        } else {
            this.getHighSpeedVideoSizes.setMinAndMaxFrames(i, i2 + 0.99f);
        }
    }

    public void setMinAndMaxProgress(final float f, final float f2) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda2
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition2) {
                    com.airbnb.lottie.LottieDrawable.this.setMinAndMaxProgress(f, f2);
                }
            });
        } else {
            setMinAndMaxFrame((int) com.airbnb.lottie.utils.MiscUtils.lerp(lottieComposition.getStartFrame(), this.getValidOutputFormatsForInputhNQ4ISI.getEndFrame(), f), (int) com.airbnb.lottie.utils.MiscUtils.lerp(this.getValidOutputFormatsForInputhNQ4ISI.getStartFrame(), this.getValidOutputFormatsForInputhNQ4ISI.getEndFrame(), f2));
        }
    }

    public void reverseAnimationSpeed() {
        this.getHighSpeedVideoSizes.reverseAnimationSpeed();
    }

    public void setSpeed(float f) {
        this.getHighSpeedVideoSizes.setSpeed(f);
    }

    public float getSpeed() {
        return this.getHighSpeedVideoSizes.getSpeed();
    }

    public void addAnimatorUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.getHighSpeedVideoSizes.addUpdateListener(animatorUpdateListener);
    }

    public void removeAnimatorUpdateListener(android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.getHighSpeedVideoSizes.removeUpdateListener(animatorUpdateListener);
    }

    public void removeAllUpdateListeners() {
        this.getHighSpeedVideoSizes.removeAllUpdateListeners();
        this.getHighSpeedVideoSizes.addUpdateListener(this.kernelVersion);
    }

    public void addAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.getHighSpeedVideoSizes.addListener(animatorListener);
    }

    public void removeAnimatorListener(android.animation.Animator.AnimatorListener animatorListener) {
        this.getHighSpeedVideoSizes.removeListener(animatorListener);
    }

    public void removeAllAnimatorListeners() {
        this.getHighSpeedVideoSizes.removeAllListeners();
    }

    public void addAnimatorPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.getHighSpeedVideoSizes.addPauseListener(animatorPauseListener);
    }

    public void removeAnimatorPauseListener(android.animation.Animator.AnimatorPauseListener animatorPauseListener) {
        this.getHighSpeedVideoSizes.removePauseListener(animatorPauseListener);
    }

    public void setFrame(final int i) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda1
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.setFrame(i);
                }
            });
        } else {
            this.getHighSpeedVideoSizes.setFrame(i);
        }
    }

    public int getFrame() {
        return (int) this.getHighSpeedVideoSizes.getFrame();
    }

    public void setProgress(final float f) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda17
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.setProgress(f);
                }
            });
            return;
        }
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.beginSection("Drawable#setProgress");
        }
        this.getHighSpeedVideoSizes.setFrame(this.getValidOutputFormatsForInputhNQ4ISI.getFrameForProgress(f));
        if (com.airbnb.lottie.L.isTraceEnabled()) {
            com.airbnb.lottie.L.endSection("Drawable#setProgress");
        }
    }

    @java.lang.Deprecated
    public void loop(boolean z) {
        this.getHighSpeedVideoSizes.setRepeatCount(z ? -1 : 0);
    }

    public void setRepeatMode(int i) {
        this.getHighSpeedVideoSizes.setRepeatMode(i);
    }

    public int getRepeatMode() {
        return this.getHighSpeedVideoSizes.getRepeatMode();
    }

    public void setRepeatCount(int i) {
        this.getHighSpeedVideoSizes.setRepeatCount(i);
    }

    public int getRepeatCount() {
        return this.getHighSpeedVideoSizes.getRepeatCount();
    }

    public boolean isLooping() {
        return this.getHighSpeedVideoSizes.getRepeatCount() == -1;
    }

    public boolean isAnimating() {
        com.airbnb.lottie.utils.LottieValueAnimator lottieValueAnimator = this.getHighSpeedVideoSizes;
        if (lottieValueAnimator == null) {
            return false;
        }
        return lottieValueAnimator.isRunning();
    }

    public boolean animationsEnabled(android.content.Context context) {
        if (this.coroutineBoundary) {
            return true;
        }
        return this.sha1 && com.airbnb.lottie.L.getReducedMotionOption().getCurrentReducedMotionMode(context) == com.airbnb.lottie.configurations.reducemotion.ReducedMotionMode.STANDARD_MOTION;
    }

    @java.lang.Deprecated
    public void setSystemAnimationsAreEnabled(java.lang.Boolean bool) {
        this.sha1 = bool.booleanValue();
    }

    @java.lang.Deprecated
    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.coroutineBoundary = z;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.getHighSpeedVideoSizes.setUseCompositionFrameRate(z);
    }

    public void setImageAssetDelegate(com.airbnb.lottie.ImageAssetDelegate imageAssetDelegate) {
        this.coroutineCreation = imageAssetDelegate;
        com.airbnb.lottie.manager.ImageAssetManager imageAssetManager = this.ArtificialStackFrames;
        if (imageAssetManager != null) {
            imageAssetManager.setDelegate(imageAssetDelegate);
        }
    }

    public void setFontAssetDelegate(com.airbnb.lottie.FontAssetDelegate fontAssetDelegate) {
        this.getHighSpeedVideoFpsRangesFor = fontAssetDelegate;
        com.airbnb.lottie.manager.FontAssetManager fontAssetManager = this.accessartificialFrame;
        if (fontAssetManager != null) {
            fontAssetManager.setDelegate(fontAssetDelegate);
        }
    }

    public void setFontMap(java.util.Map<java.lang.String, android.graphics.Typeface> map) {
        if (map == this.CoroutineDebuggingKt) {
            return;
        }
        this.CoroutineDebuggingKt = map;
        invalidateSelf();
    }

    public void setTextDelegate(com.airbnb.lottie.TextDelegate textDelegate) {
        this.getOutputSizeshNQ4ISI = textDelegate;
    }

    public com.airbnb.lottie.TextDelegate getTextDelegate() {
        return this.getOutputSizeshNQ4ISI;
    }

    public boolean useTextGlyphs() {
        return this.CoroutineDebuggingKt == null && this.getOutputSizeshNQ4ISI == null && this.getValidOutputFormatsForInputhNQ4ISI.getCharacters().size() > 0;
    }

    public com.airbnb.lottie.LottieComposition getComposition() {
        return this.getValidOutputFormatsForInputhNQ4ISI;
    }

    public void cancelAnimation() {
        this.b.clear();
        this.getHighSpeedVideoSizes.cancel();
        if (isVisible()) {
            return;
        }
        this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
    }

    public void pauseAnimation() {
        this.b.clear();
        this.getHighSpeedVideoSizes.pauseAnimation();
        if (isVisible()) {
            return;
        }
        this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
    }

    public float getProgress() {
        return this.getHighSpeedVideoSizes.getAnimatedValueAbsolute();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            return -1;
        }
        return lottieComposition.getBounds().height();
    }

    public java.util.List<com.airbnb.lottie.model.KeyPath> resolveKeyPath(com.airbnb.lottie.model.KeyPath keyPath) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            com.airbnb.lottie.utils.Logger.warning("Cannot resolve KeyPath. Composition is not set yet.");
            return java.util.Collections.emptyList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.getHighResolutionOutputSizeshNQ4ISI.resolveKeyPath(keyPath, 0, arrayList, new com.airbnb.lottie.model.KeyPath(new java.lang.String[0]));
        return arrayList;
    }

    public <T> void addValueCallback(final com.airbnb.lottie.model.KeyPath keyPath, final T t, final com.airbnb.lottie.value.LottieValueCallback<T> lottieValueCallback) {
        if (this.getHighResolutionOutputSizeshNQ4ISI == null) {
            this.b.add(new com.airbnb.lottie.LottieDrawable.LazyCompositionTask() { // from class: com.airbnb.lottie.LottieDrawable$$ExternalSyntheticLambda6
                @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
                public final void run(com.airbnb.lottie.LottieComposition lottieComposition) {
                    com.airbnb.lottie.LottieDrawable.this.addValueCallback(keyPath, (com.airbnb.lottie.model.KeyPath) t, (com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.KeyPath>) lottieValueCallback);
                }
            });
            return;
        }
        if (keyPath == com.airbnb.lottie.model.KeyPath.COMPOSITION) {
            this.getHighResolutionOutputSizeshNQ4ISI.addValueCallback(t, lottieValueCallback);
        } else if (keyPath.getResolvedElement() != null) {
            keyPath.getResolvedElement().addValueCallback(t, lottieValueCallback);
        } else {
            java.util.List<com.airbnb.lottie.model.KeyPath> resolveKeyPath = resolveKeyPath(keyPath);
            for (int i = 0; i < resolveKeyPath.size(); i++) {
                resolveKeyPath.get(i).getResolvedElement().addValueCallback(t, lottieValueCallback);
            }
            if (!(!resolveKeyPath.isEmpty())) {
                return;
            }
        }
        invalidateSelf();
        if (t == com.airbnb.lottie.LottieProperty.TIME_REMAP) {
            setProgress(getProgress());
        }
    }

    public <T> void addValueCallback(com.airbnb.lottie.model.KeyPath keyPath, T t, final com.airbnb.lottie.value.SimpleLottieValueCallback<T> simpleLottieValueCallback) {
        addValueCallback(keyPath, (com.airbnb.lottie.model.KeyPath) t, (com.airbnb.lottie.value.LottieValueCallback<com.airbnb.lottie.model.KeyPath>) new com.airbnb.lottie.value.LottieValueCallback<T>() { // from class: com.airbnb.lottie.LottieDrawable.1
            @Override // com.airbnb.lottie.value.LottieValueCallback
            public T getValue(com.airbnb.lottie.value.LottieFrameInfo<T> lottieFrameInfo) {
                return (T) simpleLottieValueCallback.getValue(lottieFrameInfo);
            }
        });
    }

    public android.graphics.Bitmap updateBitmap(java.lang.String str, android.graphics.Bitmap bitmap) {
        com.airbnb.lottie.manager.ImageAssetManager highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI == null) {
            com.airbnb.lottie.utils.Logger.warning("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        android.graphics.Bitmap updateBitmap = highResolutionOutputSizeshNQ4ISI.updateBitmap(str, bitmap);
        invalidateSelf();
        return updateBitmap;
    }

    @java.lang.Deprecated
    public android.graphics.Bitmap getImageAsset(java.lang.String str) {
        com.airbnb.lottie.manager.ImageAssetManager highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI.bitmapForId(str);
        }
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        com.airbnb.lottie.LottieImageAsset lottieImageAsset = lottieComposition == null ? null : lottieComposition.getImages().get(str);
        if (lottieImageAsset != null) {
            return lottieImageAsset.getBitmap();
        }
        return null;
    }

    public android.graphics.Bitmap getBitmapForId(java.lang.String str) {
        com.airbnb.lottie.manager.ImageAssetManager highResolutionOutputSizeshNQ4ISI = getHighResolutionOutputSizeshNQ4ISI();
        if (highResolutionOutputSizeshNQ4ISI != null) {
            return highResolutionOutputSizeshNQ4ISI.bitmapForId(str);
        }
        return null;
    }

    public com.airbnb.lottie.LottieImageAsset getLottieImageAssetForId(java.lang.String str) {
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (lottieComposition == null) {
            return null;
        }
        return lottieComposition.getImages().get(str);
    }

    private com.airbnb.lottie.manager.ImageAssetManager getHighResolutionOutputSizeshNQ4ISI() {
        com.airbnb.lottie.manager.ImageAssetManager imageAssetManager = this.ArtificialStackFrames;
        if (imageAssetManager != null) {
            android.graphics.drawable.Drawable.Callback callback = getCallback();
            if (!imageAssetManager.hasSameContext((callback == null || !(callback instanceof android.view.View)) ? null : ((android.view.View) callback).getContext())) {
                this.ArtificialStackFrames = null;
            }
        }
        if (this.ArtificialStackFrames == null) {
            this.ArtificialStackFrames = new com.airbnb.lottie.manager.ImageAssetManager(getCallback(), this.f2825a, this.coroutineCreation, this.getValidOutputFormatsForInputhNQ4ISI.getImages());
        }
        return this.ArtificialStackFrames;
    }

    public android.graphics.Typeface getTypeface(com.airbnb.lottie.model.Font font) {
        java.util.Map<java.lang.String, android.graphics.Typeface> map = this.CoroutineDebuggingKt;
        if (map != null) {
            java.lang.String family = font.getFamily();
            if (map.containsKey(family)) {
                return map.get(family);
            }
            java.lang.String name2 = font.getName();
            if (map.containsKey(name2)) {
                return map.get(name2);
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(font.getFamily());
            sb.append("-");
            sb.append(font.getStyle());
            java.lang.String obj = sb.toString();
            if (map.containsKey(obj)) {
                return map.get(obj);
            }
        }
        com.airbnb.lottie.manager.FontAssetManager highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            return highSpeedVideoSizes.getTypeface(font);
        }
        return null;
    }

    private com.airbnb.lottie.manager.FontAssetManager getHighSpeedVideoSizes() {
        if (getCallback() == null) {
            return null;
        }
        if (this.accessartificialFrame == null) {
            com.airbnb.lottie.manager.FontAssetManager fontAssetManager = new com.airbnb.lottie.manager.FontAssetManager(getCallback(), this.getHighSpeedVideoFpsRangesFor);
            this.accessartificialFrame = fontAssetManager;
            java.lang.String str = this.getHighSpeedVideoFpsRanges;
            if (str != null) {
                fontAssetManager.setDefaultFontFileExtension(str);
            }
        }
        return this.accessartificialFrame;
    }

    public void setDefaultFontFileExtension(java.lang.String str) {
        this.getHighSpeedVideoFpsRanges = str;
        com.airbnb.lottie.manager.FontAssetManager highSpeedVideoSizes = getHighSpeedVideoSizes();
        if (highSpeedVideoSizes != null) {
            highSpeedVideoSizes.setDefaultFontFileExtension(str);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean isVisible = isVisible();
        boolean visible = super.setVisible(z, z2);
        if (z) {
            if (this.getHighSpeedVideoSizesFor == com.airbnb.lottie.LottieDrawable.OnVisibleAction.PLAY) {
                playAnimation();
                return visible;
            }
            if (this.getHighSpeedVideoSizesFor == com.airbnb.lottie.LottieDrawable.OnVisibleAction.RESUME) {
                resumeAnimation();
                return visible;
            }
        } else {
            if (this.getHighSpeedVideoSizes.isRunning()) {
                pauseAnimation();
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.RESUME;
                return visible;
            }
            if (isVisible) {
                this.getHighSpeedVideoSizesFor = com.airbnb.lottie.LottieDrawable.OnVisibleAction.NONE;
            }
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.scheduleDrawable(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (callback == null) {
            return;
        }
        callback.unscheduleDrawable(this, runnable);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas) {
        com.airbnb.lottie.model.layer.CompositionLayer compositionLayer = this.getHighResolutionOutputSizeshNQ4ISI;
        com.airbnb.lottie.LottieComposition lottieComposition = this.getValidOutputFormatsForInputhNQ4ISI;
        if (compositionLayer == null || lottieComposition == null) {
            return;
        }
        this.resetTransaction.reset();
        if (!getBounds().isEmpty()) {
            this.resetTransaction.preTranslate(r2.left, r2.top);
            this.resetTransaction.preScale(r2.width() / lottieComposition.getBounds().width(), r2.height() / lottieComposition.getBounds().height());
        }
        compositionLayer.draw(canvas, this.resetTransaction, this.getOutputSizes, null);
    }

    private void getHighResolutionOutputSizeshNQ4ISI(android.graphics.Canvas canvas, com.airbnb.lottie.model.layer.CompositionLayer compositionLayer) {
        if (this.getValidOutputFormatsForInputhNQ4ISI == null || compositionLayer == null) {
            return;
        }
        Camera2StreamConfigurationMap();
        canvas.getMatrix(this.l);
        canvas.getClipBounds(this.toString);
        android.graphics.Rect rect = this.toString;
        this.unwrapAs.set(rect.left, rect.top, rect.right, rect.bottom);
        this.l.mapRect(this.unwrapAs);
        Camera2StreamConfigurationMap(this.unwrapAs, this.toString);
        if (this.isOutputSupportedForhNQ4ISI) {
            this.freeTransaction.set(0.0f, 0.0f, getIntrinsicWidth(), getIntrinsicHeight());
        } else {
            compositionLayer.getBounds(this.freeTransaction, null, false);
        }
        this.l.mapRect(this.freeTransaction);
        android.graphics.Rect bounds = getBounds();
        float width = bounds.width() / getIntrinsicWidth();
        float height = bounds.height() / getIntrinsicHeight();
        android.graphics.RectF rectF = this.freeTransaction;
        rectF.set(rectF.left * width, rectF.top * height, rectF.right * width, rectF.bottom * height);
        if (!getOutputFormats()) {
            this.freeTransaction.intersect(this.toString.left, this.toString.top, this.toString.right, this.toString.bottom);
        }
        if (!getHighResolutionOutputSizeshNQ4ISI(this.freeTransaction)) {
            com.airbnb.lottie.utils.Logger.warning("Skipping software rendering: transformed bounds contain non-finite values.");
            return;
        }
        int ceil = (int) java.lang.Math.ceil(this.freeTransaction.width());
        int ceil2 = (int) java.lang.Math.ceil(this.freeTransaction.height());
        if (ceil <= 0 || ceil2 <= 0) {
            com.airbnb.lottie.utils.Logger.warning("Skipping software rendering: transformed bounds have negative values.");
            return;
        }
        long j = ceil * ceil2;
        if (j > 50000000) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Skipping software rendering: bitmap request exceeds safe pixel count (");
            sb.append(j);
            sb.append(")");
            com.airbnb.lottie.utils.Logger.warning(sb.toString());
            return;
        }
        getHighSpeedVideoFpsRangesFor(ceil, ceil2);
        if (this.getInputFormats) {
            this.l.getValues(this.updateUI);
            float[] fArr = this.updateUI;
            float f = fArr[0];
            float f2 = fArr[4];
            this.resetTransaction.set(this.l);
            this.resetTransaction.preScale(width, height);
            this.resetTransaction.postTranslate(-this.freeTransaction.left, -this.freeTransaction.top);
            this.resetTransaction.postScale(1.0f / f, 1.0f / f2);
            this.startTransaction.eraseColor(0);
            this.release.setMatrix(com.airbnb.lottie.utils.Utils.IDENTITY_MATRIX);
            this.release.scale(f, f2);
            compositionLayer.draw(this.release, this.resetTransaction, this.getOutputSizes, null);
            this.l.invert(this.requestGoOnline);
            this.requestGoOnline.mapRect(this.AMEXKernelCallback, this.freeTransaction);
            Camera2StreamConfigurationMap(this.AMEXKernelCallback, this.requestPINEntry);
        }
        this.free.set(0, 0, ceil, ceil2);
        canvas.drawBitmap(this.startTransaction, this.free, this.requestPINEntry, this.AMEXKernelJNI);
    }

    private void Camera2StreamConfigurationMap() {
        if (this.release != null) {
            return;
        }
        this.release = new android.graphics.Canvas();
        this.freeTransaction = new android.graphics.RectF();
        this.l = new android.graphics.Matrix();
        this.requestGoOnline = new android.graphics.Matrix();
        this.toString = new android.graphics.Rect();
        this.unwrapAs = new android.graphics.RectF();
        this.AMEXKernelJNI = new com.airbnb.lottie.animation.LPaint();
        this.free = new android.graphics.Rect();
        this.requestPINEntry = new android.graphics.Rect();
        this.AMEXKernelCallback = new android.graphics.RectF();
    }

    private void getHighSpeedVideoFpsRangesFor(int i, int i2) {
        android.graphics.Bitmap bitmap = this.startTransaction;
        if (bitmap == null || bitmap.getWidth() < i || this.startTransaction.getHeight() < i2) {
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
            this.startTransaction = createBitmap;
            this.release.setBitmap(createBitmap);
            this.getInputFormats = true;
            return;
        }
        if (this.startTransaction.getWidth() > i || this.startTransaction.getHeight() > i2) {
            android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(this.startTransaction, 0, 0, i, i2);
            this.startTransaction = createBitmap2;
            this.release.setBitmap(createBitmap2);
            this.getInputFormats = true;
        }
    }

    private static void Camera2StreamConfigurationMap(android.graphics.RectF rectF, android.graphics.Rect rect) {
        rect.set((int) java.lang.Math.floor(rectF.left), (int) java.lang.Math.floor(rectF.top), (int) java.lang.Math.ceil(rectF.right), (int) java.lang.Math.ceil(rectF.bottom));
    }

    private static boolean getHighResolutionOutputSizeshNQ4ISI(android.graphics.RectF rectF) {
        float f = rectF.left;
        if (java.lang.Float.isNaN(f) || java.lang.Float.isInfinite(f)) {
            return false;
        }
        float f2 = rectF.top;
        if (java.lang.Float.isNaN(f2) || java.lang.Float.isInfinite(f2)) {
            return false;
        }
        float f3 = rectF.right;
        if (java.lang.Float.isNaN(f3) || java.lang.Float.isInfinite(f3)) {
            return false;
        }
        float f4 = rectF.bottom;
        return (java.lang.Float.isNaN(f4) || java.lang.Float.isInfinite(f4)) ? false : true;
    }

    private boolean getOutputFormats() {
        android.graphics.drawable.Drawable.Callback callback = getCallback();
        if (!(callback instanceof android.view.View)) {
            return false;
        }
        if (((android.view.View) callback).getParent() instanceof android.view.ViewGroup) {
            return !((android.view.ViewGroup) r0).getClipChildren();
        }
        return false;
    }
}
