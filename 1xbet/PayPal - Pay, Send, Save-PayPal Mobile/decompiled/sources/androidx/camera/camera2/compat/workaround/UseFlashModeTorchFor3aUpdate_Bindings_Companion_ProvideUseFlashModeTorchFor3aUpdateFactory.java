package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> Camera2StreamConfigurationMap;

    private UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate get() {
        return provideUseFlashModeTorchFor3aUpdate(this.Camera2StreamConfigurationMap.get());
    }

    public static androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        return new androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate_Bindings_Companion_ProvideUseFlashModeTorchFor3aUpdateFactory(provider);
    }

    public static androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate provideUseFlashModeTorchFor3aUpdate(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.workaround.UseFlashModeTorchFor3aUpdate.Bindings.INSTANCE.provideUseFlashModeTorchFor3aUpdate(cameraQuirks));
    }
}
