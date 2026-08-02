package z0;

import r.C2315A;
import w0.AbstractC2540a;

/* renamed from: z0.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2756m extends b0.o {

    /* renamed from: y, reason: collision with root package name */
    public final int f21838y = f0.e(this);

    /* renamed from: z, reason: collision with root package name */
    public b0.o f21839z;

    public final void A0(int i, boolean z3) {
        b0.o oVar;
        int i5 = this.f7164m;
        this.f7164m = i;
        if (i5 != i) {
            b0.o oVar2 = this.f7162k;
            if (oVar2 == this) {
                this.f7165n = i;
            }
            if (this.f7175x) {
                b0.o oVar3 = this;
                while (oVar3 != null) {
                    i |= oVar3.f7164m;
                    oVar3.f7164m = i;
                    if (oVar3 == oVar2) {
                        break;
                    } else {
                        oVar3 = oVar3.f7166o;
                    }
                }
                if (z3 && oVar3 == oVar2) {
                    i = f0.f(oVar2);
                    oVar2.f7164m = i;
                }
                int i6 = i | ((oVar3 == null || (oVar = oVar3.f7167p) == null) ? 0 : oVar.f7165n);
                while (oVar3 != null) {
                    i6 |= oVar3.f7164m;
                    oVar3.f7165n = i6;
                    oVar3 = oVar3.f7166o;
                }
            }
        }
    }

    @Override // b0.o
    public final void m0() {
        super.m0();
        for (b0.o oVar = this.f21839z; oVar != null; oVar = oVar.f7167p) {
            oVar.x0(this.f7169r);
            if (!oVar.f7175x) {
                oVar.m0();
            }
        }
    }

    @Override // b0.o
    public final void n0() {
        for (b0.o oVar = this.f21839z; oVar != null; oVar = oVar.f7167p) {
            oVar.n0();
        }
        super.n0();
    }

    @Override // b0.o
    public final void t0() {
        super.t0();
        for (b0.o oVar = this.f21839z; oVar != null; oVar = oVar.f7167p) {
            oVar.t0();
        }
    }

    @Override // b0.o
    public final void u0() {
        for (b0.o oVar = this.f21839z; oVar != null; oVar = oVar.f7167p) {
            oVar.u0();
        }
        super.u0();
    }

    @Override // b0.o
    public final void v0() {
        super.v0();
        for (b0.o oVar = this.f21839z; oVar != null; oVar = oVar.f7167p) {
            oVar.v0();
        }
    }

    @Override // b0.o
    public final void w0(b0.o oVar) {
        this.f7162k = oVar;
        for (b0.o oVar2 = this.f21839z; oVar2 != null; oVar2 = oVar2.f7167p) {
            oVar2.w0(oVar);
        }
    }

    @Override // b0.o
    public final void x0(e0 e0Var) {
        this.f7169r = e0Var;
        for (b0.o oVar = this.f21839z; oVar != null; oVar = oVar.f7167p) {
            oVar.x0(e0Var);
        }
    }

    public final void y0(InterfaceC2755l interfaceC2755l) {
        b0.o oVar = ((b0.o) interfaceC2755l).f7162k;
        if (oVar != interfaceC2755l) {
            b0.o oVar2 = interfaceC2755l instanceof b0.o ? (b0.o) interfaceC2755l : null;
            b0.o oVar3 = oVar2 != null ? oVar2.f7166o : null;
            if (oVar != this.f7162k || !kotlin.jvm.internal.l.a(oVar3, this)) {
                throw new IllegalStateException("Cannot delegate to an already delegated node");
            }
            return;
        }
        if (oVar.f7175x) {
            AbstractC2540a.b("Cannot delegate to an already attached node");
        }
        oVar.w0(this.f7162k);
        int i = this.f7164m;
        int f = f0.f(oVar);
        oVar.f7164m = f;
        int i5 = this.f7164m;
        int i6 = f & 2;
        if (i6 != 0 && (i5 & 2) != 0 && !(this instanceof InterfaceC2765w)) {
            AbstractC2540a.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + oVar);
        }
        oVar.f7167p = this.f21839z;
        this.f21839z = oVar;
        oVar.f7166o = this;
        A0(f | this.f7164m, false);
        if (this.f7175x) {
            if (i6 == 0 || (i & 2) != 0) {
                x0(this.f7169r);
            } else {
                c0 c0Var = AbstractC2749f.v(this).f21612O;
                this.f7162k.x0(null);
                c0Var.g();
            }
            oVar.m0();
            oVar.u0();
            if (!oVar.f7175x) {
                AbstractC2540a.b("autoInvalidateInsertedNode called on unattached node");
            }
            f0.a(oVar, -1, 1);
        }
    }

    public final void z0(InterfaceC2755l interfaceC2755l) {
        b0.o oVar = null;
        for (b0.o oVar2 = this.f21839z; oVar2 != null; oVar2 = oVar2.f7167p) {
            if (oVar2 == interfaceC2755l) {
                boolean z3 = oVar2.f7175x;
                if (z3) {
                    C2315A c2315a = f0.f21815a;
                    if (!z3) {
                        AbstractC2540a.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    f0.a(oVar2, -1, 2);
                    oVar2.v0();
                    oVar2.n0();
                }
                oVar2.w0(oVar2);
                oVar2.f7165n = 0;
                if (oVar == null) {
                    this.f21839z = oVar2.f7167p;
                } else {
                    oVar.f7167p = oVar2.f7167p;
                }
                oVar2.f7167p = null;
                oVar2.f7166o = null;
                int i = this.f7164m;
                int f = f0.f(this);
                A0(f, true);
                if (this.f7175x && (i & 2) != 0 && (f & 2) == 0) {
                    c0 c0Var = AbstractC2749f.v(this).f21612O;
                    this.f7162k.x0(null);
                    c0Var.g();
                    return;
                }
                return;
            }
            oVar = oVar2;
        }
        throw new IllegalStateException(("Could not find delegate: " + interfaceC2755l).toString());
    }
}
