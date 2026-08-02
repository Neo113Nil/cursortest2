package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class M2 implements F2 {

    /* renamed from: a, reason: collision with root package name */
    public final C0905dr f10569a;

    /* renamed from: e, reason: collision with root package name */
    public long f10573e;

    /* renamed from: g, reason: collision with root package name */
    public String f10574g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0737a0 f10575h;
    public L2 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10576j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10578l;
    public final boolean[] f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    public final T2 f10570b = new T2(7);

    /* renamed from: c, reason: collision with root package name */
    public final T2 f10571c = new T2(8);

    /* renamed from: d, reason: collision with root package name */
    public final T2 f10572d = new T2(6);

    /* renamed from: k, reason: collision with root package name */
    public long f10577k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    public final C1617tm f10579m = new C1617tm();

    public M2(C0905dr c0905dr) {
        this.f10569a = c0905dr;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f10573e = 0L;
        this.f10578l = false;
        this.f10577k = -9223372036854775807L;
        AbstractC1668us.f0(this.f);
        this.f10570b.c();
        this.f10571c.c();
        this.f10572d.c();
        ((C1245lH) this.f10569a.f13188n).f(0);
        L2 l22 = this.i;
        if (l22 != null) {
            l22.f10300g = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01f8  */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        T2 t22;
        T2 t23;
        T2 t24;
        int i;
        byte[] bArr;
        int i5;
        byte[] bArr2;
        int i6;
        int i7;
        long j5;
        L2 l22;
        boolean z3;
        boolean z5;
        int i8;
        AbstractC1668us.F(this.f10575h);
        int i9 = AbstractC1260lo.f14419a;
        int i10 = c1617tm.f15725b;
        int i11 = c1617tm.f15726c;
        byte[] bArr3 = c1617tm.f15724a;
        this.f10573e += c1617tm.o();
        this.f10575h.c(c1617tm.o(), c1617tm);
        while (true) {
            int e3 = AbstractC1668us.e(bArr3, i10, i11, this.f);
            t22 = this.f10572d;
            t23 = this.f10571c;
            t24 = this.f10570b;
            if (e3 == i11) {
                break;
            }
            int i12 = e3 + 3;
            int i13 = bArr3[i12] & 31;
            int i14 = e3 - i10;
            if (i14 > 0) {
                if (!this.f10576j) {
                    t24.b(bArr3, i10, e3);
                    t23.b(bArr3, i10, e3);
                }
                t22.b(bArr3, i10, e3);
            }
            int i15 = i11 - e3;
            long j6 = this.f10573e - i15;
            int i16 = i14 < 0 ? -i14 : 0;
            long j7 = this.f10577k;
            boolean z6 = this.f10576j;
            C1245lH c1245lH = (C1245lH) this.f10569a.f13188n;
            if (!z6) {
                t24.e(i16);
                t23.e(i16);
                if (this.f10576j) {
                    i5 = i11;
                    bArr2 = bArr3;
                    i6 = i12;
                    i7 = i13;
                    j5 = j6;
                    if (t24.f11617c) {
                        C0996fs Y4 = AbstractC1668us.Y((byte[]) t24.f11619e, 4, t24.f11618d);
                        c1245lH.getClass();
                        int i17 = Y4.f13521m;
                        AbstractC1668us.a0(i17 >= 0);
                        c1245lH.f14376k = i17;
                        c1245lH.f(i17);
                        this.i.f10296b.append(Y4.f13514d, Y4);
                        t24.c();
                    } else if (t23.f11617c) {
                        C0826c0 c0826c0 = new C0826c0((byte[]) t23.f11619e, 4, t23.f11618d);
                        int o5 = c0826c0.o();
                        c0826c0.o();
                        c0826c0.i();
                        c0826c0.n();
                        this.i.f10297c.append(o5, new Aq(o5));
                        t23.c();
                    }
                } else if (t24.f11617c && t23.f11617c) {
                    ArrayList arrayList = new ArrayList();
                    i6 = i12;
                    arrayList.add(Arrays.copyOf((byte[]) t24.f11619e, t24.f11618d));
                    arrayList.add(Arrays.copyOf((byte[]) t23.f11619e, t23.f11618d));
                    i5 = i11;
                    C0996fs Y5 = AbstractC1668us.Y((byte[]) t24.f11619e, 4, t24.f11618d);
                    bArr2 = bArr3;
                    j5 = j6;
                    C0826c0 c0826c02 = new C0826c0((byte[]) t23.f11619e, 4, t23.f11618d);
                    int o6 = c0826c02.o();
                    c0826c02.o();
                    c0826c02.i();
                    c0826c02.n();
                    Aq aq = new Aq(o6);
                    byte[] bArr4 = AbstractC1120ii.f13966a;
                    String format = String.format("avc1.%02X%02X%02X", Integer.valueOf(Y5.f13511a), Integer.valueOf(Y5.f13512b), Integer.valueOf(Y5.f13513c));
                    InterfaceC0737a0 interfaceC0737a0 = this.f10575h;
                    C1649uH c1649uH = new C1649uH();
                    i7 = i13;
                    c1649uH.f15839a = this.f10574g;
                    c1649uH.c("video/avc");
                    c1649uH.i = format;
                    c1649uH.f15855s = Y5.f13515e;
                    c1649uH.f15856t = Y5.f;
                    c1649uH.f15862z = new C1242lE(Y5.f13518j, Y5.f13519k, Y5.f13520l, Y5.f13517h + 8, Y5.i + 8, null);
                    c1649uH.f15859w = Y5.f13516g;
                    c1649uH.f15851o = arrayList;
                    c1649uH.f15850n = Y5.f13521m;
                    interfaceC0737a0.e(new C1407p(c1649uH));
                    this.f10576j = true;
                    this.i.f10296b.append(Y5.f13514d, Y5);
                    this.i.f10297c.append(o6, aq);
                    t24.c();
                    t23.c();
                }
                if (t22.e(i16)) {
                    int v4 = AbstractC1668us.v(t22.f11618d, (byte[]) t22.f11619e);
                    byte[] bArr5 = (byte[]) t22.f11619e;
                    C1617tm c1617tm2 = this.f10579m;
                    c1617tm2.h(v4, bArr5);
                    c1617tm2.j(4);
                    c1245lH.d(j7, c1617tm2);
                }
                l22 = this.i;
                boolean z7 = this.f10576j;
                if (l22.f10298d == 9) {
                    z3 = true;
                } else {
                    if (z7 && l22.f10300g) {
                        long j8 = l22.f10299e;
                        int i18 = i15 + ((int) (j5 - j8));
                        long j9 = l22.i;
                        if (j9 != -9223372036854775807L) {
                            l22.f10295a.d(j9, l22.f10302j ? 1 : 0, (int) (j8 - l22.f10301h), i18, null);
                        }
                    }
                    l22.f10301h = l22.f10299e;
                    l22.i = l22.f;
                    l22.f10302j = false;
                    z3 = true;
                    l22.f10300g = true;
                }
                boolean z8 = l22.f10303k;
                boolean z9 = l22.f10302j;
                int i19 = l22.f10298d;
                z5 = ((i19 != 5 || (z8 && i19 == z3)) ? z3 : false) | z9;
                l22.f10302j = z5;
                if (!z5) {
                    this.f10578l = false;
                }
                long j10 = this.f10577k;
                if (this.f10576j) {
                    i8 = i7;
                    t24.d(i8);
                    t23.d(i8);
                } else {
                    i8 = i7;
                }
                t22.d(i8);
                L2 l23 = this.i;
                boolean z10 = this.f10578l;
                l23.f10298d = i8;
                l23.f = j10;
                l23.f10299e = j5;
                l23.f10303k = z10;
                i10 = i6;
                i11 = i5;
                bArr3 = bArr2;
            }
            i5 = i11;
            bArr2 = bArr3;
            i6 = i12;
            i7 = i13;
            j5 = j6;
            if (t22.e(i16)) {
            }
            l22 = this.i;
            boolean z72 = this.f10576j;
            if (l22.f10298d == 9) {
            }
            boolean z82 = l22.f10303k;
            boolean z92 = l22.f10302j;
            int i192 = l22.f10298d;
            z5 = ((i192 != 5 || (z82 && i192 == z3)) ? z3 : false) | z92;
            l22.f10302j = z5;
            if (!z5) {
            }
            long j102 = this.f10577k;
            if (this.f10576j) {
            }
            t22.d(i8);
            L2 l232 = this.i;
            boolean z102 = this.f10578l;
            l232.f10298d = i8;
            l232.f = j102;
            l232.f10299e = j5;
            l232.f10303k = z102;
            i10 = i6;
            i11 = i5;
            bArr3 = bArr2;
        }
        int i20 = i11;
        byte[] bArr6 = bArr3;
        if (this.f10576j) {
            i = i20;
            bArr = bArr6;
        } else {
            i = i20;
            bArr = bArr6;
            t24.b(bArr, i10, i);
            t23.b(bArr, i10, i);
        }
        t22.b(bArr, i10, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
        AbstractC1668us.F(this.f10575h);
        int i = AbstractC1260lo.f14419a;
        if (z3) {
            char c5 = 0;
            ((C1245lH) this.f10569a.f13188n).f(0);
            L2 l22 = this.i;
            long j5 = this.f10573e;
            boolean z5 = l22.f10303k;
            boolean z6 = l22.f10302j;
            int i5 = l22.f10298d;
            if (i5 == 5 || (z5 && i5 == 1)) {
                c5 = 1;
            }
            boolean z7 = (z6 ? 1 : 0) | c5;
            l22.f10302j = z7;
            l22.f10299e = j5;
            long j6 = l22.i;
            if (j6 != -9223372036854775807L) {
                l22.f10295a.d(j6, z7 ? 1 : 0, (int) (j5 - l22.f10301h), 0, null);
            }
            l22.f10300g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f10574g = c0829c3.f12966e;
        c0829c3.b();
        InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 2);
        this.f10575h = w5;
        this.i = new L2(w5);
        this.f10569a.A(h3, c0829c3);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f10577k = j5;
        int i5 = i & 2;
        this.f10578l = (i5 != 0) | this.f10578l;
    }
}
