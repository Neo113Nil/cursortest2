package p000;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pk1 implements ServiceConnection {

    /* JADX INFO: renamed from: j */
    public final Context f6186j;

    /* JADX INFO: renamed from: k */
    public final Intent f6187k;

    /* JADX INFO: renamed from: l */
    public final ScheduledThreadPoolExecutor f6188l;

    /* JADX INFO: renamed from: m */
    public final ArrayDeque f6189m;

    /* JADX INFO: renamed from: n */
    public nk1 f6190n;

    /* JADX INFO: renamed from: o */
    public boolean f6191o;

    public pk1(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new hr0("Firebase-FirebaseInstanceIdServiceConnection"));
        scheduledThreadPoolExecutor.setKeepAliveTime(40L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f6189m = new ArrayDeque();
        this.f6191o = false;
        Context applicationContext = context.getApplicationContext();
        this.f6186j = applicationContext;
        this.f6187k = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f6188l = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m3951a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f6189m.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                nk1 nk1Var = this.f6190n;
                if (nk1Var == null || !nk1Var.isBinderAlive()) {
                    m3953c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f6190n.m3548a((ok1) this.f6189m.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized v92 m3952b(Intent intent) {
        ok1 ok1Var;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            ok1Var = new ok1(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f6188l;
            ok1Var.f5780b.f6465a.m5125a(scheduledThreadPoolExecutor, new C0468mf(14, scheduledThreadPoolExecutor.schedule(new RunnableC0944za(11, ok1Var), 20L, TimeUnit.SECONDS)));
            this.f6189m.add(ok1Var);
            m3951a();
        } catch (Throwable th) {
            throw th;
        }
        return ok1Var.f5780b.f6465a;
    }

    /* JADX INFO: renamed from: c */
    public final void m3953c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f6191o);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f6191o) {
            return;
        }
        this.f6191o = true;
        try {
            if (b90.m606u().m623s(this.f6186j, this.f6187k, this, 65)) {
                return;
            } else {
                Log.e("FirebaseMessaging", "binding to the service failed");
            }
            while (true) {
                ArrayDeque arrayDeque = this.f6189m;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((ok1) arrayDeque.poll()).f5780b.m4063d(null);
                }
            }
        } catch (SecurityException e) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e);
        }
        this.f6191o = false;
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f6191o = false;
            if (iBinder instanceof nk1) {
                this.f6190n = (nk1) iBinder;
                m3951a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            ArrayDeque arrayDeque = this.f6189m;
            while (!arrayDeque.isEmpty()) {
                ((ok1) arrayDeque.poll()).f5780b.m4063d(null);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "onServiceDisconnected: " + componentName);
        }
        m3951a();
    }
}
