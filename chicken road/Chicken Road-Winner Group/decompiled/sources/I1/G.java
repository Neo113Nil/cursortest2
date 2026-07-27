package I1;

/* loaded from: classes.dex */
public final class G implements io.flutter.embedding.engine.renderer.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f581a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ I f582b;

    public G(I i3, Runnable runnable) {
        this.f582b = i3;
        this.f581a = runnable;
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void b() {
        this.f581a.run();
        io.flutter.embedding.engine.renderer.j jVar = this.f582b.f584b;
        if (jVar != null) {
            jVar.g(this);
        }
    }

    @Override // io.flutter.embedding.engine.renderer.k
    public final void a() {
    }
}
