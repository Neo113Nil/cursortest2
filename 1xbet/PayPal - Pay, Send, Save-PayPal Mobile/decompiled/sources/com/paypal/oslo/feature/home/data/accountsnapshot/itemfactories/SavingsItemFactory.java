package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/SavingsItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "<init>", "()V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class SavingsItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 0;

    @javax.inject.Inject
    public SavingsItemFactory() {
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.math.BigDecimal bigDecimal;
        java.lang.Object annualPercentageYield;
        java.lang.String obj;
        com.paypal.oslo.feature.home.graphql.fragment.MoneyFragment moneyFragment;
        java.lang.String value;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.Savings savings = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.savings(data);
        java.lang.String str = null;
        if (savings != null) {
            com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccount savingsAccount = savings.getSavingsAccount();
            if ((savingsAccount != null ? savingsAccount.getAccountStatus() : null) == com.paypal.oslo.api.graphql.schema.type.SavingsAccountStatus.ACTIVE) {
                com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default r2 = com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE;
                com.paypal.oslo.feature.home.api.AccountSnapshotType.Savings savings2 = com.paypal.oslo.feature.home.api.AccountSnapshotType.Savings.INSTANCE;
                com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.TotalBalance totalBalance = savings.getSavingsAccount().getTotalBalance();
                if (totalBalance == null || (moneyFragment = totalBalance.getMoneyFragment()) == null || (value = moneyFragment.getValue()) == null || (bigDecimal = kotlin.text.StringsKt.toBigDecimalOrNull(value)) == null) {
                    bigDecimal = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
                java.lang.String formatAmount = com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimal);
                com.paypal.oslo.feature.home.graphql.fragment.SavingsComponentFragment.SavingsAccountFeatures savingsAccountFeatures = savings.getSavingsAccountFeatures();
                if (savingsAccountFeatures != null && (annualPercentageYield = savingsAccountFeatures.getAnnualPercentageYield()) != null && (obj = annualPercentageYield.toString()) != null) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("APY ");
                    sb.append(obj);
                    sb.append("%");
                    str = sb.toString();
                }
                return new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem("savings", savings2, r2, com.paypal.oslo.feature.smartroute.ui.mock.PreviewConstants.SAVINGS_ACCOUNT_NAME, null, formatAmount, null, "Available balance", str, com.paypal.oslo.feature.home.domain.model.FooterColors.Positive.INSTANCE, null, null, kotlin.collections.CollectionsKt.listOf("https://www.paypalobjects.com/home-nav/Savings-4xCard.png"), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
            }
        }
        return null;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return 4;
    }
}
