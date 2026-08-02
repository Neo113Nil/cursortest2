package androidx.camera.camera2.pipe.config;

/* loaded from: classes6.dex */
public final class CameraPipeModule_Companion_ProvideCameraManagerFactory implements dagger.internal.Factory<android.hardware.camera2.CameraManager> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;

    private CameraPipeModule_Companion_ProvideCameraManagerFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.hardware.camera2.CameraManager get() {
        return provideCameraManager(this.getHighSpeedVideoFpsRanges.get());
    }

    public static androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraManagerFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new androidx.camera.camera2.pipe.config.CameraPipeModule_Companion_ProvideCameraManagerFactory(provider);
    }

    public static android.hardware.camera2.CameraManager provideCameraManager(android.content.Context context) {
        return (android.hardware.camera2.CameraManager) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.pipe.config.CameraPipeModule.INSTANCE.provideCameraManager(context));
    }
}
