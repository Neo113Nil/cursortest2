package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.work.impl.C;
import androidx.work.impl.background.systemalarm.ConstraintProxy;
import androidx.work.o;
import h5.l;

/* loaded from: classes8.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    static final String f45364a = o.i("ConstrntProxyUpdtRecvr");

    final class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f45365a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f45366b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ BroadcastReceiver.PendingResult f45367c;

        a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f45365a = intent;
            this.f45366b = context;
            this.f45367c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f45367c;
            Context context = this.f45366b;
            Intent intent = this.f45365a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                o.e().a(ConstraintProxyUpdateReceiver.f45364a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                l.a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                l.a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                l.a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                l.a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(@NonNull Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C.i(context).p().a(new a(intent, context, goAsync()));
        } else {
            o.e().a(f45364a, Nk.a.b("Ignoring unknown action ", action));
        }
    }
}
