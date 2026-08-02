package com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository;

/* loaded from: classes15.dex */
public final class RedeemMethodsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RedeemMethodsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> Camera2StreamConfigurationMap;

    private RedeemMethodsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RedeemMethodsRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RedeemMethodsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RedeemMethodsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RedeemMethodsRepositoryImpl newInstance(com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.data.repository.RedeemMethodsRepositoryImpl(stringResourceProvider);
    }
}
