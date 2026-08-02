package com.paypal.oslo.feature.settings.closeaccount.domain.usecase;

/* loaded from: classes14.dex */
public final class CloseAccountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> getHighSpeedVideoSizes;

    private CloseAccountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository> provider) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase newInstance(com.paypal.oslo.feature.settings.closeaccount.domain.repository.CloseAccountRepository closeAccountRepository) {
        return new com.paypal.oslo.feature.settings.closeaccount.domain.usecase.CloseAccountUseCase(closeAccountRepository);
    }
}
