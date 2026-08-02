package i0;

import A0.C0025f0;
import A0.I0;
import A0.q1;
import P.InterfaceC0289e0;
import P.d1;
import a3.AbstractC0467k;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.C1036gn;
import com.google.android.gms.internal.ads.C1071hd;
import h0.C1988b;
import java.lang.reflect.Field;
import k0.C2023c;
import n1.AbstractC2181w;
import p4.AbstractC2282w;
import p4.InterfaceC2280u;
import r.C2316B;
import r.C2321G;
import r0.AbstractC2346c;
import t.C2399k;
import t.C2400l;
import t3.AbstractC2425d;
import u.AbstractC2453d;
import u.C2435F;
import u.C2438I;
import u.InterfaceC2430A;
import u.o0;
import u.p0;
import u.r0;
import u.s0;
import u.t0;
import u0.C2479a;
import v.k0;
import w0.AbstractC2540a;
import x.AbstractC2567M;
import x.C2582h;
import x.C2589k0;
import x.C2599p0;
import x.C2603s;
import x.C2604s0;
import x.C2606u;
import x.P;
import x.S0;
import x0.C2631q;
import x0.InterfaceC2637x;
import x0.Y;
import x0.Z;
import x0.d0;
import x0.n0;
import y.C2654j;
import y.InterfaceC2653i;
import z.C2693Q;
import z.RunnableC2722x;
import z0.AbstractC2739O;
import z0.AbstractC2749f;
import z0.C2733I;
import z0.C2736L;

/* loaded from: classes.dex */
public final class K extends kotlin.jvm.internal.m implements i4.c {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ int f17248l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f17249m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f17250n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K(int i, Object obj, Object obj2) {
        super(1);
        this.f17248l = i;
        this.f17249m = obj;
        this.f17250n = obj2;
    }

