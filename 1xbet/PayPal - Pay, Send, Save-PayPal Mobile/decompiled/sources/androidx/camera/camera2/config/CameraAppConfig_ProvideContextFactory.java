package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideContextFactory implements dagger.internal.Factory<android.content.Context> {
    private final androidx.camera.camera2.config.CameraAppConfig getHighSpeedVideoSizes;

    private CameraAppConfig_ProvideContextFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        this.getHighSpeedVideoSizes = cameraAppConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.content.Context get() {
        return provideContext(this.getHighSpeedVideoSizes);
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideContextFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideContextFactory(cameraAppConfig);
    }

    public static android.content.Context provideContext(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig) {
        return (android.content.Context) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.getGetHighSpeedVideoFpsRanges());
    }
}
