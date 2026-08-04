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

/* JADX INFO: loaded from: classes.dex */
public final class L implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f11268a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f11269b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11270c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public IBinder f11271d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final K f11272e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ComponentName f11273f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N f11274g;

    public L(N n2, K k7) {
        this.f11274g = n2;
        this.f11272e = k7;
    }

    public final void a(String str, Executor executor) {
        this.f11269b = 3;
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (Build.VERSION.SDK_INT >= 31) {
            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch().build());
        }
        try {
            N n2 = this.f11274g;
            p082l3.a aVar = n2.f11288g;
            Context context = n2.f11286e;
            boolean zC = aVar.c(context, str, this.f11272e.a(context), this, 4225, executor);
            this.f11270c = zC;
            if (zC) {
                this.f11274g.f11287f.sendMessageDelayed(this.f11274g.f11287f.obtainMessage(1, this.f11272e), this.f11274g.f11290i);
            } else {
                this.f11269b = 2;
                try {
                    N n7 = this.f11274g;
                    n7.f11288g.b(n7.f11286e, this);
                } catch (IllegalArgumentException unused) {
                }
            }
        } finally {
            StrictMode.setVmPolicy(vmPolicy);
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
