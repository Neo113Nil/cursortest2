package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class AdapterCameraInternal implements androidx.camera.core.impl.CameraInternal {
    private final androidx.camera.core.impl.CameraInternal getHighSpeedVideoFpsRanges;
    private final androidx.camera.core.impl.AdapterCameraInfo getHighSpeedVideoFpsRangesFor;
    private final androidx.camera.core.impl.AdapterCameraControl getHighSpeedVideoSizes;

    public AdapterCameraInternal(androidx.camera.core.impl.CameraInternal cameraInternal, androidx.camera.core.impl.AdapterCameraInfo adapterCameraInfo) {
        this.getHighSpeedVideoFpsRanges = cameraInternal;
        this.getHighSpeedVideoFpsRangesFor = adapterCameraInfo;
        this.getHighSpeedVideoSizes = new androidx.camera.core.impl.AdapterCameraControl(cameraInternal.getGetHighSpeedVideoFpsRangesFor(), adapterCameraInfo.getCameraConfig().getSessionProcessor(null));
    }

    public androidx.camera.core.impl.CameraInternal getImplementation() {
        return this.getHighSpeedVideoFpsRanges;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void open() {
        this.getHighSpeedVideoFpsRanges.open();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setActiveResumingMode(boolean z) {
        this.getHighSpeedVideoFpsRanges.setActiveResumingMode(z);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean isFrontFacing() {
        return this.getHighSpeedVideoFpsRanges.isFrontFacing();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> release() {
        return this.getHighSpeedVideoFpsRanges.release();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public androidx.camera.core.impl.Observable<androidx.camera.core.impl.CameraInternal.State> getCameraState() {
        return this.getHighSpeedVideoFpsRanges.getCameraState();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void attachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        this.getHighSpeedVideoFpsRanges.attachUseCases(collection);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void detachUseCases(java.util.Collection<androidx.camera.core.UseCase> collection) {
        this.getHighSpeedVideoFpsRanges.detachUseCases(collection);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    /* renamed from: getCameraControlInternal */
    public androidx.camera.core.impl.CameraControlInternal getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    /* renamed from: getCameraInfoInternal */
    public androidx.camera.core.impl.CameraInfoInternal getCamera2StreamConfigurationMap() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public androidx.camera.core.CameraControl getCameraControl() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    public androidx.camera.core.CameraInfo getCameraInfo() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean getHasTransform() {
        return this.getHighSpeedVideoFpsRanges.getHasTransform();
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setPrimary(boolean z) {
        this.getHighSpeedVideoFpsRanges.setPrimary(z);
    }

    @Override // androidx.camera.core.impl.CameraInternal, androidx.camera.core.Camera
    /* renamed from: getExtendedConfig */
    public androidx.camera.core.impl.CameraConfig getGetOutputFormats() {
        return this.getHighSpeedVideoFpsRanges.getGetOutputFormats();
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(androidx.camera.core.UseCase... useCaseArr) {
        return this.getHighSpeedVideoFpsRanges.isUseCasesCombinationSupported(useCaseArr);
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupportedByFramework(androidx.camera.core.UseCase... useCaseArr) {
        return this.getHighSpeedVideoFpsRanges.isUseCasesCombinationSupportedByFramework(useCaseArr);
    }

    @Override // androidx.camera.core.Camera
    public boolean isUseCasesCombinationSupported(boolean z, androidx.camera.core.UseCase... useCaseArr) {
        return this.getHighSpeedVideoFpsRanges.isUseCasesCombinationSupported(z, useCaseArr);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void setExtendedConfig(androidx.camera.core.impl.CameraConfig cameraConfig) {
        this.getHighSpeedVideoFpsRanges.setExtendedConfig(cameraConfig);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseActive(androidx.camera.core.UseCase useCase) {
        this.getHighSpeedVideoFpsRanges.onUseCaseActive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseInactive(androidx.camera.core.UseCase useCase) {
        this.getHighSpeedVideoFpsRanges.onUseCaseInactive(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseUpdated(androidx.camera.core.UseCase useCase) {
        this.getHighSpeedVideoFpsRanges.onUseCaseUpdated(useCase);
    }

    @Override // androidx.camera.core.UseCase.StateChangeCallback
    public void onUseCaseReset(androidx.camera.core.UseCase useCase) {
        this.getHighSpeedVideoFpsRanges.onUseCaseReset(useCase);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public boolean isRemoved() {
        return this.getHighSpeedVideoFpsRanges.isRemoved();
    }
}
