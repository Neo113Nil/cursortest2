package p000;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c02 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f1060j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ gv1 f1061k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ AppMeasurementDynamiteService f1062l;

    public /* synthetic */ c02(AppMeasurementDynamiteService appMeasurementDynamiteService, gv1 gv1Var, int i) {
        this.f1060j = i;
        this.f1061k = gv1Var;
        this.f1062l = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.f1060j) {
            case 0:
                v42 v42VarM1573p = this.f1062l.f1351b.m1573p();
                gv1 gv1Var = this.f1061k;
                v42VarM1573p.mo11z();
                v42VarM1573p.m3446B();
                v42VarM1573p.m5067O(new RunnableC0702sr(v42VarM1573p, v42VarM1573p.m5069Q(false), gv1Var, 15));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f1062l;
                f72 f72Var = appMeasurementDynamiteService.f1351b.f2250r;
                f02.m1558k(f72Var);
                f02 f02Var = appMeasurementDynamiteService.f1351b;
                if (f02Var.f2235H != null && f02Var.f2235H.booleanValue()) {
                    z = true;
                }
                f72Var.m1737s0(this.f1061k, z);
                break;
        }
    }
}
