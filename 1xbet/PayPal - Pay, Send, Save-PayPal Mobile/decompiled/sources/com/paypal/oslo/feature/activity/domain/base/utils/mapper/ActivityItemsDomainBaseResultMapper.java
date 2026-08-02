package com.paypal.oslo.feature.activity.domain.base.utils.mapper;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/base/utils/mapper/ActivityItemsDomainBaseResultMapper;", "", "", "headerText", "", "showDefaultActions", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "getSectionHeader", "(Ljava/lang/String;Z)Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem$Transaction;", "transformResultToDomainActivityItems", "(Ljava/util/List;)Ljava/util/List;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface ActivityItemsDomainBaseResultMapper {

    @kotlin.Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class DefaultImpls {
        @java.lang.Deprecated
        public static com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem getSectionHeader(com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper activityItemsDomainBaseResultMapper, java.lang.String str, boolean z) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            return com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper.super.getSectionHeader(str, z);
        }

        @java.lang.Deprecated
        public static java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems(com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper activityItemsDomainBaseResultMapper, java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
            return com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper.super.transformResultToDomainActivityItems(list);
        }
    }

    static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem getSectionHeader$default(com.paypal.oslo.feature.activity.domain.base.utils.mapper.ActivityItemsDomainBaseResultMapper activityItemsDomainBaseResultMapper, java.lang.String str, boolean z, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getSectionHeader");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return activityItemsDomainBaseResultMapper.getSectionHeader(str, z);
    }

    default com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem getSectionHeader(java.lang.String headerText, boolean showDefaultActions) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(headerText, "");
        java.util.List emptyList = kotlin.collections.CollectionsKt.emptyList();
        if (showDefaultActions) {
            emptyList = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems[]{new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.FilterIcon(null, 1, null), new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityActionItems.SearchIcon(null, 1, null)});
        }
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.SectionHeader(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel(headerText, emptyList), 0L, 2, null);
    }

    default java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction> transformResultToDomainActivityItems(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        if (list == null) {
            return null;
        }
        java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list2 = list;
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(list2, 10));
        java.util.Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(com.paypal.oslo.feature.activity.domain.base.utils.extensions.ActivityItemsDomainBaseResultExtensionsKt.mapToDomainActivityItem(((com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item) it.next()).getActivityItemFragment()));
        }
        return arrayList;
    }
}
