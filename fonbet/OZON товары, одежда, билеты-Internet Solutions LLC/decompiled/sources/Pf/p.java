package Pf;

import Pf.f;

/* loaded from: classes10.dex */
class p implements Qf.g {

    /* renamed from: a, reason: collision with root package name */
    final n f22493a;

    /* renamed from: b, reason: collision with root package name */
    final Of.b f22494b;

    /* renamed from: c, reason: collision with root package name */
    final f.a f22495c;

    static class a extends p {

        /* renamed from: d, reason: collision with root package name */
        boolean f22496d;

        static boolean i(n nVar) {
            return (nVar instanceof r) && ((r) nVar).P();
        }

        @Override // Pf.p
        final void d(h hVar, int i11) {
            if (k(hVar)) {
                h(i11);
            }
            hVar.A(this.f22494b, this.f22495c);
            if (hVar.f22471d.c(64)) {
                this.f22496d = true;
            }
        }

        @Override // Pf.p
        final void e(m mVar, int i11) {
            if (k(mVar)) {
                h(i11);
            }
            mVar.A(this.f22494b, this.f22495c);
        }

        @Override // Pf.p
        final void f(h hVar, int i11) {
            n o11 = hVar.o();
            while (i(o11)) {
                o11 = o11.v();
            }
            if (k(o11)) {
                h(i11);
            }
            hVar.T(this.f22494b, this.f22495c);
            if (this.f22496d && hVar.f22471d.c(64)) {
                do {
                    hVar = hVar.f22485a;
                    if (hVar == null) {
                        this.f22496d = false;
                        return;
                    }
                } while (!hVar.f22471d.k());
            }
        }

        @Override // Pf.p
        final void g(r rVar, int i11, int i12) {
            int i13;
            if (this.f22496d) {
                i13 = 0;
            } else {
                i13 = 4;
                if (j(rVar.f22485a)) {
                    n D11 = rVar.D();
                    n v11 = rVar.v();
                    if ((!(D11 instanceof h) || j(D11)) && (D11 == null || (!(D11 instanceof r) && k(D11)))) {
                        i13 = 12;
                    }
                    if (v11 == null || (!(v11 instanceof r) && k(v11))) {
                        i13 |= 16;
                    }
                }
                if (!rVar.P() && j(rVar.f22485a) && k(rVar)) {
                    h(i12);
                }
            }
            super.g(rVar, i13, i12);
        }

        boolean j(n nVar) {
            if (nVar == null || !(nVar instanceof h)) {
                return false;
            }
            h hVar = (h) nVar;
            org.jsoup.parser.m mVar = hVar.f22471d;
            if (mVar.d()) {
                return true;
            }
            if (!mVar.g()) {
                if (hVar.f22485a instanceof f) {
                    return true;
                }
                h S11 = hVar.S();
                for (int i11 = 0; i11 < 5 && S11 != null; i11++) {
                    org.jsoup.parser.m mVar2 = S11.f22471d;
                    if (mVar2.d() || !mVar2.g()) {
                        return true;
                    }
                    S11 = S11.u();
                }
            }
            return false;
        }

        boolean k(n nVar) {
            if (nVar != null && nVar != this.f22493a && !this.f22496d && !i(nVar)) {
                if (j(nVar)) {
                    return true;
                }
                n D11 = nVar.D();
                while (i(D11)) {
                    D11 = D11.D();
                }
                if (j(D11)) {
                    return true;
                }
                h hVar = nVar.f22485a;
                if (j(hVar) && !hVar.f22471d.c(8)) {
                    n o11 = hVar.o();
                    int i11 = 0;
                    while (true) {
                        if (i11 >= 5 || o11 == null) {
                            break;
                        }
                        if (!(o11 instanceof r)) {
                            if (D11 == null) {
                                return true;
                            }
                            if ((D11 instanceof r) || (!j(D11) && (D11 instanceof h))) {
                                break;
                            }
                            return true;
                        }
                        o11 = o11.v();
                        i11++;
                    }
                }
            }
            return false;
        }
    }

    p(n nVar, Of.b bVar, f.a aVar) {
        this.f22493a = nVar;
        this.f22494b = bVar;
        this.f22495c = aVar;
    }

    @Override // Qf.g
    public final void a(int i11, n nVar) {
        if (nVar.getClass() == r.class) {
            g((r) nVar, 0, i11);
        } else if (nVar instanceof h) {
            d((h) nVar, i11);
        } else {
            e((m) nVar, i11);
        }
    }

    @Override // Qf.g
    public final void b(int i11, n nVar) {
        if (nVar instanceof h) {
            f((h) nVar, i11);
        }
    }

    void d(h hVar, int i11) {
        hVar.A(this.f22494b, this.f22495c);
    }

    void e(m mVar, int i11) {
        mVar.A(this.f22494b, this.f22495c);
    }

    void f(h hVar, int i11) {
        hVar.T(this.f22494b, this.f22495c);
    }

    void g(r rVar, int i11, int i12) {
        String M11 = rVar.M();
        f.a aVar = this.f22495c;
        j.f(this.f22494b, M11, aVar, i11 | 1);
    }

    final void h(int i11) {
        Of.b a11 = this.f22494b.a('\n');
        f.a aVar = this.f22495c;
        a11.b(Of.k.k(aVar.d() * i11, aVar.e()));
    }
}
