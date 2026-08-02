package com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase;

/* loaded from: classes15.dex */
public final class EnrollInOfferUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository> Camera2StreamConfigurationMap;

    private EnrollInOfferUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.repository.ShoppingIABRepository shoppingIABRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.domain.usecase.EnrollInOfferUseCase(shoppingIABRepository);
    }
}
