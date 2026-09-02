package p0;

/* renamed from: p0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ServiceConnectionC0974z implements android.content.ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f8304a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public int f8305b = 2;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8306c;

    /* renamed from: d, reason: collision with root package name */
    public android.os.IBinder f8307d;

    /* renamed from: e, reason: collision with root package name */
    public final p0.C0973y f8308e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.ComponentName f8309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p0.C0947B f8310g;

    public ServiceConnectionC0974z(p0.C0947B c0947b, p0.C0973y c0973y) {
        this.f8310g = c0947b;
        this.f8308e = c0973y;
    }

    public final void a(java.lang.String str, java.util.concurrent.Executor executor) {
        android.os.StrictMode.VmPolicy.Builder permitUnsafeIntentLaunch;
        this.f8305b = 3;
        android.os.StrictMode.VmPolicy vmPolicy = android.os.StrictMode.getVmPolicy();
        if (android.os.Build.VERSION.SDK_INT >= 31) {
            permitUnsafeIntentLaunch = new android.os.StrictMode.VmPolicy.Builder(vmPolicy).permitUnsafeIntentLaunch();
            android.os.StrictMode.setVmPolicy(permitUnsafeIntentLaunch.build());
        }
        try {
            p0.C0947B c0947b = this.f8310g;
            s0.C0990a c0990a = c0947b.f8217d;
            android.content.Context context = c0947b.f8215b;
            boolean c2 = c0990a.c(context, str, this.f8308e.a(context), this, 4225, executor);
            this.f8306c = c2;
            if (c2) {
                this.f8310g.f8216c.sendMessageDelayed(this.f8310g.f8216c.obtainMessage(1, this.f8308e), this.f8310g.f8219f);
            } else {
                this.f8305b = 2;
                try {
                    p0.C0947B c0947b2 = this.f8310g;
                    c0947b2.f8217d.b(c0947b2.f8215b, this);
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
            android.os.StrictMode.setVmPolicy(vmPolicy);
        } catch (java.lang.Throwable th) {
            android.os.StrictMode.setVmPolicy(vmPolicy);
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        synchronized (this.f8310g.f8214a) {
            try {
                this.f8310g.f8216c.removeMessages(1, this.f8308e);
                this.f8307d = iBinder;
                this.f8309f = componentName;
                java.util.Iterator it = this.f8304a.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.f8305b = 1;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        synchronized (this.f8310g.f8214a) {
            try {
                this.f8310g.f8216c.removeMessages(1, this.f8308e);
                this.f8307d = null;
                this.f8309f = componentName;
                java.util.Iterator it = this.f8304a.values().iterator();
                while (it.hasNext()) {
                    ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.f8305b = 2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }
}
