package androidx.collection;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\f\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002H\u0086\n¢\u0006\u0004\b\r\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0011\u0010\u0004\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u000b\u0088\u0001\b\u0092\u0001\u00020\u0007"}, d2 = {"Landroidx/collection/IntIntPair;", "", "", "first", "second", "constructor-impl", "(II)J", "", "packedValue", "(J)J", "component1-impl", "(J)I", "component1", "component2-impl", "component2", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "hashCode-impl", "hashCode", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "getFirst-impl", "J", "getSecond-impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class IntIntPair {
    public final long packedValue;

    /* renamed from: component1-impl, reason: not valid java name */
    public static final int m1080component1impl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: component2-impl, reason: not valid java name */
    public static final int m1081component2impl(long j) {
        return (int) (j & 4294967295L);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1083constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1085equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m1086getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m1087getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    private /* synthetic */ IntIntPair(long j) {
        this.packedValue = j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m1082constructorimpl(int i, int i2) {
        return m1083constructorimpl((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m1089toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("(");
        sb.append(m1086getFirstimpl(j));
        sb.append(", ");
        sb.append(m1087getSecondimpl(j));
        sb.append(')');
        return sb.toString();
    }

    public final java.lang.String toString() {
        return m1089toStringimpl(this.packedValue);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getPackedValue() {
        return this.packedValue;
    }

    public final int hashCode() {
        return m1088hashCodeimpl(this.packedValue);
    }

    public final boolean equals(java.lang.Object obj) {
        return m1084equalsimpl(this.packedValue, obj);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m1088hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m1084equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof androidx.collection.IntIntPair) && j == ((androidx.collection.IntIntPair) obj).getPackedValue();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ androidx.collection.IntIntPair m1079boximpl(long j) {
        return new androidx.collection.IntIntPair(j);
    }
}
