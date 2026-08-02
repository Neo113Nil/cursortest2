package com.google.android.gms.tasks;

/* loaded from: classes4.dex */
final class zzo implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.tasks.Task zza;
    final /* synthetic */ com.google.android.gms.tasks.zzp zzb;

    zzo(com.google.android.gms.tasks.zzp zzpVar, com.google.android.gms.tasks.Task task) {
        this.zza = task;
        java.util.Objects.requireNonNull(zzpVar);
        this.zzb = zzpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.google.android.gms.tasks.Task then = this.zzb.zzc().then(this.zza.getResult());
            if (then == null) {
                this.zzb.onFailure(new java.lang.NullPointerException("Continuation returned null"));
                return;
            }
            com.google.android.gms.tasks.zzp zzpVar = this.zzb;
            java.util.concurrent.Executor executor = com.google.android.gms.tasks.TaskExecutors.zza;
            then.addOnSuccessListener(executor, zzpVar);
            then.addOnFailureListener(executor, zzpVar);
            then.addOnCanceledListener(executor, zzpVar);
        } catch (com.google.android.gms.tasks.RuntimeExecutionException e) {
            if (e.getCause() instanceof java.lang.Exception) {
                this.zzb.onFailure((java.lang.Exception) e.getCause());
            } else {
                this.zzb.onFailure(e);
            }
        } catch (java.util.concurrent.CancellationException unused) {
            this.zzb.onCanceled();
        } catch (java.lang.Exception e2) {
            this.zzb.onFailure(e2);
        }
    }
}
