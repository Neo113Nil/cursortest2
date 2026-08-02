package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideGraphProcessorFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.GraphProcessor> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighSpeedVideoSizes;

    private FrameGraphConfigModule_ProvideGraphProcessorFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighSpeedVideoSizes = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.GraphProcessor get() {
        return provideGraphProcessor(this.getHighSpeedVideoSizes);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideGraphProcessorFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideGraphProcessorFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.graph.GraphProcessor provideGraphProcessor(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.graph.GraphProcessor) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.provideGraphProcessor());
    }
}
