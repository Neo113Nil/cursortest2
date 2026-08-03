package y;

/* loaded from: classes.dex */
public class G extends y.I {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.WindowInsets.Builder f8430a = io.flutter.plugin.platform.i.g();

    @Override // y.I
    public y.Q b() {
        android.view.WindowInsets build;
        a();
        build = this.f8430a.build();
        y.Q a2 = y.Q.a(build, null);
        a2.f8448a.n(null);
        return a2;
    }

    @Override // y.I
    public void c(r.c cVar) {
        this.f8430a.setStableInsets(cVar.c());
    }

    @Override // y.I
    public void d(r.c cVar) {
        this.f8430a.setSystemWindowInsets(cVar.c());
    }
}
