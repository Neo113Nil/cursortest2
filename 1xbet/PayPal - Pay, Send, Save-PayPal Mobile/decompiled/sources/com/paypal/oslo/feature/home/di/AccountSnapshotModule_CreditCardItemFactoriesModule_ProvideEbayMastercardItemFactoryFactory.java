package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideEbayMastercardItemFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory get() {
        return provideEbayMastercardItemFactory();
    }

    public static com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideEbayMastercardItemFactoryFactory create() {
        return com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideEbayMastercardItemFactoryFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideEbayMastercardItemFactory() {
        return (com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.INSTANCE.provideEbayMastercardItemFactory());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideEbayMastercardItemFactoryFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideEbayMastercardItemFactoryFactory();

        private InstanceHolder() {
        }
    }
}
