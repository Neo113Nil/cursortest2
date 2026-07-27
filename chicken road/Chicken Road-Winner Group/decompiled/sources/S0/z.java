package S0;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f1377a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f1378b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1379c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f1380d;

    /* renamed from: e, reason: collision with root package name */
    public final y f1381e;
    public ComponentName f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ B f1382g;

    public z(B b3, y yVar) {
        this.f1382g = b3;
        this.f1381e = yVar;
    }

    public final void a(String str, Executor executor) {
        V0.a aVar;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f1378b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            B b3 = this.f1382g;
            aVar = b3.f1295d;
            context = b3.f1293b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c3 = aVar.c(context, str, this.f1381e.a(context), this, 4225, executor);
            this.f1379c = c3;
            if (c3) {
                this.f1382g.f1294c.sendMessageDelayed(this.f1382g.f1294c.obtainMessage(1, this.f1381e), this.f1382g.f);
            } else {
                this.f1378b = 2;
                try {
                    B b4 = this.f1382g;
                    b4.f1295d.b(b4.f1293b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th2) {
            th = th2;
            Throwable th3 = th;
            StrictMode.setVmPolicy(vmPolicy);
            throw th3;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f1382g.f1292a) {
            try {
                this.f1382g.f1294c.removeMessages(1, this.f1381e);
                this.f1380d = iBinder;
                this.f = componentName;
                Iterator it = this.f1377a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f1378b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f1382g.f1292a) {
            try {
                this.f1382g.f1294c.removeMessages(1, this.f1381e);
                this.f1380d = null;
                this.f = componentName;
                Iterator it = this.f1377a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f1378b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
