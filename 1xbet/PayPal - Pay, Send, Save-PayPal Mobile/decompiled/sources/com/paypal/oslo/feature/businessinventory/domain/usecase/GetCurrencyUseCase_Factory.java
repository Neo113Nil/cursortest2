package com.paypal.oslo.feature.businessinventory.domain.usecase;

/* loaded from: classes11.dex */
public final class GetCurrencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighResolutionOutputSizeshNQ4ISI;

    private GetCurrencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase(userStore);
    }
}
