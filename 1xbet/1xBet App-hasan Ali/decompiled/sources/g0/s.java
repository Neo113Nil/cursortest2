package g0;

import A0.C0060u;
import A0.F;
import A0.I0;
import E.q0;
import android.os.Trace;
import kotlin.jvm.internal.w;
import q0.C2296a;
import v.AbstractC2529y;
import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.C2731G;
import z0.InterfaceC2754k;
import z0.c0;
import z0.i0;

/* loaded from: classes.dex */
public final class s extends b0.o implements InterfaceC2754k, i0, y0.d {

    /* renamed from: A, reason: collision with root package name */
    public boolean f17059A;

    /* renamed from: B, reason: collision with root package name */
    public final int f17060B;

    /* renamed from: y, reason: collision with root package name */
    public final i4.c f17061y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f17062z;

    public s(q0 q0Var, int i) {
        int i5 = (i & 1) != 0 ? 1 : 2;
        this.f17061y = (i & 4) != 0 ? null : q0Var;
        this.f17060B = i5;
    }

    public final r A0() {
        c0 c0Var;
        boolean z3 = this.f7175x;
        r rVar = r.f17057n;
        if (!z3) {
            return rVar;
        }
        C1965j c1965j = (C1965j) ((F) AbstractC2749f.w(this)).getFocusOwner();
        s sVar = c1965j.f17035h;
        if (sVar == null) {
            return rVar;
        }
        if (this == sVar) {
            c1965j.getClass();
            return r.f17054k;
        }
        if (sVar.f7175x) {
            if (!sVar.f7162k.f7175x) {
                AbstractC2540a.b("visitAncestors called on an unattached node");
            }
            b0.o oVar = sVar.f7162k.f7166o;
            C2731G v4 = AbstractC2749f.v(sVar);
            while (v4 != null) {
                if ((v4.f21612O.f.f7165n & 1024) != 0) {
                    while (oVar != null) {
                        if ((oVar.f7164m & 1024) != 0) {
                            b0.o oVar2 = oVar;
                            R.e eVar = null;
                            while (oVar2 != null) {
                                if (oVar2 instanceof s) {
                                    if (this == ((s) oVar2)) {
                                        return r.f17055l;
                                    }
                                } else if ((oVar2.f7164m & 1024) != 0 && (oVar2 instanceof AbstractC2756m)) {
                                    int i = 0;
                                    for (b0.o oVar3 = ((AbstractC2756m) oVar2).f21839z; oVar3 != null; oVar3 = oVar3.f7167p) {
                                        if ((oVar3.f7164m & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                oVar2 = oVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new R.e(new b0.o[16]);
                                                }
                                                if (oVar2 != null) {
                                                    eVar.c(oVar2);
                                                    oVar2 = null;
                                                }
                                                eVar.c(oVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                oVar2 = AbstractC2749f.f(eVar);
                            }
                        }
                        oVar = oVar.f7166o;
                    }
                }
                v4 = v4.u();
                oVar = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
            }
        }
        return rVar;
    }

    public final void B0() {
        int ordinal = A0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new D2.e();
                }
                return;
            }
        }
        w wVar = new w();
        AbstractC2749f.s(this, new C0060u(9, wVar, this));
        Object obj = wVar.f17624k;
        if (obj == null) {
            kotlin.jvm.internal.l.k("focusProperties");
            throw null;
        }
        if (((InterfaceC1966k) obj).a()) {
            return;
        }
        ((C1965j) ((F) AbstractC2749f.w(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean C0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z3 = false;
            if (!z0().f17040a) {
                Trace.endSection();
                return false;
            }
            int ordinal = AbstractC1961f.u(this, i).ordinal();
            if (ordinal == 0) {
                z3 = AbstractC1961f.v(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z3 = true;
                } else if (ordinal != 3) {
                    throw new D2.e();
                }
            }
            return z3;
        } finally {
            Trace.endSection();
        }
    }

    @Override // z0.i0
    public final void E() {
        B0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [i4.a, kotlin.jvm.internal.m] */
    /* JADX WARN: Type inference failed for: r2v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [R.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // y0.f
    public final Object J(y0.g gVar) {
        c0 c0Var;
        if (!this.f7162k.f7175x) {
            AbstractC2540a.a("ModifierLocal accessed from an unattached node");
        }
        if (!this.f7162k.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar = this.f7162k.f7166o;
        C2731G v4 = AbstractC2749f.v(this);
        while (v4 != null) {
            if ((v4.f21612O.f.f7165n & 32) != 0) {
                while (oVar != null) {
                    if ((oVar.f7164m & 32) != 0) {
                        AbstractC2756m abstractC2756m = oVar;
                        ?? r42 = 0;
                        while (abstractC2756m != 0) {
                            if (abstractC2756m instanceof y0.d) {
                                y0.d dVar = (y0.d) abstractC2756m;
                                if (dVar.k().b(gVar)) {
                                    return dVar.k().d(gVar);
                                }
                            } else if ((abstractC2756m.f7164m & 32) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                b0.o oVar2 = abstractC2756m.f21839z;
                                int i = 0;
                                abstractC2756m = abstractC2756m;
                                r42 = r42;
                                while (oVar2 != null) {
                                    if ((oVar2.f7164m & 32) != 0) {
                                        i++;
                                        r42 = r42;
                                        if (i == 1) {
                                            abstractC2756m = oVar2;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new R.e(new b0.o[16]);
                                            }
                                            if (abstractC2756m != 0) {
                                                r42.c(abstractC2756m);
                                                abstractC2756m = 0;
                                            }
                                            r42.c(oVar2);
                                        }
                                    }
                                    oVar2 = oVar2.f7167p;
                                    abstractC2756m = abstractC2756m;
                                    r42 = r42;
                                }
                                if (i == 1) {
                                }
                            }
                            abstractC2756m = AbstractC2749f.f(r42);
                        }
                    }
                    oVar = oVar.f7166o;
                }
            }
            v4 = v4.u();
            oVar = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
        return gVar.f21134a.invoke();
    }

    @Override // y0.d
    public final /* synthetic */ AbstractC2529y k() {
        return y0.b.f21128a;
    }

    @Override // b0.o
    public final boolean l0() {
        return false;
    }

    @Override // b0.o
    public final void q0() {
        int ordinal = A0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new D2.e();
                }
                return;
            }
        }
        C1965j c1965j = (C1965j) ((F) AbstractC2749f.w(this)).getFocusOwner();
        c1965j.b(8, true, false);
        c1965j.f17032d.a();
    }

    @Override // b0.o
    public final void s0() {
        if (A0().a()) {
            ((C1965j) ((F) AbstractC2749f.w(this)).getFocusOwner()).b(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [R.e] */
    public final void y0(r rVar, r rVar2) {
        c0 c0Var;
        C1965j c1965j = (C1965j) ((F) AbstractC2749f.w(this)).getFocusOwner();
        s sVar = c1965j.f17035h;
        rVar.equals(rVar2);
        b0.o oVar = this.f7162k;
        if (!oVar.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar2 = this.f7162k;
        C2731G v4 = AbstractC2749f.v(this);
        loop0: while (v4 != null) {
            if ((v4.f21612O.f.f7165n & 5120) != 0) {
                while (oVar2 != null) {
                    int i = oVar2.f7164m;
                    if ((i & 5120) != 0) {
                        if (oVar2 != oVar && (i & 1024) != 0) {
                            break loop0;
                        }
                        if ((i & 4096) != 0) {
                            AbstractC2756m abstractC2756m = oVar2;
                            ?? r6 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof InterfaceC1960e) {
                                    InterfaceC1960e interfaceC1960e = (InterfaceC1960e) abstractC2756m;
                                    if (sVar == c1965j.f17035h) {
                                        interfaceC1960e.m(rVar2);
                                    }
                                } else if ((abstractC2756m.f7164m & 4096) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar3 = abstractC2756m.f21839z;
                                    int i5 = 0;
                                    abstractC2756m = abstractC2756m;
                                    r6 = r6;
                                    while (oVar3 != null) {
                                        if ((oVar3.f7164m & 4096) != 0) {
                                            i5++;
                                            r6 = r6;
                                            if (i5 == 1) {
                                                abstractC2756m = oVar3;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r6.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r6.c(oVar3);
                                            }
                                        }
                                        oVar3 = oVar3.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r6 = r6;
                                    }
                                    if (i5 == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r6);
                            }
                        }
                    }
                    oVar2 = oVar2.f7166o;
                }
            }
            v4 = v4.u();
            oVar2 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
        i4.c cVar = this.f17061y;
        if (cVar != null) {
            cVar.c(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [b0.o] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [R.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [R.e] */
    public final m z0() {
        boolean z3;
        c0 c0Var;
        m mVar = new m();
        mVar.f17040a = true;
        o oVar = o.f17049b;
        mVar.f17041b = oVar;
        mVar.f17042c = oVar;
        mVar.f17043d = oVar;
        mVar.f17044e = oVar;
        mVar.f = oVar;
        mVar.f17045g = oVar;
        mVar.f17046h = oVar;
        mVar.i = oVar;
        mVar.f17047j = l.f17036m;
        mVar.f17048k = l.f17037n;
        int i = this.f17060B;
        if (i == 1) {
            z3 = true;
        } else if (i == 0) {
            z3 = !(((C2296a) ((q0.c) ((q0.b) AbstractC2749f.i(this, I0.f291m))).f18855a.getValue()).f18854a == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z3 = false;
        }
        mVar.f17040a = z3;
        b0.o oVar2 = this.f7162k;
        if (!oVar2.f7175x) {
            AbstractC2540a.b("visitAncestors called on an unattached node");
        }
        b0.o oVar3 = this.f7162k;
        C2731G v4 = AbstractC2749f.v(this);
        loop0: while (v4 != null) {
            if ((v4.f21612O.f.f7165n & 3072) != 0) {
                while (oVar3 != null) {
                    int i5 = oVar3.f7164m;
                    if ((i5 & 3072) != 0) {
                        if (oVar3 != oVar2 && (i5 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i5 & 2048) != 0) {
                            AbstractC2756m abstractC2756m = oVar3;
                            ?? r8 = 0;
                            while (abstractC2756m != 0) {
                                if (abstractC2756m instanceof n) {
                                    ((n) abstractC2756m).F(mVar);
                                } else if ((abstractC2756m.f7164m & 2048) != 0 && (abstractC2756m instanceof AbstractC2756m)) {
                                    b0.o oVar4 = abstractC2756m.f21839z;
                                    int i6 = 0;
                                    abstractC2756m = abstractC2756m;
                                    r8 = r8;
                                    while (oVar4 != null) {
                                        if ((oVar4.f7164m & 2048) != 0) {
                                            i6++;
                                            r8 = r8;
                                            if (i6 == 1) {
                                                abstractC2756m = oVar4;
                                            } else {
                                                if (r8 == 0) {
                                                    r8 = new R.e(new b0.o[16]);
                                                }
                                                if (abstractC2756m != 0) {
                                                    r8.c(abstractC2756m);
                                                    abstractC2756m = 0;
                                                }
                                                r8.c(oVar4);
                                            }
                                        }
                                        oVar4 = oVar4.f7167p;
                                        abstractC2756m = abstractC2756m;
                                        r8 = r8;
                                    }
                                    if (i6 == 1) {
                                    }
                                }
                                abstractC2756m = AbstractC2749f.f(r8);
                            }
                        }
                    }
                    oVar3 = oVar3.f7166o;
                }
            }
            v4 = v4.u();
            oVar3 = (v4 == null || (c0Var = v4.f21612O) == null) ? null : c0Var.f21770e;
        }
        return mVar;
    }
}
