package Ob;

import Sc.C;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Ob.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3679b {
    public static final void a(@NotNull long[] v11, @NotNull long[] a11, @NotNull long[] b11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        long j11 = a11[0];
        C.Companion companion = C.INSTANCE;
        long j12 = a11[1];
        long j13 = a11[2];
        long j14 = a11[3];
        long j15 = a11[4];
        long j16 = b11[0];
        long j17 = b11[1];
        long j18 = b11[2];
        long j19 = b11[3];
        long j21 = b11[4];
        long j22 = 19 & 4294967295L;
        long j23 = j12 * j22;
        long j24 = j13 * j22;
        long j25 = j14 * j22;
        long j26 = j15 * j22;
        long[] c11 = c(j11, j16);
        d(j23, j21, c11);
        d(j24, j19, c11);
        d(j25, j18, c11);
        d(j26, j17, c11);
        long[] c12 = c(j11, j17);
        d(j12, j16, c12);
        d(j24, j21, c12);
        d(j25, j19, c12);
        d(j26, j18, c12);
        long[] c13 = c(j11, j18);
        d(j12, j17, c13);
        d(j13, j16, c13);
        d(j25, j21, c13);
        d(j26, j19, c13);
        long[] c14 = c(j11, j19);
        d(j12, j18, c14);
        d(j13, j17, c14);
        d(j14, j16, c14);
        d(j26, j21, c14);
        long[] c15 = c(j11, j21);
        d(j12, j19, c15);
        d(j13, j18, c15);
        d(j14, j17, c15);
        d(j15, j16, c15);
        long f7 = f(c11);
        long f11 = f(c12);
        long f12 = f(c13);
        long f13 = f(c14);
        v11[0] = (f(c15) * 19) + (c11[0] & Kb.a.a());
        v11[1] = (c12[0] & Kb.a.a()) + f7;
        v11[2] = (c13[0] & Kb.a.a()) + f11;
        v11[3] = (c14[0] & Kb.a.a()) + f12;
        long a12 = (c15[0] & Kb.a.a()) + f13;
        v11[4] = a12;
        long j27 = v11[0];
        long j28 = v11[1] >>> 51;
        long j29 = v11[2] >>> 51;
        long j31 = v11[3] >>> 51;
        v11[0] = ((a12 >>> 51) * j22) + (j27 & Kb.a.a());
        v11[1] = (v11[1] & Kb.a.a()) + (j27 >>> 51);
        v11[2] = (v11[2] & Kb.a.a()) + j28;
        v11[3] = (v11[3] & Kb.a.a()) + j29;
        v11[4] = (v11[4] & Kb.a.a()) + j31;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(@NotNull long[] fe2, @NotNull long[] t2, int i11) {
        Intrinsics.checkNotNullParameter(fe2, "fe");
        Intrinsics.checkNotNullParameter(t2, "t");
        long j11 = t2[0];
        C.Companion companion = C.INSTANCE;
        long j12 = t2[1];
        long j13 = t2[2];
        long j14 = t2[3];
        char c11 = 4;
        int i12 = 0;
        long j15 = t2[4];
        Object[] objArr = false;
        while (i12 < i11) {
            char c12 = c11;
            long j16 = j13;
            long j17 = 19 & 4294967295L;
            long j18 = j14 * j17;
            long j19 = j15 * j17;
            Object[] objArr2 = objArr;
            long j21 = 2 & 4294967295L;
            long j22 = j11 * j21;
            long j23 = j12 * j21;
            long j24 = j15;
            long j25 = j16 * j21;
            long j26 = j12;
            long[] c13 = c(j11, j11);
            d(j23, j19, c13);
            d(j25, j18, c13);
            long[] c14 = c(j14, j18);
            d(j22, j26, c14);
            d(j25, j19, c14);
            long[] c15 = c(j26, j26);
            d(j22, j16, c15);
            d(j24 * j21, j18, c15);
            long[] c16 = c(j24, j19);
            d(j22, j14, c16);
            d(j23, j16, c16);
            long[] c17 = c(j16, j16);
            d(j22, j24, c17);
            d(j23, j14, c17);
            long j27 = c13[objArr2 == true ? 1 : 0];
            C.Companion companion2 = C.INSTANCE;
            long a11 = j27 & Kb.a.a();
            e(c13, c14);
            long a12 = c14[objArr2 == true ? 1 : 0] & Kb.a.a();
            e(c14, c15);
            j13 = Kb.a.a() & c15[objArr2 == true ? 1 : 0];
            e(c15, c16);
            j14 = c16[objArr2 == true ? 1 : 0] & Kb.a.a();
            e(c16, c17);
            j15 = c17[objArr2 == true ? 1 : 0] & Kb.a.a();
            long f7 = (f(c17) * j17) + a11;
            j12 = a12 + (f7 >>> 51);
            j11 = f7 & Kb.a.a();
            i12++;
            c11 = c12;
            objArr = objArr2 == true ? 1 : 0;
        }
        fe2[objArr == true ? 1 : 0] = j11;
        fe2[1] = j12;
        fe2[2] = j13;
        fe2[3] = j14;
        fe2[c11] = j15;
    }

    private static final long[] c(long j11, long j12) {
        long[] storage = new long[2];
        Intrinsics.checkNotNullParameter(storage, "storage");
        c.b(j11, j12, storage);
        long j13 = storage[0];
        C.Companion companion = C.INSTANCE;
        storage[0] = storage[1];
        storage[1] = j13;
        return storage;
    }

    private static final void d(long j11, long j12, long[] jArr) {
        long j13 = jArr[1];
        C.Companion companion = C.INSTANCE;
        long j14 = jArr[0];
        c.b(j11, j12, jArr);
        long j15 = jArr[0];
        c.a(j14, jArr[1], 0L, jArr);
        long j16 = jArr[0];
        c.a(j13, j15, jArr[1], jArr);
        long j17 = jArr[0];
        jArr[0] = j16;
        jArr[1] = j17;
    }

    private static final void e(long[] jArr, long[] jArr2) {
        long f7 = f(jArr);
        long[] storage = new long[2];
        Intrinsics.checkNotNullParameter(storage, "storage");
        long j11 = jArr2[0];
        C.Companion companion = C.INSTANCE;
        c.a(j11, f7, 0L, storage);
        long j12 = storage[0];
        c.a(jArr2[1], 0L, storage[1], storage);
        long j13 = storage[0];
        jArr2[0] = j12;
        jArr2[1] = j13;
    }

    public static final long f(@NotNull long[] uInt128) {
        Intrinsics.checkNotNullParameter(uInt128, "uInt128");
        long j11 = uInt128[1];
        C.Companion companion = C.INSTANCE;
        return (j11 << 13) | (uInt128[0] >>> 51);
    }
}
