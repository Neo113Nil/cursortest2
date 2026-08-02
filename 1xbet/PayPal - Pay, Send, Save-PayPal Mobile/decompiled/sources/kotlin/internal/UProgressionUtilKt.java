package kotlin.internal;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\u001a'\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u0005\u001a'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0010\u0010\b"}, d2 = {"Lkotlin/UInt;", "p0", "p1", "p2", "getHighResolutionOutputSizeshNQ4ISI", "(III)I", "Lkotlin/ULong;", "Camera2StreamConfigurationMap", "(JJJ)J", com.adobe.marketing.mobile.internal.CoreConstants.EventDataKeys.Lifecycle.LIFECYCLE_START, "end", "", "step", "getProgressionLastElement-Nkh28Cs", "getProgressionLastElement", "", "getProgressionLastElement-7ftBX0g"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class UProgressionUtilKt {
    private static final int getHighResolutionOutputSizeshNQ4ISI(int i, int i2, int i3) {
        int remainderUnsigned = java.lang.Integer.remainderUnsigned(i, i3);
        int remainderUnsigned2 = java.lang.Integer.remainderUnsigned(i2, i3);
        int compareUnsigned = java.lang.Integer.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        int m23470constructorimpl = kotlin.UInt.m23470constructorimpl(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? m23470constructorimpl : kotlin.UInt.m23470constructorimpl(m23470constructorimpl + i3);
    }

    private static final long Camera2StreamConfigurationMap(long j, long j2, long j3) {
        long remainderUnsigned = java.lang.Long.remainderUnsigned(j, j3);
        long remainderUnsigned2 = java.lang.Long.remainderUnsigned(j2, j3);
        int compareUnsigned = java.lang.Long.compareUnsigned(remainderUnsigned, remainderUnsigned2);
        long m23494constructorimpl = kotlin.ULong.m23494constructorimpl(remainderUnsigned - remainderUnsigned2);
        return compareUnsigned >= 0 ? m23494constructorimpl : kotlin.ULong.m23494constructorimpl(m23494constructorimpl + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m23829getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            if (java.lang.Integer.compareUnsigned(i, i2) < 0) {
                return kotlin.UInt.m23470constructorimpl(i2 - getHighResolutionOutputSizeshNQ4ISI(i2, i, kotlin.UInt.m23470constructorimpl(i3)));
            }
        } else if (i3 < 0) {
            if (java.lang.Integer.compareUnsigned(i, i2) > 0) {
                return kotlin.UInt.m23470constructorimpl(i2 + getHighResolutionOutputSizeshNQ4ISI(i, i2, kotlin.UInt.m23470constructorimpl(-i3)));
            }
        } else {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        return i2;
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m23828getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            if (java.lang.Long.compareUnsigned(j, j2) < 0) {
                return kotlin.ULong.m23494constructorimpl(j2 - Camera2StreamConfigurationMap(j2, j, kotlin.ULong.m23494constructorimpl(j3)));
            }
        } else if (j3 < 0) {
            if (java.lang.Long.compareUnsigned(j, j2) > 0) {
                return kotlin.ULong.m23494constructorimpl(j2 + Camera2StreamConfigurationMap(j, j2, kotlin.ULong.m23494constructorimpl(-j3)));
            }
        } else {
            throw new java.lang.IllegalArgumentException("Step is zero.");
        }
        return j2;
    }
}
