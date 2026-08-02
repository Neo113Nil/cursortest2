package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

/* loaded from: classes15.dex */
public final class IsForegroundSettingEnabledUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoFpsRangesFor;

    private IsForegroundSettingEnabledUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsForegroundSettingEnabledUseCase(paymentRepository);
    }
}
