package androidx.camera.camera2.pipe.internal;

/* loaded from: classes6.dex */
public final class CameraPipeLifetime_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> {
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighSpeedVideoFpsRanges;

    private CameraPipeLifetime_Factory(dagger.internal.Provider<kotlinx.coroutines.Job> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.CameraPipeLifetime get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.internal.CameraPipeLifetime_Factory create(dagger.internal.Provider<kotlinx.coroutines.Job> provider) {
        return new androidx.camera.camera2.pipe.internal.CameraPipeLifetime_Factory(provider);
    }

    public static androidx.camera.camera2.pipe.internal.CameraPipeLifetime newInstance(kotlinx.coroutines.Job job) {
        return new androidx.camera.camera2.pipe.internal.CameraPipeLifetime(job);
    }
}
