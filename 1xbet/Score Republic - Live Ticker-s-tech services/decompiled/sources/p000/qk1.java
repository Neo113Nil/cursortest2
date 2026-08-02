package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class qk1 implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final ny0 f6518a;

    /* JADX INFO: renamed from: b */
    public final ny0 f6519b;

    /* JADX INFO: renamed from: c */
    public final q51 f6520c;

    /* JADX INFO: renamed from: d */
    public final ny0 f6521d;

    public qk1(ny0 ny0Var, ny0 ny0Var2, q51 q51Var, ny0 ny0Var3) {
        this.f6518a = ny0Var;
        this.f6519b = ny0Var2;
        this.f6520c = q51Var;
        this.f6521d = ny0Var3;
    }

    @Override // p000.ny0
    public final Object get() {
        return new f71((Executor) this.f6518a.get(), (g41) this.f6519b.get(), (qd0) this.f6520c.get(), (g41) this.f6521d.get(), 14);
    }
}
