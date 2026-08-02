package kotlin.internal;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\u0007\u001a'\u0010\u000b\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u001a'\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u000b\u0010\u0007"}, d2 = {"", "p0", "p1", "p2", "getHighSpeedVideoSizes", "(III)I", "", "(JJJ)J", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "step", "getProgressionLastElement"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProgressionUtilKt {
    public static final int getProgressionLastElement(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                return i2 - getHighSpeedVideoSizes(i2, i, i3);
            }
        } else {
            if (i3 >= 0) {
                throw new java.lang.IllegalArgumentException("Step is zero.");
            }
            if (i > i2) {
                return i2 + getHighSpeedVideoSizes(i, i2, -i3);
            }
        }
        return i2;
    }

    public static final long getProgressionLastElement(long j, long j2, long j3) {
        if (j3 > 0) {
            if (j < j2) {
                return j2 - getHighSpeedVideoSizes(j2, j, j3);
            }
        } else {
            if (j3 >= 0) {
                throw new java.lang.IllegalArgumentException("Step is zero.");
            }
            if (j > j2) {
                return j2 + getHighSpeedVideoSizes(j, j2, -j3);
            }
        }
        return j2;
    }

    private static final int getHighSpeedVideoSizes(int i, int i2, int i3) {
        int i4 = i % i3;
        if (i4 < 0) {
            i4 += i3;
        }
        int i5 = i2 % i3;
        if (i5 < 0) {
            i5 += i3;
        }
        int i6 = (i4 - i5) % i3;
        return i6 >= 0 ? i6 : i6 + i3;
    }

    private static final long getHighSpeedVideoSizes(long j, long j2, long j3) {
        long j4 = j % j3;
        if (j4 < 0) {
            j4 += j3;
        }
        long j5 = j2 % j3;
        if (j5 < 0) {
            j5 += j3;
        }
        long j6 = (j4 - j5) % j3;
        return j6 >= 0 ? j6 : j6 + j3;
    }
}
