package androidx.camera.core.processing;

/* loaded from: classes6.dex */
public class DefaultSurfaceProcessor implements androidx.camera.core.processing.SurfaceProcessorInternal, android.graphics.SurfaceTexture.OnFrameAvailableListener {
    final java.util.concurrent.Executor Camera2StreamConfigurationMap;
    final android.os.HandlerThread getHighResolutionOutputSizeshNQ4ISI;
    final android.os.Handler getHighSpeedVideoFpsRanges;
    final androidx.camera.core.processing.OpenGlRenderer getHighSpeedVideoFpsRangesFor;
    int getHighSpeedVideoSizes;
    final java.util.List<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> getHighSpeedVideoSizesFor;
    boolean getInputFormats;
    private final float[] getInputSizeshNQ4ISI;
    private final java.util.concurrent.atomic.AtomicBoolean getOutputFormats;
    final java.util.Map<androidx.camera.core.SurfaceOutput, android.view.Surface> getOutputMinFrameDuration;
    private final float[] getOutputSizeshNQ4ISI;

    static /* synthetic */ void getHighSpeedVideoSizes() {
    }

    DefaultSurfaceProcessor(androidx.camera.core.DynamicRange dynamicRange) {
        this(dynamicRange, java.util.Collections.emptyMap());
    }

