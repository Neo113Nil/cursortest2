package androidx.camera.view;

/* loaded from: classes6.dex */
class ProcessCameraProviderWrapperImpl implements androidx.camera.view.ProcessCameraProviderWrapper {
    private final androidx.camera.lifecycle.ProcessCameraProvider getHighResolutionOutputSizeshNQ4ISI;

    ProcessCameraProviderWrapperImpl(androidx.camera.lifecycle.ProcessCameraProvider processCameraProvider) {
        this.getHighResolutionOutputSizeshNQ4ISI = processCameraProvider;
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final boolean getHighSpeedVideoSizes(androidx.camera.core.CameraSelector cameraSelector) throws androidx.camera.core.CameraInfoUnavailableException {
        return this.getHighResolutionOutputSizeshNQ4ISI.hasCamera(cameraSelector);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.UseCase... useCaseArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.unbind(useCaseArr);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final void getHighResolutionOutputSizeshNQ4ISI(androidx.camera.core.SessionConfig sessionConfig) {
        this.getHighResolutionOutputSizeshNQ4ISI.unbind(sessionConfig);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final void getHighSpeedVideoSizes() {
        this.getHighResolutionOutputSizeshNQ4ISI.unbindAll();
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final androidx.camera.core.Camera getHighSpeedVideoFpsRanges(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.UseCaseGroup useCaseGroup) {
        return this.getHighResolutionOutputSizeshNQ4ISI.bindToLifecycle(lifecycleOwner, cameraSelector, useCaseGroup);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final androidx.camera.core.Camera Camera2StreamConfigurationMap(androidx.view.LifecycleOwner lifecycleOwner, androidx.camera.core.CameraSelector cameraSelector, androidx.camera.core.SessionConfig sessionConfig) {
        return this.getHighResolutionOutputSizeshNQ4ISI.bindToLifecycle(lifecycleOwner, cameraSelector, sessionConfig);
    }

    @Override // androidx.camera.view.ProcessCameraProviderWrapper
    public final androidx.camera.core.CameraInfo getHighSpeedVideoFpsRanges(androidx.camera.core.CameraSelector cameraSelector) {
        return this.getHighResolutionOutputSizeshNQ4ISI.getCameraInfo(cameraSelector);
    }
}
