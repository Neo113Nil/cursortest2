package P;

import C1.AbstractC0097c;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class g0 extends i0 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f5067a;

    public g0() {
        this.f5067a = AbstractC0097c.d();
    }

    @Override // P.i0
    public q0 b() {
        WindowInsets build;
        a();
        build = this.f5067a.build();
        q0 g3 = q0.g(build, null);
        g3.f5101a.l(null);
        return g3;
    }

    @Override // P.i0
    public void c(I.c cVar) {
        this.f5067a.setStableInsets(cVar.b());
    }

    @Override // P.i0
    public void d(I.c cVar) {
        this.f5067a.setSystemWindowInsets(cVar.b());
    }

    public g0(q0 q0Var) {
        super(q0Var);
        WindowInsets.Builder d7;
        WindowInsets f7 = q0Var.f();
        if (f7 != null) {
            d7 = AbstractC0097c.e(f7);
        } else {
            d7 = AbstractC0097c.d();
        }
        this.f5067a = d7;
    }
}
