package kotlin.internal;

/* compiled from: UProgressionUtil.kt */
@kotlin.Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a'\u0010\u0000\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u000f\u0010\u0006\u001a'\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0011\u0010\t¨\u0006\u0012"}, d2 = {"differenceModulo", "Lkotlin/UInt;", "a", "b", "c", "differenceModulo-WZ9TVnA", "(III)I", "Lkotlin/ULong;", "differenceModulo-sambcqE", "(JJJ)J", "getProgressionLastElement", "start", "end", "step", "", "getProgressionLastElement-Nkh28Cs", "", "getProgressionLastElement-7ftBX0g", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UProgressionUtilKt {
    /* renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m12013differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int compare;
        int m$3 = kotlin.UByte$$ExternalSyntheticBackport0.m$3(i, i3);
        int m$32 = kotlin.UByte$$ExternalSyntheticBackport0.m$3(i2, i3);
        compare = java.lang.Integer.compare(m$3 ^ Integer.MIN_VALUE, m$32 ^ Integer.MIN_VALUE);
        int m10896constructorimpl = kotlin.UInt.m10896constructorimpl(m$3 - m$32);
        return compare >= 0 ? m10896constructorimpl : kotlin.UInt.m10896constructorimpl(m10896constructorimpl + i3);
    }

    /* renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m12014differenceModulosambcqE(long j, long j2, long j3) {
        int compare;
        long m10867m = kotlin.UByte$$ExternalSyntheticBackport0.m10867m(j, j3);
        long m10867m2 = kotlin.UByte$$ExternalSyntheticBackport0.m10867m(j2, j3);
        compare = java.lang.Long.compare(m10867m ^ Long.MIN_VALUE, m10867m2 ^ Long.MIN_VALUE);
        long m10975constructorimpl = kotlin.ULong.m10975constructorimpl(m10867m - m10867m2);
        return compare >= 0 ? m10975constructorimpl : kotlin.ULong.m10975constructorimpl(m10975constructorimpl + j3);
    }

    /* renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m12016getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        int compare;
        int compare2;
        if (i3 > 0) {
            compare2 = java.lang.Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            return compare2 >= 0 ? i2 : kotlin.UInt.m10896constructorimpl(i2 - m12013differenceModuloWZ9TVnA(i2, i, kotlin.UInt.m10896constructorimpl(i3)));
        }
        if (i3 < 0) {
            compare = java.lang.Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
            return compare <= 0 ? i2 : kotlin.UInt.m10896constructorimpl(i2 + m12013differenceModuloWZ9TVnA(i, i2, kotlin.UInt.m10896constructorimpl(-i3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }

    /* renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m12015getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        int compare;
        int compare2;
        if (j3 > 0) {
            compare2 = java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            return compare2 >= 0 ? j2 : kotlin.ULong.m10975constructorimpl(j2 - m12014differenceModulosambcqE(j2, j, kotlin.ULong.m10975constructorimpl(j3)));
        }
        if (j3 < 0) {
            compare = java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
            return compare <= 0 ? j2 : kotlin.ULong.m10975constructorimpl(j2 + m12014differenceModulosambcqE(j, j2, kotlin.ULong.m10975constructorimpl(-j3)));
        }
        throw new java.lang.IllegalArgumentException("Step is zero.");
    }
}
