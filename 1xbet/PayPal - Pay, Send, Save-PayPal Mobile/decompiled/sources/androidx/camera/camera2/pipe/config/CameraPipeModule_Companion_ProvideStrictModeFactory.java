package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideStrictModeFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.StrictMode> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Flags> getHighSpeedVideoFpsRanges;

    private CameraPipeModule_Companion_ProvideStrictModeFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Flags> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.StrictMode get() {
        return provideStrictMode(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideStrictModeFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Flags> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideStrictModeFactory(provider);
    }

    public static androidx.camera.camera2.pipe.StrictMode provideStrictMode(androidx.camera.camera2.pipe.CameraPipe.Flags flags) {
        return (androidx.camera.camera2.pipe.StrictMode) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideStrictMode(flags));
    }
}
