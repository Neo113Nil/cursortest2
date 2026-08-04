package P;

import C1.AbstractC0097c;
import android.view.WindowInsets;

/* JADX INFO: loaded from: classes.dex */
public class g0 extends i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowInsets.Builder f5067a;

    public g0() {
        this.f5067a = AbstractC0097c.d();
    }

    @Override // P.i0
    public q0 b() {
        a();
        q0 q0VarG = q0.g(this.f5067a.build(), null);
        q0VarG.f5101a.l(null);
        return q0VarG;
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
        WindowInsets.Builder builderD;
        super(q0Var);
        WindowInsets windowInsetsF = q0Var.f();
        if (windowInsetsF != null) {
            builderD = AbstractC0097c.e(windowInsetsF);
        } else {
            builderD = AbstractC0097c.d();
        }
        this.f5067a = builderD;
    }
}
