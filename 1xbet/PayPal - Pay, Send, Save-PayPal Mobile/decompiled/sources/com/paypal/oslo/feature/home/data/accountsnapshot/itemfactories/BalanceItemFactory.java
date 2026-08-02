package com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B$\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0011\u0010\u0007\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0012\u001a\r\u0012\t\u0012\u00070\u0005¢\u0006\u0002\b\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/BalanceItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "balanceStringProvider", "", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/rules/BalanceDisplayRule;", "Lkotlin/jvm/JvmSuppressWildcards;", "balanceRules", "<init>", "(Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;Ljava/util/Set;)V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "rank", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)I", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "createItem", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/balance/BalanceStringProvider;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/Set;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class BalanceItemFactory implements com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule> Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public BalanceItemFactory(com.paypal.oslo.feature.home.data.accountsnapshot.balance.BalanceStringProvider balanceStringProvider, java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(balanceStringProvider, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighResolutionOutputSizeshNQ4ISI = balanceStringProvider;
        this.Camera2StreamConfigurationMap = set;
    }

    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    public final int rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        return com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.isPayPalBalanceZero(data) ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x008b, code lost:
    
        if (r3 == null) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        java.lang.String str;
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.Front front;
        java.lang.Object referenceUrl;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        com.paypal.oslo.feature.home.graphql.fragment.BalanceComponentFragment.Balances balance = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.balance(data);
        com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument debitInstrument = null;
        if (balance != null) {
            if (!com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.isPrepaid(balance)) {
                balance = null;
            }
            if (balance != null) {
                java.util.List<com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument> debitInstruments = com.paypal.oslo.feature.home.data.accountsnapshot.WalletComponentExtractorKt.debitInstruments(data);
                if (debitInstruments != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    for (java.lang.Object obj : debitInstruments) {
                        if (((com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument) obj).getProductName() == com.paypal.oslo.api.graphql.schema.type.DebitInstrumentProductName.CONSUMER_DEBIT_CARD) {
                            arrayList.add(obj);
                        }
                    }
                    java.util.ArrayList arrayList2 = arrayList;
                    java.util.Iterator it = arrayList2.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (((com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument) next).getDisplayState() == com.paypal.oslo.api.graphql.schema.type.DebitInstrumentDisplayState.LOCKED) {
                            debitInstrument = next;
                            break;
                        }
                    }
                    debitInstrument = debitInstrument;
                    if (debitInstrument == null) {
                        debitInstrument = (com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.DebitInstrument) kotlin.collections.CollectionsKt.firstOrNull((java.util.List) arrayList2);
                    }
                }
                if (debitInstrument != null) {
                    com.paypal.oslo.feature.home.graphql.fragment.DebitInstrumentsComponentFragment.SmallImage smallImage = debitInstrument.getSmallImage();
                    if (smallImage == null || (front = smallImage.getFront()) == null || (referenceUrl = front.getReferenceUrl()) == null || (str = referenceUrl.toString()) == null) {
                        str = "https://www.paypalobjects.com/home-nav/PayPal-Debit-Card.png";
                    }
                }
                str = "https://www.paypalobjects.com/home-nav/Balance-4xCard.png";
                java.math.BigDecimal bigDecimal = com.paypal.oslo.feature.home.data.accountsnapshot.balance.UtilsKt.totalAvailableAmount(balance);
                if (bigDecimal == null) {
                    bigDecimal = java.math.BigDecimal.ZERO;
                }
                kotlin.jvm.internal.Intrinsics.checkNotNull(bigDecimal);
                java.lang.String formatAmount = com.paypal.oslo.feature.home.data.accountsnapshot.MoneyUtilsKt.formatAmount(bigDecimal);
                java.lang.String str2 = "balance";
                com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem accountSnapshotItem = new com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem(str2, com.paypal.oslo.feature.home.api.AccountSnapshotType.PayPalBalance.INSTANCE, com.paypal.oslo.feature.home.domain.model.BackgroundColors.Default.INSTANCE, this.getHighResolutionOutputSizeshNQ4ISI.getPayPalBalance(), null, formatAmount, null, null, null, null, null, null, kotlin.collections.CollectionsKt.listOf(str), kotlin.collections.CollectionsKt.emptyList(), null, 16448, null);
                java.util.Iterator it2 = kotlin.collections.CollectionsKt.sortedWith(this.Camera2StreamConfigurationMap, new java.util.Comparator() { // from class: com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.BalanceItemFactory$createItem$$inlined$sortedBy$1
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule) t).getPriority()), java.lang.Integer.valueOf(((com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule) t2).getPriority()));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    accountSnapshotItem = ((com.paypal.oslo.feature.home.data.accountsnapshot.balance.rules.BalanceDisplayRule) it2.next()).evaluate(accountSnapshotItem, data);
                }
                return accountSnapshotItem;
            }
        }
        return null;
    }
}
