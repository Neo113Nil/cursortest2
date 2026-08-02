package androidx.compose.ui.layout;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0083@\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0088\u0001\u0012\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/layout/SLOperation;", "", "", "p0", "getHighSpeedVideoSizes", "(I)I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
final class SLOperation {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.layout.SLOperation.Companion INSTANCE = new androidx.compose.ui.layout.SLOperation.Companion(null);
    private static final int CancelPausedPrecomposition = getHighSpeedVideoSizes(0);
    private static final int ReuseForceSyncDeactivation = getHighSpeedVideoSizes(1);
    private static final int ReuseScheduleOutOfFrameDeactivation = getHighSpeedVideoSizes(2);
    private static final int ReuseSyncDeactivation = getHighSpeedVideoSizes(3);
    private static final int ReuseDeactivationViaHost = getHighSpeedVideoSizes(4);
    private static final int TookFromPrecomposeMap = getHighSpeedVideoSizes(5);
    private static final int Subcompose = getHighSpeedVideoSizes(6);
    private static final int SubcomposeNew = getHighSpeedVideoSizes(7);
    private static final int SubcomposePausable = getHighSpeedVideoSizes(8);
    private static final int SubcomposeForceReuse = getHighSpeedVideoSizes(9);
    private static final int DeactivateOutOfFrame = getHighSpeedVideoSizes(10);
    private static final int DeactivateOutOfFrameCancelled = getHighSpeedVideoSizes(11);
    private static final int SlotToReusedFromOnDeactivate = getHighSpeedVideoSizes(12);
    private static final int SlotToReusedFromOnReuse = getHighSpeedVideoSizes(13);
    private static final int Reused = getHighSpeedVideoSizes(14);
    private static final int ResumePaused = getHighSpeedVideoSizes(15);
    private static final int PausePaused = getHighSpeedVideoSizes(16);
    private static final int ApplyPaused = getHighSpeedVideoSizes(17);

    public static int getHighSpeedVideoSizes(int i) {
        return i;
    }

    public static final boolean getHighSpeedVideoSizes(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b&\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\u001c\u0010\bR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0006\u001a\u0004\b\u001e\u0010\bR\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0006\u001a\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0006\u001a\u0004\b\"\u0010\bR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u0006\u001a\u0004\b$\u0010\bR\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b(\u0010\bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b*\u0010\b"}, d2 = {"Landroidx/compose/ui/layout/SLOperation$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/layout/SLOperation;", "CancelPausedPrecomposition", com.visa.cbp.getEncExpo.warmup, "getCancelPausedPrecomposition-NjRlDlw", "()I", "ReuseForceSyncDeactivation", "getReuseForceSyncDeactivation-NjRlDlw", "ReuseScheduleOutOfFrameDeactivation", "getReuseScheduleOutOfFrameDeactivation-NjRlDlw", "ReuseSyncDeactivation", "getReuseSyncDeactivation-NjRlDlw", "ReuseDeactivationViaHost", "getReuseDeactivationViaHost-NjRlDlw", "TookFromPrecomposeMap", "getTookFromPrecomposeMap-NjRlDlw", "Subcompose", "getSubcompose-NjRlDlw", "SubcomposeNew", "getSubcomposeNew-NjRlDlw", "SubcomposePausable", "getSubcomposePausable-NjRlDlw", "SubcomposeForceReuse", "getSubcomposeForceReuse-NjRlDlw", "DeactivateOutOfFrame", "getDeactivateOutOfFrame-NjRlDlw", "DeactivateOutOfFrameCancelled", "getDeactivateOutOfFrameCancelled-NjRlDlw", "SlotToReusedFromOnDeactivate", "getSlotToReusedFromOnDeactivate-NjRlDlw", "SlotToReusedFromOnReuse", "getSlotToReusedFromOnReuse-NjRlDlw", "Reused", "getReused-NjRlDlw", "ResumePaused", "getResumePaused-NjRlDlw", "PausePaused", "getPausePaused-NjRlDlw", "ApplyPaused", "getApplyPaused-NjRlDlw"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getCancelPausedPrecomposition-NjRlDlw, reason: not valid java name */
        public final int m7432getCancelPausedPrecompositionNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.CancelPausedPrecomposition;
        }

