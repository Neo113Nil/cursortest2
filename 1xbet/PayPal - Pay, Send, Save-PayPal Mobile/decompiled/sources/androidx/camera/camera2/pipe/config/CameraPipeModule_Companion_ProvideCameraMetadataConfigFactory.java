package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> Camera2StreamConfigurationMap;

    private CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig get() {
        return provideCameraMetadataConfig(this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraMetadataConfigFactory(provider);
    }

    public static androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig provideCameraMetadataConfig(androidx.camera.camera2.pipe.CameraPipe.Config config) {
        return (androidx.camera.camera2.pipe.CameraPipe.CameraMetadataConfig) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraMetadataConfig(config));
    }
}
