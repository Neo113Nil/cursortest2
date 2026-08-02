package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideCameraPipeFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraPipe> {
    private final androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoFpsRanges;

    private CameraAppConfig_ProvideCameraPipeFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        this.getHighSpeedVideoFpsRanges = cameraAppConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraPipe get() {
        return provideCameraPipe(this.getHighSpeedVideoFpsRanges);
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideCameraPipeFactory(cameraAppConfig);
    }

    public static androidx.camera.camera2.pipe.CameraPipe provideCameraPipe(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return (androidx.camera.camera2.pipe.CameraPipe) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.getGetHighSpeedVideoFpsRangesFor());
    }
}
