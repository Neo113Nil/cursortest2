package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class GetAccountSetupStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> getHighSpeedVideoFpsRanges;

    private GetAccountSetupStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.GetAccountSetupStatusUseCase(accountSetupRepository);
    }
}
