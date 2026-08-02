package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class CompleteDemoAccountSetupStepUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> getHighSpeedVideoSizes;

    private CompleteDemoAccountSetupStepUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.CompleteDemoAccountSetupStepUseCase(accountSetupRepository);
    }
}
