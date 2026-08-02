package com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning;

/* loaded from: classes12.dex */
public final class CheckCryptoProvisioningUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository> getHighSpeedVideoFpsRangesFor;

    private CheckCryptoProvisioningUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository cryptoSubscriptionCapabilitiesRepository) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase(cryptoSubscriptionCapabilitiesRepository);
    }
}
