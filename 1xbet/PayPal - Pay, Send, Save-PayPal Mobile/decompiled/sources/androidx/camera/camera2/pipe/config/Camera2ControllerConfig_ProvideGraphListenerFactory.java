package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideGraphListenerFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.GraphListener> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighSpeedVideoFpsRanges;

    private Camera2ControllerConfig_ProvideGraphListenerFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.getHighSpeedVideoFpsRanges = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.GraphListener get() {
        return provideGraphListener(this.getHighSpeedVideoFpsRanges);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideGraphListenerFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideGraphListenerFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.graph.GraphListener provideGraphListener(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.graph.GraphListener) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.getGetHighSpeedVideoFpsRangesFor());
    }
}
