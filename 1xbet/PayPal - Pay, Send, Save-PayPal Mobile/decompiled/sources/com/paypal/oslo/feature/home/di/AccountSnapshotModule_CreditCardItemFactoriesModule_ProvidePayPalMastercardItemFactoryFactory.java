package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalMastercardItemFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory get() {
        return providePayPalMastercardItemFactory();
    }

    public static com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalMastercardItemFactoryFactory create() {
        return com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalMastercardItemFactoryFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory providePayPalMastercardItemFactory() {
        return (com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.INSTANCE.providePayPalMastercardItemFactory());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalMastercardItemFactoryFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalMastercardItemFactoryFactory();

        private InstanceHolder() {
        }
    }
}
