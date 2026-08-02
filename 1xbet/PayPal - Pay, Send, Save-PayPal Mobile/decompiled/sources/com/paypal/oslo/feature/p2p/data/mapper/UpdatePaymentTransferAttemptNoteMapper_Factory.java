package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class UpdatePaymentTransferAttemptNoteMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> getHighSpeedVideoFpsRangesFor;

    private UpdatePaymentTransferAttemptNoteMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> provider) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptNoteMapper(paymentTransferAttemptFundingOptionsMapper);
    }
}
