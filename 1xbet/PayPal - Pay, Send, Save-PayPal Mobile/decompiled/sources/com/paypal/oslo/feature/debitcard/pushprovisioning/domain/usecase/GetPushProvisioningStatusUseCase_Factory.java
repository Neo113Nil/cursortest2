package com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase;

/* loaded from: classes12.dex */
public final class GetPushProvisioningStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository> getHighSpeedVideoSizes;

    private GetPushProvisioningStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository> provider) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase newInstance(com.paypal.oslo.feature.debitcard.pushprovisioning.domain.repository.TokenEligibilityRepository tokenEligibilityRepository) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.domain.usecase.GetPushProvisioningStatusUseCase(tokenEligibilityRepository);
    }
}
