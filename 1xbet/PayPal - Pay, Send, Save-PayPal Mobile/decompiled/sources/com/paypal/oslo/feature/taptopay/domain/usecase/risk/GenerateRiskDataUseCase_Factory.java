package com.paypal.oslo.feature.taptopay.domain.usecase.risk;

/* loaded from: classes15.dex */
public final class GenerateRiskDataUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> getHighSpeedVideoSizes;

    private GenerateRiskDataUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.security.RiskDataProvider> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase newInstance(com.paypal.oslo.core.security.RiskDataProvider riskDataProvider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.risk.GenerateRiskDataUseCase(riskDataProvider);
    }
}
