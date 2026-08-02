package com.paypal.oslo.feature.activity.ui.search.view.preview;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0082\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\t8\u0007¢\u0006\u0006\n\u0004\b\u001b\u0010\u001eR\u0011\u0010\u001c\u001a\u00020\u000b8\u0007¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/search/view/preview/ActivitySearchPreviewParams;", "", "", "p0", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;", "p1", "", "Lcom/paypal/oslo/feature/activity/domain/ledger/models/ActivityItem;", "p2", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "p3", "Landroidx/paging/LoadStates;", "p4", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;Ljava/util/List;Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;Landroidx/paging/LoadStates;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/feature/activity/ui/search/model/states/ActivitySearchUiState;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/util/List;", "Lcom/paypal/oslo/feature/activity/domain/base/state/ActivityUiState;", "getHighSpeedVideoSizes", "Landroidx/paging/LoadStates;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class ActivitySearchPreviewParams {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState getHighSpeedVideoSizes;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    final com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState Camera2StreamConfigurationMap;
    private final java.lang.String getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final androidx.paging.LoadStates getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Multi-variable type inference failed */
    private ActivitySearchPreviewParams(java.lang.String str, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, java.util.List<? extends com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState, androidx.paging.LoadStates loadStates) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activitySearchUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadStates, "");
        this.getHighSpeedVideoFpsRangesFor = str;
        this.Camera2StreamConfigurationMap = activitySearchUiState;
        this.getHighSpeedVideoFpsRanges = list;
        this.getHighSpeedVideoSizes = activityUiState;
        this.getHighResolutionOutputSizeshNQ4ISI = loadStates;
    }

    public /* synthetic */ ActivitySearchPreviewParams(java.lang.String str, com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState, java.util.List list, com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success success, androidx.paging.LoadStates loadStates, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, activitySearchUiState, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? new com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState.Success(null) : success, (i & 16) != 0 ? new androidx.paging.LoadStates(new androidx.paging.LoadState.NotLoading(false), new androidx.paging.LoadState.NotLoading(false), new androidx.paging.LoadState.NotLoading(true)) : loadStates);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.activity.ui.search.model.states.ActivitySearchUiState activitySearchUiState = this.Camera2StreamConfigurationMap;
        java.util.List<com.paypal.oslo.feature.activity.domain.ledger.models.ActivityItem> list = this.getHighSpeedVideoFpsRanges;
        com.paypal.oslo.feature.activity.domain.base.state.ActivityUiState activityUiState = this.getHighSpeedVideoSizes;
        androidx.paging.LoadStates loadStates = this.getHighResolutionOutputSizeshNQ4ISI;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivitySearchPreviewParams(getHighSpeedVideoFpsRangesFor=");
        sb.append(str);
        sb.append(", Camera2StreamConfigurationMap=");
        sb.append(activitySearchUiState);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(list);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(activityUiState);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(loadStates);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.getHighSpeedVideoFpsRangesFor.hashCode() * 31) + this.Camera2StreamConfigurationMap.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode()) * 31) + this.getHighSpeedVideoSizes.hashCode()) * 31) + this.getHighResolutionOutputSizeshNQ4ISI.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams activitySearchPreviewParams = (com.paypal.oslo.feature.activity.ui.search.view.preview.ActivitySearchPreviewParams) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, activitySearchPreviewParams.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, activitySearchPreviewParams.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, activitySearchPreviewParams.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, activitySearchPreviewParams.getHighSpeedVideoSizes) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighResolutionOutputSizeshNQ4ISI, activitySearchPreviewParams.getHighResolutionOutputSizeshNQ4ISI);
    }
}
