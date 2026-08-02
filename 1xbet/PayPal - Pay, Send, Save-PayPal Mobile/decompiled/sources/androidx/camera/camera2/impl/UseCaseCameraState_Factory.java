package androidx.camera.camera2.impl;

/* loaded from: classes6.dex */
public final class UseCaseCameraState_Factory implements dagger.internal.Factory<androidx.camera.camera2.impl.UseCaseCameraState> {
    private final dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> getHighSpeedVideoFpsRangesFor;

    private UseCaseCameraState_Factory(dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.camera.camera2.impl.UseCaseCameraState get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static androidx.camera.camera2.impl.UseCaseCameraState_Factory create(dagger.internal.Provider<androidx.camera.camera2.config.UseCaseGraphContext> provider, dagger.internal.Provider<androidx.camera.camera2.compat.workaround.TemplateParamsOverride> provider2) {
        return new androidx.camera.camera2.impl.UseCaseCameraState_Factory(provider, provider2);
    }

    public static androidx.camera.camera2.impl.UseCaseCameraState newInstance(androidx.camera.camera2.config.UseCaseGraphContext useCaseGraphContext, androidx.camera.camera2.compat.workaround.TemplateParamsOverride templateParamsOverride) {
        return new androidx.camera.camera2.impl.UseCaseCameraState(useCaseGraphContext, templateParamsOverride);
    }
}
