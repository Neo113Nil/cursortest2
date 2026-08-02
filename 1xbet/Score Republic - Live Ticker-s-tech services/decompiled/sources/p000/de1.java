package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class de1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public ee1 f1632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ee1 f1633b;

    public de1(ee1 ee1Var, ee1 ee1Var2) {
        this.f1633b = ee1Var;
        this.f1632a = ee1Var2;
    }

    /* JADX INFO: renamed from: a */
    public final void m1172a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        ((Context) this.f1633b.f2080l).registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            ee1 ee1Var = this.f1632a;
            if (ee1Var == null) {
                return;
            }
            if (ee1Var.m1409d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                ee1 ee1Var2 = this.f1632a;
                ((ce1) ee1Var2.f2083o).f1237f.schedule(ee1Var2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f1632a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
