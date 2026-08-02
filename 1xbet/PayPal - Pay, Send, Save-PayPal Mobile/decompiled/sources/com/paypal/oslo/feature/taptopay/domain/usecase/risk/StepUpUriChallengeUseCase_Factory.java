package com.paypal.oslo.feature.taptopay.domain.usecase.risk;

/* loaded from: classes15.dex */
public final class StepUpUriChallengeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.RiskAuthRepository> getHighSpeedVideoFpsRanges;

    private StepUpUriChallengeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.RiskAuthRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.RiskAuthRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.RiskAuthRepository riskAuthRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.risk.StepUpUriChallengeUseCase(riskAuthRepository);
    }
}
