package com.google.android.gms.internal.ads;

import android.graphics.Point;
import android.net.Uri;
import java.io.EOFException;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import n.AbstractC2107A;

/* loaded from: classes.dex */
public final class Fx implements InterfaceC0977fH {

    /* renamed from: k, reason: collision with root package name */
    public Object f9143k;

    /* renamed from: l, reason: collision with root package name */
    public Object f9144l;

    /* renamed from: m, reason: collision with root package name */
    public Object f9145m;

    public /* synthetic */ Fx() {
        this.f9144l = null;
        this.f9145m = null;
        this.f9143k = C1091hx.f13820B;
    }

    public void a(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.f9144l = Integer.valueOf(i);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0977fH
    public C1761wv b(int i, C1292mb c1292mb, int[] iArr) {
        boolean z3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Point point;
        C1292mb c1292mb2 = c1292mb;
        int i10 = ((int[]) this.f9144l)[i];
        C0843cH c0843cH = (C0843cH) this.f9145m;
        int i11 = c0843cH.f16300a;
        if (i11 != Integer.MAX_VALUE) {
            int i12 = c0843cH.f16301b;
            if (i12 == Integer.MAX_VALUE) {
                i5 = Integer.MAX_VALUE;
                z3 = true;
            } else {
                int i13 = Integer.MAX_VALUE;
                for (int i14 = 0; i14 < c1292mb2.f14495a; i14++) {
                    C1407p c1407p = c1292mb2.f14498d[i14];
                    int i15 = c1407p.f14911t;
                    if (i15 > 0 && (i7 = c1407p.f14912u) > 0) {
                        if ((i15 > i7) != (i11 > i12)) {
                            i9 = i11;
                            i8 = i12;
                        } else {
                            i8 = i11;
                            i9 = i12;
                        }
                        if (i15 * i9 >= i7 * i8) {
                            int i16 = AbstractC1260lo.f14419a;
                            point = new Point(i8, ((r11 + i15) - 1) / i15);
                        } else {
                            int i17 = AbstractC1260lo.f14419a;
                            point = new Point(((r10 + i7) - 1) / i7, i9);
                        }
                        int i18 = c1407p.f14911t;
                        int i19 = i18 * i7;
                        if (i18 >= ((int) (point.x * 0.98f)) && i7 >= ((int) (point.y * 0.98f)) && i19 < i13) {
                            i13 = i19;
                        }
                    }
                }
                z3 = true;
                i5 = i13;
            }
        } else {
            z3 = true;
            i5 = Integer.MAX_VALUE;
        }
        AbstractC0952et.q("initialCapacity", 4);
        Object[] objArr = new Object[4];
        int i20 = 0;
        int i21 = 0;
        while (i20 < c1292mb2.f14495a) {
            C1407p c1407p2 = c1292mb2.f14498d[i20];
            int i22 = c1407p2.f14911t;
            int i23 = (i22 == -1 || (i6 = c1407p2.f14912u) == -1) ? -1 : i22 * i6;
            C1067hH c1067hH = new C1067hH(i, c1292mb2, i20, c0843cH, iArr[i20], (String) this.f9143k, (i5 == Integer.MAX_VALUE || (i23 != -1 && i23 <= i5)) ? z3 : false);
            int length = objArr.length;
            int i24 = i21 + 1;
            int d5 = AbstractC0776av.d(length, i24);
            if (d5 > length) {
                objArr = Arrays.copyOf(objArr, d5);
            }
            objArr[i21] = c1067hH;
            i20++;
            i21 = i24;
            c1292mb2 = c1292mb;
        }
        return AbstractC1044gv.k(i21, objArr);
    }

    public long c() {
        B b3 = (B) this.f9144l;
        if (b3 != null) {
            return b3.f7752n;
        }
        return -1L;
    }

    public void d(int i) {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException(AbstractC2107A.q("Invalid tag size for AesCmacParameters: ", i));
        }
        this.f9145m = Integer.valueOf(i);
    }

