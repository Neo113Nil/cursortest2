package coil3.content;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087@\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\b\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0018\u0088\u0001\u001a\u0092\u0001\u00020\u0002"}, d2 = {"Lcoil3/util/IntPair;", "", "", "p0", "getHighSpeedVideoFpsRangesFor", "(J)J", "", "first", "second", "constructor-impl", "(II)J", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Camera2StreamConfigurationMap", "J", "getHighSpeedVideoFpsRanges", "getFirst-impl", "(J)I", "getSecond-impl", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE}, k = 1, mv = {2, 1, 0}, xi = 48)
@kotlin.jvm.JvmInline
/* loaded from: classes.dex */
public final class IntPair {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final long getHighSpeedVideoFpsRanges;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m9813equalsimpl0(long j, long j2) {
        return j == j2;
    }

    /* renamed from: getFirst-impl, reason: not valid java name */
    public static final int m9814getFirstimpl(long j) {
        return (int) (j >> 32);
    }

    private static long getHighSpeedVideoFpsRangesFor(long j) {
        return j;
    }

    /* renamed from: getSecond-impl, reason: not valid java name */
    public static final int m9815getSecondimpl(long j) {
        return (int) (j & 4294967295L);
    }

    private /* synthetic */ IntPair(long j) {
        this.getHighSpeedVideoFpsRanges = j;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static long m9811constructorimpl(int i, int i2) {
        return getHighSpeedVideoFpsRangesFor((i2 & 4294967295L) | (i << 32));
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ long getGetHighSpeedVideoFpsRanges() {
        return this.getHighSpeedVideoFpsRanges;
    }

    public final java.lang.String toString() {
        return m9817toStringimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final int hashCode() {
        return m9816hashCodeimpl(this.getHighSpeedVideoFpsRanges);
    }

    public final boolean equals(java.lang.Object other) {
        return m9812equalsimpl(this.getHighSpeedVideoFpsRanges, other);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static java.lang.String m9817toStringimpl(long j) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("IntPair(value=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m9816hashCodeimpl(long j) {
        return java.lang.Long.hashCode(j);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m9812equalsimpl(long j, java.lang.Object obj) {
        return (obj instanceof coil3.content.IntPair) && j == ((coil3.content.IntPair) obj).getGetHighSpeedVideoFpsRanges();
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ coil3.content.IntPair m9810boximpl(long j) {
        return new coil3.content.IntPair(j);
    }
}
