package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class K2 implements F2 {

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f10105l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final C0709Wb f10106a;

    /* renamed from: b, reason: collision with root package name */
    public final C1617tm f10107b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean[] f10108c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    public final I2 f10109d;

    /* renamed from: e, reason: collision with root package name */
    public final T2 f10110e;
    public J2 f;

    /* renamed from: g, reason: collision with root package name */
    public long f10111g;

    /* renamed from: h, reason: collision with root package name */
    public String f10112h;
    public InterfaceC0737a0 i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10113j;

    /* renamed from: k, reason: collision with root package name */
    public long f10114k;

    public K2(C0709Wb c0709Wb) {
        this.f10106a = c0709Wb;
        I2 i22 = new I2();
        i22.f9520e = new byte[128];
        this.f10109d = i22;
        this.f10114k = -9223372036854775807L;
        this.f10110e = new T2(178);
        this.f10107b = new C1617tm();
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        AbstractC1668us.f0(this.f10108c);
        I2 i22 = this.f10109d;
        i22.f9516a = false;
        i22.f9518c = 0;
        i22.f9517b = 0;
        J2 j22 = this.f;
        if (j22 != null) {
            j22.f9675b = false;
            j22.f9676c = false;
            j22.f9677d = false;
            j22.f9678e = -1;
        }
        T2 t22 = this.f10110e;
        if (t22 != null) {
            t22.c();
        }
        this.f10111g = 0L;
        this.f10114k = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x013b  */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        I2 i22;
        T2 t22;
        int i;
        char c5;
        boolean z3;
        int i5;
        float f;
        boolean z5 = true;
        AbstractC1668us.F(this.f);
        AbstractC1668us.F(this.i);
        int i6 = c1617tm.f15725b;
        int i7 = c1617tm.f15726c;
        byte[] bArr = c1617tm.f15724a;
        this.f10111g += c1617tm.o();
        this.i.c(c1617tm.o(), c1617tm);
        while (true) {
            int e3 = AbstractC1668us.e(bArr, i6, i7, this.f10108c);
            i22 = this.f10109d;
            t22 = this.f10110e;
            if (e3 == i7) {
                break;
            }
            int i8 = e3 + 3;
            byte b3 = c1617tm.f15724a[i8];
            int i9 = b3 & 255;
            int i10 = e3 - i6;
            if (this.f10113j) {
                i = i7;
            } else {
                if (i10 > 0) {
                    i22.a(bArr, i6, e3);
                }
                int i11 = i10 < 0 ? -i10 : 0;
                int i12 = i22.f9517b;
                if (i12 != 0) {
                    i = i7;
                    if (i12 != z5) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i9 == 179 || i9 == 181) {
                                    i22.f9518c -= i11;
                                    i22.f9516a = false;
                                    InterfaceC0737a0 interfaceC0737a0 = this.i;
                                    int i13 = i22.f9519d;
                                    String str = this.f10112h;
                                    str.getClass();
                                    byte[] copyOf = Arrays.copyOf(i22.f9520e, i22.f9518c);
                                    C0826c0 c0826c0 = new C0826c0(copyOf.length, copyOf);
                                    c0826c0.v(i13);
                                    c0826c0.v(4);
                                    c0826c0.t();
                                    c0826c0.u(8);
                                    if (c0826c0.w()) {
                                        c0826c0.u(4);
                                        c0826c0.u(3);
                                    }
                                    int f5 = c0826c0.f(4);
                                    if (f5 == 15) {
                                        int f6 = c0826c0.f(8);
                                        int f7 = c0826c0.f(8);
                                        if (f7 == 0) {
                                            JB.l("H263Reader", "Invalid aspect ratio");
                                            f = 1.0f;
                                            if (c0826c0.w()) {
                                                c0826c0.u(2);
                                                c0826c0.u(1);
                                                if (c0826c0.w()) {
                                                    c0826c0.u(15);
                                                    c0826c0.t();
                                                    c0826c0.u(15);
                                                    c0826c0.t();
                                                    c0826c0.u(15);
                                                    c0826c0.t();
                                                    c0826c0.u(3);
                                                    c0826c0.u(11);
                                                    c0826c0.t();
                                                    c0826c0.u(15);
                                                    c0826c0.t();
                                                }
                                            }
                                            if (c0826c0.f(2) != 0) {
                                                JB.l("H263Reader", "Unhandled video object layer shape");
                                            }
                                            c0826c0.t();
                                            int f8 = c0826c0.f(16);
                                            c0826c0.t();
                                            if (c0826c0.w()) {
                                                if (f8 == 0) {
                                                    JB.l("H263Reader", "Invalid vop_increment_time_resolution");
                                                } else {
                                                    int i14 = f8 - 1;
                                                    int i15 = 0;
                                                    while (i14 > 0) {
                                                        i14 >>= 1;
                                                        i15++;
                                                    }
                                                    c0826c0.u(i15);
                                                }
                                            }
                                            c0826c0.t();
                                            int f9 = c0826c0.f(13);
                                            c0826c0.t();
                                            int f10 = c0826c0.f(13);
                                            c0826c0.t();
                                            c0826c0.t();
                                            C1649uH c1649uH = new C1649uH();
                                            c1649uH.f15839a = str;
                                            c1649uH.c("video/mp4v-es");
                                            c1649uH.f15855s = f9;
                                            c1649uH.f15856t = f10;
                                            c1649uH.f15859w = f;
                                            c1649uH.f15851o = Collections.singletonList(copyOf);
                                            interfaceC0737a0.e(new C1407p(c1649uH));
                                            this.f10113j = true;
                                        } else {
                                            f = f6 / f7;
                                            if (c0826c0.w()) {
                                            }
                                            if (c0826c0.f(2) != 0) {
                                            }
                                            c0826c0.t();
                                            int f82 = c0826c0.f(16);
                                            c0826c0.t();
                                            if (c0826c0.w()) {
                                            }
                                            c0826c0.t();
                                            int f92 = c0826c0.f(13);
                                            c0826c0.t();
                                            int f102 = c0826c0.f(13);
                                            c0826c0.t();
                                            c0826c0.t();
                                            C1649uH c1649uH2 = new C1649uH();
                                            c1649uH2.f15839a = str;
                                            c1649uH2.c("video/mp4v-es");
                                            c1649uH2.f15855s = f92;
                                            c1649uH2.f15856t = f102;
                                            c1649uH2.f15859w = f;
                                            c1649uH2.f15851o = Collections.singletonList(copyOf);
                                            interfaceC0737a0.e(new C1407p(c1649uH2));
                                            this.f10113j = true;
                                        }
                                    } else if (f5 < 7) {
                                        f = f10105l[f5];
                                        if (c0826c0.w()) {
                                        }
                                        if (c0826c0.f(2) != 0) {
                                        }
                                        c0826c0.t();
                                        int f822 = c0826c0.f(16);
                                        c0826c0.t();
                                        if (c0826c0.w()) {
                                        }
                                        c0826c0.t();
                                        int f922 = c0826c0.f(13);
                                        c0826c0.t();
                                        int f1022 = c0826c0.f(13);
                                        c0826c0.t();
                                        c0826c0.t();
                                        C1649uH c1649uH22 = new C1649uH();
                                        c1649uH22.f15839a = str;
                                        c1649uH22.c("video/mp4v-es");
                                        c1649uH22.f15855s = f922;
                                        c1649uH22.f15856t = f1022;
                                        c1649uH22.f15859w = f;
                                        c1649uH22.f15851o = Collections.singletonList(copyOf);
                                        interfaceC0737a0.e(new C1407p(c1649uH22));
                                        this.f10113j = true;
                                    } else {
                                        JB.l("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                        if (c0826c0.w()) {
                                        }
                                        if (c0826c0.f(2) != 0) {
                                        }
                                        c0826c0.t();
                                        int f8222 = c0826c0.f(16);
                                        c0826c0.t();
                                        if (c0826c0.w()) {
                                        }
                                        c0826c0.t();
                                        int f9222 = c0826c0.f(13);
                                        c0826c0.t();
                                        int f10222 = c0826c0.f(13);
                                        c0826c0.t();
                                        c0826c0.t();
                                        C1649uH c1649uH222 = new C1649uH();
                                        c1649uH222.f15839a = str;
                                        c1649uH222.c("video/mp4v-es");
                                        c1649uH222.f15855s = f9222;
                                        c1649uH222.f15856t = f10222;
                                        c1649uH222.f15859w = f;
                                        c1649uH222.f15851o = Collections.singletonList(copyOf);
                                        interfaceC0737a0.e(new C1407p(c1649uH222));
                                        this.f10113j = true;
                                    }
                                }
                            } else if ((b3 & 240) != 32) {
                                JB.l("H263Reader", "Unexpected start code value");
                                i22.f9516a = false;
                                i22.f9518c = 0;
                                i22.f9517b = 0;
                            } else {
                                i22.f9519d = i22.f9518c;
                                i22.f9517b = 4;
                            }
                        } else if (i9 > 31) {
                            JB.l("H263Reader", "Unexpected start code value");
                            i22.f9516a = false;
                            i22.f9518c = 0;
                            i22.f9517b = 0;
                        } else {
                            i22.f9517b = 3;
                        }
                    } else if (i9 != 181) {
                        JB.l("H263Reader", "Unexpected start code value");
                        i22.f9516a = false;
                        i22.f9518c = 0;
                        i22.f9517b = 0;
                    } else {
                        i22.f9517b = 2;
                    }
                } else {
                    i = i7;
                    if (i9 == 176) {
                        i22.f9517b = 1;
                        i22.f9516a = true;
                    }
                }
                c5 = 3;
                i22.a(I2.f, 0, 3);
                this.f.a(bArr, i6, e3);
                if (t22 != null) {
                    if (i10 > 0) {
                        t22.b(bArr, i6, e3);
                        i5 = 0;
                    } else {
                        i5 = -i10;
                    }
                    if (t22.e(i5)) {
                        int v4 = AbstractC1668us.v(t22.f11618d, (byte[]) t22.f11619e);
                        int i16 = AbstractC1260lo.f14419a;
                        byte[] bArr2 = (byte[]) t22.f11619e;
                        C1617tm c1617tm2 = this.f10107b;
                        c1617tm2.h(v4, bArr2);
                        this.f10106a.g(this.f10114k, c1617tm2);
                    }
                    if (i9 == 178) {
                        z5 = true;
                        if (c1617tm.f15724a[e3 + 2] == 1) {
                            t22.d(178);
                        }
                        i9 = 178;
                        int i17 = i - e3;
                        this.f.b(i17, this.f10111g - i17, this.f10113j);
                        J2 j22 = this.f;
                        long j5 = this.f10114k;
                        j22.f9678e = i9;
                        j22.f9677d = false;
                        if (i9 != 182) {
                            if (i9 == 179) {
                                i9 = 179;
                            } else {
                                z3 = false;
                                j22.f9675b = z3;
                                j22.f9676c = i9 != 182 ? z5 : false;
                                j22.f = 0;
                                j22.f9680h = j5;
                                i6 = i8;
                                i7 = i;
                            }
                        }
                        z3 = z5;
                        j22.f9675b = z3;
                        j22.f9676c = i9 != 182 ? z5 : false;
                        j22.f = 0;
                        j22.f9680h = j5;
                        i6 = i8;
                        i7 = i;
                    }
                }
                z5 = true;
                int i172 = i - e3;
                this.f.b(i172, this.f10111g - i172, this.f10113j);
                J2 j222 = this.f;
                long j52 = this.f10114k;
                j222.f9678e = i9;
                j222.f9677d = false;
                if (i9 != 182) {
                }
                z3 = z5;
                j222.f9675b = z3;
                j222.f9676c = i9 != 182 ? z5 : false;
                j222.f = 0;
                j222.f9680h = j52;
                i6 = i8;
                i7 = i;
            }
            c5 = 3;
            this.f.a(bArr, i6, e3);
            if (t22 != null) {
            }
            z5 = true;
            int i1722 = i - e3;
            this.f.b(i1722, this.f10111g - i1722, this.f10113j);
            J2 j2222 = this.f;
            long j522 = this.f10114k;
            j2222.f9678e = i9;
            j2222.f9677d = false;
            if (i9 != 182) {
            }
            z3 = z5;
            j2222.f9675b = z3;
            j2222.f9676c = i9 != 182 ? z5 : false;
            j2222.f = 0;
            j2222.f9680h = j522;
            i6 = i8;
            i7 = i;
        }
        if (!this.f10113j) {
            i22.a(bArr, i6, i7);
        }
        this.f.a(bArr, i6, i7);
        if (t22 != null) {
            t22.b(bArr, i6, i7);
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
        AbstractC1668us.F(this.f);
        if (z3) {
            this.f.b(0, this.f10111g, this.f10113j);
            J2 j22 = this.f;
            j22.f9675b = false;
            j22.f9676c = false;
            j22.f9677d = false;
            j22.f9678e = -1;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f10112h = c0829c3.f12966e;
        c0829c3.b();
        InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 2);
        this.i = w5;
        this.f = new J2(w5);
        this.f10106a.r(h3, c0829c3);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f10114k = j5;
    }
}
