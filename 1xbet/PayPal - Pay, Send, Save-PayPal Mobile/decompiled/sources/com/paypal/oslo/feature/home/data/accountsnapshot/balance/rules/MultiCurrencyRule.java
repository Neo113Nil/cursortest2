package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/MultiCurrencyRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;)V", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "draftItem", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "evaluate", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "Camera2StreamConfigurationMap", "", "priority", com.visa.cbp.getEncExpo.warmup, "getPriority", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiCurrencyRule implements com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule {
    public static final int $stable = 8;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider Camera2StreamConfigurationMap;
    private final int priority;

    @javax.inject.Inject
    public MultiCurrencyRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceStringProvider, "");
        this.Camera2StreamConfigurationMap = balanceStringProvider;
        this.priority = 1;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule
    public final int getPriority() {
        return this.priority;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem evaluate(com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem draftItem, com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(draftItem, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balance = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.balance(data);
        if (balance == null) {
            return draftItem;
        }
        java.util.Iterator<com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Item> it = balance.getItems().iterator();
        java.lang.String str = null;
        while (it.hasNext()) {
            java.lang.String obj = it.next().getAvailable().getAmount().getMoneyFragment().getCurrencyCode().toString();
            if (str == null) {
                str = obj;
            } else if (!kotlin.jvm.internal.Intrinsics.areEqual(obj, str)) {
                copy = draftItem.copy((r32 & 1) != 0 ? draftItem.id : null, (r32 & 2) != 0 ? draftItem.type : null, (r32 & 4) != 0 ? draftItem.backgroundColor : null, (r32 & 8) != 0 ? draftItem.title : null, (r32 & 16) != 0 ? draftItem.titleColor : null, (r32 & 32) != 0 ? draftItem.amount : null, (r32 & 64) != 0 ? draftItem.amountColor : null, (r32 & 128) != 0 ? draftItem.description : this.Camera2StreamConfigurationMap.getEstimatedBalance(), (r32 & 256) != 0 ? draftItem.footer : null, (r32 & 512) != 0 ? draftItem.footerColor : null, (r32 & 1024) != 0 ? draftItem.footerIcon : null, (r32 & 2048) != 0 ? draftItem.footerIconColor : null, (r32 & 4096) != 0 ? draftItem.imageUrls : null, (r32 & 8192) != 0 ? draftItem.icons : null, (r32 & 16384) != 0 ? draftItem.instrumentation : null);
                return copy;
            }
        }
        return draftItem;
    }
}
