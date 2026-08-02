package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class UpdatePaymentTransferAttemptAmountAndIntentMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.RecommendedContactMapper> getHighSpeedVideoFpsRangesFor;

    private UpdatePaymentTransferAttemptAmountAndIntentMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.RecommendedContactMapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.RecommendedContactMapper> provider) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.RecommendedContactMapper recommendedContactMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentMapper(recommendedContactMapper);
    }
}
