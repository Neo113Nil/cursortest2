package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class ForwardingCameraInfo implements androidx.camera.core.impl.CameraInfoInternal {
    private final androidx.camera.core.impl.CameraInfoInternal Camera2StreamConfigurationMap;

    public ForwardingCameraInfo(androidx.camera.core.impl.CameraInfoInternal cameraInfoInternal) {
        this.Camera2StreamConfigurationMap = cameraInfoInternal;
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees() {
        return this.Camera2StreamConfigurationMap.getSensorRotationDegrees();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getSensorRotationDegrees(int i) {
        return this.Camera2StreamConfigurationMap.getSensorRotationDegrees(i);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean hasFlashUnit() {
        return this.Camera2StreamConfigurationMap.hasFlashUnit();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.view.LiveData<java.lang.Integer> getTorchState() {
        return this.Camera2StreamConfigurationMap.getTorchState();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.view.LiveData<java.lang.Integer> getTorchStrengthLevel() {
        return this.Camera2StreamConfigurationMap.getTorchStrengthLevel();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getMaxTorchStrengthLevel() {
        return this.Camera2StreamConfigurationMap.getMaxTorchStrengthLevel();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isTorchStrengthSupported() {
        return this.Camera2StreamConfigurationMap.isTorchStrengthSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLowLightBoostSupported() {
        return this.Camera2StreamConfigurationMap.isLowLightBoostSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.view.LiveData<java.lang.Integer> getLowLightBoostState() {
        return this.Camera2StreamConfigurationMap.getLowLightBoostState();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.view.LiveData<androidx.camera.core.ZoomState> getZoomState() {
        return this.Camera2StreamConfigurationMap.getZoomState();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.camera.core.ExposureState getExposureState() {
        return this.Camera2StreamConfigurationMap.getExposureState();
    }

    @Override // androidx.camera.core.CameraInfo
    public androidx.view.LiveData<androidx.camera.core.CameraState> getCameraState() {
        return this.Camera2StreamConfigurationMap.getCameraState();
    }

    @Override // androidx.camera.core.CameraInfo
    public void addCameraStateListener(java.util.concurrent.Executor executor, androidx.core.util.Consumer<androidx.camera.core.CameraState> consumer) {
        this.Camera2StreamConfigurationMap.addCameraStateListener(executor, consumer);
    }

    @Override // androidx.camera.core.CameraInfo
    public void removeCameraStateListener(androidx.core.util.Consumer<androidx.camera.core.CameraState> consumer) {
        this.Camera2StreamConfigurationMap.removeCameraStateListener(consumer);
    }

    @Override // androidx.camera.core.CameraInfo
    public java.lang.String getImplementationType() {
        return this.Camera2StreamConfigurationMap.getImplementationType();
    }

    @Override // androidx.camera.core.CameraInfo
    public int getLensFacing() {
        return this.Camera2StreamConfigurationMap.getLensFacing();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isExternalCamera() {
        return this.Camera2StreamConfigurationMap.isExternalCamera();
    }

    @Override // androidx.camera.core.CameraInfo
    public float getIntrinsicZoomRatio() {
        return this.Camera2StreamConfigurationMap.getIntrinsicZoomRatio();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isFocusMeteringSupported(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return this.Camera2StreamConfigurationMap.isFocusMeteringSupported(focusMeteringAction);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isZslSupported() {
        return this.Camera2StreamConfigurationMap.isZslSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges() {
        return this.Camera2StreamConfigurationMap.getSupportedFrameRateRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedFrameRateRanges(androidx.camera.core.SessionConfig sessionConfig) {
        return this.Camera2StreamConfigurationMap.getSupportedFrameRateRanges(sessionConfig);
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isPrivateReprocessingSupported() {
        return this.Camera2StreamConfigurationMap.isPrivateReprocessingSupported();
    }

    @Override // androidx.camera.core.CameraInfo
    public boolean isLogicalMultiCameraSupported() {
        return this.Camera2StreamConfigurationMap.isLogicalMultiCameraSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.lang.String getCameraId() {
        return this.Camera2StreamConfigurationMap.getCameraId();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void addSessionCaptureCallback(java.util.concurrent.Executor executor, androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        this.Camera2StreamConfigurationMap.addSessionCaptureCallback(executor, cameraCaptureCallback);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void removeSessionCaptureCallback(androidx.camera.core.impl.CameraCaptureCallback cameraCaptureCallback) {
        this.Camera2StreamConfigurationMap.removeSessionCaptureCallback(cameraCaptureCallback);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.Quirks getCameraQuirks() {
        return this.Camera2StreamConfigurationMap.getCameraQuirks();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    /* renamed from: getEncoderProfilesProvider */
    public androidx.camera.core.impl.EncoderProfilesProvider getGetInputFormats() {
        return this.Camera2StreamConfigurationMap.getGetInputFormats();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.Timebase getTimebase() {
        return this.Camera2StreamConfigurationMap.getTimebase();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<java.lang.Integer> getSupportedOutputFormats() {
        return this.Camera2StreamConfigurationMap.getSupportedOutputFormats();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.List<android.util.Size> getSupportedResolutions(int i) {
        return this.Camera2StreamConfigurationMap.getSupportedResolutions(i);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.List<android.util.Size> getSupportedHighResolutions(int i) {
        return this.Camera2StreamConfigurationMap.getSupportedHighResolutions(i);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<androidx.camera.core.DynamicRange> getSupportedDynamicRanges() {
        return this.Camera2StreamConfigurationMap.getSupportedDynamicRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isHighSpeedSupported() {
        return this.Camera2StreamConfigurationMap.isHighSpeedSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedHighSpeedFrameRateRanges() {
        return this.Camera2StreamConfigurationMap.getSupportedHighSpeedFrameRateRanges();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<android.util.Range<java.lang.Integer>> getSupportedHighSpeedFrameRateRangesFor(android.util.Size size) {
        return this.Camera2StreamConfigurationMap.getSupportedHighSpeedFrameRateRangesFor(size);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.List<android.util.Size> getSupportedHighSpeedResolutions() {
        return this.Camera2StreamConfigurationMap.getSupportedHighSpeedResolutions();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.List<android.util.Size> getSupportedHighSpeedResolutionsFor(android.util.Range<java.lang.Integer> range) {
        return this.Camera2StreamConfigurationMap.getSupportedHighSpeedResolutionsFor(range);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public android.graphics.Rect getSensorRect() {
        return this.Camera2StreamConfigurationMap.getSensorRect();
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<androidx.camera.core.DynamicRange> querySupportedDynamicRanges(java.util.Set<androidx.camera.core.DynamicRange> set) {
        return this.Camera2StreamConfigurationMap.querySupportedDynamicRanges(set);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public androidx.camera.core.impl.CameraInfoInternal getImplementation() {
        return this.Camera2StreamConfigurationMap.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal, androidx.camera.core.CameraInfo
    public androidx.camera.core.CameraSelector getCameraSelector() {
        return this.Camera2StreamConfigurationMap.getCameraSelector();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isPreviewStabilizationSupported() {
        return this.Camera2StreamConfigurationMap.isPreviewStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isVideoStabilizationSupported() {
        return this.Camera2StreamConfigurationMap.isVideoStabilizationSupported();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.lang.Object getCameraCharacteristics() {
        return this.Camera2StreamConfigurationMap.getCameraCharacteristics();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.lang.Object getPhysicalCameraCharacteristics(java.lang.String str) {
        return this.Camera2StreamConfigurationMap.getPhysicalCameraCharacteristics(str);
    }

    @Override // androidx.camera.core.CameraInfo
    public java.util.Set<androidx.camera.core.CameraInfo> getPhysicalCameraInfos() {
        return this.Camera2StreamConfigurationMap.getPhysicalCameraInfos();
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public boolean isUseCaseCombinationSupported(java.util.List<androidx.camera.core.UseCase> list, int i, boolean z, androidx.camera.core.impl.CameraConfig cameraConfig) {
        return this.Camera2StreamConfigurationMap.isUseCaseCombinationSupported(list, i, z, cameraConfig);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public void setCameraUseCaseAdapterProvider(androidx.camera.core.CameraUseCaseAdapterProvider cameraUseCaseAdapterProvider) {
        this.Camera2StreamConfigurationMap.setCameraUseCaseAdapterProvider(cameraUseCaseAdapterProvider);
    }

    @Override // androidx.camera.core.impl.CameraInfoInternal
    public java.util.Set<java.lang.Integer> getAvailableCapabilities() {
        return this.Camera2StreamConfigurationMap.getAvailableCapabilities();
    }
}
