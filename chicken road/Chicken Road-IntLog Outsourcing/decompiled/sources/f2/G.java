package f2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import r1.C1403a;

/* loaded from: classes.dex */
public final class G implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5572a;

    /* renamed from: b, reason: collision with root package name */
    public final Intent f5573b;

    /* renamed from: c, reason: collision with root package name */
    public final ScheduledThreadPoolExecutor f5574c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayDeque f5575d;

    /* renamed from: e, reason: collision with root package name */
    public E f5576e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f5577f;

    public G(Context context) {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(0, new G0.y("Firebase-FirebaseInstanceIdServiceConnection"));
        this.f5575d = new ArrayDeque();
        this.f5577f = false;
        Context applicationContext = context.getApplicationContext();
        this.f5572a = applicationContext;
        this.f5573b = new Intent("com.google.firebase.MESSAGING_EVENT").setPackage(applicationContext.getPackageName());
        this.f5574c = scheduledThreadPoolExecutor;
    }

    public final synchronized void a() {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "flush queue called");
            }
            while (!this.f5575d.isEmpty()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "found intent to be delivered");
                }
                E e3 = this.f5576e;
                if (e3 == null || !e3.isBinderAlive()) {
                    c();
                    return;
                }
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "binder is alive, sending the intent.");
                }
                this.f5576e.a((F) this.f5575d.poll());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized I1.o b(Intent intent) {
        F f3;
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "new intent queued in the bind-strategy delivery");
            }
            f3 = new F(intent);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = this.f5574c;
            f3.f5571b.f1248a.f(scheduledThreadPoolExecutor, new D3.g(21, scheduledThreadPoolExecutor.schedule(new B2.b(12, f3), 20L, TimeUnit.SECONDS)));
            this.f5575d.add(f3);
            a();
        } catch (Throwable th) {
            throw th;
        }
        return f3.f5571b.f1248a;
    }

    public final void c() {
        C1403a a6;
        Context context;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            StringBuilder sb = new StringBuilder("binder is dead. start connection? ");
            sb.append(!this.f5577f);
            Log.d("FirebaseMessaging", sb.toString());
        }
        if (this.f5577f) {
            return;
        }
        this.f5577f = true;
        try {
            a6 = C1403a.a();
            context = this.f5572a;
        } catch (SecurityException e3) {
            Log.e("FirebaseMessaging", "Exception while binding the service", e3);
        }
        if (a6.c(context, context.getClass().getName(), this.f5573b, this, 65, null)) {
            return;
        }
        Log.e("FirebaseMessaging", "binding to the service failed");
        this.f5577f = false;
        while (true) {
            ArrayDeque arrayDeque = this.f5575d;
            if (arrayDeque.isEmpty()) {
                return;
            } else {
                ((F) arrayDeque.poll()).f5571b.d(null);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "onServiceConnected: " + componentName);
            }
            this.f5577f = false;
            if (iBinder instanceof E) {
                this.f5576e = (E) iBinder;
                a();
                return;
            }
            Log.e("FirebaseMessaging", "Invalid service connection: " + iBinder);
            while (true) {
                ArrayDeque arrayDeque = this.f5575d;
                if (arrayDeque.isEmpty()) {
                    return;
                } else {
                    ((F) arrayDeque.poll()).f5571b.d(null);
                }
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
        a();
    }
}
