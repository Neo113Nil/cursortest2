package com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase;

/* loaded from: classes15.dex */
public final class GetUserCountryCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRanges;

    private GetUserCountryCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.subscriptions.updatefi.domain.usecase.GetUserCountryCodeUseCase(userStore);
    }
}
