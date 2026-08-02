package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideSessionLockFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.GraphSessionLock> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighResolutionOutputSizeshNQ4ISI;

    private FrameGraphConfigModule_ProvideSessionLockFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighResolutionOutputSizeshNQ4ISI = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.GraphSessionLock get() {
        return provideSessionLock(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideSessionLockFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideSessionLockFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.internal.GraphSessionLock provideSessionLock(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.internal.GraphSessionLock) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.provideSessionLock());
    }
}
