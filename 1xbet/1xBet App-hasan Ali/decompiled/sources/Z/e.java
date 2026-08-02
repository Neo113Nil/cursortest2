package Z;

import S3.C0416t;

/* loaded from: classes.dex */
public final class e extends f {

    /* renamed from: e, reason: collision with root package name */
    public final i4.c f6186e;
    public int f;

    public e(long j5, j jVar, i4.c cVar) {
        super(j5, jVar);
        this.f6186e = cVar;
        this.f = 1;
    }

    @Override // Z.f
    public final void c() {
        if (this.f6189c) {
            return;
        }
        l();
        this.f6189c = true;
        synchronized (l.f6208c) {
            o();
        }
    }

    @Override // Z.f
    public final i4.c e() {
        return this.f6186e;
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
        this.f++;
    }

    @Override // Z.f
    public final void l() {
        int i = this.f - 1;
        this.f = i;
        if (i == 0) {
            a();
        }
    }

    @Override // Z.f
    public final void n(u uVar) {
        C0416t c0416t = l.f6206a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // Z.f
    public final f u(i4.c cVar) {
        l.d(this);
        return new d(this.f6188b, this.f6187a, l.l(cVar, this.f6186e, true), this);
    }

    @Override // Z.f
    public final void m() {
    }
}
