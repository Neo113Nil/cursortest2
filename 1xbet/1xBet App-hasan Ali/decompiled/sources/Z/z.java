package Z;

import S3.C0416t;

/* loaded from: classes.dex */
public final class z extends f {

    /* renamed from: e, reason: collision with root package name */
    public final f f6254e;
    public final boolean f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f6255g;

    /* renamed from: h, reason: collision with root package name */
    public i4.c f6256h;
    public final long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(f fVar, i4.c cVar, boolean z3, boolean z5) {
        super(0L, j.f6198o);
        i4.c e3;
        C0416t c0416t = l.f6206a;
        this.f6254e = fVar;
        this.f = z3;
        this.f6255g = z5;
        this.f6256h = l.l(cVar, (fVar == null || (e3 = fVar.e()) == null) ? l.f6213j.f6176e : e3, z3);
        this.i = X.e.b();
    }

    @Override // Z.f
    public final void c() {
        f fVar;
        this.f6189c = true;
        if (!this.f6255g || (fVar = this.f6254e) == null) {
            return;
        }
        fVar.c();
    }

    @Override // Z.f
    public final j d() {
        return v().d();
    }

    @Override // Z.f
    public final i4.c e() {
        return this.f6256h;
    }

    @Override // Z.f
    public final boolean f() {
        return v().f();
    }

    @Override // Z.f
    public final long g() {
        return v().g();
    }

    @Override // Z.f
    public final i4.c i() {
        return null;
    }

    @Override // Z.f
    public final void k() {
        q.m();
        throw null;
    }

    @Override // Z.f
    public final void l() {
        q.m();
        throw null;
    }

    @Override // Z.f
    public final void m() {
        v().m();
    }

    @Override // Z.f
    public final void n(u uVar) {
        v().n(uVar);
    }

    @Override // Z.f
    public final f u(i4.c cVar) {
        i4.c l5 = l.l(cVar, this.f6256h, true);
        return !this.f ? l.h(v().u(null), l5, true) : v().u(l5);
    }

    public final f v() {
        f fVar = this.f6254e;
        return fVar == null ? l.f6213j : fVar;
    }
}
