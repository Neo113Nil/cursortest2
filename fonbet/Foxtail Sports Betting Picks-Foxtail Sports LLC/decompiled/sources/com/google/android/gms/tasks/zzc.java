package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes2.dex */
final class zzc implements Runnable {
    final /* synthetic */ Task zza;
    final /* synthetic */ zzd zzb;

    zzc(zzd zzdVar, Task task) {
        this.zzb = zzdVar;
        this.zza = task;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzw zzwVar;
        zzw zzwVar2;
        zzw zzwVar3;
        Continuation continuation;
        zzw zzwVar4;
        zzw zzwVar5;
        boolean isCanceled = this.zza.isCanceled();
        zzd zzdVar = this.zzb;
        if (isCanceled) {
            zzwVar5 = zzdVar.zzc;
            zzwVar5.zzc();
            return;
        }
        try {
            continuation = zzdVar.zzb;
            Object then = continuation.then(this.zza);
            zzwVar4 = this.zzb.zzc;
            zzwVar4.zzb(then);
        } catch (RuntimeExecutionException e) {
            boolean z = e.getCause() instanceof Exception;
            zzd zzdVar2 = this.zzb;
            if (z) {
                zzwVar3 = zzdVar2.zzc;
                zzwVar3.zza((Exception) e.getCause());
            } else {
                zzwVar2 = zzdVar2.zzc;
                zzwVar2.zza(e);
            }
        } catch (Exception e2) {
            zzwVar = this.zzb.zzc;
            zzwVar.zza(e2);
        }
    }
}
