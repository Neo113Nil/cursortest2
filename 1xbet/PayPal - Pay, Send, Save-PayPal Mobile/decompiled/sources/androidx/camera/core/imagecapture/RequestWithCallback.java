package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class RequestWithCallback implements androidx.camera.core.imagecapture.TakePictureCallback {
    final androidx.camera.core.imagecapture.TakePictureRequest.RetryControl getHighResolutionOutputSizeshNQ4ISI;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoFpsRangesFor;
    androidx.concurrent.futures.CallbackToFutureAdapter.Completer<java.lang.Void> getHighSpeedVideoSizes;
    final androidx.camera.core.imagecapture.TakePictureRequest getHighSpeedVideoSizesFor;
    private com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getInputFormats;
    private boolean getOutputFormats = false;
    private boolean getOutputMinFrameDuration = false;
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> Camera2StreamConfigurationMap = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.imagecapture.RequestWithCallback$$ExternalSyntheticLambda0
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
            androidx.camera.core.imagecapture.RequestWithCallback.this.getHighSpeedVideoFpsRangesFor = completer;
            return "CaptureCompleteFuture";
        }
    });
    final com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoFpsRanges = androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.core.imagecapture.RequestWithCallback$$ExternalSyntheticLambda1
        @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
        public final java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
            androidx.camera.core.imagecapture.RequestWithCallback.this.getHighSpeedVideoSizes = completer;
            return "RequestCompleteFuture";
        }
    });

    RequestWithCallback(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest, androidx.camera.core.imagecapture.TakePictureRequest.RetryControl retryControl) {
        this.getHighSpeedVideoSizesFor = takePictureRequest;
        this.getHighResolutionOutputSizeshNQ4ISI = retryControl;
    }

    public void setCaptureRequestFuture(com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Preconditions.checkState(this.getInputFormats == null, "CaptureRequestFuture can only be set once.");
        this.getInputFormats = listenableFuture;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureStarted() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats || this.getOutputMinFrameDuration) {
            return;
        }
        this.getOutputMinFrameDuration = true;
        androidx.camera.core.ImageCapture.OnImageCapturedCallback inMemoryCallback = this.getHighSpeedVideoSizesFor.getInMemoryCallback();
        if (inMemoryCallback != null) {
            inMemoryCallback.onCaptureStarted();
        }
        androidx.camera.core.ImageCapture.OnImageSavedCallback onDiskCallback = this.getHighSpeedVideoSizesFor.getOnDiskCallback();
        if (onDiskCallback != null) {
            onDiskCallback.onCaptureStarted();
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onImageCaptured() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            return;
        }
        if (!this.getOutputMinFrameDuration) {
            onCaptureStarted();
        }
        this.getHighSpeedVideoFpsRangesFor.set(null);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onFinalResult(final androidx.camera.core.ImageCapture.OutputFileResults outputFileResults) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            return;
        }
        androidx.core.util.Preconditions.checkState(this.Camera2StreamConfigurationMap.isDone(), "onImageCaptured() must be called before onFinalResult()");
        getHighSpeedVideoSizes();
        final androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.getHighSpeedVideoSizesFor;
        takePictureRequest.getHighSpeedVideoFpsRangesFor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                ((androidx.camera.core.ImageCapture.OnImageSavedCallback) java.util.Objects.requireNonNull(androidx.camera.core.imagecapture.TakePictureRequest.this.getOnDiskCallback())).onImageSaved((androidx.camera.core.ImageCapture.OutputFileResults) java.util.Objects.requireNonNull(outputFileResults));
            }
        });
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onFinalResult(final androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            imageProxy.close();
            return;
        }
        androidx.core.util.Preconditions.checkState(this.Camera2StreamConfigurationMap.isDone(), "onImageCaptured() must be called before onFinalResult()");
        getHighSpeedVideoSizes();
        final androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.getHighSpeedVideoSizesFor;
        takePictureRequest.getHighSpeedVideoFpsRangesFor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                ((androidx.camera.core.ImageCapture.OnImageCapturedCallback) java.util.Objects.requireNonNull(androidx.camera.core.imagecapture.TakePictureRequest.this.getInMemoryCallback())).onCaptureSuccess((androidx.camera.core.ImageProxy) java.util.Objects.requireNonNull(imageProxy));
            }
        });
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureProcessProgressed(final int i) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            return;
        }
        final androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.getHighSpeedVideoSizesFor;
        takePictureRequest.getHighSpeedVideoFpsRangesFor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest2 = androidx.camera.core.imagecapture.TakePictureRequest.this;
                int i2 = i;
                if (takePictureRequest2.getOnDiskCallback() != null) {
                    takePictureRequest2.getOnDiskCallback().onCaptureProcessProgressed(i2);
                } else if (takePictureRequest2.getInMemoryCallback() != null) {
                    takePictureRequest2.getInMemoryCallback().onCaptureProcessProgressed(i2);
                }
            }
        });
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onPostviewBitmapAvailable(final android.graphics.Bitmap bitmap) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            return;
        }
        final androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.getHighSpeedVideoSizesFor;
        takePictureRequest.getHighSpeedVideoFpsRangesFor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest2 = androidx.camera.core.imagecapture.TakePictureRequest.this;
                android.graphics.Bitmap bitmap2 = bitmap;
                if (takePictureRequest2.getOnDiskCallback() != null) {
                    takePictureRequest2.getOnDiskCallback().onPostviewBitmapAvailable(bitmap2);
                } else if (takePictureRequest2.getInMemoryCallback() != null) {
                    takePictureRequest2.getInMemoryCallback().onPostviewBitmapAvailable(bitmap2);
                }
            }
        });
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onProcessFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            return;
        }
        androidx.core.util.Preconditions.checkState(this.Camera2StreamConfigurationMap.isDone(), "onImageCaptured() must be called before onFinalResult()");
        getHighSpeedVideoSizes();
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.getHighSpeedVideoSizesFor;
        takePictureRequest.getHighSpeedVideoFpsRangesFor().execute(new androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda4(takePictureRequest, imageCaptureException));
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public boolean isAborted() {
        return this.getOutputFormats;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureCallback
    public void onCaptureFailure(androidx.camera.core.ImageCaptureException imageCaptureException) {
        boolean z;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (this.getOutputFormats) {
            return;
        }
        androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest = this.getHighSpeedVideoSizesFor;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        int i = takePictureRequest.getHighSpeedVideoSizes;
        if (i > 0) {
            z = true;
            takePictureRequest.getHighSpeedVideoSizes = i - 1;
        } else {
            z = false;
        }
        if (!z) {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest2 = this.getHighSpeedVideoSizesFor;
            takePictureRequest2.getHighSpeedVideoFpsRangesFor().execute(new androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda4(takePictureRequest2, imageCaptureException));
        }
        getHighSpeedVideoSizes();
        this.getHighSpeedVideoFpsRangesFor.setException(imageCaptureException);
        if (z) {
            this.getHighResolutionOutputSizeshNQ4ISI.retryRequest(this.getHighSpeedVideoSizesFor);
        }
    }

    final void Camera2StreamConfigurationMap(androidx.camera.core.ImageCaptureException imageCaptureException) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getOutputFormats = true;
        ((com.google.common.util.concurrent.ListenableFuture) java.util.Objects.requireNonNull(this.getInputFormats)).cancel(true);
        this.getHighSpeedVideoFpsRangesFor.setException(imageCaptureException);
        this.getHighSpeedVideoSizes.set(null);
    }

    public androidx.camera.core.imagecapture.TakePictureRequest getTakePictureRequest() {
        return this.getHighSpeedVideoSizesFor;
    }

    private void getHighSpeedVideoSizes() {
        if (!this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes() || this.getHighSpeedVideoSizesFor.getOutputMinFrameDuration()) {
            if (!this.getHighSpeedVideoSizesFor.getHighSpeedVideoSizes()) {
                androidx.core.util.Preconditions.checkState(!this.getHighSpeedVideoFpsRanges.isDone(), "The callback can only complete once.");
            }
            this.getHighSpeedVideoSizes.set(null);
        }
    }
}
