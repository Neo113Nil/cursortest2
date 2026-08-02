package Z0;

import A0.F;
import android.view.View;
import android.view.ViewTreeObserver;
import g0.AbstractC1961f;
import g0.C1965j;
import g0.InterfaceC1964i;
import g0.InterfaceC1966k;
import g0.s;
import w0.AbstractC2540a;
import z0.AbstractC2749f;
import z0.AbstractC2756m;
import z0.n0;

/* loaded from: classes.dex */
public final class o extends b0.o implements g0.n, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: A, reason: collision with root package name */
    public final n f6327A = new n(this, 0);

    /* renamed from: B, reason: collision with root package name */
    public final n f6328B = new n(this, 1);

    /* renamed from: y, reason: collision with root package name */
    public View f6329y;

    /* renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f6330z;

    @Override // g0.n
    public final void F(InterfaceC1966k interfaceC1966k) {
        interfaceC1966k.b(false);
        interfaceC1966k.c(this.f6327A);
        interfaceC1966k.d(this.f6328B);
    }

    @Override // b0.o
    public final void o0() {
        ViewTreeObserver viewTreeObserver = AbstractC2749f.x(this).getViewTreeObserver();
        this.f6330z = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (AbstractC2749f.v(this).f21636w == null) {
            return;
        }
        View c5 = k.c(this);
        InterfaceC1964i focusOwner = ((F) AbstractC2749f.w(this)).getFocusOwner();
        n0 w5 = AbstractC2749f.w(this);
        boolean z3 = (view == null || view.equals(w5) || !k.a(c5, view)) ? false : true;
        boolean z5 = (view2 == null || view2.equals(w5) || !k.a(c5, view2)) ? false : true;
        if (z3 && z5) {
            this.f6329y = view2;
            return;
        }
        if (!z5) {
            if (!z3) {
                this.f6329y = null;
                return;
            }
            this.f6329y = null;
            if (y0().A0().a()) {
                ((C1965j) focusOwner).b(8, false, false);
                return;
            }
            return;
        }
        this.f6329y = view2;
        s y02 = y0();
        int ordinal = y02.A0().ordinal();
        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
            return;
        }
        if (ordinal != 3) {
            throw new D2.e();
        }
        AbstractC1961f.v(y02);
    }

    @Override // b0.o
    public final void q0() {
        ViewTreeObserver viewTreeObserver = this.f6330z;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f6330z = null;
        AbstractC2749f.x(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f6329y = null;
    }

    public final s y0() {
        if (!this.f7162k.f7175x) {
            AbstractC2540a.b("visitLocalDescendants called on an unattached node");
        }
        b0.o oVar = this.f7162k;
        if ((oVar.f7165n & 1024) != 0) {
            boolean z3 = false;
            for (b0.o oVar2 = oVar.f7167p; oVar2 != null; oVar2 = oVar2.f7167p) {
                if ((oVar2.f7164m & 1024) != 0) {
                    b0.o oVar3 = oVar2;
                    R.e eVar = null;
                    while (oVar3 != null) {
                        if (oVar3 instanceof s) {
                            s sVar = (s) oVar3;
                            if (z3) {
                                return sVar;
                            }
                            z3 = true;
                        } else if ((oVar3.f7164m & 1024) != 0 && (oVar3 instanceof AbstractC2756m)) {
                            int i = 0;
                            for (b0.o oVar4 = ((AbstractC2756m) oVar3).f21839z; oVar4 != null; oVar4 = oVar4.f7167p) {
                                if ((oVar4.f7164m & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        oVar3 = oVar4;
                                    } else {
                                        if (eVar == null) {
                                            eVar = new R.e(new b0.o[16]);
                                        }
                                        if (oVar3 != null) {
                                            eVar.c(oVar3);
                                            oVar3 = null;
                                        }
                                        eVar.c(oVar4);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        oVar3 = AbstractC2749f.f(eVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }
}
