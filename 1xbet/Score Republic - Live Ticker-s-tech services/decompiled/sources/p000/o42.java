package p000;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o42 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f5623j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ v42 f5624k;

    public /* synthetic */ o42(v42 v42Var, int i) {
        this.f5623j = i;
        this.f5624k = v42Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5623j;
        v42 v42Var = this.f5624k;
        switch (i) {
            case 0:
                v42Var.m5059G();
                break;
            case 1:
                f02 f02Var = (f02) v42Var.f7192j;
                nx1 nx1Var = v42Var.f8065m;
                if (nx1Var == null) {
                    ky1 ky1Var = f02Var.f2247o;
                    f02.m1560m(ky1Var);
                    ky1Var.f4600o.m5312a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        nx1Var.mo569j(v42Var.m5069Q(false));
                        v42Var.m5066N();
                    } catch (RemoteException e) {
                        ky1 ky1Var2 = f02Var.f2247o;
                        f02.m1560m(ky1Var2);
                        ky1Var2.f4600o.m5313b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                f02 f02Var2 = (f02) v42Var.f7192j;
                nx1 nx1Var2 = v42Var.f8065m;
                if (nx1Var2 == null) {
                    ky1 ky1Var3 = f02Var2.f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4600o.m5312a("Failed to send storage consent settings to service");
                } else {
                    try {
                        nx1Var2.mo556A(v42Var.m5069Q(false));
                        v42Var.m5066N();
                    } catch (RemoteException e2) {
                        ky1 ky1Var4 = f02Var2.f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4600o.m5313b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
