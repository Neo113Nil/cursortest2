package l3;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.D;
import com.google.android.gms.common.internal.L;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import n3.c;

/* renamed from: l3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1389a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f14924b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile C1389a f14925c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f14926a = new ConcurrentHashMap();

    public static C1389a a() {
        if (f14925c == null) {
            synchronized (f14924b) {
                try {
                    if (f14925c == null) {
                        f14925c = new C1389a();
                    }
                } finally {
                }
            }
        }
        C1389a c1389a = f14925c;
        D.i(c1389a);
        return c1389a;
    }

    public final void b(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof L)) {
            ConcurrentHashMap concurrentHashMap = this.f14926a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean c(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i7, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).q(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (serviceConnection instanceof L) {
            if (executor == null) {
                executor = null;
            }
            if (Build.VERSION.SDK_INT < 29 || executor == null) {
                return context.bindService(intent, serviceConnection, i7);
            }
            bindService = context.bindService(intent, i7, executor, serviceConnection);
            return bindService;
        }
        ConcurrentHashMap concurrentHashMap = this.f14926a;
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean bindService2 = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i7) : context.bindService(intent, i7, executor, serviceConnection);
            if (bindService2) {
                return bindService2;
            }
            return false;
        } finally {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
        }
    }
}
