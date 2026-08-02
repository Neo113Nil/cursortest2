package com.paypal.oslo.feature.activity.domain.ledger.remote.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/remote/mapper/ActivityUpcomingItemsDomainResultMapper;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/mapper/ActivityItemsDomainBaseResultMapper;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "input", "", "showDefaultActions", "Ljava/util/ArrayList;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getUpcomingTransactions$activity_prodRelease", "(Ljava/util/List;Z)Ljava/util/ArrayList;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityUpcomingItemsDomainResultMapper implements com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityUpcomingItemsDomainResultMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityUpcomingItemsDomainResultMapper();

    private ActivityUpcomingItemsDomainResultMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper
    public final /* bridge */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem getSectionHeader(java.lang.String str, boolean z) {
        return super.getSectionHeader(str, z);
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        return super.transformResultToDomainActivityItems(list);
    }

    public static /* synthetic */ java.util.ArrayList getUpcomingTransactions$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityUpcomingItemsDomainResultMapper activityUpcomingItemsDomainResultMapper, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return activityUpcomingItemsDomainResultMapper.getUpcomingTransactions$activity_prodRelease(list, z);
    }

    public final java.util.ArrayList<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getUpcomingTransactions$activity_prodRelease(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> input, boolean showDefaultActions) {
        java.util.List emptyList;
        java.util.ArrayList<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> arrayList = new java.util.ArrayList<>();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list = input;
        if (list != null && !list.isEmpty()) {
            arrayList.add(getSectionHeader(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.UPCOMING, showDefaultActions));
            java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems = transformResultToDomainActivityItems(input);
            java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> list2 = transformResultToDomainActivityItems;
            if (list2 != null && !list2.isEmpty()) {
                java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> list3 = transformResultToDomainActivityItems;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list3, 10));
                java.util.Iterator<T> it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) it.next()).getData());
                }
                emptyList = kotlin.collections.CollectionsKt.listOf(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.UpcomingItemsSection(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityLedgerUpcomingSectionItems(arrayList2), 0L, 2, null));
            } else {
                emptyList = kotlin.collections.CollectionsKt.emptyList();
            }
            arrayList.addAll(emptyList);
        }
        return arrayList;
    }
}
