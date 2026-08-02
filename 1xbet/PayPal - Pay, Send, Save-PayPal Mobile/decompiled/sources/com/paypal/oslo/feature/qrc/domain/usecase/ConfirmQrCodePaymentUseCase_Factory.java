package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class ConfirmQrCodePaymentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ConfirmQrCodePaymentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> provider) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase newInstance(com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository paymentRepository) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.ConfirmQrCodePaymentUseCase(paymentRepository);
    }
}
