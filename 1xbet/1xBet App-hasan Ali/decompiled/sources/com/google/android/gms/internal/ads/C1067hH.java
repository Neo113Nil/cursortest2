package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.hH, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1067hH extends AbstractC1022gH {

    /* renamed from: A, reason: collision with root package name */
    public final int f13741A;

    /* renamed from: B, reason: collision with root package name */
    public final int f13742B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f13743C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f13744D;

    /* renamed from: E, reason: collision with root package name */
    public final int f13745E;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f13746o;

    /* renamed from: p, reason: collision with root package name */
    public final C0843cH f13747p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f13748q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f13749r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f13750s;

    /* renamed from: t, reason: collision with root package name */
    public final int f13751t;

    /* renamed from: u, reason: collision with root package name */
    public final int f13752u;

    /* renamed from: v, reason: collision with root package name */
    public final int f13753v;

    /* renamed from: w, reason: collision with root package name */
    public final int f13754w;

    /* renamed from: x, reason: collision with root package name */
    public final int f13755x;

    /* renamed from: y, reason: collision with root package name */
    public final int f13756y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f13757z;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00ea A[EDGE_INSN: B:128:0x00ea->B:65:0x00ea BREAK  A[LOOP:1: B:57:0x00cf->B:126:0x00e7], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0099 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1067hH(int i, C1292mb c1292mb, int i5, C0843cH c0843cH, int i6, String str, boolean z3) {
        super(i, c1292mb, i5);
        boolean z5;
        boolean z6;
        int i7;
        C1761wv c1761wv;
        int i8;
        int i9;
        int i10;
        C1761wv c1761wv2;
        C1407p c1407p;
        String str2;
        int i11;
        char c5;
        boolean z7;
        int i12;
        C1407p c1407p2;
        int i13;
        int i14;
        float f;
        int i15;
        this.f13747p = c0843cH;
        int i16 = 1;
        int i17 = true != c0843cH.f12989m ? 16 : 24;
        if (z3) {
            C1407p c1407p3 = this.f13586n;
            int i18 = c1407p3.f14911t;
            float f5 = c1407p3.f14913v;
            if (f5 == -1.0f || f5 <= 2.1474836E9f) {
                z5 = true;
                this.f13746o = z5;
                if (z3 && (((i13 = (c1407p2 = this.f13586n).f14911t) == -1 || i13 >= 0) && ((i14 = c1407p2.f14912u) == -1 || i14 >= 0))) {
                    f = c1407p2.f14913v;
                    if ((f != -1.0f || f >= 0.0f) && ((i15 = c1407p2.i) == -1 || i15 >= 0)) {
                        z6 = true;
                        this.f13748q = z6;
                        this.f13749r = AbstractC1400ot.p(i6, false);
                        C1407p c1407p4 = this.f13586n;
                        float f6 = c1407p4.f14913v;
                        this.f13750s = f6 == -1.0f && f6 >= 10.0f;
                        this.f13751t = c1407p4.i;
                        int i19 = c1407p4.f14911t;
                        this.f13752u = (i19 != -1 || (i12 = c1407p4.f14912u) == -1) ? -1 : i19 * i12;
                        i7 = 0;
                        while (true) {
                            c1761wv = c0843cH.f16303d;
                            i8 = Integer.MAX_VALUE;
                            if (i7 < c1761wv.f16186n) {
                                i9 = 0;
                                i7 = Integer.MAX_VALUE;
                                break;
                            } else {
                                i9 = C1112iH.b(this.f13586n, (String) c1761wv.get(i7), false);
                                if (i9 > 0) {
                                    break;
                                } else {
                                    i7++;
                                }
                            }
                        }
                        this.f13754w = i7;
                        this.f13755x = i9;
                        int i20 = this.f13586n.f;
                        this.f13756y = (i20 == 0 && i20 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                        int i21 = this.f13586n.f;
                        this.f13757z = (i21 == 0 && (i21 & 1) == 0) ? false : true;
                        this.f13741A = C1112iH.b(this.f13586n, str, C1112iH.c(str) != null);
                        i10 = 0;
                        while (true) {
                            c1761wv2 = c0843cH.f16302c;
                            if (i10 < c1761wv2.f16186n) {
                                String str3 = this.f13586n.f14904m;
                                if (str3 != null && str3.equals(c1761wv2.get(i10))) {
                                    i8 = i10;
                                    break;
                                }
                                i10++;
                            } else {
                                break;
                            }
                        }
                        this.f13753v = i8;
                        this.f13743C = (i6 & 384) != 128;
                        this.f13744D = (i6 & 64) != 64;
                        c1407p = this.f13586n;
                        str2 = c1407p.f14904m;
                        if (str2 != null) {
                            i11 = 4;
                            switch (str2.hashCode()) {
                                case -1851077871:
                                    if (str2.equals("video/dolby-vision")) {
                                        c5 = 0;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -1662735862:
                                    if (str2.equals("video/av01")) {
                                        c5 = 1;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case -1662541442:
                                    if (str2.equals("video/hevc")) {
                                        c5 = 2;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 1331836730:
                                    if (str2.equals("video/avc")) {
                                        c5 = 4;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                case 1599127257:
                                    if (str2.equals("video/x-vnd.on2.vp9")) {
                                        c5 = 3;
                                        break;
                                    }
                                    c5 = 65535;
                                    break;
                                default:
                                    c5 = 65535;
                                    break;
                            }
                            if (c5 == 0) {
                                i11 = 5;
                            } else if (c5 != 1) {
                                if (c5 == 2) {
                                    i11 = 3;
                                } else if (c5 == 3) {
                                    i11 = 2;
                                } else if (c5 == 4) {
                                    i11 = 1;
                                }
                            }
                            this.f13745E = i11;
                            if ((c1407p.f & 16384) == 0) {
                                C0843cH c0843cH2 = this.f13747p;
                                if (AbstractC1400ot.p(i6, c0843cH2.f12993q) && ((z7 = this.f13746o) || c0843cH2.f12988l)) {
                                    if (AbstractC1400ot.p(i6, false) && this.f13748q && z7 && c1407p.i != -1 && (i17 & i6) != 0) {
                                        i16 = 2;
                                    }
                                    this.f13742B = i16;
                                }
                            }
                            i16 = 0;
                            this.f13742B = i16;
                        }
                        i11 = 0;
                        this.f13745E = i11;
                        if ((c1407p.f & 16384) == 0) {
                        }
                        i16 = 0;
                        this.f13742B = i16;
                    }
                }
                z6 = false;
                this.f13748q = z6;
                this.f13749r = AbstractC1400ot.p(i6, false);
                C1407p c1407p42 = this.f13586n;
                float f62 = c1407p42.f14913v;
                this.f13750s = f62 == -1.0f && f62 >= 10.0f;
                this.f13751t = c1407p42.i;
                int i192 = c1407p42.f14911t;
                this.f13752u = (i192 != -1 || (i12 = c1407p42.f14912u) == -1) ? -1 : i192 * i12;
                i7 = 0;
                while (true) {
                    c1761wv = c0843cH.f16303d;
                    i8 = Integer.MAX_VALUE;
                    if (i7 < c1761wv.f16186n) {
                    }
                    i7++;
                }
                this.f13754w = i7;
                this.f13755x = i9;
                int i202 = this.f13586n.f;
                this.f13756y = (i202 == 0 && i202 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
                int i212 = this.f13586n.f;
                this.f13757z = (i212 == 0 && (i212 & 1) == 0) ? false : true;
                this.f13741A = C1112iH.b(this.f13586n, str, C1112iH.c(str) != null);
                i10 = 0;
                while (true) {
                    c1761wv2 = c0843cH.f16302c;
                    if (i10 < c1761wv2.f16186n) {
                    }
                    i10++;
                }
                this.f13753v = i8;
                this.f13743C = (i6 & 384) != 128;
                this.f13744D = (i6 & 64) != 64;
                c1407p = this.f13586n;
                str2 = c1407p.f14904m;
                if (str2 != null) {
                }
                i11 = 0;
                this.f13745E = i11;
                if ((c1407p.f & 16384) == 0) {
                }
                i16 = 0;
                this.f13742B = i16;
            }
        }
        z5 = false;
        this.f13746o = z5;
        if (z3) {
            f = c1407p2.f14913v;
            if (f != -1.0f) {
            }
            z6 = true;
            this.f13748q = z6;
            this.f13749r = AbstractC1400ot.p(i6, false);
            C1407p c1407p422 = this.f13586n;
            float f622 = c1407p422.f14913v;
            this.f13750s = f622 == -1.0f && f622 >= 10.0f;
            this.f13751t = c1407p422.i;
            int i1922 = c1407p422.f14911t;
            this.f13752u = (i1922 != -1 || (i12 = c1407p422.f14912u) == -1) ? -1 : i1922 * i12;
            i7 = 0;
            while (true) {
                c1761wv = c0843cH.f16303d;
                i8 = Integer.MAX_VALUE;
                if (i7 < c1761wv.f16186n) {
                }
                i7++;
            }
            this.f13754w = i7;
            this.f13755x = i9;
            int i2022 = this.f13586n.f;
            this.f13756y = (i2022 == 0 && i2022 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
            int i2122 = this.f13586n.f;
            this.f13757z = (i2122 == 0 && (i2122 & 1) == 0) ? false : true;
            this.f13741A = C1112iH.b(this.f13586n, str, C1112iH.c(str) != null);
            i10 = 0;
            while (true) {
                c1761wv2 = c0843cH.f16302c;
                if (i10 < c1761wv2.f16186n) {
                }
                i10++;
            }
            this.f13753v = i8;
            this.f13743C = (i6 & 384) != 128;
            this.f13744D = (i6 & 64) != 64;
            c1407p = this.f13586n;
            str2 = c1407p.f14904m;
            if (str2 != null) {
            }
            i11 = 0;
            this.f13745E = i11;
            if ((c1407p.f & 16384) == 0) {
            }
            i16 = 0;
            this.f13742B = i16;
        }
        z6 = false;
        this.f13748q = z6;
        this.f13749r = AbstractC1400ot.p(i6, false);
        C1407p c1407p4222 = this.f13586n;
        float f6222 = c1407p4222.f14913v;
        this.f13750s = f6222 == -1.0f && f6222 >= 10.0f;
        this.f13751t = c1407p4222.i;
        int i19222 = c1407p4222.f14911t;
        this.f13752u = (i19222 != -1 || (i12 = c1407p4222.f14912u) == -1) ? -1 : i19222 * i12;
        i7 = 0;
        while (true) {
            c1761wv = c0843cH.f16303d;
            i8 = Integer.MAX_VALUE;
            if (i7 < c1761wv.f16186n) {
            }
            i7++;
        }
        this.f13754w = i7;
        this.f13755x = i9;
        int i20222 = this.f13586n.f;
        this.f13756y = (i20222 == 0 && i20222 == 0) ? Integer.MAX_VALUE : Integer.bitCount(0);
        int i21222 = this.f13586n.f;
        this.f13757z = (i21222 == 0 && (i21222 & 1) == 0) ? false : true;
        this.f13741A = C1112iH.b(this.f13586n, str, C1112iH.c(str) != null);
        i10 = 0;
        while (true) {
            c1761wv2 = c0843cH.f16302c;
            if (i10 < c1761wv2.f16186n) {
            }
            i10++;
        }
        this.f13753v = i8;
        this.f13743C = (i6 & 384) != 128;
        this.f13744D = (i6 & 64) != 64;
        c1407p = this.f13586n;
        str2 = c1407p.f14904m;
        if (str2 != null) {
        }
        i11 = 0;
        this.f13745E = i11;
        if ((c1407p.f & 16384) == 0) {
        }
        i16 = 0;
        this.f13742B = i16;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final int a() {
        return this.f13742B;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1022gH
    public final /* bridge */ /* synthetic */ boolean b(AbstractC1022gH abstractC1022gH) {
        C1067hH c1067hH = (C1067hH) abstractC1022gH;
        if (!Objects.equals(this.f13586n.f14904m, c1067hH.f13586n.f14904m)) {
            return false;
        }
        this.f13747p.getClass();
        return this.f13743C == c1067hH.f13743C && this.f13744D == c1067hH.f13744D;
    }
}
