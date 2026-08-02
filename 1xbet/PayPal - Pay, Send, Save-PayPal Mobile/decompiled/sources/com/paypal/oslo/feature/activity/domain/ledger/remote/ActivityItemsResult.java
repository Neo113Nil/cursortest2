package com.paypal.oslo.feature.activity.domain.ledger.remote;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000e\u0010\fJ\u001d\u0010\u0012\u001a\u00020\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsResult;", "Lcom/paypal/oslo/feature/activity/domain/ledger/remote/ActivityItemsBaseResult;", "Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult;", "Lcom/paypal/oslo/feature/activity/graphql/fragment/ActivitiesFragment;", "queryResult", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "mockData", "<init>", "(Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult;Ljava/util/List;)V", "", "getActivityItemDomainTransformedResult$activity_prodRelease", "()V", "getActivityItemDomainTransformedResultForFilters$activity_prodRelease", "transformPaginationItemsToDomain$activity_prodRelease", "", "", "supportedActions", "filterSupportedActions$activity_prodRelease", "(Ljava/util/Set;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/domain/common/remote/ActivitiesQueriesResult;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "Ljava/util/List;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityItemsResult extends com.paypal.oslo.feature.activity.domain.ledger.remote.ActivityItemsBaseResult {
    public static final int $stable = 8;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult<com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment> Camera2StreamConfigurationMap;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityItemsResult(com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult<com.paypal.oslo.feature.activity.graphql.fragment.ActivitiesFragment> activitiesQueriesResult, java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list) {
        super(activitiesQueriesResult, list);
        this.Camera2StreamConfigurationMap = activitiesQueriesResult;
        this.getHighSpeedVideoFpsRangesFor = list;
    }

    public /* synthetic */ ActivityItemsResult(com.paypal.oslo.feature.activity.domain.common.remote.ActivitiesQueriesResult activitiesQueriesResult, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : activitiesQueriesResult, (i & 2) != 0 ? null : list);
    }

    public final void getActivityItemDomainTransformedResult$activity_prodRelease() {
        if (isValid()) {
            toDomainModel(this.Camera2StreamConfigurationMap);
        }
    }

    public final void getActivityItemDomainTransformedResultForFilters$activity_prodRelease() {
        if (isValid()) {
            toFilteredDomainModel$activity_prodRelease(this.Camera2StreamConfigurationMap);
        }
    }

    public final void transformPaginationItemsToDomain$activity_prodRelease() {
        if (isValid()) {
            loadPaginationPage$activity_prodRelease(this.Camera2StreamConfigurationMap);
        }
    }

    public final void filterSupportedActions$activity_prodRelease(java.util.Set<java.lang.String> supportedActions) {
        com.paypal.oslo.feature.activity.domain.ledger.models.ActivityTransactionModel copy;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportedActions, "");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem activityItem : getActivityItemDomainList$activity_prodRelease()) {
            if (activityItem instanceof com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) {
                java.util.ArrayList emptyList = kotlin.collections.CollectionsKt.emptyList();
                if (!supportedActions.isEmpty()) {
                    java.util.List<com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel> action = ((com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem).getData().getAction();
                    if (action != null) {
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        for (java.lang.Object obj : action) {
                            if (supportedActions.contains(((com.paypal.oslo.feature.activity.domain.common.models.ActivityActionModel) obj).getType().getRawValue())) {
                                arrayList2.add(obj);
                            }
                        }
                        emptyList = arrayList2;
                    } else {
                        emptyList = null;
                    }
                }
                java.util.List list = emptyList;
                com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction transaction = (com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction) activityItem;
                copy = r5.copy((r41 & 1) != 0 ? r5.id : null, (r41 & 2) != 0 ? r5.groupId : null, (r41 & 4) != 0 ? r5.invoiceId : null, (r41 & 8) != 0 ? r5.avatar : null, (r41 & 16) != 0 ? r5.title : null, (r41 & 32) != 0 ? r5.date : null, (r41 & 64) != 0 ? r5.createdTime : null, (r41 & 128) != 0 ? r5.amountInformation : null, (r41 & 256) != 0 ? r5.transactionShortDescription : null, (r41 & 512) != 0 ? r5.paymentStatus : null, (r41 & 1024) != 0 ? r5.transactionETANote : null, (r41 & 2048) != 0 ? r5.additionalInfo : null, (r41 & 4096) != 0 ? r5.rewardInfo : null, (r41 & 8192) != 0 ? r5.activityMoneyMovementDirection : null, (r41 & 16384) != 0 ? r5.action : list, (r41 & 32768) != 0 ? r5.type : null, (r41 & 65536) != 0 ? r5.activityStatus : null, (r41 & 131072) != 0 ? r5.shipmentPackages : null, (r41 & 262144) != 0 ? r5.activityFlags : null, (r41 & 524288) != 0 ? r5.activityPartnerInfo : null, (r41 & 1048576) != 0 ? r5.subdomain : null, (r41 & 2097152) != 0 ? r5.channels : null, (r41 & 4194304) != 0 ? transaction.getData().purposes : null);
                arrayList.add(com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem.Transaction.copy$default(transaction, copy, 0L, 2, null));
            } else {
                arrayList.add(activityItem);
            }
        }
        replaceActivityItems$activity_prodRelease(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityItemsResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
