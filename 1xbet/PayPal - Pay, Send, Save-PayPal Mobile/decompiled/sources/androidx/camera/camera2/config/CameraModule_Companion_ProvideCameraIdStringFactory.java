package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideCameraIdStringFactory implements dagger.internal.Factory<java.lang.String> {
    private final dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> getHighSpeedVideoFpsRangesFor;

    private CameraModule_Companion_ProvideCameraIdStringFactory(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.String get() {
        return provideCameraIdString(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraIdStringFactory create(dagger.internal.Provider<androidx.camera.camera2.config.CameraConfig> provider) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraIdStringFactory(provider);
    }

    public static java.lang.String provideCameraIdString(androidx.camera.camera2.config.CameraConfig cameraConfig) {
        return (java.lang.String) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraModule.INSTANCE.provideCameraIdString(cameraConfig));
    }
}
