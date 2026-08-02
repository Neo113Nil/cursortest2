package G;

import A0.I0;
import A0.InterfaceC0044l1;
import A0.L0;
import E.C0116v;
import E.k0;
import K0.L;
import K0.N;
import android.graphics.Rect;
import android.view.View;
import h0.C1989c;
import java.lang.ref.WeakReference;
import k4.AbstractC2036a;
import p4.AbstractC2282w;
import p4.C2285z;
import r3.AbstractC2349a;
import z0.AbstractC2749f;

/* renamed from: G.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0129f implements P0.r {

    /* renamed from: a, reason: collision with root package name */
    public x f1728a;

    /* renamed from: b, reason: collision with root package name */
    public C2285z f1729b;

    /* renamed from: c, reason: collision with root package name */
    public B f1730c;

    /* renamed from: d, reason: collision with root package name */
    public s4.B f1731d;

    @Override // P0.r
    public final void a(P0.w wVar, P0.w wVar2) {
        B b3 = this.f1730c;
        if (b3 != null) {
            boolean z3 = (N.a(b3.f1694h.f4680b, wVar2.f4680b) && kotlin.jvm.internal.l.a(b3.f1694h.f4681c, wVar2.f4681c)) ? false : true;
            b3.f1694h = wVar2;
            int size = b3.f1695j.size();
            for (int i = 0; i < size; i++) {
                D d5 = (D) ((WeakReference) b3.f1695j.get(i)).get();
                if (d5 != null) {
                    d5.f1705g = wVar2;
                }
            }
            y yVar = b3.f1698m;
            synchronized (yVar.f1760c) {
                yVar.f1765j = null;
                yVar.f1767l = null;
                yVar.f1766k = null;
                yVar.f1768m = null;
                yVar.f1769n = null;
            }
            if (kotlin.jvm.internal.l.a(wVar, wVar2)) {
                if (z3) {
                    v vVar = b3.f1689b;
                    int e3 = N.e(wVar2.f4680b);
                    int d6 = N.d(wVar2.f4680b);
                    N n5 = b3.f1694h.f4681c;
                    int e5 = n5 != null ? N.e(n5.f2803a) : -1;
                    N n6 = b3.f1694h.f4681c;
                    vVar.g().updateSelection((View) vVar.f1749l, e3, d6, e5, n6 != null ? N.d(n6.f2803a) : -1);
                    return;
                }
                return;
            }
            if (wVar != null && (!kotlin.jvm.internal.l.a(wVar.f4679a.f2829l, wVar2.f4679a.f2829l) || (N.a(wVar.f4680b, wVar2.f4680b) && !kotlin.jvm.internal.l.a(wVar.f4681c, wVar2.f4681c)))) {
                v vVar2 = b3.f1689b;
                vVar2.g().restartInput((View) vVar2.f1749l);
                return;
            }
            int size2 = b3.f1695j.size();
            for (int i5 = 0; i5 < size2; i5++) {
                D d7 = (D) ((WeakReference) b3.f1695j.get(i5)).get();
                if (d7 != null) {
                    P0.w wVar3 = b3.f1694h;
                    v vVar3 = b3.f1689b;
                    if (d7.f1708k) {
                        d7.f1705g = wVar3;
                        if (d7.i) {
                            vVar3.g().updateExtractedText((View) vVar3.f1749l, d7.f1706h, AbstractC2349a.k(wVar3));
                        }
                        N n7 = wVar3.f4681c;
                        int e6 = n7 != null ? N.e(n7.f2803a) : -1;
                        N n8 = wVar3.f4681c;
                        int d8 = n8 != null ? N.d(n8.f2803a) : -1;
                        long j5 = wVar3.f4680b;
                        vVar3.g().updateSelection((View) vVar3.f1749l, N.e(j5), N.d(j5), e6, d8);
                    }
                }
            }
        }
    }

    @Override // P0.r
    public final void b(P0.w wVar, P0.q qVar, L l5, A.B b3, C1989c c1989c, C1989c c1989c2) {
        B b5 = this.f1730c;
        if (b5 != null) {
            y yVar = b5.f1698m;
            synchronized (yVar.f1760c) {
                try {
                    yVar.f1765j = wVar;
                    yVar.f1767l = qVar;
                    yVar.f1766k = l5;
                    yVar.f1768m = c1989c;
                    yVar.f1769n = c1989c2;
                    if (!yVar.f1762e) {
                        if (yVar.f1761d) {
                        }
                    }
                    yVar.a();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // P0.r
    public final void c() {
        j(null);
    }

    @Override // P0.r
    public final void d(P0.w wVar, P0.k kVar, A.s sVar, C0116v c0116v) {
        j(new k0(wVar, this, kVar, sVar, c0116v));
    }

    @Override // P0.r
    public final void e() {
        InterfaceC0044l1 interfaceC0044l1;
        x xVar = this.f1728a;
        if (xVar == null || (interfaceC0044l1 = (InterfaceC0044l1) AbstractC2749f.i(xVar, I0.f294p)) == null) {
            return;
        }
        ((L0) interfaceC0044l1).b();
    }

    @Override // P0.r
    public final void f(C1989c c1989c) {
        Rect rect;
        B b3 = this.f1730c;
        if (b3 != null) {
            b3.f1697l = new Rect(AbstractC2036a.U(c1989c.f17193a), AbstractC2036a.U(c1989c.f17194b), AbstractC2036a.U(c1989c.f17195c), AbstractC2036a.U(c1989c.f17196d));
            if (!b3.f1695j.isEmpty() || (rect = b3.f1697l) == null) {
                return;
            }
            b3.f1688a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // P0.r
    public final void g() {
        InterfaceC0044l1 interfaceC0044l1;
        x xVar = this.f1728a;
        if (xVar == null || (interfaceC0044l1 = (InterfaceC0044l1) AbstractC2749f.i(xVar, I0.f294p)) == null) {
            return;
        }
        ((L0) interfaceC0044l1).a();
    }

    @Override // P0.r
    public final void h() {
        C2285z c2285z = this.f1729b;
        if (c2285z != null) {
            c2285z.d(null);
        }
        this.f1729b = null;
        s4.u i = i();
        if (i != null) {
            s4.B b3 = (s4.B) i;
            synchronized (b3) {
                b3.u(b3.o() + b3.f19220u, b3.f19219t, b3.o() + b3.f19220u, b3.o() + b3.f19220u + b3.f19221v);
            }
        }
    }

    public final s4.u i() {
        s4.B b3 = this.f1731d;
        if (b3 != null) {
            return b3;
        }
        if (!F.e.f1518a) {
            return null;
        }
        s4.B a5 = s4.C.a(2, r4.a.f19108m);
        this.f1731d = a5;
        return a5;
    }

    public final void j(k0 k0Var) {
        x xVar = this.f1728a;
        if (xVar == null) {
            return;
        }
        this.f1729b = xVar.f7175x ? AbstractC2282w.p(xVar.k0(), null, new w(xVar, new C0128e(k0Var, this, xVar, null), null), 1) : null;
    }

    public final void k(x xVar) {
        if (this.f1728a == xVar) {
            this.f1728a = null;
            return;
        }
        throw new IllegalStateException(("Expected textInputModifierNode to be " + xVar + " but was " + this.f1728a).toString());
    }
}
