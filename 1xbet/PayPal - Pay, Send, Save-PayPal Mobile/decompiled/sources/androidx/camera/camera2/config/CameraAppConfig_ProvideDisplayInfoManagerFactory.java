package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraAppConfig_ProvideDisplayInfoManagerFactory implements dagger.internal.Factory<androidx.camera.camera2.impl.DisplayInfoManager> {
    private final androidx.camera.camera2.config.CameraAppConfig Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private CameraAppConfig_ProvideDisplayInfoManagerFactory(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig, dagger.internal.Provider<android.content.Context> provider) {
        this.Camera2StreamConfigurationMap = cameraAppConfig;
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.DisplayInfoManager get() {
        return provideDisplayInfoManager(this.Camera2StreamConfigurationMap, this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.config.CameraAppConfig_ProvideDisplayInfoManagerFactory create(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig, dagger.internal.Provider<android.content.Context> provider) {
        return new androidx.camera.camera2.config.CameraAppConfig_ProvideDisplayInfoManagerFactory(cameraAppConfig, provider);
    }

    public static androidx.camera.camera2.impl.DisplayInfoManager provideDisplayInfoManager(androidx.camera.camera2.config.CameraAppConfig cameraAppConfig, android.content.Context context) {
        return (androidx.camera.camera2.impl.DisplayInfoManager) dagger.internal.Preconditions.checkNotNullFromProvides(cameraAppConfig.provideDisplayInfoManager(context));
    }
}
