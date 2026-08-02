package com.google.android.gms.internal.ads;

import a3.AbstractC0467k;

/* loaded from: classes.dex */
public final class U2 implements InterfaceC0874d3 {

    /* renamed from: a, reason: collision with root package name */
    public final F2 f11712a;

    /* renamed from: b, reason: collision with root package name */
    public final C0826c0 f11713b = new C0826c0(10, new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    public int f11714c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f11715d;

    /* renamed from: e, reason: collision with root package name */
    public Kn f11716e;
    public boolean f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11717g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f11718h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f11719j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f11720k;

    public U2(F2 f22) {
        this.f11712a = f22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.internal.ads.c0] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.F2] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    @Override // com.google.android.gms.internal.ads.InterfaceC0874d3
    public final void a(int i, C1617tm c1617tm) {
        int i5;
        int i6;
        int i7;
        int i8;
        long j5;
        long j6;
        int i9;
        AbstractC1668us.F(this.f11716e);
        int i10 = i & 1;
        ?? r32 = this.f11712a;
        int i11 = -1;
        int i12 = 2;
        ?? r8 = 0;
        if (i10 != 0) {
            int i13 = this.f11714c;
            if (i13 != 0 && i13 != 1) {
                if (i13 != 2) {
                    int i14 = this.f11719j;
                    if (i14 != -1) {
                        JB.l("PesReader", "Unexpected start indicator: expected " + i14 + " more bytes");
                    }
                    r32.d(c1617tm.f15726c == 0);
                } else {
                    JB.l("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            this.f11714c = 1;
            this.f11715d = 0;
        }
        int i15 = i;
        while (c1617tm.o() > 0) {
            int i16 = this.f11714c;
            if (i16 != 0) {
                ?? r10 = this.f11713b;
                if (i16 != 1) {
                    if (i16 != i12) {
                        int o5 = c1617tm.o();
                        int i17 = this.f11719j;
                        int i18 = i17 == i11 ? r8 : o5 - i17;
                        if (i18 > 0) {
                            o5 -= i18;
                            c1617tm.i(c1617tm.f15725b + o5);
                        }
                        r32.c(c1617tm);
                        int i19 = this.f11719j;
                        if (i19 != i11) {
                            int i20 = i19 - o5;
                            this.f11719j = i20;
                            if (i20 == 0) {
                                r32.d(r8);
                                this.f11714c = 1;
                                this.f11715d = r8;
                            }
                        }
                    } else {
                        if (c(c1617tm, r10.f12943b, Math.min(10, this.i)) && c(c1617tm, null, this.i)) {
                            r10.s(r8);
                            if (this.f) {
                                r10.u(4);
                                long f = r10.f(3);
                                r10.u(1);
                                int f5 = r10.f(15) << 15;
                                r10.u(1);
                                long f6 = r10.f(15);
                                r10.u(1);
                                if (this.f11718h || !this.f11717g) {
                                    j6 = f;
                                    i9 = f5;
                                } else {
                                    r10.u(4);
                                    j6 = f;
                                    r10.u(1);
                                    int f7 = r10.f(15) << 15;
                                    r10.u(1);
                                    long f8 = r10.f(15);
                                    r10.u(1);
                                    i9 = f5;
                                    this.f11716e.b(f8 | (r10.f(3) << 30) | f7);
                                    this.f11718h = true;
                                }
                                j5 = this.f11716e.b(f6 | (j6 << 30) | i9);
                            } else {
                                j5 = -9223372036854775807L;
                            }
                            i15 |= true != this.f11720k ? 0 : 4;
                            r32.f(i15, j5);
                            this.f11714c = 3;
                            this.f11715d = 0;
                            r8 = 0;
                            i11 = -1;
                            i12 = 2;
                        }
                    }
                    i5 = i11;
                    i6 = r8;
                    i7 = i12;
                } else {
                    i6 = r8;
                    if (c(c1617tm, r10.f12943b, 9)) {
                        r10.s(i6);
                        int f9 = r10.f(24);
                        if (f9 != 1) {
                            AbstractC0467k.y(f9, "Unexpected start code prefix: ", "PesReader");
                            this.f11719j = -1;
                            i5 = -1;
                            i8 = 0;
                            i7 = 2;
                        } else {
                            r10.u(8);
                            int f10 = r10.f(16);
                            r10.u(5);
                            this.f11720k = r10.w();
                            i7 = 2;
                            r10.u(2);
                            this.f = r10.w();
                            this.f11717g = r10.w();
                            r10.u(6);
                            int f11 = r10.f(8);
                            this.i = f11;
                            i5 = -1;
                            if (f10 == 0) {
                                this.f11719j = -1;
                            } else {
                                int i21 = (f10 - 3) - f11;
                                this.f11719j = i21;
                                if (i21 < 0) {
                                    AbstractC0467k.y(i21, "Found negative packet payload size: ", "PesReader");
                                    this.f11719j = -1;
                                }
                            }
                            i8 = 2;
                        }
                        this.f11714c = i8;
                        i6 = 0;
                        this.f11715d = 0;
                    } else {
                        i7 = 2;
                        i5 = -1;
                    }
                }
            } else {
                i5 = i11;
                i6 = r8;
                i7 = i12;
                c1617tm.k(c1617tm.o());
            }
            i12 = i7;
            r8 = i6;
            i11 = i5;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0874d3
    public final void b(Kn kn, H h3, C0829c3 c0829c3) {
        this.f11716e = kn;
        this.f11712a.e(h3, c0829c3);
    }

    public final boolean c(C1617tm c1617tm, byte[] bArr, int i) {
        int min = Math.min(c1617tm.o(), i - this.f11715d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            c1617tm.k(min);
        } else {
            c1617tm.f(bArr, this.f11715d, min);
        }
        int i5 = this.f11715d + min;
        this.f11715d = i5;
        return i5 == i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0874d3
    public final void i() {
        this.f11714c = 0;
        this.f11715d = 0;
        this.f11718h = false;
        this.f11712a.b();
    }
}
