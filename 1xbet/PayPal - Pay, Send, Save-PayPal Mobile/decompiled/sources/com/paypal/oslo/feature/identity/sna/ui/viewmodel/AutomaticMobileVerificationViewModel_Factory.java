package com.paypal.oslo.feature.identity.sna.ui.viewmodel;

/* loaded from: classes13.dex */
public final class AutomaticMobileVerificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer> getHighSpeedVideoFpsRangesFor;

    private AutomaticMobileVerificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer> provider4) {
        return new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel newInstance(com.paypal.oslo.feature.identity.sna.domain.usecase.GetSNAConsentStatusUseCase getSNAConsentStatusUseCase, com.paypal.oslo.feature.identity.sna.domain.usecase.GetMobileNumbersUseCase getMobileNumbersUseCase, com.paypal.oslo.feature.identity.sna.domain.usecase.ToggleSNAConsentUseCase toggleSNAConsentUseCase, com.paypal.oslo.feature.identity.sna.ui.mvi.AutomaticMobileVerificationReducer automaticMobileVerificationReducer) {
        return new com.paypal.oslo.feature.identity.sna.ui.viewmodel.AutomaticMobileVerificationViewModel(getSNAConsentStatusUseCase, getMobileNumbersUseCase, toggleSNAConsentUseCase, automaticMobileVerificationReducer);
    }
}
