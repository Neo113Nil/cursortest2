package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class R2 implements F2 {

    /* renamed from: e, reason: collision with root package name */
    public String f11312e;
    public InterfaceC0737a0 f;
    public boolean i;

    /* renamed from: k, reason: collision with root package name */
    public int f11316k;

    /* renamed from: l, reason: collision with root package name */
    public int f11317l;

    /* renamed from: n, reason: collision with root package name */
    public int f11319n;

    /* renamed from: o, reason: collision with root package name */
    public int f11320o;

    /* renamed from: s, reason: collision with root package name */
    public int f11324s;

    /* renamed from: u, reason: collision with root package name */
    public boolean f11326u;

    /* renamed from: d, reason: collision with root package name */
    public int f11311d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final C1617tm f11308a = new C1617tm(2, new byte[15]);

    /* renamed from: b, reason: collision with root package name */
    public final C0826c0 f11309b = new C0826c0();

    /* renamed from: c, reason: collision with root package name */
    public final C1617tm f11310c = new C1617tm();

    /* renamed from: p, reason: collision with root package name */
    public final S2 f11321p = new S2();

    /* renamed from: q, reason: collision with root package name */
    public int f11322q = -2147483647;

    /* renamed from: r, reason: collision with root package name */
    public int f11323r = -1;

    /* renamed from: t, reason: collision with root package name */
    public long f11325t = -1;

    /* renamed from: j, reason: collision with root package name */
    public boolean f11315j = true;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11318m = true;

    /* renamed from: g, reason: collision with root package name */
    public double f11313g = -9.223372036854776E18d;

    /* renamed from: h, reason: collision with root package name */
    public double f11314h = -9.223372036854776E18d;

    @Override // com.google.android.gms.internal.ads.F2
    public final void b() {
        this.f11311d = 0;
        this.f11317l = 0;
        this.f11308a.g(2);
        this.f11319n = 0;
        this.f11320o = 0;
        this.f11322q = -2147483647;
        this.f11323r = -1;
        this.f11324s = 0;
        this.f11325t = -1L;
        this.f11326u = false;
        this.i = false;
        this.f11318m = true;
        this.f11315j = true;
        this.f11313g = -9.223372036854776E18d;
        this.f11314h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0427  */
    @Override // com.google.android.gms.internal.ads.F2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C1617tm c1617tm) {
        int i;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        byte[] bArr;
        long j5;
        long j6;
        int i10;
        int i11;
        int i12;
        long j7;
        int i13;
        int i14 = 4;
        int i15 = 8;
        int i16 = 1;
        AbstractC1668us.F(this.f);
        while (c1617tm.o() > 0) {
            int i17 = this.f11311d;
            if (i17 != 0) {
                C1617tm c1617tm2 = this.f11310c;
                S2 s2 = this.f11321p;
                if (i17 != i16) {
                    int i18 = s2.f11487a;
                    if (i18 == i16 || i18 == 17) {
                        int i19 = c1617tm.f15725b;
                        int min = Math.min(c1617tm.o(), c1617tm2.o());
                        c1617tm.f(c1617tm2.f15724a, c1617tm2.f15725b, min);
                        c1617tm2.k(min);
                        c1617tm.j(i19);
                    }
                    int min2 = Math.min(c1617tm.o(), s2.f11489c - this.f11319n);
                    this.f.c(min2, c1617tm);
                    int i20 = this.f11319n + min2;
                    this.f11319n = i20;
                    if (i20 != s2.f11489c) {
                        continue;
                    } else {
                        int i21 = s2.f11487a;
                        if (i21 == i16) {
                            byte[] bArr2 = c1617tm2.f15724a;
                            C0826c0 c0826c0 = new C0826c0(bArr2.length, bArr2);
                            int f = c0826c0.f(i15);
                            int f5 = c0826c0.f(5);
                            if (f5 != 31) {
                                switch (f5) {
                                    case 0:
                                        i7 = 96000;
                                        break;
                                    case 1:
                                        i7 = 88200;
                                        break;
                                    case 2:
                                        i7 = 64000;
                                        break;
                                    case 3:
                                        i7 = 48000;
                                        break;
                                    case 4:
                                        i7 = 44100;
                                        break;
                                    case 5:
                                        i7 = 32000;
                                        break;
                                    case 6:
                                        i7 = 24000;
                                        break;
                                    case 7:
                                        i7 = 22050;
                                        break;
                                    case 8:
                                        i7 = 16000;
                                        break;
                                    case 9:
                                        i7 = 12000;
                                        break;
                                    case 10:
                                        i7 = 11025;
                                        break;
                                    case 11:
                                        i7 = 8000;
                                        break;
                                    case 12:
                                        i7 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw B7.b("Unsupported sampling rate index " + f5);
                                    case 15:
                                        i7 = 57600;
                                        break;
                                    case 16:
                                        i7 = 51200;
                                        break;
                                    case 17:
                                        i7 = 40000;
                                        break;
                                    case 18:
                                        i7 = 38400;
                                        break;
                                    case 19:
                                        i7 = 34150;
                                        break;
                                    case 20:
                                        i7 = 28800;
                                        break;
                                    case C1639u7.zzm /* 21 */:
                                        i7 = 25600;
                                        break;
                                    case 22:
                                        i7 = 20000;
                                        break;
                                    case 23:
                                        i7 = 19200;
                                        break;
                                    case 24:
                                        i7 = 17075;
                                        break;
                                    case 25:
                                        i7 = 14400;
                                        break;
                                    case 26:
                                        i7 = 12800;
                                        break;
                                    case 27:
                                        i7 = 9600;
                                        break;
                                }
                            } else {
                                i7 = c0826c0.f(24);
                            }
                            int f6 = c0826c0.f(3);
                            if (f6 == 0) {
                                i8 = 768;
                            } else if (f6 == i16) {
                                i8 = 1024;
                            } else if (f6 == 2 || f6 == 3) {
                                i8 = 2048;
                            } else {
                                if (f6 != i14) {
                                    throw B7.b("Unsupported coreSbrFrameLengthIndex " + f6);
                                }
                                i8 = 4096;
                            }
                            int i22 = i8;
                            if (f6 == 0 || f6 == i16) {
                                i9 = 0;
                            } else if (f6 == 2) {
                                i9 = 2;
                            } else if (f6 == 3) {
                                i9 = 3;
                            } else {
                                if (f6 != i14) {
                                    throw B7.b("Unsupported coreSbrFrameLengthIndex " + f6);
                                }
                                i9 = i16;
                            }
                            c0826c0.u(2);
                            AbstractC1803xs.V(c0826c0);
                            int f7 = c0826c0.f(5);
                            int i23 = 0;
                            int i24 = 0;
                            while (true) {
                                int i25 = i16;
                                int i26 = 16;
                                if (i23 < f7 + 1) {
                                    int f8 = c0826c0.f(3);
                                    i24 = AbstractC1803xs.A(c0826c0, 5, i15, 16) + 1 + i24;
                                    if ((f8 == 0 || f8 == 2) && c0826c0.w()) {
                                        AbstractC1803xs.V(c0826c0);
                                    }
                                    i23++;
                                    i16 = i25;
                                } else {
                                    int A3 = AbstractC1803xs.A(c0826c0, i14, i15, 16) + 1;
                                    c0826c0.t();
                                    int i27 = 0;
                                    while (true) {
                                        double d5 = 2.0d;
                                        if (i27 < A3) {
                                            int f9 = c0826c0.f(2);
                                            if (f9 == 0) {
                                                i10 = i7;
                                                c0826c0.u(3);
                                                if (c0826c0.w()) {
                                                    c0826c0.u(13);
                                                }
                                                if (i9 > 0) {
                                                    AbstractC1803xs.O(c0826c0);
                                                }
                                            } else if (f9 != i25) {
                                                if (f9 == 3) {
                                                    AbstractC1803xs.A(c0826c0, i14, i15, i26);
                                                    int A5 = AbstractC1803xs.A(c0826c0, i14, i15, i26);
                                                    if (c0826c0.w()) {
                                                        AbstractC1803xs.A(c0826c0, i15, i26, 0);
                                                    }
                                                    c0826c0.t();
                                                    if (A5 > 0) {
                                                        c0826c0.u(A5 * i15);
                                                    }
                                                }
                                                i10 = i7;
                                            } else {
                                                c0826c0.u(3);
                                                boolean w5 = c0826c0.w();
                                                if (w5) {
                                                    c0826c0.u(13);
                                                }
                                                if (w5) {
                                                    c0826c0.t();
                                                }
                                                if (i9 > 0) {
                                                    AbstractC1803xs.O(c0826c0);
                                                    i11 = c0826c0.f(2);
                                                    i12 = i9;
                                                } else {
                                                    i11 = 0;
                                                    i12 = 0;
                                                }
                                                if (i11 > 0) {
                                                    c0826c0.u(6);
                                                    int f10 = c0826c0.f(2);
                                                    c0826c0.u(i14);
                                                    if (c0826c0.w()) {
                                                        c0826c0.u(5);
                                                    }
                                                    if (i11 == 2 || i11 == 3) {
                                                        c0826c0.u(6);
                                                    }
                                                    if (f10 == 2) {
                                                        c0826c0.t();
                                                    }
                                                }
                                                i10 = i7;
                                                int floor = ((int) Math.floor(Math.log(i24 - 1) / Math.log(2.0d))) + 1;
                                                int f11 = c0826c0.f(2);
                                                if (f11 > 0 && c0826c0.w()) {
                                                    c0826c0.u(floor);
                                                }
                                                if (c0826c0.w()) {
                                                    c0826c0.u(floor);
                                                }
                                                if (i12 == 0 && f11 == 0) {
                                                    c0826c0.t();
                                                }
                                            }
                                            i25 = 1;
                                            i27++;
                                            i7 = i10;
                                            i14 = 4;
                                            i15 = 8;
                                            i26 = 16;
                                        } else {
                                            int i28 = i7;
                                            if (c0826c0.w()) {
                                                int i29 = 8;
                                                int i30 = 4;
                                                int A6 = AbstractC1803xs.A(c0826c0, 2, 4, 8) + 1;
                                                int i31 = 0;
                                                bArr = null;
                                                while (i31 < A6) {
                                                    int A7 = AbstractC1803xs.A(c0826c0, i30, i29, 16);
                                                    int A8 = AbstractC1803xs.A(c0826c0, i30, i29, 16);
                                                    if (A7 == 7) {
                                                        int f12 = c0826c0.f(i30) + 1;
                                                        c0826c0.u(i30);
                                                        byte[] bArr3 = new byte[f12];
                                                        for (int i32 = 0; i32 < f12; i32++) {
                                                            bArr3[i32] = (byte) c0826c0.f(i29);
                                                        }
                                                        bArr = bArr3;
                                                    } else {
                                                        c0826c0.u(A8 * i29);
                                                    }
                                                    i31++;
                                                    i29 = 8;
                                                    i30 = 4;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (i28) {
                                                case 14700:
                                                case 16000:
                                                    d5 = 3.0d;
                                                    this.f11322q = (int) (i28 * d5);
                                                    this.f11323r = (int) (i22 * d5);
                                                    j5 = this.f11325t;
                                                    j6 = s2.f11488b;
                                                    if (j5 != j6) {
                                                        this.f11325t = j6;
                                                        String concat = f != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(f))) : "mhm1";
                                                        C1761wv o5 = (bArr == null || bArr.length <= 0) ? null : AbstractC1044gv.o(AbstractC1260lo.f, bArr);
                                                        C1649uH c1649uH = new C1649uH();
                                                        c1649uH.f15839a = this.f11312e;
                                                        c1649uH.c("audio/mhm1");
                                                        c1649uH.f15832B = this.f11322q;
                                                        c1649uH.i = concat;
                                                        c1649uH.f15851o = o5;
                                                        this.f.e(new C1407p(c1649uH));
                                                    }
                                                    i5 = 1;
                                                    this.f11326u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f11322q = (int) (i28 * d5);
                                                    this.f11323r = (int) (i22 * d5);
                                                    j5 = this.f11325t;
                                                    j6 = s2.f11488b;
                                                    if (j5 != j6) {
                                                    }
                                                    i5 = 1;
                                                    this.f11326u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d5 = 1.5d;
                                                    this.f11322q = (int) (i28 * d5);
                                                    this.f11323r = (int) (i22 * d5);
                                                    j5 = this.f11325t;
                                                    j6 = s2.f11488b;
                                                    if (j5 != j6) {
                                                    }
                                                    i5 = 1;
                                                    this.f11326u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d5 = 1.0d;
                                                    this.f11322q = (int) (i28 * d5);
                                                    this.f11323r = (int) (i22 * d5);
                                                    j5 = this.f11325t;
                                                    j6 = s2.f11488b;
                                                    if (j5 != j6) {
                                                    }
                                                    i5 = 1;
                                                    this.f11326u = true;
                                                    break;
                                                default:
                                                    throw B7.b("Unsupported sampling rate " + i28);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i21 == 17) {
                                byte[] bArr4 = c1617tm2.f15724a;
                                C0826c0 c0826c02 = new C0826c0(bArr4.length, bArr4);
                                if (c0826c02.w()) {
                                    c0826c02.u(2);
                                    i6 = c0826c02.f(13);
                                } else {
                                    i6 = 0;
                                }
                                this.f11324s = i6;
                            } else if (i21 == 2) {
                                if (this.f11326u) {
                                    this.f11315j = false;
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                int i33 = this.f11323r - this.f11324s;
                                double d6 = this.f11322q;
                                long round = Math.round(this.f11313g);
                                if (this.i) {
                                    this.i = false;
                                    this.f11313g = this.f11314h;
                                } else {
                                    this.f11313g += (i33 * 1000000.0d) / d6;
                                }
                                this.f.d(round, i, this.f11320o, 0, null);
                                this.f11326u = false;
                                this.f11324s = 0;
                                this.f11320o = 0;
                            }
                            i5 = 1;
                        }
                        this.f11311d = i5;
                        i16 = i5;
                        i14 = 4;
                        i15 = 8;
                    }
                } else {
                    int o6 = c1617tm.o();
                    C1617tm c1617tm3 = this.f11308a;
                    int min3 = Math.min(o6, c1617tm3.o());
                    c1617tm.f(c1617tm3.f15724a, c1617tm3.f15725b, min3);
                    c1617tm3.k(min3);
                    if (c1617tm3.o() == 0) {
                        int i34 = c1617tm3.f15726c;
                        byte[] bArr5 = c1617tm3.f15724a;
                        C0826c0 c0826c03 = this.f11309b;
                        c0826c03.f12943b = bArr5;
                        c0826c03.f12944c = 0;
                        c0826c03.f12945d = 0;
                        c0826c03.f12946e = i34;
                        c0826c03.c();
                        int A9 = AbstractC1803xs.A(c0826c03, 3, 8, 8);
                        s2.f11487a = A9;
                        if (A9 != -1) {
                            AbstractC1668us.S(Math.max(Math.max(2, 8), 32) <= 63);
                            AbstractC1400ot.c(AbstractC1400ot.c(3L, 255L), 4294967296L);
                            if (c0826c03.a() >= 2) {
                                long h3 = c0826c03.h(2);
                                if (h3 == 3) {
                                    if (c0826c03.a() >= 8) {
                                        long h4 = c0826c03.h(8);
                                        long j8 = h4 + 3;
                                        if (h4 != 255) {
                                            h3 = j8;
                                        } else if (c0826c03.a() >= 32) {
                                            h3 = c0826c03.h(32) + j8;
                                        }
                                    }
                                }
                                j7 = h3;
                                s2.f11488b = j7;
                                if (j7 != -1) {
                                    if (j7 > 16) {
                                        throw B7.b("Contains sub-stream with an invalid packet label " + j7);
                                    }
                                    if (j7 == 0) {
                                        int i35 = s2.f11487a;
                                        if (i35 == 1) {
                                            throw B7.a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                        }
                                        if (i35 == 2) {
                                            throw B7.a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                        }
                                        if (i35 == 17) {
                                            throw B7.a(null, "AudioTruncation packet with invalid packet label 0");
                                        }
                                    }
                                    int A10 = AbstractC1803xs.A(c0826c03, 11, 24, 24);
                                    s2.f11489c = A10;
                                    if (A10 != -1) {
                                        this.f11319n = 0;
                                        this.f11320o = A10 + i34 + this.f11320o;
                                        c1617tm3.j(0);
                                        this.f.c(c1617tm3.f15726c, c1617tm3);
                                        c1617tm3.g(2);
                                        c1617tm2.g(s2.f11489c);
                                        this.f11318m = true;
                                        this.f11311d = 2;
                                        i14 = 4;
                                        i15 = 8;
                                    }
                                }
                            }
                            j7 = -1;
                            s2.f11488b = j7;
                            if (j7 != -1) {
                            }
                        }
                        int i36 = c1617tm3.f15726c;
                        if (i36 < 15) {
                            c1617tm3.i(i36 + 1);
                        }
                        i14 = 4;
                        i15 = 8;
                    }
                    this.f11318m = false;
                    i14 = 4;
                    i15 = 8;
                }
            } else {
                int i37 = this.f11316k;
                if ((i37 & 2) == 0) {
                    c1617tm.j(c1617tm.f15726c);
                    i14 = 4;
                    i15 = 8;
                } else {
                    if ((i37 & 4) == 0) {
                        while (c1617tm.o() > 0) {
                            i13 = 8;
                            int i38 = this.f11317l << 8;
                            this.f11317l = i38;
                            int v4 = i38 | c1617tm.v();
                            this.f11317l = v4;
                            if ((v4 & 16777215) == 12583333) {
                                c1617tm.j(c1617tm.f15725b - 3);
                                this.f11317l = 0;
                            }
                        }
                        i15 = 8;
                        i14 = 4;
                    } else {
                        i13 = 8;
                    }
                    this.f11311d = 1;
                    i16 = 1;
                    i15 = i13;
                    i14 = 4;
                }
            }
            i16 = 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void d(boolean z3) {
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void e(H h3, C0829c3 c0829c3) {
        c0829c3.a();
        c0829c3.b();
        this.f11312e = c0829c3.f12966e;
        c0829c3.b();
        this.f = h3.w(c0829c3.f12965d, 1);
    }

    @Override // com.google.android.gms.internal.ads.F2
    public final void f(int i, long j5) {
        this.f11316k = i;
        if (!this.f11315j && (this.f11320o != 0 || !this.f11318m)) {
            this.i = true;
        }
        if (j5 != -9223372036854775807L) {
            double d5 = j5;
            if (this.i) {
                this.f11314h = d5;
            } else {
                this.f11313g = d5;
            }
        }
    }
}
