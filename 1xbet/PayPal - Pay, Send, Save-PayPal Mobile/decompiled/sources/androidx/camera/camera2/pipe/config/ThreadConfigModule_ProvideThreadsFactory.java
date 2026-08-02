package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class ThreadConfigModule_ProvideThreadsFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.core.Threads> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighSpeedVideoFpsRanges;
    private final androidx.camera.camera2.pipe.config.ThreadConfigModule getHighSpeedVideoSizes;

    private ThreadConfigModule_ProvideThreadsFactory(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        this.getHighSpeedVideoSizes = threadConfigModule;
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.core.Threads get() {
        return provideThreads(this.getHighSpeedVideoSizes, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.ThreadConfigModule_ProvideThreadsFactory create(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider, dagger.internal.Provider<kotlinx.coroutines.Job> provider2) {
        return new androidx.camera.camera2.pipe.config.ThreadConfigModule_ProvideThreadsFactory(threadConfigModule, provider, provider2);
    }

    public static androidx.camera.camera2.pipe.core.Threads provideThreads(androidx.camera.camera2.pipe.config.ThreadConfigModule threadConfigModule, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, kotlinx.coroutines.Job job) {
        return (androidx.camera.camera2.pipe.core.Threads) dagger.internal.Preconditions.checkNotNullFromProvides(threadConfigModule.provideThreads(cameraPipeLifetime, job));
    }
}
