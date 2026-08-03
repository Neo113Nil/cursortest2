package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzefm implements com.google.android.gms.internal.ads.zzhbt {
    final /* synthetic */ com.google.android.gms.internal.ads.zzefs zza;

    zzefm(com.google.android.gms.internal.ads.zzefs zzefsVar) {
        java.util.Objects.requireNonNull(zzefsVar);
        this.zza = zzefsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final void zza(java.lang.Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzhbt
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzfkq zzfkqVar = (com.google.android.gms.internal.ads.zzfkq) obj;
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzd(com.google.android.gms.internal.ads.zzbiq.zzcS)).booleanValue()) {
            this.zza.zzf().zzdQ(zzfkqVar);
        }
    }
}