        /* renamed from: getReuseForceSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m7438getReuseForceSyncDeactivationNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.ReuseForceSyncDeactivation;
        }

        /* renamed from: getReuseScheduleOutOfFrameDeactivation-NjRlDlw, reason: not valid java name */
        public final int m7439getReuseScheduleOutOfFrameDeactivationNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.ReuseScheduleOutOfFrameDeactivation;
        }

        /* renamed from: getReuseSyncDeactivation-NjRlDlw, reason: not valid java name */
        public final int m7440getReuseSyncDeactivationNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.ReuseSyncDeactivation;
        }

        /* renamed from: getReuseDeactivationViaHost-NjRlDlw, reason: not valid java name */
        public final int m7437getReuseDeactivationViaHostNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.ReuseDeactivationViaHost;
        }

        /* renamed from: getTookFromPrecomposeMap-NjRlDlw, reason: not valid java name */
        public final int m7448getTookFromPrecomposeMapNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.TookFromPrecomposeMap;
        }

        /* renamed from: getSubcompose-NjRlDlw, reason: not valid java name */
        public final int m7444getSubcomposeNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.Subcompose;
        }

        /* renamed from: getSubcomposeNew-NjRlDlw, reason: not valid java name */
        public final int m7446getSubcomposeNewNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.SubcomposeNew;
        }

        /* renamed from: getSubcomposePausable-NjRlDlw, reason: not valid java name */
        public final int m7447getSubcomposePausableNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.SubcomposePausable;
        }

        /* renamed from: getSubcomposeForceReuse-NjRlDlw, reason: not valid java name */
        public final int m7445getSubcomposeForceReuseNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.SubcomposeForceReuse;
        }

        /* renamed from: getDeactivateOutOfFrame-NjRlDlw, reason: not valid java name */
        public final int m7433getDeactivateOutOfFrameNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.DeactivateOutOfFrame;
        }

        /* renamed from: getDeactivateOutOfFrameCancelled-NjRlDlw, reason: not valid java name */
        public final int m7434getDeactivateOutOfFrameCancelledNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.DeactivateOutOfFrameCancelled;
        }

        /* renamed from: getSlotToReusedFromOnDeactivate-NjRlDlw, reason: not valid java name */
        public final int m7442getSlotToReusedFromOnDeactivateNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.SlotToReusedFromOnDeactivate;
        }

        /* renamed from: getSlotToReusedFromOnReuse-NjRlDlw, reason: not valid java name */
        public final int m7443getSlotToReusedFromOnReuseNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.SlotToReusedFromOnReuse;
        }

        /* renamed from: getReused-NjRlDlw, reason: not valid java name */
        public final int m7441getReusedNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.Reused;
        }

        /* renamed from: getResumePaused-NjRlDlw, reason: not valid java name */
        public final int m7436getResumePausedNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.ResumePaused;
        }

        /* renamed from: getPausePaused-NjRlDlw, reason: not valid java name */
        public final int m7435getPausePausedNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.PausePaused;
        }

        /* renamed from: getApplyPaused-NjRlDlw, reason: not valid java name */
        public final int m7431getApplyPausedNjRlDlw() {
            return androidx.compose.ui.layout.SLOperation.ApplyPaused;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unwrapAs, reason: from getter */
    private /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return Camera2StreamConfigurationMap(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object p0) {
        return getHighSpeedVideoFpsRanges(this.getHighSpeedVideoFpsRanges, p0);
    }

    private static java.lang.String getHighSpeedVideoFpsRanges(int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SLOperation(value=");
        sb.append(i);
        sb.append(')');
        return sb.toString();
    }

    private static int Camera2StreamConfigurationMap(int i) {
        return java.lang.Integer.hashCode(i);
    }

    private static boolean getHighSpeedVideoFpsRanges(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.layout.SLOperation) && i == ((androidx.compose.ui.layout.SLOperation) obj).getGetHighSpeedVideoFpsRanges();
    }
}
