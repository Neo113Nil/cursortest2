package Z;

import S3.C0416t;

/* loaded from: classes.dex */
public final class d extends f {

    /* renamed from: e, reason: collision with root package name */
    public final i4.c f6185e;
    public final f f;

    public d(long j5, j jVar, i4.c cVar, f fVar) {
        super(j5, jVar);
        this.f6185e = cVar;
        this.f = fVar;
        fVar.k();
    }

    @Override // Z.f
    public final void c() {
        if (this.f6189c) {
            return;
        }
        long j5 = this.f6188b;
        f fVar = this.f;
        if (j5 != fVar.g()) {
            a();
        }
        fVar.l();
        this.f6189c = true;
        synchronized (l.f6208c) {
            o();
        }
    }

    @Override // Z.f
    public final i4.c e() {
        return this.f6185e;
    }

    @Override // Z.f
    public final boolean f() {
        return true;
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
    public final void n(u uVar) {
        C0416t c0416t = l.f6206a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // Z.f
    public final f u(i4.c cVar) {
        return new d(this.f6188b, this.f6187a, l.l(cVar, this.f6185e, true), this.f);
    }

    @Override // Z.f
    public final void m() {
    }
}
