package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideContextFactory implements dagger.internal.Factory<android.content.Context> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> Camera2StreamConfigurationMap;

    private CameraPipeModule_Companion_ProvideContextFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.content.Context get() {
        return provideContext(this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideContextFactory(provider);
    }

    public static android.content.Context provideContext(androidx.camera.camera2.pipe.CameraPipe.Config config) {
        return (android.content.Context) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideContext(config));
    }
}
