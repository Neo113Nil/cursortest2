package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

/* loaded from: classes12.dex */
public final class AddPaymentMethodItemFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.data.ResourceStringProvider> getHighSpeedVideoSizes;

    private AddPaymentMethodItemFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.data.ResourceStringProvider> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.data.ResourceStringProvider> provider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory_Factory(provider);
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory newInstance(com.paypal.oslo.feature.home.data.ResourceStringProvider resourceStringProvider) {
        return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory(resourceStringProvider);
    }
}
