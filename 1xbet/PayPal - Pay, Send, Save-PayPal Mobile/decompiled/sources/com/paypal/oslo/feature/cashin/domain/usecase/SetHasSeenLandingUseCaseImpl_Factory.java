package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class SetHasSeenLandingUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository> getHighResolutionOutputSizeshNQ4ISI;

    private SetHasSeenLandingUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl newInstance(com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository cashInPreferencesRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.SetHasSeenLandingUseCaseImpl(cashInPreferencesRepository);
    }
}
