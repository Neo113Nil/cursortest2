package com.paypal.oslo.feature.p2p.ui.review.mappers;

/* loaded from: classes13.dex */
public final class FundingOptionToPaymentPlanMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.DisclosureToPlanDisclosureInfoMapper> Camera2StreamConfigurationMap;

    private FundingOptionToPaymentPlanMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.DisclosureToPlanDisclosureInfoMapper> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.ui.review.mappers.DisclosureToPlanDisclosureInfoMapper> provider) {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper newInstance(com.paypal.oslo.feature.p2p.ui.review.mappers.DisclosureToPlanDisclosureInfoMapper disclosureToPlanDisclosureInfoMapper) {
        return new com.paypal.oslo.feature.p2p.ui.review.mappers.FundingOptionToPaymentPlanMapper(disclosureToPlanDisclosureInfoMapper);
    }
}
