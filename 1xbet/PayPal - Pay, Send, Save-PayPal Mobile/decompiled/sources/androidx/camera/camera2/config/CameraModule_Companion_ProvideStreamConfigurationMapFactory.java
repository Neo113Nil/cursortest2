package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideStreamConfigurationMapFactory implements dagger.internal.Factory<android.hardware.camera2.params.StreamConfigurationMap> {
    private final dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> getHighSpeedVideoSizes;

    private CameraModule_Companion_ProvideStreamConfigurationMapFactory(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final android.hardware.camera2.params.StreamConfigurationMap get() {
        return provideStreamConfigurationMap(this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideStreamConfigurationMapFactory create(dagger.internal.Provider<androidx.camera.camera2.pipe.CameraMetadata> provider) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideStreamConfigurationMapFactory(provider);
    }

    public static android.hardware.camera2.params.StreamConfigurationMap provideStreamConfigurationMap(androidx.camera.camera2.pipe.CameraMetadata cameraMetadata) {
        return androidx.camera.camera2.config.CameraModule.INSTANCE.provideStreamConfigurationMap(cameraMetadata);
    }
}
