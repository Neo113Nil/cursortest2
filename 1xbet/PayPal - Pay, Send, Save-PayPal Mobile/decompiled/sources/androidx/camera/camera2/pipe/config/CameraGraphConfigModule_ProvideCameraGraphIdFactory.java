package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraGraphConfigModule_ProvideCameraGraphIdFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraGraphId> {
    private final androidx.camera.camera2.pipe.config.CameraGraphConfigModule getHighResolutionOutputSizeshNQ4ISI;

    private CameraGraphConfigModule_ProvideCameraGraphIdFactory(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
        this.getHighResolutionOutputSizeshNQ4ISI = cameraGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraGraphId get() {
        return provideCameraGraphId(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public static androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphIdFactory create(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphIdFactory(cameraGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.CameraGraphId provideCameraGraphId(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
        return (androidx.camera.camera2.pipe.CameraGraphId) dagger.internal.Preconditions.checkNotNullFromProvides(cameraGraphConfigModule.getGetHighSpeedVideoSizes());
    }
}
