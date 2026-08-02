package com.google.android.gms.common.internal;

/* loaded from: classes4.dex */
final class zzo implements android.content.ServiceConnection, com.google.android.gms.common.internal.zzr {
    final /* synthetic */ com.google.android.gms.common.internal.zzq zza;
    private final java.util.Map zzb;
    private int zzc;
    private boolean zzd;
    private android.os.IBinder zze;
    private final com.google.android.gms.common.internal.zzn zzf;
    private android.content.ComponentName zzg;

    public zzo(com.google.android.gms.common.internal.zzq zzqVar, com.google.android.gms.common.internal.zzn zznVar) {
        java.util.Objects.requireNonNull(zzqVar);
        this.zza = zzqVar;
        this.zzf = zznVar;
        this.zzb = new java.util.HashMap();
        this.zzc = 2;
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(android.content.ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        com.google.android.gms.common.internal.zzq zzqVar = this.zza;
        synchronized (zzqVar.zzf()) {
            zzqVar.zzh().removeMessages(1, this.zzf);
            this.zze = iBinder;
            this.zzg = componentName;
            java.util.Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
            }
            this.zzc = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.common.internal.zzq zzqVar = this.zza;
        synchronized (zzqVar.zzf()) {
            zzqVar.zzh().removeMessages(1, this.zzf);
            this.zze = null;
            this.zzg = componentName;
            java.util.Iterator it = this.zzb.values().iterator();
            while (it.hasNext()) {
                ((android.content.ServiceConnection) it.next()).onServiceDisconnected(componentName);
            }
            this.zzc = 2;
        }
    }

    public final void zza(java.lang.String str) {
        com.google.android.gms.common.internal.zzn zznVar = this.zzf;
        com.google.android.gms.common.internal.zzq zzqVar = this.zza;
        zzqVar.zzh().removeMessages(1, zznVar);
        zzqVar.zzi().unbindService(zzqVar.zzg(), this);
        this.zzd = false;
        this.zzc = 2;
    }

    public final void zzb(android.content.ServiceConnection serviceConnection, android.content.ServiceConnection serviceConnection2, java.lang.String str) {
        this.zzb.put(serviceConnection, serviceConnection2);
    }

    public final void zzc(android.content.ServiceConnection serviceConnection, java.lang.String str) {
        this.zzb.remove(serviceConnection);
    }

    public final boolean zzf(android.content.ServiceConnection serviceConnection) {
        return this.zzb.containsKey(serviceConnection);
    }

    public final boolean zzg() {
        return this.zzb.isEmpty();
    }

    final /* synthetic */ com.google.android.gms.common.ConnectionResult zzj(java.lang.String str, java.util.concurrent.Executor executor) {
        try {
            android.content.Intent zza = com.google.android.gms.common.internal.zzah.zza(this.zza.zzg(), this.zzf);
            this.zzc = 3;
            android.os.StrictMode.VmPolicy zza2 = com.google.android.gms.common.util.zzd.zza();
            try {
                com.google.android.gms.common.internal.zzq zzqVar = this.zza;
                com.google.android.gms.common.stats.ConnectionTracker zzi = zzqVar.zzi();
                android.content.Context zzg = zzqVar.zzg();
                com.google.android.gms.common.internal.zzn zznVar = this.zzf;
                boolean zza3 = zzi.zza(zzg, str, zza, this, 4225, executor);
                this.zzd = zza3;
                if (zza3) {
                    zzqVar.zzh().sendMessageDelayed(zzqVar.zzh().obtainMessage(1, zznVar), zzqVar.zzj());
                    return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
                }
                this.zzc = 2;
                try {
                    zzqVar.zzi().unbindService(zzqVar.zzg(), this);
                } catch (java.lang.IllegalArgumentException unused) {
                }
                return new com.google.android.gms.common.ConnectionResult(16);
            } finally {
                android.os.StrictMode.setVmPolicy(zza2);
            }
        } catch (com.google.android.gms.common.internal.zzaf e) {
            return e.zza;
        }
    }

    final /* synthetic */ com.google.android.gms.common.ConnectionResult zzk(java.lang.String str, android.os.UserHandle userHandle) {
        try {
            android.content.Intent zza = com.google.android.gms.common.internal.zzah.zza(this.zza.zzg(), this.zzf);
            this.zzc = 3;
            android.os.StrictMode.VmPolicy zza2 = com.google.android.gms.common.util.zzd.zza();
            try {
                com.google.android.gms.common.internal.zzq zzqVar = this.zza;
                com.google.android.gms.common.stats.ConnectionTracker zzi = zzqVar.zzi();
                android.content.Context zzg = zzqVar.zzg();
                com.google.android.gms.common.internal.zzn zznVar = this.zzf;
                boolean zzb = zzi.zzb(zzg, str, zza, this, 4225, userHandle);
                this.zzd = zzb;
                if (!zzb) {
                    this.zzc = 2;
                    return new com.google.android.gms.common.ConnectionResult(16);
                }
                zzqVar.zzh().sendMessageDelayed(zzqVar.zzh().obtainMessage(1, zznVar), zzqVar.zzj());
                return com.google.android.gms.common.ConnectionResult.RESULT_SUCCESS;
            } finally {
                android.os.StrictMode.setVmPolicy(zza2);
            }
        } catch (com.google.android.gms.common.internal.zzaf e) {
            return e.zza;
        }
    }

    public final android.content.ComponentName zzi() {
        return this.zzg;
    }

    public final android.os.IBinder zzh() {
        return this.zze;
    }

    public final int zze() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzd;
    }
}
