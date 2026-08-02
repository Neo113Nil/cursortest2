package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment;

/* loaded from: classes14.dex */
public final class MakePaymentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository> getHighSpeedVideoFpsRangesFor;

    private MakePaymentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.PaymentReviewRepository paymentReviewRepository, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase(paymentReviewRepository, coroutineDispatcher);
    }
}
