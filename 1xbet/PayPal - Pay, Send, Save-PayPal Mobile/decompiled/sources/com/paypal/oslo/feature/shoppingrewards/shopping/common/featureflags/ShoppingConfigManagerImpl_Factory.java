package com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags;

/* loaded from: classes15.dex */
public final class ShoppingConfigManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private ShoppingConfigManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl newInstance(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.shoppingrewards.shopping.common.featureflags.ShoppingConfigManagerImpl(featureGate);
    }
}
