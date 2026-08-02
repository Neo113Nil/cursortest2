package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i10 implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final oy0 f3373a;

    /* JADX INFO: renamed from: b */
    public final C0032ao f3374b;

    /* JADX INFO: renamed from: c */
    public final C0531o4 f3375c;

    /* JADX INFO: renamed from: d */
    public final C0568p4 f3376d;

    /* JADX INFO: renamed from: e */
    public final C0852wt f3377e;

    /* JADX INFO: renamed from: f */
    public final C0032ao f3378f;

    /* JADX INFO: renamed from: g */
    public final C0032ao f3379g;

    public i10(oy0 oy0Var, C0032ao c0032ao, C0531o4 c0531o4, C0568p4 c0568p4, C0852wt c0852wt, C0032ao c0032ao2, C0032ao c0032ao3) {
        this.f3373a = oy0Var;
        this.f3374b = c0032ao;
        this.f3375c = c0531o4;
        this.f3376d = c0568p4;
        this.f3377e = c0852wt;
        this.f3378f = c0032ao2;
        this.f3379g = c0032ao3;
    }

    @Override // p000.ny0
    public final Object get() {
        hd0 hd0Var = (hd0) this.f3373a.get();
        this.f3374b.get();
        this.f3375c.get();
        return new x00(hd0Var, (m10) this.f3376d.get(), (C0547ok) this.f3377e.get(), (C0666rs) this.f3378f.get(), (Executor) this.f3379g.get());
    }
}
