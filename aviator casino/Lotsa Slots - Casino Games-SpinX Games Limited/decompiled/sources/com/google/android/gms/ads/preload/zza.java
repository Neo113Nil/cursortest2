package com.google.android.gms.ads.preload;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zza extends com.google.android.gms.ads.internal.client.zzcd {
    final /* synthetic */ com.google.android.gms.ads.preload.PreloadCallbackV2 zza;

    zza(com.google.android.gms.ads.preload.zzb zzbVar, com.google.android.gms.ads.preload.PreloadCallbackV2 preloadCallbackV2) {
        this.zza = preloadCallbackV2;
        java.util.Objects.requireNonNull(zzbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zze(java.lang.String str, com.google.android.gms.ads.internal.client.zzdx zzdxVar) {
        this.zza.onAdPreloaded(str, com.google.android.gms.ads.ResponseInfo.zzb(zzdxVar));
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzf(java.lang.String str) {
        this.zza.onAdsExhausted(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzce
    public final void zzg(java.lang.String str, com.google.android.gms.ads.internal.client.zze zzeVar) {
        this.zza.onAdFailedToPreload(str, zzeVar.zzb());
    }
}
