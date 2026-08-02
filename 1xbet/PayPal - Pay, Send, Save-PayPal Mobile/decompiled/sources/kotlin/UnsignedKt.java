package kotlin;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0000¢\u0006\u0004\b\f\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u000f\u0010\u0004\u001a\u001f\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001f\u0010 "}, d2 = {"Lkotlin/UInt;", "v1", "v2", "uintRemainder-J1ME1BU", "(II)I", "uintRemainder", "uintDivide-J1ME1BU", "uintDivide", "Lkotlin/ULong;", "ulongDivide-eb3DHEI", "(JJ)J", "ulongDivide", "ulongRemainder-eb3DHEI", "ulongRemainder", "", "uintCompare", "", "ulongCompare", "(JJ)I", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "", "uintToDouble", "(I)D", "doubleToUInt", "(D)I", "ulongToDouble", "(J)D", "doubleToULong", "(D)J", "base", "", "ulongToString", "(JI)Ljava/lang/String;"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UnsignedKt {
    public static final double uintToDouble(int i) {
        return (Integer.MAX_VALUE & i) + (((i >>> 31) << 30) * 2.0d);
    }

    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    /* renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m23542uintRemainderJ1ME1BU(int i, int i2) {
        return kotlin.UInt.m23470constructorimpl((int) ((i & 4294967295L) % (i2 & 4294967295L)));
    }

    /* renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m23541uintDivideJ1ME1BU(int i, int i2) {
        return kotlin.UInt.m23470constructorimpl((int) ((i & 4294967295L) / (i2 & 4294967295L)));
    }

    /* renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m23543ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return java.lang.Long.compareUnsigned(j, j2) < 0 ? kotlin.ULong.m23494constructorimpl(0L) : kotlin.ULong.m23494constructorimpl(1L);
        }
        if (j >= 0) {
            return kotlin.ULong.m23494constructorimpl(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return kotlin.ULong.m23494constructorimpl(j3 + (java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(j - (j3 * j2)), kotlin.ULong.m23494constructorimpl(j2)) < 0 ? 0 : 1));
    }

    /* renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m23544ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return java.lang.Long.compareUnsigned(j, j2) < 0 ? j : kotlin.ULong.m23494constructorimpl(j - j2);
        }
        if (j >= 0) {
            return kotlin.ULong.m23494constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (java.lang.Long.compareUnsigned(kotlin.ULong.m23494constructorimpl(j3), kotlin.ULong.m23494constructorimpl(j2)) < 0) {
            j2 = 0;
        }
        return kotlin.ULong.m23494constructorimpl(j3 - j2);
    }

    public static final int uintCompare(int i, int i2) {
        return kotlin.jvm.internal.Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int ulongCompare(long j, long j2) {
        return kotlin.jvm.internal.Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final int doubleToUInt(double d) {
        if (java.lang.Double.isNaN(d) || d <= 0.0d) {
            return 0;
        }
        if (d >= 4.294967295E9d) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return kotlin.UInt.m23470constructorimpl((int) d);
        }
        return kotlin.UInt.m23470constructorimpl(kotlin.UInt.m23470constructorimpl((int) (d - 2.147483647E9d)) + Integer.MAX_VALUE);
    }

    public static final long doubleToULong(double d) {
        if (java.lang.Double.isNaN(d) || d <= 0.0d) {
            return 0L;
        }
        if (d >= 1.8446744073709552E19d) {
            return -1L;
        }
        if (d < 9.223372036854776E18d) {
            return kotlin.ULong.m23494constructorimpl((long) d);
        }
        return kotlin.ULong.m23494constructorimpl(kotlin.ULong.m23494constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final java.lang.String ulongToString(long j, int i) {
        if (j >= 0) {
            java.lang.String l = java.lang.Long.toString(j, kotlin.text.CharsKt.checkRadix(i));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l, "");
            return l;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String l2 = java.lang.Long.toString(j3, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l2, "");
        sb.append(l2);
        java.lang.String l3 = java.lang.Long.toString(j4, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(l3, "");
        sb.append(l3);
        return sb.toString();
    }
}
