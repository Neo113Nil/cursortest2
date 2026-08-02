package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class CameraPipeCameraProperties_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.CameraPipeCameraProperties> {
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoFpsRanges;

    private CameraPipeCameraProperties_Factory(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.CameraPipeCameraProperties get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.impl.CameraPipeCameraProperties_Factory create(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider, dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider2) {
        return new androidx.camera.camera2.impl.CameraPipeCameraProperties_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.impl.CameraPipeCameraProperties newInstance(androidx.camera.camera2.config.CameraConfig cameraConfig, androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        return new androidx.camera.camera2.impl.CameraPipeCameraProperties(cameraConfig, cameraMetadata);
    }
}
