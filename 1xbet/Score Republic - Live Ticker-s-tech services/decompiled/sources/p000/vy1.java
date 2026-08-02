package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class vy1 implements m72, ou0, lu0, hu0 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8299j;

    /* JADX INFO: renamed from: k */
    public final Executor f8300k;

    /* JADX INFO: renamed from: l */
    public final Object f8301l;

    /* JADX INFO: renamed from: m */
    public final Object f8302m;

    public vy1(Executor executor, hu0 hu0Var) {
        this.f8299j = 0;
        this.f8301l = new Object();
        this.f8300k = executor;
        this.f8302m = hu0Var;
    }

    @Override // p000.m72
    /* JADX INFO: renamed from: a */
    public final void mo3331a(v92 v92Var) {
        switch (this.f8299j) {
            case 0:
                if (v92Var.f8143d) {
                    synchronized (this.f8301l) {
                        try {
                            if (((hu0) this.f8302m) != null) {
                                this.f8300k.execute(new cm1(4, this));
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f8301l) {
                    break;
                }
                this.f8300k.execute(new f31(11, this, v92Var));
                return;
            case 2:
                if (v92Var.m5133i() || v92Var.f8143d) {
                    return;
                }
                synchronized (this.f8301l) {
                    try {
                        if (((lu0) this.f8302m) != null) {
                            this.f8300k.execute(new f31(15, this, v92Var));
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 3:
                if (v92Var.m5133i()) {
                    synchronized (this.f8301l) {
                        try {
                            if (((ou0) this.f8302m) != null) {
                                this.f8300k.execute(new f31(21, this, v92Var));
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                    return;
                }
                return;
            default:
                this.f8300k.execute(new f31(28, this, v92Var));
                return;
        }
    }

    @Override // p000.ou0
    /* JADX INFO: renamed from: b */
    public void mo306b(Object obj) {
        ((v92) this.f8302m).m5135k(obj);
    }

    @Override // p000.hu0
    /* JADX INFO: renamed from: c */
    public void mo307c() {
        ((v92) this.f8302m).m5137m();
    }

    @Override // p000.lu0
    /* JADX INFO: renamed from: e */
    public void mo309e(Exception exc) {
        ((v92) this.f8302m).m5136l(exc);
    }

    public vy1(Executor executor, iu0 iu0Var) {
        this.f8299j = 1;
        this.f8301l = new Object();
        this.f8300k = executor;
        this.f8302m = iu0Var;
    }

    public vy1(Executor executor, lu0 lu0Var) {
        this.f8299j = 2;
        this.f8301l = new Object();
        this.f8300k = executor;
        this.f8302m = lu0Var;
    }

    public vy1(Executor executor, ou0 ou0Var) {
        this.f8299j = 3;
        this.f8301l = new Object();
        this.f8300k = executor;
        this.f8302m = ou0Var;
    }

    public vy1(Executor executor, kb1 kb1Var, v92 v92Var) {
        this.f8299j = 4;
        this.f8300k = executor;
        this.f8301l = kb1Var;
        this.f8302m = v92Var;
    }
}
