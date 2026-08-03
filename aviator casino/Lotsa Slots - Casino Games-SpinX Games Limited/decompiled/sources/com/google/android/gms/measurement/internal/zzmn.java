package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmn implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzbe zzc;
    final /* synthetic */ android.os.Bundle zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zze;

    zzmn(com.google.android.gms.measurement.internal.zznk zznkVar, boolean z, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z2, com.google.android.gms.measurement.internal.zzbe zzbeVar, android.os.Bundle bundle) {
        this.zza = zzrVar;
        this.zzb = z2;
        this.zzc = zzbeVar;
        this.zzd = bundle;
        java.util.Objects.requireNonNull(zznkVar);
        this.zze = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zze;
        com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
        if (zzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Failed to send default event parameters to service");
            return;
        }
        if (zznkVar.zzu.zzc().zzp(null, com.google.android.gms.measurement.internal.zzfx.zzbc)) {
            com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            this.zze.zzm(zzZ, this.zzb ? null : this.zzc, zzrVar);
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzrVar2 = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar2);
            zzZ.zzu(this.zzd, zzrVar2);
            zznkVar.zzV();
        } catch (android.os.RemoteException e) {
            this.zze.zzu.zzaV().zzb().zzb("Failed to send default event parameters to service", e);
        }
    }
}
