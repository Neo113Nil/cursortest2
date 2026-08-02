package com.paypal.oslo.feature.shoppingrewards.shopping.common.di;

/* loaded from: classes5.dex */
public final class ShoppingStorageModule_ProvideShoppingContinueStorageFactory implements dagger.internal.Factory<com.paypal.oslo.core.persistence.appstorage.AppStorage> {
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoSizes;

    private ShoppingStorageModule_ProvideShoppingContinueStorageFactory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.persistence.appstorage.AppStorage get() {
        return provideShoppingContinueStorage(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingStorageModule_ProvideShoppingContinueStorageFactory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingStorageModule_ProvideShoppingContinueStorageFactory(provider);
    }

    public static com.paypal.oslo.core.persistence.appstorage.AppStorage provideShoppingContinueStorage(android.content.Context context) {
        return (com.paypal.oslo.core.persistence.appstorage.AppStorage) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.shoppingrewards.shopping.common.di.ShoppingStorageModule.INSTANCE.provideShoppingContinueStorage(context));
    }
}
