package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetHasSeenLandingUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository> getHighSpeedVideoFpsRanges;

    private GetHasSeenLandingUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl newInstance(com.paypal.oslo.feature.cashin.domain.repository.CashInPreferencesRepository cashInPreferencesRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetHasSeenLandingUseCaseImpl(cashInPreferencesRepository);
    }
}
