package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class UpdateTaxStatementDeliveryPreferenceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> Camera2StreamConfigurationMap;

    private UpdateTaxStatementDeliveryPreferenceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRepository> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRepository savingsRepository) {
        return new com.paypal.oslo.feature.savings.domain.usecase.UpdateTaxStatementDeliveryPreferenceUseCase(savingsRepository);
    }
}
