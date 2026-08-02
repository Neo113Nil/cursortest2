package I0;

import A0.C0040k0;
import A0.RunnableC0049o;
import A0.W0;
import B.K;
import G4.l;
import R.e;
import W0.j;
import android.os.Handler;
import h0.C1987a;
import i0.F;
import i0.z;
import i4.InterfaceC2015a;
import k4.AbstractC2036a;
import r.C2316B;
import r.C2343v;
import z0.C2731G;
import z0.Y;
import z0.c0;
import z0.e0;
import z0.m0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final K f2552a;

    /* renamed from: b, reason: collision with root package name */
    public final b f2553b;

    /* renamed from: c, reason: collision with root package name */
    public final C2316B f2554c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f2555d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2556e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public RunnableC0049o f2557g;

    /* renamed from: h, reason: collision with root package name */
    public long f2558h;
    public final C0040k0 i;

    /* renamed from: j, reason: collision with root package name */
    public final C1987a f2559j;

    public a() {
        K k5 = new K(4);
        k5.f638c = new long[192];
        k5.f639d = new long[192];
        this.f2552a = k5;
        this.f2553b = new b();
        this.f2554c = new C2316B();
        this.f2558h = -1L;
        this.i = new C0040k0(13, this);
        this.f2559j = new C1987a();
    }

    public static long a(e0 e0Var, long j5) {
        float[] b3;
        int d5;
        m0 m0Var = e0Var.f21811S;
        if (m0Var == null || (d5 = AbstractC2036a.d((b3 = ((W0) m0Var).b()))) == 3) {
            return j5;
        }
        if ((d5 & 2) == 0) {
            return 9223372034707292159L;
        }
        return l.K(z.b((Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j5 >> 32)) << 32), b3));
    }

    public static long h(C2731G c2731g) {
        c0 c0Var = c2731g.f21612O;
        e0 e0Var = c0Var.f21769d;
        long j5 = 0;
        for (e0 e0Var2 = c0Var.f21768c; e0Var2 != null && e0Var2 != e0Var; e0Var2 = e0Var2.f21795A) {
            long a5 = a(e0Var2, j5);
            if (j.a(a5, 9223372034707292159L)) {
                return 9223372034707292159L;
            }
            j5 = j.c(a5, e0Var2.J);
        }
        return j5;
    }

    public static void i(C2731G c2731g) {
        long j5;
        e0 e0Var = c2731g.f21612O.f21769d;
        long a5 = a(e0Var, 0L);
        long j6 = 9223372034707292159L;
        if (!AbstractC2036a.i(a5)) {
            c2731g.f21626m = 9223372034707292159L;
            return;
        }
        long c5 = j.c(a5, e0Var.J);
        C2731G u5 = c2731g.u();
        if (u5 != null) {
            if (!AbstractC2036a.i(u5.f21626m)) {
                i(u5);
            }
            long j7 = u5.f21626m;
            if (AbstractC2036a.i(j7)) {
                if (u5.f21629p) {
                    j5 = h(u5);
                    u5.f21628o = j5;
                    u5.f21629p = false;
                } else {
                    j5 = u5.f21628o;
                }
                if (AbstractC2036a.i(j5)) {
                    j6 = j.c(j.c(j7, j5), c5);
                }
            }
        } else {
            j6 = c5;
        }
        c2731g.f21626m = j6;
    }

    public final void b() {
        long j5;
        long j6;
        char c5;
        long j7;
        Handler handler = b0.b.f7136a;
        long currentTimeMillis = System.currentTimeMillis();
        boolean z3 = this.f2555d;
        boolean z5 = z3 || this.f2556e;
        K k5 = this.f2552a;
        b bVar = this.f2553b;
        if (z3) {
            this.f2555d = false;
            C2316B c2316b = this.f2554c;
            j5 = 128;
            Object[] objArr = c2316b.f18904a;
            int i = c2316b.f18905b;
            for (int i5 = 0; i5 < i; i5++) {
                ((InterfaceC2015a) objArr[i5]).invoke();
            }
            long[] jArr = (long[]) k5.f638c;
            int i6 = k5.f637b;
            j6 = 255;
            for (int i7 = 0; i7 < jArr.length - 2 && i7 < i6; i7 += 3) {
                long j8 = jArr[i7 + 2];
                if ((((int) (j8 >> 61)) & 1) != 0) {
                    long j9 = jArr[i7];
                    long j10 = jArr[i7 + 1];
                    if (bVar.f2560a.b(((int) j8) & 67108863) != null) {
                        throw new ClassCastException();
                    }
                }
            }
            c5 = 7;
            j7 = -9187201950435737472L;
            C2343v c2343v = bVar.f2560a;
            Object[] objArr2 = c2343v.f19013c;
            long[] jArr2 = c2343v.f19011a;
            int length = jArr2.length - 2;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j11 = jArr2[i8];
                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        for (int i10 = 0; i10 < i9; i10++) {
                            if ((j11 & 255) < 128 && objArr2[(i8 << 3) + i10] != null) {
                                throw new ClassCastException();
                            }
                            j11 >>= 8;
                        }
                        if (i9 != 8) {
                            break;
                        }
                    }
                    if (i8 == length) {
                        break;
                    } else {
                        i8++;
                    }
                }
            }
            long[] jArr3 = (long[]) k5.f638c;
            int i11 = k5.f637b;
            for (int i12 = 0; i12 < jArr3.length - 2 && i12 < i11; i12 += 3) {
                int i13 = i12 + 2;
                jArr3[i13] = jArr3[i13] & (-2305843009213693953L);
            }
        } else {
            j5 = 128;
            j6 = 255;
            c5 = 7;
            j7 = -9187201950435737472L;
        }
        if (this.f2556e) {
            this.f2556e = false;
            C2343v c2343v2 = bVar.f2560a;
            Object[] objArr3 = c2343v2.f19013c;
            long[] jArr4 = c2343v2.f19011a;
            int length2 = jArr4.length - 2;
            if (length2 >= 0) {
                int i14 = 0;
                while (true) {
                    long j12 = jArr4[i14];
                    if ((((~j12) << c5) & j12 & j7) != j7) {
                        int i15 = 8 - ((~(i14 - length2)) >>> 31);
                        for (int i16 = 0; i16 < i15; i16++) {
                            if ((j12 & j6) < j5 && objArr3[(i14 << 3) + i16] != null) {
                                throw new ClassCastException();
                            }
                            j12 >>= 8;
                        }
                        if (i15 != 8) {
                            break;
                        }
                    }
                    if (i14 == length2) {
                        break;
                    } else {
                        i14++;
                    }
                }
            }
        }
        if (z5) {
            bVar.getClass();
        }
        if (this.f) {
            this.f = false;
            long[] jArr5 = (long[]) k5.f638c;
            int i17 = k5.f637b;
            long[] jArr6 = (long[]) k5.f639d;
            int i18 = 0;
            for (int i19 = 0; i19 < jArr5.length - 2 && i18 < jArr6.length - 2 && i19 < i17; i19 += 3) {
                int i20 = i19 + 2;
                if (jArr5[i20] != 2305843009213693951L) {
                    jArr6[i18] = jArr5[i19];
                    jArr6[i18 + 1] = jArr5[i19 + 1];
                    jArr6[i18 + 2] = jArr5[i20];
                    i18 += 3;
                }
            }
            k5.f637b = i18;
            k5.f638c = jArr6;
            k5.f639d = jArr5;
        }
        if (bVar.f2561b > currentTimeMillis) {
            return;
        }
        C2343v c2343v3 = bVar.f2560a;
        Object[] objArr4 = c2343v3.f19013c;
        long[] jArr7 = c2343v3.f19011a;
        int length3 = jArr7.length - 2;
        if (length3 >= 0) {
            int i21 = 0;
            while (true) {
                long j13 = jArr7[i21];
                if ((((~j13) << c5) & j13 & j7) != j7) {
                    int i22 = 8 - ((~(i21 - length3)) >>> 31);
                    for (int i23 = 0; i23 < i22; i23++) {
                        if ((j13 & j6) < j5 && objArr4[(i21 << 3) + i23] != null) {
                            throw new ClassCastException();
                        }
                        j13 >>= 8;
                    }
                    if (i22 != 8) {
                        break;
                    }
                }
                if (i21 == length3) {
                    break;
                } else {
                    i21++;
                }
            }
        }
        bVar.f2561b = -1L;
    }

    public final void c(C2731G c2731g, boolean z3) {
        char c5;
        boolean z5;
        e0 e0Var = c2731g.f21612O.f21769d;
        Y y5 = c2731g.f21613P.f21663p;
        int X4 = y5.X();
        float W4 = y5.W();
        C1987a c1987a = this.f2559j;
        c1987a.f17187a = 0.0f;
        c1987a.f17188b = 0.0f;
        c1987a.f17189c = X4;
        c1987a.f17190d = W4;
        while (true) {
            c5 = ' ';
            if (e0Var == null) {
                break;
            }
            m0 m0Var = e0Var.f21811S;
            if (m0Var != null) {
                float[] b3 = ((W0) m0Var).b();
                if (!F.l(b3)) {
                    z.c(b3, c1987a);
                }
            }
            long j5 = e0Var.J;
            long floatToRawIntBits = (Float.floatToRawIntBits((int) (j5 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j5 & 4294967295L)) & 4294967295L);
            float intBitsToFloat = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & floatToRawIntBits));
            c1987a.f17187a += intBitsToFloat;
            c1987a.f17188b += intBitsToFloat2;
            c1987a.f17189c += intBitsToFloat;
            c1987a.f17190d += intBitsToFloat2;
            e0Var = e0Var.f21795A;
        }
        int i = (int) c1987a.f17187a;
        int i5 = (int) c1987a.f17188b;
        int i6 = (int) c1987a.f17189c;
        int i7 = (int) c1987a.f17190d;
        int i8 = c2731g.f21625l;
        K k5 = this.f2552a;
        if (!z3) {
            int i9 = 67108863;
            int i10 = i8 & 67108863;
            long[] jArr = (long[]) k5.f638c;
            int i11 = k5.f637b;
            int i12 = 0;
            while (i12 < jArr.length - 2 && i12 < i11) {
                int i13 = i12 + 2;
                int i14 = i9;
                char c6 = c5;
                long j6 = jArr[i13];
                z5 = true;
                if ((((int) j6) & i14) == i10) {
                    jArr[i12] = (i << c6) | (i5 & 4294967295L);
                    jArr[i12 + 1] = (i6 << c6) | (i7 & 4294967295L);
                    jArr[i13] = 2305843009213693952L | j6;
                    break;
                } else {
                    i12 += 3;
                    i9 = i14;
                    c5 = c6;
                }
            }
        }
        z5 = true;
        C2731G u5 = c2731g.u();
        int i15 = u5 != null ? u5.f21625l : -1;
        c0 c0Var = c2731g.f21612O;
        k5.g(i8, i, i5, i6, i7, i15, c0Var.d(1024), c0Var.d(16));
        this.f2555d = z5;
    }

    public final void d(C2731G c2731g) {
        e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            c(c2731g2, false);
            d(c2731g2);
        }
    }

    public final void e(C2731G c2731g) {
        this.f2555d = true;
        int i = c2731g.f21625l & 67108863;
        K k5 = this.f2552a;
        long[] jArr = (long[]) k5.f638c;
        int i5 = k5.f637b;
        int i6 = 0;
        while (true) {
            if (i6 >= jArr.length - 2 || i6 >= i5) {
                break;
            }
            int i7 = i6 + 2;
            long j5 = jArr[i7];
            if ((((int) j5) & 67108863) == i) {
                jArr[i7] = 2305843009213693952L | j5;
                break;
            }
            i6 += 3;
        }
        RunnableC0049o runnableC0049o = this.f2557g;
        boolean z3 = runnableC0049o != null;
        long j6 = this.f2553b.f2561b;
        if (j6 >= 0 || !z3) {
            if (this.f2558h == j6 && z3) {
                return;
            }
            if (runnableC0049o != null) {
                Handler handler = b0.b.f7136a;
                b0.b.f7136a.removeCallbacks(runnableC0049o);
            }
            Handler handler2 = b0.b.f7136a;
            long currentTimeMillis = System.currentTimeMillis();
            long max = Math.max(j6, 16 + currentTimeMillis);
            this.f2558h = max;
            RunnableC0049o runnableC0049o2 = new RunnableC0049o(9, this.i);
            b0.b.f7136a.postDelayed(runnableC0049o2, max - currentTimeMillis);
            this.f2557g = runnableC0049o2;
        }
    }

    public final void f(C2731G c2731g) {
        long h3 = h(c2731g);
        if (!AbstractC2036a.i(h3)) {
            d(c2731g);
            return;
        }
        c2731g.f21628o = h3;
        c2731g.f21629p = false;
        e y5 = c2731g.y();
        Object[] objArr = y5.f5106k;
        int i = y5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            g((C2731G) objArr[i5], false);
        }
        e(c2731g);
    }

    public final void g(C2731G c2731g, boolean z3) {
        long j5;
        char c5;
        int i;
        Y y5 = c2731g.f21613P.f21663p;
        int X4 = y5.X();
        int W4 = y5.W();
        long j6 = c2731g.f21626m;
        long j7 = c2731g.f21627n;
        char c6 = ' ';
        int i5 = (int) (j7 >> 32);
        int i6 = (int) (j7 & 4294967295L);
        i(c2731g);
        long j8 = c2731g.f21626m;
        if (!AbstractC2036a.i(j8)) {
            c(c2731g, z3);
            return;
        }
        c2731g.f21627n = (W4 & 4294967295L) | (X4 << 32);
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        int i9 = i7 + X4;
        int i10 = i8 + W4;
        if (!z3 && j.a(j8, j6) && i5 == X4 && i6 == W4) {
            return;
        }
        int i11 = c2731g.f21625l;
        K k5 = this.f2552a;
        if (!z3) {
            int i12 = i11 & 67108863;
            long[] jArr = (long[]) k5.f638c;
            int i13 = k5.f637b;
            int i14 = 0;
            while (i14 < jArr.length - 2 && i14 < i13) {
                int i15 = i14 + 2;
                char c7 = c6;
                long[] jArr2 = jArr;
                long j9 = jArr2[i15];
                if ((((int) j9) & 67108863) == i12) {
                    long j10 = jArr2[i14];
                    jArr2[i14] = (i8 & 4294967295L) | (i7 << c7);
                    jArr2[i14 + 1] = (i9 << c7) | (i10 & 4294967295L);
                    long j11 = 2305843009213693952L;
                    jArr2[i15] = j9 | 2305843009213693952L;
                    int i16 = i7 - ((int) (j10 >> c7));
                    if ((i16 != 0) | (i8 - ((int) j10) != 0)) {
                        long j12 = -4503599560261633L;
                        char c8 = 26;
                        long[] jArr3 = (long[]) k5.f638c;
                        long[] jArr4 = (long[]) k5.f639d;
                        int i17 = k5.f637b / 3;
                        jArr4[0] = (j9 & (-4503599560261633L)) | (((i14 + 3) & 67108863) << 26);
                        int i18 = 1;
                        while (i18 > 0) {
                            i18--;
                            long j13 = jArr4[i18];
                            int i19 = ((int) j13) & 67108863;
                            long j14 = j12;
                            int i20 = ((int) (j13 >> c8)) & 67108863;
                            char c9 = '4';
                            int i21 = ((int) (j13 >> 52)) & 511;
                            int i22 = i21 == 511 ? i17 : i21 + i20;
                            if (i20 < 0) {
                                break;
                            }
                            while (i20 < jArr3.length - 2 && i20 < i22) {
                                int i23 = i20 + 2;
                                long j15 = jArr3[i23];
                                char c10 = c9;
                                int i24 = i17;
                                if ((((int) (j15 >> c8)) & 67108863) == i19) {
                                    long j16 = jArr3[i20];
                                    int i25 = i20 + 1;
                                    j5 = j11;
                                    long j17 = jArr3[i25];
                                    c5 = c8;
                                    i = i16;
                                    jArr3[i20] = ((((int) j16) + r10) & 4294967295L) | ((((int) (j16 >> c7)) + i) << c7);
                                    jArr3[i25] = ((((int) j17) + r10) & 4294967295L) | ((((int) (j17 >> c7)) + i) << c7);
                                    jArr3[i23] = j15 | j5;
                                    if ((((int) (j15 >> c10)) & 511) > 0) {
                                        jArr4[i18] = (j15 & j14) | (((i20 + 3) & 67108863) << c5);
                                        i18++;
                                    }
                                } else {
                                    j5 = j11;
                                    c5 = c8;
                                    i = i16;
                                }
                                i20 += 3;
                                i17 = i24;
                                c9 = c10;
                                j11 = j5;
                                i16 = i;
                                c8 = c5;
                            }
                            i17 = i17;
                            j12 = j14;
                            j11 = j11;
                            i16 = i16;
                            c8 = c8;
                        }
                    }
                    this.f2555d = true;
                }
                i14 += 3;
                c6 = c7;
                jArr = jArr2;
            }
        }
        C2731G u5 = c2731g.u();
        int i26 = u5 != null ? u5.f21625l : -1;
        c0 c0Var = c2731g.f21612O;
        k5.g(i11, i7, i8, i9, i10, i26, c0Var.d(1024), c0Var.d(16));
        this.f2555d = true;
    }

    public final void j(C2731G c2731g) {
        int i = c2731g.f21625l & 67108863;
        K k5 = this.f2552a;
        long[] jArr = (long[]) k5.f638c;
        int i5 = k5.f637b;
        int i6 = 0;
        while (true) {
            if (i6 >= jArr.length - 2 || i6 >= i5) {
                break;
            }
            int i7 = i6 + 2;
            if ((((int) jArr[i7]) & 67108863) == i) {
                jArr[i6] = -1;
                jArr[i6 + 1] = -1;
                jArr[i7] = 2305843009213693951L;
                break;
            }
            i6 += 3;
        }
        this.f2555d = true;
        this.f = true;
    }
}
