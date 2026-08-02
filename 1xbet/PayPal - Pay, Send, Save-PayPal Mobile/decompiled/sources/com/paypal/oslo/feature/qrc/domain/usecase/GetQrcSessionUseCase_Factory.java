package com.paypal.oslo.feature.qrc.domain.usecase;

/* loaded from: classes14.dex */
public final class GetQrcSessionUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> getHighSpeedVideoFpsRangesFor;

    private GetQrcSessionUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository> provider) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase newInstance(com.paypal.oslo.feature.qrc.domain.repository.PaymentRepository paymentRepository) {
        return new com.paypal.oslo.feature.qrc.domain.usecase.GetQrcSessionUseCase(paymentRepository);
    }
}
