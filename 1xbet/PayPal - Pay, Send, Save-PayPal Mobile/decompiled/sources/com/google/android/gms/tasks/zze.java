package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zze implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzf zzb;

    zze(com.google.android.gms.tasks.zzf zzfVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        java.util.Objects.requireNonNull(zzfVar);
        this.zzb = zzfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.tasks.Task task = (com.google.android.gms.tasks.Task) this.zzb.zzc().then(this.zza);
            if (task == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            com.google.android.gms.tasks.zzf zzfVar = this.zzb;
            java.util.concurrent.Executor executor = com.google.android.gms.tasks.TaskExecutors.zza;
            task.addOnSuccessListener(executor, zzfVar);
            task.addOnFailureListener(executor, zzfVar);
            task.addOnCanceledListener(executor, zzfVar);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (!(e.getCause() instanceof java.lang.Exception)) {
                this.zzb.zzd().zzc(e);
                return;
            }
            com.google.android.gms.tasks.zzf zzfVar2 = this.zzb;
            zzfVar2.zzd().zzc((java.lang.Exception) e.getCause());
        } catch (java.lang.Exception e2) {
            this.zzb.zzd().zzc(e2);
        }
    }
}
