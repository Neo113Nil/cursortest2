package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class GenerateAffiliateUrlUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;

    private GenerateAffiliateUrlUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase newInstance(com.paypal.oslo.core.userstore.UserStore userStore) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.GenerateAffiliateUrlUseCase(userStore);
    }
}
