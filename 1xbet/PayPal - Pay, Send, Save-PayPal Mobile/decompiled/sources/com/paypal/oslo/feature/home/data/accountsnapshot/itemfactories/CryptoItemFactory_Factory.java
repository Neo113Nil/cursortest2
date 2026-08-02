package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class CryptoItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> getHighSpeedVideoFpsRanges;

    private CryptoItemFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory newInstance(com.paypal.oslo.feature.home.domain.StringProvider stringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory(stringProvider);
    }
}
