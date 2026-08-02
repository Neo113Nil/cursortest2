package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideUseCaseThreadsFactory implements dagger.internal.Factory<androidx.camera.camera2.impl.UseCaseThreads> {
    private final dagger.internal.Provider<androidx.camera.core.impl.CameraThreadConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> getHighSpeedVideoFpsRangesFor;

    private CameraModule_Companion_ProvideUseCaseThreadsFactory(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider, dagger.internal.Provider<androidx.camera.core.impl.CameraThreadConfig> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.UseCaseThreads get() {
        return provideUseCaseThreads(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideUseCaseThreadsFactory create(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider, dagger.internal.Provider<androidx.camera.core.impl.CameraThreadConfig> provider2) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideUseCaseThreadsFactory(provider, provider2);
    }

    public static androidx.camera.camera2.impl.UseCaseThreads provideUseCaseThreads(androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig) {
        return (androidx.camera.camera2.impl.UseCaseThreads) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraModule.INSTANCE.provideUseCaseThreads(cameraConfig, cameraThreadConfig));
    }
}
