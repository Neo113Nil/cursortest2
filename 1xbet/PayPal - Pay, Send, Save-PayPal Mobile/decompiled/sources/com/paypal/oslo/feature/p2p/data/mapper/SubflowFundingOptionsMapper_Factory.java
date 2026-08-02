package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class SubflowFundingOptionsMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> getHighSpeedVideoSizes;

    private SubflowFundingOptionsMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper> provider4) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper> provider4) {
        return new com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.FundingOptionsMappingDelegate fundingOptionsMappingDelegate, com.paypal.oslo.feature.p2p.data.mapper.PrePaymentDisclosureMapper prePaymentDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.PaymentPlanDisclosureMapper paymentPlanDisclosureMapper, com.paypal.oslo.feature.p2p.data.mapper.PlanContingencyMapper planContingencyMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper(fundingOptionsMappingDelegate, prePaymentDisclosureMapper, paymentPlanDisclosureMapper, planContingencyMapper);
    }
}
