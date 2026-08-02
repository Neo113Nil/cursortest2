package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class CheckApplicationEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository> getHighSpeedVideoSizes;

    private CheckApplicationEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.CheckApplicationEligibilityRepository checkApplicationEligibilityRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.CheckApplicationEligibilityUseCase(checkApplicationEligibilityRepository);
    }
}
