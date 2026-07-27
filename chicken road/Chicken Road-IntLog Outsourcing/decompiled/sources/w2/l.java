package w2;

/* loaded from: classes.dex */
public final class l implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.i f12165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ B2.b f12166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f12167c;

    public l(m mVar, io.flutter.embedding.engine.renderer.i iVar, B2.b bVar) {
        this.f12167c = mVar;
        this.f12165a = iVar;
        this.f12166b = bVar;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        C1518f c1518f;
        this.f12165a.c(this);
        this.f12166b.run();
        m mVar = this.f12167c;
        if ((mVar.f12174e instanceof C1518f) || (c1518f = mVar.f12173d) == null) {
            return;
        }
        c1518f.b();
        C1518f c1518f2 = mVar.f12173d;
        if (c1518f2 != null) {
            c1518f2.f12145a.close();
            mVar.removeView(mVar.f12173d);
            mVar.f12173d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
    }
}
