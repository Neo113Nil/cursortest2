package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0082\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0013\u001a\u00060\u0004j\u0002`\u00058\u0007¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0011\u0010\u001a\u001a\u00020\u00078\u0007¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/common/ActivityActionBottomSheetPreviewParams;", "", "", "p0", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "p1", "Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;", "p2", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "getHighResolutionOutputSizeshNQ4ISI", "Lcom/paypal/oslo/feature/activity/ui/common/model/states/ActionExecutionState;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class ActivityActionBottomSheetPreviewParams {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final com.paypal.oslo.api.graphql.schema.type.ActivityActionType getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    public ActivityActionBottomSheetPreviewParams(java.lang.String str, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityActionType, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(actionExecutionState, "");
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = activityActionType;
        this.getHighSpeedVideoFpsRanges = actionExecutionState;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.getHighSpeedVideoSizes;
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType = this.getHighSpeedVideoFpsRangesFor;
        com.paypal.oslo.feature.activity.ui.common.model.states.ActionExecutionState actionExecutionState = this.getHighSpeedVideoFpsRanges;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActivityActionBottomSheetPreviewParams(getHighSpeedVideoSizes=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(activityActionType);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(actionExecutionState);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.getHighSpeedVideoSizes.hashCode() * 31) + this.getHighSpeedVideoFpsRangesFor.hashCode()) * 31) + this.getHighSpeedVideoFpsRanges.hashCode();
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams activityActionBottomSheetPreviewParams = (com.paypal.oslo.feature.activity.ui.common.ActivityActionBottomSheetPreviewParams) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, activityActionBottomSheetPreviewParams.getHighSpeedVideoSizes) && this.getHighSpeedVideoFpsRangesFor == activityActionBottomSheetPreviewParams.getHighSpeedVideoFpsRangesFor && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, activityActionBottomSheetPreviewParams.getHighSpeedVideoFpsRanges);
    }
}
