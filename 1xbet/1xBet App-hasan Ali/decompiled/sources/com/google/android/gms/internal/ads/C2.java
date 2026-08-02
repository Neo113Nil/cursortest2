package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collections;

/* loaded from: classes.dex */
public final class C2 implements F2 {

    /* renamed from: w, reason: collision with root package name */
    public static final byte[] f7942w = {73, 68, 51};

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7943a;

    /* renamed from: d, reason: collision with root package name */
    public final String f7946d;

    /* renamed from: e, reason: collision with root package name */
    public final int f7947e;
    public String f;

    /* renamed from: g, reason: collision with root package name */
    public InterfaceC0737a0 f7948g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0737a0 f7949h;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7952l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f7953m;

    /* renamed from: p, reason: collision with root package name */
    public int f7956p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f7957q;

    /* renamed from: s, reason: collision with root package name */
    public int f7959s;

    /* renamed from: u, reason: collision with root package name */
    public InterfaceC0737a0 f7961u;

    /* renamed from: v, reason: collision with root package name */
    public long f7962v;

    /* renamed from: b, reason: collision with root package name */
    public final C0826c0 f7944b = new C0826c0(7, new byte[7]);

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f7945c = new C1617tm(Arrays.copyOf(f7942w, 10));
    public int i = 0;

    /* renamed from: j, reason: collision with root package name */
    public int f7950j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f7951k = 256;

    /* renamed from: n, reason: collision with root package name */
    public int f7954n = -1;

    /* renamed from: o, reason: collision with root package name */
    public int f7955o = -1;

    /* renamed from: r, reason: collision with root package name */
    public long f7958r = -9223372036854775807L;

    /* renamed from: t, reason: collision with root package name */
    public long f7960t = -9223372036854775807L;

