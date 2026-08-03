package com.google.android.gms.common.stats;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* loaded from: classes3.dex */
public class ConnectionTracker {
    private static final java.lang.Object zzb = new java.lang.Object();

    @javax.annotation.Nullable
    private static volatile com.google.android.gms.common.stats.ConnectionTracker zzc;
    public final java.util.concurrent.ConcurrentHashMap zza = new java.util.concurrent.ConcurrentHashMap();

    private ConnectionTracker() {
    }

    public static com.google.android.gms.common.stats.ConnectionTracker getInstance() {
        if (zzc == null) {
            synchronized (zzb) {
                if (zzc == null) {
                    zzc = new com.google.android.gms.common.stats.ConnectionTracker();
                }
            }
        }
        com.google.android.gms.common.stats.ConnectionTracker connectionTracker = zzc;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(connectionTracker);
        return connectionTracker;
    }

    private final boolean zzb(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, boolean z, @javax.annotation.Nullable java.util.concurrent.Executor executor) {
        android.content.ComponentName component = intent.getComponent();
        if (component != null) {
            java.lang.String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    android.util.Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            }
        }
        if (!zzc(serviceConnection)) {
            return zze(context, intent, serviceConnection, i, executor);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            android.util.Log.w("ConnectionTracker", java.lang.String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        try {
            boolean zze = zze(context, intent, serviceConnection, i, executor);
            if (zze) {
                return zze;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean zzc(android.content.ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof com.google.android.gms.common.internal.zzr);
    }

    private static void zzd(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    public boolean bindService(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        return zzb(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public void unbindService(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (zzc(serviceConnection)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zza;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    zzd(context, (android.content.ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.zza.remove(serviceConnection);
                }
            }
        }
        zzd(context, serviceConnection);
    }

    public void unbindServiceSafe(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    public final boolean zza(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, @javax.annotation.Nullable java.util.concurrent.Executor executor) {
        return zzb(context, str, intent, serviceConnection, 4225, true, executor);
    }

    private static final boolean zze(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, @javax.annotation.Nullable java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!com.google.android.gms.common.util.PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }
}
