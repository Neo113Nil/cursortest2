package com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u000f8\u0017X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/DebitCardLockedRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "stringProvider", "<init>", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;)V", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "draftItem", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "evaluate", "(Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "getHighSpeedVideoFpsRangesFor", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "getHighSpeedVideoSizes", "", "priority", com.visa.cbp.getEncExpo.warmup, "getPriority", "()I"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DebitCardLockedRule implements com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider getHighSpeedVideoSizes;
    private final int priority;

    @javax.inject.Inject
    public DebitCardLockedRule(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceStringProvider, "");
        this.getHighSpeedVideoSizes = balanceStringProvider;
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
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> debitInstruments = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.debitInstruments(data);
        if (debitInstruments == null) {
            return draftItem;
        }
        java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> list = debitInstruments;
        if ((list instanceof java.util.Collection) && list.isEmpty()) {
            return draftItem;
        }
        for (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument debitInstrument : list) {
            if (debitInstrument.getProductName() == com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_DEBIT_CARD && debitInstrument.getDisplayState() == com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.LOCKED) {
                java.lang.String debitCardLocked = this.getHighSpeedVideoSizes.getDebitCardLocked();
                com.paypal.oslo.feature.home.domain.model.HomeIcon homeIcon = com.paypal.oslo.feature.home.domain.model.HomeIcon.Information;
                copy = draftItem.copy((r32 & 1) != 0 ? draftItem.id : null, (r32 & 2) != 0 ? draftItem.type : null, (r32 & 4) != 0 ? draftItem.backgroundColor : null, (r32 & 8) != 0 ? draftItem.title : null, (r32 & 16) != 0 ? draftItem.titleColor : null, (r32 & 32) != 0 ? draftItem.amount : null, (r32 & 64) != 0 ? draftItem.amountColor : null, (r32 & 128) != 0 ? draftItem.description : null, (r32 & 256) != 0 ? draftItem.footer : debitCardLocked, (r32 & 512) != 0 ? draftItem.footerColor : com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE, (r32 & 1024) != 0 ? draftItem.footerIcon : homeIcon, (r32 & 2048) != 0 ? draftItem.footerIconColor : com.paypal.oslo.feature.home.domain.model.FooterColors.Warning.INSTANCE, (r32 & 4096) != 0 ? draftItem.imageUrls : null, (r32 & 8192) != 0 ? draftItem.icons : null, (r32 & 16384) != 0 ? draftItem.instrumentation : null);
                return copy;
            }
        }
        return draftItem;
    }
}
