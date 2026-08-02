package androidx.compose.ui.input.pointer;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0013\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType;", "", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class PointerEventType {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.pointer.PointerEventType.Companion INSTANCE = new androidx.compose.ui.input.pointer.PointerEventType.Companion(null);
    private static final int Unknown = getHighResolutionOutputSizeshNQ4ISI(0);
    private static final int Press = getHighResolutionOutputSizeshNQ4ISI(1);
    private static final int Release = getHighResolutionOutputSizeshNQ4ISI(2);
    private static final int Move = getHighResolutionOutputSizeshNQ4ISI(3);
    private static final int Enter = getHighResolutionOutputSizeshNQ4ISI(4);
    private static final int Exit = getHighResolutionOutputSizeshNQ4ISI(5);
    private static final int Scroll = getHighResolutionOutputSizeshNQ4ISI(6);

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7180equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private static int getHighResolutionOutputSizeshNQ4ISI(int i) {
        return i;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\b"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/pointer/PointerEventType;", "Unknown", com.visa.cbp.getEncExpo.warmup, "getUnknown-7fucELk", "()I", "Press", "getPress-7fucELk", "Release", "getRelease-7fucELk", "Move", "getMove-7fucELk", "Enter", "getEnter-7fucELk", com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit, "getExit-7fucELk", "Scroll", "getScroll-7fucELk"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnknown-7fucELk, reason: not valid java name */
        public final int m7190getUnknown7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Unknown;
        }

        /* renamed from: getPress-7fucELk, reason: not valid java name */
        public final int m7187getPress7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Press;
        }

        /* renamed from: getRelease-7fucELk, reason: not valid java name */
        public final int m7188getRelease7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Release;
        }

        /* renamed from: getMove-7fucELk, reason: not valid java name */
        public final int m7186getMove7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Move;
        }

        /* renamed from: getEnter-7fucELk, reason: not valid java name */
        public final int m7184getEnter7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Enter;
        }

        /* renamed from: getExit-7fucELk, reason: not valid java name */
        public final int m7185getExit7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Exit;
        }

        /* renamed from: getScroll-7fucELk, reason: not valid java name */
        public final int m7189getScroll7fucELk() {
            return androidx.compose.ui.input.pointer.PointerEventType.Scroll;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ PointerEventType(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String toString() {
        return m7182toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7182toStringimpl(int i) {
        return m7180equalsimpl0(i, Press) ? "Press" : m7180equalsimpl0(i, Release) ? "Release" : m7180equalsimpl0(i, Move) ? "Move" : m7180equalsimpl0(i, Enter) ? "Enter" : m7180equalsimpl0(i, Exit) ? com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit : m7180equalsimpl0(i, Scroll) ? "Scroll" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m7181hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m7179equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7181hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7179equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.pointer.PointerEventType) && i == ((androidx.compose.ui.input.pointer.PointerEventType) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.pointer.PointerEventType m7178boximpl(int i) {
        return new androidx.compose.ui.input.pointer.PointerEventType(i);
    }
}
