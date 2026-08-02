package kotlin.comparisons;

@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\b\u0002\u001a-\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a5\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0007\u001a9\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\u00028\u0000¢\u0006\u0004\b\u0004\u0010\n\u001a!\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\t\u001a\u00020\f\"\u00020\u000b¢\u0006\u0004\b\u0004\u0010\r\u001a!\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\n\u0010\t\u001a\u00020\u000f\"\u00020\u000e¢\u0006\u0004\b\u0004\u0010\u0010\u001a!\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00112\n\u0010\t\u001a\u00020\u0012\"\u00020\u0011¢\u0006\u0004\b\u0004\u0010\u0013\u001a!\u0010\u0004\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00142\n\u0010\t\u001a\u00020\u0015\"\u00020\u0014¢\u0006\u0004\b\u0004\u0010\u0016\u001a!\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00172\n\u0010\t\u001a\u00020\u0018\"\u00020\u0017¢\u0006\u0004\b\u0004\u0010\u0019\u001a!\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\n\u0010\t\u001a\u00020\u001b\"\u00020\u001a¢\u0006\u0004\b\u0004\u0010\u001c\u001a-\u0010\u001d\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u0005\u001a5\u0010\u001d\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u0007\u001a9\u0010\u001d\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\u00028\u0000¢\u0006\u0004\b\u001d\u0010\n\u001a!\u0010\u001d\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\t\u001a\u00020\f\"\u00020\u000b¢\u0006\u0004\b\u001d\u0010\r\u001a!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000e2\n\u0010\t\u001a\u00020\u000f\"\u00020\u000e¢\u0006\u0004\b\u001d\u0010\u0010\u001a!\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u00112\n\u0010\t\u001a\u00020\u0012\"\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u0013\u001a!\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u00142\n\u0010\t\u001a\u00020\u0015\"\u00020\u0014¢\u0006\u0004\b\u001d\u0010\u0016\u001a!\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0002\u001a\u00020\u00172\n\u0010\t\u001a\u00020\u0018\"\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u0019\u001a!\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\n\u0010\t\u001a\u00020\u001b\"\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001c"}, d2 = {"", "T", "a", util.h.xy.cb.b.f1091, "maxOf", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "other", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "(B[B)B", "", "", "(S[S)S", "", "", "(I[I)I", "", "", "(J[J)J", "", "", "(F[F)F", "", "", "(D[D)D", "minOf"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
/* loaded from: classes3.dex */
public class ComparisonsKt___ComparisonsJvmKt extends kotlin.comparisons.ComparisonsKt__ComparisonsKt {
    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T t, T t2, T t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        return (T) kotlin.comparisons.ComparisonsKt.maxOf(t, kotlin.comparisons.ComparisonsKt.maxOf(t2, t3));
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T t, T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        for (T t2 : tArr) {
            t = (T) kotlin.comparisons.ComparisonsKt.maxOf(t, t2);
        }
        return t;
    }

    public static final byte maxOf(byte b, byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        for (byte b2 : bArr) {
            b = (byte) java.lang.Math.max((int) b, (int) b2);
        }
        return b;
    }

    public static final short maxOf(short s, short... sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        for (short s2 : sArr) {
            s = (short) java.lang.Math.max((int) s, (int) s2);
        }
        return s;
    }

    public static final int maxOf(int i, int... iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = java.lang.Math.max(i, i2);
        }
        return i;
    }

    public static final long maxOf(long j, long... jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        for (long j2 : jArr) {
            j = java.lang.Math.max(j, j2);
        }
        return j;
    }

    public static final float maxOf(float f, float... fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = java.lang.Math.max(f, f2);
        }
        return f;
    }

    public static final double maxOf(double d, double... dArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dArr, "");
        for (double d2 : dArr) {
            d = java.lang.Math.max(d, d2);
        }
        return d;
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T t, T t2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T t, T t2, T t3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        return (T) kotlin.comparisons.ComparisonsKt.minOf(t, kotlin.comparisons.ComparisonsKt.minOf(t2, t3));
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T t, T... tArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tArr, "");
        for (T t2 : tArr) {
            t = (T) kotlin.comparisons.ComparisonsKt.minOf(t, t2);
        }
        return t;
    }

    public static final byte minOf(byte b, byte... bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "");
        for (byte b2 : bArr) {
            b = (byte) java.lang.Math.min((int) b, (int) b2);
        }
        return b;
    }

    public static final short minOf(short s, short... sArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sArr, "");
        for (short s2 : sArr) {
            s = (short) java.lang.Math.min((int) s, (int) s2);
        }
        return s;
    }

    public static final int minOf(int i, int... iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        for (int i2 : iArr) {
            i = java.lang.Math.min(i, i2);
        }
        return i;
    }

    public static final long minOf(long j, long... jArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(jArr, "");
        for (long j2 : jArr) {
            j = java.lang.Math.min(j, j2);
        }
        return j;
    }

    public static final float minOf(float f, float... fArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fArr, "");
        for (float f2 : fArr) {
            f = java.lang.Math.min(f, f2);
        }
        return f;
    }

    public static final double minOf(double d, double... dArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dArr, "");
        for (double d2 : dArr) {
            d = java.lang.Math.min(d, d2);
        }
        return d;
    }
}
