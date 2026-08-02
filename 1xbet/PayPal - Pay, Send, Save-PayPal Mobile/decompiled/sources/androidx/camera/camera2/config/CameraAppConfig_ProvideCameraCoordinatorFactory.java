package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideCameraCoordinatorFactory implements dagger.internal.Factory<androidx.camera.core.concurrent.CameraCoordinator> {
    private final androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoFpsRangesFor;

    private CameraAppConfig_ProvideCameraCoordinatorFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        this.getHighSpeedVideoFpsRangesFor = cameraAppConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.core.concurrent.CameraCoordinator get() {
        return provideCameraCoordinator(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideCameraCoordinatorFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideCameraCoordinatorFactory(cameraAppConfig);
    }

    public static androidx.camera.core.concurrent.CameraCoordinator provideCameraCoordinator(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return (androidx.camera.core.concurrent.CameraCoordinator) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.getCamera2StreamConfigurationMap());
    }
}
