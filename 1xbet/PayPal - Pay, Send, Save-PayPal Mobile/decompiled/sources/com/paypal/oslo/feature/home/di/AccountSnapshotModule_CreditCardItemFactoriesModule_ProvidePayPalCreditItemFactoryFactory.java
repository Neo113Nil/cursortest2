package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalCreditItemFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory get() {
        return providePayPalCreditItemFactory();
    }

    public static com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalCreditItemFactoryFactory create() {
        return com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalCreditItemFactoryFactory.InstanceHolder.getHighSpeedVideoSizes;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory providePayPalCreditItemFactory() {
        return (com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.INSTANCE.providePayPalCreditItemFactory());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalCreditItemFactoryFactory getHighSpeedVideoSizes = new com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvidePayPalCreditItemFactoryFactory();

        private InstanceHolder() {
        }
    }
}
