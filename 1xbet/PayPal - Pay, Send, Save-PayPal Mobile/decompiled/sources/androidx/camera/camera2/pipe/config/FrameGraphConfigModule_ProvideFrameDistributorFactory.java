package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideFrameDistributorFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.FrameDistributor> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighResolutionOutputSizeshNQ4ISI;

    private FrameGraphConfigModule_ProvideFrameDistributorFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighResolutionOutputSizeshNQ4ISI = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.FrameDistributor get() {
        return provideFrameDistributor(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideFrameDistributorFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideFrameDistributorFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.internal.FrameDistributor provideFrameDistributor(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.internal.FrameDistributor) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.provideFrameDistributor());
    }
}