    public Gx e() {
        Dp dp;
        C1419pB b3;
        Jx jx = (Jx) this.f9145m;
        if (jx == null || (dp = (Dp) this.f9143k) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (jx.f10084a != ((C1419pB) dp.f8377l).f14973a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (jx.a() && ((Integer) this.f9144l) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Jx) this.f9145m).a() && ((Integer) this.f9144l) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        Ix ix = ((Jx) this.f9145m).f10086c;
        if (ix == Ix.f9646o) {
            b3 = Wy.f12132a;
        } else if (ix == Ix.f9645n) {
            b3 = Wy.a(((Integer) this.f9144l).intValue());
        } else {
            if (ix != Ix.f9644m) {
                throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(((Jx) this.f9145m).f10086c)));
            }
            b3 = Wy.b(((Integer) this.f9144l).intValue());
        }
        return new Gx((Jx) this.f9145m, (Dp) this.f9143k, b3, (Integer) this.f9144l);
    }

    public Kx f() {
        Dp dp;
        C1419pB b3;
        Mx mx = (Mx) this.f9145m;
        if (mx == null || (dp = (Dp) this.f9143k) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (mx.f10753a != ((C1419pB) dp.f8377l).f14973a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (mx.a() && ((Integer) this.f9144l) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Mx) this.f9145m).a() && ((Integer) this.f9144l) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C1091hx c1091hx = ((Mx) this.f9145m).f10754b;
        if (c1091hx == C1091hx.f13826r) {
            b3 = Wy.f12132a;
        } else if (c1091hx == C1091hx.f13825q) {
            b3 = Wy.a(((Integer) this.f9144l).intValue());
        } else {
            if (c1091hx != C1091hx.f13824p) {
                throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(((Mx) this.f9145m).f10754b)));
            }
            b3 = Wy.b(((Integer) this.f9144l).intValue());
        }
        return new Kx((Mx) this.f9145m, (Dp) this.f9143k, b3, (Integer) this.f9144l);
    }

    public Nx g() {
        Dp dp;
        C1419pB b3;
        Px px = (Px) this.f9145m;
        if (px == null || (dp = (Dp) this.f9143k) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (px.f11136a != ((C1419pB) dp.f8377l).f14973a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (px.a() && ((Integer) this.f9144l) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((Px) this.f9145m).a() && ((Integer) this.f9144l) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        Cx cx = ((Px) this.f9145m).f11137b;
        if (cx == Cx.f8121t) {
            b3 = Wy.f12132a;
        } else if (cx == Cx.f8120s) {
            b3 = Wy.a(((Integer) this.f9144l).intValue());
        } else {
            if (cx != Cx.f8119r) {
                throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(((Px) this.f9145m).f11137b)));
            }
            b3 = Wy.b(((Integer) this.f9144l).intValue());
        }
        return new Nx((Px) this.f9145m, (Dp) this.f9143k, b3, (Integer) this.f9144l);
    }

    public C1496qz h() {
        Dp dp;
        C1419pB a5;
        C1630tz c1630tz = (C1630tz) this.f9145m;
        if (c1630tz == null || (dp = (Dp) this.f9143k) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1630tz.f15743a != ((C1419pB) dp.f8377l).f14973a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c1630tz.a() && ((Integer) this.f9144l) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C1630tz) this.f9145m).a() && ((Integer) this.f9144l) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C1091hx c1091hx = ((C1630tz) this.f9145m).f15745c;
        if (c1091hx == C1091hx.f13820B) {
            a5 = Wy.f12132a;
        } else if (c1091hx == C1091hx.f13819A || c1091hx == C1091hx.f13834z) {
            a5 = Wy.a(((Integer) this.f9144l).intValue());
        } else {
            if (c1091hx != C1091hx.f13833y) {
                throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(((C1630tz) this.f9145m).f15745c)));
            }
            a5 = Wy.b(((Integer) this.f9144l).intValue());
        }
        return new C1496qz((C1630tz) this.f9145m, (Dp) this.f9143k, a5, (Integer) this.f9144l);
    }

    public C1630tz i() {
        Integer num = (Integer) this.f9144l;
        if (num == null) {
            throw new GeneralSecurityException("key size not set");
        }
        if (((Integer) this.f9145m) != null) {
            return new C1630tz(num.intValue(), ((Integer) this.f9145m).intValue(), (C1091hx) this.f9143k);
        }
        throw new GeneralSecurityException("tag size not set");
    }

    public C1720vz j() {
        Dp dp;
        C1419pB a5;
        C1900zz c1900zz = (C1900zz) this.f9145m;
        if (c1900zz == null || (dp = (Dp) this.f9143k) == null) {
            throw new GeneralSecurityException("Cannot build without parameters and/or key material");
        }
        if (c1900zz.f16798a != ((C1419pB) dp.f8377l).f14973a.length) {
            throw new GeneralSecurityException("Key size mismatch");
        }
        if (c1900zz.a() && ((Integer) this.f9144l) == null) {
            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
        }
        if (!((C1900zz) this.f9145m).a() && ((Integer) this.f9144l) != null) {
            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
        }
        C1855yz c1855yz = ((C1900zz) this.f9145m).f16800c;
        if (c1855yz == C1855yz.f16517e) {
            a5 = Wy.f12132a;
        } else if (c1855yz == C1855yz.f16516d || c1855yz == C1855yz.f16515c) {
            a5 = Wy.a(((Integer) this.f9144l).intValue());
        } else {
            if (c1855yz != C1855yz.f16514b) {
                throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(((C1900zz) this.f9145m).f16800c)));
            }
            a5 = Wy.b(((Integer) this.f9144l).intValue());
        }
        return new C1720vz((C1900zz) this.f9145m, (Dp) this.f9143k, a5, (Integer) this.f9144l);
    }

    public void k(InterfaceC1402ov interfaceC1402ov, Uri uri, Map map, long j5, long j6, HG hg) {
        boolean z3;
        boolean z5 = true;
        B b3 = new B(interfaceC1402ov, j5, j6);
        this.f9144l = b3;
        if (((F) this.f9143k) != null) {
            return;
        }
        F[] e3 = ((I) this.f9145m).e(uri, map);
        int length = e3.length;
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        AbstractC0952et.q("expectedSize", length);
        C0909dv c0909dv = new C0909dv(length);
        if (length == 1) {
            this.f9143k = e3[0];
        } else {
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                F f = e3[i];
                try {
                } catch (EOFException unused) {
                    z3 = ((F) this.f9143k) != null || b3.f7752n == j5;
                } catch (Throwable th) {
                    if (((F) this.f9143k) == null && b3.f7752n != j5) {
                        z5 = false;
                    }
                    AbstractC1668us.a0(z5);
                    b3.f7754p = 0;
                    throw th;
                }
                if (f.e(b3)) {
                    this.f9143k = f;
                    b3.f7754p = 0;
                    break;
                } else {
                    c0909dv.c(f.j());
                    z3 = ((F) this.f9143k) != null || b3.f7752n == j5;
                    AbstractC1668us.a0(z3);
                    b3.f7754p = 0;
                    i++;
                }
            }
            if (((F) this.f9143k) == null) {
                Iterator it = AbstractC1400ot.z(AbstractC1044gv.m(e3), new C1364o1(20)).iterator();
                StringBuilder sb = new StringBuilder();
                AbstractC0952et.O(sb, it, ", ");
                String n5 = L1.a.n("None of the available extractors (", sb.toString(), ") could read the stream.");
                C1761wv f5 = c0909dv.f();
                C1587t0 c1587t0 = new C1587t0(n5, null, false, 1);
                AbstractC1044gv.l(f5);
                throw c1587t0;
            }
        }
        ((F) this.f9143k).h(hg);
    }

    public /* synthetic */ Fx(boolean z3) {
        this.f9145m = null;
        this.f9143k = null;
        this.f9144l = null;
    }
}
