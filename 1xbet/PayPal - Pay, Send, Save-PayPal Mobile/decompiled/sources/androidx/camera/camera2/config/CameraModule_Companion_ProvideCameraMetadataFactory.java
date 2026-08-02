package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideCameraMetadataFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraMetadata> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> getHighSpeedVideoSizes;

    private CameraModule_Companion_ProvideCameraMetadataFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider, dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraMetadata get() {
        return provideCameraMetadata(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraMetadataFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraPipe> provider, dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider2) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraMetadataFactory(provider, provider2);
    }

    public static androidx.camera.camera2.pipe.CameraMetadata provideCameraMetadata(androidx.camera.camera2.pipe.CameraPipe cameraPipe, androidx.camera.camera2.config.CameraConfig cameraConfig) {
        return androidx.camera.camera2.config.CameraModule.INSTANCE.provideCameraMetadata(cameraPipe, cameraConfig);
    }
}
