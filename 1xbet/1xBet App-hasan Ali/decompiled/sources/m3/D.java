package m3;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import p3.C2258a;

/* loaded from: classes.dex */
public final class D implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f18007a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f18008b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f18009c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f18010d;

    /* renamed from: e, reason: collision with root package name */
    public final C f18011e;
    public ComponentName f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ F f18012g;

    public D(F f, C c5) {
        this.f18012g = f;
        this.f18011e = c5;
    }

    public final void a(String str, Executor executor) {
        C2258a c2258a;
        Context context;
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f18008b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            F f = this.f18012g;
            c2258a = f.f18019d;
            context = f.f18017b;
        } catch (Throwable th) {
            th = th;
        }
        try {
            boolean c5 = c2258a.c(context, str, this.f18011e.a(context), this, 4225, executor);
            this.f18009c = c5;
            if (c5) {
                this.f18012g.f18018c.sendMessageDelayed(this.f18012g.f18018c.obtainMessage(1, this.f18011e), this.f18012g.f);
            } else {
                this.f18008b = 2;
                try {
                    F f5 = this.f18012g;
                    f5.f18019d.b(f5.f18017b, this);
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
        synchronized (this.f18012g.f18016a) {
            try {
                this.f18012g.f18018c.removeMessages(1, this.f18011e);
                this.f18010d = iBinder;
                this.f = componentName;
                Iterator it = this.f18007a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f18008b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f18012g.f18016a) {
            try {
                this.f18012g.f18018c.removeMessages(1, this.f18011e);
                this.f18010d = null;
                this.f = componentName;
                Iterator it = this.f18007a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f18008b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
