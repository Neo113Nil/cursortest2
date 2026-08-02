package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class StartPaymentTransferAttemptForSubflowMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowRecommendedContactMapper> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper> getHighSpeedVideoSizes;

    private StartPaymentTransferAttemptForSubflowMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowRecommendedContactMapper> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper> provider3, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SubflowRecommendedContactMapper> provider4) {
        return new com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.SubflowFundingOptionsMapper subflowFundingOptionsMapper, com.paypal.oslo.feature.p2p.data.mapper.SubflowIntentMapper subflowIntentMapper, com.paypal.oslo.feature.p2p.data.mapper.SubflowTransferTypeMapper subflowTransferTypeMapper, com.paypal.oslo.feature.p2p.data.mapper.SubflowRecommendedContactMapper subflowRecommendedContactMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.StartPaymentTransferAttemptForSubflowMapper(subflowFundingOptionsMapper, subflowIntentMapper, subflowTransferTypeMapper, subflowRecommendedContactMapper);
    }
}
