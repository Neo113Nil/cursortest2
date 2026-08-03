package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzehr implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzcam zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcav zzb;

    zzehr(com.google.android.gms.internal.ads.zzeii zzeiiVar, com.google.android.gms.internal.ads.zzcav zzcavVar, com.google.android.gms.internal.ads.zzcam zzcamVar) {
        this.zzb = zzcavVar;
        this.zza = zzcamVar;
        java.util.Objects.requireNonNull(zzeiiVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        try {
            this.zzb.zzf(com.google.android.gms.ads.internal.util.zzba.zza(th));
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        try {
            this.zzb.zze((java.lang.String) obj, this.zza);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Service can't call client", e);
        }
    }
}
