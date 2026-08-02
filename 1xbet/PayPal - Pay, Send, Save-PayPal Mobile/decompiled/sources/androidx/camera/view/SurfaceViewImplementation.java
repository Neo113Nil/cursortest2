package androidx.camera.view;

/* loaded from: classes6.dex */
final class SurfaceViewImplementation extends androidx.camera.view.PreviewViewImplementation {
    final androidx.camera.view.SurfaceViewImplementation.SurfaceRequestCallback getHighSpeedVideoSizes;
    android.view.SurfaceView getInputSizeshNQ4ISI;

    @Override // androidx.camera.view.PreviewViewImplementation
    final void getHighSpeedVideoFpsRanges() {
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void getHighSpeedVideoSizes() {
    }

    SurfaceViewImplementation(android.widget.FrameLayout frameLayout, androidx.camera.view.PreviewTransformation previewTransformation) {
        super(frameLayout, previewTransformation);
        this.getHighSpeedVideoSizes = new androidx.camera.view.SurfaceViewImplementation.SurfaceRequestCallback();
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void Camera2StreamConfigurationMap(final androidx.camera.core.SurfaceRequest surfaceRequest, final androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
        android.view.SurfaceView surfaceView = this.getInputSizeshNQ4ISI;
        boolean equals = java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, surfaceRequest.getResolution());
        if (surfaceView == null || !equals) {
            this.getHighResolutionOutputSizeshNQ4ISI = surfaceRequest.getResolution();
            Camera2StreamConfigurationMap();
        }
        java.util.concurrent.Executor mainExecutor = androidx.core.content.ContextCompat.getMainExecutor(this.getInputSizeshNQ4ISI.getContext());
        java.util.Objects.requireNonNull(onSurfaceNotInUseListener);
        surfaceRequest.addRequestCancellationListener(mainExecutor, new java.lang.Runnable() { // from class: androidx.camera.view.SurfaceViewImplementation$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener.this.onSurfaceNotInUse();
            }
        });
        this.getInputSizeshNQ4ISI.post(new java.lang.Runnable() { // from class: androidx.camera.view.SurfaceViewImplementation$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.view.SurfaceViewImplementation surfaceViewImplementation = androidx.camera.view.SurfaceViewImplementation.this;
                androidx.camera.core.SurfaceRequest surfaceRequest2 = surfaceRequest;
                androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener2 = onSurfaceNotInUseListener;
                androidx.camera.view.SurfaceViewImplementation.SurfaceRequestCallback surfaceRequestCallback = surfaceViewImplementation.getHighSpeedVideoSizes;
                surfaceRequestCallback.getHighSpeedVideoSizes();
                if (surfaceRequestCallback.getHighSpeedVideoSizes) {
                    surfaceRequestCallback.getHighSpeedVideoSizes = false;
                    surfaceRequest2.invalidate();
                    return;
                }
                surfaceRequestCallback.getHighSpeedVideoFpsRangesFor = surfaceRequest2;
                surfaceRequestCallback.getHighSpeedVideoFpsRanges = onSurfaceNotInUseListener2;
                android.util.Size resolution = surfaceRequest2.getResolution();
                surfaceRequestCallback.getHighResolutionOutputSizeshNQ4ISI = resolution;
                surfaceRequestCallback.Camera2StreamConfigurationMap = false;
                if (surfaceRequestCallback.getHighSpeedVideoFpsRangesFor()) {
                    return;
                }
                androidx.camera.core.Logger.d("SurfaceViewImpl", "Wait for new Surface creation.");
                androidx.camera.view.SurfaceViewImplementation.this.getInputSizeshNQ4ISI.getHolder().setFixedSize(resolution.getWidth(), resolution.getHeight());
            }
        });
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void Camera2StreamConfigurationMap() {
        androidx.core.util.Preconditions.checkNotNull(this.getHighSpeedVideoFpsRanges);
        androidx.core.util.Preconditions.checkNotNull(this.getHighResolutionOutputSizeshNQ4ISI);
        android.view.SurfaceView surfaceView = new android.view.SurfaceView(this.getHighSpeedVideoFpsRanges.getContext());
        this.getInputSizeshNQ4ISI = surfaceView;
        surfaceView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(this.getHighResolutionOutputSizeshNQ4ISI.getWidth(), this.getHighResolutionOutputSizeshNQ4ISI.getHeight()));
        this.getHighSpeedVideoFpsRanges.removeAllViews();
        this.getHighSpeedVideoFpsRanges.addView(this.getInputSizeshNQ4ISI);
        this.getInputSizeshNQ4ISI.getHolder().addCallback(this.getHighSpeedVideoSizes);
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final android.view.View getHighSpeedVideoFpsRangesFor() {
        return this.getInputSizeshNQ4ISI;
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final android.graphics.Bitmap getHighResolutionOutputSizeshNQ4ISI() {
        android.view.SurfaceView surfaceView = this.getInputSizeshNQ4ISI;
        if (surfaceView == null || surfaceView.getHolder().getSurface() == null || !this.getInputSizeshNQ4ISI.getHolder().getSurface().isValid()) {
            return null;
        }
        final java.util.concurrent.Semaphore semaphore = new java.util.concurrent.Semaphore(0);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(this.getInputSizeshNQ4ISI.getWidth(), this.getInputSizeshNQ4ISI.getHeight(), android.graphics.Bitmap.Config.ARGB_8888);
        android.os.HandlerThread handlerThread = new android.os.HandlerThread("pixelCopyRequest Thread");
        handlerThread.start();
        androidx.camera.view.SurfaceViewImplementation.Api24Impl.Camera2StreamConfigurationMap(this.getInputSizeshNQ4ISI, createBitmap, new android.view.PixelCopy.OnPixelCopyFinishedListener() { // from class: androidx.camera.view.SurfaceViewImplementation$$ExternalSyntheticLambda2
            @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
            public final void onPixelCopyFinished(int i) {
                androidx.camera.view.SurfaceViewImplementation.getHighSpeedVideoFpsRangesFor(semaphore, i);
            }
        }, new android.os.Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(1, 100L, java.util.concurrent.TimeUnit.MILLISECONDS)) {
                androidx.camera.core.Logger.e("SurfaceViewImpl", "Timed out while trying to acquire screenshot.");
            }
            return createBitmap;
        } catch (java.lang.InterruptedException e) {
            androidx.camera.core.Logger.e("SurfaceViewImpl", "Interrupted while trying to acquire screenshot.", e);
            return createBitmap;
        } finally {
            handlerThread.quitSafely();
        }
    }

