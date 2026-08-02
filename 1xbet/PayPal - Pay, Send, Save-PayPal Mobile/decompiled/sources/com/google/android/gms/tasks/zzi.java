package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzi implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzj zzb;

    zzi(com.google.android.gms.tasks.zzj zzjVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        java.util.Objects.requireNonNull(zzjVar);
        this.zzb = zzjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzj zzjVar = this.zzb;
        synchronized (zzjVar.zzc()) {
            if (zzjVar.zzd() != null) {
                zzjVar.zzd().onComplete(this.zza);
            }
        }
    }
}
