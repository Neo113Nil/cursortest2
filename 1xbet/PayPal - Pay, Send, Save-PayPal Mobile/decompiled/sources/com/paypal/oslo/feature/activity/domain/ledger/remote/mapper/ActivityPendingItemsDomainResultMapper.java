package com.paypal.oslo.feature.activity.domain.ledger.remote.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/remote/mapper/ActivityPendingItemsDomainResultMapper;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/mapper/ActivityItemsDomainBaseResultMapper;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "input", "", "showDefaultActions", "Ljava/util/ArrayList;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "getPendingTransactions$activity_prodRelease", "(Ljava/util/List;Z)Ljava/util/ArrayList;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityPendingItemsDomainResultMapper implements com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityPendingItemsDomainResultMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityPendingItemsDomainResultMapper();

    private ActivityPendingItemsDomainResultMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper
    public final /* bridge */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem getSectionHeader(java.lang.String str, boolean z) {
        return super.getSectionHeader(str, z);
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        return super.transformResultToDomainActivityItems(list);
    }

    public static /* synthetic */ java.util.ArrayList getPendingTransactions$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityPendingItemsDomainResultMapper activityPendingItemsDomainResultMapper, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return activityPendingItemsDomainResultMapper.getPendingTransactions$activity_prodRelease(list, z);
    }

    public final java.util.ArrayList<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getPendingTransactions$activity_prodRelease(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> input, boolean showDefaultActions) {
        java.util.ArrayList<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> arrayList = new java.util.ArrayList<>();
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list = input;
        if (list != null && !list.isEmpty()) {
            arrayList.add(getSectionHeader(com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.PENDING, showDefaultActions));
            java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems = transformResultToDomainActivityItems(input);
            if (transformResultToDomainActivityItems == null) {
                transformResultToDomainActivityItems = kotlin.collections.CollectionsKt.emptyList();
            }
            arrayList.addAll(transformResultToDomainActivityItems);
        }
        return arrayList;
    }
}
