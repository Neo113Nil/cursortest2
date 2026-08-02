package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class O {

    /* renamed from: a, reason: collision with root package name */
    public final List f10879a;

    /* renamed from: b, reason: collision with root package name */
    public final int f10880b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10881c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10882d;

    /* renamed from: e, reason: collision with root package name */
    public final int f10883e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f10884g;

    /* renamed from: h, reason: collision with root package name */
    public final int f10885h;
    public final float i;

    /* renamed from: j, reason: collision with root package name */
    public final int f10886j;

    /* renamed from: k, reason: collision with root package name */
    public final String f10887k;

    /* renamed from: l, reason: collision with root package name */
    public final C1071hd f10888l;

    public O(List list, int i, int i5, int i6, int i7, int i8, int i9, int i10, float f, int i11, String str, C1071hd c1071hd) {
        this.f10879a = list;
        this.f10880b = i;
        this.f10881c = i5;
        this.f10882d = i6;
        this.f10883e = i7;
        this.f = i8;
        this.f10884g = i9;
        this.f10885h = i10;
        this.i = f;
        this.f10886j = i11;
        this.f10887k = str;
        this.f10888l = c1071hd;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x024b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static O a(C1617tm c1617tm, boolean z3, C1071hd c1071hd) {
        boolean z5;
        boolean z6;
        int i;
        int i5;
        char c5;
        f2.m mVar;
        int i6;
        int i7 = 4;
        boolean z7 = true;
        if (z3) {
            try {
                c1617tm.k(4);
            } catch (ArrayIndexOutOfBoundsException e3) {
                e = e3;
                z6 = true;
                throw B7.a(e, "Error parsing".concat(z6 != z3 ? "HEVC config" : "L-HEVC config"));
            }
        } else {
            try {
                c1617tm.k(21);
            } catch (ArrayIndexOutOfBoundsException e5) {
                e = e5;
                z5 = z7;
                z6 = z5;
                throw B7.a(e, "Error parsing".concat(z6 != z3 ? "HEVC config" : "L-HEVC config"));
            }
        }
        int v4 = c1617tm.v() & 3;
        int v5 = c1617tm.v();
        int i8 = c1617tm.f15725b;
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < v5; i11++) {
            c1617tm.k(1);
            int z8 = c1617tm.z();
            for (int i12 = 0; i12 < z8; i12++) {
                int z9 = c1617tm.z();
                i10 += z9 + 4;
                c1617tm.k(z9);
            }
        }
        c1617tm.j(i8);
        byte[] bArr = new byte[i10];
        C1071hd c1071hd2 = c1071hd;
        int i13 = 0;
        float f = 1.0f;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        int i20 = -1;
        String str = null;
        int i21 = 0;
        while (i21 < v5) {
            int v6 = c1617tm.v() & 63;
            int z10 = c1617tm.z();
            z5 = z7;
            int i22 = i9;
            C1071hd c1071hd3 = c1071hd2;
            while (i22 < z10) {
                try {
                    int z11 = c1617tm.z();
                    int i23 = i22;
                    System.arraycopy(AbstractC1668us.f15916a, i9, bArr, i13, i7);
                    int i24 = i13 + 4;
                    System.arraycopy(c1617tm.f15724a, c1617tm.f15725b, bArr, i24, z11);
                    int i25 = 32;
                    if (v6 != 32) {
                        i25 = v6;
                    } else if (i23 == 0) {
                        c1071hd3 = AbstractC1668us.P(bArr, i24, i24 + z11);
                        i5 = i24;
                        i = v4;
                        c5 = '?';
                        i9 = 0;
                        i23 = 0;
                        i13 = i5 + z11;
                        c1617tm.k(z11);
                        v4 = i;
                        i22 = i23 + 1;
                        i7 = 4;
                    }
                    i = v4;
                    int i26 = 8;
                    if (i25 != 33) {
                        i5 = i24;
                        if (i25 == 39 && i23 == 0) {
                            int i27 = i13 + 6;
                            int i28 = (i5 + z11) - 1;
                            while (true) {
                                byte b3 = bArr[i28];
                                if (b3 != 0) {
                                    if (b3 != 0) {
                                        if (i28 > i27) {
                                            C0826c0 c0826c0 = new C0826c0(bArr, i27, i28 + 1);
                                            while (c0826c0.l(16)) {
                                                int b5 = c0826c0.b(i26);
                                                int i29 = 0;
                                                while (b5 == 255) {
                                                    i29 += 255;
                                                    b5 = c0826c0.b(i26);
                                                }
                                                int i30 = i29 + b5;
                                                int b6 = c0826c0.b(i26);
                                                int i31 = 0;
                                                while (b6 == 255) {
                                                    i31 += 255;
                                                    b6 = c0826c0.b(8);
                                                }
                                                int i32 = i31 + b6;
                                                if (i32 == 0) {
                                                    break;
                                                }
                                                if (c0826c0.l(i32)) {
                                                    if (i30 == 176) {
                                                        int o5 = c0826c0.o();
                                                        boolean n5 = c0826c0.n();
                                                        int o6 = n5 ? c0826c0.o() : 0;
                                                        int o7 = c0826c0.o();
                                                        int i33 = -1;
                                                        int i34 = 0;
                                                        while (i34 <= o7) {
                                                            int o8 = c0826c0.o();
                                                            c0826c0.o();
                                                            int i35 = i34;
                                                            int b7 = c0826c0.b(6);
                                                            c5 = '?';
                                                            if (b7 != 63) {
                                                                c0826c0.b(b7 == 0 ? Math.max(0, o5 - 30) : Math.max(0, (b7 + o5) - 31));
                                                                if (n5) {
                                                                    int b8 = c0826c0.b(6);
                                                                    if (b8 == 63) {
                                                                        c5 = '?';
                                                                    } else {
                                                                        c0826c0.b(b8 == 0 ? Math.max(0, o6 - 30) : Math.max(0, (b8 + o6) - 31));
                                                                    }
                                                                }
                                                                if (c0826c0.n()) {
                                                                    c0826c0.k(10);
                                                                }
                                                                i34 = i35 + 1;
                                                                i33 = o8;
                                                            }
                                                            mVar = null;
                                                            break;
                                                        }
                                                        c5 = '?';
                                                        mVar = new f2.m(i33, 6);
                                                    } else {
                                                        i26 = 8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    c5 = '?';
                                    mVar = null;
                                    break;
                                } else {
                                    if (i28 <= i27) {
                                        break;
                                    }
                                    i28--;
                                }
                            }
                            mVar = null;
                            c5 = '?';
                            if (mVar != null && c1071hd3 != null) {
                                i9 = 0;
                                i19 = mVar.f17003l == ((C0860cq) ((AbstractC1044gv) c1071hd3.f13761l).get(0)).f13048b ? 4 : 5;
                            }
                            i9 = 0;
                        }
                        c5 = '?';
                        i9 = 0;
                    } else if (i23 == 0) {
                        C1263lr L5 = AbstractC1668us.L(bArr, i24, i24 + z11, c1071hd3);
                        int i36 = L5.f14436b + 8;
                        int i37 = L5.f14437c + 8;
                        int i38 = L5.f14441h;
                        int i39 = L5.i;
                        i5 = i24;
                        int i40 = L5.f14442j;
                        float f5 = L5.f;
                        int i41 = L5.f14440g;
                        C1442pq c1442pq = L5.f14435a;
                        if (c1442pq != null) {
                            i6 = i41;
                            str = AbstractC1120ii.c(c1442pq.f15053a, c1442pq.f15054b, c1442pq.f15055c, c1442pq.f15056d, c1442pq.f15057e, c1442pq.f);
                        } else {
                            i6 = i41;
                        }
                        i18 = i40;
                        f = f5;
                        i20 = i6;
                        c5 = '?';
                        i16 = i38;
                        i15 = i37;
                        i17 = i39;
                        i14 = i36;
                        i9 = 0;
                    } else {
                        i5 = i24;
                        c5 = '?';
                        i9 = 0;
                    }
                    i13 = i5 + z11;
                    c1617tm.k(z11);
                    v4 = i;
                    i22 = i23 + 1;
                    i7 = 4;
                } catch (ArrayIndexOutOfBoundsException e6) {
                    e = e6;
                    z6 = z5;
                    throw B7.a(e, "Error parsing".concat(z6 != z3 ? "HEVC config" : "L-HEVC config"));
                }
            }
            i21++;
            c1071hd2 = c1071hd3;
            z7 = z5;
            i7 = 4;
        }
        z5 = z7;
        return new O(i10 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), v4 + 1, i14, i15, i16, i17, i18, i19, f, i20, str, c1071hd2);
    }
}
