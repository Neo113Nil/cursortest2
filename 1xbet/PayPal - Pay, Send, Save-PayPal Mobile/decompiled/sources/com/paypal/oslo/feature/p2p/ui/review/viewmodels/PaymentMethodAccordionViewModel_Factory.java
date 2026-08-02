package com.paypal.oslo.feature.p2p.ui.review.viewmodels;

/* loaded from: classes13.dex */
public final class PaymentMethodAccordionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase> getOutputMinFrameDuration;

    private PaymentMethodAccordionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager> provider6) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel newInstance(com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper fundingOptionToPaymentPlanMapper, com.paypal.oslo.feature.p2p.ui.review.mappers.PaymentLinkDisclosureMapper paymentLinkDisclosureMapper, com.paypal.oslo.feature.p2p.domain.usecase.GetPaymentTransferAttemptUseCase getPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase addFinancialInstrumentsToPaymentTransferAttemptUseCase, com.paypal.oslo.feature.p2p.domain.usecase.ResolvePlanContingencyUseCase resolvePlanContingencyUseCase, com.paypal.oslo.feature.p2p.domain.remoteconfig.P2pFeatureGateManager p2pFeatureGateManager) {
        return new com.paypal.oslo.feature.p2p.ui.review.viewmodels.PaymentMethodAccordionViewModel(fundingOptionToPaymentPlanMapper, paymentLinkDisclosureMapper, getPaymentTransferAttemptUseCase, addFinancialInstrumentsToPaymentTransferAttemptUseCase, resolvePlanContingencyUseCase, p2pFeatureGateManager);
    }
}
