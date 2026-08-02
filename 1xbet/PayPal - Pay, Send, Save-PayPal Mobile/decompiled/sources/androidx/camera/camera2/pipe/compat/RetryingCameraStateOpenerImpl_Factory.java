package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class RetryingCameraStateOpenerImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionController> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraStateOpener> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getInputFormats;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper> getOutputMinFrameDuration;

    private RetryingCameraStateOpenerImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraStateOpener> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionController> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> provider7, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider8) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizesFor = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getInputFormats = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputMinFrameDuration.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get());
    }

    public static androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraStateOpener> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraErrorListener> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.core.TimeSource> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper> provider5, dagger.internal.Provider<androidx.camera.camera2.pipe.compat.AudioRestrictionController> provider6, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> provider7, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider8) {
        return new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl newInstance(androidx.camera.camera2.pipe.compat.CameraStateOpener cameraStateOpener, androidx.camera.camera2.pipe.internal.CameraErrorListener cameraErrorListener, androidx.camera.camera2.pipe.compat.CameraAvailabilityMonitor cameraAvailabilityMonitor, androidx.camera.camera2.pipe.core.TimeSource timeSource, androidx.camera.camera2.pipe.compat.DevicePolicyManagerWrapper devicePolicyManagerWrapper, androidx.camera.camera2.pipe.compat.AudioRestrictionController audioRestrictionController, androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig cameraInteropConfig, androidx.camera.camera2.pipe.core.Threads threads) {
        return new androidx.camera.camera2.pipe.compat.RetryingCameraStateOpenerImpl(cameraStateOpener, cameraErrorListener, cameraAvailabilityMonitor, timeSource, devicePolicyManagerWrapper, audioRestrictionController, cameraInteropConfig, threads);
    }
}
