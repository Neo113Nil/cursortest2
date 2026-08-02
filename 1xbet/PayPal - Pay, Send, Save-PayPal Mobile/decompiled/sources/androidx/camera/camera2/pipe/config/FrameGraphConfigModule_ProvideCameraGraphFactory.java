package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class FrameGraphConfigModule_ProvideCameraGraphFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraGraph> {
    private final androidx.camera.camera2.pipe.config.FrameGraphConfigModule getHighSpeedVideoSizes;

    private FrameGraphConfigModule_ProvideCameraGraphFactory(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        this.getHighSpeedVideoSizes = frameGraphConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraGraph get() {
        return provideCameraGraph(this.getHighSpeedVideoSizes);
    }

    public static androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideCameraGraphFactory create(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return new androidx.camera.camera2.pipe.config.FrameGraphConfigModule_ProvideCameraGraphFactory(frameGraphConfigModule);
    }

    public static androidx.camera.camera2.pipe.CameraGraph provideCameraGraph(androidx.camera.camera2.pipe.config.FrameGraphConfigModule frameGraphConfigModule) {
        return (androidx.camera.camera2.pipe.CameraGraph) dagger.internal.Preconditions.checkNotNullFromProvides(frameGraphConfigModule.provideCameraGraph());
    }
}
