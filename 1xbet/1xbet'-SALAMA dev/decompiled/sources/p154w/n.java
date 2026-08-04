package p154w;

import p149v.c;
import p149v.d;
import p149v.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f17256b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f17257c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public d f17258d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f17259e = new f(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17260f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f17261g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f17262h = new e(this);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f17263i = new e(this);
    public int j = 1;

    public n(e eVar) {
        this.f17256b = eVar;
    }

    public static void b(e eVar, e eVar2, int i7) {
        eVar.f17241l.add(eVar2);
        eVar.f17236f = i7;
        eVar2.f17240k.add(eVar);
    }

    public static e h(c cVar) {
        c cVar2 = cVar.f16914f;
        if (cVar2 == null) {
            return null;
        }
        int iE = p136t.e.e(cVar2.f16913e);
        e eVar = cVar2.f16912d;
        if (iE == 1) {
            return eVar.f16954d.f17262h;
        }
        if (iE == 2) {
            return eVar.f16956e.f17262h;
        }
        if (iE == 3) {
            return eVar.f16954d.f17263i;
        }
        if (iE == 4) {
            return eVar.f16956e.f17263i;
        }
        if (iE != 5) {
            return null;
        }
        return eVar.f16956e.f17247k;
    }

    public static e i(c cVar, int i7) {
        c cVar2 = cVar.f16914f;
        if (cVar2 == null) {
            return null;
        }
        e eVar = cVar2.f16912d;
        n nVar = i7 == 0 ? eVar.f16954d : eVar.f16956e;
        int iE = p136t.e.e(cVar2.f16913e);
        if (iE == 1 || iE == 2) {
            return nVar.f17262h;
        }
        if (iE == 3 || iE == 4) {
            return nVar.f17263i;
        }
        return null;
    }

    public final void c(e eVar, e eVar2, int i7, f fVar) {
        eVar.f17241l.add(eVar2);
        eVar.f17241l.add(this.f17259e);
        eVar.f17238h = i7;
        eVar.f17239i = fVar;
        eVar2.f17240k.add(eVar);
        fVar.f17240k.add(eVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i7, int i8) {
        int iMax;
        if (i8 == 0) {
            e eVar = this.f17256b;
            int i9 = eVar.f16988v;
            iMax = Math.max(eVar.f16987u, i7);
            if (i9 > 0) {
                iMax = Math.min(i9, i7);
            }
            if (iMax == i7) {
                return i7;
            }
        } else {
            e eVar2 = this.f17256b;
            int i10 = eVar2.f16991y;
            iMax = Math.max(eVar2.f16990x, i7);
            if (i10 > 0) {
                iMax = Math.min(i10, i7);
            }
            if (iMax == i7) {
                return i7;
            }
        }
        return iMax;
    }

    public long j() {
        f fVar = this.f17259e;
        if (fVar.j) {
            return fVar.f17237g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:29:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0064  */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    public final void l(c cVar, c cVar2, int i7) {
        f fVar;
        float f7;
        int i8;
        e eVarH = h(cVar);
        e eVarH2 = h(cVar2);
        if (eVarH.j && eVarH2.j) {
            int iE = cVar.e() + eVarH.f17237g;
            int iE2 = eVarH2.f17237g - cVar2.e();
            int i9 = iE2 - iE;
            f fVar2 = this.f17259e;
            if (!fVar2.j) {
                d dVar = this.f17258d;
                d dVar2 = d.f16920c;
                if (dVar == dVar2) {
                    int i10 = this.f17255a;
                    if (i10 == 0) {
                        fVar2.d(g(i9, i7));
                    } else if (i10 == 1) {
                        fVar2.d(Math.min(g(fVar2.f17242m, i7), i9));
                    } else if (i10 == 2) {
                        e eVar = this.f17256b;
                        e eVar2 = eVar.f16944V;
                        if (eVar2 != null) {
                            f fVar3 = (i7 == 0 ? eVar2.f16954d : eVar2.f16956e).f17259e;
                            if (fVar3.j) {
                                fVar2.d(g((int) ((fVar3.f17237g * (i7 == 0 ? eVar.f16989w : eVar.f16992z)) + 0.5f), i7));
                            }
                        }
                    } else if (i10 == 3) {
                        e eVar3 = this.f17256b;
                        n nVar = eVar3.f16954d;
                        if (nVar.f17258d == dVar2 && nVar.f17255a == 3) {
                            l lVar = eVar3.f16956e;
                            if (lVar.f17258d != dVar2 || lVar.f17255a != 3) {
                                if (i7 == 0) {
                                    nVar = eVar3.f16956e;
                                }
                                fVar = nVar.f17259e;
                                if (fVar.j) {
                                    f7 = eVar3.f16947Y;
                                    if (i7 == 1) {
                                        i8 = (int) ((fVar.f17237g / f7) + 0.5f);
                                    } else {
                                        i8 = (int) ((f7 * fVar.f17237g) + 0.5f);
                                    }
                                    fVar2.d(i8);
                                }
                            }
                        } else {
                            if (i7 == 0) {
                                nVar = eVar3.f16956e;
                            }
                            fVar = nVar.f17259e;
                            if (fVar.j) {
                                f7 = eVar3.f16947Y;
                                if (i7 == 1) {
                                    i8 = (int) ((fVar.f17237g / f7) + 0.5f);
                                } else {
                                    i8 = (int) ((f7 * fVar.f17237g) + 0.5f);
                                }
                                fVar2.d(i8);
                            }
                        }
                    }
                }
            }
            if (fVar2.j) {
                int i11 = fVar2.f17237g;
                e eVar4 = this.f17263i;
                e eVar5 = this.f17262h;
                if (i11 == i9) {
                    eVar5.d(iE);
                    eVar4.d(iE2);
                    return;
                }
                e eVar6 = this.f17256b;
                float f8 = i7 == 0 ? eVar6.f16959f0 : eVar6.f16961g0;
                if (eVarH == eVarH2) {
                    iE = eVarH.f17237g;
                    iE2 = eVarH2.f17237g;
                    f8 = 0.5f;
                }
                eVar5.d((int) ((((iE2 - iE) - i11) * f8) + iE + 0.5f));
                eVar4.d(eVar5.f17237g + fVar2.f17237g);
            }
        }
    }
}
