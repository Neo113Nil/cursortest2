package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeConfigModule_ProvideCameraInteropConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.camera.camera2.pipe.config.CameraPipeConfigModule getHighSpeedVideoFpsRanges;

    private CameraPipeConfigModule_ProvideCameraInteropConfigFactory(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider) {
        this.getHighSpeedVideoFpsRanges = cameraPipeConfigModule;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig get() {
        return provideCameraInteropConfig(this.getHighSpeedVideoFpsRanges, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraInteropConfigFactory create(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraInteropConfigFactory(cameraPipeConfigModule, provider);
    }

    public static androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig provideCameraInteropConfig(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule, androidx.camera.camera2.pipe.CameraPipe.Config config) {
        return (androidx.camera.camera2.pipe.CameraPipe.CameraInteropConfig) dagger.internal.Preconditions.checkNotNullFromProvides(cameraPipeConfigModule.provideCameraInteropConfig(config));
    }
}
