package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.MeteringRegionCorrection> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> Camera2StreamConfigurationMap;

    private MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.MeteringRegionCorrection get() {
        return provideMeteringRegionCorrection(this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.compat.workaround.MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        return new androidx.camera.camera2.compat.workaround.MeteringRegionCorrection_Bindings_Companion_ProvideMeteringRegionCorrectionFactory(provider);
    }

    public static androidx.camera.camera2.compat.workaround.MeteringRegionCorrection provideMeteringRegionCorrection(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.camera2.compat.workaround.MeteringRegionCorrection) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.workaround.MeteringRegionCorrection.Bindings.INSTANCE.provideMeteringRegionCorrection(cameraQuirks));
    }
}
