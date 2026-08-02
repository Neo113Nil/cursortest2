package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class InternalCameraGraphModules_Companion_ProvideCameraBackendFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraBackend> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> getHighSpeedVideoFpsRangesFor;

    private InternalCameraGraphModules_Companion_ProvideCameraBackendFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraBackend get() {
        return provideCameraBackend(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraBackendFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackends> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider2, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraContext> provider3) {
        return new androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraBackendFactory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.pipe.CameraBackend provideCameraBackend(androidx.camera.camera2.pipe.CameraBackends cameraBackends, androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.CameraContext cameraContext) {
        return (androidx.camera.camera2.pipe.CameraBackend) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.InternalCameraGraphModules.INSTANCE.provideCameraBackend(cameraBackends, config, cameraContext));
    }
}
