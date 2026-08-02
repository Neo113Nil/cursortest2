package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideCamera2CameraControlFactory implements dagger.internal.Factory<androidx.camera.camera2.interop.Camera2CameraControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.Camera2CameraControlCompat> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> getHighSpeedVideoSizes;

    private CameraModule_Companion_ProvideCamera2CameraControlFactory(dagger.internal.Provider<androidx.camera.camera2.compat.Camera2CameraControlCompat> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.interop.Camera2CameraControl get() {
        return provideCamera2CameraControl(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideCamera2CameraControlFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.Camera2CameraControlCompat> provider, dagger.internal.Provider<androidx.camera.camera2.impl.UseCaseThreads> provider2, dagger.internal.Provider<androidx.camera.camera2.impl.ComboRequestListener> provider3) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideCamera2CameraControlFactory(provider, provider2, provider3);
    }

    public static androidx.camera.camera2.interop.Camera2CameraControl provideCamera2CameraControl(androidx.camera.camera2.compat.Camera2CameraControlCompat camera2CameraControlCompat, androidx.camera.camera2.impl.UseCaseThreads useCaseThreads, androidx.camera.camera2.impl.ComboRequestListener comboRequestListener) {
        return (androidx.camera.camera2.interop.Camera2CameraControl) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraModule.INSTANCE.provideCamera2CameraControl(camera2CameraControlCompat, useCaseThreads, comboRequestListener));
    }
}
