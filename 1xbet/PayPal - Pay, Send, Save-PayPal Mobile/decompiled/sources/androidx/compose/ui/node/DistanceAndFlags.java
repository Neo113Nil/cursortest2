package androidx.compose.ui.node;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0019\u001a\u00020\u00168G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u000b8G¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/ui/node/DistanceAndFlags;", "", "", "packedValue", "constructor-impl", "(J)J", "other", "", "compareTo-9YPOF3E", "(JJ)I", "compareTo", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getPackedValue", "()J", "", "getDistance-impl", "(J)F", "distance", "isInLayer-impl", "(J)Z", "isInLayer", "isInExpandedBounds-impl", "isInExpandedBounds"}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class DistanceAndFlags {
    private final long packedValue;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m7521constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7523equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: isInExpandedBounds-impl, reason: not valid java name */
    public static final boolean m7526isInExpandedBoundsimpl(long j) {
        return (j & 2) != 0;
    }

    /* renamed from: isInLayer-impl, reason: not valid java name */
    public static final boolean m7527isInLayerimpl(long j) {
        return (j & 1) != 0;
    }

    private /* synthetic */ DistanceAndFlags(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: compareTo-9YPOF3E, reason: not valid java name */
    public static final int m7520compareTo9YPOF3E(long j, long j2) {
        boolean m7527isInLayerimpl = m7527isInLayerimpl(j);
        if (m7527isInLayerimpl != m7527isInLayerimpl(j2)) {
            return m7527isInLayerimpl ? -1 : 1;
        }
        return (java.lang.Math.min(m7524getDistanceimpl(j), m7524getDistanceimpl(j2)) < 0.0f || m7526isInExpandedBoundsimpl(j) == m7526isInExpandedBoundsimpl(j2)) ? (int) java.lang.Math.signum(m7524getDistanceimpl(j) - m7524getDistanceimpl(j2)) : m7526isInExpandedBoundsimpl(j) ? -1 : 1;
    }

    /* renamed from: getDistance-impl, reason: not valid java name */
    public static final float m7524getDistanceimpl(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m7529unboximpl() {
        return this.packedValue;
    }

    public final java.lang.String toString() {
        return m7528toStringimpl(this.packedValue);
    }

    public final int hashCode() {
        return m7525hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m7522equalsimpl(this.packedValue, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m7528toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DistanceAndFlags(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7525hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7522equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.ui.node.DistanceAndFlags) && j == ((androidx.compose.ui.node.DistanceAndFlags) obj).m7529unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.ui.node.DistanceAndFlags m7519boximpl(long j) {
        return new androidx.compose.ui.node.DistanceAndFlags(j);
    }
}
