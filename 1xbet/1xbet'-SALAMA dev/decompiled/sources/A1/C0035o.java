package A1;

/* JADX INFO: renamed from: A1.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0035o implements p151v2.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p151v2.o f519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final U f520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC0023i f521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p151v2.h f522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f523e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f524f;

    public C0035o(U u4, p151v2.p pVar) {
        this.f520b = u4;
        this.f519a = new p151v2.o(pVar);
    }

    @Override // p151v2.h
    public final long a() {
        if (this.f523e) {
            return this.f519a.a();
        }
        p151v2.h hVar = this.f522d;
        hVar.getClass();
        return hVar.a();
    }

    @Override // p151v2.h
    public final void b(w0 w0Var) {
        p151v2.h hVar = this.f522d;
        if (hVar != null) {
            hVar.b(w0Var);
            w0Var = this.f522d.d();
        }
        this.f519a.b(w0Var);
    }

    @Override // p151v2.h
    public final w0 d() {
        p151v2.h hVar = this.f522d;
        return hVar != null ? hVar.d() : this.f519a.f17150e;
    }
}
