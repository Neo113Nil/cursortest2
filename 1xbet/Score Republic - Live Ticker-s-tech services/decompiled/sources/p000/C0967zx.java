package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: zx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0967zx implements InterfaceC0931yy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9979a;

    /* JADX INFO: renamed from: b */
    public final qd0 f9980b;

    public /* synthetic */ C0967zx(qd0 qd0Var, int i) {
        this.f9979a = i;
        this.f9980b = qd0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f9979a;
        qd0 qd0Var = this.f9980b;
        switch (i) {
            case 0:
                Executor executor = (Executor) qd0Var.f6471k;
                yd0.m5765d(executor);
                return executor;
            case 1:
                Executor executor2 = (Executor) qd0Var.f6472l;
                yd0.m5765d(executor2);
                return executor2;
            default:
                Executor executor3 = (Executor) qd0Var.f6473m;
                yd0.m5765d(executor3);
                return executor3;
        }
    }
}
