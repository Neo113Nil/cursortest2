package com.google.android.gms.internal.ads;

import java.util.Collections;

/* loaded from: classes.dex */
public final class O2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0905dr f10891a;

    /* renamed from: b, reason: collision with root package name */
    public String f10892b;

    /* renamed from: c, reason: collision with root package name */
    public InterfaceC0737a0 f10893c;

    /* renamed from: d, reason: collision with root package name */
    public N2 f10894d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10895e;

    /* renamed from: l, reason: collision with root package name */
    public long f10900l;
    public final boolean[] f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    public final T2 f10896g = new T2(32);

    /* renamed from: h, reason: collision with root package name */
    public final T2 f10897h = new T2(33);
    public final T2 i = new T2(34);

    /* renamed from: j, reason: collision with root package name */
    public final T2 f10898j = new T2(39);

    /* renamed from: k, reason: collision with root package name */
    public final T2 f10899k = new T2(40);

    /* renamed from: m, reason: collision with root package name */
    public long f10901m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    public final C1617tm f10902n = new C1617tm();

    public O2(C0905dr c0905dr) {
        this.f10891a = c0905dr;
    }

    public final void a(byte[] bArr, int i, int i5) {
        N2 n22 = this.f10894d;
        if (n22.f) {
            int i6 = n22.f10768d;
            int i7 = (i + 2) - i6;
            if (i7 < i5) {
                n22.f10770g = (bArr[i7] & 128) != 0;
                n22.f = false;
            } else {
                n22.f10768d = (i5 - i) + i6;
            }
        }
        if (!this.f10895e) {
            this.f10896g.b(bArr, i, i5);
            this.f10897h.b(bArr, i, i5);
            this.i.b(bArr, i, i5);
        }
        this.f10898j.b(bArr, i, i5);
        this.f10899k.b(bArr, i, i5);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f10900l = 0L;
        this.f10901m = -9223372036854775807L;
        AbstractC1668us.f0(this.f);
        this.f10896g.c();
        this.f10897h.c();
        this.i.c();
        this.f10898j.c();
        this.f10899k.c();
        ((C1245lH) this.f10891a.f13188n).f(0);
        N2 n22 = this.f10894d;
        if (n22 != null) {
            n22.f = false;
            n22.f10770g = false;
            n22.f10771h = false;
            n22.i = false;
            n22.f10772j = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0239 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        int i;
        boolean z3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        int i8;
        boolean e3;
        T2 t22;
        int i9;
        boolean z5;
        boolean z6;
        C1617tm c1617tm2 = c1617tm;
        AbstractC1668us.F(this.f10893c);
        int i10 = AbstractC1260lo.f14419a;
        while (c1617tm2.o() > 0) {
            int i11 = c1617tm2.f15725b;
            int i12 = c1617tm2.f15726c;
            byte[] bArr2 = c1617tm2.f15724a;
            this.f10900l += c1617tm2.o();
            this.f10893c.c(c1617tm2.o(), c1617tm2);
            while (i11 < i12) {
                int e5 = AbstractC1668us.e(bArr2, i11, i12, this.f);
                if (e5 == i12) {
                    a(bArr2, i11, i12);
                    return;
                }
                int i13 = e5 + 3;
                int i14 = bArr2[i13] & 126;
                int i15 = e5 - i11;
                if (i15 > 0) {
                    a(bArr2, i11, e5);
                }
                int i16 = i12 - e5;
                long j5 = this.f10900l - i16;
                int i17 = i15 < 0 ? -i15 : 0;
                long j6 = this.f10901m;
                N2 n22 = this.f10894d;
                boolean z7 = this.f10895e;
                if (n22.f10772j && n22.f10770g) {
                    n22.f10775m = n22.f10767c;
                    n22.f10772j = false;
                } else if (n22.f10771h || n22.f10770g) {
                    if (z7 && n22.i) {
                        i = i13;
                        n22.a(((int) (j5 - n22.f10766b)) + i16);
                    } else {
                        i = i13;
                    }
                    n22.f10773k = n22.f10766b;
                    n22.f10774l = n22.f10769e;
                    n22.f10775m = n22.f10767c;
                    n22.i = true;
                    z3 = this.f10895e;
                    C1245lH c1245lH = (C1245lH) this.f10891a.f13188n;
                    T2 t23 = this.i;
                    T2 t24 = this.f10897h;
                    T2 t25 = this.f10896g;
                    if (!z3) {
                        t25.e(i17);
                        t24.e(i17);
                        t23.e(i17);
                        if (t25.f11617c && t24.f11617c && t23.f11617c) {
                            String str = this.f10892b;
                            i5 = i;
                            int i18 = t25.f11618d;
                            i8 = i14;
                            byte[] bArr3 = new byte[t24.f11618d + i18 + t23.f11618d];
                            i7 = i12;
                            bArr = bArr2;
                            System.arraycopy((byte[]) t25.f11619e, 0, bArr3, 0, i18);
                            i6 = i16;
                            System.arraycopy((byte[]) t24.f11619e, 0, bArr3, t25.f11618d, t24.f11618d);
                            System.arraycopy((byte[]) t23.f11619e, 0, bArr3, t25.f11618d + t24.f11618d, t23.f11618d);
                            C1263lr L5 = AbstractC1668us.L((byte[]) t24.f11619e, 3, t24.f11618d, null);
                            C1442pq c1442pq = L5.f14435a;
                            String c5 = c1442pq != null ? AbstractC1120ii.c(c1442pq.f15053a, c1442pq.f15054b, c1442pq.f15055c, c1442pq.f15056d, c1442pq.f15057e, c1442pq.f) : null;
                            C1649uH c1649uH = new C1649uH();
                            c1649uH.f15839a = str;
                            c1649uH.c("video/hevc");
                            c1649uH.i = c5;
                            c1649uH.f15855s = L5.f14438d;
                            c1649uH.f15856t = L5.f14439e;
                            c1649uH.f15862z = new C1242lE(L5.f14441h, L5.i, L5.f14442j, L5.f14436b + 8, L5.f14437c + 8, null);
                            c1649uH.f15859w = L5.f;
                            c1649uH.f15850n = L5.f14440g;
                            c1649uH.f15851o = Collections.singletonList(bArr3);
                            C1407p c1407p = new C1407p(c1649uH);
                            this.f10893c.e(c1407p);
                            int i19 = c1407p.f14906o;
                            if (i19 == -1) {
                                throw new IllegalStateException();
                            }
                            c1245lH.getClass();
                            AbstractC1668us.a0(i19 >= 0);
                            c1245lH.f14376k = i19;
                            c1245lH.f(i19);
                            this.f10895e = true;
                            T2 t26 = this.f10898j;
                            e3 = t26.e(i17);
                            C1617tm c1617tm3 = this.f10902n;
                            if (e3) {
                                c1617tm3.h(AbstractC1668us.v(t26.f11618d, (byte[]) t26.f11619e), (byte[]) t26.f11619e);
                                c1617tm3.k(5);
                                c1245lH.d(j6, c1617tm3);
                            }
                            t22 = this.f10899k;
                            if (t22.e(i17)) {
                                c1617tm3.h(AbstractC1668us.v(t22.f11618d, (byte[]) t22.f11619e), (byte[]) t22.f11619e);
                                c1617tm3.k(5);
                                c1245lH.d(j6, c1617tm3);
                            }
                            i9 = i8 >> 1;
                            long j7 = this.f10901m;
                            N2 n23 = this.f10894d;
                            boolean z8 = this.f10895e;
                            n23.f10770g = false;
                            n23.f10771h = false;
                            n23.f10769e = j7;
                            n23.f10768d = 0;
                            n23.f10766b = j5;
                            if (i9 >= 32 || i9 == 40) {
                                z5 = false;
                            } else {
                                if (!n23.i || n23.f10772j) {
                                    z5 = false;
                                } else {
                                    if (z8) {
                                        n23.a(i6);
                                    }
                                    z5 = false;
                                    n23.i = false;
                                }
                                if (i9 <= 35 || i9 == 39) {
                                    z6 = true;
                                    n23.f10771h = !n23.f10772j;
                                    n23.f10772j = true;
                                    boolean z9 = (i9 >= 16 || i9 > 21) ? z5 : z6;
                                    n23.f10767c = z9;
                                    n23.f = (!z9 || i9 <= 9) ? z6 : z5;
                                    if (this.f10895e) {
                                        t25.d(i9);
                                        t24.d(i9);
                                        t23.d(i9);
                                    }
                                    t26.d(i9);
                                    t22.d(i9);
                                    i11 = i5;
                                    i12 = i7;
                                    bArr2 = bArr;
                                }
                            }
                            z6 = true;
                            if (i9 >= 16) {
                            }
                            n23.f10767c = z9;
                            n23.f = (!z9 || i9 <= 9) ? z6 : z5;
                            if (this.f10895e) {
                            }
                            t26.d(i9);
                            t22.d(i9);
                            i11 = i5;
                            i12 = i7;
                            bArr2 = bArr;
                        }
                    }
                    i5 = i;
                    i6 = i16;
                    i7 = i12;
                    bArr = bArr2;
                    i8 = i14;
                    T2 t262 = this.f10898j;
                    e3 = t262.e(i17);
                    C1617tm c1617tm32 = this.f10902n;
                    if (e3) {
                    }
                    t22 = this.f10899k;
                    if (t22.e(i17)) {
                    }
                    i9 = i8 >> 1;
                    long j72 = this.f10901m;
                    N2 n232 = this.f10894d;
                    boolean z82 = this.f10895e;
                    n232.f10770g = false;
                    n232.f10771h = false;
                    n232.f10769e = j72;
                    n232.f10768d = 0;
                    n232.f10766b = j5;
                    if (i9 >= 32) {
                    }
                    z5 = false;
                    z6 = true;
                    if (i9 >= 16) {
                    }
                    n232.f10767c = z9;
                    n232.f = (!z9 || i9 <= 9) ? z6 : z5;
                    if (this.f10895e) {
                    }
                    t262.d(i9);
                    t22.d(i9);
                    i11 = i5;
                    i12 = i7;
                    bArr2 = bArr;
                }
                i = i13;
                z3 = this.f10895e;
                C1245lH c1245lH2 = (C1245lH) this.f10891a.f13188n;
                T2 t232 = this.i;
                T2 t242 = this.f10897h;
                T2 t252 = this.f10896g;
                if (!z3) {
                }
                i5 = i;
                i6 = i16;
                i7 = i12;
                bArr = bArr2;
                i8 = i14;
                T2 t2622 = this.f10898j;
                e3 = t2622.e(i17);
                C1617tm c1617tm322 = this.f10902n;
                if (e3) {
                }
                t22 = this.f10899k;
                if (t22.e(i17)) {
                }
                i9 = i8 >> 1;
                long j722 = this.f10901m;
                N2 n2322 = this.f10894d;
                boolean z822 = this.f10895e;
                n2322.f10770g = false;
                n2322.f10771h = false;
                n2322.f10769e = j722;
                n2322.f10768d = 0;
                n2322.f10766b = j5;
                if (i9 >= 32) {
                }
                z5 = false;
                z6 = true;
                if (i9 >= 16) {
                }
                n2322.f10767c = z9;
                n2322.f = (!z9 || i9 <= 9) ? z6 : z5;
                if (this.f10895e) {
                }
                t2622.d(i9);
                t22.d(i9);
                i11 = i5;
                i12 = i7;
                bArr2 = bArr;
            }
            c1617tm2 = c1617tm;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
        AbstractC1668us.F(this.f10893c);
        int i = AbstractC1260lo.f14419a;
        if (z3) {
            ((C1245lH) this.f10891a.f13188n).f(0);
            N2 n22 = this.f10894d;
            long j5 = this.f10900l;
            n22.f10775m = n22.f10767c;
            n22.a((int) (j5 - n22.f10766b));
            n22.f10773k = n22.f10766b;
            n22.f10766b = j5;
            n22.a(0);
            n22.i = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f10892b = c0829c3.f12966e;
        c0829c3.b();
        InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 2);
        this.f10893c = w5;
        this.f10894d = new N2(w5);
        this.f10891a.A(h3, c0829c3);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f10901m = j5;
    }
}
