package com.paypal.oslo.feature.activity.domain.common.extensions;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001aU\u0010\u0007\u001a>\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0004j\b\u0012\u0004\u0012\u00020\u0001`\u00050\u0002j\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00010\u0004j\b\u0012\u0004\u0012\u00020\u0001`\u0005`\u0006*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t*\b\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u0000*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivityPageFragment$Item;", "Ljava/util/LinkedHashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "Lkotlin/collections/getHighSpeedVideoSizes;", "groupItemsByDate", "(Ljava/util/List;)Ljava/util/LinkedHashMap;", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "transformToDomainResultToGroupItemsByDate", "(Ljava/util/List;)Ljava/util/List;", "", "showDefaultActions", "toCompletedTransactionsGroupedItemsByDateWithActions", "(Ljava/util/List;Z)Ljava/util/List;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityMapperExtensionsKt {
    public static final java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item>> groupItemsByDate(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item>> linkedHashMap = new java.util.LinkedHashMap<>();
        for (com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item item : list) {
            java.lang.String obj = item.getActivityItemFragment().getCreatedTime().toString();
            java.lang.String displayDateTimeFormat$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.toDisplayDateTimeFormat$activity_prodRelease(obj, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_SUB_HEADER_DATE_FORMAT);
            if (com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.checkIsCurrentYear$activity_prodRelease(obj)) {
                displayDateTimeFormat$activity_prodRelease = com.paypal.oslo.feature.activity.domain.base.utils.datetime.DateTimeUtils.INSTANCE.toDisplayDateTimeFormat$activity_prodRelease(obj, com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.DateTimeFormatConstants.KEY_SUB_HEADER_MONTH_DATE_FORMAT);
            }
            java.util.LinkedHashMap<java.lang.String, java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item>> linkedHashMap2 = linkedHashMap;
            java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> arrayList = linkedHashMap2.get(displayDateTimeFormat$activity_prodRelease);
            if (arrayList == null) {
                arrayList = new java.util.ArrayList<>();
                linkedHashMap2.put(displayDateTimeFormat$activity_prodRelease, arrayList);
            }
            arrayList.add(item);
        }
        return linkedHashMap;
    }

    public static final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> transformToDomainResultToGroupItemsByDate(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return kotlin.collections.CollectionsKt.toMutableList((java.util.Collection) getHighSpeedVideoFpsRanges(list, com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt$transformToDomainResultToGroupItemsByDate$1.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static /* synthetic */ java.util.List toCompletedTransactionsGroupedItemsByDateWithActions$default(java.util.List list, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toCompletedTransactionsGroupedItemsByDateWithActions(list, z);
    }

    public static final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> toCompletedTransactionsGroupedItemsByDateWithActions(java.util.List<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> list, final boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        return getHighSpeedVideoFpsRanges(list, new kotlin.jvm.functions.Function1() { // from class: com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final java.lang.Object invoke(java.lang.Object obj) {
                return com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt.$r8$lambda$44kwr3bPfUIfH6tJpgRvfOOicOQ(z, (java.lang.String) obj);
            }
        });
    }

    private static /* synthetic */ java.util.List getHighSpeedVideoFpsRanges(java.util.List list, kotlin.jvm.functions.Function1 function1) {
        com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt$groupAndTransformByDate$1 activityMapperExtensionsKt$groupAndTransformByDate$1 = com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt$groupAndTransformByDate$1.Camera2StreamConfigurationMap;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (java.util.Map.Entry<java.lang.String, java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item>> entry : groupItemsByDate(list).entrySet()) {
            java.lang.String key = entry.getKey();
            java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> value = entry.getValue();
            createListBuilder.add((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem) (createListBuilder.isEmpty() ? function1.invoke(key) : activityMapperExtensionsKt$groupAndTransformByDate$1.invoke(key)));
            java.util.ArrayList<com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item> arrayList = value;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            java.util.Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(com.paypal.oslo.feature.activity.domain.base.utils.extensions.ActivityItemsDomainBaseResultExtensionsKt.mapToDomainActivityItem(((com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment.Item) it.next()).getActivityItemFragment()));
            }
            createListBuilder.addAll(arrayList2);
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    public static /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem $r8$lambda$44kwr3bPfUIfH6tJpgRvfOOicOQ(boolean z, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return com.paypal.oslo.feature.activity.domain.ledger.remote.mapper.ActivityCompletedItemsDomainResultMapper.INSTANCE.getSectionHeader(str, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader access$createDateHeader(java.lang.String str) {
        return new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.DateHeader(new com.paypal.oslo.feature.activity.domain.ledger.models.ActivityDateHeaderModel(str, (java.util.List) null, 2, (kotlin.jvm.internal.DefaultConstructorMarker) (0 == true ? 1 : 0)), 0L, 2, null);
    }
}
