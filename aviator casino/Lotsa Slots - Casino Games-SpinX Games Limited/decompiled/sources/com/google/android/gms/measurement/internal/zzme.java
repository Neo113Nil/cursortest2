package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzme extends com.google.android.gms.measurement.internal.zzgf {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzb;

    zzme(com.google.android.gms.measurement.internal.zznk zznkVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zza = atomicReference;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgg
    public final void zze(com.google.android.gms.measurement.internal.zzop zzopVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            this.zzb.zzu.zzaV().zzk().zzb("[sgtm] Got upload batches from service. count", java.lang.Integer.valueOf(zzopVar.zza.size()));
            atomicReference.set(zzopVar);
            atomicReference.notifyAll();
        }
    }
}
