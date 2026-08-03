package s0;

/* renamed from: s0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990a {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Object f8350b = new java.lang.Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile s0.C0990a f8351c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f8352a = new java.util.concurrent.ConcurrentHashMap();

    public static s0.C0990a a() {
        if (f8351c == null) {
            synchronized (f8350b) {
                try {
                    if (f8351c == null) {
                        f8351c = new s0.C0990a();
                    }
                } finally {
                }
            }
        }
        s0.C0990a c0990a = f8351c;
        p0.AbstractC0966r.c(c0990a);
        return c0990a;
    }

    public final void b(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof p0.ServiceConnectionC0974z)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f8352a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((android.content.ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused2) {
        }
    }

    public final boolean c(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i2, java.util.concurrent.Executor executor) {
        boolean bindService;
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.lang.String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((u0.C0996b.a(context).f556a.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof p0.ServiceConnectionC0974z) {
            if (executor == null) {
                executor = null;
            }
            if (android.os.Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i2);
            }
            bindService = context.bindService(intent, i2, executor, serviceConnection);
            return bindService;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f8352a;
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            android.util.Log.w("ConnectionTracker", java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (android.os.Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i2) : context.bindService(intent, i2, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
