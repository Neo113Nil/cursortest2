package p000;

import android.app.Application;

/* JADX INFO: renamed from: n4 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0494n4 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final qd0 f5289a;

    /* JADX INFO: renamed from: b */
    public final oy0 f5290b;

    /* JADX INFO: renamed from: c */
    public final C0032ao f5291c;

    /* JADX INFO: renamed from: d */
    public final C0032ao f5292d;

    public C0494n4(qd0 qd0Var, oy0 oy0Var, C0032ao c0032ao, C0032ao c0032ao2) {
        this.f5289a = qd0Var;
        this.f5290b = oy0Var;
        this.f5291c = c0032ao;
        this.f5292d = c0032ao2;
    }

    @Override // p000.ny0
    public final Object get() {
        Application application = (Application) this.f5291c.get();
        py0 py0Var = (py0) this.f5292d.get();
        qd0 qd0Var = this.f5289a;
        return new C0457m4(this.f5290b, (w00) qd0Var.f6471k, application, (kc1) qd0Var.f6473m, py0Var);
    }
}
