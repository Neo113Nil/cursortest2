package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideShutdownListenerFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighSpeedVideoFpsRangesFor;

    private Camera2ControllerConfig_ProvideShutdownListenerFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.getHighSpeedVideoFpsRangesFor = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener get() {
        return provideShutdownListener(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideShutdownListenerFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideShutdownListenerFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener provideShutdownListener(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.compat.Camera2CameraController.ShutdownListener) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.getGetOutputFormats());
    }
}
