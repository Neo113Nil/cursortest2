package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

/* loaded from: classes12.dex */
public final class InitiatePushProvisioningUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository> getHighSpeedVideoFpsRanges;

    private InitiatePushProvisioningUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase newInstance(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.PrepareDigitizationDataRepository prepareDigitizationDataRepository, com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.InitiatePushProvisioningUseCase(prepareDigitizationDataRepository, userStore);
    }
}
