package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class EvaluateAccountSetupStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> getHighSpeedVideoSizes;

    private EvaluateAccountSetupStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.EvaluateAccountSetupStatusUseCase(accountSetupRepository);
    }
}