    public C2(int i, String str, boolean z3) {
        this.f7943a = z3;
        this.f7946d = str;
        this.f7947e = i;
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f7960t = -9223372036854775807L;
        this.f7953m = false;
        this.i = 0;
        this.f7950j = 0;
        this.f7951k = 256;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0217, code lost:
    
        r2 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0302, code lost:
    
        r4 = r3;
        r3 = r2;
        r2 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r23v0, types: [com.google.android.gms.internal.ads.tm] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v40 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        boolean z3;
        int i;
        int i5;
        int i6;
        byte b3;
        int i7;
        int i8;
        int i9;
        char c5;
        int i10;
        boolean z5;
        int i11;
        int i12;
        int i13;
        ?? r22 = 0;
        int i14 = -1;
        int i15 = 2;
        ?? r5 = 1;
        this.f7948g.getClass();
        int i16 = AbstractC1260lo.f14419a;
        while (c1617tm.o() > 0) {
            int i17 = this.i;
            C0826c0 c0826c0 = this.f7944b;
            int i18 = 3;
            int i19 = 4;
            C1617tm c1617tm2 = this.f7945c;
            if (i17 == 0) {
                int i20 = 7;
                byte[] bArr = c1617tm.f15724a;
                int i21 = c1617tm.f15725b;
                int i22 = c1617tm.f15726c;
                while (true) {
                    if (i21 >= i22) {
                        z3 = r22;
                        i = i14;
                        i5 = i15;
                        boolean z6 = r5 == true ? 1 : 0;
                        c1617tm.j(i21);
                        r5 = r5;
                        break;
                    }
                    i6 = i21 + 1;
                    b3 = bArr[i21];
                    i7 = i18;
                    int i23 = b3 & 255;
                    if (this.f7951k != 512 || (((((byte) i23) & 255) | 65280) & 65526) != 65520) {
                        i = i14;
                        i8 = r5 == true ? 1 : 0;
                    } else {
                        if (this.f7953m) {
                            i = i14;
                            i12 = r5 == true ? 1 : 0;
                            break;
                        }
                        int i24 = i21 - 1;
                        c1617tm.j(i21);
                        byte[] bArr2 = c0826c0.f12943b;
                        if (c1617tm.o() < r5) {
                            i8 = r5 == true ? 1 : 0;
                        } else {
                            c1617tm.f(bArr2, r22, r5 == true ? 1 : 0);
                            c0826c0.s(i19);
                            int f = c0826c0.f(r5 == true ? 1 : 0);
                            int i25 = this.f7954n;
                            if (i25 == -1 || f == i25) {
                                if (this.f7955o != -1) {
                                    byte[] bArr3 = c0826c0.f12943b;
                                    if (c1617tm.o() < r5) {
                                        i12 = r5 == true ? 1 : 0;
                                        break;
                                    }
                                    c1617tm.f(bArr3, r22, r5 == true ? 1 : 0);
                                    c0826c0.s(2);
                                    i13 = 4;
                                    int f5 = c0826c0.f(4);
                                    i12 = r5 == true ? 1 : 0;
                                    if (f5 == this.f7955o) {
                                        c1617tm.j(i6);
                                    } else {
                                        i8 = i12;
                                    }
                                } else {
                                    i12 = r5 == true ? 1 : 0;
                                    i13 = 4;
                                }
                                byte[] bArr4 = c0826c0.f12943b;
                                if (c1617tm.o() < i13) {
                                    break;
                                }
                                c1617tm.f(bArr4, r22, i13);
                                c0826c0.s(14);
                                int f6 = c0826c0.f(13);
                                if (f6 >= i20) {
                                    byte[] bArr5 = c1617tm.f15724a;
                                    int i26 = c1617tm.f15726c;
                                    int i27 = i24 + f6;
                                    if (i27 >= i26) {
                                        break;
                                    }
                                    byte b5 = bArr5[i27];
                                    i = -1;
                                    if (b5 != -1) {
                                        if (b5 == 73) {
                                            int i28 = i27 + 1;
                                            if (i28 == i26) {
                                                break;
                                            }
                                            if (bArr5[i28] == 68) {
                                                int i29 = i27 + 2;
                                                if (i29 == i26) {
                                                    break;
                                                } else if (bArr5[i29] == 51) {
                                                    break;
                                                }
                                            }
                                        }
                                    } else {
                                        int i30 = i27 + 1;
                                        if (i30 == i26) {
                                            break;
                                        }
                                        byte b6 = bArr5[i30];
                                        if ((((b6 & 255) | 65280) & 65526) == 65520 && ((b6 & 8) >> 3) == f) {
                                            break;
                                        }
                                    }
                                } else {
                                    i = -1;
                                }
                                i8 = i12;
                            } else {
                                i8 = r5 == true ? 1 : 0;
                                i = -1;
                            }
                        }
                        i = -1;
                    }
                    int i31 = this.f7951k;
                    int i32 = i31 | i23;
                    if (i32 == 329) {
                        i9 = 2;
                        c5 = 256;
                        i10 = 3;
                        z5 = false;
                        i11 = 768;
                    } else if (i32 == 511) {
                        i9 = 2;
                        c5 = 256;
                        i10 = 3;
                        z5 = false;
                        i11 = 512;
                    } else if (i32 == 836) {
                        i9 = 2;
                        c5 = 256;
                        i10 = 3;
                        z5 = false;
                        i11 = 1024;
                    } else {
                        if (i32 == 1075) {
                            i5 = 2;
                            this.i = 2;
                            this.f7950j = 3;
                            z3 = false;
                            this.f7959s = 0;
                            c1617tm2.j(0);
                            c1617tm.j(i6);
                            r5 = i8;
                            break;
                        }
                        c5 = 256;
                        if (i31 != 256) {
                            this.f7951k = 256;
                            i14 = i;
                            r22 = 0;
                            i18 = 3;
                            i19 = 4;
                            i20 = 7;
                            r5 = i8;
                            i15 = 2;
                        } else {
                            i9 = 2;
                            i10 = 3;
                            z5 = false;
                            int i33 = i9;
                            i14 = i;
                            r22 = z5;
                            i18 = i10;
                            r5 = i8;
                            i15 = i33;
                            i21 = i6;
                            i19 = 4;
                            i20 = 7;
                        }
                    }
                    this.f7951k = i11;
                    int i332 = i9;
                    i14 = i;
                    r22 = z5;
                    i18 = i10;
                    r5 = i8;
                    i15 = i332;
                    i21 = i6;
                    i19 = 4;
                    i20 = 7;
                }
                this.f7956p = (b3 & 8) >> 3;
                int i34 = i12;
                this.f7952l = i34 != ((b3 & 1) ^ 1) ? 0 : i34;
                if (this.f7953m) {
                    this.i = i7;
                    this.f7950j = 0;
                } else {
                    this.i = i34;
                    this.f7950j = 0;
                }
                c1617tm.j(i6);
                i14 = i;
                r5 = i34;
                r22 = 0;
                i15 = 2;
            } else if (i17 != r5) {
                if (i17 == i15) {
                    byte[] bArr6 = c1617tm2.f15724a;
                    int min = Math.min(c1617tm.o(), 10 - this.f7950j);
                    c1617tm.f(bArr6, this.f7950j, min);
                    int i35 = this.f7950j + min;
                    this.f7950j = i35;
                    if (i35 == 10) {
                        this.f7949h.c(10, c1617tm2);
                        c1617tm2.j(6);
                        InterfaceC0737a0 interfaceC0737a0 = this.f7949h;
                        int u5 = c1617tm2.u() + 10;
                        this.i = 4;
                        this.f7950j = 10;
                        this.f7961u = interfaceC0737a0;
                        this.f7962v = 0L;
                        this.f7959s = u5;
                    }
                } else if (i17 != 3) {
                    int min2 = Math.min(c1617tm.o(), this.f7959s - this.f7950j);
                    this.f7961u.c(min2, c1617tm);
                    int i36 = this.f7950j + min2;
                    this.f7950j = i36;
                    if (i36 == this.f7959s) {
                        AbstractC1668us.a0(this.f7960t != -9223372036854775807L ? r5 == true ? 1 : 0 : r22 == true ? 1 : 0);
                        this.f7961u.d(this.f7960t, 1, this.f7959s, 0, null);
                        this.f7960t += this.f7962v;
                        this.i = r22 == true ? 1 : 0;
                        this.f7950j = r22 == true ? 1 : 0;
                        this.f7951k = 256;
                    }
                } else {
                    int i37 = r5 != this.f7952l ? 5 : 7;
                    byte[] bArr7 = c0826c0.f12943b;
                    int min3 = Math.min(c1617tm.o(), i37 - this.f7950j);
                    c1617tm.f(bArr7, this.f7950j, min3);
                    int i38 = this.f7950j + min3;
                    this.f7950j = i38;
                    if (i38 == i37) {
                        c0826c0.s(r22 == true ? 1 : 0);
                        if (this.f7957q) {
                            c0826c0.u(10);
                        } else {
                            int f7 = c0826c0.f(i15) + (r5 == true ? 1 : 0);
                            if (f7 != i15) {
                                JB.l("AdtsReader", "Detected audio object type: " + f7 + ", but assuming AAC LC.");
                            }
                            c0826c0.u(5);
                            int f8 = c0826c0.f(3);
                            int i39 = this.f7955o;
                            byte b7 = (byte) (((i39 >> 1) & 7) | 16);
                            byte b8 = (byte) (((f8 << 3) & 120) | ((i39 << 7) & 128));
                            byte[] bArr8 = new byte[i15];
                            bArr8[r22 == true ? 1 : 0] = b7;
                            bArr8[r5 == true ? 1 : 0] = b8;
                            C1541s c6 = AbstractC1561sb.c(new C0826c0(i15, bArr8), r22);
                            C1649uH c1649uH = new C1649uH();
                            c1649uH.f15839a = this.f;
                            c1649uH.c("audio/mp4a-latm");
                            c1649uH.i = c6.f15399a;
                            c1649uH.f15831A = c6.f15401c;
                            c1649uH.f15832B = c6.f15400b;
                            c1649uH.f15851o = Collections.singletonList(bArr8);
                            c1649uH.f15842d = this.f7946d;
                            c1649uH.f = this.f7947e;
                            C1407p c1407p = new C1407p(c1649uH);
                            this.f7958r = 1024000000 / c1407p.f14887C;
                            this.f7948g.e(c1407p);
                            this.f7957q = r5;
                        }
                        c0826c0.u(4);
                        int f9 = c0826c0.f(13);
                        int i40 = f9 - 7;
                        if (this.f7952l) {
                            i40 = f9 - 9;
                        }
                        InterfaceC0737a0 interfaceC0737a02 = this.f7948g;
                        long j5 = this.f7958r;
                        this.i = 4;
                        this.f7950j = r22 == true ? 1 : 0;
                        this.f7961u = interfaceC0737a02;
                        this.f7962v = j5;
                        this.f7959s = i40;
                    }
                }
            } else if (c1617tm.o() != 0) {
                c0826c0.f12943b[r22 == true ? 1 : 0] = c1617tm.f15724a[c1617tm.f15725b];
                c0826c0.s(i15);
                int f10 = c0826c0.f(4);
                int i41 = this.f7955o;
                if (i41 == i14 || f10 == i41) {
                    if (!this.f7953m) {
                        this.f7953m = r5;
                        this.f7954n = this.f7956p;
                        this.f7955o = f10;
                    }
                    this.i = 3;
                    this.f7950j = r22 == true ? 1 : 0;
                } else {
                    this.f7953m = r22;
                    this.i = r22 == true ? 1 : 0;
                    this.f7950j = r22 == true ? 1 : 0;
                    this.f7951k = 256;
                }
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
        this.f = c0829c3.f12966e;
        c0829c3.b();
        InterfaceC0737a0 w5 = h3.w(c0829c3.f12965d, 1);
        this.f7948g = w5;
        this.f7961u = w5;
        if (!this.f7943a) {
            this.f7949h = new E();
            return;
        }
        c0829c3.a();
        c0829c3.b();
        InterfaceC0737a0 w6 = h3.w(c0829c3.f12965d, 5);
        this.f7949h = w6;
        C1649uH c1649uH = new C1649uH();
        c0829c3.b();
        c1649uH.f15839a = c0829c3.f12966e;
        c1649uH.c("application/id3");
        w6.e(new C1407p(c1649uH));
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f7960t = j5;
    }
}
