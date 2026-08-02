package androidx.compose.ui.focus;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", com.visa.cbp.getEncExpo.warmup, "Camera2StreamConfigurationMap", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class FocusDirection {

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final int Camera2StreamConfigurationMap;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.focus.FocusDirection.Companion INSTANCE = new androidx.compose.ui.focus.FocusDirection.Companion(null);
    private static final int Next = m5643constructorimpl(1);
    private static final int Previous = m5643constructorimpl(2);
    private static final int Left = m5643constructorimpl(3);
    private static final int Right = m5643constructorimpl(4);
    private static final int Up = m5643constructorimpl(5);
    private static final int Down = m5643constructorimpl(6);
    private static final int Enter = m5643constructorimpl(7);
    private static final int Exit = m5643constructorimpl(8);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m5643constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5645equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ FocusDirection(int i) {
        this.Camera2StreamConfigurationMap = i;
    }

    public final java.lang.String toString() {
        return m5647toStringimpl(this.Camera2StreamConfigurationMap);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m5647toStringimpl(int i) {
        return m5645equalsimpl0(i, Next) ? "Next" : m5645equalsimpl0(i, Previous) ? "Previous" : m5645equalsimpl0(i, Left) ? "Left" : m5645equalsimpl0(i, Right) ? "Right" : m5645equalsimpl0(i, Up) ? "Up" : m5645equalsimpl0(i, Down) ? "Down" : m5645equalsimpl0(i, Enter) ? "Enter" : m5645equalsimpl0(i, Exit) ? com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit : "Invalid FocusDirection";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0006\u001a\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\b"}, d2 = {"Landroidx/compose/ui/focus/FocusDirection$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/focus/FocusDirection;", "Next", com.visa.cbp.getEncExpo.warmup, "getNext-dhqQ-8s", "()I", "Previous", "getPrevious-dhqQ-8s", "Left", "getLeft-dhqQ-8s", "Right", "getRight-dhqQ-8s", "Up", "getUp-dhqQ-8s", "Down", "getDown-dhqQ-8s", "Enter", "getEnter-dhqQ-8s", com.ingo.sdk.kotlin.common.analytics.IEventNames.Exit, "getExit-dhqQ-8s"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getNext-dhqQ-8s, reason: not valid java name */
        public final int m5653getNextdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Next;
        }

        /* renamed from: getPrevious-dhqQ-8s, reason: not valid java name */
        public final int m5654getPreviousdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Previous;
        }

        /* renamed from: getLeft-dhqQ-8s, reason: not valid java name */
        public final int m5652getLeftdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Left;
        }

        /* renamed from: getRight-dhqQ-8s, reason: not valid java name */
        public final int m5655getRightdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Right;
        }

        /* renamed from: getUp-dhqQ-8s, reason: not valid java name */
        public final int m5656getUpdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Up;
        }

        /* renamed from: getDown-dhqQ-8s, reason: not valid java name */
        public final int m5649getDowndhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Down;
        }

        /* renamed from: getEnter-dhqQ-8s, reason: not valid java name */
        public final int m5650getEnterdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Enter;
        }

        /* renamed from: getExit-dhqQ-8s, reason: not valid java name */
        public final int m5651getExitdhqQ8s() {
            return androidx.compose.ui.focus.FocusDirection.Exit;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getCamera2StreamConfigurationMap() {
        return this.Camera2StreamConfigurationMap;
    }

    public final int hashCode() {
        return m5646hashCodeimpl(this.Camera2StreamConfigurationMap);
    }

    public final boolean equals(java.lang.Object other) {
        return m5644equalsimpl(this.Camera2StreamConfigurationMap, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5646hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5644equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.focus.FocusDirection) && i == ((androidx.compose.ui.focus.FocusDirection) obj).getCamera2StreamConfigurationMap();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.focus.FocusDirection m5642boximpl(int i) {
        return new androidx.compose.ui.focus.FocusDirection(i);
    }
}
