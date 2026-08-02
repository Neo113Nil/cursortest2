package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzn zzb;

    zzm(com.google.android.gms.tasks.zzn zznVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        java.util.Objects.requireNonNull(zznVar);
        this.zzb = zznVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.zzn zznVar = this.zzb;
        synchronized (zznVar.zzc()) {
            if (zznVar.zzd() != null) {
                zznVar.zzd().onSuccess(this.zza.getResult());
            }
        }
    }
}
