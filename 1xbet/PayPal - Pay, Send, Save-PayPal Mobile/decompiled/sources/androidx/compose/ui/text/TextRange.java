package androidx.compose.ui.text;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0087@\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010 \u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010\"\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b!\u0010\u001dR\u0011\u0010$\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b#\u0010\u001dR\u0011\u0010'\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0011\u0010)\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b(\u0010&R\u0011\u0010+\u001a\u00020\r8G¢\u0006\u0006\u001a\u0004\b*\u0010\u001d\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/text/TextRange;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "intersects-5zc-tL8", "(JJ)Z", "intersects", "contains-5zc-tL8", "contains", "", "offset", "contains-impl", "(JI)Z", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "getHighSpeedVideoFpsRanges", "J", "getHighResolutionOutputSizeshNQ4ISI", "getStart-impl", "(J)I", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getEnd-impl", "end", "getMin-impl", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MIN_KEY, "getMax-impl", com.datadog.android.core.internal.metrics.BatchMetricsDispatcher.UPLOADER_DELAY_MAX_KEY, "getCollapsed-impl", "(J)Z", "collapsed", "getReversed-impl", "reversed", "getLength-impl", "length", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class TextRange {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.text.TextRange.Companion INSTANCE = new androidx.compose.ui.text.TextRange.Companion(null);
    private static final long Zero = androidx.compose.ui.text.TextRangeKt.TextRange(0);

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final long getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8028constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8032equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m8034getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m8039getStartimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ TextRange(long j) {
        this.getHighResolutionOutputSizeshNQ4ISI = j;
    }

    /* renamed from: getMin-impl, reason: not valid java name */
    public static final int m8037getMinimpl(long j) {
        return java.lang.Math.min(m8039getStartimpl(j), m8034getEndimpl(j));
    }

    /* renamed from: getMax-impl, reason: not valid java name */
    public static final int m8036getMaximpl(long j) {
        return java.lang.Math.max(m8039getStartimpl(j), m8034getEndimpl(j));
    }

    /* renamed from: getCollapsed-impl, reason: not valid java name */
    public static final boolean m8033getCollapsedimpl(long j) {
        return m8039getStartimpl(j) == m8034getEndimpl(j);
    }

    /* renamed from: getReversed-impl, reason: not valid java name */
    public static final boolean m8038getReversedimpl(long j) {
        return m8039getStartimpl(j) > m8034getEndimpl(j);
    }

    /* renamed from: getLength-impl, reason: not valid java name */
    public static final int m8035getLengthimpl(long j) {
        return m8036getMaximpl(j) - m8037getMinimpl(j);
    }

    /* renamed from: intersects-5zc-tL8, reason: not valid java name */
    public static final boolean m8041intersects5zctL8(long j, long j2) {
        return (m8037getMinimpl(j) < m8036getMaximpl(j2)) & (m8037getMinimpl(j2) < m8036getMaximpl(j));
    }

    /* renamed from: contains-5zc-tL8, reason: not valid java name */
    public static final boolean m8029contains5zctL8(long j, long j2) {
        return (m8037getMinimpl(j) <= m8037getMinimpl(j2)) & (m8036getMaximpl(j2) <= m8036getMaximpl(j));
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m8030containsimpl(long j, int i) {
        return i < m8036getMaximpl(j) && m8037getMinimpl(j) <= i;
    }

    public final java.lang.String toString() {
        return m8042toStringimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8042toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("TextRange(");
        sb.append(m8039getStartimpl(j));
        sb.append(", ");
        sb.append(m8034getEndimpl(j));
        sb.append(')');
        return sb.toString();
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/text/TextRange$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/TextRange;", "Zero", "J", "getZero-d9O1mEE", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-d9O1mEE, reason: not valid java name */
        public final long m8044getZerod9O1mEE() {
            return androidx.compose.ui.text.TextRange.Zero;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighResolutionOutputSizeshNQ4ISI() {
        return this.getHighResolutionOutputSizeshNQ4ISI;
    }

    public final int hashCode() {
        return m8040hashCodeimpl(this.getHighResolutionOutputSizeshNQ4ISI);
    }

    public final boolean equals(java.lang.Object other) {
        return m8031equalsimpl(this.getHighResolutionOutputSizeshNQ4ISI, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8040hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8031equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.text.TextRange) && j == ((androidx.compose.ui.text.TextRange) obj).getGetHighResolutionOutputSizeshNQ4ISI();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.text.TextRange m8027boximpl(long j) {
        return new androidx.compose.ui.text.TextRange(j);
    }
}
