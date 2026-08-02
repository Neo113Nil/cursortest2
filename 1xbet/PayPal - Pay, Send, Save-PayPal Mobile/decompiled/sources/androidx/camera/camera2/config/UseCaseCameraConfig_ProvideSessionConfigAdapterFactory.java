package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class UseCaseCameraConfig_ProvideSessionConfigAdapterFactory implements dagger.internal.Factory<androidx.camera.camera2.adapter.SessionConfigAdapter> {
    private final androidx.camera.camera2.config.UseCaseCameraConfig getHighSpeedVideoFpsRanges;

    private UseCaseCameraConfig_ProvideSessionConfigAdapterFactory(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
        this.getHighSpeedVideoFpsRanges = useCaseCameraConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.SessionConfigAdapter get() {
        return provideSessionConfigAdapter(this.getHighSpeedVideoFpsRanges);
    }

    public static androidx.camera.camera2.config.UseCaseCameraConfig_ProvideSessionConfigAdapterFactory create(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
        return new androidx.camera.camera2.config.UseCaseCameraConfig_ProvideSessionConfigAdapterFactory(useCaseCameraConfig);
    }

    public static androidx.camera.camera2.adapter.SessionConfigAdapter provideSessionConfigAdapter(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
        return (androidx.camera.camera2.adapter.SessionConfigAdapter) dagger.internal.Preconditions.checkNotNullFromProvides(useCaseCameraConfig.getGetHighSpeedVideoSizes());
    }
}
