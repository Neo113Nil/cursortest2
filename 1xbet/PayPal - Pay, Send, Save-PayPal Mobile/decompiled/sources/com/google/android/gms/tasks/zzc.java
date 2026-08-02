package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzc implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzd zzb;

    zzc(com.google.android.gms.tasks.zzd zzdVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        java.util.Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.tasks.Task task = this.zza;
        if (task.isCanceled()) {
            this.zzb.zzd().zze();
            return;
        }
        try {
            this.zzb.zzd().zza(this.zzb.zzc().then(task));
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (!(e.getCause() instanceof java.lang.Exception)) {
                this.zzb.zzd().zzc(e);
                return;
            }
            com.google.android.gms.tasks.zzd zzdVar = this.zzb;
            zzdVar.zzd().zzc((java.lang.Exception) e.getCause());
        } catch (java.lang.Exception e2) {
            this.zzb.zzd().zzc(e2);
        }
    }
}
