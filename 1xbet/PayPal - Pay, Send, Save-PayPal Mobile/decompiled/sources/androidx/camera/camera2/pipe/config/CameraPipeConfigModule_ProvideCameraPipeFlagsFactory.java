package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeConfigModule_ProvideCameraPipeFlagsFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraPipe.Flags> {
    private final androidx.camera.camera2.pipe.config.CameraPipeConfigModule Camera2StreamConfigurationMap;

    private CameraPipeConfigModule_ProvideCameraPipeFlagsFactory(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
        this.Camera2StreamConfigurationMap = cameraPipeConfigModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraPipe.Flags get() {
        return provideCameraPipeFlags(this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeFlagsFactory create(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
        return new androidx.camera.camera2.pipe.config.CameraPipeConfigModule_ProvideCameraPipeFlagsFactory(cameraPipeConfigModule);
    }

    public static androidx.camera.camera2.pipe.CameraPipe.Flags provideCameraPipeFlags(androidx.camera.camera2.pipe.config.CameraPipeConfigModule cameraPipeConfigModule) {
        return (androidx.camera.camera2.pipe.CameraPipe.Flags) dagger.internal.Preconditions.checkNotNullFromProvides(cameraPipeConfigModule.provideCameraPipeFlags());
    }
}
