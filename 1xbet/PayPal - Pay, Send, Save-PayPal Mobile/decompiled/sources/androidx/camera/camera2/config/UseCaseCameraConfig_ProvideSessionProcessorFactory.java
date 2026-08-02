package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class UseCaseCameraConfig_ProvideSessionProcessorFactory implements dagger.internal.Factory<androidx.camera.core.impl.SessionProcessor> {
    private final androidx.camera.camera2.config.UseCaseCameraConfig Camera2StreamConfigurationMap;

    private UseCaseCameraConfig_ProvideSessionProcessorFactory(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
        this.Camera2StreamConfigurationMap = useCaseCameraConfig;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.core.impl.SessionProcessor get() {
        return provideSessionProcessor(this.Camera2StreamConfigurationMap);
    }

    public static androidx.camera.camera2.config.UseCaseCameraConfig_ProvideSessionProcessorFactory create(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
        return new androidx.camera.camera2.config.UseCaseCameraConfig_ProvideSessionProcessorFactory(useCaseCameraConfig);
    }

    public static androidx.camera.core.impl.SessionProcessor provideSessionProcessor(androidx.camera.camera2.config.UseCaseCameraConfig useCaseCameraConfig) {
        return useCaseCameraConfig.getGetHighSpeedVideoFpsRanges();
    }
}
