package com.paypal.oslo.feature.home.di;

/* loaded from: classes5.dex */
public final class AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideConsumerRewardsItemFactoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory get() {
        return provideConsumerRewardsItemFactory();
    }

    public static com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideConsumerRewardsItemFactoryFactory create() {
        return com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideConsumerRewardsItemFactoryFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideConsumerRewardsItemFactory() {
        return (com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.INSTANCE.provideConsumerRewardsItemFactory());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideConsumerRewardsItemFactoryFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.home.di.AccountSnapshotModule_CreditCardItemFactoriesModule_ProvideConsumerRewardsItemFactoryFactory();

        private InstanceHolder() {
        }
    }
}
