package P0;

/* loaded from: classes.dex */
public final class s implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f1381a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0.a f1382b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P0.t f1383c;

    public s(P0.t tVar, io.flutter.embedding.engine.renderer.h hVar, F0.a aVar) {
        this.f1383c = tVar;
        this.f1381a = hVar;
        this.f1382b = aVar;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        P0.C0052j c0052j;
        this.f1381a.c(this);
        this.f1382b.run();
        P0.t tVar = this.f1383c;
        if ((tVar.f1390e instanceof P0.C0052j) || (c0052j = tVar.f1389d) == null) {
            return;
        }
        c0052j.c();
        P0.C0052j c0052j2 = tVar.f1389d;
        if (c0052j2 != null) {
            c0052j2.f1359a.close();
            tVar.removeView(tVar.f1389d);
            tVar.f1389d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
