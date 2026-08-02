package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: br */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0072br implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final ny0 f961a;

    /* JADX INFO: renamed from: b */
    public final ny0 f962b;

    /* JADX INFO: renamed from: c */
    public final q51 f963c;

    /* JADX INFO: renamed from: d */
    public final ny0 f964d;

    /* JADX INFO: renamed from: e */
    public final ny0 f965e;

    public C0072br(ny0 ny0Var, ny0 ny0Var2, q51 q51Var, ny0 ny0Var3, ny0 ny0Var4) {
        this.f961a = ny0Var;
        this.f962b = ny0Var2;
        this.f963c = q51Var;
        this.f964d = ny0Var3;
        this.f965e = ny0Var4;
    }

    @Override // p000.ny0
    public final Object get() {
        return new C0035ar((Executor) this.f961a.get(), (op0) this.f962b.get(), (qd0) this.f963c.get(), (g41) this.f964d.get(), (g41) this.f965e.get());
    }
}
