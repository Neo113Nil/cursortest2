package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideCameraBackendFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraBackend> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighResolutionOutputSizeshNQ4ISI;

    private Camera2ControllerConfig_ProvideCameraBackendFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.getHighResolutionOutputSizeshNQ4ISI = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraBackend get() {
        return provideCameraBackend(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraBackendFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideCameraBackendFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.CameraBackend provideCameraBackend(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.CameraBackend) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.getGetHighSpeedVideoSizes());
    }
}
