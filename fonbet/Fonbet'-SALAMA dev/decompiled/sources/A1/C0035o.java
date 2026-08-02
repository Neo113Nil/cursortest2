package A1;

/* renamed from: A1.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035o implements v2.h {

    /* renamed from: a, reason: collision with root package name */
    public final v2.o f519a;

    /* renamed from: b, reason: collision with root package name */
    public final U f520b;

    /* renamed from: c, reason: collision with root package name */
    public AbstractC0023i f521c;

    /* renamed from: d, reason: collision with root package name */
    public v2.h f522d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f523e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f524f;

    public C0035o(U u4, v2.p pVar) {
        this.f520b = u4;
        this.f519a = new v2.o(pVar);
    }

    @Override // v2.h
    public final long a() {
        if (this.f523e) {
            return this.f519a.a();
        }
        v2.h hVar = this.f522d;
        hVar.getClass();
        return hVar.a();
    }

    @Override // v2.h
    public final void b(w0 w0Var) {
        v2.h hVar = this.f522d;
        if (hVar != null) {
            hVar.b(w0Var);
            w0Var = this.f522d.d();
        }
        this.f519a.b(w0Var);
    }

    @Override // v2.h
    public final w0 d() {
        v2.h hVar = this.f522d;
        return hVar != null ? hVar.d() : this.f519a.f17144e;
    }
}
