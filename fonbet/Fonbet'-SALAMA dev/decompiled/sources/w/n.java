package w;

import v.C1652c;
import v.C1654e;
import v.EnumC1653d;

/* loaded from: classes.dex */
public abstract class n implements InterfaceC1671d {

    /* renamed from: a, reason: collision with root package name */
    public int f17249a;

    /* renamed from: b, reason: collision with root package name */
    public C1654e f17250b;

    /* renamed from: c, reason: collision with root package name */
    public k f17251c;

    /* renamed from: d, reason: collision with root package name */
    public EnumC1653d f17252d;

    /* renamed from: e, reason: collision with root package name */
    public final f f17253e = new f(this);

    /* renamed from: f, reason: collision with root package name */
    public int f17254f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17255g = false;

    /* renamed from: h, reason: collision with root package name */
    public final e f17256h = new e(this);

    /* renamed from: i, reason: collision with root package name */
    public final e f17257i = new e(this);
    public int j = 1;

    public n(C1654e c1654e) {
        this.f17250b = c1654e;
    }

    public static void b(e eVar, e eVar2, int i7) {
        eVar.f17235l.add(eVar2);
        eVar.f17230f = i7;
        eVar2.f17234k.add(eVar);
    }

    public static e h(C1652c c1652c) {
        C1652c c1652c2 = c1652c.f16908f;
        if (c1652c2 == null) {
            return null;
        }
        int e7 = t.e.e(c1652c2.f16907e);
        C1654e c1654e = c1652c2.f16906d;
        if (e7 == 1) {
            return c1654e.f16948d.f17256h;
        }
        if (e7 == 2) {
            return c1654e.f16950e.f17256h;
        }
        if (e7 == 3) {
            return c1654e.f16948d.f17257i;
        }
        if (e7 == 4) {
            return c1654e.f16950e.f17257i;
        }
        if (e7 != 5) {
            return null;
        }
        return c1654e.f16950e.f17241k;
    }

    public static e i(C1652c c1652c, int i7) {
        C1652c c1652c2 = c1652c.f16908f;
        if (c1652c2 == null) {
            return null;
        }
        C1654e c1654e = c1652c2.f16906d;
        n nVar = i7 == 0 ? c1654e.f16948d : c1654e.f16950e;
        int e7 = t.e.e(c1652c2.f16907e);
        if (e7 == 1 || e7 == 2) {
            return nVar.f17256h;
        }
        if (e7 == 3 || e7 == 4) {
            return nVar.f17257i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i7, f fVar) {
        eVar.f17235l.add(eVar2);
        eVar.f17235l.add(this.f17253e);
        eVar.f17232h = i7;
        eVar.f17233i = fVar;
        eVar2.f17234k.add(eVar);
        fVar.f17234k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i7, int i8) {
        int max;
        if (i8 == 0) {
            C1654e c1654e = this.f17250b;
            int i9 = c1654e.f16982v;
            max = Math.max(c1654e.f16981u, i7);
            if (i9 > 0) {
                max = Math.min(i9, i7);
            }
            if (max == i7) {
                return i7;
            }
        } else {
            C1654e c1654e2 = this.f17250b;
            int i10 = c1654e2.f16985y;
            max = Math.max(c1654e2.f16984x, i7);
            if (i10 > 0) {
                max = Math.min(i10, i7);
            }
            if (max == i7) {
                return i7;
            }
        }
        return max;
    }

    public long j() {
        if (this.f17253e.j) {
            return r0.f17231g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0053, code lost:
    
        if (r10.f17249a == 3) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l(C1652c c1652c, C1652c c1652c2, int i7) {
        e h6 = h(c1652c);
        e h7 = h(c1652c2);
        if (h6.j && h7.j) {
            int e7 = c1652c.e() + h6.f17231g;
            int e8 = h7.f17231g - c1652c2.e();
            int i8 = e8 - e7;
            f fVar = this.f17253e;
            if (!fVar.j) {
                EnumC1653d enumC1653d = this.f17252d;
                EnumC1653d enumC1653d2 = EnumC1653d.f16914c;
                if (enumC1653d == enumC1653d2) {
                    int i9 = this.f17249a;
                    if (i9 == 0) {
                        fVar.d(g(i8, i7));
                    } else if (i9 == 1) {
                        fVar.d(Math.min(g(fVar.f17236m, i7), i8));
                    } else if (i9 == 2) {
                        C1654e c1654e = this.f17250b;
                        C1654e c1654e2 = c1654e.f16938V;
                        if (c1654e2 != null) {
                            if ((i7 == 0 ? c1654e2.f16948d : c1654e2.f16950e).f17253e.j) {
                                fVar.d(g((int) ((r6.f17231g * (i7 == 0 ? c1654e.f16983w : c1654e.f16986z)) + 0.5f), i7));
                            }
                        }
                    } else if (i9 == 3) {
                        C1654e c1654e3 = this.f17250b;
                        n nVar = c1654e3.f16948d;
                        if (nVar.f17252d == enumC1653d2 && nVar.f17249a == 3) {
                            l lVar = c1654e3.f16950e;
                            if (lVar.f17252d == enumC1653d2) {
                            }
                        }
                        if (i7 == 0) {
                            nVar = c1654e3.f16950e;
                        }
                        if (nVar.f17253e.j) {
                            float f7 = c1654e3.f16941Y;
                            fVar.d(i7 == 1 ? (int) ((r6.f17231g / f7) + 0.5f) : (int) ((f7 * r6.f17231g) + 0.5f));
                        }
                    }
                }
            }
            if (fVar.j) {
                int i10 = fVar.f17231g;
                e eVar = this.f17257i;
                e eVar2 = this.f17256h;
                if (i10 == i8) {
                    eVar2.d(e7);
                    eVar.d(e8);
                    return;
                }
                C1654e c1654e4 = this.f17250b;
                float f8 = i7 == 0 ? c1654e4.f16953f0 : c1654e4.f16955g0;
                if (h6 == h7) {
                    e7 = h6.f17231g;
                    e8 = h7.f17231g;
                    f8 = 0.5f;
                }
                eVar2.d((int) ((((e8 - e7) - i10) * f8) + e7 + 0.5f));
                eVar.d(eVar2.f17231g + fVar.f17231g);
            }
        }
    }
}
