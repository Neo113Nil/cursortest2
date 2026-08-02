package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0017X\u0096D¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceOnHoldRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;)V", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "draftItem", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "evaluate", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "", "priority", com.visa.cbp.getEncExpo.warmup, "getPriority", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalanceOnHoldRule implements com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider getHighSpeedVideoSizes;
    private final int priority;

    @javax.inject.Inject
    public BalanceOnHoldRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceStringProvider, "");
        this.getHighSpeedVideoSizes = balanceStringProvider;
        this.priority = 2;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule
    public final int getPriority() {
        return this.priority;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem evaluate(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem draftItem, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.math.BigDecimal bigDecimal;
        com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draftItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balance = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.balance(data);
        if (com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.hasMoneyOnHold(balance)) {
            bigDecimal = com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.moneyOnHoldAmount(balance);
            if (bigDecimal == null) {
                bigDecimal = java.math.BigDecimal.ZERO;
            }
        } else if (com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.hasTaxOnHold(balance)) {
            bigDecimal = com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.taxOnHoldAmount(balance);
            if (bigDecimal == null) {
                bigDecimal = java.math.BigDecimal.ZERO;
            }
        } else {
            bigDecimal = null;
        }
        if (bigDecimal == null) {
            return draftItem;
        }
        java.lang.String balanceOnHold = this.getHighSpeedVideoSizes.getBalanceOnHold(com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimal));
        com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon = com.paypal.oslo.feature.home.domain.model.HomeIcon.Warning;
        copy = draftItem.copy((r32 & 1) != 0 ? draftItem.id : null, (r32 & 2) != 0 ? draftItem.type : null, (r32 & 4) != 0 ? draftItem.backgroundColor : null, (r32 & 8) != 0 ? draftItem.title : null, (r32 & 16) != 0 ? draftItem.titleColor : null, (r32 & 32) != 0 ? draftItem.amount : null, (r32 & 64) != 0 ? draftItem.amountColor : null, (r32 & 128) != 0 ? draftItem.description : null, (r32 & 256) != 0 ? draftItem.footer : balanceOnHold, (r32 & 512) != 0 ? draftItem.footerColor : com.paypal.oslo.feature.home.domain.model.FooterColors.Negative.INSTANCE, (r32 & 1024) != 0 ? draftItem.footerIcon : homeIcon, (r32 & 2048) != 0 ? draftItem.footerIconColor : com.paypal.oslo.feature.home.domain.model.FooterColors.Negative.INSTANCE, (r32 & 4096) != 0 ? draftItem.imageUrls : null, (r32 & 8192) != 0 ? draftItem.icons : null, (r32 & 16384) != 0 ? draftItem.instrumentation : null);
        return copy;
    }
}
