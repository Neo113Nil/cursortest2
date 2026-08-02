package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase;

/* loaded from: classes14.dex */
public final class CancelRepaymentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> getHighSpeedVideoFpsRanges;

    private CancelRepaymentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentSummaryRepository paymentSummaryRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.CancelRepaymentUseCase(paymentSummaryRepository);
    }
}
