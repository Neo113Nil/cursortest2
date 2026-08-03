package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmj implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzr zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzb;

    zzmj(com.google.android.gms.measurement.internal.zznk zznkVar, com.google.android.gms.measurement.internal.zzr zzrVar, boolean z) {
        this.zza = zzrVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zzb;
        com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
        if (zzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzr zzrVar = this.zza;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
            com.google.android.gms.measurement.internal.zzib zzibVar = zznkVar.zzu;
            com.google.android.gms.measurement.internal.zzal zzc = zzibVar.zzc();
            com.google.android.gms.measurement.internal.zzfw zzfwVar = com.google.android.gms.measurement.internal.zzfx.zzbc;
            if (zzc.zzp(null, zzfwVar)) {
                zznkVar.zzm(zzZ, null, zzrVar);
            }
            zzZ.zzg(zzrVar);
            zznkVar.zzu.zzm().zzo();
            zzibVar.zzc().zzp(null, zzfwVar);
            zznkVar.zzm(zzZ, null, zzrVar);
            zznkVar.zzV();
        } catch (android.os.RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send app launch to the service", e);
        }
    }
}
