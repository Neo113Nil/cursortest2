package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes15.dex */
public final class RiskUseCaseModule_ProvideGenerateRiskDataUseCaseFactory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> Camera2StreamConfigurationMap;

    private RiskUseCaseModule_ProvideGenerateRiskDataUseCaseFactory(dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase get() {
        return provideGenerateRiskDataUseCase(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.di.RiskUseCaseModule_ProvideGenerateRiskDataUseCaseFactory create(dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.di.RiskUseCaseModule_ProvideGenerateRiskDataUseCaseFactory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase provideGenerateRiskDataUseCase(com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        return (com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.RiskUseCaseModule.INSTANCE.provideGenerateRiskDataUseCase(riskDataProvider));
    }
}
