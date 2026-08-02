package B;

import java.util.HashMap;
import java.util.Map;
import x0.P;
import x0.Q;
import x0.j0;

/* loaded from: classes.dex */
public final class u implements Q {

    /* renamed from: k, reason: collision with root package name */
    public final q f712k;

    /* renamed from: l, reason: collision with root package name */
    public final j0 f713l;

    /* renamed from: m, reason: collision with root package name */
    public final A.k f714m;

    /* renamed from: n, reason: collision with root package name */
    public final HashMap f715n = new HashMap();

    public u(q qVar, j0 j0Var) {
        this.f712k = qVar;
        this.f713l = j0Var;
        this.f714m = (A.k) qVar.f699b.invoke();
    }

    @Override // W0.c
    public final float D(long j5) {
        return this.f713l.D(j5);
    }

    @Override // W0.c
    public final int K(float f) {
        return this.f713l.K(f);
    }

    @Override // W0.c
    public final long S(long j5) {
        return this.f713l.S(j5);
    }

    @Override // W0.c
    public final float V(long j5) {
        return this.f713l.V(j5);
    }

    @Override // W0.c
    public final long b0(float f) {
        return this.f713l.b0(f);
    }

    @Override // W0.c
    public final float c() {
        return this.f713l.c();
    }

    @Override // x0.InterfaceC2632s
    public final W0.m getLayoutDirection() {
        return this.f713l.getLayoutDirection();
    }

    @Override // W0.c
    public final float h0(int i) {
        return this.f713l.h0(i);
    }

    @Override // x0.Q
    public final P i(int i, int i5, Map map, i4.c cVar) {
        return this.f713l.i(i, i5, map, cVar);
    }

    @Override // W0.c
    public final float i0(float f) {
        return this.f713l.i0(f);
    }

    @Override // W0.c
    public final float n() {
        return this.f713l.n();
    }

    @Override // x0.Q
    public final P p(int i, int i5, Map map, i0.K k5, i4.c cVar) {
        return this.f713l.p(i, i5, map, k5, cVar);
    }

    @Override // x0.InterfaceC2632s
    public final boolean t() {
        return this.f713l.t();
    }

    @Override // W0.c
    public final long x(long j5) {
        return this.f713l.x(j5);
    }

    @Override // W0.c
    public final float y(float f) {
        return this.f713l.y(f);
    }
}
