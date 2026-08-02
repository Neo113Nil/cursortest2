package com.paypal.oslo.feature.bnplacquisition.ui.repayments;

/* loaded from: classes11.dex */
public final class RepaymentsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> getHighSpeedVideoSizes;

    private RepaymentsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper> provider5) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase submitCreditApplicationUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase getPaymentFundingInstrumentsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsUiMapper repaymentsUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsAnalyticsHelper repaymentsAnalyticsHelper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.repayments.RepaymentsViewModel(submitCreditApplicationUsecase, getPaymentFundingInstrumentsUseCase, sessionStorage, repaymentsUiMapper, repaymentsAnalyticsHelper);
    }
}
