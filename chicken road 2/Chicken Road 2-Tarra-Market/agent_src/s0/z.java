package s0;

/* loaded from: classes.dex */
public final class z implements io.flutter.embedding.engine.renderer.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6602a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SurfaceHolderCallback2C0832B f6603b;

    public z(SurfaceHolderCallback2C0832B surfaceHolderCallback2C0832B, Runnable runnable) {
        this.f6603b = surfaceHolderCallback2C0832B;
        this.f6602a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void b() {
        this.f6602a.run();
        io.flutter.embedding.engine.renderer.i iVar = this.f6603b.f6495b;
        if (iVar != null) {
            iVar.c(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.j
    public final void a() {
    }
}
