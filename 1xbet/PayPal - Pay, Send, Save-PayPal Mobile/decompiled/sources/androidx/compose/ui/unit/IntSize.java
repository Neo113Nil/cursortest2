package androidx.compose.ui.unit;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087@\u0018\u0000 %2\u00020\u0001:\u0001%B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006H\u0086\n¢\u0006\u0004\b\n\u0010\bJ\u0018\u0010\u000f\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010!\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010\bR\u0018\u0010$\u001a\u00020\u00068Ç\u0002¢\u0006\f\u0012\u0004\b#\u0010 \u001a\u0004\b\"\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/unit/IntSize;", "", "", "packedValue", "constructor-impl", "(J)J", "", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "other", "times-YEO4UFw", "(JI)J", "times", "div-YEO4UFw", "div", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", "getPackedValue", "()J", "getWidth-impl", "getWidth$annotations", "()V", "width", "getHeight-impl", "getHeight$annotations", "height", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class IntSize {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.compose.ui.unit.IntSize.Companion INSTANCE = new androidx.compose.ui.unit.IntSize.Companion(null);
    private static final long Zero = m8767constructorimpl(0);
    private final long packedValue;

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m8765component1impl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m8766component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m8767constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8770equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getHeight$annotations() {
    }

    /* renamed from: getHeight-impl, reason: not valid java name */
    public static final int m8771getHeightimpl(long j) {
        return (int) (j & 4294967295L);
    }

    public static /* synthetic */ void getWidth$annotations() {
    }

    /* renamed from: getWidth-impl, reason: not valid java name */
    public static final int m8772getWidthimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ IntSize(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: times-YEO4UFw, reason: not valid java name */
    public static final long m8774timesYEO4UFw(long j, int i) {
        int i2 = (int) (j >> 32);
        return m8767constructorimpl(((((int) (j & 4294967295L)) * i) & 4294967295L) | ((i2 * i) << 32));
    }

    /* renamed from: div-YEO4UFw, reason: not valid java name */
    public static final long m8768divYEO4UFw(long j, int i) {
        return m8767constructorimpl(((((int) (j >> 32)) / i) << 32) | ((((int) (j & 4294967295L)) / i) & 4294967295L));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m8775toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append((int) (j >> 32));
        sb.append(" x ");
        sb.append((int) (j & 4294967295L));
        return sb.toString();
    }

    public final java.lang.String toString() {
        return m8775toStringimpl(this.packedValue);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/unit/IntSize$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntSize;", "Zero", "J", "getZero-YbymL2g", "()J"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* renamed from: getZero-YbymL2g, reason: not valid java name */
        public final long m8777getZeroYbymL2g() {
            return androidx.compose.ui.unit.IntSize.Zero;
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m8776unboximpl() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m8773hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m8769equalsimpl(this.packedValue, other);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8773hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8769equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.unit.IntSize) && j == ((androidx.compose.ui.unit.IntSize) obj).m8776unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.unit.IntSize m8764boximpl(long j) {
        return new androidx.compose.ui.unit.IntSize(j);
    }
}
