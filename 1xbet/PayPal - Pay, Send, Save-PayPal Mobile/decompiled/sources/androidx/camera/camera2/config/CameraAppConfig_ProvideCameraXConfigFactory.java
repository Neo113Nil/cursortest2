package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideCameraXConfigFactory implements dagger.internal.Factory<androidx.camera.core.CameraXConfig> {
    private final androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoFpsRangesFor;

    private CameraAppConfig_ProvideCameraXConfigFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        this.getHighSpeedVideoFpsRangesFor = cameraAppConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.core.CameraXConfig get() {
        return provideCameraXConfig(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideCameraXConfigFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideCameraXConfigFactory(cameraAppConfig);
    }

    public static androidx.camera.core.CameraXConfig provideCameraXConfig(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return (androidx.camera.core.CameraXConfig) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.getGetOutputFormats());
    }
}