    static /* synthetic */ void getHighSpeedVideoFpsRangesFor(java.util.concurrent.Semaphore semaphore, int i) {
        if (i == 0) {
            androidx.camera.core.Logger.d("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() succeeded");
        } else {
            androidx.camera.core.Logger.e("SurfaceViewImpl", "PreviewView.SurfaceViewImplementation.getBitmap() failed with error ".concat(java.lang.String.valueOf(i)));
        }
        semaphore.release();
    }

    class SurfaceRequestCallback implements android.view.SurfaceHolder.Callback {
        android.util.Size getHighResolutionOutputSizeshNQ4ISI;
        androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener getHighSpeedVideoFpsRanges;
        androidx.camera.core.SurfaceRequest getHighSpeedVideoFpsRangesFor;
        private androidx.camera.core.SurfaceRequest getHighSpeedVideoSizesFor;
        private android.util.Size getOutputFormats;
        boolean Camera2StreamConfigurationMap = false;
        boolean getHighSpeedVideoSizes = false;

        SurfaceRequestCallback() {
        }

        final boolean getHighSpeedVideoFpsRangesFor() {
            android.view.Surface surface = androidx.camera.view.SurfaceViewImplementation.this.getInputSizeshNQ4ISI.getHolder().getSurface();
            if (this.Camera2StreamConfigurationMap || this.getHighSpeedVideoFpsRangesFor == null || !java.util.Objects.equals(this.getHighResolutionOutputSizeshNQ4ISI, this.getOutputFormats)) {
                return false;
            }
            androidx.camera.core.Logger.d("SurfaceViewImpl", "Surface set on Preview.");
            final androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener = this.getHighSpeedVideoFpsRanges;
            ((androidx.camera.core.SurfaceRequest) java.util.Objects.requireNonNull(this.getHighSpeedVideoFpsRangesFor)).provideSurface(surface, androidx.core.content.ContextCompat.getMainExecutor(androidx.camera.view.SurfaceViewImplementation.this.getInputSizeshNQ4ISI.getContext()), new androidx.core.util.Consumer() { // from class: androidx.camera.view.SurfaceViewImplementation$SurfaceRequestCallback$$ExternalSyntheticLambda0
                @Override // androidx.core.util.Consumer
                public final void accept(java.lang.Object obj) {
                    androidx.camera.view.SurfaceViewImplementation.SurfaceRequestCallback.getHighSpeedVideoFpsRanges(androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener.this);
                }
            });
            this.Camera2StreamConfigurationMap = true;
            androidx.camera.view.SurfaceViewImplementation surfaceViewImplementation = androidx.camera.view.SurfaceViewImplementation.this;
            surfaceViewImplementation.Camera2StreamConfigurationMap = true;
            surfaceViewImplementation.getHighSpeedVideoSizesFor();
            return true;
        }

