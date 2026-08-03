package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.5.0 */
/* loaded from: classes4.dex */
final class zzmm implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlt zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zznk zzb;

    zzmm(com.google.android.gms.measurement.internal.zznk zznkVar, com.google.android.gms.measurement.internal.zzlt zzltVar) {
        this.zza = zzltVar;
        java.util.Objects.requireNonNull(zznkVar);
        this.zzb = zznkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zznk zznkVar = this.zzb;
        com.google.android.gms.measurement.internal.zzga zzZ = zznkVar.zzZ();
        if (zzZ == null) {
            zznkVar.zzu.zzaV().zzb().zza("Failed to send current screen to service");
            return;
        }
        try {
            com.google.android.gms.measurement.internal.zzlt zzltVar = this.zza;
            if (zzltVar == null) {
                zzZ.zzl(0L, null, null, zznkVar.zzu.zzaY().getPackageName());
            } else {
                zzZ.zzl(zzltVar.zzc, zzltVar.zza, zzltVar.zzb, zznkVar.zzu.zzaY().getPackageName());
            }
            zznkVar.zzV();
        } catch (android.os.RemoteException e) {
            this.zzb.zzu.zzaV().zzb().zzb("Failed to send current screen to the service", e);
        }
    }
}
