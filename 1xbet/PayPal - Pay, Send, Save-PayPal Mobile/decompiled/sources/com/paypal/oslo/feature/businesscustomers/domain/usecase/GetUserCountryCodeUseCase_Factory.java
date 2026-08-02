package com.paypal.oslo.feature.businesscustomers.domain.usecase;

/* loaded from: classes11.dex */
public final class GetUserCountryCodeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private GetUserCountryCodeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase(userStore);
    }
}
