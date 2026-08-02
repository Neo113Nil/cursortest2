package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideCameraGraphConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraGraph.Config> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighSpeedVideoFpsRangesFor;

    private Camera2ControllerConfig_ProvideCameraGraphConfigFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.getHighSpeedVideoFpsRangesFor = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraGraph.Config get() {
        return provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphConfigFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.CameraGraph.Config provideCameraGraphConfig(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.CameraGraph.Config) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.getGetHighResolutionOutputSizeshNQ4ISI());
    }
}
