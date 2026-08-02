package androidx.compose.foundation.lazy.staggeredgrid;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0012\u0010\u001a\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0019R\u0012\u0010\u001e\u001a\u00020\u00068Ç\u0002¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0019\u0088\u0001\u0014\u0092\u0001\u00020\u0002"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "", "p0", "getHighResolutionOutputSizeshNQ4ISI", "(J)J", "", "lane", "span", "constructor-impl", "(II)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "packedValue", "J", "getPackedValue", "()J", "getStart-impl", "(J)I", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "getEnd-impl", "end", "getSize-impl", io.ktor.http.ContentDisposition.Parameters.Size}, k = 1, mv = {2, 0, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes6.dex */
public final class SpanRange {
    private final long packedValue;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1909equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getEnd-impl, reason: not valid java name */
    public static final int m1910getEndimpl(long j) {
        return (int) (j & 4294967295L);
    }

    private static long getHighResolutionOutputSizeshNQ4ISI(long j) {
        return j;
    }

    /* renamed from: getSize-impl, reason: not valid java name */
    public static final int m1911getSizeimpl(long j) {
        return ((int) (4294967295L & j)) - ((int) (j >> 32));
    }

    /* renamed from: getStart-impl, reason: not valid java name */
    public static final int m1912getStartimpl(long j) {
        return (int) (j >> 32);
    }

    private /* synthetic */ SpanRange(long j) {
        this.packedValue = j;
    }

    public final long getPackedValue() {
        return this.packedValue;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1907constructorimpl(int i, int i2) {
        return getHighResolutionOutputSizeshNQ4ISI(((i2 + i) & 4294967295L) | (i << 32));
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m1915unboximpl() {
        return this.packedValue;
    }

    public final java.lang.String toString() {
        return m1914toStringimpl(this.packedValue);
    }

    public final int hashCode() {
        return m1913hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object other) {
        return m1908equalsimpl(this.packedValue, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1914toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("SpanRange(packedValue=");
        sb.append(j);
        sb.append(')');
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1913hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1908equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.compose.foundation.lazy.staggeredgrid.SpanRange) && j == ((androidx.compose.foundation.lazy.staggeredgrid.SpanRange) obj).m1915unboximpl();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.SpanRange m1906boximpl(long j) {
        return new androidx.compose.foundation.lazy.staggeredgrid.SpanRange(j);
    }
}
