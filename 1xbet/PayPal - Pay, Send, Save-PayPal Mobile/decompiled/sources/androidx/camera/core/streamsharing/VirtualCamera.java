package androidx.camera.core.streamsharing;

/* loaded from: classes6.dex */
class VirtualCamera implements androidx.camera.core.impl.CameraInternal {
    private final androidx.camera.core.UseCase.StateChangeCallback getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.core.impl.CameraInternal getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.streamsharing.VirtualCameraControl getHighSpeedVideoFpsRangesFor;
    final androidx.camera.core.streamsharing.VirtualCameraInfo getHighSpeedVideoSizes;

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return false;
    }

    VirtualCamera(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.UseCase.StateChangeCallback stateChangeCallback, androidx.camera.core.streamsharing.StreamSharing.Control control) {
        this.getHighSpeedVideoFpsRanges = cameraInternal;
        this.getHighResolutionOutputSizeshNQ4ISI = stateChangeCallback;
        this.getHighSpeedVideoFpsRangesFor = new androidx.camera.core.streamsharing.VirtualCameraControl(cameraInternal.getGetHighSpeedVideoFpsRangesFor(), control);
        this.getHighSpeedVideoSizes = new androidx.camera.core.streamsharing.VirtualCameraInfo(cameraInternal.getCamera2StreamConfigurationMap());
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighResolutionOutputSizeshNQ4ISI.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighResolutionOutputSizeshNQ4ISI.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighResolutionOutputSizeshNQ4ISI.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        androidx.camera.core.impl.utils.Threads.checkMainThread();
        this.getHighResolutionOutputSizeshNQ4ISI.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    /* renamed from: getCameraControlInternal */
    public androidx.camera.core.impl.CameraControlInternal getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    /* renamed from: getCameraInfoInternal */
    public androidx.camera.core.impl.CameraInfoInternal getCamera2StreamConfigurationMap() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
        return this.getHighSpeedVideoFpsRanges.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        throw new java.lang.UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        throw new java.lang.UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
        throw new java.lang.UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        throw new java.lang.UnsupportedOperationException("Operation not supported by VirtualCamera.");
    }
}
