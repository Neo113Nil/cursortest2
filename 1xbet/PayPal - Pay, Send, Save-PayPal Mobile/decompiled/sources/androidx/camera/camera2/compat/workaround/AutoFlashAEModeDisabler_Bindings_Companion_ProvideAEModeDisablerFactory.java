package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getHighSpeedVideoFpsRangesFor;

    private AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler get() {
        return provideAEModeDisabler(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        return new androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler_Bindings_Companion_ProvideAEModeDisablerFactory(provider);
    }

    public static androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler provideAEModeDisabler(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.workaround.AutoFlashAEModeDisabler.Bindings.INSTANCE.provideAEModeDisabler(cameraQuirks));
    }
}
