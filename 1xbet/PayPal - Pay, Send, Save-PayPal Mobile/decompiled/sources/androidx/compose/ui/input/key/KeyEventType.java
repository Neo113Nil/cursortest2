package androidx.compose.ui.input.key;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/input/key/KeyEventType;", "", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighResolutionOutputSizeshNQ4ISI", com.visa.cbp.getEncExpo.warmup, "getHighSpeedVideoFpsRanges", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class KeyEventType {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final int getHighSpeedVideoFpsRanges;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.key.KeyEventType.Companion INSTANCE = new androidx.compose.ui.input.key.KeyEventType.Companion(null);
    private static final int Unknown = m7080constructorimpl(0);
    private static final int KeyUp = m7080constructorimpl(1);
    private static final int KeyDown = m7080constructorimpl(2);

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7080constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7082equalsimpl0(int i, int i2) {
        return i == i2;
    }

    private /* synthetic */ KeyEventType(int i) {
        this.getHighSpeedVideoFpsRanges = i;
    }

    public final java.lang.String toString() {
        return m7084toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7084toStringimpl(int i) {
        return m7082equalsimpl0(i, KeyUp) ? "KeyUp" : m7082equalsimpl0(i, KeyDown) ? "KeyDown" : m7082equalsimpl0(i, Unknown) ? "Unknown" : "Invalid";
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b"}, d2 = {"Landroidx/compose/ui/input/key/KeyEventType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/key/KeyEventType;", "Unknown", com.visa.cbp.getEncExpo.warmup, "getUnknown-CS__XNY", "()I", "KeyUp", "getKeyUp-CS__XNY", "KeyDown", "getKeyDown-CS__XNY"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnknown-CS__XNY, reason: not valid java name */
        public final int m7088getUnknownCS__XNY() {
            return androidx.compose.ui.input.key.KeyEventType.Unknown;
        }

        /* renamed from: getKeyUp-CS__XNY, reason: not valid java name */
        public final int m7087getKeyUpCS__XNY() {
            return androidx.compose.ui.input.key.KeyEventType.KeyUp;
        }

        /* renamed from: getKeyDown-CS__XNY, reason: not valid java name */
        public final int m7086getKeyDownCS__XNY() {
            return androidx.compose.ui.input.key.KeyEventType.KeyDown;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final int hashCode() {
        return m7083hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m7081equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7083hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7081equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.key.KeyEventType) && i == ((androidx.compose.ui.input.key.KeyEventType) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.key.KeyEventType m7079boximpl(int i) {
        return new androidx.compose.ui.input.key.KeyEventType(i);
    }
}
