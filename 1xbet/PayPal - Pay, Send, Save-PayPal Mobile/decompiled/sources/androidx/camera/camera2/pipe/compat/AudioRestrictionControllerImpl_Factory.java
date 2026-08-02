package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class AudioRestrictionControllerImpl_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor;

    private AudioRestrictionControllerImpl_Factory(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider2, dagger.internal.Provider<kotlinx.coroutines.Job> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl_Factory create(dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider2, dagger.internal.Provider<kotlinx.coroutines.Job> provider3) {
        return new androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl newInstance(androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime, kotlinx.coroutines.Job job) {
        return new androidx.camera.camera2.pipe.compat.AudioRestrictionControllerImpl(threads, cameraPipeLifetime, job);
    }
}
