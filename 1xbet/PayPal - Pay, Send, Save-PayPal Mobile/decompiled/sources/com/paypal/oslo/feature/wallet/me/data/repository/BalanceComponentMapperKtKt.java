package com.paypal.oslo.feature.wallet.me.data.repository;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\b\u001a\u00020\u0007*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBalanceComponent;", "Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;", "manager", "Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceProduct;", "asProduct", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$OnBalanceComponent;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceProduct;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Balances;", "Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;", "asOverview", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$Balances;Lcom/paypal/oslo/feature/wallet/common/config/WalletFeatureManager;)Lcom/paypal/oslo/feature/wallet/me/domain/balance/BalanceOverview;", "Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalAvailableAmount;", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "asMoney", "(Lcom/paypal/oslo/feature/wallet/graphql/GetWalletComponentsQuery$TotalAvailableAmount;)Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BalanceComponentMapperKtKt {
    public static final com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct asProduct(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.OnBalanceComponent onBalanceComponent, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(onBalanceComponent, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Wallet wallet = onBalanceComponent.getWallet();
        if (wallet != null) {
            return new com.paypal.oslo.feature.wallet.me.domain.balance.BalanceProduct(true, asOverview(wallet.getBalances(), walletFeatureManager));
        }
        return null;
    }

    public static final com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview asOverview(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.Balances balances, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balances, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(walletFeatureManager, "");
        com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney = asMoney(balances.getTotalAvailableAmount());
        java.lang.Boolean prepaidStatus = balances.getPrepaidStatus();
        boolean booleanValue = prepaidStatus != null ? prepaidStatus.booleanValue() : false;
        java.lang.Boolean accountInfoAvailable = balances.getAccountInfoAvailable();
        boolean booleanValue2 = accountInfoAvailable != null ? accountInfoAvailable.booleanValue() : false;
        boolean isBalanceAddMoneyEnabled = walletFeatureManager.isBalanceAddMoneyEnabled();
        java.lang.Double doubleOrNull = kotlin.text.StringsKt.toDoubleOrNull(balances.getTotalAvailableAmount().getOnMoney().getValue());
        return new com.paypal.oslo.feature.wallet.me.domain.balance.BalanceOverview(asMoney, booleanValue, booleanValue2, isBalanceAddMoneyEnabled, doubleOrNull != null && doubleOrNull.doubleValue() > 0.0d, null, 32, null);
    }

    public static final com.paypal.oslo.feature.wallet.common.domain.model.Money asMoney(com.paypal.oslo.feature.wallet.graphql.GetWalletComponentsQuery.TotalAvailableAmount totalAvailableAmount) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(totalAvailableAmount, "");
        return new com.paypal.oslo.feature.wallet.common.domain.model.Money(totalAvailableAmount.getOnMoney().getCurrencyCode().toString(), totalAvailableAmount.getOnMoney().getValue());
    }
}
