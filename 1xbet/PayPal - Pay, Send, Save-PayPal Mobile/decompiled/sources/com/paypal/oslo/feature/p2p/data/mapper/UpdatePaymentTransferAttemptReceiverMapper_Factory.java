package com.paypal.oslo.feature.p2p.data.mapper;

/* loaded from: classes13.dex */
public final class UpdatePaymentTransferAttemptReceiverMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> getHighResolutionOutputSizeshNQ4ISI;

    private UpdatePaymentTransferAttemptReceiverMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper> provider) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper newInstance(com.paypal.oslo.feature.p2p.data.mapper.PaymentTransferAttemptFundingOptionsMapper paymentTransferAttemptFundingOptionsMapper) {
        return new com.paypal.oslo.feature.p2p.data.mapper.UpdatePaymentTransferAttemptReceiverMapper(paymentTransferAttemptFundingOptionsMapper);
    }
}
