package com.paypal.oslo.feature.balance.domain.usecase;

/* loaded from: classes11.dex */
public final class GetAccountTypeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private GetAccountTypeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.balance.domain.usecase.GetAccountTypeUseCase(userStore);
    }
}
