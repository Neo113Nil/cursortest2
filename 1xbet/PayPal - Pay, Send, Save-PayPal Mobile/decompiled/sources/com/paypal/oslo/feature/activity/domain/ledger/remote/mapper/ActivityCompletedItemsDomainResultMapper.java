package com.paypal.oslo.feature.activity.domain.ledger.remote.mapper;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/remote/mapper/ActivityCompletedItemsDomainResultMapper;", "Lcom/paypal/oslo/feature/activity/domain/base/utils/mapper/ActivityItemsDomainBaseResultMapper;", "<init>", "()V", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "input", "", "showDefaultActions", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "getCompletedTransactions$activity_prodRelease", "(Ljava/util/List;Z)Ljava/util/List;", "getCompletedTransactionsForPagination$activity_prodRelease", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityCompletedItemsDomainResultMapper implements com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper {
    public static final int $stable = 0;
    public static final com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper INSTANCE = new com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper();

    private ActivityCompletedItemsDomainResultMapper() {
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper
    public final /* bridge */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem getSectionHeader(java.lang.String str, boolean z) {
        return super.getSectionHeader(str, z);
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper
    public final /* bridge */ java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        return super.transformResultToDomainActivityItems(list);
    }

    public static /* synthetic */ java.util.List getCompletedTransactions$activity_prodRelease$default(com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper activityCompletedItemsDomainResultMapper, java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return activityCompletedItemsDomainResultMapper.getCompletedTransactions$activity_prodRelease(list, z);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getCompletedTransactions$activity_prodRelease(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> input, boolean showDefaultActions) {
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> completedTransactionsGroupedItemsByDateWithActions = input != null ? com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt.toCompletedTransactionsGroupedItemsByDateWithActions(input, showDefaultActions) : null;
        return completedTransactionsGroupedItemsByDateWithActions == null ? kotlin.collections.CollectionsKt.emptyList() : completedTransactionsGroupedItemsByDateWithActions;
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getCompletedTransactionsForPagination$activity_prodRelease(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> input) {
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> transformToDomainResultToGroupItemsByDate = input != null ? com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt.transformToDomainResultToGroupItemsByDate(input) : null;
        return transformToDomainResultToGroupItemsByDate == null ? kotlin.collections.CollectionsKt.emptyList() : transformToDomainResultToGroupItemsByDate;
    }
}
