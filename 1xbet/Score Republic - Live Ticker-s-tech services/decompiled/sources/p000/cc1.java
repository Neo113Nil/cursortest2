package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class cc1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1216a = 0;

    /* JADX INFO: renamed from: b */
    public Context f1217b;

    /* JADX INFO: renamed from: c */
    public Object f1218c;

    public cc1(a81 a81Var) {
        this.f1218c = a81Var;
    }

    /* JADX INFO: renamed from: a */
    public void m917a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        dc1 dc1Var = (dc1) this.f1218c;
        if (dc1Var != null) {
            Context context = ((FirebaseMessaging) dc1Var.f1626m).f1387b;
            this.f1217b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.f1216a) {
            case 0:
                dc1 dc1Var = (dc1) this.f1218c;
                if (dc1Var != null && dc1Var.m1156a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    dc1 dc1Var2 = (dc1) this.f1218c;
                    ((FirebaseMessaging) dc1Var2.f1626m).getClass();
                    FirebaseMessaging.m1006b(dc1Var2, 0L);
                    Context context2 = this.f1217b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.f1218c = null;
                    return;
                }
                return;
            default:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    ((cm1) ((a81) this.f1218c).f64l).getClass();
                    throw null;
                }
                return;
        }
    }

    public /* synthetic */ cc1() {
    }
}
