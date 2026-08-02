package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory implements dagger.internal.Factory<androidx.camera.camera2.pipe.CameraSurfaceManager> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.pipe.CameraSurfaceManager get() {
        return provideCameraSurfaceManager();
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory create() {
        return androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static androidx.camera.camera2.pipe.CameraSurfaceManager provideCameraSurfaceManager() {
        return (androidx.camera.camera2.pipe.CameraSurfaceManager) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraSurfaceManager());
    }

    static final class InstanceHolder {
        static final androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory getHighSpeedVideoFpsRangesFor = new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraSurfaceManagerFactory();

        private InstanceHolder() {
        }
    }
}
