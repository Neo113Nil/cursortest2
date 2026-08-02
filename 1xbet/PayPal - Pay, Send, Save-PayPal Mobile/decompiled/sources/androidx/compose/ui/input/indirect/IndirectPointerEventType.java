package androidx.compose.ui.input.indirect;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u000f\u001a\u00020\n8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\u0088\u0001\u0011\u0092\u0001\u00020\n"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEventType;", "", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getHighSpeedVideoFpsRangesFor", com.visa.cbp.getEncExpo.warmup, "getHighResolutionOutputSizeshNQ4ISI", "Companion", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class IndirectPointerEventType {

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final int getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.input.indirect.IndirectPointerEventType.Companion INSTANCE = new androidx.compose.ui.input.indirect.IndirectPointerEventType.Companion(null);
    private static final int Unknown = 0;
    private static final int Press = 1;
    private static final int Release = 2;
    private static final int Move = 3;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m6765equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001a\u0010\r\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b"}, d2 = {"Landroidx/compose/ui/input/indirect/IndirectPointerEventType$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/input/indirect/IndirectPointerEventType;", "Unknown", com.visa.cbp.getEncExpo.warmup, "getUnknown-4ZHQPSE", "()I", "Press", "getPress-4ZHQPSE", "Release", "getRelease-4ZHQPSE", "Move", "getMove-4ZHQPSE"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getUnknown-4ZHQPSE, reason: not valid java name */
        public final int m6772getUnknown4ZHQPSE() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventType.Unknown;
        }

        /* renamed from: getPress-4ZHQPSE, reason: not valid java name */
        public final int m6770getPress4ZHQPSE() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventType.Press;
        }

        /* renamed from: getRelease-4ZHQPSE, reason: not valid java name */
        public final int m6771getRelease4ZHQPSE() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventType.Release;
        }

        /* renamed from: getMove-4ZHQPSE, reason: not valid java name */
        public final int m6769getMove4ZHQPSE() {
            return androidx.compose.ui.input.indirect.IndirectPointerEventType.Move;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ IndirectPointerEventType(int i) {
        this.getHighResolutionOutputSizeshNQ4ISI = i;
    }

    public final java.lang.String toString() {
        return m6767toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m6767toStringimpl(int i) {
        return m6765equalsimpl0(i, Press) ? "Press" : m6765equalsimpl0(i, Release) ? "Release" : m6765equalsimpl0(i, Move) ? "Move" : "Unknown";
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m6766hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m6764equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m6766hashCodeimpl(int i) {
        return java.lang.Integer.hashCode(i);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m6764equalsimpl(int i, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.input.indirect.IndirectPointerEventType) && i == ((androidx.compose.ui.input.indirect.IndirectPointerEventType) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.input.indirect.IndirectPointerEventType m6763boximpl(int i) {
        return new androidx.compose.ui.input.indirect.IndirectPointerEventType(i);
    }
}
