package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzdpe implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ java.lang.String zza = "Google";
    final /* synthetic */ com.google.android.gms.internal.ads.zzdpo zzb;

    zzdpe(com.google.android.gms.internal.ads.zzdpo zzdpoVar, java.lang.String str, boolean z) {
        java.util.Objects.requireNonNull(zzdpoVar);
        this.zzb = zzdpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzgs)).booleanValue()) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th, "omid native display exp");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzdpo zzdpoVar = this.zzb;
        zzdpoVar.zzZ().zzo((com.google.android.gms.internal.ads.zzcku) obj);
        java.lang.String str = this.zza;
        com.google.android.gms.internal.ads.zzcfw zzY = zzdpoVar.zzZ().zzY();
        com.google.android.gms.internal.ads.zzeln zzL = zzdpoVar.zzL(str, true);
        if (zzL != null && zzY != null) {
            zzY.zzc(zzL);
        } else if (zzY != null) {
            zzY.cancel(false);
        }
    }
}
