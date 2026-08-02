package com.google.android.gms.cloudmessaging;

/* loaded from: classes3.dex */
public final class zzv {
    private static com.google.android.gms.cloudmessaging.zzv zza;
    private final android.content.Context zzb;
    private final java.util.concurrent.ScheduledExecutorService zzc;
    private com.google.android.gms.cloudmessaging.zzp zzd = new com.google.android.gms.cloudmessaging.zzp(this, null);
    private int zze = 1;

    zzv(android.content.Context context, java.util.concurrent.ScheduledExecutorService scheduledExecutorService) {
        this.zzc = scheduledExecutorService;
        this.zzb = context.getApplicationContext();
    }

    public static com.google.android.gms.cloudmessaging.zzv zzb(android.content.Context context) {
        com.google.android.gms.cloudmessaging.zzv zzvVar;
        synchronized (com.google.android.gms.cloudmessaging.zzv.class) {
            if (zza == null) {
                com.google.android.gms.internal.cloudmessaging.zze.zza();
                zza = new com.google.android.gms.cloudmessaging.zzv(context, java.util.concurrent.Executors.unconfigurableScheduledExecutorService(java.util.concurrent.Executors.newScheduledThreadPool(1, new com.google.android.gms.common.util.concurrent.NamedThreadFactory("MessengerIpcClient"))));
            }
            zzvVar = zza;
        }
        return zzvVar;
    }

    private final com.google.android.gms.tasks.Task zzg(com.google.android.gms.cloudmessaging.zzs zzsVar) {
        com.google.android.gms.tasks.Task task;
        synchronized (this) {
            if (android.util.Log.isLoggable("MessengerIpcClient", 3)) {
                android.util.Log.d("MessengerIpcClient", "Queueing ".concat(zzsVar.toString()));
            }
            if (!this.zzd.zzg(zzsVar)) {
                com.google.android.gms.cloudmessaging.zzp zzpVar = new com.google.android.gms.cloudmessaging.zzp(this, null);
                this.zzd = zzpVar;
                zzpVar.zzg(zzsVar);
            }
            task = zzsVar.zzb.getTask();
        }
        return task;
    }

    public final com.google.android.gms.tasks.Task zzc(int i, android.os.Bundle bundle) {
        return zzg(new com.google.android.gms.cloudmessaging.zzr(zzf(), i, bundle));
    }

    public final com.google.android.gms.tasks.Task zzd(int i, android.os.Bundle bundle) {
        return zzg(new com.google.android.gms.cloudmessaging.zzu(zzf(), i, bundle));
    }

    private final int zzf() {
        int i;
        synchronized (this) {
            i = this.zze;
            this.zze = i + 1;
        }
        return i;
    }
}
