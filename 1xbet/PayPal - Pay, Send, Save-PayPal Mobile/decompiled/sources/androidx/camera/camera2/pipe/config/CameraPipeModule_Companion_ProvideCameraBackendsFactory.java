package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraBackendsFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraBackends> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> getHighSpeedVideoSizes;

    private CameraPipeModule_Companion_ProvideCameraBackendsFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> provider2, dagger.internal.Provider<android.content.Context> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider5) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoSizes = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraBackends get() {
        return provideCameraBackends(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraBackendsFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> provider2, dagger.internal.Provider<android.content.Context> provider3, dagger.internal.Provider<androidx.camera.camera2.pipe.core.Threads> provider4, dagger.internal.Provider<androidx.camera.camera2.pipe.internal.CameraPipeLifetime> provider5) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraBackendsFactory(provider, provider2, provider3, provider4, provider5);
    }

    public static androidx.camera.camera2.pipe.CameraBackends provideCameraBackends(androidx.camera.camera2.pipe.CameraPipe.Config config, javax.inject.Provider<androidx.camera.camera2.pipe.CameraBackend> provider, android.content.Context context, androidx.camera.camera2.pipe.core.Threads threads, androidx.camera.camera2.pipe.internal.CameraPipeLifetime cameraPipeLifetime) {
        return (androidx.camera.camera2.pipe.CameraBackends) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraBackends(config, provider, context, threads, cameraPipeLifetime));
    }
}
