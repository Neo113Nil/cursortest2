package I1;

/* loaded from: classes.dex */
public final class p implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.j f637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ G0.m f638b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f639c;

    public p(q qVar, io.flutter.embedding.engine.renderer.j jVar, G0.m mVar) {
        this.f639c = qVar;
        this.f637a = jVar;
        this.f638b = mVar;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        C0031h c0031h;
        this.f637a.g(this);
        this.f638b.run();
        q qVar = this.f639c;
        if ((qVar.f646e instanceof C0031h) || (c0031h = qVar.f645d) == null) {
            return;
        }
        c0031h.b();
        C0031h c0031h2 = qVar.f645d;
        if (c0031h2 != null) {
            c0031h2.f616a.close();
            qVar.removeView(qVar.f645d);
            qVar.f645d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
