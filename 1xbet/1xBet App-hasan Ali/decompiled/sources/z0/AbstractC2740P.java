package z0;

import a3.AbstractC0467k;
import java.util.LinkedHashMap;
import r.C2315A;
import x0.InterfaceC2637x;

/* renamed from: z0.P, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2740P extends AbstractC2739O implements x0.N {

    /* renamed from: A, reason: collision with root package name */
    public LinkedHashMap f21687A;

    /* renamed from: C, reason: collision with root package name */
    public x0.P f21689C;

    /* renamed from: D, reason: collision with root package name */
    public final C2315A f21690D;

    /* renamed from: y, reason: collision with root package name */
    public final e0 f21691y;

    /* renamed from: z, reason: collision with root package name */
    public long f21692z = 0;

    /* renamed from: B, reason: collision with root package name */
    public final x0.M f21688B = new x0.M(this);

    public AbstractC2740P(e0 e0Var) {
        this.f21691y = e0Var;
        C2315A c2315a = r.K.f18952a;
        this.f21690D = new C2315A();
    }

    public static final void x0(AbstractC2740P abstractC2740P, x0.P p5) {
        LinkedHashMap linkedHashMap;
        if (p5 != null) {
            abstractC2740P.c0((p5.c() & 4294967295L) | (p5.getWidth() << 32));
        } else {
            abstractC2740P.c0(0L);
        }
        if (!kotlin.jvm.internal.l.a(abstractC2740P.f21689C, p5) && p5 != null && ((((linkedHashMap = abstractC2740P.f21687A) != null && !linkedHashMap.isEmpty()) || !p5.a().isEmpty()) && !kotlin.jvm.internal.l.a(p5.a(), abstractC2740P.f21687A))) {
            U u5 = abstractC2740P.f21691y.f21812y.f21613P.f21664q;
            kotlin.jvm.internal.l.c(u5);
            u5.f21702A.f();
            LinkedHashMap linkedHashMap2 = abstractC2740P.f21687A;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                abstractC2740P.f21687A = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(p5.a());
        }
        abstractC2740P.f21689C = p5;
    }

    public final long A0(AbstractC2740P abstractC2740P, boolean z3) {
        long j5 = 0;
        AbstractC2740P abstractC2740P2 = this;
        while (!abstractC2740P2.equals(abstractC2740P)) {
            if (!abstractC2740P2.f21681s || !z3) {
                j5 = W0.j.c(j5, abstractC2740P2.f21692z);
            }
            e0 e0Var = abstractC2740P2.f21691y.f21795A;
            kotlin.jvm.internal.l.c(e0Var);
            abstractC2740P2 = e0Var.G0();
            kotlin.jvm.internal.l.c(abstractC2740P2);
        }
        return j5;
    }

    @Override // x0.Z
    public final void Z(long j5, float f, i4.c cVar) {
        z0(j5);
        if (this.f21682t) {
            return;
        }
        y0();
    }

    @Override // W0.c
    public final float c() {
        return this.f21691y.c();
    }

    @Override // x0.InterfaceC2632s
    public final W0.m getLayoutDirection() {
        return this.f21691y.f21812y.f21608I;
    }

    @Override // x0.Z, x0.N
    public final Object k() {
        return this.f21691y.k();
    }

    @Override // z0.AbstractC2739O
    public final AbstractC2739O m0() {
        e0 e0Var = this.f21691y.f21813z;
        if (e0Var != null) {
            return e0Var.G0();
        }
        return null;
    }

    @Override // W0.c
    public final float n() {
        return this.f21691y.n();
    }

    @Override // z0.AbstractC2739O
    public final InterfaceC2637x n0() {
        return this.f21688B;
    }

    @Override // z0.AbstractC2739O
    public final boolean o0() {
        return this.f21689C != null;
    }

    @Override // z0.AbstractC2739O
    public final C2731G p0() {
        return this.f21691y.f21812y;
    }

    @Override // z0.AbstractC2739O
    public final x0.P q0() {
        x0.P p5 = this.f21689C;
        if (p5 != null) {
            return p5;
        }
        throw AbstractC0467k.u("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // z0.AbstractC2739O
    public final AbstractC2739O r0() {
        e0 e0Var = this.f21691y.f21795A;
        if (e0Var != null) {
            return e0Var.G0();
        }
        return null;
    }

    @Override // z0.AbstractC2739O
    public final long s0() {
        return this.f21692z;
    }

    @Override // z0.AbstractC2739O, x0.InterfaceC2632s
    public final boolean t() {
        return true;
    }

    @Override // z0.AbstractC2739O
    public final void w0() {
        Z(this.f21692z, 0.0f, null);
    }

    public void y0() {
        q0().b();
    }

    public final void z0(long j5) {
        if (!W0.j.a(this.f21692z, j5)) {
            this.f21692z = j5;
            e0 e0Var = this.f21691y;
            U u5 = e0Var.f21812y.f21613P.f21664q;
            if (u5 != null) {
                u5.j0();
            }
            AbstractC2739O.u0(e0Var);
        }
        if (this.f21683u) {
            return;
        }
        k0(q0());
    }
}