    private DefaultSurfaceProcessor(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map) {
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.getOutputSizeshNQ4ISI = new float[16];
        this.getInputSizeshNQ4ISI = new float[16];
        this.getOutputMinFrameDuration = new java.util.LinkedHashMap();
        this.getHighSpeedVideoSizes = 0;
        this.getInputFormats = false;
        this.getHighSpeedVideoSizesFor = new java.util.ArrayList();
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("CameraX-GL Thread");
        this.getHighResolutionOutputSizeshNQ4ISI = handlerThread;
        handlerThread.start();
        android.os.Handler handler = new android.os.Handler(handlerThread.getLooper());
        this.getHighSpeedVideoFpsRanges = handler;
        this.Camera2StreamConfigurationMap = androidx.camera.core.impl.utils.executor.CameraXExecutors.newHandlerExecutor(handler);
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.processing.OpenGlRenderer();
        try {
            try {
                androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda10
                    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                    public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                        return androidx.camera.core.processing.DefaultSurfaceProcessor.this.getHighSpeedVideoFpsRanges(dynamicRange, map, completer);
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
    public void onInputSurface(final androidx.camera.core.SurfaceRequest surfaceRequest) {
        if (this.getOutputFormats.get()) {
            surfaceRequest.willNotProvideSurface();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                final androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                final androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                defaultSurfaceProcessor.getHighSpeedVideoSizes++;
                final android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(defaultSurfaceProcessor.getHighSpeedVideoFpsRangesFor.getTextureName());
                surfaceTexture.setDefaultBufferSize(surfaceRequest2.getResolution().getWidth(), surfaceRequest2.getResolution().getHeight());
                final android.view.Surface surface = new android.view.Surface(surfaceTexture);
                surfaceRequest2.setTransformationInfoListener(defaultSurfaceProcessor.Camera2StreamConfigurationMap, new androidx.camera.core.SurfaceRequest.TransformationInfoListener() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda8
                    @Override // androidx.camera.core.SurfaceRequest.TransformationInfoListener
                    public final void onTransformationInfoUpdate(androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo) {
                        androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor2 = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                        androidx.camera.core.SurfaceRequest surfaceRequest3 = surfaceRequest2;
                        androidx.camera.core.processing.util.GLUtils.InputFormat inputFormat = androidx.camera.core.processing.util.GLUtils.InputFormat.DEFAULT;
                        if (surfaceRequest3.getDynamicRange().is10BitHdr() && transformationInfo.hasCameraTransform()) {
                            inputFormat = androidx.camera.core.processing.util.GLUtils.InputFormat.YUV;
                        }
                        defaultSurfaceProcessor2.getHighSpeedVideoFpsRangesFor.setInputFormat(inputFormat);
                    }
                });
                surfaceRequest2.provideSurface(surface, defaultSurfaceProcessor.Camera2StreamConfigurationMap, new androidx.core.util.Consumer() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda9
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor2 = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                        androidx.camera.core.SurfaceRequest surfaceRequest3 = surfaceRequest2;
                        android.graphics.SurfaceTexture surfaceTexture2 = surfaceTexture;
                        android.view.Surface surface2 = surface;
                        surfaceRequest3.clearTransformationInfoListener();
                        surfaceTexture2.setOnFrameAvailableListener(null);
                        surfaceTexture2.release();
                        surface2.release();
                        defaultSurfaceProcessor2.getHighSpeedVideoSizes--;
                        defaultSurfaceProcessor2.getHighResolutionOutputSizeshNQ4ISI();
                    }
                });
                surfaceTexture.setOnFrameAvailableListener(defaultSurfaceProcessor, defaultSurfaceProcessor.getHighSpeedVideoFpsRanges);
            }
        };
        java.util.Objects.requireNonNull(surfaceRequest);
        Camera2StreamConfigurationMap(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda2(surfaceRequest));
    }

    @Override // androidx.camera.core.SurfaceProcessor
    public void onOutputSurface(final androidx.camera.core.SurfaceOutput surfaceOutput) {
        if (this.getOutputFormats.get()) {
            surfaceOutput.close();
            return;
        }
        java.lang.Runnable runnable = new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                final androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                final androidx.camera.core.SurfaceOutput surfaceOutput2 = surfaceOutput;
                android.view.Surface surface = surfaceOutput2.getSurface(defaultSurfaceProcessor.Camera2StreamConfigurationMap, new androidx.core.util.Consumer() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda7
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor2 = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                        androidx.camera.core.SurfaceOutput surfaceOutput3 = surfaceOutput2;
                        surfaceOutput3.close();
                        android.view.Surface remove = defaultSurfaceProcessor2.getOutputMinFrameDuration.remove(surfaceOutput3);
                        if (remove != null) {
                            defaultSurfaceProcessor2.getHighSpeedVideoFpsRangesFor.unregisterOutputSurface(remove);
                        }
                    }
                });
                defaultSurfaceProcessor.getHighSpeedVideoFpsRangesFor.registerOutputSurface(surface);
                defaultSurfaceProcessor.getOutputMinFrameDuration.put(surfaceOutput2, surface);
            }
        };
        java.util.Objects.requireNonNull(surfaceOutput);
        Camera2StreamConfigurationMap(runnable, new androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda13(surfaceOutput));
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public void release() {
        if (this.getOutputFormats.getAndSet(true)) {
            return;
        }
        Camera2StreamConfigurationMap(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                defaultSurfaceProcessor.getInputFormats = true;
                defaultSurfaceProcessor.getHighResolutionOutputSizeshNQ4ISI();
            }
        }, new androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda14());
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorInternal
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> snapshot(final int i, final int i2) {
        return androidx.camera.core.impl.utils.futures.Futures.nonCancellationPropagating(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda5
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                return androidx.camera.core.processing.DefaultSurfaceProcessor.this.getHighSpeedVideoFpsRangesFor(i, i2, completer);
            }
        }));
    }

    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRangesFor(int i, int i2, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        final androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot highResolutionOutputSizeshNQ4ISI = androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot.getHighResolutionOutputSizeshNQ4ISI(i, i2, completer);
        Camera2StreamConfigurationMap(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                defaultSurfaceProcessor.getHighSpeedVideoSizesFor.add(highResolutionOutputSizeshNQ4ISI);
            }
        }, new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.setException(new java.lang.Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(android.graphics.SurfaceTexture surfaceTexture) {
        if (this.getOutputFormats.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.getOutputSizeshNQ4ISI);
        kotlin.Triple triple = null;
        for (java.util.Map.Entry<androidx.camera.core.SurfaceOutput, android.view.Surface> entry : this.getOutputMinFrameDuration.entrySet()) {
            android.view.Surface value = entry.getValue();
            androidx.camera.core.SurfaceOutput key = entry.getKey();
            key.updateTransformMatrix(this.getInputSizeshNQ4ISI, this.getOutputSizeshNQ4ISI);
            if (key.getFormat() == 34) {
                try {
                    this.getHighSpeedVideoFpsRangesFor.render(surfaceTexture.getTimestamp(), this.getInputSizeshNQ4ISI, value);
                } catch (java.lang.RuntimeException e) {
                    androidx.camera.core.Logger.e("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                boolean z = key.getFormat() == 256;
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Unsupported format: ");
                sb.append(key.getFormat());
                androidx.core.util.Preconditions.checkState(z, sb.toString());
                androidx.core.util.Preconditions.checkState(triple == null, "Only one JPEG output is supported.");
                triple = new kotlin.Triple(value, key.getSize(), (float[]) this.getInputSizeshNQ4ISI.clone());
            }
        }
        try {
            if (this.getHighSpeedVideoSizesFor.isEmpty()) {
                return;
            }
            if (triple == null) {
                getHighSpeedVideoFpsRangesFor(new java.lang.Exception("Failed to snapshot: no JPEG Surface."));
                return;
            }
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.util.Iterator<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> it = this.getHighSpeedVideoSizesFor.iterator();
                    android.graphics.Bitmap bitmap = null;
                    byte[] bArr = null;
                    int i = -1;
                    int i2 = -1;
                    while (it.hasNext()) {
                        androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot next = it.next();
                        if (i != next.getHighResolutionOutputSizeshNQ4ISI() || bitmap == null) {
                            i = next.getHighResolutionOutputSizeshNQ4ISI();
                            if (bitmap != null) {
                                bitmap.recycle();
                            }
                            android.util.Size size = (android.util.Size) triple.getSecond();
                            float[] fArr = (float[]) ((float[]) triple.getThird()).clone();
                            androidx.camera.core.impl.utils.MatrixExt.preRotate(fArr, i, 0.5f, 0.5f);
                            androidx.camera.core.impl.utils.MatrixExt.preVerticalFlip(fArr, 0.5f);
                            bitmap = this.getHighSpeedVideoFpsRangesFor.snapshot(androidx.camera.core.impl.utils.TransformUtils.rotateSize(size, i), fArr);
                            i2 = -1;
                        }
                        if (i2 != next.Camera2StreamConfigurationMap()) {
                            byteArrayOutputStream.reset();
                            i2 = next.Camera2StreamConfigurationMap();
                            bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, i2, byteArrayOutputStream);
                            bArr = byteArrayOutputStream.toByteArray();
                        }
                        androidx.camera.core.ImageProcessingUtil.writeJpegBytesToSurface((android.view.Surface) triple.getFirst(), (byte[]) java.util.Objects.requireNonNull(bArr));
                        next.getHighSpeedVideoFpsRangesFor().set(null);
                        it.remove();
                    }
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.io.IOException e2) {
                getHighSpeedVideoFpsRangesFor(e2);
            }
        } catch (java.lang.RuntimeException e3) {
            getHighSpeedVideoFpsRangesFor(e3);
        }
    }

    private void getHighSpeedVideoFpsRangesFor(java.lang.Throwable th) {
        java.util.Iterator<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> it = this.getHighSpeedVideoSizesFor.iterator();
        while (it.hasNext()) {
            it.next().getHighSpeedVideoFpsRangesFor().setException(th);
        }
        this.getHighSpeedVideoSizesFor.clear();
    }

    final void getHighResolutionOutputSizeshNQ4ISI() {
        if (this.getInputFormats && this.getHighSpeedVideoSizes == 0) {
            java.util.Iterator<androidx.camera.core.SurfaceOutput> it = this.getOutputMinFrameDuration.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            java.util.Iterator<androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot> it2 = this.getHighSpeedVideoSizesFor.iterator();
            while (it2.hasNext()) {
                it2.next().getHighSpeedVideoFpsRangesFor().setException(new java.lang.Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.getOutputMinFrameDuration.clear();
            this.getHighSpeedVideoFpsRangesFor.release();
            this.getHighResolutionOutputSizeshNQ4ISI.quit();
        }
    }

    final /* synthetic */ java.lang.Object getHighSpeedVideoFpsRanges(final androidx.camera.core.DynamicRange dynamicRange, final java.util.Map map, final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) throws java.lang.Exception {
        Camera2StreamConfigurationMap(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                androidx.camera.core.DynamicRange dynamicRange2 = dynamicRange;
                java.util.Map<androidx.camera.core.processing.util.GLUtils.InputFormat, androidx.camera.core.processing.ShaderProvider> map2 = map;
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer2 = completer;
                try {
                    defaultSurfaceProcessor.getHighSpeedVideoFpsRangesFor.init(dynamicRange2, map2);
                    completer2.set(null);
                } catch (java.lang.RuntimeException e) {
                    completer2.setException(e);
                }
            }
        }, new androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda14());
        return "Init GlRenderer";
    }

    private void Camera2StreamConfigurationMap(final java.lang.Runnable runnable, final java.lang.Runnable runnable2) {
        try {
            this.Camera2StreamConfigurationMap.execute(new java.lang.Runnable() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.core.processing.DefaultSurfaceProcessor defaultSurfaceProcessor = androidx.camera.core.processing.DefaultSurfaceProcessor.this;
                    java.lang.Runnable runnable3 = runnable2;
                    java.lang.Runnable runnable4 = runnable;
                    if (defaultSurfaceProcessor.getInputFormats) {
                        runnable3.run();
                    } else {
                        runnable4.run();
                    }
                }
            });
        } catch (java.util.concurrent.RejectedExecutionException e) {
            androidx.camera.core.Logger.w("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    static abstract class PendingSnapshot {
        abstract int Camera2StreamConfigurationMap();

        abstract int getHighResolutionOutputSizeshNQ4ISI();

        abstract androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoFpsRangesFor();

        PendingSnapshot() {
        }

        static androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot getHighResolutionOutputSizeshNQ4ISI(int i, int i2, androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> completer) {
            return new androidx.camera.core.processing.AutoValue_DefaultSurfaceProcessor_PendingSnapshot(i, i2, completer);
        }
    }

    public static class Factory {
        private static androidx.arch.core.util.Function<androidx.camera.core.DynamicRange, androidx.camera.core.processing.SurfaceProcessorInternal> getHighSpeedVideoFpsRanges = new androidx.arch.core.util.Function() { // from class: androidx.camera.core.processing.DefaultSurfaceProcessor$Factory$$ExternalSyntheticLambda0
            @Override // androidx.arch.core.util.Function
            public final java.lang.Object apply(java.lang.Object obj) {
                return new androidx.camera.core.processing.DefaultSurfaceProcessor((androidx.camera.core.DynamicRange) obj);
            }
        };

        private Factory() {
        }

        public static androidx.camera.core.processing.SurfaceProcessorInternal newInstance(androidx.camera.core.DynamicRange dynamicRange) {
            return getHighSpeedVideoFpsRanges.apply(dynamicRange);
        }

        public static void setSupplier(androidx.arch.core.util.Function<androidx.camera.core.DynamicRange, androidx.camera.core.processing.SurfaceProcessorInternal> function) {
            getHighSpeedVideoFpsRanges = function;
        }
    }
}
