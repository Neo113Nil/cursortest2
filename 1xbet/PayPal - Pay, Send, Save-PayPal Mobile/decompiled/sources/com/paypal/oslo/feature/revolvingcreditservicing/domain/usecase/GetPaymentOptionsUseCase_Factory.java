package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetPaymentOptionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository> getHighSpeedVideoFpsRanges;

    private GetPaymentOptionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentOptionsRepository paymentOptionsRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentOptionsUseCase(paymentOptionsRepository);
    }
}
