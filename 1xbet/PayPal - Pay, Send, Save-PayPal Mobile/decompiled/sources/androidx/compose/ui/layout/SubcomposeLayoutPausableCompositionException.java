package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\r\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroidx/compose/ui/layout/SubcomposeLayoutPausableCompositionException;", "Ljava/lang/IllegalStateException;", "Lkotlin/Camera2StreamConfigurationMap;", "Landroidx/collection/IntList;", "p0", "", "p1", "", "p2", "<init>", "(Landroidx/collection/IntList;Ljava/lang/Object;Ljava/lang/Throwable;)V", "", "", "getHighSpeedVideoFpsRanges", "()Ljava/util/List;", "Camera2StreamConfigurationMap", "Landroidx/collection/IntList;", "Ljava/lang/Object;", "getMessage", "()Ljava/lang/String;", "getHighSpeedVideoSizes"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class SubcomposeLayoutPausableCompositionException extends java.lang.IllegalStateException {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.collection.IntList getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.Object Camera2StreamConfigurationMap;

    public SubcomposeLayoutPausableCompositionException(androidx.collection.IntList intList, java.lang.Object obj, java.lang.Throwable th) {
        super(th);
        this.getHighSpeedVideoFpsRanges = intList;
        this.Camera2StreamConfigurationMap = obj;
    }

    private final java.util.List<java.lang.String> getHighSpeedVideoFpsRanges() {
        java.lang.String concat;
        java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
        for (int i = this.getHighSpeedVideoFpsRanges._size - 1; i >= 0; i--) {
            int i2 = this.getHighSpeedVideoFpsRanges.get(i);
            int highSpeedVideoSizes = androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(i2);
            if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7432getCancelPausedPrecompositionNjRlDlw())) {
                concat = "CancelPausedPrecomposition";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7438getReuseForceSyncDeactivationNjRlDlw())) {
                concat = "ReuseForceSyncDeactivation";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7439getReuseScheduleOutOfFrameDeactivationNjRlDlw())) {
                concat = "ReuseScheduleOutOfFrameDeactivation";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7440getReuseSyncDeactivationNjRlDlw())) {
                concat = "ReuseSyncDeactivation";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7437getReuseDeactivationViaHostNjRlDlw())) {
                concat = "ReuseDeactivationViaHost";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7448getTookFromPrecomposeMapNjRlDlw())) {
                concat = "TookFromPrecomposeMap";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7444getSubcomposeNjRlDlw())) {
                concat = "Subcompose";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7446getSubcomposeNewNjRlDlw())) {
                concat = "SubcomposeNew";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7447getSubcomposePausableNjRlDlw())) {
                concat = "SubcomposePausable";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7445getSubcomposeForceReuseNjRlDlw())) {
                concat = "SubcomposeForceReuse";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7433getDeactivateOutOfFrameNjRlDlw())) {
                concat = "DeactivateOutOfFrame";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7434getDeactivateOutOfFrameCancelledNjRlDlw())) {
                concat = "DeactivateOutOfFrameCancelled";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7442getSlotToReusedFromOnDeactivateNjRlDlw())) {
                concat = "SlotToReusedFromOnDeactivate";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7443getSlotToReusedFromOnReuseNjRlDlw())) {
                concat = "SlotToReusedFromOnReuse";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7441getReusedNjRlDlw())) {
                concat = "Reused";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7436getResumePausedNjRlDlw())) {
                concat = "ResumePaused";
            } else if (androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7435getPausePausedNjRlDlw())) {
                concat = "PausePaused";
            } else {
                concat = androidx.compose.ui.layout.SLOperation.getHighSpeedVideoSizes(highSpeedVideoSizes, androidx.compose.ui.layout.SLOperation.INSTANCE.m7431getApplyPausedNjRlDlw()) ? "ApplyPaused" : "Unexpected ".concat(java.lang.String.valueOf(i2));
            }
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(i);
            sb.append(": ");
            sb.append(concat);
            createListBuilder.add(sb.toString());
        }
        return kotlin.collections.CollectionsKt.build(createListBuilder);
    }

    @Override // java.lang.Throwable
    public final java.lang.String getMessage() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("\n            |slotid=");
        sb.append(this.Camera2StreamConfigurationMap);
        sb.append(". Last operations:\n            |");
        sb.append(kotlin.collections.CollectionsKt.joinToString$default(getHighSpeedVideoFpsRanges(), com.paypal.oslo.feature.activity.domain.base.constants.ActivityConstants.UIConstants.NEW_LINE, null, null, 0, null, null, 62, null));
        sb.append("\n            ");
        return kotlin.text.StringsKt.trimMargin$default(sb.toString(), null, 1, null);
    }
}
