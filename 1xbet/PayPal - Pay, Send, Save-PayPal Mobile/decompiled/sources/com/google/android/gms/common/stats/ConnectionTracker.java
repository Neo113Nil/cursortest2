package com.google.android.gms.common.stats;

/* loaded from: classes4.dex */
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

    private final boolean zzc(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, boolean z, @javax.annotation.Nullable java.util.concurrent.Executor executor) {
        if (zzg(context, intent)) {
            return false;
        }
        if (!zzd(serviceConnection)) {
            return zzf(context, intent, serviceConnection, i, executor);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            new java.lang.Object[]{serviceConnection, str, intent.getAction()};
        }
        try {
            boolean zzf = zzf(context, intent, serviceConnection, i, executor);
            if (zzf) {
                return zzf;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static void zze(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.util.NoSuchElementException unused) {
        }
    }

    private static final boolean zzf(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, @javax.annotation.Nullable java.util.concurrent.Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!com.google.android.gms.common.util.PlatformVersion.isAtLeastQ() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    private static final boolean zzg(android.content.Context context, android.content.Intent intent) {
        android.content.ComponentName component = intent.getComponent();
        if (component == null) {
            return false;
        }
        return (com.google.android.gms.common.wrappers.Wrappers.packageManager(context).getApplicationInfo(component.getPackageName(), 0).flags & 2097152) != 0;
    }

    public boolean bindService(android.content.Context context, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i) {
        return zzc(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public void unbindService(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        if (zzd(serviceConnection)) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.zza;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    zze(context, (android.content.ServiceConnection) concurrentHashMap.get(serviceConnection));
                    return;
                } finally {
                    this.zza.remove(serviceConnection);
                }
            }
        }
        zze(context, serviceConnection);
    }

    public void unbindServiceSafe(android.content.Context context, android.content.ServiceConnection serviceConnection) {
        try {
            unbindService(context, serviceConnection);
        } catch (java.lang.IllegalArgumentException unused) {
        }
    }

    public final boolean zza(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, @javax.annotation.Nullable java.util.concurrent.Executor executor) {
        return zzc(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean zzb(android.content.Context context, java.lang.String str, android.content.Intent intent, android.content.ServiceConnection serviceConnection, int i, android.os.UserHandle userHandle) {
        if (zzg(context, intent)) {
            return false;
        }
        if (!zzd(serviceConnection)) {
            return context.bindServiceAsUser(intent, serviceConnection, 4225, userHandle);
        }
        android.content.ServiceConnection serviceConnection2 = (android.content.ServiceConnection) this.zza.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            new java.lang.Object[]{serviceConnection, str, intent.getAction()};
        }
        try {
            boolean bindServiceAsUser = context.bindServiceAsUser(intent, serviceConnection, 4225, userHandle);
            if (bindServiceAsUser) {
                return bindServiceAsUser;
            }
            return false;
        } finally {
            this.zza.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean zzd(android.content.ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof com.google.android.gms.common.internal.zzr);
    }
}
