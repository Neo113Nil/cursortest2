package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideCameraGraphIdFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraGraphId> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig Camera2StreamConfigurationMap;

    private Camera2ControllerConfig_ProvideCameraGraphIdFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.Camera2StreamConfigurationMap = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraGraphId get() {
        return provideCameraGraphId(this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphIdFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraGraphIdFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.CameraGraphId provideCameraGraphId(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.CameraGraphId) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.getGetHighSpeedVideoFpsRanges());
    }
}
