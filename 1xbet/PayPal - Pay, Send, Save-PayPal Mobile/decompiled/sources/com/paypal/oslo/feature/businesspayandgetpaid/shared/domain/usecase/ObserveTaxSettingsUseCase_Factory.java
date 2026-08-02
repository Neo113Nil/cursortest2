package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

/* loaded from: classes11.dex */
public final class ObserveTaxSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> getHighSpeedVideoFpsRanges;

    private ObserveTaxSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository paymentRequestSettingsRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.ObserveTaxSettingsUseCase(paymentRequestSettingsRepository);
    }
}
