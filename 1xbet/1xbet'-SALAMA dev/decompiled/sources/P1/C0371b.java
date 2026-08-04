package P1;

import A1.X;
import C0.C0091j;
import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;
import com.google.android.exoplayer2.Format$Builder;

/* JADX INFO: renamed from: P1.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0371b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1.x f5147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0095a f5148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5149d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5150e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F1.v f5151f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5152g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5153h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f5154i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public X f5155k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5156l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f5157m;

    public C0371b(String str, int i7) {
        this.f5146a = i7;
        switch (i7) {
            case 1:
                byte[] bArr = new byte[16];
                this.f5147b = new F1.x(bArr, 16);
                this.f5148c = new C0095a(bArr);
                this.f5152g = 0;
                this.f5153h = 0;
                this.f5154i = false;
                this.f5157m = -9223372036854775807L;
                this.f5149d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.f5147b = new F1.x(bArr2, 128);
                this.f5148c = new C0095a(bArr2);
                this.f5152g = 0;
                this.f5157m = -9223372036854775807L;
                this.f5149d = str;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0317  */
    /* JADX WARN: Code duplicated, block: B:199:0x0357  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // P1.h
    public final void a(C0095a c0095a) {
        int i7;
        int i8;
        int i9;
        String str;
        int i10;
        int i11;
        byte b7;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        switch (this.f5146a) {
            case 0:
                p151v2.a.i(this.f5151f);
                while (c0095a.d() > 0) {
                    int i23 = this.f5152g;
                    C0095a c0095a2 = this.f5148c;
                    if (i23 == 0) {
                        while (c0095a.d() > 0) {
                            if (this.f5154i) {
                                int iT = c0095a.t();
                                if (iT == 119) {
                                    this.f5154i = false;
                                    this.f5152g = 1;
                                    byte[] bArr = (byte[]) c0095a2.f1465c;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f5153h = 2;
                                }
                                this.f5154i = iT == 11;
                            } else {
                                this.f5154i = c0095a.t() == 11;
                            }
                            break;
                        }
                    } else if (i23 == 1) {
                        byte[] bArr2 = (byte[]) c0095a2.f1465c;
                        int iMin = Math.min(c0095a.d(), 128 - this.f5153h);
                        c0095a.f(bArr2, this.f5153h, iMin);
                        int i24 = this.f5153h + iMin;
                        this.f5153h = i24;
                        if (i24 == 128) {
                            F1.x xVar = this.f5147b;
                            xVar.o(0);
                            int iG = xVar.g();
                            xVar.r(40);
                            Object[] objArr = xVar.i(5) > 10;
                            xVar.o(iG);
                            int[] iArr = AbstractC0096b.f1471f;
                            int[] iArr2 = AbstractC0096b.f1469d;
                            if (objArr == true) {
                                xVar.r(16);
                                int i25 = xVar.i(2);
                                if (i25 == 0) {
                                    b7 = 0;
                                } else if (i25 != 1) {
                                    b7 = i25 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b7 = 1;
                                }
                                xVar.r(3);
                                i10 = (xVar.i(11) + 1) * 2;
                                int i26 = xVar.i(2);
                                if (i26 == 3) {
                                    i11 = AbstractC0096b.f1470e[xVar.i(2)];
                                    i12 = 3;
                                    i13 = 6;
                                } else {
                                    int i27 = xVar.i(2);
                                    int i28 = AbstractC0096b.f1468c[i27];
                                    i11 = iArr2[i26];
                                    i12 = i27;
                                    i13 = i28;
                                }
                                i9 = i13 * 256;
                                int i29 = xVar.i(3);
                                boolean zH = xVar.h();
                                i8 = iArr[i29] + (zH ? 1 : 0);
                                xVar.r(10);
                                if (xVar.h()) {
                                    xVar.r(8);
                                }
                                if (i29 == 0) {
                                    xVar.r(5);
                                    if (xVar.h()) {
                                        xVar.r(8);
                                    }
                                }
                                if (b7 == 1 && xVar.h()) {
                                    xVar.r(16);
                                }
                                if (xVar.h()) {
                                    if (i29 > 2) {
                                        xVar.r(2);
                                    }
                                    if ((i29 & 1) == 0 || i29 <= 2) {
                                        i18 = 6;
                                    } else {
                                        i18 = 6;
                                        xVar.r(6);
                                    }
                                    if ((i29 & 4) != 0) {
                                        xVar.r(i18);
                                    }
                                    if (zH && xVar.h()) {
                                        xVar.r(5);
                                    }
                                    if (b7 != 0) {
                                        i14 = i12;
                                    } else {
                                        if (xVar.h()) {
                                            i19 = 6;
                                            xVar.r(6);
                                        } else {
                                            i19 = 6;
                                        }
                                        if (i29 == 0 && xVar.h()) {
                                            xVar.r(i19);
                                        }
                                        if (xVar.h()) {
                                            xVar.r(i19);
                                        }
                                        int i30 = xVar.i(2);
                                        if (i30 == 1) {
                                            xVar.r(5);
                                            i21 = 2;
                                        } else {
                                            if (i30 == 2) {
                                                xVar.r(12);
                                            } else if (i30 == 3) {
                                                int i31 = xVar.i(5);
                                                if (xVar.h()) {
                                                    xVar.r(5);
                                                    if (xVar.h()) {
                                                        i22 = 4;
                                                        xVar.r(4);
                                                    } else {
                                                        i22 = 4;
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i22);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i22);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i22);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i22);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i22);
                                                    }
                                                    if (xVar.h()) {
                                                        xVar.r(i22);
                                                    }
                                                    if (xVar.h()) {
                                                        if (xVar.h()) {
                                                            xVar.r(i22);
                                                        }
                                                        if (xVar.h()) {
                                                            xVar.r(i22);
                                                        }
                                                    }
                                                }
                                                if (xVar.h()) {
                                                    xVar.r(5);
                                                    if (xVar.h()) {
                                                        xVar.r(7);
                                                        if (xVar.h()) {
                                                            i20 = 8;
                                                            xVar.r(8);
                                                        } else {
                                                            i20 = 8;
                                                        }
                                                    } else {
                                                        i20 = 8;
                                                    }
                                                } else {
                                                    i20 = 8;
                                                }
                                                i21 = 2;
                                                xVar.r((i31 + 2) * i20);
                                                xVar.c();
                                            }
                                            i21 = 2;
                                        }
                                        if (i29 < i21) {
                                            if (xVar.h()) {
                                                xVar.r(14);
                                            }
                                            if (i29 == 0 && xVar.h()) {
                                                xVar.r(14);
                                            }
                                        }
                                        if (xVar.h()) {
                                            i14 = i12;
                                            if (i14 == 0) {
                                                xVar.r(5);
                                            } else {
                                                for (int i32 = 0; i32 < i13; i32++) {
                                                    if (xVar.h()) {
                                                        xVar.r(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i14 = i12;
                                        }
                                    }
                                } else {
                                    i14 = i12;
                                }
                                if (xVar.h()) {
                                    xVar.r(5);
                                    if (i29 == 2) {
                                        xVar.r(4);
                                    }
                                    if (i29 >= 6) {
                                        xVar.r(2);
                                    }
                                    if (xVar.h()) {
                                        i17 = 8;
                                        xVar.r(8);
                                    } else {
                                        i17 = 8;
                                    }
                                    if (i29 == 0 && xVar.h()) {
                                        xVar.r(i17);
                                    }
                                    i15 = 3;
                                    if (i26 < 3) {
                                        xVar.q();
                                    }
                                } else {
                                    i15 = 3;
                                }
                                if (b7 == 0 && i14 != i15) {
                                    xVar.q();
                                }
                                if (b7 == 2 && (i14 == i15 || xVar.h())) {
                                    i16 = 6;
                                    xVar.r(6);
                                } else {
                                    i16 = 6;
                                }
                                str = (xVar.h() && xVar.i(i16) == 1 && xVar.i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                            } else {
                                xVar.r(32);
                                int i33 = xVar.i(2);
                                String str2 = i33 == 3 ? null : "audio/ac3";
                                int iB = AbstractC0096b.b(i33, xVar.i(6));
                                xVar.r(8);
                                int i34 = xVar.i(3);
                                if ((i34 & 1) == 0 || i34 == 1) {
                                    i7 = 2;
                                } else {
                                    i7 = 2;
                                    xVar.r(2);
                                }
                                if ((i34 & 4) != 0) {
                                    xVar.r(i7);
                                }
                                if (i34 == i7) {
                                    xVar.r(i7);
                                }
                                int i35 = i33 < 3 ? iArr2[i33] : -1;
                                i8 = iArr[i34] + (xVar.h() ? 1 : 0);
                                i9 = 1536;
                                str = str2;
                                i10 = iB;
                                i11 = i35;
                            }
                            X x4 = this.f5155k;
                            if (x4 == null || i8 != x4.f296P || i11 != x4.f297Q || !p151v2.t.a(str, x4.f283C)) {
                                Format$Builder format$Builder = new Format$Builder();
                                format$Builder.f10528a = this.f5150e;
                                format$Builder.f10537k = str;
                                format$Builder.f10550x = i8;
                                format$Builder.f10551y = i11;
                                format$Builder.f10530c = this.f5149d;
                                X x7 = new X(format$Builder);
                                this.f5155k = x7;
                                this.f5151f.a(x7);
                            }
                            this.f5156l = i10;
                            this.j = (((long) i9) * 1000000) / ((long) this.f5155k.f297Q);
                            c0095a2.D(0);
                            this.f5151f.c(128, c0095a2);
                            this.f5152g = 2;
                        }
                    } else if (i23 == 2) {
                        int iMin2 = Math.min(c0095a.d(), this.f5156l - this.f5153h);
                        this.f5151f.c(iMin2, c0095a);
                        int i36 = this.f5153h + iMin2;
                        this.f5153h = i36;
                        int i37 = this.f5156l;
                        if (i36 == i37) {
                            long j = this.f5157m;
                            if (j != -9223372036854775807L) {
                                this.f5151f.e(j, 1, i37, 0, null);
                                this.f5157m += this.j;
                            }
                            this.f5152g = 0;
                        }
                    }
                }
                break;
            default:
                p151v2.a.i(this.f5151f);
                while (c0095a.d() > 0) {
                    int i38 = this.f5152g;
                    C0095a c0095a3 = this.f5148c;
                    if (i38 == 0) {
                        while (c0095a.d() > 0) {
                            if (this.f5154i) {
                                int iT2 = c0095a.t();
                                this.f5154i = iT2 == 172;
                                if (iT2 == 64 || iT2 == 65) {
                                    Object[] objArr2 = iT2 == 65;
                                    this.f5152g = 1;
                                    byte[] bArr3 = (byte[]) c0095a3.f1465c;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f5153h = 2;
                                }
                            } else {
                                this.f5154i = c0095a.t() == 172;
                            }
                            break;
                        }
                    } else if (i38 == 1) {
                        byte[] bArr4 = (byte[]) c0095a3.f1465c;
                        int iMin3 = Math.min(c0095a.d(), 16 - this.f5153h);
                        c0095a.f(bArr4, this.f5153h, iMin3);
                        int i39 = this.f5153h + iMin3;
                        this.f5153h = i39;
                        if (i39 == 16) {
                            F1.x xVar2 = this.f5147b;
                            xVar2.o(0);
                            C0091j c0091jF = AbstractC0096b.f(xVar2);
                            X x8 = this.f5155k;
                            int i40 = c0091jF.f1289a;
                            if (x8 == null || 2 != x8.f296P || i40 != x8.f297Q || !"audio/ac4".equals(x8.f283C)) {
                                Format$Builder format$Builder2 = new Format$Builder();
                                format$Builder2.f10528a = this.f5150e;
                                format$Builder2.f10537k = "audio/ac4";
                                format$Builder2.f10550x = 2;
                                format$Builder2.f10551y = i40;
                                format$Builder2.f10530c = this.f5149d;
                                X x9 = new X(format$Builder2);
                                this.f5155k = x9;
                                this.f5151f.a(x9);
                            }
                            this.f5156l = c0091jF.f1290b;
                            this.j = (((long) c0091jF.f1291c) * 1000000) / ((long) this.f5155k.f297Q);
                            c0095a3.D(0);
                            this.f5151f.c(16, c0095a3);
                            this.f5152g = 2;
                        }
                    } else if (i38 == 2) {
                        int iMin4 = Math.min(c0095a.d(), this.f5156l - this.f5153h);
                        this.f5151f.c(iMin4, c0095a);
                        int i41 = this.f5153h + iMin4;
                        this.f5153h = i41;
                        int i42 = this.f5156l;
                        if (i41 == i42) {
                            long j3 = this.f5157m;
                            if (j3 != -9223372036854775807L) {
                                this.f5151f.e(j3, 1, i42, 0, null);
                                this.f5157m += this.j;
                            }
                            this.f5152g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // P1.h
    public final void b() {
        switch (this.f5146a) {
            case 0:
                this.f5152g = 0;
                this.f5153h = 0;
                this.f5154i = false;
                this.f5157m = -9223372036854775807L;
                break;
            default:
                this.f5152g = 0;
                this.f5153h = 0;
                this.f5154i = false;
                this.f5157m = -9223372036854775807L;
                break;
        }
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        switch (this.f5146a) {
            case 0:
                j.a();
                j.d();
                this.f5150e = (String) j.f1238e;
                j.d();
                this.f5151f = mVar.r(j.f1236c, 1);
                break;
            default:
                j.a();
                j.d();
                this.f5150e = (String) j.f1238e;
                j.d();
                this.f5151f = mVar.r(j.f1236c, 1);
                break;
        }
    }

    @Override // P1.h
    public final void d() {
        int i7 = this.f5146a;
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        switch (this.f5146a) {
            case 0:
                if (j != -9223372036854775807L) {
                    this.f5157m = j;
                }
                break;
            default:
                if (j != -9223372036854775807L) {
                    this.f5157m = j;
                }
                break;
        }
    }

    private final void f() {
    }

    private final void g() {
    }
}
