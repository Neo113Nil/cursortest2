package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdateTaxSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> getHighSpeedVideoFpsRangesFor;

    private UpdateTaxSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository paymentRequestSettingsRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.UpdateTaxSettingsUseCase(paymentRequestSettingsRepository);
    }
}
