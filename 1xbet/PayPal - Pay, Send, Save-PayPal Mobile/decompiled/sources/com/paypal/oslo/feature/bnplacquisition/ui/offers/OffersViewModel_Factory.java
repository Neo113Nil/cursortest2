package com.paypal.oslo.feature.bnplacquisition.ui.offers;

/* loaded from: classes11.dex */
public final class OffersViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersReducer> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getOutputFormats;

    private OffersViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper> provider8) {
        this.getInputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getOutputFormats = provider5;
        this.getHighSpeedVideoSizesFor = provider6;
        this.getHighSpeedVideoFpsRangesFor = provider7;
        this.getHighSpeedVideoFpsRanges = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel get() {
        return newInstance(this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper> provider8) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersReducer offersReducer, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getReviewTermsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase getRepaymentDetailsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase createCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.offers.mapper.OffersUiMapper offersUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersConfig offersConfig, com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersAnalyticsHelper offersAnalyticsHelper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.offers.OffersViewModel(offersReducer, getReviewTermsUseCase, getRepaymentDetailsUseCase, createCreditApplicationUsecase, sessionStorage, offersUiMapper, offersConfig, offersAnalyticsHelper);
    }
}
