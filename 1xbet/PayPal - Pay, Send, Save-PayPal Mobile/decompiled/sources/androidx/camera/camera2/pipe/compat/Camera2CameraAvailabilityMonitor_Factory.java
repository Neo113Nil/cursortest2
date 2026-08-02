package androidx.camera.camera2.pipe.compat;

/* loaded from: classes6.dex */
public final class Camera2CameraAvailabilityMonitor_Factory implements dagger.internal.Factory<androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.hardware.camera2.CameraManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighSpeedVideoFpsRangesFor;

    private Camera2CameraAvailabilityMonitor_Factory(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<kotlinx.coroutines.Job> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor_Factory create(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<kotlinx.coroutines.Job> provider3) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor_Factory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor newInstance(javax.inject.Provider<android.hardware.camera2.CameraManager> provider, androidx.camera.camera2.pipe.core.Threads threads, kotlinx.coroutines.Job job) {
        return new androidx.camera.camera2.pipe.compat.Camera2CameraAvailabilityMonitor(provider, threads, job);
    }
}
