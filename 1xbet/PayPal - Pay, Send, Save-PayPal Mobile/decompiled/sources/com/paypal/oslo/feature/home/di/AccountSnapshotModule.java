package com.paypal.oslo.feature.home.di;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/di/AccountSnapshotModule;", "", "AccountSnapshotProviderModule", "BalanceRulesModule", "StringProvidersModule", "ItemFactoriesModule", "CreditCardItemFactoriesModule"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface AccountSnapshotModule {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/di/AccountSnapshotModule$AccountSnapshotProviderModule;", "", "Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotProviderImpl;", "provider", "Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;", "bindAccountSnapshotProvider", "(Lcom/paypal/oslo/feature/home/ui/accountsnapshot/AccountSnapshotProviderImpl;)Lcom/paypal/oslo/feature/home/api/AccountSnapshotProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.Module
    /* loaded from: classes12.dex */
    public interface AccountSnapshotProviderModule {
        @dagger.Binds
        com.paypal.oslo.feature.home.api.AccountSnapshotProvider bindAccountSnapshotProvider(com.paypal.oslo.feature.home.ui.accountsnapshot.AccountSnapshotProviderImpl provider);
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/di/AccountSnapshotModule$BalanceRulesModule;", "", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/MultiCurrencyRule;", "rule", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "bindBalanceMultiCurrencyRule", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/MultiCurrencyRule;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/NegativeBalanceRule;", "bindNegativeBalanceRule", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/NegativeBalanceRule;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceOnHoldRule;", "bindBalanceOnHoldRule", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceOnHoldRule;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/DebitCardLockedRule;", "bindDebitCardLockedRule", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/DebitCardLockedRule;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.Module
    /* loaded from: classes12.dex */
    public interface BalanceRulesModule {
        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule bindBalanceMultiCurrencyRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.MultiCurrencyRule rule);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule bindBalanceOnHoldRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceOnHoldRule rule);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule bindDebitCardLockedRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.DebitCardLockedRule rule);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule bindNegativeBalanceRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.NegativeBalanceRule rule);
    }

    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\rH'¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0010H'¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0013H'¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0016H'¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0019H'¢\u0006\u0004\b\u001a\u0010\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/di/AccountSnapshotModule$ItemFactoriesModule;", "", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AddPaymentMethodItemFactory;", "factory", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "bindAddPaymentMethodItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AddPaymentMethodItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BalanceItemFactory;", "bindBalanceItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BalanceItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/SavingsItemFactory;", "bindSavingsItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/SavingsItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CryptoItemFactory;", "bindCryptoItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/CryptoItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BnplItemFactory;", "bindBnplItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BnplItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BnplEmptyStateItemFactory;", "bindBnplEmptyStateItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BnplEmptyStateItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/PyUsdItemFactory;", "bindPyUsdItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/PyUsdItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/RewardsItemFactory;", "bindRewardsItemFactory", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/RewardsItemFactory;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.Module
    /* loaded from: classes12.dex */
    public interface ItemFactoriesModule {
        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindAddPaymentMethodItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AddPaymentMethodItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindBalanceItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindBnplEmptyStateItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplEmptyStateItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindBnplItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BnplItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindCryptoItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CryptoItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindPyUsdItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.PyUsdItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindRewardsItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.RewardsItemFactory factory);

        @javax.inject.Singleton
        @dagger.Binds
        @dagger.multibindings.IntoSet
        com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory bindSavingsItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.SavingsItemFactory factory);
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/home/di/AccountSnapshotModule$StringProvidersModule;", "", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProviderImpl;", "stringProvider", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "bindBalanceStringProvider", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProviderImpl;)Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "Lcom/paypal/oslo/feature/home/data/ResourceRewardsStringProvider;", "Lcom/paypal/oslo/feature/home/domain/RewardsStringProvider;", "bindRewardsStringProvider", "(Lcom/paypal/oslo/feature/home/data/ResourceRewardsStringProvider;)Lcom/paypal/oslo/feature/home/domain/RewardsStringProvider;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.Module
    /* loaded from: classes12.dex */
    public interface StringProvidersModule {
        @dagger.Binds
        com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider bindBalanceStringProvider(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProviderImpl stringProvider);

        @dagger.Binds
        com.paypal.oslo.feature.home.domain.RewardsStringProvider bindRewardsStringProvider(com.paypal.oslo.feature.home.data.ResourceRewardsStringProvider stringProvider);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u0006J\u000f\u0010\u000b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/feature/home/di/AccountSnapshotModule$CreditCardItemFactoriesModule;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "providePayPalMastercardItemFactory", "()Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "provideCreditCardUSItemFactory", "providePayPalCreditItemFactory", "provideEbayMastercardItemFactory", "provideConsumerRewardsItemFactory", "provideSmartConnectItemFactory"}, k = 1, mv = {2, 3, 0}, xi = 48)
    @dagger.Module
    public static final class CreditCardItemFactoriesModule {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule INSTANCE = new com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule();

        private CreditCardItemFactoriesModule() {
        }

        @dagger.Provides
        @javax.inject.Singleton
        @dagger.multibindings.IntoSet
        public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory providePayPalMastercardItemFactory() {
            return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory(11, com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalMastercard.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.m14860$r8$lambda$WKCihEzAGtYdugrYU89kibYZiU((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$SGZnoe2FDDxswhwju3sgLsF1IMs((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, "ppmc");
        }

        @dagger.Provides
        @javax.inject.Singleton
        @dagger.multibindings.IntoSet
        public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideCreditCardUSItemFactory() {
            return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory(8, com.paypal.oslo.feature.home.api.AccountSnapshotType.CreditCardUS.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.m14863$r8$lambda$mhXDSDg1uynMNmVDNdBPeQEmk4((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.m14862$r8$lambda$e7pAJRZ_15CmS799dMhn1Gdag((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, "ppcc");
        }

        @dagger.Provides
        @javax.inject.Singleton
        @dagger.multibindings.IntoSet
        public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory providePayPalCreditItemFactory() {
            return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory(9, com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalCredit.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$oym8qAFOnkFmCcse5zynUrk7uWY((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$J80uw7J_G0ORuTyuYXN3TSKNOaI((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, "ppc");
        }

        @dagger.Provides
        @javax.inject.Singleton
        @dagger.multibindings.IntoSet
        public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideEbayMastercardItemFactory() {
            return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory(10, com.paypal.oslo.feature.home.api.AccountSnapshotType.EbayMastercard.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.m14861$r8$lambda$bFN7Iu29HQgnIkMC3NBMF5_M4A((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$rBalpvy9QjPy9m5FBVkboIUoW30((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, "ebaymc");
        }

        @dagger.Provides
        @javax.inject.Singleton
        @dagger.multibindings.IntoSet
        public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideConsumerRewardsItemFactory() {
            return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory(7, com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalConsumerRewards.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.m14864$r8$lambda$tpeDUBW1yo650Y4pjc9E7TAM3M((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$GZtRVE7KDioWBPPEq4kbpbbKoSQ((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, "cbmc");
        }

        @dagger.Provides
        @javax.inject.Singleton
        @dagger.multibindings.IntoSet
        public final com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory provideSmartConnectItemFactory() {
            return new com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.CreditCardItemFactory(12, com.paypal.oslo.feature.home.api.AccountSnapshotType.SmartConnect.INSTANCE, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$vCbHDevRErNntPmdMad9ZaastT4((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.home.di.AccountSnapshotModule$CreditCardItemFactoriesModule$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(java.lang.Object obj) {
                    return com.paypal.oslo.feature.home.di.AccountSnapshotModule.CreditCardItemFactoriesModule.$r8$lambda$05GWZ1DLrpdBVKV42kkhxqquTJE((com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data) obj);
                }
            }, "smtcnct");
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields $r8$lambda$05GWZ1DLrpdBVKV42kkhxqquTJE(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnctnba smtccnctnba;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit smartConnect = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.smartConnect(data);
            if (smartConnect == null || (smtccnctnba = smartConnect.getSmtccnctnba()) == null) {
                return null;
            }
            return smtccnctnba.getHomeCreditNextBestActionFields();
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields $r8$lambda$GZtRVE7KDioWBPPEq4kbpbbKoSQ(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsnba rewardsnba;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit consumerRewards = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.consumerRewards(data);
            if (consumerRewards == null || (rewardsnba = consumerRewards.getRewardsnba()) == null) {
                return null;
            }
            return rewardsnba.getHomeCreditNextBestActionFields();
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields $r8$lambda$J80uw7J_G0ORuTyuYXN3TSKNOaI(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment.Usv2nba usv2nba;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment.RevolvingCredit payPalCredit = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.payPalCredit(data);
            if (payPalCredit == null || (usv2nba = payPalCredit.getUsv2nba()) == null) {
                return null;
            }
            return usv2nba.getHomeCreditNextBestActionFields();
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields $r8$lambda$SGZnoe2FDDxswhwju3sgLsF1IMs(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmcnba ppmcnba;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit payPalMastercard = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.payPalMastercard(data);
            if (payPalMastercard == null || (ppmcnba = payPalMastercard.getPpmcnba()) == null) {
                return null;
            }
            return ppmcnba.getHomeCreditNextBestActionFields();
        }

        /* renamed from: $r8$lambda$WK-CihEzAGtYdugrYU89kibYZiU, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields m14860$r8$lambda$WKCihEzAGtYdugrYU89kibYZiU(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.Ppmc ppmc;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalMasterCardComponentFragment.RevolvingCredit payPalMastercard = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.payPalMastercard(data);
            if (payPalMastercard == null || (ppmc = payPalMastercard.getPpmc()) == null) {
                return null;
            }
            return ppmc.getHomeCreditAccountFields();
        }

        /* renamed from: $r8$lambda$b-FN7Iu29HQgnIkMC3NBMF5_M4A, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields m14861$r8$lambda$bFN7Iu29HQgnIkMC3NBMF5_M4A(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment.Ebaymc ebaymc;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment.RevolvingCredit ebayMastercard = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.ebayMastercard(data);
            if (ebayMastercard == null || (ebaymc = ebayMastercard.getEbaymc()) == null) {
                return null;
            }
            return ebaymc.getHomeCreditAccountFields();
        }

        /* renamed from: $r8$lambda$e7pAJRZ_-15CmS799dMhn1Gd-ag, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields m14862$r8$lambda$e7pAJRZ_15CmS799dMhn1Gdag(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment.Ccusnba ccusnba;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment.RevolvingCredit creditCardUS = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.creditCardUS(data);
            if (creditCardUS == null || (ccusnba = creditCardUS.getCcusnba()) == null) {
                return null;
            }
            return ccusnba.getHomeCreditNextBestActionFields();
        }

        /* renamed from: $r8$lambda$mhXDSDg-1uynMNmVDNdBPeQEmk4, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields m14863$r8$lambda$mhXDSDg1uynMNmVDNdBPeQEmk4(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment.Ccus ccus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditCardUSCardComponentFragment.RevolvingCredit creditCardUS = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.creditCardUS(data);
            if (creditCardUS == null || (ccus = creditCardUS.getCcus()) == null) {
                return null;
            }
            return ccus.getHomeCreditAccountFields();
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields $r8$lambda$oym8qAFOnkFmCcse5zynUrk7uWY(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment.Usv2 usv2;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditPayPalCreditComponentFragment.RevolvingCredit payPalCredit = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.payPalCredit(data);
            if (payPalCredit == null || (usv2 = payPalCredit.getUsv2()) == null) {
                return null;
            }
            return usv2.getHomeCreditAccountFields();
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditNextBestActionFields $r8$lambda$rBalpvy9QjPy9m5FBVkboIUoW30(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment.Ebaynba ebaynba;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditEbayMastercardComponentFragment.RevolvingCredit ebayMastercard = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.ebayMastercard(data);
            if (ebayMastercard == null || (ebaynba = ebayMastercard.getEbaynba()) == null) {
                return null;
            }
            return ebaynba.getHomeCreditNextBestActionFields();
        }

        /* renamed from: $r8$lambda$tpeDU-BW1yo650Y4pjc9E7TAM3M, reason: not valid java name */
        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields m14864$r8$lambda$tpeDUBW1yo650Y4pjc9E7TAM3M(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.Rewardsus rewardsus;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditConsumerRewardsComponentFragment.RevolvingCredit consumerRewards = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.consumerRewards(data);
            if (consumerRewards == null || (rewardsus = consumerRewards.getRewardsus()) == null) {
                return null;
            }
            return rewardsus.getHomeCreditAccountFields();
        }

        public static /* synthetic */ com.paypal.oslo.feature.home.graphql.fragment.HomeCreditAccountFields $r8$lambda$vCbHDevRErNntPmdMad9ZaastT4(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.Smtccnct smtccnct;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
            com.paypal.oslo.feature.home.graphql.fragment.CreditSmartConnectComponentFragment.RevolvingCredit smartConnect = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.smartConnect(data);
            if (smartConnect == null || (smtccnct = smartConnect.getSmtccnct()) == null) {
                return null;
            }
            return smtccnct.getHomeCreditAccountFields();
        }
    }
}
