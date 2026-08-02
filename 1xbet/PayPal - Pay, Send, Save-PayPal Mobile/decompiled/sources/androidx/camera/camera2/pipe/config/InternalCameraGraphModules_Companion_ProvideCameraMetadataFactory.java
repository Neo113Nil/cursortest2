package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraMetadata> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> getHighSpeedVideoFpsRangesFor;

    private InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraMetadata get() {
        return provideCameraMetadata(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraGraph.Config> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraBackend> provider2) {
        return new androidx.camera.camera2.pipe.config.InternalCameraGraphModules_Companion_ProvideCameraMetadataFactory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.CameraMetadata provideCameraMetadata(androidx.camera.camera2.pipe.CameraGraph.Config config, androidx.camera.camera2.pipe.CameraBackend cameraBackend) {
        return (androidx.camera.camera2.pipe.CameraMetadata) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.InternalCameraGraphModules.INSTANCE.provideCameraMetadata(config, cameraBackend));
    }
}
