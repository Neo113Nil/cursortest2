package com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel;

/* loaded from: classes15.dex */
public final class PromoCardViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager> getHighSpeedVideoSizes;

    private PromoCardViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider> provider4) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider> provider4) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.api.config.BnplAcquisitionConfigManager bnplAcquisitionConfigManager, com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase generateRiskDataUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetCardEligibilityUseCase payPalGetCardEligibilityUseCase, com.paypal.oslo.feature.bnplacquisition.api.paymode.PayLaterPromoDataProvider payLaterPromoDataProvider) {
        return new com.paypal.oslo.feature.taptopay.ui.paymode.viewmodel.PromoCardViewModel(bnplAcquisitionConfigManager, generateRiskDataUseCase, payPalGetCardEligibilityUseCase, payLaterPromoDataProvider);
    }
}
