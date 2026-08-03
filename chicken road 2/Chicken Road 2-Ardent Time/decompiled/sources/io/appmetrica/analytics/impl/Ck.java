package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ck implements io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f4181a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Bk f4182b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f4183c = new java.util.HashMap();

    public Ck(android.content.Context context, io.appmetrica.analytics.impl.Bk bk) {
        this.f4181a = context;
        this.f4182b = bk;
    }

    public final java.lang.String a(java.lang.String str) {
        return B1.a.i("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(java.lang.String str) {
        try {
            if (this.f4183c.get(str) == null) {
                java.util.HashMap hashMap = this.f4183c;
                io.appmetrica.analytics.impl.Bk bk = this.f4182b;
                android.content.Context context = this.f4181a;
                java.lang.String a2 = a(str);
                bk.f4132a.getClass();
                android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) io.appmetrica.analytics.internal.AppMetricaService.class);
                intent.setAction(a2);
                io.appmetrica.analytics.impl.Ak ak = new io.appmetrica.analytics.impl.Ak();
                try {
                    context.bindService(intent, ak, 1);
                } catch (java.lang.Throwable unused) {
                    ak = null;
                }
                hashMap.put(str, ak);
            }
        } catch (java.lang.Throwable th) {
            throw th;
        }
        return this.f4183c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(java.lang.String str) {
        android.content.ServiceConnection serviceConnection = (android.content.ServiceConnection) this.f4183c.get(str);
        if (serviceConnection != null) {
            io.appmetrica.analytics.impl.Bk bk = this.f4182b;
            a(str);
            android.content.Context context = this.f4181a;
            bk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (java.lang.Throwable unused) {
            }
        }
    }
}
