package H0;

import A.B;
import h0.C1989c;
import java.util.ArrayList;
import java.util.List;
import r.C2321G;
import x0.f0;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.e0;
import z0.v0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final b0.o f2111a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2112b;

    /* renamed from: c, reason: collision with root package name */
    public final C2731G f2113c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2114d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2115e;
    public n f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2116g;

    public n(b0.o oVar, boolean z3, C2731G c2731g, j jVar) {
        this.f2111a = oVar;
        this.f2112b = z3;
        this.f2113c = c2731g;
        this.f2114d = jVar;
        this.f2116g = c2731g.f21625l;
    }

    public static /* synthetic */ List j(int i, n nVar) {
        return nVar.i((i & 1) != 0 ? !nVar.f2112b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final C1989c a(e0 e0Var) {
        AbstractC2756m abstractC2756m;
        n l5 = l();
        if (l5 == null) {
            return C1989c.f17192e;
        }
        b0.o oVar = l5.f2113c.f21612O.f;
        if ((oVar.f7165n & 8) != 0) {
            loop0: while (oVar != null) {
                if ((oVar.f7164m & 8) != 0) {
                    abstractC2756m = oVar;
                    ?? r6 = 0;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof v0) {
                            if (abstractC2756m.j()) {
                                break loop0;
                            }
                        } else if ((abstractC2756m.f7164m & 8) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar2 = abstractC2756m.f21839z;
                            int i = 0;
                            abstractC2756m = abstractC2756m;
                            r6 = r6;
                            while (oVar2 != null) {
                                if ((oVar2.f7164m & 8) != 0) {
                                    i++;
                                    r6 = r6;
                                    if (i == 1) {
                                        abstractC2756m = oVar2;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new R.e(new b0.o[16]);
                                        }
                                        if (abstractC2756m != 0) {
                                            r6.c(abstractC2756m);
                                            abstractC2756m = 0;
                                        }
                                        r6.c(oVar2);
                                    }
                                }
                                oVar2 = oVar2.f7167p;
                                abstractC2756m = abstractC2756m;
                                r6 = r6;
                            }
                            if (i == 1) {
                            }
                        }
                        abstractC2756m = AbstractC2749f.f(r6);
                    }
                }
                if ((oVar.f7165n & 8) == 0) {
                    break;
                }
                oVar = oVar.f7167p;
            }
        }
        abstractC2756m = 0;
        v0 v0Var = (v0) abstractC2756m;
        e0 t5 = v0Var != null ? AbstractC2749f.t(v0Var, 8) : null;
        return t5 == null ? l5.a(e0Var) : t5.s(e0Var, true);
    }

    public final n b(g gVar, i4.c cVar) {
        j jVar = new j();
        jVar.f2105m = false;
        jVar.f2106n = false;
        cVar.c(jVar);
        n nVar = new n(new m(cVar), false, new C2731G(this.f2116g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        nVar.f2115e = true;
        nVar.f = this;
        return nVar;
    }

    public final void c(C2731G c2731g, ArrayList arrayList) {
        R.e x5 = c2731g.x();
        Object[] objArr = x5.f5106k;
        int i = x5.f5108m;
        for (int i5 = 0; i5 < i; i5++) {
            C2731G c2731g2 = (C2731G) objArr[i5];
            if (c2731g2.I() && !c2731g2.f21623Z) {
                if (c2731g2.f21612O.d(8)) {
                    arrayList.add(q.a(c2731g2, this.f2112b));
                } else {
                    c(c2731g2, arrayList);
                }
            }
        }
    }

    public final e0 d() {
        if (!this.f2115e) {
            v0 f = f();
            return f != null ? AbstractC2749f.t(f, 8) : this.f2113c.f21612O.f21768c;
        }
        n l5 = l();
        if (l5 != null) {
            return l5.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (nVar.n()) {
                arrayList2.add(nVar);
            } else if (!nVar.f2114d.f2106n) {
                nVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v14, types: [z0.v0] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [R.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final v0 f() {
        b0.o oVar;
        boolean z3 = this.f2114d.f2105m;
        C2731G c2731g = this.f2113c;
        Object obj = null;
        if (!z3) {
            b0.o oVar2 = c2731g.f21612O.f;
            if ((oVar2.f7165n & 8) != 0) {
                loop3: while (oVar2 != null) {
                    if ((oVar2.f7164m & 8) != 0) {
                        oVar = oVar2;
                        R.e eVar = null;
                        while (oVar != null) {
                            if (oVar instanceof v0) {
                                if (((v0) oVar).j()) {
                                    obj = oVar;
                                }
                            } else if ((oVar.f7164m & 8) != 0 && (oVar instanceof AbstractC2756m)) {
                                int i = 0;
                                for (b0.o oVar3 = ((AbstractC2756m) oVar).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                    if ((oVar3.f7164m & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            oVar = oVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new R.e(new b0.o[16]);
                                            }
                                            if (oVar != null) {
                                                eVar.c(oVar);
                                                oVar = null;
                                            }
                                            eVar.c(oVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            oVar = AbstractC2749f.f(eVar);
                        }
                    }
                    if ((oVar2.f7165n & 8) == 0) {
                        break;
                    }
                    oVar2 = oVar2.f7167p;
                }
            }
            return (v0) obj;
        }
        b0.o oVar4 = c2731g.f21612O.f;
        if ((oVar4.f7165n & 8) != 0) {
            oVar = null;
            while (oVar4 != null) {
                if ((oVar4.f7164m & 8) != 0) {
                    AbstractC2756m abstractC2756m = oVar4;
                    ?? r7 = 0;
                    while (abstractC2756m != 0) {
                        if (abstractC2756m instanceof v0) {
                            ?? r6 = (v0) abstractC2756m;
                            if (r6.j()) {
                                if (r6.Z()) {
                                    return r6;
                                }
                                if (oVar == null) {
                                    oVar = r6;
                                }
                            }
                        } else if ((abstractC2756m.f7164m & 8) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                            b0.o oVar5 = abstractC2756m.f21839z;
                            int i5 = 0;
                            abstractC2756m = abstractC2756m;
                            r7 = r7;
                            while (oVar5 != null) {
                                if ((oVar5.f7164m & 8) != 0) {
                                    i5++;
                                    r7 = r7;
                                    if (i5 == 1) {
                                        abstractC2756m = oVar5;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new R.e(new b0.o[16]);
                                        }
                                        if (abstractC2756m != 0) {
                                            r7.c(abstractC2756m);
                                            abstractC2756m = 0;
                                        }
                                        r7.c(oVar5);
                                    }
                                }
                                oVar5 = oVar5.f7167p;
                                abstractC2756m = abstractC2756m;
                                r7 = r7;
                            }
                            if (i5 == 1) {
                            }
                        }
                        abstractC2756m = AbstractC2749f.f(r7);
                    }
                }
                if ((oVar4.f7165n & 8) == 0) {
                    break;
                }
                oVar4 = oVar4.f7167p;
            }
            obj = oVar;
        }
        return (v0) obj;
    }

    public final C1989c g() {
        e0 d5 = d();
        if (d5 != null) {
            if (!d5.I0().f7175x) {
                d5 = null;
            }
            if (d5 != null) {
                return f0.h(d5).s(d5, true);
            }
        }
        return C1989c.f17192e;
    }

    public final C1989c h() {
        e0 d5 = d();
        if (d5 != null) {
            if (!d5.I0().f7175x) {
                d5 = null;
            }
            if (d5 != null) {
                return f0.f(d5);
            }
        }
        return C1989c.f17192e;
    }

    public final List i(boolean z3, boolean z5) {
        if (!z3 && this.f2114d.f2106n) {
            return X3.v.f6090k;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z5);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final j k() {
        boolean n5 = n();
        j jVar = this.f2114d;
        if (!n5) {
            return jVar;
        }
        j c5 = jVar.c();
        p(new ArrayList(), c5);
        return c5;
    }

    public final n l() {
        C2731G c2731g;
        n nVar = this.f;
        if (nVar != null) {
            return nVar;
        }
        C2731G c2731g2 = this.f2113c;
        boolean z3 = this.f2112b;
        if (z3) {
            c2731g = c2731g2.u();
            while (c2731g != null) {
                j w5 = c2731g.w();
                if (w5 != null && w5.f2105m) {
                    break;
                }
                c2731g = c2731g.u();
            }
        }
        c2731g = null;
        if (c2731g == null) {
            C2731G u5 = c2731g2.u();
            while (true) {
                if (u5 == null) {
                    c2731g = null;
                    break;
                }
                if (u5.f21612O.d(8)) {
                    c2731g = u5;
                    break;
                }
                u5 = u5.u();
            }
        }
        if (c2731g == null) {
            return null;
        }
        return q.a(c2731g, z3);
    }

    public final j m() {
        return this.f2114d;
    }

    public final boolean n() {
        return this.f2112b && this.f2114d.f2105m;
    }

    public final boolean o() {
        if (this.f2115e || !j(4, this).isEmpty()) {
            return false;
        }
        C2731G u5 = this.f2113c.u();
        while (true) {
            if (u5 == null) {
                u5 = null;
                break;
            }
            j w5 = u5.w();
            if (w5 != null && w5.f2105m) {
                break;
            }
            u5 = u5.u();
        }
        return u5 == null;
    }

    public final void p(ArrayList arrayList, j jVar) {
        if (this.f2114d.f2106n) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (!nVar.n()) {
                jVar.e(nVar.f2114d);
                nVar.p(arrayList, jVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z3) {
        if (this.f2115e) {
            return X3.v.f6090k;
        }
        c(this.f2113c, arrayList);
        if (z3) {
            v vVar = s.f2178x;
            j jVar = this.f2114d;
            C2321G c2321g = jVar.f2103k;
            Object g5 = c2321g.g(vVar);
            if (g5 == null) {
                g5 = null;
            }
            g gVar = (g) g5;
            if (gVar != null && jVar.f2105m && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new B(15, gVar)));
            }
            v vVar2 = s.f2157a;
            if (c2321g.c(vVar2) && !arrayList.isEmpty() && jVar.f2105m) {
                Object g6 = c2321g.g(vVar2);
                if (g6 == null) {
                    g6 = null;
                }
                List list = (List) g6;
                String str = list != null ? (String) X3.m.Z(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new l(str, 0)));
                }
            }
        }
        return arrayList;
    }
}
