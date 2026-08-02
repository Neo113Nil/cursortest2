package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeConfigModule_ProvideCameraPipeConfigFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraPipe.Config> {
    private final androidx.camera.camera2.pipe.config.CameraPipeConfigModule Camera2StreamConfigurationMap;

    private CameraPipeConfigModule_ProvideCameraPipeConfigFactory(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
        this.Camera2StreamConfigurationMap = cameraPipeConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraPipe.Config get() {
        return provideCameraPipeConfig(this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory create(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
        return new androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeConfigFactory(cameraPipeConfigModule);
    }

    public static androidx.camera.camera2.pipe.CameraPipe.Config provideCameraPipeConfig(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
        return (androidx.camera.camera2.pipe.CameraPipe.Config) dagger.internal.Preconditions.checkNotNullFromProvides(cameraPipeConfigModule.getGetHighSpeedVideoFpsRangesFor());
    }
}
