package com.paypal.oslo.feature.activity.domain.common.remote.mapper;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u0004*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/common/remote/mapper/ActivityLedgerItemsDomainResultMapper;", "", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "upcomingItems", "pendingItems", "completedItems", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "getActivityItemsDomainList$activity_prodRelease", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;", "getActivityItemsPaginationDomainList$activity_prodRelease", "(Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityLedgerItemsDomainResultMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.common.remote.mapper.ActivityLedgerItemsDomainResultMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.common.remote.mapper.ActivityLedgerItemsDomainResultMapper();

    private ActivityLedgerItemsDomainResultMapper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ java.util.List getActivityItemsDomainList$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.common.remote.mapper.ActivityLedgerItemsDomainResultMapper activityLedgerItemsDomainResultMapper, java.util.List list, java.util.List list2, java.util.List list3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            list = null;
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        if ((i & 4) != 0) {
            list3 = null;
        }
        return activityLedgerItemsDomainResultMapper.getActivityItemsDomainList$activity_prodRelease(list, list2, list3);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getActivityItemsDomainList$activity_prodRelease(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> upcomingItems, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> pendingItems, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> completedItems) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list = upcomingItems;
        boolean z = true;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityUpcomingItemsDomainResultMapper.INSTANCE.getUpcomingTransactions$activity_prodRelease(upcomingItems, true));
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list2 = pendingItems;
        if (list2 != null && !list2.isEmpty()) {
            arrayList.addAll(com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityPendingItemsDomainResultMapper.INSTANCE.getPendingTransactions$activity_prodRelease(pendingItems, list == null || list.isEmpty()));
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list3 = completedItems;
        if (list3 != null && !list3.isEmpty()) {
            com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper activityCompletedItemsDomainResultMapper = com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper.INSTANCE;
            if ((list != null && !list.isEmpty()) || (list2 != null && !list2.isEmpty())) {
                z = false;
            }
            arrayList.addAll(activityCompletedItemsDomainResultMapper.getCompletedTransactions$activity_prodRelease(completedItems, z));
        }
        return arrayList;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getActivityItemsPaginationDomainList$activity_prodRelease(com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment) {
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> items = activityPageFragment != null ? activityPageFragment.getItems() : null;
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list = items;
        if (list == null || list.isEmpty()) {
            return kotlin.collections.CollectionsKt.emptyList();
        }
        return com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper.INSTANCE.getCompletedTransactionsForPagination$activity_prodRelease(items);
    }
}
