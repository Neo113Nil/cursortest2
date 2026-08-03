package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement@@22.5.0 */
/* loaded from: classes4.dex */
final class zzit implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzpk zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzjc zzc;

    zzit(com.google.android.gms.measurement.internal.zzjc zzjcVar, com.google.android.gms.measurement.internal.zzpk zzpkVar, com.google.android.gms.measurement.internal.zzr zzrVar) {
        this.zza = zzpkVar;
        this.zzb = zzrVar;
        java.util.Objects.requireNonNull(zzjcVar);
        this.zzc = zzjcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzjc zzjcVar = this.zzc;
        zzjcVar.zzL().zzY();
        com.google.android.gms.measurement.internal.zzpk zzpkVar = this.zza;
        if (zzpkVar.zza() != null) {
            zzjcVar.zzL().zzab(zzpkVar, this.zzb);
        } else {
            com.google.android.gms.measurement.internal.zzr zzrVar = this.zzb;
            zzjcVar.zzL().zzac(zzpkVar.zzb, zzrVar);
        }
    }
}
