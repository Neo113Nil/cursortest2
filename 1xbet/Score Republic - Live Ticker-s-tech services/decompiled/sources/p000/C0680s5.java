package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: s5 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0680s5 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7029a = 1;

    /* JADX INFO: renamed from: b */
    public final Object f7030b;

    public C0680s5(f02 f02Var) {
        this.f7030b = f02Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        int i = this.f7029a;
        Object obj = this.f7030b;
        switch (i) {
            case 0:
                ((AbstractC0717t5) obj).mo4247g();
                break;
            default:
                f02 f02Var = (f02) obj;
                if (intent != null) {
                    String action = intent.getAction();
                    if (action != null) {
                        int iHashCode = action.hashCode();
                        if (iHashCode != -1928239649) {
                            if (iHashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                                ky1 ky1Var = f02Var.f2247o;
                                f02.m1560m(ky1Var);
                                ky1Var.f4608w.m5312a("[sgtm] App Receiver notified batches are available");
                                a02 a02Var = f02Var.f2248p;
                                f02.m1560m(a02Var);
                                a02Var.m6J(new cm1(15, this));
                            }
                            break;
                        } else if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                            fs1.m1890a();
                            if (f02Var.f2245m.m770L(null, jx1.f4143P0)) {
                                ky1 ky1Var2 = f02Var.f2247o;
                                f02.m1560m(ky1Var2);
                                ky1Var2.f4608w.m5312a("App receiver notified triggers are available");
                                a02 a02Var2 = f02Var.f2248p;
                                f02.m1560m(a02Var2);
                                a02Var2.m6J(new cm1(16, f02Var));
                                break;
                            }
                        }
                        ky1 ky1Var3 = f02Var.f2247o;
                        f02.m1560m(ky1Var3);
                        ky1Var3.f4603r.m5312a("App receiver called with unknown action");
                    } else {
                        ky1 ky1Var4 = f02Var.f2247o;
                        f02.m1560m(ky1Var4);
                        ky1Var4.f4603r.m5312a("App receiver called with null action");
                    }
                } else {
                    ky1 ky1Var5 = f02Var.f2247o;
                    f02.m1560m(ky1Var5);
                    ky1Var5.f4603r.m5312a("App receiver called with null intent");
                }
                break;
        }
    }

    public C0680s5(AbstractC0717t5 abstractC0717t5) {
        this.f7030b = abstractC0717t5;
    }
}
