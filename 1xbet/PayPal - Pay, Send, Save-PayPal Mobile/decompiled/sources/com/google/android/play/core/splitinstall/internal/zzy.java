package com.google.android.play.core.splitinstall.internal;

/* loaded from: classes9.dex */
final class zzy extends com.google.android.play.core.splitinstall.internal.zzv {
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource zza;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzv zzb;
    final /* synthetic */ com.google.android.play.core.splitinstall.internal.zzaf zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzy(com.google.android.play.core.splitinstall.internal.zzaf zzafVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.core.splitinstall.internal.zzv zzvVar) {
        super(taskCompletionSource);
        this.zzc = zzafVar;
        this.zza = taskCompletionSource2;
        this.zzb = zzvVar;
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzv
    public final void zzc() {
        java.lang.Object obj;
        java.util.concurrent.atomic.AtomicInteger atomicInteger;
        com.google.android.play.core.splitinstall.internal.zzu zzuVar;
        obj = this.zzc.zzg;
        synchronized (obj) {
            com.google.android.play.core.splitinstall.internal.zzaf.zzn(this.zzc, this.zza);
            atomicInteger = this.zzc.zzl;
            if (atomicInteger.getAndIncrement() > 0) {
                zzuVar = this.zzc.zzc;
                zzuVar.zzd("Already connected to the service.", new java.lang.Object[0]);
            }
            com.google.android.play.core.splitinstall.internal.zzaf.zzp(this.zzc, this.zzb);
        }
    }
}
