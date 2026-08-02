package androidx.camera.camera2.config;

/* loaded from: classes6.dex */
public final class CameraModule_Companion_ProvideEncoderProfilesProviderFactory implements dagger.internal.Factory<androidx.camera.core.impl.EncoderProfilesProvider> {
    private final dagger.internal.Provider<java.lang.String> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getHighSpeedVideoSizes;

    private CameraModule_Companion_ProvideEncoderProfilesProviderFactory(dagger.internal.Provider<java.lang.String> provider, dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.core.impl.EncoderProfilesProvider get() {
        return provideEncoderProfilesProvider(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.config.CameraModule_Companion_ProvideEncoderProfilesProviderFactory create(dagger.internal.Provider<java.lang.String> provider, dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider2) {
        return new androidx.camera.camera2.config.CameraModule_Companion_ProvideEncoderProfilesProviderFactory(provider, provider2);
    }

    public static androidx.camera.core.impl.EncoderProfilesProvider provideEncoderProfilesProvider(java.lang.String str, androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.core.impl.EncoderProfilesProvider) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.config.CameraModule.INSTANCE.provideEncoderProfilesProvider(str, cameraQuirks));
    }
}
