package com.paypal.oslo.feature.businesshome.domain.usecase;

/* loaded from: classes11.dex */
public final class IsMandatoryAccountSetupCompleteUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> Camera2StreamConfigurationMap;

    private IsMandatoryAccountSetupCompleteUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> provider) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase newInstance(com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository accountSetupRepository) {
        return new com.paypal.oslo.feature.businesshome.domain.usecase.IsMandatoryAccountSetupCompleteUseCase(accountSetupRepository);
    }
}
