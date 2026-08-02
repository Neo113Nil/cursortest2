package p000;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hz1 implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public final String f3364j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ iz1 f3365k;

    public hz1(iz1 iz1Var, String str) {
        Objects.requireNonNull(iz1Var);
        this.f3365k = iz1Var;
        this.f3364j = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        iz1 iz1Var = this.f3365k;
        if (iBinder == null) {
            ky1 ky1Var = iz1Var.f3760a.f2247o;
            f02.m1560m(ky1Var);
            ky1Var.f4603r.m5312a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = lu1.f4910b;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            mu1 ku1Var = iInterfaceQueryLocalInterface instanceof mu1 ? (mu1) iInterfaceQueryLocalInterface : new ku1(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            f02 f02Var = iz1Var.f3760a;
            ky1 ky1Var2 = f02Var.f2247o;
            f02.m1560m(ky1Var2);
            ky1Var2.f4608w.m5312a("Install Referrer Service connected");
            a02 a02Var = f02Var.f2248p;
            f02.m1560m(a02Var);
            a02Var.m6J(new f31(this, ku1Var, this));
        } catch (RuntimeException e) {
            ky1 ky1Var3 = iz1Var.f3760a.f2247o;
            f02.m1560m(ky1Var3);
            ky1Var3.f4603r.m5313b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        ky1 ky1Var = this.f3365k.f3760a.f2247o;
        f02.m1560m(ky1Var);
        ky1Var.f4608w.m5312a("Install Referrer Service disconnected");
    }
}
