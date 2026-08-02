package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideCameraThreadConfigFactory implements dagger.internal.Factory<androidx.camera.core.impl.CameraThreadConfig> {
    private final androidx.camera.camera2.config.CameraAppConfig Camera2StreamConfigurationMap;

    private CameraAppConfig_ProvideCameraThreadConfigFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        this.Camera2StreamConfigurationMap = cameraAppConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.core.impl.CameraThreadConfig get() {
        return provideCameraThreadConfig(this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideCameraThreadConfigFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideCameraThreadConfigFactory(cameraAppConfig);
    }

    public static androidx.camera.core.impl.CameraThreadConfig provideCameraThreadConfig(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return (androidx.camera.core.impl.CameraThreadConfig) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.getGetHighSpeedVideoSizes());
    }
}
