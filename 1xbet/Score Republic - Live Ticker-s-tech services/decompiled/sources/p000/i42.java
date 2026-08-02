package p000;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class i42 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f3432j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ nx1 f3433k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ q42 f3434l;

    public /* synthetic */ i42(q42 q42Var, nx1 nx1Var, int i) {
        this.f3432j = i;
        this.f3433k = nx1Var;
        this.f3434l = q42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3432j) {
            case 0:
                q42 q42Var = this.f3434l;
                synchronized (q42Var) {
                    try {
                        q42Var.f6375j = false;
                        v42 v42Var = q42Var.f6377l;
                        if (!v42Var.m5070R()) {
                            ky1 ky1Var = ((f02) v42Var.f7192j).f2247o;
                            f02.m1560m(ky1Var);
                            ky1Var.f4608w.m5312a("Connected to service");
                            nx1 nx1Var = this.f3433k;
                            v42Var.mo11z();
                            v42Var.f8065m = nx1Var;
                            v42Var.m5066N();
                            v42Var.m5068P();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                q42 q42Var2 = this.f3434l;
                synchronized (q42Var2) {
                    try {
                        q42Var2.f6375j = false;
                        v42 v42Var2 = q42Var2.f6377l;
                        if (!v42Var2.m5070R()) {
                            ky1 ky1Var2 = ((f02) v42Var2.f7192j).f2247o;
                            f02.m1560m(ky1Var2);
                            ky1Var2.f4607v.m5312a("Connected to remote service");
                            nx1 nx1Var2 = this.f3433k;
                            v42Var2.mo11z();
                            v42Var2.f8065m = nx1Var2;
                            v42Var2.m5066N();
                            v42Var2.m5068P();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                v42 v42Var3 = this.f3434l.f6377l;
                ScheduledExecutorService scheduledExecutorService = v42Var3.f8068p;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    v42Var3.f8068p = null;
                    return;
                }
                return;
        }
    }
}
