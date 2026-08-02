package com.paypal.oslo.feature.activity.ui.common;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0082\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u001c\u0010\u0019\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001c"}, d2 = {"Lcom/paypal/oslo/feature/activity/ui/common/ActionBottomSheetModal;", "", "", "p0", "p1", "p2", "p3", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "Lcom/paypal/oslo/feature/activity/graphql/type/ActivityActionType;", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "getHighSpeedVideoFpsRanges", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRangesFor", "getInputSizeshNQ4ISI", "Lcom/paypal/oslo/api/graphql/schema/type/ActivityActionType;", "getOutputFormats"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
final /* data */ class ActionBottomSheetModal {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    final com.paypal.oslo.api.graphql.schema.type.ActivityActionType getOutputFormats;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoFpsRangesFor;
    final java.lang.String getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getInputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.api.graphql.schema.type.ActivityActionType getHighResolutionOutputSizeshNQ4ISI;

    public ActionBottomSheetModal(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        this.Camera2StreamConfigurationMap = str;
        this.getHighSpeedVideoFpsRanges = str2;
        this.getHighSpeedVideoFpsRangesFor = str3;
        this.getHighSpeedVideoSizes = str4;
        this.getHighResolutionOutputSizeshNQ4ISI = activityActionType;
        this.getOutputFormats = activityActionType2;
    }

    public /* synthetic */ ActionBottomSheetModal(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType, com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : activityActionType, (i & 32) != 0 ? null : activityActionType2);
    }

    public final java.lang.String toString() {
        java.lang.String str = this.Camera2StreamConfigurationMap;
        java.lang.String str2 = this.getHighSpeedVideoFpsRanges;
        java.lang.String str3 = this.getHighSpeedVideoFpsRangesFor;
        java.lang.String str4 = this.getHighSpeedVideoSizes;
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType = this.getHighResolutionOutputSizeshNQ4ISI;
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType2 = this.getOutputFormats;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ActionBottomSheetModal(Camera2StreamConfigurationMap=");
        sb.append(str);
        sb.append(", getHighSpeedVideoFpsRanges=");
        sb.append(str2);
        sb.append(", getHighSpeedVideoFpsRangesFor=");
        sb.append(str3);
        sb.append(", getHighSpeedVideoSizes=");
        sb.append(str4);
        sb.append(", getHighResolutionOutputSizeshNQ4ISI=");
        sb.append(activityActionType);
        sb.append(", getOutputFormats=");
        sb.append(activityActionType2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.Camera2StreamConfigurationMap.hashCode();
        int hashCode2 = this.getHighSpeedVideoFpsRanges.hashCode();
        int hashCode3 = this.getHighSpeedVideoFpsRangesFor.hashCode();
        java.lang.String str = this.getHighSpeedVideoSizes;
        int hashCode4 = str == null ? 0 : str.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType = this.getHighResolutionOutputSizeshNQ4ISI;
        int hashCode5 = activityActionType == null ? 0 : activityActionType.hashCode();
        com.paypal.oslo.api.graphql.schema.type.ActivityActionType activityActionType2 = this.getOutputFormats;
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + (activityActionType2 != null ? activityActionType2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal)) {
            return false;
        }
        com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal actionBottomSheetModal = (com.paypal.oslo.feature.activity.ui.common.ActionBottomSheetModal) p0;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, actionBottomSheetModal.Camera2StreamConfigurationMap) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRanges, actionBottomSheetModal.getHighSpeedVideoFpsRanges) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoFpsRangesFor, actionBottomSheetModal.getHighSpeedVideoFpsRangesFor) && kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, actionBottomSheetModal.getHighSpeedVideoSizes) && this.getHighResolutionOutputSizeshNQ4ISI == actionBottomSheetModal.getHighResolutionOutputSizeshNQ4ISI && this.getOutputFormats == actionBottomSheetModal.getOutputFormats;
    }
}
