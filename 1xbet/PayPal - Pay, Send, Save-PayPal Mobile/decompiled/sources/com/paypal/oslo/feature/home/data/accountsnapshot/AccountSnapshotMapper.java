package com.paypal.oslo.feature.home.data.accountsnapshot;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001c\b\u0007\u0012\u0011\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rR\u001f\u0010\u0010\u001a\r\u0012\t\u0012\u00070\u0003¢\u0006\u0002\b\u00040\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/home/data/accountsnapshot/AccountSnapshotMapper;", "", "", "Lcom/paypal/oslo/feature/home/data/accountsnapshot/itemfactories/AccountSnapshotItemFactory;", "Lkotlin/jvm/JvmSuppressWildcards;", "factories", "<init>", "(Ljava/util/Set;)V", "Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;", com.google.firebase.messaging.Constants.ScionAnalytics.MessageType.DATA_MESSAGE, "", "Lcom/paypal/oslo/feature/home/domain/model/AccountSnapshotItem;", "mapAccountSnapshot", "(Lcom/paypal/oslo/feature/home/graphql/GetAccountSnapshotQuery$Data;)Ljava/util/List;", "Camera2StreamConfigurationMap", "Ljava/util/Set;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AccountSnapshotMapper {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> getHighSpeedVideoFpsRanges;

    @javax.inject.Inject
    public AccountSnapshotMapper(java.util.Set<com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory> set) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(set, "");
        this.getHighSpeedVideoFpsRanges = set;
    }

    public final java.util.List<com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem> mapAccountSnapshot(final com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data data) {
        com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(data, "");
        java.util.List sortedWith = kotlin.collections.CollectionsKt.sortedWith(this.getHighSpeedVideoFpsRanges, new java.util.Comparator() { // from class: com.paypal.oslo.feature.home.data.accountsnapshot.AccountSnapshotMapper$mapAccountSnapshot$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return kotlin.comparisons.ComparisonsKt.compareValues(java.lang.Integer.valueOf(((com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) t).rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data.this)), java.lang.Integer.valueOf(((com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) t2).rank(com.paypal.oslo.feature.home.graphql.GetAccountSnapshotQuery.Data.this)));
            }
        });
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = sortedWith.iterator();
        while (it.hasNext()) {
            com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem createItem = ((com.paypal.oslo.feature.home.data.accountsnapshot.itemfactories.AccountSnapshotItemFactory) it.next()).createItem(data);
            if (createItem != null) {
                com.paypal.android.logger.Logger.i$default(com.paypal.oslo.feature.home.LoggerKt.log, "Account snapshot card created", kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("type", createItem.getType().toString())), null, 4, null);
            } else {
                createItem = null;
            }
            if (createItem != null) {
                arrayList.add(createItem);
            }
        }
        java.util.ArrayList arrayList2 = arrayList;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        int i = 0;
        for (java.lang.Object obj : arrayList2) {
            if (i < 0) {
                kotlin.collections.CollectionsKt.throwIndexOverflow();
            }
            copy = r5.copy((r32 & 1) != 0 ? r5.id : null, (r32 & 2) != 0 ? r5.type : null, (r32 & 4) != 0 ? r5.backgroundColor : null, (r32 & 8) != 0 ? r5.title : null, (r32 & 16) != 0 ? r5.titleColor : null, (r32 & 32) != 0 ? r5.amount : null, (r32 & 64) != 0 ? r5.amountColor : null, (r32 & 128) != 0 ? r5.description : null, (r32 & 256) != 0 ? r5.footer : null, (r32 & 512) != 0 ? r5.footerColor : null, (r32 & 1024) != 0 ? r5.footerIcon : null, (r32 & 2048) != 0 ? r5.footerIconColor : null, (r32 & 4096) != 0 ? r5.imageUrls : null, (r32 & 8192) != 0 ? r5.icons : null, (r32 & 16384) != 0 ? ((com.paypal.oslo.feature.home.domain.model.AccountSnapshotItem) obj).instrumentation : new com.paypal.oslo.feature.home.domain.model.TileInstrumentation("account_chip", new com.paypal.oslo.core.telemetry.analytics.schema.context.UserIntentContext(com.paypal.oslo.core.telemetry.analytics.schema.Product.HOME_FEED, com.paypal.oslo.feature.identity.unifiedalert.data.rendering.UnifiedAlertsCustomViewRenderer.WALLET, com.paypal.oslo.feature.activity.analytics.ActivityAnalyticsConstants.ENGAGE), i));
            arrayList3.add(copy);
            i++;
        }
        return arrayList3;
    }
}
