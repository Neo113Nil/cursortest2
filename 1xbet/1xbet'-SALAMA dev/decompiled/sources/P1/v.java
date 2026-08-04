package P1;

import C0.J;
import C1.C0095a;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class v implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F1.x f5364b = new F1.x(new byte[10], 10);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5365c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p151v2.s f5367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f5369g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5370h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5371i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5372k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f5373l;

    public v(h hVar) {
        this.f5363a = hVar;
    }

    @Override // P1.E
    public final void a(int i7, C0095a c0095a) {
        int i8;
        int i9;
        int i10;
        int i11;
        p151v2.a.i(this.f5367e);
        int i12 = i7 & 1;
        h hVar = this.f5363a;
        int i13 = -1;
        int i14 = 3;
        int i15 = 2;
        if (i12 != 0) {
            int i16 = this.f5365c;
            if (i16 != 0 && i16 != 1) {
                if (i16 == 2) {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i16 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.j != -1) {
                        Log.w("PesReader", "Unexpected start indicator: expected " + this.j + " more bytes");
                    }
                    hVar.d();
                }
            }
            this.f5365c = 1;
            this.f5366d = 0;
        }
        int i17 = i7;
        while (c0095a.d() > 0) {
            int i18 = this.f5365c;
            if (i18 != 0) {
                F1.x xVar = this.f5364b;
                if (i18 == 1) {
                    i10 = i14;
                    if (d(c0095a, xVar.f2586d, 9)) {
                        xVar.o(0);
                        int i19 = xVar.i(24);
                        if (i19 != 1) {
                            p150v0.a.j(i19, "Unexpected start code prefix: ", "PesReader");
                            this.j = -1;
                            i11 = 0;
                            i9 = -1;
                            i8 = 2;
                        } else {
                            xVar.r(8);
                            int i20 = xVar.i(16);
                            xVar.r(5);
                            this.f5372k = xVar.h();
                            i8 = 2;
                            xVar.r(2);
                            this.f5368f = xVar.h();
                            this.f5369g = xVar.h();
                            xVar.r(6);
                            int i21 = xVar.i(8);
                            this.f5371i = i21;
                            if (i20 == 0) {
                                this.j = -1;
                                i9 = -1;
                            } else {
                                int i22 = (i20 - 3) - i21;
                                this.j = i22;
                                if (i22 < 0) {
                                    Log.w("PesReader", "Found negative packet payload size: " + this.j);
                                    i9 = -1;
                                    this.j = -1;
                                } else {
                                    i9 = -1;
                                }
                            }
                            i11 = 2;
                        }
                        this.f5365c = i11;
                        this.f5366d = 0;
                    } else {
                        i9 = -1;
                        i8 = 2;
                    }
                } else if (i18 == i15) {
                    if (d(c0095a, xVar.f2586d, Math.min(10, this.f5371i)) && d(c0095a, null, this.f5371i)) {
                        xVar.o(0);
                        this.f5373l = -9223372036854775807L;
                        if (this.f5368f) {
                            xVar.r(4);
                            long jI = ((long) xVar.i(i14)) << 30;
                            xVar.r(1);
                            long jI2 = ((long) (xVar.i(15) << 15)) | jI;
                            xVar.r(1);
                            long jI3 = jI2 | ((long) xVar.i(15));
                            xVar.r(1);
                            if (!this.f5370h && this.f5369g) {
                                xVar.r(4);
                                long jI4 = ((long) xVar.i(3)) << 30;
                                xVar.r(1);
                                long jI5 = jI4 | ((long) (xVar.i(15) << 15));
                                xVar.r(1);
                                long jI6 = jI5 | ((long) xVar.i(15));
                                xVar.r(1);
                                this.f5367e.b(jI6);
                                this.f5370h = true;
                            }
                            this.f5373l = this.f5367e.b(jI3);
                        }
                        i17 |= this.f5372k ? 4 : 0;
                        hVar.e(i17, this.f5373l);
                        this.f5365c = 3;
                        this.f5366d = 0;
                        i14 = 3;
                        i13 = -1;
                        i15 = 2;
                    } else {
                        i10 = i14;
                        i8 = i15;
                        i9 = -1;
                    }
                } else {
                    if (i18 != i14) {
                        throw new IllegalStateException();
                    }
                    int iD = c0095a.d();
                    int i23 = this.j;
                    int i24 = i23 == i13 ? 0 : iD - i23;
                    if (i24 > 0) {
                        iD -= i24;
                        c0095a.C(c0095a.f1463a + iD);
                    }
                    hVar.a(c0095a);
                    int i25 = this.j;
                    if (i25 != i13) {
                        int i26 = i25 - iD;
                        this.j = i26;
                        if (i26 == 0) {
                            hVar.d();
                            this.f5365c = 1;
                            this.f5366d = 0;
                        }
                    }
                    i8 = i15;
                    int i27 = i14;
                    i9 = i13;
                    i10 = i27;
                }
            } else {
                i8 = i15;
                int i28 = i14;
                i9 = i13;
                i10 = i28;
                c0095a.E(c0095a.d());
            }
            i15 = i8;
            int i29 = i9;
            i14 = i10;
            i13 = i29;
        }
    }

    @Override // P1.E
    public final void b() {
        this.f5365c = 0;
        this.f5366d = 0;
        this.f5370h = false;
        this.f5363a.b();
    }

    @Override // P1.E
    public final void c(p151v2.s sVar, F1.m mVar, J j) {
        this.f5367e = sVar;
        this.f5363a.c(mVar, j);
    }

    public final boolean d(C0095a c0095a, byte[] bArr, int i7) {
        int iMin = Math.min(c0095a.d(), i7 - this.f5366d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c0095a.E(iMin);
        } else {
            c0095a.f(bArr, this.f5366d, iMin);
        }
        int i8 = this.f5366d + iMin;
        this.f5366d = i8;
        return i8 == i7;
    }
}
