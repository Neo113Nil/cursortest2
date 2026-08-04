package P1;

import A1.C0045t0;
import A1.X;
import C0.J;
import C1.AbstractC0096b;
import C1.C0095a;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class s implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0095a f5328b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F1.x f5329c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public F1.v f5330d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f5331e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public X f5332f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5333g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f5334h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f5335i;
    public int j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5336k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5337l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5338m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f5339n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f5340o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f5341p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f5342q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f5343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f5344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f5345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f5346u;

    public s(String str) {
        this.f5327a = str;
        C0095a c0095a = new C0095a(1024);
        this.f5328b = c0095a;
        byte[] bArr = (byte[]) c0095a.f1465c;
        this.f5329c = new F1.x(bArr, bArr.length);
        this.f5336k = -9223372036854775807L;
    }

    @Override // P1.h
    public final void a(C0095a c0095a) throws C0045t0 {
        int i7;
        boolean zH;
        p151v2.a.i(this.f5330d);
        while (c0095a.d() > 0) {
            int i8 = this.f5333g;
            if (i8 != 0) {
                if (i8 != 1) {
                    C0095a c0095a2 = this.f5328b;
                    F1.x xVar = this.f5329c;
                    if (i8 == 2) {
                        int iT = ((this.j & (-225)) << 8) | c0095a.t();
                        this.f5335i = iT;
                        if (iT > ((byte[]) c0095a2.f1465c).length) {
                            c0095a2.A(iT);
                            byte[] bArr = (byte[]) c0095a2.f1465c;
                            xVar.n(bArr.length, bArr);
                        }
                        this.f5334h = 0;
                        this.f5333g = 3;
                    } else {
                        if (i8 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c0095a.d(), this.f5335i - this.f5334h);
                        c0095a.f(xVar.f2586d, this.f5334h, iMin);
                        int i9 = this.f5334h + iMin;
                        this.f5334h = i9;
                        if (i9 == this.f5335i) {
                            xVar.o(0);
                            if (xVar.h()) {
                                if (this.f5337l) {
                                }
                                this.f5333g = 0;
                            } else {
                                this.f5337l = true;
                                int i10 = xVar.i(1);
                                int i11 = i10 == 1 ? xVar.i(1) : 0;
                                this.f5338m = i11;
                                if (i11 != 0) {
                                    throw C0045t0.a(null, null);
                                }
                                if (i10 == 1) {
                                    xVar.i((xVar.i(2) + 1) * 8);
                                }
                                if (!xVar.h()) {
                                    throw C0045t0.a(null, null);
                                }
                                this.f5339n = xVar.i(6);
                                int i12 = xVar.i(4);
                                int i13 = xVar.i(3);
                                if (i12 != 0 || i13 != 0) {
                                    throw C0045t0.a(null, null);
                                }
                                if (i10 == 0) {
                                    int iG = xVar.g();
                                    int iB = xVar.b();
                                    C0095a c0095aG = AbstractC0096b.g(xVar, true);
                                    this.f5346u = (String) c0095aG.f1465c;
                                    this.f5343r = c0095aG.f1463a;
                                    this.f5345t = c0095aG.f1464b;
                                    int iB2 = iB - xVar.b();
                                    xVar.o(iG);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    xVar.j(iB2, bArr2);
                                    Format$Builder format$Builder = new Format$Builder();
                                    format$Builder.f10528a = this.f5331e;
                                    format$Builder.f10537k = "audio/mp4a-latm";
                                    format$Builder.f10535h = this.f5346u;
                                    format$Builder.f10550x = this.f5345t;
                                    format$Builder.f10551y = this.f5343r;
                                    format$Builder.f10539m = Collections.singletonList(bArr2);
                                    format$Builder.f10530c = this.f5327a;
                                    X x4 = new X(format$Builder);
                                    if (!x4.equals(this.f5332f)) {
                                        this.f5332f = x4;
                                        this.f5344s = 1024000000 / ((long) x4.f297Q);
                                        this.f5330d.a(x4);
                                    }
                                } else {
                                    int i14 = xVar.i((xVar.i(2) + 1) * 8);
                                    int iB3 = xVar.b();
                                    C0095a c0095aG2 = AbstractC0096b.g(xVar, true);
                                    this.f5346u = (String) c0095aG2.f1465c;
                                    this.f5343r = c0095aG2.f1463a;
                                    this.f5345t = c0095aG2.f1464b;
                                    xVar.r(i14 - (iB3 - xVar.b()));
                                }
                                int i15 = xVar.i(3);
                                this.f5340o = i15;
                                if (i15 == 0) {
                                    xVar.r(8);
                                } else if (i15 == 1) {
                                    xVar.r(9);
                                } else if (i15 == 3 || i15 == 4 || i15 == 5) {
                                    xVar.r(6);
                                } else {
                                    if (i15 != 6 && i15 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    xVar.r(1);
                                }
                                boolean zH2 = xVar.h();
                                this.f5341p = zH2;
                                this.f5342q = 0L;
                                if (zH2) {
                                    if (i10 == 1) {
                                        this.f5342q = xVar.i((xVar.i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zH = xVar.h();
                                            this.f5342q = (this.f5342q << 8) + ((long) xVar.i(8));
                                        } while (zH);
                                    }
                                }
                                if (xVar.h()) {
                                    xVar.r(8);
                                }
                            }
                            if (this.f5338m != 0) {
                                throw C0045t0.a(null, null);
                            }
                            if (this.f5339n != 0) {
                                throw C0045t0.a(null, null);
                            }
                            if (this.f5340o != 0) {
                                throw C0045t0.a(null, null);
                            }
                            int i16 = 0;
                            do {
                                i7 = xVar.i(8);
                                i16 += i7;
                            } while (i7 == 255);
                            int iG2 = xVar.g();
                            if ((iG2 & 7) == 0) {
                                c0095a2.D(iG2 >> 3);
                            } else {
                                xVar.j(i16 * 8, (byte[]) c0095a2.f1465c);
                                c0095a2.D(0);
                            }
                            this.f5330d.c(i16, c0095a2);
                            long j = this.f5336k;
                            if (j != -9223372036854775807L) {
                                this.f5330d.e(j, 1, i16, 0, null);
                                this.f5336k += this.f5344s;
                            }
                            if (this.f5341p) {
                                xVar.r((int) this.f5342q);
                            }
                            this.f5333g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iT2 = c0095a.t();
                    if ((iT2 & 224) == 224) {
                        this.j = iT2;
                        this.f5333g = 2;
                    } else if (iT2 != 86) {
                        this.f5333g = 0;
                    }
                }
            } else if (c0095a.t() == 86) {
                this.f5333g = 1;
            }
        }
    }

    @Override // P1.h
    public final void b() {
        this.f5333g = 0;
        this.f5336k = -9223372036854775807L;
        this.f5337l = false;
    }

    @Override // P1.h
    public final void c(F1.m mVar, J j) {
        j.a();
        j.d();
        this.f5330d = mVar.r(j.f1236c, 1);
        j.d();
        this.f5331e = (String) j.f1238e;
    }

    @Override // P1.h
    public final void e(int i7, long j) {
        if (j != -9223372036854775807L) {
            this.f5336k = j;
        }
    }

    @Override // P1.h
    public final void d() {
    }
}
