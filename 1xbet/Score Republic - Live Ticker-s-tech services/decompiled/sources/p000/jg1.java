package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jg1 implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ng1 f3923j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C0648ra f3924k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3925l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ Runnable f3926m;

    public /* synthetic */ jg1(ng1 ng1Var, C0648ra c0648ra, int i, Runnable runnable) {
        this.f3923j = ng1Var;
        this.f3924k = c0648ra;
        this.f3925l = i;
        this.f3926m = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        final C0648ra c0648ra = this.f3924k;
        final int i = this.f3925l;
        Runnable runnable = this.f3926m;
        final ng1 ng1Var = this.f3923j;
        g41 g41Var = ng1Var.f5435f;
        try {
            g41 g41Var2 = ng1Var.f5432c;
            Objects.requireNonNull(g41Var2);
            g41Var.m1984m(new kg1(g41Var2, 1));
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) ng1Var.f5430a.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                g41Var.m1984m(new ic1() { // from class: lg1
                    @Override // p000.ic1
                    /* JADX INFO: renamed from: c */
                    public final Object mo1085c() {
                        ng1Var.f5433d.m4086x(c0648ra, i + 1, false);
                        return null;
                    }
                });
            } else {
                ng1Var.m3538a(c0648ra, i);
            }
        } catch (hc1 unused) {
            ng1Var.f5433d.m4086x(c0648ra, i + 1, false);
        } finally {
            runnable.run();
        }
    }
}
