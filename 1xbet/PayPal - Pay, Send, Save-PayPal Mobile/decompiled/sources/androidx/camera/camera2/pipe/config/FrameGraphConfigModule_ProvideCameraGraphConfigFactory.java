package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideCameraGraphConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.FrameGraph.Config> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighResolutionOutputSizeshNQ4ISI;

    private FrameGraphConfigModule_ProvideCameraGraphConfigFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighResolutionOutputSizeshNQ4ISI = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.FrameGraph.Config get() {
        return provideCameraGraphConfig(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideCameraGraphConfigFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideCameraGraphConfigFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.FrameGraph.Config provideCameraGraphConfig(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.FrameGraph.Config) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.getCamera2StreamConfigurationMap());
    }
}
