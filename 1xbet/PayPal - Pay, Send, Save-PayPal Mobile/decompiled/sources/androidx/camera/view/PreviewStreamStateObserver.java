package androidx.camera.view;

/* loaded from: classes6.dex */
final class PreviewStreamStateObserver implements androidx.camera.core.impl.Observable.Observer<androidx.camera.core.impl.CameraInternal.State> {
    private androidx.camera.view.PreviewView.StreamState Camera2StreamConfigurationMap;
    private boolean getHighResolutionOutputSizeshNQ4ISI = false;
    com.google.common.util.concurrent.ListenableFuture<java.lang.Void> getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.CameraInfoInternal getHighSpeedVideoFpsRangesFor;
    final androidx.camera.view.PreviewViewImplementation getHighSpeedVideoSizes;
    private final androidx.view.MutableLiveData<androidx.camera.view.PreviewView.StreamState> getHighSpeedVideoSizesFor;

    @Override // androidx.camera.core.impl.Observable.Observer
    public final /* synthetic */ void onNewData(androidx.camera.core.impl.CameraInternal.State state) {
        androidx.camera.core.impl.CameraInternal.State state2 = state;
        if (state2 == androidx.camera.core.impl.CameraInternal.State.CLOSING || state2 == androidx.camera.core.impl.CameraInternal.State.CLOSED || state2 == androidx.camera.core.impl.CameraInternal.State.RELEASING || state2 == androidx.camera.core.impl.CameraInternal.State.RELEASED) {
            Camera2StreamConfigurationMap(androidx.camera.view.PreviewView.StreamState.IDLE);
            if (this.getHighResolutionOutputSizeshNQ4ISI) {
                this.getHighResolutionOutputSizeshNQ4ISI = false;
                com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.getHighSpeedVideoFpsRanges;
                if (listenableFuture != null) {
                    listenableFuture.cancel(false);
                    this.getHighSpeedVideoFpsRanges = null;
                    return;
                }
                return;
            }
            return;
        }
        if ((state2 == androidx.camera.core.impl.CameraInternal.State.OPENING || state2 == androidx.camera.core.impl.CameraInternal.State.OPEN || state2 == androidx.camera.core.impl.CameraInternal.State.PENDING_OPEN) && !this.getHighResolutionOutputSizeshNQ4ISI) {
            final androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal = this.getHighSpeedVideoFpsRangesFor;
            Camera2StreamConfigurationMap(androidx.camera.view.PreviewView.StreamState.IDLE);
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            androidx.camera.core.impl.utils.futures.FutureChain transform = androidx.camera.core.impl.utils.futures.FutureChain.from(androidx.concurrent.futures.CallbackToFutureAdapter.getFuture(new androidx.concurrent.futures.CallbackToFutureAdapter.Resolver() { // from class: androidx.camera.view.PreviewStreamStateObserver$$ExternalSyntheticLambda0
                @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
                public final java.lang.Object attachCompleter(final androidx.concurrent.futures.CallbackToFutureAdapter.Completer completer) {
                    final androidx.camera.view.PreviewStreamStateObserver previewStreamStateObserver = androidx.camera.view.PreviewStreamStateObserver.this;
                    final androidx.camera.core.CameraInfo cameraInfo = cameraInfoInternal;
                    java.util.List list = arrayList;
                    androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback = new androidx.camera.core.impl.CameraCaptureCallback() { // from class: androidx.camera.view.PreviewStreamStateObserver.2
                        @Override // androidx.camera.core.impl.CameraCaptureCallback
                        public void onCaptureCompleted(int i, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
                            completer.set(null);
                            ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).removeSessionCaptureCallback(this);
                        }
                    };
                    list.add(cameraCaptureCallback);
                    ((androidx.camera.core.impl.CameraInfoInternal) cameraInfo).addSessionCaptureCallback(androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor(), cameraCaptureCallback);
                    return "waitForCaptureResult";
                }
            })).transformAsync(new androidx.camera.core.impl.utils.futures.AsyncFunction() { // from class: androidx.camera.view.PreviewStreamStateObserver$$ExternalSyntheticLambda1
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final com.google.common.util.concurrent.ListenableFuture apply(java.lang.Object obj) {
                    return androidx.camera.view.PreviewStreamStateObserver.this.getHighSpeedVideoSizes.getOutputFormats();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor()).transform(new androidx.arch.core.util.Function() { // from class: androidx.camera.view.PreviewStreamStateObserver$$ExternalSyntheticLambda2
                @Override // androidx.arch.core.util.Function
                public final java.lang.Object apply(java.lang.Object obj) {
                    return androidx.camera.view.PreviewStreamStateObserver.this.Camera2StreamConfigurationMap();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            this.getHighSpeedVideoFpsRanges = transform;
            androidx.camera.core.impl.utils.futures.Futures.addCallback(transform, new androidx.camera.core.impl.utils.futures.FutureCallback<java.lang.Void>() { // from class: androidx.camera.view.PreviewStreamStateObserver.1
                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public /* bridge */ /* synthetic */ void onSuccess(java.lang.Void r2) {
                    androidx.camera.view.PreviewStreamStateObserver.this.getHighSpeedVideoFpsRanges = null;
                }

                @Override // androidx.camera.core.impl.utils.futures.FutureCallback
                public void onFailure(java.lang.Throwable th) {
                    androidx.camera.view.PreviewStreamStateObserver.this.getHighSpeedVideoFpsRanges = null;
                    if (arrayList.isEmpty()) {
                        return;
                    }
                    java.util.Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((androidx.camera.core.impl.CameraInfoInternal) cameraInfoInternal).removeSessionCaptureCallback((androidx.camera.core.impl.CameraCaptureCallback) it.next());
                    }
                    arrayList.clear();
                }
            }, androidx.camera.core.impl.utils.executor.CameraXExecutors.directExecutor());
            this.getHighResolutionOutputSizeshNQ4ISI = true;
        }
    }

    PreviewStreamStateObserver(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal, androidx.view.MutableLiveData<androidx.camera.view.PreviewView.StreamState> mutableLiveData, androidx.camera.view.PreviewViewImplementation previewViewImplementation) {
        this.getHighSpeedVideoFpsRangesFor = cameraInfoInternal;
        this.getHighSpeedVideoSizesFor = mutableLiveData;
        this.getHighSpeedVideoSizes = previewViewImplementation;
        synchronized (this) {
            this.Camera2StreamConfigurationMap = mutableLiveData.getValue();
        }
    }

    final /* synthetic */ java.lang.Void Camera2StreamConfigurationMap() {
        Camera2StreamConfigurationMap(androidx.camera.view.PreviewView.StreamState.STREAMING);
        return null;
    }

    final void Camera2StreamConfigurationMap(androidx.camera.view.PreviewView.StreamState streamState) {
        synchronized (this) {
            if (this.Camera2StreamConfigurationMap.equals(streamState)) {
                return;
            }
            this.Camera2StreamConfigurationMap = streamState;
            androidx.camera.core.Logger.d("StreamStateObserver", "Update Preview stream state to ".concat(java.lang.String.valueOf(streamState)));
            this.getHighSpeedVideoSizesFor.postValue(streamState);
        }
    }

    @Override // androidx.camera.core.impl.Observable.Observer
    public final void onError(java.lang.Throwable th) {
        com.google.common.util.concurrent.ListenableFuture<java.lang.Void> listenableFuture = this.getHighSpeedVideoFpsRanges;
        if (listenableFuture != null) {
            listenableFuture.cancel(false);
            this.getHighSpeedVideoFpsRanges = null;
        }
        Camera2StreamConfigurationMap(androidx.camera.view.PreviewView.StreamState.IDLE);
    }
}
