package Q;

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
public final class B implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f379a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f380b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f381c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f382d;

    /* renamed from: e, reason: collision with root package name */
    public final z f383e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ D f385g;

    public B(D d2, z zVar) {
        this.f385g = d2;
        this.f383e = zVar;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f380b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            D d2 = this.f385g;
            T.b bVar = d2.f393d;
            Context context = d2.f391b;
            boolean c2 = bVar.c(context, str, this.f383e.a(context), this, 4225, executor);
            this.f381c = c2;
            if (c2) {
                this.f385g.f392c.sendMessageDelayed(this.f385g.f392c.obtainMessage(1, this.f383e), this.f385g.f395f);
            } else {
                this.f380b = 2;
                try {
                    D d3 = this.f385g;
                    d3.f393d.b(d3.f391b, this);
                } catch (IllegalArgumentException unused) {
                }
            }
            StrictMode.setVmPolicy(vmPolicy);
        } catch (Throwable th) {
            StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this.f385g.f390a) {
            try {
                this.f385g.f392c.removeMessages(1, this.f383e);
                this.f382d = iBinder;
                this.f384f = componentName;
                Iterator it = this.f379a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f380b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f385g.f390a) {
            try {
                this.f385g.f392c.removeMessages(1, this.f383e);
                this.f382d = null;
                this.f384f = componentName;
                Iterator it = this.f379a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f380b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
