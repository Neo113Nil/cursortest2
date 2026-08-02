package androidx.camera.core.impl;

/* loaded from: classes6.dex */
public class ForwardingCameraControl implements androidx.camera.core.impl.CameraControlInternal {
    private final androidx.camera.core.impl.CameraControlInternal getHighSpeedVideoSizes;

    public ForwardingCameraControl(androidx.camera.core.impl.CameraControlInternal cameraControlInternal) {
        this.getHighSpeedVideoSizes = cameraControlInternal;
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableTorch(boolean z) {
        return this.getHighSpeedVideoSizes.enableTorch(z);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> enableLowLightBoostAsync(boolean z) {
        return this.getHighSpeedVideoSizes.enableLowLightBoostAsync(z);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.FocusMeteringResult> startFocusAndMetering(androidx.camera.core.FocusMeteringAction focusMeteringAction) {
        return this.getHighSpeedVideoSizes.startFocusAndMetering(focusMeteringAction);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> cancelFocusAndMetering() {
        return this.getHighSpeedVideoSizes.cancelFocusAndMetering();
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setZoomRatio(float f) {
        return this.getHighSpeedVideoSizes.setZoomRatio(f);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setLinearZoom(float f) {
        return this.getHighSpeedVideoSizes.setLinearZoom(f);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Integer> setExposureCompensationIndex(int i) {
        return this.getHighSpeedVideoSizes.setExposureCompensationIndex(i);
    }

    @Override // androidx.camera.core.CameraControl
    public com.google.common.util.concurrent.ListenableFuture<java.lang.Void> setTorchStrengthLevel(int i) {
        return this.getHighSpeedVideoSizes.setTorchStrengthLevel(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public int getFlashMode() {
        return this.getHighSpeedVideoSizes.getFlashMode();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setFlashMode(int i) {
        this.getHighSpeedVideoSizes.setFlashMode(i);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setScreenFlash(androidx.camera.core.ImageCapture.ScreenFlash screenFlash) {
        this.getHighSpeedVideoSizes.setScreenFlash(screenFlash);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addZslConfig(androidx.camera.core.impl.SessionConfig.Builder builder) {
        this.getHighSpeedVideoSizes.addZslConfig(builder);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearZslConfig() {
        this.getHighSpeedVideoSizes.clearZslConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void setZslDisabledByUserCaseConfig(boolean z) {
        this.getHighSpeedVideoSizes.setZslDisabledByUserCaseConfig(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isZslDisabledByByUserCaseConfig() {
        return this.getHighSpeedVideoSizes.isZslDisabledByByUserCaseConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.ListenableFuture<java.util.List<java.lang.Void>> submitStillCaptureRequests(java.util.List<androidx.camera.core.impl.CaptureConfig> list, int i, int i2) {
        return this.getHighSpeedVideoSizes.submitStillCaptureRequests(list, i, i2);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public com.google.common.util.concurrent.ListenableFuture<androidx.camera.core.imagecapture.CameraCapturePipeline> getCameraCapturePipelineAsync(int i, int i2) {
        return this.getHighSpeedVideoSizes.getCameraCapturePipelineAsync(i, i2);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.SessionConfig getSessionConfig() {
        return this.getHighSpeedVideoSizes.getSessionConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void addInteropConfig(androidx.camera.core.impl.Config config) {
        this.getHighSpeedVideoSizes.addInteropConfig(config);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void clearInteropConfig() {
        this.getHighSpeedVideoSizes.clearInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.Config getInteropConfig() {
        return this.getHighSpeedVideoSizes.getInteropConfig();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public androidx.camera.core.impl.CameraControlInternal getImplementation() {
        return this.getHighSpeedVideoSizes.getImplementation();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void incrementVideoUsage() {
        this.getHighSpeedVideoSizes.incrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void decrementVideoUsage() {
        this.getHighSpeedVideoSizes.decrementVideoUsage();
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public boolean isInVideoUsage() {
        return this.getHighSpeedVideoSizes.isInVideoUsage();
    }
}
