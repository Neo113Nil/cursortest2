package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class PyUsdItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> getHighSpeedVideoSizes;

    private PyUsdItemFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory newInstance(com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory(stringProvider);
    }
}
