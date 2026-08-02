package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideController3AFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.graph.Controller3A> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighSpeedVideoSizes;

    private FrameGraphConfigModule_ProvideController3AFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighSpeedVideoSizes = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.graph.Controller3A get() {
        return provideController3A(this.getHighSpeedVideoSizes);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideController3AFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideController3AFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.graph.Controller3A provideController3A(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.graph.Controller3A) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.provideController3A());
    }
}
