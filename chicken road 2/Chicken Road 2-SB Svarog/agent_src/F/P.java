package F;

/* loaded from: classes.dex */
public final class P implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f54a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ S f55b;

    public P(S s2, Runnable runnable) {
        this.f55b = s2;
        this.f54a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        this.f54a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f55b.f59b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
