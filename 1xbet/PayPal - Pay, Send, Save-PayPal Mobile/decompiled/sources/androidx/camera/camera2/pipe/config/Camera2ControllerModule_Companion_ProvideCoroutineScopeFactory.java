package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    private final dagger.internal.Provider<kotlinx.coroutines.Job> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoFpsRanges;

    private Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideCoroutineScope(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerModule_Companion_ProvideCoroutineScopeFactory(provider, provider2);
    }

    public static kotlinx.coroutines.CoroutineScope provideCoroutineScope(androidx.camera.camera2.pipe.core.Threads threads, kotlinx.coroutines.Job job) {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.Camera2ControllerModule.INSTANCE.provideCoroutineScope(threads, job));
    }
}
