package Z;

import P.C0283b0;

/* loaded from: classes.dex */
public final class a extends b {
    @Override // Z.b
    public final b D(i4.c cVar, i4.c cVar2) {
        return (b) ((f) l.f(new O0.e(11, new H2.f(2, cVar, cVar2))));
    }

    @Override // Z.b, Z.f
    public final void c() {
        synchronized (l.f6208c) {
            o();
        }
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
        l.a();
    }

    @Override // Z.b, Z.f
    public final f u(i4.c cVar) {
        return (e) ((f) l.f(new O0.e(11, new C0283b0(cVar, 1))));
    }

    @Override // Z.b
    public final q w() {
        throw new IllegalStateException("Cannot apply the global snapshot directly. Call Snapshot.advanceGlobalSnapshot");
    }
}
