package com.paypal.oslo.feature.home.data.accountsnapshot.balance;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0015\u0010\n\u001a\u00020\u0001*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\f\u0010\b\u001a\u0015\u0010\r\u001a\u00020\u0001*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\r\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000e\u0010\b\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u000f\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", "", "isPayPalBalanceZero", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Z", "hasAnyFiTile", "Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;", "Ljava/math/BigDecimal;", "totalAvailableAmount", "(Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;)Ljava/math/BigDecimal;", "totalReservedAmount", "hasMoneyOnHold", "(Lcom/paypal/oslo/feature/home/graphql/fragment/BalanceComponentFragment$Balances;)Z", "moneyOnHoldAmount", "hasTaxOnHold", "taxOnHoldAmount", "isPrepaid"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    public static final boolean isPayPalBalanceZero(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.math.BigDecimal bigDecimal;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balance = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.balance(data);
        return balance == null || (bigDecimal = totalAvailableAmount(balance)) == null || bigDecimal.compareTo(java.math.BigDecimal.ZERO) == 0;
    }

    public static final boolean hasAnyFiTile(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return (com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.rewardsOverview(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.crypto(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.pyUsd(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.bnpl(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.bnplEmptyState(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.savings(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.payPalMastercard(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.creditCardUS(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.payPalCredit(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.ebayMastercard(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.consumerRewards(data) == null && com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.smartConnect(data) == null) ? false : true;
    }

    public static final java.math.BigDecimal totalAvailableAmount(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalAvailableAmount totalAvailableAmount;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        if (balances == null || (totalAvailableAmount = balances.getTotalAvailableAmount()) == null || (moneyFragment = totalAvailableAmount.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toBigDecimalOrNull(value);
    }

    public static final java.math.BigDecimal totalReservedAmount(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TotalReservedAmount totalReservedAmount;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        if (balances == null || (totalReservedAmount = balances.getTotalReservedAmount()) == null || (moneyFragment = totalReservedAmount.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toBigDecimalOrNull(value);
    }

    public static final boolean hasMoneyOnHold(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        if (balances != null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(balances.getHasMoneyOnHold(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public static final java.math.BigDecimal moneyOnHoldAmount(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.MoneyOnHoldAmount moneyOnHoldAmount;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        if (balances == null || (moneyOnHoldAmount = balances.getMoneyOnHoldAmount()) == null || (moneyFragment = moneyOnHoldAmount.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toBigDecimalOrNull(value);
    }

    public static final boolean hasTaxOnHold(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        if (balances != null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(balances.getHasTaxOnHold(), java.lang.Boolean.TRUE);
        }
        return false;
    }

    public static final java.math.BigDecimal taxOnHoldAmount(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.TaxOnHoldAmount taxOnHoldAmount;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        if (balances == null || (taxOnHoldAmount = balances.getTaxOnHoldAmount()) == null || (moneyFragment = taxOnHoldAmount.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null) {
            return null;
        }
        return kotlin.text.StringsKt.toBigDecimalOrNull(value);
    }

    public static final boolean isPrepaid(com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balances) {
        if (balances != null) {
            return kotlin.jvm.internal.Intrinsics.areEqual(balances.getPrepaidStatus(), java.lang.Boolean.TRUE);
        }
        return false;
    }
}