        static /* synthetic */ void getHighSpeedVideoFpsRanges(androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener) {
            androidx.camera.core.Logger.d("SurfaceViewImpl", "Safe to release surface.");
            if (onSurfaceNotInUseListener != null) {
                onSurfaceNotInUseListener.onSurfaceNotInUse();
            }
        }

        final void getHighSpeedVideoSizes() {
            androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener onSurfaceNotInUseListener;
            if (this.getHighSpeedVideoFpsRangesFor != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Request canceled: ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                androidx.camera.core.Logger.d("SurfaceViewImpl", sb.toString());
                if (!this.getHighSpeedVideoFpsRangesFor.willNotProvideSurface() || (onSurfaceNotInUseListener = this.getHighSpeedVideoFpsRanges) == null) {
                    return;
                }
                onSurfaceNotInUseListener.onSurfaceNotInUse();
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(android.view.SurfaceHolder surfaceHolder) {
            androidx.camera.core.SurfaceRequest surfaceRequest;
            androidx.camera.core.Logger.d("SurfaceViewImpl", "Surface created.");
            if (!this.getHighSpeedVideoSizes || (surfaceRequest = this.getHighSpeedVideoSizesFor) == null) {
                return;
            }
            surfaceRequest.invalidate();
            this.getHighSpeedVideoSizesFor = null;
            this.getHighSpeedVideoSizes = false;
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(android.view.SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Surface changed. Size: ");
            sb.append(i2);
            sb.append("x");
            sb.append(i3);
            androidx.camera.core.Logger.d("SurfaceViewImpl", sb.toString());
            this.getOutputFormats = new android.util.Size(i2, i3);
            getHighSpeedVideoFpsRangesFor();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(android.view.SurfaceHolder surfaceHolder) {
            androidx.camera.core.Logger.d("SurfaceViewImpl", "Surface destroyed.");
            if (!this.Camera2StreamConfigurationMap) {
                getHighSpeedVideoSizes();
            } else if (this.getHighSpeedVideoFpsRangesFor != null) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Surface closed ");
                sb.append(this.getHighSpeedVideoFpsRangesFor);
                androidx.camera.core.Logger.d("SurfaceViewImpl", sb.toString());
                this.getHighSpeedVideoFpsRangesFor.getDeferrableSurface().close();
            }
            this.getHighSpeedVideoSizes = true;
            androidx.camera.core.SurfaceRequest surfaceRequest = this.getHighSpeedVideoFpsRangesFor;
            if (surfaceRequest != null) {
                this.getHighSpeedVideoSizesFor = surfaceRequest;
            }
            this.Camera2StreamConfigurationMap = false;
            this.getHighSpeedVideoFpsRangesFor = null;
            this.getHighSpeedVideoFpsRanges = null;
            this.getOutputFormats = null;
            this.getHighResolutionOutputSizeshNQ4ISI = null;
        }
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getOutputFormats() {
        return androidx.camera.core.impl.utils.futures.Futures.immediateFuture(null);
    }

    @Override // androidx.camera.view.PreviewViewImplementation
    final void getHighResolutionOutputSizeshNQ4ISI(java.util.concurrent.Executor executor, androidx.camera.view.PreviewView.OnFrameUpdateListener onFrameUpdateListener) {
        throw new java.lang.IllegalArgumentException("SurfaceView doesn't support frame update listener");
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void Camera2StreamConfigurationMap(android.view.SurfaceView surfaceView, android.graphics.Bitmap bitmap, android.view.PixelCopy.OnPixelCopyFinishedListener onPixelCopyFinishedListener, android.os.Handler handler) {
            android.view.PixelCopy.request(surfaceView, bitmap, onPixelCopyFinishedListener, handler);
        }
    }
}
