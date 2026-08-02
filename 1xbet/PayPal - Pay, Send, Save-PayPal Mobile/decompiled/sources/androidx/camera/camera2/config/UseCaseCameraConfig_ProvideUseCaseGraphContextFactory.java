package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class UseCaseCameraConfig_ProvideUseCaseGraphContextFactory implements dagger.internal.Factory<androidx.camera.camera2.config.UseCaseGraphContext> {
    private final androidx.camera.camera2.config.UseCaseCameraConfig Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> getHighSpeedVideoFpsRanges;

    private UseCaseCameraConfig_ProvideUseCaseGraphContextFactory(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider) {
        this.Camera2StreamConfigurationMap = useCaseCameraConfig;
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.config.UseCaseGraphContext get() {
        return provideUseCaseGraphContext(this.Camera2StreamConfigurationMap, this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.config.UseCaseCameraConfig_ProvideUseCaseGraphContextFactory create(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig, dagger.internal.Provider<androidx.camera.camera2.adapter.CameraStateAdapter> provider) {
        return new androidx.camera.camera2.config.UseCaseCameraConfig_ProvideUseCaseGraphContextFactory(useCaseCameraConfig, provider);
    }

    public static androidx.camera.camera2.config.UseCaseGraphContext provideUseCaseGraphContext(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig, androidx.camera.camera2.adapter.CameraStateAdapter cameraStateAdapter) {
        return (androidx.camera.camera2.config.UseCaseGraphContext) dagger.internal.Preconditions.checkNotNullFromProvides(useCaseCameraConfig.provideUseCaseGraphContext(cameraStateAdapter));
    }
}
