package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class D2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f8142a;

    /* renamed from: c, reason: collision with root package name */
    public final String f8144c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8145d;

    /* renamed from: e, reason: collision with root package name */
    public String f8146e;
    public InterfaceC0737a0 f;

    /* renamed from: h, reason: collision with root package name */
    public int f8148h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public long f8149j;

    /* renamed from: k, reason: collision with root package name */
    public C1407p f8150k;

    /* renamed from: l, reason: collision with root package name */
    public int f8151l;

    /* renamed from: m, reason: collision with root package name */
    public int f8152m;

    /* renamed from: g, reason: collision with root package name */
    public int f8147g = 0;

    /* renamed from: p, reason: collision with root package name */
    public long f8155p = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicInteger f8143b = new AtomicInteger();

    /* renamed from: n, reason: collision with root package name */
    public int f8153n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f8154o = -1;

    public D2(int i, int i5, String str) {
        this.f8142a = new C1617tm(new byte[i5]);
        this.f8144c = str;
        this.f8145d = i;
    }

    public final void a(C1541s c1541s) {
        int i;
        int i5 = c1541s.f15400b;
        if (i5 == -2147483647 || (i = c1541s.f15401c) == -1) {
            return;
        }
        C1407p c1407p = this.f8150k;
        String str = c1541s.f15399a;
        if (c1407p != null && i == c1407p.f14886B && i5 == c1407p.f14887C && str.equals(c1407p.f14904m)) {
            return;
        }
        C1407p c1407p2 = this.f8150k;
        C1649uH c1649uH = c1407p2 == null ? new C1649uH() : new C1649uH(c1407p2);
        c1649uH.f15839a = this.f8146e;
        c1649uH.c(str);
        c1649uH.f15831A = i;
        c1649uH.f15832B = i5;
        c1649uH.f15842d = this.f8144c;
        c1649uH.f = this.f8145d;
        C1407p c1407p3 = new C1407p(c1649uH);
        this.f8150k = c1407p3;
        this.f.e(c1407p3);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f8147g = 0;
        this.f8148h = 0;
        this.i = 0;
        this.f8155p = -9223372036854775807L;
        this.f8143b.set(0);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void c(C1617tm c1617tm) {
        int i;
        boolean z3;
        int i5;
        byte b3;
        int i6;
        byte b5;
        int i7;
        int i8;
        byte b6;
        int i9;
        long j5;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        long j6;
        int i16;
        int i17 = 4;
        AbstractC1668us.F(this.f);
        while (c1617tm.o() > 0) {
            int i18 = this.f8147g;
            C1617tm c1617tm2 = this.f8142a;
            if (i18 != 0) {
                if (i18 != 1) {
                    if (i18 != 2) {
                        int i19 = -2147483647;
                        int i20 = 8;
                        if (i18 != 3) {
                            if (i18 == i17) {
                                i9 = i17;
                                if (g(c1617tm, c1617tm2.f15724a, 6)) {
                                    C0826c0 m5 = JB.m(c1617tm2.f15724a);
                                    m5.u(32);
                                    int k5 = JB.k(m5, JB.f9902o) + 1;
                                    this.f8154o = k5;
                                    int i21 = this.f8148h;
                                    if (i21 > k5) {
                                        int i22 = i21 - k5;
                                        this.f8148h = i21 - i22;
                                        c1617tm.j(c1617tm.f15725b - i22);
                                    }
                                    this.f8147g = 5;
                                }
                            } else if (i18 != 5) {
                                int min = Math.min(c1617tm.o(), this.f8151l - this.f8148h);
                                this.f.c(min, c1617tm);
                                int i23 = this.f8148h + min;
                                this.f8148h = i23;
                                if (i23 == this.f8151l) {
                                    AbstractC1668us.a0(this.f8155p != -9223372036854775807L);
                                    this.f.d(this.f8155p, this.f8152m == i17 ? 0 : 1, this.f8151l, 0, null);
                                    this.f8155p += this.f8149j;
                                    this.f8147g = 0;
                                }
                            } else if (g(c1617tm, c1617tm2.f15724a, this.f8154o)) {
                                AtomicInteger atomicInteger = this.f8143b;
                                byte[] bArr = c1617tm2.f15724a;
                                i9 = i17;
                                C0826c0 m6 = JB.m(bArr);
                                int f = m6.f(32);
                                int k6 = JB.k(m6, JB.f9898k);
                                int i24 = k6 + 1;
                                char c5 = f == 1078008818 ? (char) 1 : (char) 0;
                                if (c5 == 0) {
                                    j5 = -9223372036854775807L;
                                } else {
                                    if (!m6.w()) {
                                        throw B7.b("Only supports full channel mask-based audio presentation");
                                    }
                                    int i25 = k6 - 1;
                                    int i26 = bArr[i25] << 8;
                                    int i27 = bArr[k6] & 255;
                                    int i28 = AbstractC1260lo.f14419a;
                                    char c6 = 65535;
                                    for (int i29 = 0; i29 < i25; i29++) {
                                        byte b7 = bArr[i29];
                                        int[] iArr = AbstractC1260lo.f14428l;
                                        char c7 = (char) (iArr[(c6 >> '\f') ^ ((b7 & 255) >> 4)] ^ ((char) (c6 << 4)));
                                        c6 = (char) (((char) (c7 << 4)) ^ iArr[(b7 & 15) ^ (c7 >> '\f')]);
                                    }
                                    if ((((char) i26) | i27) != c6) {
                                        throw B7.a(null, "CRC check failed");
                                    }
                                    int f5 = m6.f(2);
                                    if (f5 != 0) {
                                        if (f5 == 1) {
                                            i11 = 480;
                                        } else {
                                            if (f5 != 2) {
                                                throw B7.a(null, "Unsupported base duration index in DTS UHD header: " + f5);
                                            }
                                            i11 = 384;
                                        }
                                        i10 = 3;
                                    } else {
                                        i10 = 3;
                                        i11 = 512;
                                    }
                                    int f6 = m6.f(i10) + 1;
                                    int f7 = m6.f(2);
                                    if (f7 == 0) {
                                        i12 = 32000;
                                    } else if (f7 == 1) {
                                        i12 = 44100;
                                    } else {
                                        if (f7 != 2) {
                                            throw B7.a(null, "Unsupported clock rate index in DTS UHD header: " + f7);
                                        }
                                        i12 = 48000;
                                    }
                                    if (m6.w()) {
                                        m6.u(36);
                                    }
                                    i19 = i12 * (1 << m6.f(2));
                                    j5 = AbstractC1260lo.u(i11 * f6, 1000000L, i12, RoundingMode.DOWN);
                                }
                                int i30 = i19;
                                int i31 = 0;
                                for (char c8 = 0; c8 < c5; c8 = 1) {
                                    i31 += JB.k(m6, JB.f9899l);
                                }
                                for (int i32 = 0; i32 <= 0; i32++) {
                                    if (c5 != 0) {
                                        atomicInteger.set(JB.k(m6, JB.f9900m));
                                    }
                                    i31 += atomicInteger.get() != 0 ? JB.k(m6, JB.f9901n) : 0;
                                }
                                int i33 = i24 + i31;
                                C1541s c1541s = new C1541s("audio/vnd.dts.uhd;profile=p2", 2, i30, i33, j5);
                                if (this.f8152m == 3) {
                                    a(c1541s);
                                }
                                this.f8151l = i33;
                                this.f8149j = j5 == -9223372036854775807L ? 0L : j5;
                                c1617tm2.j(0);
                                this.f.c(this.f8154o, c1617tm2);
                                this.f8147g = 6;
                            } else {
                                continue;
                            }
                            i17 = i9;
                        } else {
                            int i34 = i17;
                            if (g(c1617tm, c1617tm2.f15724a, this.f8153n)) {
                                C0826c0 m7 = JB.m(c1617tm2.f15724a);
                                m7.u(40);
                                int f8 = m7.f(2);
                                boolean w5 = m7.w();
                                int i35 = true != w5 ? 16 : 20;
                                m7.u(true != w5 ? 8 : 12);
                                int f9 = m7.f(i35) + 1;
                                boolean w6 = m7.w();
                                if (w6) {
                                    i13 = m7.f(2);
                                    int f10 = m7.f(3) + 1;
                                    if (m7.w()) {
                                        m7.u(36);
                                    }
                                    int f11 = m7.f(3) + 1;
                                    int f12 = m7.f(3) + 1;
                                    if (f11 != 1 || f12 != 1) {
                                        throw B7.b("Multiple audio presentations or assets not supported");
                                    }
                                    int i36 = f8 + 1;
                                    int f13 = m7.f(i36);
                                    int i37 = 0;
                                    while (i37 < i36) {
                                        if (((f13 >> i37) & 1) == 1) {
                                            m7.u(i20);
                                        }
                                        i37++;
                                        i20 = 8;
                                    }
                                    i14 = f10 * 512;
                                    if (m7.w()) {
                                        m7.u(2);
                                        int f14 = (m7.f(2) + 1) << 2;
                                        int f15 = m7.f(2) + 1;
                                        for (int i38 = 0; i38 < f15; i38++) {
                                            m7.u(f14);
                                        }
                                    }
                                } else {
                                    i13 = -1;
                                    i14 = 0;
                                }
                                m7.u(i35);
                                m7.u(12);
                                if (w6) {
                                    if (m7.w()) {
                                        m7.u(i34);
                                    }
                                    if (m7.w()) {
                                        m7.u(24);
                                    }
                                    if (m7.w()) {
                                        m7.v(m7.f(10) + 1);
                                    }
                                    m7.u(5);
                                    i19 = JB.f9897j[m7.f(4)];
                                    i15 = m7.f(8) + 1;
                                } else {
                                    i15 = -1;
                                }
                                int i39 = i19;
                                if (w6) {
                                    if (i13 == 0) {
                                        i16 = 32000;
                                    } else if (i13 == 1) {
                                        i16 = 44100;
                                    } else {
                                        if (i13 != 2) {
                                            throw B7.a(null, "Unsupported reference clock code in DTS HD header: " + i13);
                                        }
                                        i16 = 48000;
                                    }
                                    j6 = AbstractC1260lo.u(i14, 1000000L, i16, RoundingMode.DOWN);
                                } else {
                                    j6 = -9223372036854775807L;
                                }
                                a(new C1541s("audio/vnd.dts.hd;profile=lbr", i15, i39, f9, j6));
                                this.f8151l = f9;
                                this.f8149j = j6 == -9223372036854775807L ? 0L : j6;
                                c1617tm2.j(0);
                                this.f.c(this.f8153n, c1617tm2);
                                this.f8147g = 6;
                            }
                        }
                    } else if (g(c1617tm, c1617tm2.f15724a, 7)) {
                        C0826c0 m8 = JB.m(c1617tm2.f15724a);
                        m8.u(42);
                        this.f8153n = m8.f(true != m8.w() ? 8 : 12) + 1;
                        this.f8147g = 3;
                    }
                } else if (g(c1617tm, c1617tm2.f15724a, 18)) {
                    byte[] bArr2 = c1617tm2.f15724a;
                    if (this.f8150k == null) {
                        String str = this.f8146e;
                        C0826c0 m9 = JB.m(bArr2);
                        m9.u(60);
                        int i40 = JB.f9895g[m9.f(6)];
                        int i41 = JB.f9896h[m9.f(4)];
                        int f16 = m9.f(5);
                        int i42 = f16 >= 29 ? -1 : (JB.i[f16] * 1000) / 2;
                        m9.u(10);
                        int i43 = i40 + (m9.f(2) > 0 ? 1 : 0);
                        C1649uH c1649uH = new C1649uH();
                        c1649uH.f15839a = str;
                        c1649uH.c("audio/vnd.dts");
                        c1649uH.f15844g = i42;
                        c1649uH.f15831A = i43;
                        c1649uH.f15832B = i41;
                        c1649uH.f15852p = null;
                        c1649uH.f15842d = this.f8144c;
                        c1649uH.f = this.f8145d;
                        C1407p c1407p = new C1407p(c1649uH);
                        this.f8150k = c1407p;
                        this.f.e(c1407p);
                    }
                    byte b8 = bArr2[0];
                    if (b8 != -2) {
                        if (b8 == -1) {
                            i7 = (bArr2[7] & 3) << 12;
                            i8 = (bArr2[6] & 255) << 4;
                            b6 = bArr2[9];
                        } else if (b8 != 31) {
                            i = (((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4) | ((bArr2[7] & 240) >> 4)) + 1;
                            z3 = false;
                        } else {
                            i7 = (bArr2[6] & 3) << 12;
                            i8 = (bArr2[7] & 255) << 4;
                            b6 = bArr2[8];
                        }
                        i = (i7 | i8 | ((b6 & 60) >> 2)) + 1;
                        z3 = true;
                    } else {
                        i = (((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4) | ((bArr2[6] & 240) >> 4)) + 1;
                        z3 = false;
                    }
                    if (z3) {
                        i = (i * 16) / 14;
                    }
                    this.f8151l = i;
                    if (b8 != -2) {
                        if (b8 == -1) {
                            i5 = (bArr2[4] & 7) << 4;
                            b5 = bArr2[7];
                        } else if (b8 != 31) {
                            i5 = (bArr2[4] & 1) << 6;
                            b3 = bArr2[5];
                        } else {
                            i5 = (bArr2[5] & 7) << 4;
                            b5 = bArr2[6];
                        }
                        i6 = b5 & 60;
                        this.f8149j = AbstractC1400ot.t(AbstractC1260lo.t(this.f8150k.f14887C, (((i6 >> 2) | i5) + 1) * 32));
                        c1617tm2.j(0);
                        this.f.c(18, c1617tm2);
                        this.f8147g = 6;
                    } else {
                        i5 = (bArr2[5] & 1) << 6;
                        b3 = bArr2[4];
                    }
                    i6 = b3 & 252;
                    this.f8149j = AbstractC1400ot.t(AbstractC1260lo.t(this.f8150k.f14887C, (((i6 >> 2) | i5) + 1) * 32));
                    c1617tm2.j(0);
                    this.f.c(18, c1617tm2);
                    this.f8147g = 6;
                }
                i17 = 4;
            } else {
                while (c1617tm.o() > 0) {
                    int i44 = this.i << 8;
                    this.i = i44;
                    int v4 = i44 | c1617tm.v();
                    this.i = v4;
                    int i45 = (v4 == 2147385345 || v4 == -25230976 || v4 == 536864768 || v4 == -14745368) ? 1 : (v4 == 1683496997 || v4 == 622876772) ? 2 : (v4 == 1078008818 || v4 == -233094848) ? 3 : (v4 == 1908687592 || v4 == -398277519) ? 4 : 0;
                    this.f8152m = i45;
                    if (i45 != 0) {
                        byte[] bArr3 = c1617tm2.f15724a;
                        bArr3[0] = (byte) ((v4 >> 24) & 255);
                        bArr3[1] = (byte) ((v4 >> 16) & 255);
                        bArr3[2] = (byte) ((v4 >> 8) & 255);
                        bArr3[3] = (byte) (v4 & 255);
                        this.f8148h = 4;
                        this.i = 0;
                        if (i45 == 3 || i45 == 4) {
                            this.f8147g = 4;
                        } else if (i45 == 1) {
                            this.f8147g = 1;
                        } else {
                            this.f8147g = 2;
                        }
                        i17 = 4;
                    }
                }
                i17 = 4;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f8146e = c0829c3.f12966e;
        c0829c3.b();
        this.f = h3.w(c0829c3.f12965d, 1);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f8155p = j5;
    }

    public final boolean g(C1617tm c1617tm, byte[] bArr, int i) {
        int min = Math.min(c1617tm.o(), i - this.f8148h);
        c1617tm.f(bArr, this.f8148h, min);
        int i5 = this.f8148h + min;
        this.f8148h = i5;
        return i5 == i;
    }
}
