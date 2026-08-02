package D9;

import h9.s;

/* loaded from: classes9.dex */
final class h extends g {

    /* renamed from: c, reason: collision with root package name */
    private final boolean f6188c;

    h(c cVar, boolean z11) {
        super(cVar);
        this.f6188c = z11;
    }

    private void k(d[] dVarArr, a aVar) {
        for (int i11 = 0; i11 < dVarArr.length; i11++) {
            d dVar = dVarArr[i11];
            if (dVar != null) {
                int e11 = dVar.e() % 30;
                int c11 = dVar.c();
                if (c11 > aVar.c()) {
                    dVarArr[i11] = null;
                } else {
                    if (!this.f6188c) {
                        c11 += 2;
                    }
                    int i12 = c11 % 3;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2 && e11 + 1 != aVar.a()) {
                                dVarArr[i11] = null;
                            }
                        } else if (e11 / 3 != aVar.b() || e11 % 3 != aVar.d()) {
                            dVarArr[i11] = null;
                        }
                    } else if ((e11 * 3) + 1 != aVar.e()) {
                        dVarArr[i11] = null;
                    }
                }
            }
        }
    }

    final void g(a aVar) {
        d[] d11 = d();
        for (d dVar : d()) {
            if (dVar != null) {
                dVar.j();
            }
        }
        k(d11, aVar);
        c a11 = a();
        boolean z11 = this.f6188c;
        s h11 = z11 ? a11.h() : a11.i();
        s b11 = z11 ? a11.b() : a11.c();
        int e11 = e((int) h11.c());
        int e12 = e((int) b11.c());
        int i11 = -1;
        int i12 = 0;
        int i13 = 1;
        while (e11 < e12) {
            d dVar2 = d11[e11];
            if (dVar2 != null) {
                int c11 = dVar2.c() - i11;
                if (c11 == 0) {
                    i12++;
                } else {
                    if (c11 == 1) {
                        i13 = Math.max(i13, i12);
                        i11 = dVar2.c();
                    } else if (c11 < 0 || dVar2.c() >= aVar.c() || c11 > e11) {
                        d11[e11] = null;
                    } else {
                        if (i13 > 2) {
                            c11 *= i13 - 2;
                        }
                        boolean z12 = c11 >= e11;
                        for (int i14 = 1; i14 <= c11 && !z12; i14++) {
                            z12 = d11[e11 - i14] != null;
                        }
                        if (z12) {
                            d11[e11] = null;
                        } else {
                            i11 = dVar2.c();
                        }
                    }
                    i12 = 1;
                }
            }
            e11++;
        }
    }

    final a h() {
        d[] d11 = d();
        b bVar = new b();
        b bVar2 = new b();
        b bVar3 = new b();
        b bVar4 = new b();
        for (d dVar : d11) {
            if (dVar != null) {
                dVar.j();
                int e11 = dVar.e() % 30;
                int c11 = dVar.c();
                if (!this.f6188c) {
                    c11 += 2;
                }
                int i11 = c11 % 3;
                if (i11 == 0) {
                    bVar2.b((e11 * 3) + 1);
                } else if (i11 == 1) {
                    bVar4.b(e11 / 3);
                    bVar3.b(e11 % 3);
                } else if (i11 == 2) {
                    bVar.b(e11 + 1);
                }
            }
        }
        if (bVar.a().length == 0 || bVar2.a().length == 0 || bVar3.a().length == 0 || bVar4.a().length == 0 || bVar.a()[0] <= 0 || bVar2.a()[0] + bVar3.a()[0] < 3 || bVar2.a()[0] + bVar3.a()[0] > 90) {
            return null;
        }
        a aVar = new a(bVar.a()[0], bVar2.a()[0], bVar3.a()[0], bVar4.a()[0]);
        k(d11, aVar);
        return aVar;
    }

    final int[] i() {
        int c11;
        a h11 = h();
        if (h11 == null) {
            return null;
        }
        c a11 = a();
        boolean z11 = this.f6188c;
        s h12 = z11 ? a11.h() : a11.i();
        s b11 = z11 ? a11.b() : a11.c();
        int e11 = e((int) b11.c());
        d[] d11 = d();
        int i11 = -1;
        int i12 = 0;
        int i13 = 1;
        for (int e12 = e((int) h12.c()); e12 < e11; e12++) {
            d dVar = d11[e12];
            if (dVar != null) {
                dVar.j();
                int c12 = dVar.c() - i11;
                if (c12 == 0) {
                    i12++;
                } else {
                    if (c12 == 1) {
                        i13 = Math.max(i13, i12);
                        i11 = dVar.c();
                    } else if (dVar.c() >= h11.c()) {
                        d11[e12] = null;
                    } else {
                        i11 = dVar.c();
                    }
                    i12 = 1;
                }
            }
        }
        int c13 = h11.c();
        int[] iArr = new int[c13];
        for (d dVar2 : d()) {
            if (dVar2 != null && (c11 = dVar2.c()) < c13) {
                iArr[c11] = iArr[c11] + 1;
            }
        }
        return iArr;
    }

    final boolean j() {
        return this.f6188c;
    }

    @Override // D9.g
    public final String toString() {
        return "IsLeft: " + this.f6188c + '\n' + super.toString();
    }
}
