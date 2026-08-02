package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

/* loaded from: classes14.dex */
public final class GetCloseAccountEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> getHighSpeedVideoFpsRangesFor;

    private GetCloseAccountEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> provider) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase newInstance(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountEligibilityUseCase(closeAccountRepository);
    }
}
