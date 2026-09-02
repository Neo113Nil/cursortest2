package s0;

/* loaded from: classes.dex */
public final class n implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.i f6546a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.lifecycle.o f6547b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f6548c;

    public n(o oVar, io.flutter.embedding.engine.renderer.i iVar, androidx.lifecycle.o oVar2) {
        this.f6548c = oVar;
        this.f6546a = iVar;
        this.f6547b = oVar2;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        h hVar;
        this.f6546a.c(this);
        this.f6547b.run();
        o oVar = this.f6548c;
        if ((oVar.f6555e instanceof h) || (hVar = oVar.f6554d) == null) {
            return;
        }
        hVar.c();
        h hVar2 = oVar.f6554d;
        if (hVar2 != null) {
            hVar2.f6526a.close();
            oVar.removeView(oVar.f6554d);
            oVar.f6554d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
    }
}
