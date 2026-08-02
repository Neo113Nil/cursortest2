package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class K1 extends J1 {

    /* renamed from: n, reason: collision with root package name */
    public C1245lH f10100n;

    /* renamed from: o, reason: collision with root package name */
    public int f10101o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10102p;

    /* renamed from: q, reason: collision with root package name */
    public S f10103q;

    /* renamed from: r, reason: collision with root package name */
    public C1529ro f10104r;

    @Override // com.google.android.gms.internal.ads.J1
    public final long a(C1617tm c1617tm) {
        byte b3 = c1617tm.f15724a[0];
        if ((b3 & 1) == 1) {
            return -1L;
        }
        C1245lH c1245lH = this.f10100n;
        AbstractC1668us.F(c1245lH);
        boolean z3 = ((H2.j[]) c1245lH.f14380o)[(b3 >> 1) & (255 >>> (8 - c1245lH.f14376k))].f2300l;
        S s2 = (S) c1245lH.f14377l;
        int i = !z3 ? s2.f11478e : s2.f;
        int i5 = this.f10102p ? (this.f10101o + i) / 4 : 0;
        byte[] bArr = c1617tm.f15724a;
        int length = bArr.length;
        int i6 = c1617tm.f15726c + 4;
        if (length < i6) {
            byte[] copyOf = Arrays.copyOf(bArr, i6);
            c1617tm.h(copyOf.length, copyOf);
        } else {
            c1617tm.i(i6);
        }
        long j5 = i5;
        byte[] bArr2 = c1617tm.f15724a;
        int i7 = c1617tm.f15726c;
        bArr2[i7 - 4] = (byte) (j5 & 255);
        bArr2[i7 - 3] = (byte) ((j5 >>> 8) & 255);
        bArr2[i7 - 2] = (byte) ((j5 >>> 16) & 255);
        bArr2[i7 - 1] = (byte) ((j5 >>> 24) & 255);
        this.f10102p = true;
        this.f10101o = i;
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void b(boolean z3) {
        super.b(z3);
        if (z3) {
            this.f10100n = null;
            this.f10103q = null;
            this.f10104r = null;
        }
        this.f10101o = 0;
        this.f10102p = false;
    }

    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    @Override // com.google.android.gms.internal.ads.J1
    public final boolean c(C1617tm c1617tm, long j5, C0709Wb c0709Wb) {
        C1245lH c1245lH;
        S s2;
        int i;
        int i5;
        S s5;
        long j6;
        if (this.f10100n != null) {
            ((C1407p) c0709Wb.f12040l).getClass();
            return false;
        }
        S s6 = this.f10103q;
        int i6 = 1;
        int i7 = 4;
        if (s6 == null) {
            AbstractC1668us.T(1, c1617tm, false);
            c1617tm.s();
            int v4 = c1617tm.v();
            int s7 = c1617tm.s();
            int r5 = c1617tm.r();
            if (r5 <= 0) {
                r5 = -1;
            }
            int r6 = c1617tm.r();
            int i8 = r6 <= 0 ? -1 : r6;
            c1617tm.r();
            int v5 = c1617tm.v();
            int pow = (int) Math.pow(2.0d, v5 & 15);
            int pow2 = (int) Math.pow(2.0d, (v5 & 240) >> 4);
            c1617tm.v();
            ?? copyOf = Arrays.copyOf(c1617tm.f15724a, c1617tm.f15726c);
            S s8 = new S();
            s8.f11474a = v4;
            s8.f11475b = s7;
            s8.f11476c = r5;
            s8.f11477d = i8;
            s8.f11478e = pow;
            s8.f = pow2;
            s8.f11479g = copyOf;
            this.f10103q = s8;
        } else {
            C1529ro c1529ro = this.f10104r;
            if (c1529ro == null) {
                this.f10104r = AbstractC1668us.K(c1617tm, true, true);
            } else {
                int i9 = c1617tm.f15726c;
                byte[] bArr = new byte[i9];
                System.arraycopy(c1617tm.f15724a, 0, bArr, 0, i9);
                int i10 = 5;
                AbstractC1668us.T(5, c1617tm, false);
                int v6 = c1617tm.v() + 1;
                C0826c0 c0826c0 = new C0826c0(c1617tm.f15724a);
                int i11 = 8;
                c0826c0.e(c1617tm.f15725b * 8);
                int i12 = 0;
                while (true) {
                    int i13 = 2;
                    int i14 = 16;
                    if (i12 < v6) {
                        int i15 = i11;
                        if (c0826c0.d(24) != 5653314) {
                            throw B7.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c0826c0.f12945d * 8) + c0826c0.f12946e));
                        }
                        int d5 = c0826c0.d(16);
                        int d6 = c0826c0.d(24);
                        if (c0826c0.g()) {
                            c0826c0.e(5);
                            for (int i16 = 0; i16 < d6; i16 += c0826c0.d(AbstractC1668us.b(d6 - i16))) {
                            }
                        } else {
                            boolean g5 = c0826c0.g();
                            for (int i17 = 0; i17 < d6; i17++) {
                                if (!g5) {
                                    c0826c0.e(5);
                                } else if (c0826c0.g()) {
                                    c0826c0.e(5);
                                }
                            }
                        }
                        int d7 = c0826c0.d(i7);
                        if (d7 > 2) {
                            throw B7.a(null, "lookup type greater than 2 not decodable: " + d7);
                        }
                        if (d7 == 1) {
                            i13 = d7;
                        } else if (d7 != 2) {
                            s5 = s6;
                            i12++;
                            i11 = i15;
                            s6 = s5;
                            i7 = 4;
                        }
                        c0826c0.e(32);
                        c0826c0.e(32);
                        int d8 = c0826c0.d(i7) + 1;
                        c0826c0.e(1);
                        if (i13 != 1) {
                            s5 = s6;
                            j6 = d5 * d6;
                        } else if (d5 != 0) {
                            s5 = s6;
                            j6 = (long) Math.floor(Math.pow(d6, 1.0d / d5));
                        } else {
                            s5 = s6;
                            j6 = 0;
                        }
                        c0826c0.e((int) (j6 * d8));
                        i12++;
                        i11 = i15;
                        s6 = s5;
                        i7 = 4;
                    } else {
                        S s9 = s6;
                        int i18 = i11;
                        int i19 = 6;
                        int d9 = c0826c0.d(6) + 1;
                        for (int i20 = 0; i20 < d9; i20++) {
                            if (c0826c0.d(16) != 0) {
                                throw B7.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int d10 = c0826c0.d(6) + 1;
                        int i21 = 0;
                        while (true) {
                            int i22 = 3;
                            if (i21 < d10) {
                                int d11 = c0826c0.d(i14);
                                if (d11 == 0) {
                                    int i23 = i18;
                                    i = i6;
                                    c0826c0.e(i23);
                                    c0826c0.e(16);
                                    c0826c0.e(16);
                                    c0826c0.e(6);
                                    c0826c0.e(i23);
                                    int d12 = c0826c0.d(4) + 1;
                                    int i24 = 0;
                                    while (i24 < d12) {
                                        c0826c0.e(i23);
                                        i24++;
                                        i23 = 8;
                                    }
                                } else {
                                    if (d11 != i6) {
                                        throw B7.a(null, "floor type greater than 1 not decodable: " + d11);
                                    }
                                    int d13 = c0826c0.d(i10);
                                    int[] iArr = new int[d13];
                                    i = i6;
                                    int i25 = -1;
                                    for (int i26 = 0; i26 < d13; i26++) {
                                        int d14 = c0826c0.d(4);
                                        iArr[i26] = d14;
                                        if (d14 > i25) {
                                            i25 = d14;
                                        }
                                    }
                                    int i27 = i25 + 1;
                                    int[] iArr2 = new int[i27];
                                    int i28 = 0;
                                    while (i28 < i27) {
                                        iArr2[i28] = c0826c0.d(i22) + 1;
                                        int d15 = c0826c0.d(i13);
                                        if (d15 > 0) {
                                            i5 = i18;
                                            c0826c0.e(i5);
                                        } else {
                                            i5 = i18;
                                        }
                                        int i29 = 0;
                                        while (i29 < (i << d15)) {
                                            c0826c0.e(i5);
                                            i29++;
                                            i5 = 8;
                                        }
                                        i28++;
                                        i18 = 8;
                                        i13 = 2;
                                        i22 = 3;
                                    }
                                    c0826c0.e(i13);
                                    int d16 = c0826c0.d(4);
                                    int i30 = 0;
                                    int i31 = 0;
                                    for (int i32 = 0; i32 < d13; i32++) {
                                        i30 += iArr2[iArr[i32]];
                                        while (i31 < i30) {
                                            c0826c0.e(d16);
                                            i31++;
                                        }
                                    }
                                }
                                i21++;
                                i6 = i;
                                i18 = 8;
                                i19 = 6;
                                i13 = 2;
                                i14 = 16;
                                i10 = 5;
                            } else {
                                int i33 = i6;
                                int d17 = c0826c0.d(i19) + 1;
                                int i34 = 0;
                                while (i34 < d17) {
                                    if (c0826c0.d(16) > 2) {
                                        throw B7.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c0826c0.e(24);
                                    c0826c0.e(24);
                                    c0826c0.e(24);
                                    int d18 = c0826c0.d(i19) + 1;
                                    int i35 = 8;
                                    c0826c0.e(8);
                                    int[] iArr3 = new int[d18];
                                    for (int i36 = 0; i36 < d18; i36++) {
                                        iArr3[i36] = ((c0826c0.g() ? c0826c0.d(5) : 0) * 8) + c0826c0.d(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < d18) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr3[i37] & (i33 << i38)) != 0) {
                                                c0826c0.e(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i19 = 6;
                                }
                                int d19 = c0826c0.d(i19) + 1;
                                int i39 = 0;
                                while (i39 < d19) {
                                    int d20 = c0826c0.d(16);
                                    if (d20 != 0) {
                                        JB.f("VorbisUtil", "mapping type other than 0 not supported: " + d20);
                                        s2 = s9;
                                    } else {
                                        int d21 = c0826c0.g() ? c0826c0.d(4) + 1 : i33;
                                        boolean g6 = c0826c0.g();
                                        s2 = s9;
                                        int i40 = s2.f11474a;
                                        if (g6) {
                                            int d22 = c0826c0.d(8) + 1;
                                            for (int i41 = 0; i41 < d22; i41++) {
                                                int i42 = i40 - 1;
                                                c0826c0.e(AbstractC1668us.b(i42));
                                                c0826c0.e(AbstractC1668us.b(i42));
                                            }
                                        }
                                        if (c0826c0.d(2) != 0) {
                                            throw B7.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (d21 > i33) {
                                            for (int i43 = 0; i43 < i40; i43++) {
                                                c0826c0.e(4);
                                            }
                                        }
                                        for (int i44 = 0; i44 < d21; i44++) {
                                            c0826c0.e(8);
                                            c0826c0.e(8);
                                            c0826c0.e(8);
                                        }
                                    }
                                    i39++;
                                    s9 = s2;
                                    i33 = 1;
                                }
                                S s10 = s9;
                                int d23 = c0826c0.d(6);
                                int i45 = d23 + 1;
                                H2.j[] jVarArr = new H2.j[i45];
                                for (int i46 = 0; i46 < i45; i46++) {
                                    boolean g7 = c0826c0.g();
                                    c0826c0.d(16);
                                    c0826c0.d(16);
                                    c0826c0.d(8);
                                    jVarArr[i46] = new H2.j(1, g7);
                                }
                                if (!c0826c0.g()) {
                                    throw B7.a(null, "framing bit after modes not set as expected");
                                }
                                c1245lH = new C1245lH(s10, c1529ro, bArr, jVarArr, AbstractC1668us.b(d23));
                            }
                        }
                    }
                }
            }
        }
        c1245lH = null;
        this.f10100n = c1245lH;
        if (c1245lH == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        S s11 = (S) c1245lH.f14377l;
        arrayList.add((byte[]) s11.f11479g);
        arrayList.add((byte[]) c1245lH.f14379n);
        C5 A3 = AbstractC1668us.A(AbstractC1044gv.m((String[]) ((C1529ro) c1245lH.f14378m).f15382l));
        C1649uH c1649uH = new C1649uH();
        c1649uH.c("audio/vorbis");
        c1649uH.f15844g = s11.f11477d;
        c1649uH.f15845h = s11.f11476c;
        c1649uH.f15831A = s11.f11474a;
        c1649uH.f15832B = s11.f11475b;
        c1649uH.f15851o = arrayList;
        c1649uH.f15846j = A3;
        c0709Wb.f12040l = new C1407p(c1649uH);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.J1
    public final void d(long j5) {
        this.f9668g = j5;
        this.f10102p = j5 != 0;
        S s2 = this.f10103q;
        this.f10101o = s2 != null ? s2.f11478e : 0;
    }
}
