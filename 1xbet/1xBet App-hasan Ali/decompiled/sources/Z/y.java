package Z;

import S3.C0416t;
import r.C2322H;

/* loaded from: classes.dex */
public final class y extends b {

    /* renamed from: o, reason: collision with root package name */
    public final b f6248o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f6249p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f6250q;

    /* renamed from: r, reason: collision with root package name */
    public i4.c f6251r;

    /* renamed from: s, reason: collision with root package name */
    public i4.c f6252s;

    /* renamed from: t, reason: collision with root package name */
    public final long f6253t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y(b bVar, i4.c cVar, i4.c cVar2, boolean z3, boolean z5) {
        super(0L, j.f6198o, l.l(cVar, (bVar == null || (r0 = bVar.e()) == null) ? l.f6213j.f6176e : r0, z3), l.b(cVar2, (bVar == null || (r9 = bVar.i()) == null) ? l.f6213j.f : r9));
        i4.c i;
        i4.c e3;
        C0416t c0416t = l.f6206a;
        this.f6248o = bVar;
        this.f6249p = z3;
        this.f6250q = z5;
        this.f6251r = this.f6176e;
        this.f6252s = this.f;
        this.f6253t = X.e.b();
    }

    @Override // Z.b
    public final void C(C2322H c2322h) {
        q.m();
        throw null;
    }

    @Override // Z.b
    public final b D(i4.c cVar, i4.c cVar2) {
        i4.c l5 = l.l(cVar, this.f6251r, true);
        i4.c b3 = l.b(cVar2, this.f6252s);
        return !this.f6249p ? new y(E().D(null, b3), l5, b3, false, true) : E().D(l5, b3);
    }

    public final b E() {
        b bVar = this.f6248o;
        return bVar == null ? l.f6213j : bVar;
    }

    @Override // Z.b, Z.f
    public final void c() {
        b bVar;
        this.f6189c = true;
        if (!this.f6250q || (bVar = this.f6248o) == null) {
            return;
        }
        bVar.c();
    }

    @Override // Z.f
    public final j d() {
        return E().d();
    }

    @Override // Z.b, Z.f
    public final i4.c e() {
        return this.f6251r;
    }

    @Override // Z.b, Z.f
    public final boolean f() {
        return E().f();
    }

    @Override // Z.f
    public final long g() {
        return E().g();
    }

    @Override // Z.b, Z.f
    public final int h() {
        return E().h();
    }

    @Override // Z.b, Z.f
    public final i4.c i() {
        return this.f6252s;
    }

    @Override // Z.b, Z.f
    public final void k() {
        q.m();
        throw null;
    }

    @Override // Z.b, Z.f
    public final void l() {
        q.m();
        throw null;
    }

    @Override // Z.b, Z.f
    public final void m() {
        E().m();
    }

    @Override // Z.b, Z.f
    public final void n(u uVar) {
        E().n(uVar);
    }

    @Override // Z.f
    public final void r(j jVar) {
        q.m();
        throw null;
    }

    @Override // Z.f
    public final void s(long j5) {
        q.m();
        throw null;
    }

    @Override // Z.b, Z.f
    public final void t(int i) {
        E().t(i);
    }

    @Override // Z.b, Z.f
    public final f u(i4.c cVar) {
        i4.c l5 = l.l(cVar, this.f6251r, true);
        return !this.f6249p ? l.h(E().u(null), l5, true) : E().u(l5);
    }

    @Override // Z.b
    public final q w() {
        return E().w();
    }

    @Override // Z.b
    public final C2322H x() {
        return E().x();
    }

    @Override // Z.b
    /* renamed from: y */
    public final i4.c e() {
        return this.f6251r;
    }
}
