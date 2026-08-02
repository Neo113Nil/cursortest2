package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideZslControlFactory implements dagger.internal.Factory<androidx.camera.camera2.adapter.ZslControl> {
    private final dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> getHighResolutionOutputSizeshNQ4ISI;

    private CameraModule_Companion_ProvideZslControlFactory(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.adapter.ZslControl get() {
        return provideZslControl(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideZslControlFactory create(dagger.internal.Provider<androidx.camera.camera2.impl.CameraProperties> provider) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideZslControlFactory(provider);
    }

    public static androidx.camera.camera2.adapter.ZslControl provideZslControl(androidx.camera.camera2.impl.CameraProperties cameraProperties) {
        return (androidx.camera.camera2.adapter.ZslControl) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraModule.INSTANCE.provideZslControl(cameraProperties));
    }
}
