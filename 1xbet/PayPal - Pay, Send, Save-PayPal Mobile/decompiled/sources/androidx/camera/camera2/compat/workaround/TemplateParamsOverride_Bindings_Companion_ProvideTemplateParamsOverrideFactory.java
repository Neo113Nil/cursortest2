package androidx.camera.camera2.compat.workaround;

/* loaded from: classes6.dex */
public final class TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory implements dagger.internal.Factory<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> {
    private final dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> getHighSpeedVideoSizes;

    private TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.compat.workaround.TemplateParamsOverride get() {
        return provideTemplateParamsOverride(this.getHighSpeedVideoSizes.get());
    }

    public static androidx.camera.camera2.compat.workaround.TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory create(dagger.internal.Provider<androidx.camera.camera2.compat.quirk.CameraQuirks> provider) {
        return new androidx.camera.camera2.compat.workaround.TemplateParamsOverride_Bindings_Companion_ProvideTemplateParamsOverrideFactory(provider);
    }

    public static androidx.camera.camera2.compat.workaround.TemplateParamsOverride provideTemplateParamsOverride(androidx.camera.camera2.compat.quirk.CameraQuirks cameraQuirks) {
        return (androidx.camera.camera2.compat.workaround.TemplateParamsOverride) dagger.internal.Preconditions.checkNotNullFromProvides(androidx.camera.camera2.compat.workaround.TemplateParamsOverride.Bindings.INSTANCE.provideTemplateParamsOverride(cameraQuirks));
    }
}
