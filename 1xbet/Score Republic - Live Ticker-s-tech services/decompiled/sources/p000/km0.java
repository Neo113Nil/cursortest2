package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class km0 extends hm0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4446j;

    /* JADX INFO: renamed from: k */
    public final Object f4447k;

    public /* synthetic */ km0(int i, Object obj) {
        this.f4446j = i;
        this.f4447k = obj;
    }

    @Override // p000.hm0
    /* JADX INFO: renamed from: c */
    public final void mo2294c(xm0 xm0Var) {
        int i = this.f4446j;
        Object obj = this.f4447k;
        switch (i) {
            case 0:
                jm0 jm0Var = new jm0(xm0Var);
                xm0Var.mo975a(jm0Var);
                try {
                    C0615qe c0615qe = (C0615qe) obj;
                    v92 v92Var = (v92) c0615qe.f6477k;
                    Executor executor = (Executor) c0615qe.f6478l;
                    v92Var.m5127c(executor, new fd0(jm0Var));
                    v92Var.m5126b(executor, new fd0(jm0Var));
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    jm0Var.onError(th);
                    return;
                }
                break;
            default:
                ((AbstractC0213fj) obj).m1874c(new sm0(0, xm0Var));
                break;
        }
    }
}
