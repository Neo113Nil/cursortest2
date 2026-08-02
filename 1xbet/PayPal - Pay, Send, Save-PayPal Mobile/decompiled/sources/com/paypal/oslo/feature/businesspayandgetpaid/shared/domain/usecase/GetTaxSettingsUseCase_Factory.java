package com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase;

/* loaded from: classes11.dex */
public final class GetTaxSettingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> Camera2StreamConfigurationMap;

    private GetTaxSettingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository> provider) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase newInstance(com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.repository.PaymentRequestSettingsRepository paymentRequestSettingsRepository) {
        return new com.paypal.oslo.feature.businesspayandgetpaid.shared.domain.usecase.GetTaxSettingsUseCase(paymentRequestSettingsRepository);
    }
}
