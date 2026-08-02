package p000;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class l72 implements o12 {

    /* JADX INFO: renamed from: a */
    public final kv1 f4706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AppMeasurementDynamiteService f4707b;

    public l72(AppMeasurementDynamiteService appMeasurementDynamiteService, kv1 kv1Var) {
        this.f4707b = appMeasurementDynamiteService;
        this.f4706a = kv1Var;
    }

    @Override // p000.o12
    /* JADX INFO: renamed from: a */
    public final void mo3188a(String str, String str2, Bundle bundle, long j) {
        try {
            this.f4706a.mo2968h(str, str2, bundle, j);
        } catch (RemoteException e) {
            f02 f02Var = this.f4707b.f1351b;
            if (f02Var != null) {
                ky1 ky1Var = f02Var.f2247o;
                f02.m1560m(ky1Var);
                ky1Var.f4603r.m5313b(e, "Event listener threw exception");
            }
        }
    }
}
