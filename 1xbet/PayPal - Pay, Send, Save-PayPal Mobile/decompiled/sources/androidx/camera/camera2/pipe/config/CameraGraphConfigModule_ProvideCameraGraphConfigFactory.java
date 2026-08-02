package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraGraphConfigModule_ProvideCameraGraphConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraGraph.Config> {
    private final androidx.camera.camera2.pipe.config.CameraGraphConfigModule getHighSpeedVideoFpsRangesFor;

    private CameraGraphConfigModule_ProvideCameraGraphConfigFactory(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
        this.getHighSpeedVideoFpsRangesFor = cameraGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraGraph.Config get() {
        return provideCameraGraphConfig(this.getHighSpeedVideoFpsRangesFor);
    }

    public static androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory create(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.CameraGraphConfigModule_ProvideCameraGraphConfigFactory(cameraGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.CameraGraph.Config provideCameraGraphConfig(androidx.camera.camera2.pipe.config.CameraGraphConfigModule cameraGraphConfigModule) {
        return (androidx.camera.camera2.pipe.CameraGraph.Config) dagger.internal.Preconditions.checkNotNullFromProvides(cameraGraphConfigModule.getGetHighSpeedVideoFpsRangesFor());
    }
}
