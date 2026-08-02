package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideFrameGraphCoroutineScope(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        return new androidx.camera.camera2.pipe.config.FrameGraphModule_Companion_ProvideFrameGraphCoroutineScopeFactory(provider, provider2);
    }

    public static kotlinx.coroutines.CoroutineScope provideFrameGraphCoroutineScope(androidx.camera.camera2.pipe.core.Threads threads, kotlinx.coroutines.Job job) {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.FrameGraphModule.INSTANCE.provideFrameGraphCoroutineScope(threads, job));
    }
}
