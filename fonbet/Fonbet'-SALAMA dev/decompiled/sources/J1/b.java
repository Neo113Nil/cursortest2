package J1;

import A1.X;
import C1.AbstractC0096b;
import C1.C0095a;
import E4.y;
import F1.h;
import F1.j;
import F1.k;
import F1.l;
import F1.m;
import F1.n;
import F1.q;
import F1.v;
import F1.x;
import com.google.android.exoplayer2.Format$Builder;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import v2.AbstractC1664a;
import w2.C1766a;

/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a, reason: collision with root package name */
    public final C0095a f3776a = new C0095a(4);

    /* renamed from: b, reason: collision with root package name */
    public final C0095a f3777b = new C0095a(9);

    /* renamed from: c, reason: collision with root package name */
    public final C0095a f3778c = new C0095a(11);

    /* renamed from: d, reason: collision with root package name */
    public final C0095a f3779d = new C0095a(4, false);

    /* renamed from: e, reason: collision with root package name */
    public final c f3780e;

    /* renamed from: f, reason: collision with root package name */
    public m f3781f;

    /* renamed from: g, reason: collision with root package name */
    public int f3782g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3783h;

    /* renamed from: i, reason: collision with root package name */
    public long f3784i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f3785k;

    /* renamed from: l, reason: collision with root package name */
    public int f3786l;

    /* renamed from: m, reason: collision with root package name */
    public long f3787m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3788n;

    /* renamed from: o, reason: collision with root package name */
    public a f3789o;

    /* renamed from: p, reason: collision with root package name */
    public e f3790p;

    public b() {
        c cVar = new c(new j());
        cVar.f3791b = -9223372036854775807L;
        cVar.f3792c = new long[0];
        cVar.f3793d = new long[0];
        this.f3780e = cVar;
        this.f3782g = 1;
    }

    @Override // F1.k
    public final boolean a(l lVar) {
        C0095a c0095a = this.f3776a;
        h hVar = (h) lVar;
        hVar.c((byte[]) c0095a.f1465c, 0, 3, false);
        c0095a.D(0);
        if (c0095a.v() != 4607062) {
            return false;
        }
        hVar.c((byte[]) c0095a.f1465c, 0, 2, false);
        c0095a.D(0);
        if ((c0095a.y() & 250) != 0) {
            return false;
        }
        hVar.c((byte[]) c0095a.f1465c, 0, 4, false);
        c0095a.D(0);
        int g3 = c0095a.g();
        hVar.f2536f = 0;
        hVar.b(g3, false);
        hVar.c((byte[]) c0095a.f1465c, 0, 4, false);
        c0095a.D(0);
        return c0095a.g() == 0;
    }

    public final C0095a b(h hVar) {
        int i7 = this.f3786l;
        C0095a c0095a = this.f3779d;
        byte[] bArr = (byte[]) c0095a.f1465c;
        if (i7 > bArr.length) {
            c0095a.B(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            c0095a.D(0);
        }
        c0095a.C(this.f3786l);
        hVar.a((byte[]) c0095a.f1465c, 0, this.f3786l, false);
        return c0095a;
    }

    @Override // F1.k
    public final void e(m mVar) {
        this.f3781f = mVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0382 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x039c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0007 A[SYNTHETIC] */
    @Override // F1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(l lVar, y yVar) {
        long j;
        long j3;
        int i7;
        boolean z4;
        boolean z7;
        AbstractC1664a.i(this.f3781f);
        while (true) {
            int i8 = this.f3782g;
            if (i8 == 1) {
                C0095a c0095a = this.f3777b;
                if (!((h) lVar).a((byte[]) c0095a.f1465c, 0, 9, true)) {
                    return -1;
                }
                c0095a.D(0);
                c0095a.E(4);
                int t7 = c0095a.t();
                boolean z8 = (t7 & 4) != 0;
                boolean z9 = (t7 & 1) != 0;
                if (z8 && this.f3789o == null) {
                    this.f3789o = new a(this.f3781f.r(8, 1));
                }
                if (z9 && this.f3790p == null) {
                    this.f3790p = new e(this.f3781f.r(9, 2));
                }
                this.f3781f.n();
                this.j = c0095a.g() - 5;
                this.f3782g = 2;
            } else if (i8 == 2) {
                ((h) lVar).q(this.j);
                this.j = 0;
                this.f3782g = 3;
            } else if (i8 == 3) {
                C0095a c0095a2 = this.f3778c;
                if (!((h) lVar).a((byte[]) c0095a2.f1465c, 0, 11, true)) {
                    return -1;
                }
                c0095a2.D(0);
                this.f3785k = c0095a2.t();
                this.f3786l = c0095a2.v();
                this.f3787m = c0095a2.v();
                this.f3787m = ((c0095a2.t() << 24) | this.f3787m) * 1000;
                c0095a2.E(3);
                this.f3782g = 4;
            } else {
                if (i8 != 4) {
                    throw new IllegalStateException();
                }
                boolean z10 = this.f3783h;
                c cVar = this.f3780e;
                if (z10) {
                    j = this.f3784i + this.f3787m;
                } else if (cVar.f3791b == -9223372036854775807L) {
                    j3 = 0;
                    i7 = this.f3785k;
                    if (i7 != 8 && this.f3789o != null) {
                        if (!this.f3788n) {
                            this.f3781f.m(new n(-9223372036854775807L));
                            this.f3788n = true;
                        }
                        a aVar = this.f3789o;
                        C0095a b7 = b((h) lVar);
                        if (aVar.f3773b) {
                            b7.E(1);
                        } else {
                            int t8 = b7.t();
                            int i9 = (t8 >> 4) & 15;
                            aVar.f3775d = i9;
                            v vVar = (v) aVar.f364a;
                            if (i9 == 2) {
                                int i10 = a.f3772e[(t8 >> 2) & 3];
                                Format$Builder format$Builder = new Format$Builder();
                                format$Builder.f10537k = "audio/mpeg";
                                format$Builder.f10550x = 1;
                                format$Builder.f10551y = i10;
                                vVar.a(new X(format$Builder));
                                aVar.f3774c = true;
                            } else if (i9 == 7 || i9 == 8) {
                                String str = i9 == 7 ? "audio/g711-alaw" : "audio/g711-mlaw";
                                Format$Builder format$Builder2 = new Format$Builder();
                                format$Builder2.f10537k = str;
                                format$Builder2.f10550x = 1;
                                format$Builder2.f10551y = 8000;
                                vVar.a(new X(format$Builder2));
                                aVar.f3774c = true;
                            } else if (i9 != 10) {
                                throw new d("Audio format not supported: " + aVar.f3775d);
                            }
                            aVar.f3773b = true;
                        }
                        int i11 = aVar.f3775d;
                        v vVar2 = (v) aVar.f364a;
                        z7 = true;
                        if (i11 == 2) {
                            int d7 = b7.d();
                            vVar2.c(d7, b7);
                            ((v) aVar.f364a).e(j3, 1, d7, 0, null);
                        } else {
                            int t9 = b7.t();
                            if (t9 == 0 && !aVar.f3774c) {
                                int d8 = b7.d();
                                byte[] bArr = new byte[d8];
                                b7.f(bArr, 0, d8);
                                C0095a g3 = AbstractC0096b.g(new x(bArr, d8), false);
                                Format$Builder format$Builder3 = new Format$Builder();
                                format$Builder3.f10537k = "audio/mp4a-latm";
                                format$Builder3.f10535h = (String) g3.f1465c;
                                format$Builder3.f10550x = g3.f1464b;
                                format$Builder3.f10551y = g3.f1463a;
                                format$Builder3.f10539m = Collections.singletonList(bArr);
                                vVar2.a(new X(format$Builder3));
                                aVar.f3774c = true;
                            } else if (aVar.f3775d != 10 || t9 == 1) {
                                int d9 = b7.d();
                                vVar2.c(d9, b7);
                                ((v) aVar.f364a).e(j3, 1, d9, 0, null);
                            }
                            z7 = false;
                        }
                        z4 = true;
                        if (!this.f3783h) {
                        }
                        this.j = 4;
                        this.f3782g = 2;
                        if (z4) {
                        }
                    } else if (i7 == 9 || this.f3790p == null) {
                        if (i7 == 18 || this.f3788n) {
                            ((h) lVar).q(this.f3786l);
                            z4 = false;
                        } else {
                            C0095a b8 = b((h) lVar);
                            cVar.getClass();
                            cVar.getClass();
                            if (b8.t() == 2 && "onMetaData".equals(c.s(b8)) && b8.d() != 0 && b8.t() == 8) {
                                HashMap r7 = c.r(b8);
                                Object obj = r7.get("duration");
                                if (obj instanceof Double) {
                                    double doubleValue = ((Double) obj).doubleValue();
                                    if (doubleValue > 0.0d) {
                                        cVar.f3791b = (long) (doubleValue * 1000000.0d);
                                    }
                                }
                                Object obj2 = r7.get("keyframes");
                                if (obj2 instanceof Map) {
                                    Map map = (Map) obj2;
                                    Object obj3 = map.get("filepositions");
                                    Object obj4 = map.get("times");
                                    if ((obj3 instanceof List) && (obj4 instanceof List)) {
                                        List list = (List) obj3;
                                        List list2 = (List) obj4;
                                        int size = list2.size();
                                        cVar.f3792c = new long[size];
                                        cVar.f3793d = new long[size];
                                        int i12 = 0;
                                        while (i12 < size) {
                                            Object obj5 = list.get(i12);
                                            Object obj6 = list2.get(i12);
                                            if (!(obj6 instanceof Double) || !(obj5 instanceof Double)) {
                                                cVar.f3792c = new long[0];
                                                cVar.f3793d = new long[0];
                                                break;
                                            }
                                            cVar.f3792c[i12] = (long) (((Double) obj6).doubleValue() * 1000000.0d);
                                            cVar.f3793d[i12] = ((Double) obj5).longValue();
                                            i12++;
                                            list = list;
                                        }
                                    }
                                }
                            }
                            long j7 = cVar.f3791b;
                            if (j7 != -9223372036854775807L) {
                                this.f3781f.m(new q(cVar.f3793d, cVar.f3792c, j7));
                                this.f3788n = true;
                            }
                            z4 = true;
                        }
                        z7 = false;
                        if (!this.f3783h && z7) {
                            this.f3783h = true;
                            this.f3784i = cVar.f3791b != -9223372036854775807L ? -this.f3787m : 0L;
                        }
                        this.j = 4;
                        this.f3782g = 2;
                        if (z4) {
                            return 0;
                        }
                    } else {
                        if (!this.f3788n) {
                            this.f3781f.m(new n(-9223372036854775807L));
                            this.f3788n = true;
                        }
                        e eVar = this.f3790p;
                        C0095a b9 = b((h) lVar);
                        eVar.getClass();
                        int t10 = b9.t();
                        int i13 = (t10 >> 4) & 15;
                        int i14 = t10 & 15;
                        if (i14 != 7) {
                            throw new d(e1.k.d(i14, "Video format not supported: "));
                        }
                        eVar.f3799g = i13;
                        if (i13 != 5) {
                            int t11 = b9.t();
                            byte[] bArr2 = (byte[]) b9.f1465c;
                            int i15 = b9.f1463a;
                            int i16 = i15 + 1;
                            b9.f1463a = i16;
                            int i17 = ((bArr2[i15] & 255) << 24) >> 8;
                            b9.f1463a = i15 + 2;
                            int i18 = ((bArr2[i16] & 255) << 8) | i17;
                            b9.f1463a = i15 + 3;
                            long j8 = (((bArr2[r15] & 255) | i18) * 1000) + j3;
                            boolean z11 = true;
                            v vVar3 = (v) eVar.f364a;
                            if (t11 == 0 && !eVar.f3797e) {
                                byte[] bArr3 = new byte[b9.d()];
                                C0095a c0095a3 = new C0095a(bArr3);
                                b9.f(bArr3, 0, b9.d());
                                C1766a a2 = C1766a.a(c0095a3);
                                eVar.f3796d = a2.f17951b;
                                Format$Builder format$Builder4 = new Format$Builder();
                                format$Builder4.f10537k = "video/avc";
                                format$Builder4.f10535h = a2.f17955f;
                                format$Builder4.f10542p = a2.f17952c;
                                format$Builder4.f10543q = a2.f17953d;
                                format$Builder4.f10546t = a2.f17954e;
                                format$Builder4.f10539m = a2.f17950a;
                                vVar3.a(new X(format$Builder4));
                                eVar.f3797e = true;
                            } else if (t11 == 1 && eVar.f3797e) {
                                int i19 = eVar.f3799g == 1 ? 1 : 0;
                                if (eVar.f3798f || i19 != 0) {
                                    C0095a c0095a4 = eVar.f3795c;
                                    byte[] bArr4 = (byte[]) c0095a4.f1465c;
                                    bArr4[0] = 0;
                                    bArr4[1] = 0;
                                    bArr4[2] = 0;
                                    int i20 = 4 - eVar.f3796d;
                                    int i21 = 0;
                                    while (b9.d() > 0) {
                                        b9.f((byte[]) c0095a4.f1465c, i20, eVar.f3796d);
                                        c0095a4.D(0);
                                        int w7 = c0095a4.w();
                                        C0095a c0095a5 = eVar.f3794b;
                                        c0095a5.D(0);
                                        vVar3.c(4, c0095a5);
                                        vVar3.c(w7, b9);
                                        i21 = i21 + 4 + w7;
                                    }
                                    ((v) eVar.f364a).e(j8, i19, i21, 0, null);
                                    eVar.f3798f = true;
                                    if (z11) {
                                        z7 = true;
                                        z4 = true;
                                        if (!this.f3783h) {
                                            this.f3783h = true;
                                            this.f3784i = cVar.f3791b != -9223372036854775807L ? -this.f3787m : 0L;
                                        }
                                        this.j = 4;
                                        this.f3782g = 2;
                                        if (z4) {
                                        }
                                    }
                                }
                            }
                            z11 = false;
                            if (z11) {
                            }
                        }
                        z7 = false;
                        z4 = true;
                        if (!this.f3783h) {
                        }
                        this.j = 4;
                        this.f3782g = 2;
                        if (z4) {
                        }
                    }
                } else {
                    j = this.f3787m;
                }
                j3 = j;
                i7 = this.f3785k;
                if (i7 != 8) {
                }
                if (i7 == 9) {
                }
                if (i7 == 18) {
                }
                ((h) lVar).q(this.f3786l);
                z4 = false;
                z7 = false;
                if (!this.f3783h) {
                }
                this.j = 4;
                this.f3782g = 2;
                if (z4) {
                }
            }
        }
    }

    @Override // F1.k
    public final void g(long j, long j3) {
        if (j == 0) {
            this.f3782g = 1;
            this.f3783h = false;
        } else {
            this.f3782g = 3;
        }
        this.j = 0;
    }

    @Override // F1.k
    public final void release() {
    }
}
