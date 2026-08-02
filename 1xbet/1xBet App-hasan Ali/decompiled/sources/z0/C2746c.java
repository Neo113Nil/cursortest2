package z0;

import A0.W0;
import B.C0075d;
import a.AbstractC0444a;
import android.os.SystemClock;
import android.view.MotionEvent;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import com.google.android.gms.internal.ads.C1071hd;
import f0.InterfaceC1937a;
import g0.InterfaceC1960e;
import g0.InterfaceC1966k;
import java.util.HashSet;
import r.C2316B;
import r.C2321G;
import t.C2397i;
import v.AbstractC2529y;
import w0.AbstractC2540a;
import x0.InterfaceC2637x;
import x0.InterfaceC2639z;
import y0.C2656a;
import z.AbstractC2695T;
import z.C2689M;
import z.C2699a;
import z.C2719u;
import z.C2723y;
import z.InterfaceC2692P;

/* renamed from: z0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2746c extends b0.o implements InterfaceC2765w, InterfaceC2757n, v0, s0, y0.d, y0.f, q0, InterfaceC2764v, InterfaceC2758o, InterfaceC1960e, g0.n, g0.p, o0, InterfaceC1937a {

    /* renamed from: A, reason: collision with root package name */
    public HashSet f21763A;

    /* renamed from: y, reason: collision with root package name */
    public b0.n f21764y;

    /* renamed from: z, reason: collision with root package name */
    public C2656a f21765z;

    public final void A0() {
        if (this.f7175x) {
            this.f21763A.clear();
            ((A0.F) AbstractC2749f.w(this)).getSnapshotObserver().a(this, C2748e.f21777m, new C2744b(this, 1));
        }
    }

    @Override // g0.n
    public final void F(InterfaceC1966k interfaceC1966k) {
        b0.n nVar = this.f21764y;
        AbstractC2540a.b("applyFocusProperties called on wrong node");
        nVar.getClass();
        throw new ClassCastException();
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
        this.f21763A.add(gVar);
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

    @Override // z0.s0
    public final boolean R() {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", nVar);
        ((t0.x) nVar).f19532n.getClass();
        return true;
    }

    @Override // z0.InterfaceC2758o
    public final void T(e0 e0Var) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier", nVar);
        C0075d c0075d = (C0075d) nVar;
        if (c0075d.f670k) {
            return;
        }
        c0075d.f670k = true;
        a4.j jVar = c0075d.f671l;
        if (jVar != null) {
            jVar.resumeWith(W3.o.f6046a);
        }
        c0075d.f671l = null;
    }

    @Override // z0.s0
    public final void U() {
        W();
    }

    @Override // z0.s0
    public final void W() {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", nVar);
        C1071hd c1071hd = ((t0.x) nVar).f19532n;
        if (((t0.w) c1071hd.f13762m) == t0.w.f19526l) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            obtain.setSource(0);
            t0.x xVar = (t0.x) c1071hd.f13764o;
            ((Z0.d) xVar.i()).c(obtain);
            obtain.recycle();
            c1071hd.f13762m = t0.w.f19525k;
            xVar.f19531m = false;
            c1071hd.f13763n = null;
        }
    }

    @Override // z0.v0
    public final /* synthetic */ boolean X() {
        return false;
    }

    @Override // z0.v0
    public final /* synthetic */ boolean Z() {
        return false;
    }

    @Override // z0.InterfaceC2765w
    public final int a(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", nVar);
        return ((InterfaceC2639z) nVar).a(abstractC2739O, n5, i);
    }

    @Override // z0.InterfaceC2765w
    public final int b(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", nVar);
        return ((InterfaceC2639z) nVar).b(abstractC2739O, n5, i);
    }

    @Override // f0.InterfaceC1937a
    public final W0.c c() {
        return AbstractC2749f.v(this).f21607H;
    }

    @Override // f0.InterfaceC1937a
    public final long d() {
        return AbstractC0444a.d0(AbstractC2749f.t(this, 128).f20975m);
    }

    @Override // z0.InterfaceC2765w
    public final int e(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", nVar);
        return ((InterfaceC2639z) nVar).e(abstractC2739O, n5, i);
    }

    @Override // z0.q0
    public final Object e0(Object obj) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier", nVar);
        return (C2397i) nVar;
    }

    @Override // z0.InterfaceC2765w
    public final x0.P f(x0.Q q5, x0.N n5, long j5) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", nVar);
        return ((InterfaceC2639z) nVar).f(q5, n5, j5);
    }

    @Override // z0.InterfaceC2757n
    public final void f0() {
        AbstractC2749f.m(this);
    }

    @Override // z0.InterfaceC2757n
    public final void g(C2733I c2733i) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier", nVar);
        ((f0.e) nVar).g(c2733i);
    }

    @Override // z0.s0
    public final void g0() {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", nVar);
        ((t0.x) nVar).f19532n.getClass();
    }

    @Override // f0.InterfaceC1937a
    public final W0.m getLayoutDirection() {
        return AbstractC2749f.v(this).f21608I;
    }

    @Override // z0.InterfaceC2765w
    public final int h(AbstractC2739O abstractC2739O, x0.N n5, int i) {
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier", nVar);
        return ((InterfaceC2639z) nVar).h(abstractC2739O, n5, i);
    }

    @Override // z0.v0
    public final /* synthetic */ boolean j() {
        return true;
    }

    @Override // z0.v0
    public final void j0(H0.j jVar) {
        int i;
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier", nVar);
        AppendedSemanticsElement appendedSemanticsElement = (AppendedSemanticsElement) nVar;
        H0.j jVar2 = new H0.j();
        jVar2.f2105m = appendedSemanticsElement.f6947k;
        appendedSemanticsElement.f6948l.c(jVar2);
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration", jVar);
        if (jVar2.f2105m) {
            jVar.f2105m = true;
        }
        if (jVar2.f2106n) {
            jVar.f2106n = true;
        }
        C2321G c2321g = jVar2.f2103k;
        Object[] objArr = c2321g.f18929b;
        Object[] objArr2 = c2321g.f18930c;
        long[] jArr = c2321g.f18928a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i5 = 0;
        while (true) {
            long j5 = jArr[i5];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i6 = 8;
                int i7 = 8 - ((~(i5 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j5) < 128) {
                        int i9 = (i5 << 3) + i8;
                        Object obj = objArr[i9];
                        Object obj2 = objArr2[i9];
                        H0.v vVar = (H0.v) obj;
                        C2321G c2321g2 = jVar.f2103k;
                        if (!c2321g2.b(vVar)) {
                            c2321g2.m(vVar, obj2);
                        } else if (obj2 instanceof H0.a) {
                            Object g5 = c2321g2.g(vVar);
                            i = i6;
                            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>", g5);
                            H0.a aVar = (H0.a) g5;
                            String str = aVar.f2062a;
                            if (str == null) {
                                str = ((H0.a) obj2).f2062a;
                            }
                            W3.c cVar = aVar.f2063b;
                            if (cVar == null) {
                                cVar = ((H0.a) obj2).f2063b;
                            }
                            c2321g2.m(vVar, new H0.a(str, cVar));
                            j5 >>= i;
                            i8++;
                            i6 = i;
                        }
                    }
                    i = i6;
                    j5 >>= i;
                    i8++;
                    i6 = i;
                }
                if (i7 != i6) {
                    return;
                }
            }
            if (i5 == length) {
                return;
            } else {
                i5++;
            }
        }
    }

    @Override // y0.d
    public final AbstractC2529y k() {
        C2656a c2656a = this.f21765z;
        return c2656a != null ? c2656a : y0.b.f21128a;
    }

    @Override // g0.InterfaceC1960e
    public final void m(g0.r rVar) {
        b0.n nVar = this.f21764y;
        AbstractC2540a.b("onFocusEvent called on wrong node");
        nVar.getClass();
        throw new ClassCastException();
    }

    @Override // b0.o
    public final void o0() {
        y0(true);
    }

    @Override // b0.o
    public final void p0() {
        if (this.f21764y instanceof t0.x) {
            W();
        }
    }

    @Override // b0.o
    public final void q0() {
        z0();
    }

    @Override // z0.s0
    public final long r() {
        return y0.f21873a;
    }

    public final String toString() {
        return this.f21764y.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x012d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // z0.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void v(t0.j jVar, t0.k kVar, long j5) {
        boolean z3;
        boolean z5;
        t0.x xVar;
        boolean z6;
        t0.w wVar;
        t0.w wVar2;
        t0.k kVar2;
        b0.n nVar = this.f21764y;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier", nVar);
        C1071hd c1071hd = ((t0.x) nVar).f19532n;
        c1071hd.getClass();
        ?? r13 = jVar.f19485a;
        int size = r13.size();
        for (int i = 0; i < size; i++) {
            t0.s sVar = (t0.s) r13.get(i);
            if (t0.q.a(sVar) || t0.q.c(sVar)) {
                z3 = false;
                break;
            }
        }
        z3 = true;
        if (z3) {
            int size2 = r13.size();
            for (int i5 = 0; i5 < size2; i5++) {
                if (!((t0.s) r13.get(i5)).b()) {
                }
            }
            z5 = true;
            xVar = (t0.x) c1071hd.f13764o;
            if (!xVar.f19531m) {
                int size3 = r13.size();
                int i6 = 0;
                while (true) {
                    if (i6 < size3) {
                        t0.s sVar2 = (t0.s) r13.get(i6);
                        if (t0.q.a(sVar2) || t0.q.c(sVar2)) {
                            break;
                        } else {
                            i6++;
                        }
                    } else if (!z5) {
                        z6 = false;
                    }
                }
            }
            z6 = true;
            wVar = (t0.w) c1071hd.f13762m;
            wVar2 = t0.w.f19527m;
            kVar2 = t0.k.f19491m;
            if (wVar != wVar2) {
                if (kVar == t0.k.f19489k && z6) {
                    c1071hd.f13763n = jVar;
                    c1071hd.a(jVar, !z3 || xVar.f19531m);
                }
                if (kVar == t0.k.f19490l && z3 && jVar.equals((t0.j) c1071hd.f13763n) && xVar.f19531m) {
                    int size4 = r13.size();
                    for (int i7 = 0; i7 < size4; i7++) {
                        ((t0.s) r13.get(i7)).a();
                    }
                }
                if (kVar == kVar2 && !z6 && !jVar.equals((t0.j) c1071hd.f13763n)) {
                    c1071hd.a(jVar, true);
                }
            }
            if (kVar != kVar2) {
                int size5 = r13.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size5) {
                        c1071hd.f13762m = t0.w.f19525k;
                        xVar.f19531m = false;
                        c1071hd.f13763n = null;
                        break;
                    } else if (!t0.q.c((t0.s) r13.get(i8))) {
                        break;
                    } else {
                        i8++;
                    }
                }
                if (jVar.equals((t0.j) c1071hd.f13763n) && z3) {
                    int size6 = r13.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size6) {
                            break;
                        }
                        if (!((t0.s) r13.get(i9)).b()) {
                            i9++;
                        } else if (!xVar.f19531m) {
                            c1071hd.l(jVar);
                            return;
                        }
                    }
                    int size7 = r13.size();
                    for (int i10 = 0; i10 < size7; i10++) {
                        ((t0.s) r13.get(i10)).a();
                    }
                    return;
                }
                return;
            }
            return;
        }
        z5 = false;
        xVar = (t0.x) c1071hd.f13764o;
        if (!xVar.f19531m) {
        }
        z6 = true;
        wVar = (t0.w) c1071hd.f13762m;
        wVar2 = t0.w.f19527m;
        kVar2 = t0.k.f19491m;
        if (wVar != wVar2) {
        }
        if (kVar != kVar2) {
        }
    }

    public final void y0(boolean z3) {
        if (!this.f7175x) {
            AbstractC2540a.b("initializeModifier called on unattached node");
        }
        b0.n nVar = this.f21764y;
        if ((this.f7164m & 32) != 0) {
            if (nVar instanceof C2723y) {
                C2744b c2744b = new C2744b(this, 0);
                C2316B c2316b = ((A0.F) AbstractC2749f.w(this)).f200F0;
                if (c2316b.f(c2744b) < 0) {
                    c2316b.a(c2744b);
                }
            }
            if (nVar instanceof y0.e) {
                y0.e eVar = (y0.e) nVar;
                C2656a c2656a = this.f21765z;
                if (c2656a == null || !c2656a.b(eVar.getKey())) {
                    C2656a c2656a2 = new C2656a();
                    c2656a2.f21127a = eVar;
                    this.f21765z = c2656a2;
                    if (AbstractC2749f.d(this)) {
                        y0.c modifierLocalManager = ((A0.F) AbstractC2749f.w(this)).getModifierLocalManager();
                        y0.g key = eVar.getKey();
                        modifierLocalManager.f21130b.c(this);
                        modifierLocalManager.f21131c.c(key);
                        modifierLocalManager.a();
                    }
                } else {
                    c2656a.f21127a = eVar;
                    y0.c modifierLocalManager2 = ((A0.F) AbstractC2749f.w(this)).getModifierLocalManager();
                    y0.g key2 = eVar.getKey();
                    modifierLocalManager2.f21130b.c(this);
                    modifierLocalManager2.f21131c.c(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f7164m & 4) != 0 && !z3) {
            AbstractC2749f.t(this, 2).P0();
        }
        if ((this.f7164m & 2) != 0) {
            if (AbstractC2749f.d(this)) {
                e0 e0Var = this.f7169r;
                kotlin.jvm.internal.l.c(e0Var);
                ((C2767y) e0Var).k1(this);
                m0 m0Var = e0Var.f21811S;
                if (m0Var != null) {
                    ((W0) m0Var).invalidate();
                }
            }
            if (!z3) {
                AbstractC2749f.t(this, 2).P0();
                AbstractC2749f.v(this).E();
            }
        }
        if (nVar instanceof A.y) {
            ((A.y) nVar).f141k.f16j = AbstractC2749f.v(this);
        }
        if ((this.f7164m & 256) != 0 && (nVar instanceof C0075d) && AbstractC2749f.d(this)) {
            AbstractC2749f.v(this).E();
        }
        int i = this.f7164m;
        if ((i & 16) != 0 && (nVar instanceof t0.x)) {
            ((t0.x) nVar).f19532n.f13761l = this.f7169r;
        }
        if ((i & 8) != 0) {
            ((A0.F) AbstractC2749f.w(this)).E();
        }
    }

    @Override // z0.o0
    public final boolean z() {
        return this.f7175x;
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [i4.a, kotlin.jvm.internal.m] */
    public final void z0() {
        if (!this.f7175x) {
            AbstractC2540a.b("unInitializeModifier called on unattached node");
        }
        b0.n nVar = this.f21764y;
        if ((this.f7164m & 32) != 0) {
            if (nVar instanceof y0.e) {
                y0.c modifierLocalManager = ((A0.F) AbstractC2749f.w(this)).getModifierLocalManager();
                y0.g key = ((y0.e) nVar).getKey();
                modifierLocalManager.f21132d.c(AbstractC2749f.v(this));
                modifierLocalManager.f21133e.c(key);
                modifierLocalManager.a();
            }
            if (nVar instanceof C2723y) {
                C2723y c2723y = (C2723y) nVar;
                c2723y.getClass();
                InterfaceC2692P interfaceC2692P = (InterfaceC2692P) AbstractC2695T.f21516a.f21134a.invoke();
                C2699a c2699a = c2723y.f21578k;
                c2723y.f21579l.setValue(new C2719u(c2699a, interfaceC2692P));
                c2723y.f21580m.setValue(new C2689M(interfaceC2692P, c2699a));
            }
        }
        if ((this.f7164m & 8) != 0) {
            ((A0.F) AbstractC2749f.w(this)).E();
        }
    }

    @Override // z0.InterfaceC2764v
    public final void s(long j5) {
    }

    @Override // z0.InterfaceC2764v
    public final void u(InterfaceC2637x interfaceC2637x) {
    }
}
