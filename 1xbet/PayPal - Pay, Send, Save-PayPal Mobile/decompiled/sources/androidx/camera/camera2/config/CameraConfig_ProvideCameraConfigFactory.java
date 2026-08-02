package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraConfig_ProvideCameraConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.config.CameraConfig> {
    private final androidx.camera.camera2.config.CameraConfig Camera2StreamConfigurationMap;

    private CameraConfig_ProvideCameraConfigFactory(androidx.camera.camera2.config.CameraConfig cameraConfig) {
        this.Camera2StreamConfigurationMap = cameraConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.config.CameraConfig get() {
        return provideCameraConfig(this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory create(androidx.camera.camera2.config.CameraConfig cameraConfig) {
        return new androidx.camera.camera2.config.CameraConfig_ProvideCameraConfigFactory(cameraConfig);
    }

    public static androidx.camera.camera2.config.CameraConfig provideCameraConfig(androidx.camera.camera2.config.CameraConfig cameraConfig) {
        return (androidx.camera.camera2.config.CameraConfig) dagger.internal.Preconditions.checkNotNullFromProvides(cameraConfig.provideCameraConfig());
    }
}
