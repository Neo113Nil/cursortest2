package com.paypal.oslo.feature.checkcapture.ui.viewmodel;

/* loaded from: classes11.dex */
public final class CheckCaptureViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private CheckCaptureViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase> provider2) {
        return new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel newInstance(com.paypal.oslo.feature.checkcapture.manager.CheckCaptureFeatureManager checkCaptureFeatureManager, com.paypal.oslo.feature.checkcapture.domain.usecase.AuthenticateCheckCaptureUserUseCase authenticateCheckCaptureUserUseCase) {
        return new com.paypal.oslo.feature.checkcapture.ui.viewmodel.CheckCaptureViewModel(checkCaptureFeatureManager, authenticateCheckCaptureUserUseCase);
    }
}
