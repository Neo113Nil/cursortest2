package androidx.camera.core.processing.concurrent;

/* loaded from: classes6.dex */
public class DualSurfaceProcessor implements androidx.camera.core.processing.SurfaceProcessorInternal, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    final android.os.HandlerThread Camera2StreamConfigurationMap;
    int getHighResolutionOutputSizeshNQ4ISI;
    final androidx.camera.core.processing.concurrent.DualOpenGlRenderer getHighSpeedVideoFpsRanges;
    final android.os.Handler getHighSpeedVideoFpsRangesFor;
    final java.util.concurrent.Executor getHighSpeedVideoSizes;
    android.graphics.SurfaceTexture getHighSpeedVideoSizesFor;
    private final java.util.concurrent.atomic.AtomicBoolean getInputFormats;
    android.graphics.SurfaceTexture getInputSizeshNQ4ISI;
    final java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> getOutputFormats;
    boolean getOutputMinFrameDuration;

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor() {
    }

    DualSurfaceProcessor(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2) {
        this(dynamicRange, java.util.Collections.emptyMap(), compositionSettings, compositionSettings2);
    }

    private DualSurfaceProcessor(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2) {
        this.getHighResolutionOutputSizeshNQ4ISI = 0;
        this.getOutputMinFrameDuration = false;
        this.getInputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputFormats = new java.util.LinkedHashMap();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-GL Thread");
        this.Camera2StreamConfigurationMap = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.getHighSpeedVideoFpsRangesFor = handler;
        this.getHighSpeedVideoSizes = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(handler);
        this.getHighSpeedVideoFpsRanges = new androidx.camera.core.processing.concurrent.DualOpenGlRenderer(compositionSettings, compositionSettings2);
        try {
            try {
                androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda3
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        return androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this.getHighSpeedVideoFpsRanges(dynamicRange, map, completer);
                    }
                }).get();
            } catch (java.lang.InterruptedException | java.util.concurrent.ExecutionException e) {
                e = e;
                e = e instanceof java.util.concurrent.ExecutionException ? e.getCause() : e;
                if (e instanceof java.lang.RuntimeException) {
                    throw ((java.lang.RuntimeException) e);
                }
                throw new java.lang.IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
        } catch (java.lang.RuntimeException e2) {
            release();
            throw e2;
        }
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onInputSurface(final androidx.camera.core.SurfaceRequest surfaceRequest) throws androidx.camera.core.ProcessingException {
        if (this.getInputFormats.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                final androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                dualSurfaceProcessor.getHighResolutionOutputSizeshNQ4ISI++;
                final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(dualSurfaceProcessor.getHighSpeedVideoFpsRanges.getTextureName(surfaceRequest2.isPrimary()));
                surfaceTexture.setDefaultBufferSize(surfaceRequest2.getResolution().getWidth(), surfaceRequest2.getResolution().getHeight());
                final android.view.Surface surface = new android.view.Surface(surfaceTexture);
                surfaceRequest2.provideSurface(surface, dualSurfaceProcessor.getHighSpeedVideoSizes, new androidx.core.util.Consumer() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda1
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor2 = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                        android.graphics.SurfaceTexture surfaceTexture2 = surfaceTexture;
                        android.view.Surface surface2 = surface;
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        dualSurfaceProcessor2.getHighResolutionOutputSizeshNQ4ISI--;
                        dualSurfaceProcessor2.getHighResolutionOutputSizeshNQ4ISI();
                    }
                });
                if (surfaceRequest2.isPrimary()) {
                    dualSurfaceProcessor.getInputSizeshNQ4ISI = surfaceTexture;
                } else {
                    dualSurfaceProcessor.getHighSpeedVideoSizesFor = surfaceTexture;
                    surfaceTexture.setOnFrameAvailableListener(dualSurfaceProcessor, dualSurfaceProcessor.getHighSpeedVideoFpsRangesFor);
                }
            }
        };
        java.util.Objects.requireNonNull(surfaceRequest);
        getHighSpeedVideoFpsRangesFor(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda2(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final androidx.camera.core.SurfaceOutput surfaceOutput) throws androidx.camera.core.ProcessingException {
        if (this.getInputFormats.get()) {
            surfaceOutput.close();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                final androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                final androidx.camera.core.SurfaceOutput surfaceOutput2 = surfaceOutput;
                android.view.Surface surface = surfaceOutput2.getSurface(dualSurfaceProcessor.getHighSpeedVideoSizes, new androidx.core.util.Consumer() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda6
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor2 = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                        androidx.camera.core.SurfaceOutput surfaceOutput3 = surfaceOutput2;
                        surfaceOutput3.close();
                        android.view.Surface remove = dualSurfaceProcessor2.getOutputFormats.remove(surfaceOutput3);
                        if (remove != null) {
                            dualSurfaceProcessor2.getHighSpeedVideoFpsRanges.unregisterOutputSurface(remove);
                        }
                    }
                });
                dualSurfaceProcessor.getHighSpeedVideoFpsRanges.registerOutputSurface(surface);
                dualSurfaceProcessor.getOutputFormats.put(surfaceOutput2, surface);
            }
        };
        java.util.Objects.requireNonNull(surfaceOutput);
        getHighSpeedVideoFpsRangesFor(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda13(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.getInputFormats.getAndSet(true)) {
            return;
        }
        getHighSpeedVideoFpsRangesFor(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                dualSurfaceProcessor.getOutputMinFrameDuration = true;
                dualSurfaceProcessor.getHighResolutionOutputSizeshNQ4ISI();
            }
        }, new androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda8());
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        android.graphics.SurfaceTexture surfaceTexture2;
        if (this.getInputFormats.get() || (surfaceTexture2 = this.getInputSizeshNQ4ISI) == null || this.getHighSpeedVideoSizesFor == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.getHighSpeedVideoSizesFor.updateTexImage();
        for (java.util.Map.Entry<androidx.camera.core.SurfaceOutput, android.view.Surface> entry : this.getOutputFormats.entrySet()) {
            android.view.Surface value = entry.getValue();
            androidx.camera.core.SurfaceOutput key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.getHighSpeedVideoFpsRanges.render(surfaceTexture.getTimestamp(), value, key, this.getInputSizeshNQ4ISI, this.getHighSpeedVideoSizesFor);
                } catch (java.lang.RuntimeException e) {
                    androidx.camera.core.Logger.e("DualSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            }
        }
    }

    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map map, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        getHighSpeedVideoFpsRangesFor(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                androidx.camera.core.DynamicRange dynamicRange2 = dynamicRange;
                java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map2 = map;
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                try {
                    dualSurfaceProcessor.getHighSpeedVideoFpsRanges.init(dynamicRange2, map2);
                    completer2.set(null);
                } catch (java.lang.RuntimeException e) {
                    completer2.setException(e);
                }
            }
        }, new androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda8());
        return "Init GlRenderer";
    }

    private void getHighSpeedVideoFpsRangesFor(final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        try {
            this.getHighSpeedVideoSizes.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.concurrent.DualSurfaceProcessor dualSurfaceProcessor = androidx.camera.core.processing.concurrent.DualSurfaceProcessor.this;
                    java.lang.Runnable runnable3 = runnable2;
                    java.lang.Runnable runnable4 = runnable;
                    if (dualSurfaceProcessor.getOutputMinFrameDuration) {
                        runnable3.run();
                    } else {
                        runnable4.run();
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e) {
            androidx.camera.core.Logger.w("DualSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getOutputMinFrameDuration && this.getHighResolutionOutputSizeshNQ4ISI == 0) {
            java.util.Iterator<androidx.camera.core.SurfaceOutput> it = this.getOutputFormats.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.getOutputFormats.clear();
            this.getHighSpeedVideoFpsRanges.release();
            this.Camera2StreamConfigurationMap.quit();
        }
    }

    public static class Factory {
        private static kotlin.jvm.functions.Function3<androidx.camera.core.DynamicRange, androidx.camera.core.CompositionSettings, androidx.camera.core.CompositionSettings, androidx.camera.core.processing.SurfaceProcessorInternal> getHighSpeedVideoFpsRangesFor = new kotlin.jvm.functions.Function3() { // from class: androidx.camera.core.processing.concurrent.DualSurfaceProcessor$Factory$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function3
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
                return new androidx.camera.core.processing.concurrent.DualSurfaceProcessor((androidx.camera.core.DynamicRange) obj, (androidx.camera.core.CompositionSettings) obj2, (androidx.camera.core.CompositionSettings) obj3);
            }
        };

        private Factory() {
        }

        public static androidx.camera.core.processing.SurfaceProcessorInternal newInstance(androidx.camera.core.DynamicRange dynamicRange, androidx.camera.core.CompositionSettings compositionSettings, androidx.camera.core.CompositionSettings compositionSettings2) {
            return getHighSpeedVideoFpsRangesFor.invoke(dynamicRange, compositionSettings, compositionSettings2);
        }

        public static void setSupplier(kotlin.jvm.functions.Function3<androidx.camera.core.DynamicRange, androidx.camera.core.CompositionSettings, androidx.camera.core.CompositionSettings, androidx.camera.core.processing.SurfaceProcessorInternal> function3) {
            getHighSpeedVideoFpsRangesFor = function3;
        }
    }
}
