package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import l3.C1389a;

/* loaded from: classes.dex */
public final class L implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap f11268a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f11269b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f11270c;

    /* renamed from: d, reason: collision with root package name */
    public IBinder f11271d;

    /* renamed from: e, reason: collision with root package name */
    public final K f11272e;

    /* renamed from: f, reason: collision with root package name */
    public ComponentName f11273f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f11274g;

    public L(N n2, K k7) {
        this.f11274g = n2;
        this.f11272e = k7;
    }

    public final void a(String str, Executor executor) {
        StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f11269b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            N n2 = this.f11274g;
            C1389a c1389a = n2.f11288g;
            Context context = n2.f11286e;
            boolean c3 = c1389a.c(context, str, this.f11272e.a(context), this, 4225, executor);
            this.f11270c = c3;
            if (c3) {
                this.f11274g.f11287f.sendMessageDelayed(this.f11274g.f11287f.obtainMessage(1, this.f11272e), this.f11274g.f11290i);
            } else {
                this.f11269b = 2;
                try {
                    N n7 = this.f11274g;
                    n7.f11288g.b(n7.f11286e, this);
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
        synchronized (this.f11274g.f11285d) {
            try {
                this.f11274g.f11287f.removeMessages(1, this.f11272e);
                this.f11271d = iBinder;
                this.f11273f = componentName;
                Iterator it = this.f11268a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f11269b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.f11274g.f11285d) {
            try {
                this.f11274g.f11287f.removeMessages(1, this.f11272e);
                this.f11271d = null;
                this.f11273f = componentName;
                Iterator it = this.f11268a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f11269b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
