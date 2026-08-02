package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideCamera2InteropCallbacksFactory implements dagger.internal.Factory<androidx.camera.camera2.impl.CameraInteropStateCallbackRepository> {
    private final androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoFpsRangesFor;

    private CameraAppConfig_ProvideCamera2InteropCallbacksFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        this.getHighSpeedVideoFpsRangesFor = cameraAppConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.CameraInteropStateCallbackRepository get() {
        return provideCamera2InteropCallbacks(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideCamera2InteropCallbacksFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideCamera2InteropCallbacksFactory(cameraAppConfig);
    }

    public static androidx.camera.camera2.impl.CameraInteropStateCallbackRepository provideCamera2InteropCallbacks(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return (androidx.camera.camera2.impl.CameraInteropStateCallbackRepository) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.getGetHighResolutionOutputSizeshNQ4ISI());
    }
}
