package io.appmetrica.analytics.impl;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import io.appmetrica.analytics.internal.AppMetricaService;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class Hk implements ServiceWakeLock {

    /* renamed from: a, reason: collision with root package name */
    public final Context f6887a;

    /* renamed from: b, reason: collision with root package name */
    public final Gk f6888b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f6889c = new HashMap();

    public Hk(Context context, Gk gk) {
        this.f6887a = context;
        this.f6888b = gk;
    }

    public final String a(String str) {
        return B0.o.i("io.appmetrica.analytics.ACTION_SERVICE_WAKELOCK.", str);
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized boolean acquireWakeLock(String str) {
        try {
            if (this.f6889c.get(str) == null) {
                HashMap hashMap = this.f6889c;
                Gk gk = this.f6888b;
                Context context = this.f6887a;
                String a6 = a(str);
                gk.f6846a.getClass();
                Intent intent = new Intent(context, (Class<?>) AppMetricaService.class);
                intent.setAction(a6);
                Fk fk = new Fk();
                try {
                    context.bindService(intent, fk, 1);
                } catch (Throwable unused) {
                    fk = null;
                }
                hashMap.put(str, fk);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f6889c.get(str) != null;
    }

    @Override // io.appmetrica.analytics.modulesapi.internal.service.ServiceWakeLock
    public final synchronized void releaseWakeLock(String str) {
        ServiceConnection serviceConnection = (ServiceConnection) this.f6889c.get(str);
        if (serviceConnection != null) {
            Gk gk = this.f6888b;
            a(str);
            Context context = this.f6887a;
            gk.getClass();
            try {
                context.unbindService(serviceConnection);
            } catch (Throwable unused) {
            }
        }
    }
}
