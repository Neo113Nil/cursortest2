package Nb;

import Ob.C3678a;
import Ob.C3679b;
import Ob.c;
import Sc.C;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: Nb.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C3666a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final long[] f18890a;

    /* renamed from: Nb.a$a, reason: collision with other inner class name */
    public static final class C0371a {
        @NotNull
        public static void a(@NotNull C3666a a11, @NotNull C3666a b11, @NotNull C3666a output) {
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b11, "b");
            Intrinsics.checkNotNullParameter(output, "output");
            long[] f7 = output.f();
            long j11 = a11.f()[0];
            C.Companion companion = C.INSTANCE;
            f7[0] = j11 + b11.f()[0];
            output.f()[1] = a11.f()[1] + b11.f()[1];
            output.f()[2] = a11.f()[2] + b11.f()[2];
            output.f()[3] = a11.f()[3] + b11.f()[3];
            output.f()[4] = a11.f()[4] + b11.f()[4];
        }

        public static /* synthetic */ C3666a b(C3666a c3666a, C3666a c3666a2) {
            C3666a c3666a3 = new C3666a();
            a(c3666a, c3666a2, c3666a3);
            return c3666a3;
        }

        private static void c(long j11, long[] jArr, long[] jArr2) {
            long j12 = jArr[1];
            C.Companion companion = C.INSTANCE;
            int i11 = c.f20179b;
            long[] storage = new long[2];
            Intrinsics.checkNotNullParameter(storage, "storage");
            c.a(j12, j11, 0L, storage);
            long j13 = storage[0];
            long j14 = storage[1];
            long j15 = jArr[0];
            long[] storage2 = new long[2];
            Intrinsics.checkNotNullParameter(storage2, "storage");
            c.a(j15, 0L, j14, storage2);
            jArr2[0] = storage2[0];
            jArr2[1] = j13;
        }

        @NotNull
        public static void d(@NotNull byte[] bytes, int i11, @NotNull C3666a output) {
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            Intrinsics.checkNotNullParameter(bytes, "bytes");
            Intrinsics.checkNotNullParameter(output, "output");
            long[] f7 = output.f();
            long a11 = C3678a.a(i11, bytes);
            j11 = b.f18891a;
            long j16 = a11 & j11;
            C.Companion companion = C.INSTANCE;
            f7[0] = j16;
            long[] f11 = output.f();
            long a12 = C3678a.a(i11 + 6, bytes) >>> 3;
            j12 = b.f18891a;
            f11[1] = a12 & j12;
            long[] f12 = output.f();
            long a13 = C3678a.a(i11 + 12, bytes) >>> 6;
            j13 = b.f18891a;
            f12[2] = a13 & j13;
            long[] f13 = output.f();
            long a14 = C3678a.a(i11 + 19, bytes) >>> 1;
            j14 = b.f18891a;
            f13[3] = a14 & j14;
            long[] f14 = output.f();
            long a15 = C3678a.a(i11 + 24, bytes) >>> 12;
            j15 = b.f18891a;
            f14[4] = a15 & j15;
        }

        @NotNull
        public static void e(@NotNull C3666a t2, @NotNull C3666a output) {
            Intrinsics.checkNotNullParameter(t2, "t");
            Intrinsics.checkNotNullParameter(output, "output");
            t2.getClass();
            C3666a c3666a = new C3666a();
            C3666a c3666a2 = new C3666a();
            C3666a c3666a3 = new C3666a();
            C3666a c3666a4 = new C3666a();
            C3666a c3666a5 = new C3666a();
            c3666a3.l(t2);
            c3666a4.j(c3666a3, 2);
            c3666a4.h(t2, c3666a4);
            c3666a.h(c3666a3, c3666a4);
            c3666a3.l(c3666a);
            c3666a4.h(c3666a4, c3666a3);
            c3666a3.j(c3666a4, 5);
            c3666a5.h(c3666a3, c3666a4);
            c3666a3.j(c3666a5, 10);
            c3666a4.h(c3666a3, c3666a5);
            c3666a3.j(c3666a4, 20);
            c3666a4.h(c3666a3, c3666a4);
            c3666a3.j(c3666a4, 10);
            c3666a5.h(c3666a3, c3666a5);
            c3666a3.j(c3666a5, 50);
            c3666a3.h(c3666a3, c3666a5);
            c3666a4.j(c3666a3, 100);
            c3666a3.h(c3666a4, c3666a3);
            c3666a3.j(c3666a3, 50);
            c3666a2.h(c3666a3, c3666a5);
            Pair pair = new Pair(c3666a2, c3666a);
            C3666a c3666a6 = (C3666a) pair.a();
            C3666a c3666a7 = (C3666a) pair.b();
            c3666a6.j(c3666a6, 5);
            f(c3666a6, c3666a7, output);
        }

        @NotNull
        public static void f(@NotNull C3666a a11, @NotNull C3666a b11, @NotNull C3666a output) {
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b11, "b");
            Intrinsics.checkNotNullParameter(output, "output");
            C3679b.a(output.f(), a11.f(), b11.f());
        }

        public static /* synthetic */ C3666a g(C3666a c3666a, C3666a c3666a2) {
            C3666a c3666a3 = new C3666a();
            f(c3666a, c3666a2, c3666a3);
            return c3666a3;
        }

        @NotNull
        public static void h(@NotNull C3666a t2, @NotNull C3666a output) {
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            long j16;
            Intrinsics.checkNotNullParameter(t2, "t");
            Intrinsics.checkNotNullParameter(output, "output");
            long j17 = t2.f()[0];
            C.Companion companion = C.INSTANCE;
            long[] c11 = c.c(j17);
            long[] c12 = c.c(t2.f()[1]);
            long[] c13 = c.c(t2.f()[2]);
            long[] c14 = c.c(t2.f()[3]);
            long[] c15 = c.c(t2.f()[4]);
            c((c11[0] << 13) | (c11[1] >>> 51), c12, c12);
            long j18 = c11[1];
            j11 = b.f18891a;
            long j19 = j18 & j11;
            c((c12[0] << 13) | (c12[1] >>> 51), c13, c13);
            long j21 = c12[1];
            j12 = b.f18891a;
            long j22 = j21 & j12;
            c((c13[0] << 13) | (c13[1] >>> 51), c14, c14);
            long[] f7 = output.f();
            long j23 = c13[1];
            j13 = b.f18891a;
            f7[2] = j23 & j13;
            c((c14[0] << 13) | (c14[1] >>> 51), c15, c15);
            long[] f11 = output.f();
            long j24 = c14[1];
            j14 = b.f18891a;
            f11[3] = j24 & j14;
            long j25 = (c15[0] << 13) | (c15[1] >>> 51);
            long[] f12 = output.f();
            long j26 = c15[1];
            j15 = b.f18891a;
            f12[4] = j26 & j15;
            long j27 = (j25 * (19 & 4294967295L)) + j19;
            output.f()[1] = j22 + (j27 >>> 51);
            long[] f13 = output.f();
            j16 = b.f18891a;
            f13[0] = j27 & j16;
        }

        @NotNull
        public static void i(@NotNull long[] limbs, @NotNull C3666a output) {
            long j11;
            long j12;
            long j13;
            long j14;
            long j15;
            Intrinsics.checkNotNullParameter(limbs, "limbs");
            Intrinsics.checkNotNullParameter(output, "output");
            long j16 = limbs[0];
            C.Companion companion = C.INSTANCE;
            long j17 = limbs[1];
            long j18 = limbs[2];
            long j19 = limbs[3];
            long j21 = limbs[4];
            long j22 = j16 >>> 51;
            long j23 = j17 >>> 51;
            long j24 = j18 >>> 51;
            long j25 = j19 >>> 51;
            j11 = b.f18891a;
            long j26 = j16 & j11;
            j12 = b.f18891a;
            long j27 = j17 & j12;
            j13 = b.f18891a;
            long j28 = j18 & j13;
            j14 = b.f18891a;
            long j29 = j19 & j14;
            j15 = b.f18891a;
            output.f()[0] = ((j21 >>> 51) * (19 & 4294967295L)) + j26;
            output.f()[1] = j27 + j22;
            output.f()[2] = j28 + j23;
            output.f()[3] = j29 + j24;
            output.f()[4] = (j21 & j15) + j25;
        }

        public static C3666a j(C3666a x11) {
            C3666a output = new C3666a();
            Intrinsics.checkNotNullParameter(x11, "x");
            Intrinsics.checkNotNullParameter(output, "output");
            C3679b.b(output.f(), x11.f(), 1);
            return output;
        }

        @NotNull
        public static void k(@NotNull C3666a a11, @NotNull C3666a b11, @NotNull C3666a output) {
            Intrinsics.checkNotNullParameter(a11, "a");
            Intrinsics.checkNotNullParameter(b11, "b");
            Intrinsics.checkNotNullParameter(output, "output");
            long j11 = a11.f()[0];
            C.Companion companion = C.INSTANCE;
            i(new long[]{(j11 + 36028797018963664L) - b11.f()[0], (a11.f()[1] + 36028797018963952L) - b11.f()[1], (a11.f()[2] + 36028797018963952L) - b11.f()[2], (a11.f()[3] + 36028797018963952L) - b11.f()[3], (a11.f()[4] + 36028797018963952L) - b11.f()[4]}, output);
        }

        public static /* synthetic */ C3666a l(C3666a c3666a, C3666a c3666a2) {
            C3666a c3666a3 = new C3666a();
            k(c3666a, c3666a2, c3666a3);
            return c3666a3;
        }
    }

    public C3666a(long[] inner) {
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.f18890a = inner;
    }

    private final void e(C3666a c3666a, int i11, int i12) {
        long[] jArr = c3666a.f18890a;
        long j11 = jArr[i11];
        C.Companion companion = C.INSTANCE;
        long[] jArr2 = this.f18890a;
        long j12 = jArr2[i11];
        long j13 = (-i12) & (j11 ^ j12);
        jArr[i11] = j11 ^ j13;
        jArr2[i11] = j12 ^ j13;
    }

    public static void g(C3666a output) {
        Intrinsics.checkNotNullParameter(output, "output");
        long[] jArr = output.f18890a;
        jArr[0] = 2251799813685228L;
        Uc.a.e(4, 2251799813685247L, jArr);
    }

    public static void i(C3666a output) {
        output.getClass();
        Intrinsics.checkNotNullParameter(output, "output");
        long[] jArr = output.f18890a;
        jArr[0] = 1;
        Uc.a.e(4, 0L, jArr);
    }

    public static void k(C3666a output, C3666a t2) {
        output.getClass();
        Intrinsics.checkNotNullParameter(t2, "t");
        Intrinsics.checkNotNullParameter(output, "output");
        long[] jArr = t2.f18890a;
        long[] destination = output.f18890a;
        int length = jArr.length;
        Intrinsics.checkNotNullParameter(jArr, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        System.arraycopy(jArr, 0, destination, 0, length);
    }

    public static void o(C3666a output) {
        output.getClass();
        Intrinsics.checkNotNullParameter(output, "output");
        Uc.a.e(6, 0L, output.f18890a);
    }

    @NotNull
    public final void a(@NotNull C3666a a11, @NotNull C3666a b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        C0371a.a(a11, b11, this);
    }

    public final void b(@NotNull C3666a other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        long[] jArr = other.f18890a;
        long j11 = jArr[0];
        C.Companion companion = C.INSTANCE;
        long[] jArr2 = this.f18890a;
        long j12 = jArr2[0];
        long j13 = -i11;
        jArr2[0] = ((j11 ^ j12) & j13) ^ j12;
        long j14 = jArr[1];
        long j15 = jArr2[1];
        jArr2[1] = ((j14 ^ j15) & j13) ^ j15;
        long j16 = jArr[2];
        long j17 = jArr2[2];
        jArr2[2] = ((j16 ^ j17) & j13) ^ j17;
        long j18 = jArr[3];
        long j19 = jArr2[3];
        jArr2[3] = ((j18 ^ j19) & j13) ^ j19;
        long j21 = jArr[4];
        long j22 = jArr2[4];
        jArr2[4] = ((j21 ^ j22) & j13) ^ j22;
    }

    public final void c(int i11) {
        C3666a c3666a = new C3666a();
        Intrinsics.checkNotNullParameter(this, "t");
        long[] jArr = this.f18890a;
        long j11 = jArr[0];
        C.Companion companion = C.INSTANCE;
        long[] limbs = {36028797018963664L - j11, 36028797018963952L - jArr[1], 36028797018963952L - jArr[2], 36028797018963952L - jArr[3], 36028797018963952L - jArr[4]};
        Intrinsics.checkNotNullParameter(limbs, "limbs");
        C0371a.i(limbs, c3666a);
        b(c3666a, i11);
    }

    public final void d(@NotNull C3666a other, int i11) {
        Intrinsics.checkNotNullParameter(other, "other");
        e(other, 0, i11);
        e(other, 1, i11);
        e(other, 2, i11);
        e(other, 3, i11);
        e(other, 4, i11);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3666a)) {
                return false;
            }
            C3666a other = (C3666a) obj;
            Intrinsics.checkNotNullParameter(other, "other");
            byte[] bArr = new byte[32];
            n(bArr);
            byte[] bArr2 = new byte[32];
            other.n(bArr2);
            if (Tb.a.a(bArr, bArr2) != 1) {
                return false;
            }
        }
        return true;
    }

    @NotNull
    public final long[] f() {
        return this.f18890a;
    }

    @NotNull
    public final void h(@NotNull C3666a a11, @NotNull C3666a b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        C0371a.f(a11, b11, this);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f18890a);
    }

    @NotNull
    public final void j(@NotNull C3666a t2, int i11) {
        Intrinsics.checkNotNullParameter(t2, "t");
        if (i11 <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        C3679b.b(this.f18890a, t2.f18890a, i11);
    }

    @NotNull
    public final void l(@NotNull C3666a x11) {
        Intrinsics.checkNotNullParameter(x11, "x");
        Intrinsics.checkNotNullParameter(x11, "x");
        Intrinsics.checkNotNullParameter(this, "output");
        C3679b.b(f(), x11.f(), 1);
    }

    @NotNull
    public final void m(@NotNull C3666a a11, @NotNull C3666a b11) {
        Intrinsics.checkNotNullParameter(a11, "a");
        Intrinsics.checkNotNullParameter(b11, "b");
        C0371a.k(a11, b11, this);
    }

    @NotNull
    public final void n(@NotNull byte[] output) {
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        Intrinsics.checkNotNullParameter(output, "output");
        C3666a c3666a = new C3666a();
        long[] limbs = this.f18890a;
        Intrinsics.checkNotNullParameter(limbs, "limbs");
        C0371a.i(limbs, c3666a);
        long[] jArr = c3666a.f18890a;
        long j16 = jArr[0];
        C.Companion companion = C.INSTANCE;
        long j17 = jArr[1];
        long j18 = jArr[2];
        long j19 = jArr[3];
        long j21 = jArr[4];
        long j22 = 19 & 4294967295L;
        long j23 = (j22 * ((j21 + ((j19 + ((j18 + ((j17 + ((j16 + j22) >>> 51)) >>> 51)) >>> 51)) >>> 51)) >>> 51)) + j16;
        long j24 = j17 + (j23 >>> 51);
        j11 = b.f18891a;
        long j25 = j23 & j11;
        long j26 = j18 + (j24 >>> 51);
        j12 = b.f18891a;
        long j27 = j12 & j24;
        long j28 = j19 + (j26 >>> 51);
        j13 = b.f18891a;
        long j29 = j13 & j26;
        long j31 = j21 + (j28 >>> 51);
        j14 = b.f18891a;
        long j32 = j14 & j28;
        j15 = b.f18891a;
        long j33 = j31 & j15;
        output[0] = (byte) j25;
        output[1] = (byte) (j25 >>> 8);
        output[2] = (byte) (j25 >>> 16);
        output[3] = (byte) (j25 >>> 24);
        output[4] = (byte) (j25 >>> 32);
        output[5] = (byte) (j25 >>> 40);
        output[6] = (byte) ((j25 >>> 48) | (j27 << 3));
        output[7] = (byte) (j27 >>> 5);
        output[8] = (byte) (j27 >>> 13);
        output[9] = (byte) (j27 >>> 21);
        output[10] = (byte) (j27 >>> 29);
        output[11] = (byte) (j27 >>> 37);
        output[12] = (byte) ((j27 >>> 45) | (j29 << 6));
        output[13] = (byte) (j29 >>> 2);
        output[14] = (byte) (j29 >>> 10);
        output[15] = (byte) (j29 >>> 18);
        output[16] = (byte) (j29 >>> 26);
        output[17] = (byte) (j29 >>> 34);
        output[18] = (byte) (j29 >>> 42);
        output[19] = (byte) ((j29 >>> 50) | (j32 << 1));
        output[20] = (byte) (j32 >>> 7);
        output[21] = (byte) (j32 >>> 15);
        output[22] = (byte) (j32 >>> 23);
        output[23] = (byte) (j32 >>> 31);
        output[24] = (byte) (j32 >>> 39);
        output[25] = (byte) ((j32 >>> 47) | (j33 << 4));
        output[26] = (byte) (j33 >>> 4);
        output[27] = (byte) (j33 >>> 12);
        output[28] = (byte) (j33 >>> 20);
        output[29] = (byte) (j33 >>> 28);
        output[30] = (byte) (j33 >>> 36);
        output[31] = (byte) (j33 >>> 44);
    }

    @NotNull
    public final String toString() {
        return "FieldElement(inner=" + ((Object) ("ULongArray(storage=" + Arrays.toString(this.f18890a) + ')')) + ')';
    }

    public /* synthetic */ C3666a() {
        this(new long[]{0, 0, 0, 0, 0});
    }

    public C3666a(long j11, long j12, long j13, long j14, long j15) {
        this(new long[]{j11, j12, j13, j14, j15});
    }
}
