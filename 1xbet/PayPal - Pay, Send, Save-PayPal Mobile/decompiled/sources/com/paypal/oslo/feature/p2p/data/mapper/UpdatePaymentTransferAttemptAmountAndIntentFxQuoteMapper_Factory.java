package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> getHighSpeedVideoFpsRangesFor;

    private UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper> provider) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.P2PMoneyFragmentMapper p2PMoneyFragmentMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptAmountAndIntentFxQuoteMapper(p2PMoneyFragmentMapper);
    }
}
