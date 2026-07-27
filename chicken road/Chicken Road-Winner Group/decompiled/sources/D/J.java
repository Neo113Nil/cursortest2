package D;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class J extends L {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f206a = I.m();

    @Override // D.L
    public V b() {
        WindowInsets build;
        a();
        build = this.f206a.build();
        V a3 = V.a(build, null);
        a3.f223a.n(null);
        return a3;
    }

    @Override // D.L
    public void c(w.c cVar) {
        this.f206a.setStableInsets(cVar.c());
    }

    @Override // D.L
    public void d(w.c cVar) {
        this.f206a.setSystemWindowInsets(cVar.c());
    }
}
