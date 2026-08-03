package P0;

/* loaded from: classes.dex */
public final class H implements io.flutter.embedding.engine.renderer.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f1321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ P0.J f1322b;

    public H(P0.J j2, java.lang.Runnable runnable) {
        this.f1322b = j2;
        this.f1321a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void b() {
        this.f1321a.run();
        io.flutter.embedding.engine.renderer.h hVar = this.f1322b.f1326b;
        if (hVar != null) {
            hVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.i
    public final void a() {
    }
}
