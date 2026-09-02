package F;

/* loaded from: classes.dex */
public final class w implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io.flutter.embedding.engine.renderer.h f118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ H.h f119b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f120c;

    public w(x xVar, io.flutter.embedding.engine.renderer.h hVar, H.h hVar2) {
        this.f120c = xVar;
        this.f118a = hVar;
        this.f119b = hVar2;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        C0012m c0012m;
        this.f118a.c(this);
        this.f119b.run();
        x xVar = this.f120c;
        if ((xVar.f126e instanceof C0012m) || (c0012m = xVar.f125d) == null) {
            return;
        }
        c0012m.c();
        C0012m c0012m2 = xVar.f125d;
        if (c0012m2 != null) {
            c0012m2.f92a.close();
            xVar.removeView(xVar.f125d);
            xVar.f125d = null;
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
