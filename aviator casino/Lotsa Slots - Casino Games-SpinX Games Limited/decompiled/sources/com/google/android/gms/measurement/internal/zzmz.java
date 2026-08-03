package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmz implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzga zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzne zzb;

    zzmz(com.google.android.gms.measurement.internal.zzne zzneVar, com.google.android.gms.measurement.internal.zzga zzgaVar) {
        this.zza = zzgaVar;
        java.util.Objects.requireNonNull(zzneVar);
        this.zzb = zzneVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzne zzneVar = this.zzb;
        synchronized (zzneVar) {
            zzneVar.zzd(false);
            com.google.android.gms.measurement.internal.zznk zznkVar = zzneVar.zza;
            if (!zznkVar.zzh()) {
                zznkVar.zzu.zzaV().zzj().zza("Connected to remote service");
                zznkVar.zzL(this.zza);
            }
        }
        com.google.android.gms.measurement.internal.zznk zznkVar2 = this.zzb.zza;
        if (zznkVar2.zzab() != null) {
            zznkVar2.zzab().shutdownNow();
            zznkVar2.zzac(null);
        }
    }
}
