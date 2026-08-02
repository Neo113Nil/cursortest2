package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerConfig_ProvideStreamGraphFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.StreamGraphImpl> {
    private final androidx.camera.camera2.pipe.config.Camera2ControllerConfig getHighSpeedVideoSizes;

    private Camera2ControllerConfig_ProvideStreamGraphFactory(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        this.getHighSpeedVideoSizes = camera2ControllerConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.StreamGraphImpl get() {
        return provideStreamGraph(this.getHighSpeedVideoSizes);
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory create(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerConfig_ProvideStreamGraphFactory(camera2ControllerConfig);
    }

    public static androidx.camera.camera2.pipe.graph.StreamGraphImpl provideStreamGraph(androidx.camera.camera2.pipe.config.Camera2ControllerConfig camera2ControllerConfig) {
        return (androidx.camera.camera2.pipe.graph.StreamGraphImpl) dagger.internal.Preconditions.checkNotNullFromProvides(camera2ControllerConfig.provideStreamGraph());
    }
}
