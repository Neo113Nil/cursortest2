package io.appmetrica.analytics.identifiers.impl;

/* loaded from: classes.dex */
public final class e implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f3865a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.IBinder f3866b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object f3867c = new java.lang.Object();

    public e(android.content.Intent intent, java.lang.String str) {
        this.f3865a = intent;
    }

    public final void a(android.content.Context context) {
        synchronized (this.f3867c) {
            this.f3866b = null;
            this.f3867c.notifyAll();
        }
        context.unbindService(this);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        synchronized (this.f3867c) {
            this.f3866b = null;
            this.f3867c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(android.content.ComponentName componentName) {
        synchronized (this.f3867c) {
            this.f3867c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.f3867c) {
            this.f3866b = iBinder;
            this.f3867c.notifyAll();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f3867c) {
            this.f3866b = null;
            this.f3867c.notifyAll();
        }
    }
}
