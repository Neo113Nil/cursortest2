package f2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class B extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public C f5556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C f5557b;

    public B(C c2, C c6) {
        this.f5557b = c2;
        this.f5556a = c6;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f5557b.f5561a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            C c2 = this.f5556a;
            if (c2 == null) {
                return;
            }
            if (c2.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                C c6 = this.f5556a;
                c6.f5564d.f5553f.schedule(c6, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.f5556a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
