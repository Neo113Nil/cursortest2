package androidx.camera.core.imagecapture;

/* loaded from: classes6.dex */
public class TakePictureManagerImpl implements androidx.camera.core.imagecapture.TakePictureManager, androidx.camera.core.ForwardingImageProxy.OnImageCloseListener, androidx.camera.core.imagecapture.TakePictureRequest.RetryControl {
    final java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> Camera2StreamConfigurationMap;
    final androidx.camera.core.imagecapture.ImageCaptureControl getHighResolutionOutputSizeshNQ4ISI;
    androidx.camera.core.imagecapture.ImagePipeline getHighSpeedVideoFpsRanges;
    androidx.camera.core.imagecapture.RequestWithCallback getHighSpeedVideoSizes;
    final java.util.Deque<androidx.camera.core.imagecapture.TakePictureRequest> getHighSpeedVideoFpsRangesFor = new java.util.ArrayDeque();
    boolean getOutputMinFrameDuration = false;

    public TakePictureManagerImpl(androidx.camera.core.imagecapture.ImageCaptureControl imageCaptureControl) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighResolutionOutputSizeshNQ4ISI = imageCaptureControl;
        this.Camera2StreamConfigurationMap = new java.util.ArrayList();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public void setImagePipeline(androidx.camera.core.imagecapture.ImagePipeline imagePipeline) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighSpeedVideoFpsRanges = imagePipeline;
        imagePipeline.setOnImageCloseListener(this);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public void offerRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighSpeedVideoFpsRangesFor.offer(takePictureRequest);
        Camera2StreamConfigurationMap();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureRequest.RetryControl
    public void retryRequest(androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.Logger.d("TakePictureManagerImpl", "Add a new request for retrying.");
        this.getHighSpeedVideoFpsRangesFor.addFirst(takePictureRequest);
        Camera2StreamConfigurationMap();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public void pause() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getOutputMinFrameDuration = true;
        androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback = this.getHighSpeedVideoSizes;
        if (requestWithCallback != null) {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            if (requestWithCallback.getHighSpeedVideoFpsRanges.isDone()) {
                return;
            }
            requestWithCallback.Camera2StreamConfigurationMap(new androidx.camera.core.ImageCaptureException(3, "The request is aborted silently and retried.", null));
            requestWithCallback.getHighResolutionOutputSizeshNQ4ISI.retryRequest(requestWithCallback.getHighSpeedVideoSizesFor);
        }
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public void resume() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getOutputMinFrameDuration = false;
        Camera2StreamConfigurationMap();
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public void abortRequests() {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.camera.core.ImageCaptureException imageCaptureException = new androidx.camera.core.ImageCaptureException(3, "Camera is closed.", null);
        for (androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest : this.getHighSpeedVideoFpsRangesFor) {
            takePictureRequest.getHighSpeedVideoFpsRangesFor().execute(new androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda4(takePictureRequest, imageCaptureException));
        }
        this.getHighSpeedVideoFpsRangesFor.clear();
        for (androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback : new java.util.ArrayList(this.Camera2StreamConfigurationMap)) {
            androidx.camera.core.impl.utils.Threads.checkMainThread();
            if (!requestWithCallback.getHighSpeedVideoFpsRanges.isDone()) {
                requestWithCallback.Camera2StreamConfigurationMap(imageCaptureException);
                androidx.camera.core.impl.utils.Threads.checkMainThread();
                androidx.camera.core.imagecapture.TakePictureRequest takePictureRequest2 = requestWithCallback.getHighSpeedVideoSizesFor;
                takePictureRequest2.getHighSpeedVideoFpsRangesFor().execute(new androidx.camera.core.imagecapture.TakePictureRequest$$ExternalSyntheticLambda4(takePictureRequest2, imageCaptureException));
            }
        }
    }

    final void Camera2StreamConfigurationMap() {
        androidx.camera.core.imagecapture.TakePictureRequest poll;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        if (hasCapturingRequest() || this.getOutputMinFrameDuration || this.getHighSpeedVideoFpsRanges.getCapacity() == 0 || (poll = this.getHighSpeedVideoFpsRangesFor.poll()) == null) {
            return;
        }
        final androidx.camera.core.imagecapture.RequestWithCallback requestWithCallback = new androidx.camera.core.imagecapture.RequestWithCallback(poll, this);
        androidx.core.util.Preconditions.checkState(!hasCapturingRequest());
        this.getHighSpeedVideoSizes = requestWithCallback;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        requestWithCallback.Camera2StreamConfigurationMap.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManagerImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureManagerImpl takePictureManagerImpl = androidx.camera.core.imagecapture.TakePictureManagerImpl.this;
                takePictureManagerImpl.getHighSpeedVideoSizes = null;
                takePictureManagerImpl.Camera2StreamConfigurationMap();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        this.Camera2StreamConfigurationMap.add(requestWithCallback);
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        requestWithCallback.getHighSpeedVideoFpsRanges.addListener(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManagerImpl$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureManagerImpl takePictureManagerImpl = androidx.camera.core.imagecapture.TakePictureManagerImpl.this;
                takePictureManagerImpl.Camera2StreamConfigurationMap.remove(requestWithCallback);
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
        androidx.camera.core.imagecapture.ImagePipeline imagePipeline = this.getHighSpeedVideoFpsRanges;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        androidx.core.util.Pair<androidx.camera.core.imagecapture.CameraRequest, androidx.camera.core.imagecapture.ProcessingRequest> createRequests = imagePipeline.createRequests(poll, requestWithCallback, requestWithCallback.Camera2StreamConfigurationMap);
        final androidx.camera.core.imagecapture.CameraRequest cameraRequest = (androidx.camera.core.imagecapture.CameraRequest) java.util.Objects.requireNonNull(createRequests.first);
        androidx.camera.core.imagecapture.ProcessingRequest processingRequest = (androidx.camera.core.imagecapture.ProcessingRequest) java.util.Objects.requireNonNull(createRequests.second);
        androidx.camera.core.imagecapture.ImagePipeline imagePipeline2 = this.getHighSpeedVideoFpsRanges;
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        imagePipeline2.Camera2StreamConfigurationMap.getInputSizeshNQ4ISI().accept(processingRequest);
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighResolutionOutputSizeshNQ4ISI.lockFlashMode();
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> submitStillCaptureRequests = this.getHighResolutionOutputSizeshNQ4ISI.submitStillCaptureRequests(cameraRequest.getHighResolutionOutputSizeshNQ4ISI);
        androidx.camera.core.impl.utils.futures.Futures.addCallback(submitStillCaptureRequests, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.core.imagecapture.TakePictureManagerImpl.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public /* synthetic */ void onSuccess(java.lang.Void r1) {
                androidx.camera.core.imagecapture.TakePictureManagerImpl.this.getHighResolutionOutputSizeshNQ4ISI.unlockFlashMode();
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public void onFailure(java.lang.Throwable th) {
                if (cameraRequest.getHighSpeedVideoFpsRanges.isAborted()) {
                    return;
                }
                int id = cameraRequest.getHighResolutionOutputSizeshNQ4ISI.get(0).getId();
                if (th instanceof androidx.camera.core.ImageCaptureException) {
                    androidx.camera.core.imagecapture.ImagePipeline imagePipeline3 = androidx.camera.core.imagecapture.TakePictureManagerImpl.this.getHighSpeedVideoFpsRanges;
                    androidx.camera.core.imagecapture.TakePictureManager.CaptureError highSpeedVideoFpsRanges = androidx.camera.core.imagecapture.TakePictureManager.CaptureError.getHighSpeedVideoFpsRanges(id, (androidx.camera.core.ImageCaptureException) th);
                    androidx.camera.core.impl.utils.Threads.checkMainThread();
                    imagePipeline3.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor().accept(highSpeedVideoFpsRanges);
                } else {
                    androidx.camera.core.imagecapture.ImagePipeline imagePipeline4 = androidx.camera.core.imagecapture.TakePictureManagerImpl.this.getHighSpeedVideoFpsRanges;
                    androidx.camera.core.imagecapture.TakePictureManager.CaptureError highSpeedVideoFpsRanges2 = androidx.camera.core.imagecapture.TakePictureManager.CaptureError.getHighSpeedVideoFpsRanges(id, new androidx.camera.core.ImageCaptureException(2, "Failed to submit capture request", th));
                    androidx.camera.core.impl.utils.Threads.checkMainThread();
                    imagePipeline4.Camera2StreamConfigurationMap.getHighSpeedVideoFpsRangesFor().accept(highSpeedVideoFpsRanges2);
                }
                androidx.camera.core.imagecapture.TakePictureManagerImpl.this.getHighResolutionOutputSizeshNQ4ISI.unlockFlashMode();
            }
        }, androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor());
        requestWithCallback.setCaptureRequestFuture(submitStillCaptureRequests);
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public boolean hasCapturingRequest() {
        return this.getHighSpeedVideoSizes != null;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public androidx.camera.core.imagecapture.RequestWithCallback getCapturingRequest() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public java.util.List<androidx.camera.core.imagecapture.RequestWithCallback> getIncompleteRequests() {
        return this.Camera2StreamConfigurationMap;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager
    public androidx.camera.core.imagecapture.ImagePipeline getImagePipeline() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.ForwardingImageProxy.OnImageCloseListener
    public void onImageClose(androidx.camera.core.ImageProxy imageProxy) {
        androidx.camera.core.impl.utils.executor.CameraXExecutors.mainThreadExecutor().execute(new java.lang.Runnable() { // from class: androidx.camera.core.imagecapture.TakePictureManagerImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                androidx.camera.core.imagecapture.TakePictureManagerImpl.this.Camera2StreamConfigurationMap();
            }
        });
    }
}
