package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class al0 extends s40 {

    /* JADX INFO: renamed from: e */
    public final ke0 f231e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0727tf f232f;

    /* JADX INFO: renamed from: g */
    public final Executor f233g;

    /* JADX INFO: renamed from: h */
    public final wp0 f234h;

    /* JADX INFO: renamed from: i */
    public final C0697sm f235i;

    /* JADX INFO: renamed from: j */
    public C0095ce f236j;

    /* JADX INFO: renamed from: k */
    public xe1 f237k;

    public al0(ke0 ke0Var, el0 el0Var, Executor executor, wp0 wp0Var, C0095ce c0095ce) {
        this.f231e = ke0Var;
        this.f232f = el0Var;
        this.f234h = wp0Var;
        Executor executor2 = c0095ce.f1226b;
        executor = executor2 != null ? executor2 : executor;
        this.f233g = executor;
        C0547ok c0547okM919b = C0095ce.m919b(c0095ce);
        c0547okM919b.f5763b = executor;
        this.f236j = new C0095ce(c0547okM919b);
        this.f235i = C0697sm.m4537b();
    }

    @Override // p000.s40, p000.xe1
    /* JADX INFO: renamed from: b */
    public final void mo272b(String str, Throwable th) {
        xe1 xe1Var = this.f237k;
        if (xe1Var != null) {
            xe1Var.mo272b(str, th);
        }
    }

    @Override // p000.xe1
    /* JADX INFO: renamed from: o */
    public final void mo273o(d71 d71Var, np0 np0Var) {
        C0095ce c0095ce = this.f236j;
        wp0 wp0Var = this.f234h;
        a90.m127k(wp0Var, "method");
        a90.m127k(c0095ce, "callOptions");
        f50 f50VarMo3030a = this.f231e.mo3030a();
        ja1 ja1Var = (ja1) f50VarMo3030a.f2313k;
        if (!ja1Var.m2838f()) {
            this.f233g.execute(new C0813vr(this, d71Var, ca0.m913h(ja1Var)));
            this.f237k = jl0.f3971i0;
            return;
        }
        sl0 sl0Var = (sl0) f50VarMo3030a.f2314l;
        ql0 ql0Var = (ql0) sl0Var.f7141b.get((String) wp0Var.f8621m);
        if (ql0Var == null) {
            ql0Var = (ql0) sl0Var.f7142c.get((String) wp0Var.f8622n);
        }
        if (ql0Var == null) {
            ql0Var = sl0Var.f7140a;
        }
        if (ql0Var != null) {
            this.f236j = this.f236j.m921c(ql0.f6529g, ql0Var);
        }
        xe1 xe1VarMo1439f = this.f232f.mo1439f(wp0Var, this.f236j);
        this.f237k = xe1VarMo1439f;
        xe1VarMo1439f.mo273o(d71Var, np0Var);
    }

    @Override // p000.s40
    /* JADX INFO: renamed from: r */
    public final xe1 mo274r() {
        return this.f237k;
    }
}
