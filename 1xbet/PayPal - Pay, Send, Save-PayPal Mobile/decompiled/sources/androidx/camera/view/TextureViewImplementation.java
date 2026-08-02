package androidx.camera.view;

/* loaded from: classes6.dex */
final class TextureViewImplementation extends androidx.camera.view.PreviewViewImplementation {
    android.graphics.SurfaceTexture getHighSpeedVideoSizes;
    androidx.camera.view.PreviewView.OnFrameUpdateListener getHighSpeedVideoSizesFor;
    java.util.concurrent.Executor getInputFormats;
    boolean getInputSizeshNQ4ISI;
    java.util.concurrent.atomic.AtomicReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void>> getOutputFormats;
    androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener getOutputMinFrameDuration;
    androidx.camera.core.SurfaceRequest getOutputMinFrameDurationlomOqCM;
    com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest.Result> getOutputSizes;
    android.view.TextureView getOutputSizeshNQ4ISI;
    android.graphics.SurfaceTexture getOutputStallDuration;

    TextureViewImplementation(android.widget.FrameLayout frameLayout, androidx.camera.view.PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.getInputSizeshNQ4ISI = false;
        this.getOutputFormats = new java.util.concurrent.atomic.AtomicReference<>();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final android.view.View getHighSpeedVideoFpsRangesFor() {
        return this.getOutputSizeshNQ4ISI;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void getHighSpeedVideoSizes() {
        this.getInputSizeshNQ4ISI = true;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void Camera2StreamConfigurationMap(final androidx.camera.core.SurfaceRequest surfaceRequest, androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener2;
        this.getHighResolutionOutputSizeshNQ4ISI = surfaceRequest.getResolution();
        Camera2StreamConfigurationMap();
        androidx.camera.core.SurfaceRequest surfaceRequest2 = this.getOutputMinFrameDurationlomOqCM;
        if (surfaceRequest2 != null && surfaceRequest2.willNotProvideSurface() && (onSurfaceNotInUseListener2 = this.getOutputMinFrameDuration) != null) {
            onSurfaceNotInUseListener2.onSurfaceNotInUse();
            this.getOutputMinFrameDuration = null;
        }
        this.getOutputMinFrameDurationlomOqCM = surfaceRequest;
        this.getOutputMinFrameDuration = onSurfaceNotInUseListener;
        surfaceRequest.addRequestCancellationListener(androidx.core.content.ContextCompat.getMainExecutor(this.getOutputSizeshNQ4ISI.getContext()), new java.lang.Runnable() { // from class: androidx.camera.view.TextureViewImplementation$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.TextureViewImplementation textureViewImplementation = androidx.camera.view.TextureViewImplementation.this;
                androidx.camera.core.SurfaceRequest surfaceRequest3 = surfaceRequest;
                androidx.camera.core.SurfaceRequest surfaceRequest4 = textureViewImplementation.getOutputMinFrameDurationlomOqCM;
                if (surfaceRequest4 != null && surfaceRequest4 == surfaceRequest3) {
                    textureViewImplementation.getOutputMinFrameDurationlomOqCM = null;
                    textureViewImplementation.getOutputSizes = null;
                }
                androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener3 = textureViewImplementation.getOutputMinFrameDuration;
                if (onSurfaceNotInUseListener3 != null) {
                    onSurfaceNotInUseListener3.onSurfaceNotInUse();
                    textureViewImplementation.getOutputMinFrameDuration = null;
                }
            }
        });
        getInputFormats();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    public final void Camera2StreamConfigurationMap() {
        androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRanges);
        androidx.core.util.Preconditions.checkNotNull(this.getHighResolutionOutputSizeshNQ4ISI);
        android.view.TextureView textureView = new android.view.TextureView(this.getHighSpeedVideoFpsRanges.getContext());
        this.getOutputSizeshNQ4ISI = textureView;
        textureView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), this.getHighResolutionOutputSizeshNQ4ISI.getHeight()));
        this.getOutputSizeshNQ4ISI.setSurfaceTextureListener(new androidx.camera.view.TextureViewImplementation.AnonymousClass1());
        this.getHighSpeedVideoFpsRanges.removeAllViews();
        this.getHighSpeedVideoFpsRanges.addView(this.getOutputSizeshNQ4ISI);
    }

    /* renamed from: androidx.camera.view.TextureViewImplementation$1, reason: invalid class name */
    class AnonymousClass1 implements android.view.TextureView.SurfaceTextureListener {
        AnonymousClass1() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceTexture available. Size: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            androidx.camera.core.Logger.d("TextureViewImpl", sb.toString());
            androidx.camera.view.TextureViewImplementation.this.getOutputStallDuration = surfaceTexture;
            if (androidx.camera.view.TextureViewImplementation.this.getOutputSizes != null) {
                androidx.core.util.Preconditions.checkNotNull(androidx.camera.view.TextureViewImplementation.this.getOutputMinFrameDurationlomOqCM);
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Surface invalidated ");
                sb2.append(androidx.camera.view.TextureViewImplementation.this.getOutputMinFrameDurationlomOqCM);
                androidx.camera.core.Logger.d("TextureViewImpl", sb2.toString());
                androidx.camera.view.TextureViewImplementation.this.getOutputMinFrameDurationlomOqCM.getDeferrableSurface().close();
                return;
            }
            androidx.camera.view.TextureViewImplementation.this.getInputFormats();
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surfaceTexture, int i, int i2) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("SurfaceTexture size changed: ");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            androidx.camera.core.Logger.d("TextureViewImpl", sb.toString());
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(final android.graphics.SurfaceTexture surfaceTexture) {
            androidx.camera.view.TextureViewImplementation.this.getOutputStallDuration = null;
            if (androidx.camera.view.TextureViewImplementation.this.getOutputSizes != null) {
                androidx.camera.core.impl.utils.futures.Futures.addCallback(androidx.camera.view.TextureViewImplementation.this.getOutputSizes, new androidx.camera.core.impl.utils.futures.FutureCallback<androidx.camera.core.SurfaceRequest.Result>() { // from class: androidx.camera.view.TextureViewImplementation.1.1
                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public /* synthetic */ void onSuccess(androidx.camera.core.SurfaceRequest.Result result) {
                        androidx.core.util.Preconditions.checkState(result.getResultCode() != 3, "Unexpected result from SurfaceRequest. Surface was provided twice.");
                        androidx.camera.core.Logger.d("TextureViewImpl", "SurfaceTexture about to manually be destroyed");
                        surfaceTexture.release();
                        if (androidx.camera.view.TextureViewImplementation.this.getHighSpeedVideoSizes != null) {
                            androidx.camera.view.TextureViewImplementation.this.getHighSpeedVideoSizes = null;
                        }
                    }

                    @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                    public void onFailure(java.lang.Throwable th) {
                        throw new java.lang.IllegalStateException("SurfaceReleaseFuture did not complete nicely.", th);
                    }
                }, androidx.core.content.ContextCompat.getMainExecutor(androidx.camera.view.TextureViewImplementation.this.getOutputSizeshNQ4ISI.getContext()));
                androidx.camera.view.TextureViewImplementation.this.getHighSpeedVideoSizes = surfaceTexture;
                return false;
            }
            androidx.camera.core.Logger.d("TextureViewImpl", "SurfaceTexture about to be destroyed");
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(final android.graphics.SurfaceTexture surfaceTexture) {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> andSet = androidx.camera.view.TextureViewImplementation.this.getOutputFormats.getAndSet(null);
            if (andSet != null) {
                andSet.set(null);
            }
            final androidx.camera.view.PreviewView.OnFrameUpdateListener onFrameUpdateListener = androidx.camera.view.TextureViewImplementation.this.getHighSpeedVideoSizesFor;
            java.util.concurrent.Executor executor = androidx.camera.view.TextureViewImplementation.this.getInputFormats;
            if (onFrameUpdateListener == null || executor == null) {
                return;
            }
            executor.execute(new java.lang.Runnable() { // from class: androidx.camera.view.TextureViewImplementation$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.camera.view.PreviewView.OnFrameUpdateListener.this.onFrameUpdate(surfaceTexture.getTimestamp());
                }
            });
        }
    }

    final void getInputFormats() {
        android.graphics.SurfaceTexture surfaceTexture;
        if (this.getHighResolutionOutputSizeshNQ4ISI == null || (surfaceTexture = this.getOutputStallDuration) == null || this.getOutputMinFrameDurationlomOqCM == null) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), this.getHighResolutionOutputSizeshNQ4ISI.getHeight());
        final android.view.Surface surface = new android.view.Surface(this.getOutputStallDuration);
        final androidx.camera.core.SurfaceRequest surfaceRequest = this.getOutputMinFrameDurationlomOqCM;
        final com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest.Result> future = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.TextureViewImplementation$$ExternalSyntheticLambda3
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                androidx.camera.view.TextureViewImplementation textureViewImplementation = androidx.camera.view.TextureViewImplementation.this;
                android.view.Surface surface2 = surface;
                androidx.camera.core.Logger.d("TextureViewImpl", "Surface set on Preview.");
                androidx.camera.core.SurfaceRequest surfaceRequest2 = textureViewImplementation.getOutputMinFrameDurationlomOqCM;
                java.util.concurrent.Executor directExecutor = androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor();
                java.util.Objects.requireNonNull(completer);
                surfaceRequest2.provideSurface(surface2, directExecutor, new androidx.core.util.Consumer() { // from class: androidx.camera.view.TextureViewImplementation$$ExternalSyntheticLambda2
                    @Override // androidx.core.util.Consumer
                    public final void accept(java.lang.Object obj) {
                        androidx.concurrent.futures.CallbackToFutureAdapter.Completer.this.set((androidx.camera.core.SurfaceRequest.Result) obj);
                    }
                });
                java.lang.StringBuilder sb = new java.lang.StringBuilder("provideSurface[request=");
                sb.append(textureViewImplementation.getOutputMinFrameDurationlomOqCM);
                sb.append(" surface=");
                sb.append(surface2);
                sb.append("]");
                return sb.toString();
            }
        });
        this.getOutputSizes = future;
        future.addListener(new java.lang.Runnable() { // from class: androidx.camera.view.TextureViewImplementation$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.TextureViewImplementation textureViewImplementation = androidx.camera.view.TextureViewImplementation.this;
                android.view.Surface surface2 = surface;
                com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.SurfaceRequest.Result> listenableFuture = future;
                androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                androidx.camera.core.Logger.d("TextureViewImpl", "Safe to release surface.");
                androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = textureViewImplementation.getOutputMinFrameDuration;
                if (onSurfaceNotInUseListener != null) {
                    onSurfaceNotInUseListener.onSurfaceNotInUse();
                    textureViewImplementation.getOutputMinFrameDuration = null;
                }
                surface2.release();
                if (textureViewImplementation.getOutputSizes == listenableFuture) {
                    textureViewImplementation.getOutputSizes = null;
                }
                if (textureViewImplementation.getOutputMinFrameDurationlomOqCM == surfaceRequest2) {
                    textureViewImplementation.getOutputMinFrameDurationlomOqCM = null;
                }
            }
        }, androidx.core.content.ContextCompat.getMainExecutor(this.getOutputSizeshNQ4ISI.getContext()));
        getInputSizeshNQ4ISI();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOutputFormats() {
        return androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.TextureViewImplementation$$ExternalSyntheticLambda0
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                androidx.camera.view.TextureViewImplementation.this.getOutputFormats.set(completer);
                return "textureViewImpl_waitForNextFrame";
            }
        });
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI() {
        android.view.TextureView textureView = this.getOutputSizeshNQ4ISI;
        if (textureView == null || !textureView.isAvailable()) {
            return null;
        }
        return this.getOutputSizeshNQ4ISI.getBitmap();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor, androidx.camera.view.PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        this.getHighSpeedVideoSizesFor = onFrameUpdateListener;
        this.getInputFormats = executor;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void getHighSpeedVideoFpsRanges() {
        if (!this.getInputSizeshNQ4ISI || this.getHighSpeedVideoSizes == null) {
            return;
        }
        android.graphics.SurfaceTexture surfaceTexture = this.getOutputSizeshNQ4ISI.getSurfaceTexture();
        android.graphics.SurfaceTexture surfaceTexture2 = this.getHighSpeedVideoSizes;
        if (surfaceTexture != surfaceTexture2) {
            this.getOutputSizeshNQ4ISI.setSurfaceTexture(surfaceTexture2);
            this.getHighSpeedVideoSizes = null;
            this.getInputSizeshNQ4ISI = false;
        }
    }
}
