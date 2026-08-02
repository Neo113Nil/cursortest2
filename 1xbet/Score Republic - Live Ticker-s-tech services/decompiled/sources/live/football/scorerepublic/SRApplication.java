package live.football.scorerepublic;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import p000.mw1;
import p000.yv1;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class SRApplication extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        String string = getString(R.string.tenant_name);
        string.getClass();
        mw1 mw1Var = FirebaseAnalytics.getInstance(this).f1354a;
        mw1Var.getClass();
        mw1Var.m3434b(new yv1(mw1Var, (String) null, "sr_tenant", (Object) string, false));
    }
}
