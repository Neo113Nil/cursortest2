package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideSurfaceGraphFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.SurfaceTracker> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighSpeedVideoFpsRanges;

    private Camera2ControllerConfig_ProvideSurfaceGraphFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.getHighSpeedVideoFpsRanges = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.SurfaceTracker get() {
        return provideSurfaceGraph(this.getHighSpeedVideoFpsRanges);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideSurfaceGraphFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideSurfaceGraphFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.SurfaceTracker provideSurfaceGraph(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.SurfaceTracker) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.getGetHighSpeedVideoSizesFor());
    }
}
