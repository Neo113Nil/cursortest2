package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideCameraQuirksValuesFactory implements dagger.internal.Factory<androidx.camera.core.impl.Quirks> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> Camera2StreamConfigurationMap;

    private CameraModule_Companion_ProvideCameraQuirksValuesFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.core.impl.Quirks get() {
        return provideCameraQuirksValues(this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraQuirksValuesFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideCameraQuirksValuesFactory(provider);
    }

    public static androidx.camera.core.impl.Quirks provideCameraQuirksValues(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.core.impl.Quirks) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraModule.INSTANCE.provideCameraQuirksValues(cameraQuirks));
    }
}
