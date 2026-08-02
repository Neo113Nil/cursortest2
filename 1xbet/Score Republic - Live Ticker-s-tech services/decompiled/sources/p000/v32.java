package p000;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class v32 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f8053j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ z72 f8054k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ v42 f8055l;

    public v32(v42 v42Var, z72 z72Var) {
        this.f8053j = 4;
        this.f8054k = z72Var;
        Objects.requireNonNull(v42Var);
        this.f8055l = v42Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.f8053j;
        z72 z72Var = this.f8054k;
        v42 v42Var = this.f8055l;
        switch (i) {
            case 0:
                nx1 nx1Var = v42Var.f8065m;
                f02 f02Var = (f02) v42Var.f7192j;
                if (nx1Var != null) {
                    try {
                        nx1Var.mo577s(z72Var);
                    } catch (RemoteException e) {
                        ky1 ky1Var = f02Var.f2247o;
                        f02.m1560m(ky1Var);
                        ky1Var.f4600o.m5313b(e, "Failed to reset data on the service: remote exception");
                    }
                    v42Var.m5066N();
                } else {
                    ky1 ky1Var2 = f02Var.f2247o;
                    f02.m1560m(ky1Var2);
                    ky1Var2.f4600o.m5312a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                nx1 nx1Var2 = v42Var.f8065m;
                f02 f02Var2 = (f02) v42Var.f7192j;
                if (nx1Var2 == null) {
                    ky1 ky1Var3 = f02Var2.f2247o;
                    f02.m1560m(ky1Var3);
                    ky1Var3.f4600o.m5312a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        bt1 bt1Var = f02Var2.f2245m;
                        ix1 ix1Var = jx1.f4157W0;
                        if (bt1Var.m770L(null, ix1Var)) {
                            v42Var.m5071S(nx1Var2, null, z72Var);
                        }
                        nx1Var2.mo578u(z72Var);
                        f02Var2.m1572o().m535F();
                        f02Var2.f2245m.m770L(null, ix1Var);
                        v42Var.m5071S(nx1Var2, null, z72Var);
                        v42Var.m5066N();
                    } catch (RemoteException e2) {
                        ky1 ky1Var4 = f02Var2.f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4600o.m5313b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                nx1 nx1Var3 = v42Var.f8065m;
                f02 f02Var3 = (f02) v42Var.f7192j;
                if (nx1Var3 == null) {
                    ky1 ky1Var5 = f02Var3.f2247o;
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4603r.m5312a("Failed to send app backgrounded");
                } else {
                    try {
                        nx1Var3.mo560E(z72Var);
                        v42Var.m5066N();
                    } catch (RemoteException e3) {
                        ky1 ky1Var6 = f02Var3.f2247o;
                        f02.m1560m(ky1Var6);
                        ky1Var6.f4600o.m5313b(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                nx1 nx1Var4 = v42Var.f8065m;
                f02 f02Var4 = (f02) v42Var.f7192j;
                if (nx1Var4 == null) {
                    ky1 ky1Var7 = f02Var4.f2247o;
                    f02.m1560m(ky1Var7);
                    ky1Var7.f4600o.m5312a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        nx1Var4.mo568i(z72Var);
                        v42Var.m5066N();
                    } catch (RemoteException e4) {
                        ky1 ky1Var8 = f02Var4.f2247o;
                        f02.m1560m(ky1Var8);
                        ky1Var8.f4600o.m5313b(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                nx1 nx1Var5 = v42Var.f8065m;
                f02 f02Var5 = (f02) v42Var.f7192j;
                if (nx1Var5 == null) {
                    ky1 ky1Var9 = f02Var5.f2247o;
                    f02.m1560m(ky1Var9);
                    ky1Var9.f4600o.m5312a("Failed to send consent settings to service");
                } else {
                    try {
                        nx1Var5.mo566f(z72Var);
                        v42Var.m5066N();
                    } catch (RemoteException e5) {
                        ky1 ky1Var10 = f02Var5.f2247o;
                        f02.m1560m(ky1Var10);
                        ky1Var10.f4600o.m5313b(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public /* synthetic */ v32(v42 v42Var, z72 z72Var, int i) {
        this.f8053j = i;
        this.f8054k = z72Var;
        this.f8055l = v42Var;
    }
}
