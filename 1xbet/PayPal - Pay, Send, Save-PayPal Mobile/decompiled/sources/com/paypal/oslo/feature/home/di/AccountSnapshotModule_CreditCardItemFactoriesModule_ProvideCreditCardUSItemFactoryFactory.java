package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideCreditCardUSItemFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory get() {
        return provideCreditCardUSItemFactory();
    }

    public static com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideCreditCardUSItemFactoryFactory create() {
        return com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideCreditCardUSItemFactoryFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideCreditCardUSItemFactory() {
        return (com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.INSTANCE.provideCreditCardUSItemFactory());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideCreditCardUSItemFactoryFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideCreditCardUSItemFactoryFactory();

        private InstanceHolder() {
        }
    }
}
