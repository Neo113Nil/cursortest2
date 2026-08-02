package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class PaymentTransferAttemptFundingOptionsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper> getInputSizeshNQ4ISI;

    private PaymentTransferAttemptFundingOptionsMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper> provider6) {
        this.getHighSpeedVideoSizes = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoFpsRangesFor = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper> provider4, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper> provider6) {
        return new com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate, com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper prePaymentDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper paymentPlanDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.ContingencyMapper contingencyMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper planContingencyMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanCurrencyExchangeMapper planCurrencyExchangeMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper(fundingOptionsMappingDelegate, prePaymentDisclosureMapper, paymentPlanDisclosureMapper, contingencyMapper, planContingencyMapper, planCurrencyExchangeMapper);
    }
}
