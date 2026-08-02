package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class GetPaymentSummaryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> getHighSpeedVideoSizes;

    private GetPaymentSummaryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository paymentSummaryRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.GetPaymentSummaryUseCase(paymentSummaryRepository);
    }
}
