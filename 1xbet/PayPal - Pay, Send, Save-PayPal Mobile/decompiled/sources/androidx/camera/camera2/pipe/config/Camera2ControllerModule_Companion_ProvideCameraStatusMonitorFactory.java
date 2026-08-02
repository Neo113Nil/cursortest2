package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.internal.CameraStatusMonitor> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.Job> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.hardware.camera2.CameraManager> getHighSpeedVideoFpsRangesFor;

    private Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider3, dagger.internal.Provider<kotlinx.coroutines.Job> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.internal.CameraStatusMonitor get() {
        return provideCameraStatusMonitor(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.config.Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory create(dagger.internal.Provider<android.hardware.camera2.CameraManager> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider3, dagger.internal.Provider<kotlinx.coroutines.Job> provider4) {
        return new androidx.camera.camera2.pipe.config.Camera2ControllerModule_Companion_ProvideCameraStatusMonitorFactory(provider, provider2, provider3, provider4);
    }

    public static androidx.camera.camera2.pipe.internal.CameraStatusMonitor provideCameraStatusMonitor(javax.inject.Provider<android.hardware.camera2.CameraManager> provider, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.CameraGraph.Config config, kotlinx.coroutines.Job job) {
        return (androidx.camera.camera2.pipe.internal.CameraStatusMonitor) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.Camera2ControllerModule.INSTANCE.provideCameraStatusMonitor(provider, threads, config, job));
    }
}
