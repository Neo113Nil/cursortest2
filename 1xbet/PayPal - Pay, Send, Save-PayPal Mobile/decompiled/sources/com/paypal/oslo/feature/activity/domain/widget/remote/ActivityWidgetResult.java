package com.paypal.oslo.feature.activity.domain.widget.remote;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0010\u0012\f\u0012\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00030\u0001B+\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u000e\u0010\u0013\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R$\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u001bj\b\u0012\u0004\u0012\u00020\u0006`\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/activity/domain/widget/remote/ActivityWidgetResult;", "Lcom/paypal/oslo/feature/activity/domain/base/result/IActivityRemoteBaseResultContract;", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;", "Lcom/paypal/oslo/feature/activity/domain/base/alias/FilteredActivitiesQueryData;", "queryResult", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "mockData", "<init>", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;Ljava/util/List;)V", "getActivityItemDomainList$activity_prodRelease", "()Ljava/util/List;", "", "hasMoreActivities$activity_prodRelease", "()Z", "isValid", "", "transformToDomainResult$activity_prodRelease", "()V", "input", "toDomainModel", "(Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;)V", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/feature/activity/graphql/GetUserFilteredActivitiesQuery$Data;", "getHighSpeedVideoFpsRangesFor", "Ljava/util/List;", "getHighSpeedVideoFpsRanges", "Ljava/util/ArrayList;", "Lkotlin/collections/getHighSpeedVideoFpsRanges;", "Camera2StreamConfigurationMap", "Ljava/util/ArrayList;", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ActivityWidgetResult implements com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract<com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data> {
    public static final int $stable = 8;

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final java.util.ArrayList<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private boolean getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getHighSpeedVideoFpsRanges;
    private final com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data getHighSpeedVideoSizes;

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityWidgetResult(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data data, java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list) {
        this.getHighSpeedVideoSizes = data;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighResolutionOutputSizeshNQ4ISI = new java.util.ArrayList<>();
    }

    public /* synthetic */ ActivityWidgetResult(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data data, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : data, (i & 2) != 0 ? null : list);
    }

    public final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getActivityItemDomainList$activity_prodRelease() {
        return kotlin.collections.CollectionsKt.toList(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: hasMoreActivities$activity_prodRelease, reason: from getter */
    public final boolean getGetHighSpeedVideoFpsRangesFor() {
        return this.getHighSpeedVideoFpsRangesFor;
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract
    public final boolean isValid() {
        if (this.getHighSpeedVideoSizes != null) {
            return true;
        }
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list = this.getHighSpeedVideoFpsRanges;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public final void transformToDomainResult$activity_prodRelease() {
        if (isValid()) {
            toDomainModel(this.getHighSpeedVideoSizes);
        }
    }

    @Override // com.paypal.oslo.feature.activity.domain.base.result.IActivityRemoteBaseResultContract
    public final void toDomainModel(com.paypal.oslo.feature.activity.graphql.GetUserFilteredActivitiesQuery.Data input) {
        this.getHighResolutionOutputSizeshNQ4ISI.clear();
        if (input != null) {
            com.paypal.oslo.feature.activity.graphql.fragment.ActivityPageFragment activityPageFragment = input.getActivities().getActivitiesFragment().getPage().getActivityPageFragment();
            this.getHighResolutionOutputSizeshNQ4ISI.addAll(com.paypal.oslo.feature.activity.domain.common.extensions.ActivityMapperExtensionsKt.transformToDomainResultToGroupItemsByDate(activityPageFragment.getItems()));
            this.getHighSpeedVideoFpsRangesFor = activityPageFragment.getHasNextPage();
        } else {
            java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list = this.getHighSpeedVideoFpsRanges;
            if (list != null) {
                this.getHighResolutionOutputSizeshNQ4ISI.addAll(list);
                this.getHighSpeedVideoFpsRangesFor = false;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityWidgetResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }
}
