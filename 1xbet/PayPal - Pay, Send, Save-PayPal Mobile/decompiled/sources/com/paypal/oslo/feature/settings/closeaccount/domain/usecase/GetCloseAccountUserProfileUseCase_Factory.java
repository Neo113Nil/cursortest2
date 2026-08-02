package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

/* loaded from: classes14.dex */
public final class GetCloseAccountUserProfileUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> getHighSpeedVideoFpsRanges;

    private GetCloseAccountUserProfileUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> provider) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase newInstance(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.GetCloseAccountUserProfileUseCase(closeAccountRepository);
    }
}
