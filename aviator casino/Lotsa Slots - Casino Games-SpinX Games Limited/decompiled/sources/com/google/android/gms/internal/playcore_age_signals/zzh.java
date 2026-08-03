package com.google.android.gms.internal.playcore_age_signals;

/* compiled from: com.google.android.play:age-signals@@0.0.2 */
/* loaded from: classes4.dex */
final class zzh extends com.google.android.gms.internal.playcore_age_signals.zze {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.gms.internal.playcore_age_signals.zze zzb;
    final /* synthetic */ com.google.android.gms.internal.playcore_age_signals.zzo zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzh(com.google.android.gms.internal.playcore_age_signals.zzo zzoVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.gms.internal.playcore_age_signals.zze zzeVar) {
        super(taskCompletionSource);
        this.zza = taskCompletionSource2;
        this.zzb = zzeVar;
        java.util.Objects.requireNonNull(zzoVar);
        this.zzc = zzoVar;
    }

    @Override // com.google.android.gms.internal.playcore_age_signals.zze
    public final void zzb() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        com.google.android.gms.internal.playcore_age_signals.zzd zzdVar;
        com.google.android.gms.internal.playcore_age_signals.zzo zzoVar = this.zzc;
        obj = zzoVar.zzg;
        synchronized (obj) {
            com.google.android.gms.internal.playcore_age_signals.zzo.zzo(zzoVar, this.zza);
            atomicInteger = zzoVar.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzdVar = zzoVar.zzc;
                zzdVar.zzc("Already connected to the service.", new java.lang.Object[0]);
            }
            com.google.android.gms.internal.playcore_age_signals.zzo.zzq(zzoVar, this.zzb);
        }
    }
}
