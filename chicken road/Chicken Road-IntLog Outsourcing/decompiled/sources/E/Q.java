package E;

import android.view.WindowInsets;
import x.C1528c;

/* loaded from: classes.dex */
public class Q extends T {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f579a = P.f();

    @Override // E.T
    public b0 b() {
        WindowInsets build;
        a();
        build = this.f579a.build();
        b0 a6 = b0.a(build, null);
        a6.f601a.n(null);
        return a6;
    }

    @Override // E.T
    public void c(C1528c c1528c) {
        this.f579a.setStableInsets(c1528c.c());
    }

    @Override // E.T
    public void d(C1528c c1528c) {
        this.f579a.setSystemWindowInsets(c1528c.c());
    }
}