    @Override // i4.c
    public final Object c(Object obj) {
        int i;
        long a5;
        boolean z3 = true;
        W3.o oVar = W3.o.f6046a;
        Object obj2 = this.f17250n;
        Object obj3 = this.f17249m;
        switch (this.f17248l) {
            case 0:
                Y.l((Y) obj, (Z) obj3, ((L) obj2).K);
                return oVar;
            case 1:
                Y y5 = (Y) obj;
                float h3 = ((t.u) obj2).f19413c.h();
                Z z5 = (Z) obj3;
                y5.getClass();
                long j5 = 0;
                Y.a(y5, z5);
                z5.Z(W0.j.c((j5 & 4294967295L) | (j5 << 32), z5.f20977o), h3, null);
                return oVar;
            case 2:
                p0 p0Var = (p0) obj;
                Object b3 = p0Var.b();
                C2321G c2321g = ((C2400l) obj3).f19388d;
                d1 d1Var = (d1) c2321g.g(b3);
                long j6 = d1Var != null ? ((W0.l) d1Var.getValue()).f6015a : 0L;
                d1 d1Var2 = (d1) c2321g.g(p0Var.c());
                long j7 = d1Var2 != null ? ((W0.l) d1Var2.getValue()).f6015a : 0L;
                t.L l5 = (t.L) ((C2399k) obj2).f19383l.getValue();
                if (l5 != null) {
                    InterfaceC2430A interfaceC2430A = (InterfaceC2430A) l5.f19351a.invoke(new W0.l(j6), new W0.l(j7));
                    if (interfaceC2430A != null) {
                        return interfaceC2430A;
                    }
                }
                return AbstractC2453d.l(7, null);
            case 3:
                MotionEvent motionEvent = (MotionEvent) obj;
                t0.x xVar = (t0.x) obj2;
                if (motionEvent.getActionMasked() == 0) {
                    ((C1071hd) obj3).f13762m = ((Boolean) ((Z0.d) xVar.i()).c(motionEvent)).booleanValue() ? t0.w.f19526l : t0.w.f19527m;
                } else {
                    ((Z0.d) xVar.i()).c(motionEvent);
                }
                return oVar;
            case 4:
                C2438I c2438i = (C2438I) obj3;
                C2435F c2435f = (C2435F) obj2;
                c2438i.f19679a.c(c2435f);
                c2438i.f19680b.setValue(Boolean.TRUE);
                return new C0025f0(9, c2438i, c2435f);
            case 5:
                AbstractC2282w.p((InterfaceC2280u) obj3, null, new s0((t0) obj2, null), 1);
                return new H1.s(1);
            case 6:
                t0 t0Var = (t0) obj3;
                t0 t0Var2 = (t0) obj2;
                t0Var.f19944j.add(t0Var2);
                return new C0025f0(10, t0Var, t0Var2);
            case 7:
                return new C0025f0(11, (t0) obj3, (o0) obj2);
            case 8:
                t0 t0Var3 = (t0) obj3;
                r0 r0Var = (r0) obj2;
                t0Var3.i.add(r0Var);
                return new C0025f0(12, t0Var3, r0Var);
            case 9:
                C2733I c2733i = (C2733I) obj;
                c2733i.a();
                AbstractC0467k.k(c2733i, ((C1994A) obj3).f17218a, (M) obj2, 0.0f, null, 60);
                return oVar;
            case 10:
                C2733I c2733i2 = (C2733I) obj;
                c2733i2.a();
                AbstractC0467k.k(c2733i2, (C2003h) obj3, (M) obj2, 0.0f, null, 60);
                return oVar;
            case 11:
                ((C2654j) obj3).b((InterfaceC2653i) obj2);
                return oVar;
            case 12:
                ((R.e) ((C2023c) obj3).f17544l).k((C2582h) obj2);
                return oVar;
            case 13:
                u0.c cVar = (u0.c) obj3;
                AbstractC2425d.i(cVar, (t0.s) obj);
                C2589k0 c2589k0 = (C2589k0) obj2;
                float a6 = ((q1) AbstractC2749f.i(c2589k0, I0.f297s)).a();
                long c5 = AbstractC2346c.c(a6, a6);
                if (W0.q.b(c5) <= 0.0f || W0.q.c(c5) <= 0.0f) {
                    AbstractC2540a.b("maximumVelocity should be a positive value. You specified=" + ((Object) W0.q.f(c5)));
                }
                float b5 = W0.q.b(c5);
                C1036gn c1036gn = cVar.f19979a;
                float b6 = c1036gn.b(b5);
                float c6 = W0.q.c(c5);
                C1036gn c1036gn2 = cVar.f19980b;
                long c7 = AbstractC2346c.c(b6, c1036gn2.b(c6));
                X3.l.B0(r1, 0, ((C2479a[]) c1036gn.f13651d).length);
                c1036gn.f13649b = 0;
                X3.l.B0(r1, 0, ((C2479a[]) c1036gn2.f13651d).length);
                c1036gn2.f13649b = 0;
                cVar.f19981c = 0L;
                r4.c cVar2 = c2589k0.f20803E;
                if (cVar2 != null) {
                    int i5 = AbstractC2567M.f20666a;
                    cVar2.q(new C2606u(AbstractC2346c.c(Float.isNaN(W0.q.b(c7)) ? 0.0f : W0.q.b(c7), Float.isNaN(W0.q.c(c7)) ? 0.0f : W0.q.c(c7))));
                }
                return oVar;
            case 14:
                long j8 = ((C2603s) obj).f20862a;
                if (((C2604s0) obj2).f20866d == P.f20696l) {
                    i = 1;
                    a5 = C1988b.a(j8, 0.0f, 1);
                } else {
                    i = 1;
                    a5 = C1988b.a(j8, 0.0f, 2);
                }
                C2604s0 c2604s0 = ((C2599p0) obj3).f20847a;
                c2604s0.f20868g = i;
                k0 k0Var = c2604s0.f20864b;
                if (k0Var == null || !(c2604s0.f20863a.c() || c2604s0.f20863a.a())) {
                    C2604s0.a(c2604s0, c2604s0.f20869h, a5, 1);
                } else {
                    k0Var.a(a5, c2604s0.f20868g, c2604s0.f20870j);
                }
                return oVar;
            case 15:
                ((Number) obj).longValue();
                S0 s02 = (S0) obj3;
                float f = s02.f20722e;
                s02.f20722e = 0.0f;
                ((i4.c) obj2).c(Float.valueOf(f));
                return oVar;
            case 16:
                C2736L c2736l = (C2736L) obj;
                d0 d0Var = (d0) obj3;
                if (d0Var.f20988y.f21051q.h() <= 0) {
                    return oVar;
                }
                c2736l.f21665k = true;
                AbstractC2739O abstractC2739O = c2736l.f21668n;
                InterfaceC2637x n02 = abstractC2739O.n0();
                if (W0.j.a(c2736l.f21666l, 9223372034707292159L)) {
                    c2736l.f21666l = G4.l.K(n02.b(0L));
                    c2736l.f21667m = n02.I();
                }
                abstractC2739O.p0().f21613P.b();
                long I5 = n02.I();
                x0.r rVar = (x0.r) obj2;
                int i6 = (int) (I5 >> 32);
                int i7 = (int) (I5 & 4294967295L);
                n0[] n0VarArr = androidx.compose.ui.layout.b.f6939b;
                int length = n0VarArr.length;
                int i8 = 0;
                while (i8 < length) {
                    n0 n0Var = n0VarArr[i8];
                    Object g5 = rVar.f21050p.g(n0Var);
                    kotlin.jvm.internal.l.c(g5);
                    x0.p0 p0Var2 = (x0.p0) g5;
                    x0.o0 o0Var = (x0.o0) n0Var;
                    boolean z6 = z3;
                    W3.o oVar2 = oVar;
                    int i9 = i7;
                    int i10 = i6;
                    androidx.compose.ui.layout.b.a(c2736l, o0Var.f21029c, p0Var2.f21039h, i10, i9);
                    if (((Boolean) p0Var2.f21034b.getValue()).booleanValue()) {
                        androidx.compose.ui.layout.b.a(c2736l, p0Var2.f, p0Var2.f21040j, i10, i9);
                        androidx.compose.ui.layout.b.a(c2736l, p0Var2.f21038g, p0Var2.f21041k, i10, i9);
                    }
                    androidx.compose.ui.layout.b.a(c2736l, o0Var.f21030d, p0Var2.i, i10, i9);
                    i8++;
                    i6 = i10;
                    i7 = i9;
                    oVar = oVar2;
                    z3 = z6;
                }
                W3.o oVar3 = oVar;
                if (!d0Var.f20988y.f21052r.h()) {
                    return oVar3;
                }
                C2316B c2316b = d0Var.f20988y.f21052r;
                Object[] objArr = c2316b.f18904a;
                int i11 = c2316b.f18905b;
                for (int i12 = 0; i12 < i11; i12++) {
                    InterfaceC0289e0 interfaceC0289e0 = (InterfaceC0289e0) objArr[i12];
                    C2631q c2631q = (C2631q) d0Var.f20988y.f21053s.get(i12);
                    Rect rect = (Rect) interfaceC0289e0.getValue();
                    c2736l.a(c2631q.b(), rect.left);
                    c2736l.a(c2631q.d(), rect.top);
                    c2736l.a(c2631q.c(), rect.right);
                    c2736l.a(c2631q.a(), rect.bottom);
                }
                return oVar3;
            default:
                C2693Q c2693q = (C2693Q) obj3;
                View view = (View) obj2;
                if (c2693q.f21513s == 0) {
                    Field field = n1.C.f18360a;
                    RunnableC2722x runnableC2722x = c2693q.f21514t;
                    AbstractC2181w.c(view, runnableC2722x);
                    if (view.isAttachedToWindow()) {
                        view.requestApplyInsets();
                    }
                    view.addOnAttachStateChangeListener(runnableC2722x);
                    n1.C.f(view, runnableC2722x);
                }
                c2693q.f21513s++;
                return new C0025f0(13, c2693q, view);
        }
    }
}
