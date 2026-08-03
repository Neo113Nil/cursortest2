package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmt implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzah zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzd;

    zzmt(com.google.android.gms.measurement.internal.zznk zznkVar, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z2, com.google.android.gms.measurement.internal.zzah zzahVar, com.google.android.gms.measurement.internal.zzah zzahVar2) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzahVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzd = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zzd;
        com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
        if (zzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Discarding data. Failed to send conditional user property to service");
            return;
        }
        com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        zznkVar.zzm(zzZ, this.zzb ? null : this.zzc, zzrVar);
        zznkVar.zzV();
    }
}
