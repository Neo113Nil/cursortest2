package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighSpeedVideoFpsRanges;

    private SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideCameraGraphCoroutineScope(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        return new androidx.camera.camera2.pipe.config.SharedCameraGraphModules_Companion_ProvideCameraGraphCoroutineScopeFactory(provider, provider2);
    }

    public static kotlinx.coroutines.CoroutineScope provideCameraGraphCoroutineScope(androidx.camera.camera2.pipe.core.Threads threads, kotlinx.coroutines.Job job) {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.SharedCameraGraphModules.INSTANCE.provideCameraGraphCoroutineScope(threads, job));
    }
}
