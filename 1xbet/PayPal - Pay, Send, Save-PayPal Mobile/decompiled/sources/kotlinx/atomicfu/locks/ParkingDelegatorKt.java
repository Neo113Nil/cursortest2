package kotlinx.atomicfu.locks;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0005"}, d2 = {"", "", "nanos", "addNanosToSeconds", "(IJ)I", "(JJ)J"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ParkingDelegatorKt {
    public static final int addNanosToSeconds(int i, long j) {
        return (int) kotlin.ranges.RangesKt.coerceIn(i + (j / 1000000000), androidx.collection.SieveCacheKt.NodeMetaAndPreviousMask, androidx.collection.SieveCacheKt.NodeLinkMask);
    }

    public static final long addNanosToSeconds(long j, long j2) {
        if (j2 < 0) {
            throw new java.lang.IllegalStateException("Cannot wait for a negative number of nanoseconds".toString());
        }
        long j3 = (j2 / 1000000000) + j;
        if ((j ^ j3) >= 0 || j < 0) {
            return j3;
        }
        throw new java.lang.IllegalStateException("Nano seconds addition overflowed, current time in seconds is ".concat(java.lang.String.valueOf(j)).toString());
    }
}
