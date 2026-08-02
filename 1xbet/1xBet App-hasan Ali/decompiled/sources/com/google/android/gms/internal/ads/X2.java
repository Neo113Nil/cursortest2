package com.google.android.gms.internal.ads;

import B.C0072a;
import android.util.SparseArray;
import java.util.List;

/* loaded from: classes.dex */
public final class X2 implements F {

    /* renamed from: e, reason: collision with root package name */
    public boolean f12141e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f12142g;

    /* renamed from: h, reason: collision with root package name */
    public long f12143h;
    public C1363o0 i;

    /* renamed from: j, reason: collision with root package name */
    public HG f12144j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f12145k;

    /* renamed from: a, reason: collision with root package name */
    public final Kn f12137a = new Kn();

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f12139c = new C1617tm(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray f12138b = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    public final V2 f12140d = new V2(0);

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (r0 != r7) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035 A[LOOP:0: B:13:0x002d->B:15:0x0035, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0045 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(long j5, long j6) {
        C1363o0 c1363o0;
        int i;
        SparseArray sparseArray;
        Kn kn = this.f12137a;
        if (kn.e() != -9223372036854775807L) {
            long d5 = kn.d();
            if (d5 != -9223372036854775807L) {
                if (d5 != 0) {
                }
            }
            c1363o0 = this.i;
            if (c1363o0 != null) {
                c1363o0.b(j6);
            }
            i = 0;
            while (true) {
                sparseArray = this.f12138b;
                if (i < sparseArray.size()) {
                    return;
                }
                W2 w22 = (W2) sparseArray.valueAt(i);
                w22.f = false;
                w22.f11986a.b();
                i++;
            }
        }
        kn.f(j6);
        c1363o0 = this.i;
        if (c1363o0 != null) {
        }
        i = 0;
        while (true) {
            sparseArray = this.f12138b;
            if (i < sparseArray.size()) {
            }
            W2 w222 = (W2) sparseArray.valueAt(i);
            w222.f = false;
            w222.f11986a.b();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        byte[] bArr = new byte[14];
        B b3 = (B) g5;
        b3.G(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) == 442 && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            b3.g(bArr[13] & 7, false);
            b3.G(bArr, 0, 3, false);
            if ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255)) == 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final int f(G g5, C0072a c0072a) {
        int i;
        long j5;
        long j6;
        F2 h22;
        AbstractC1668us.F(this.f12144j);
        long j7 = ((B) g5).f7751m;
        int i5 = (j7 > (-1L) ? 1 : (j7 == (-1L) ? 0 : -1));
        long j8 = -9223372036854775807L;
        V2 v22 = this.f12140d;
        if (i5 != 0 && !v22.f11856c) {
            boolean z3 = v22.f11858e;
            C1617tm c1617tm = v22.f11855b;
            if (!z3) {
                B b3 = (B) g5;
                long j9 = b3.f7751m;
                int min = (int) Math.min(20000L, j9);
                long j10 = j9 - min;
                if (b3.f7752n != j10) {
                    c0072a.f658a = j10;
                    return 1;
                }
                c1617tm.g(min);
                b3.f7754p = 0;
                b3.G(c1617tm.f15724a, 0, min, false);
                int i6 = c1617tm.f15725b;
                int i7 = c1617tm.f15726c - 4;
                while (true) {
                    if (i7 < i6) {
                        break;
                    }
                    if (V2.c(i7, c1617tm.f15724a) == 442) {
                        c1617tm.j(i7 + 4);
                        long a5 = V2.a(c1617tm);
                        if (a5 != -9223372036854775807L) {
                            j8 = a5;
                            break;
                        }
                    }
                    i7--;
                }
                v22.f11859g = j8;
                v22.f11858e = true;
                return 0;
            }
            if (v22.f11859g == -9223372036854775807L) {
                byte[] bArr = AbstractC1260lo.f;
                int length = bArr.length;
                c1617tm.h(0, bArr);
                v22.f11856c = true;
                ((B) g5).f7754p = 0;
                return 0;
            }
            if (v22.f11857d) {
                long j11 = v22.f;
                if (j11 == -9223372036854775807L) {
                    byte[] bArr2 = AbstractC1260lo.f;
                    int length2 = bArr2.length;
                    c1617tm.h(0, bArr2);
                    v22.f11856c = true;
                    ((B) g5).f7754p = 0;
                    return 0;
                }
                Kn kn = v22.f11854a;
                v22.f11860h = kn.c(v22.f11859g) - kn.b(j11);
                byte[] bArr3 = AbstractC1260lo.f;
                int length3 = bArr3.length;
                c1617tm.h(0, bArr3);
                v22.f11856c = true;
                ((B) g5).f7754p = 0;
                return 0;
            }
            B b5 = (B) g5;
            int min2 = (int) Math.min(20000L, b5.f7751m);
            if (b5.f7752n != 0) {
                c0072a.f658a = 0L;
                return 1;
            }
            c1617tm.g(min2);
            b5.f7754p = 0;
            b5.G(c1617tm.f15724a, 0, min2, false);
            int i8 = c1617tm.f15725b;
            int i9 = c1617tm.f15726c;
            while (true) {
                if (i8 >= i9 - 3) {
                    break;
                }
                if (V2.c(i8, c1617tm.f15724a) == 442) {
                    c1617tm.j(i8 + 4);
                    long a6 = V2.a(c1617tm);
                    if (a6 != -9223372036854775807L) {
                        j8 = a6;
                        break;
                    }
                }
                i8++;
            }
            v22.f = j8;
            v22.f11857d = true;
            return 0;
        }
        if (this.f12145k) {
            i = i5;
        } else {
            this.f12145k = true;
            long j12 = v22.f11860h;
            if (j12 != -9223372036854775807L) {
                i = i5;
                C1363o0 c1363o0 = new C1363o0(new C1543s1(12), new C0709Wb(v22.f11854a), j12, j12 + 1, 0L, j7, 188L, 1000);
                this.i = c1363o0;
                this.f12144j.x(c1363o0.f14741a);
            } else {
                i = i5;
                this.f12144j.x(new J(j12, 0L));
            }
        }
        C1363o0 c1363o02 = this.i;
        if (c1363o02 != null && c1363o02.f14743c != null) {
            return c1363o02.a((B) g5, c0072a);
        }
        B b6 = (B) g5;
        b6.f7754p = 0;
        long b7 = i != 0 ? j7 - b6.b() : -1L;
        if (b7 != -1 && b7 < 4) {
            return -1;
        }
        C1617tm c1617tm2 = this.f12139c;
        if (!b6.G(c1617tm2.f15724a, 0, 4, true)) {
            return -1;
        }
        c1617tm2.j(0);
        int q5 = c1617tm2.q();
        if (q5 == 441) {
            return -1;
        }
        if (q5 == 442) {
            b6.G(c1617tm2.f15724a, 0, 10, false);
            c1617tm2.j(9);
            b6.k((c1617tm2.v() & 7) + 14);
            return 0;
        }
        if (q5 == 443) {
            b6.G(c1617tm2.f15724a, 0, 2, false);
            c1617tm2.j(0);
            b6.k(c1617tm2.z() + 6);
            return 0;
        }
        if ((q5 >> 8) != 1) {
            b6.k(1);
            return 0;
        }
        int i10 = q5 & 255;
        SparseArray sparseArray = this.f12138b;
        W2 w22 = (W2) sparseArray.get(i10);
        if (!this.f12141e) {
            if (w22 == null) {
                F2 f22 = null;
                if (i10 == 189) {
                    A2 a22 = new A2(0, 0, null);
                    this.f = true;
                    this.f12143h = b6.f7752n;
                    f22 = a22;
                } else {
                    if ((q5 & 224) == 192) {
                        h22 = new Q2(null, 0);
                        this.f = true;
                        this.f12143h = b6.f7752n;
                    } else if ((q5 & 240) == 224) {
                        h22 = new H2(null);
                        this.f12142g = true;
                        this.f12143h = b6.f7752n;
                    }
                    f22 = h22;
                }
                if (f22 != null) {
                    f22.e(this.f12144j, new C0829c3(Integer.MIN_VALUE, i10, 256));
                    w22 = new W2(f22, this.f12137a);
                    sparseArray.put(i10, w22);
                }
            }
            long j13 = 1048576;
            if (this.f && this.f12142g) {
                j13 = 8192 + this.f12143h;
            }
            if (b6.f7752n > j13) {
                this.f12141e = true;
                this.f12144j.v();
            }
        }
        b6.G(c1617tm2.f15724a, 0, 2, false);
        c1617tm2.j(0);
        int z5 = c1617tm2.z() + 6;
        if (w22 == null) {
            b6.k(z5);
            return 0;
        }
        c1617tm2.g(z5);
        b6.F(c1617tm2.f15724a, 0, z5, false);
        c1617tm2.j(6);
        C0826c0 c0826c0 = w22.f11988c;
        c1617tm2.f(c0826c0.f12943b, 0, 3);
        c0826c0.s(0);
        c0826c0.u(8);
        w22.f11989d = c0826c0.w();
        w22.f11990e = c0826c0.w();
        c0826c0.u(6);
        c1617tm2.f(c0826c0.f12943b, 0, c0826c0.f(8));
        c0826c0.s(0);
        if (w22.f11989d) {
            c0826c0.u(4);
            long f = c0826c0.f(3);
            c0826c0.u(1);
            int f5 = c0826c0.f(15) << 15;
            c0826c0.u(1);
            long f6 = c0826c0.f(15);
            c0826c0.u(1);
            boolean z6 = w22.f;
            Kn kn2 = w22.f11987b;
            if (z6 || !w22.f11990e) {
                j6 = f;
            } else {
                c0826c0.u(4);
                j6 = f;
                c0826c0.u(1);
                int f7 = c0826c0.f(15) << 15;
                c0826c0.u(1);
                long f8 = c0826c0.f(15);
                c0826c0.u(1);
                kn2.b((c0826c0.f(3) << 30) | f7 | f8);
                w22.f = true;
            }
            j5 = kn2.b((j6 << 30) | f5 | f6);
        } else {
            j5 = 0;
        }
        F2 f23 = w22.f11986a;
        f23.f(4, j5);
        f23.c(c1617tm2);
        f23.d(false);
        c1617tm2.i(c1617tm2.f15724a.length);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        this.f12144j = (HG) h3;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
