package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzen extends com.google.android.gms.ads.internal.client.zzca {
    final /* synthetic */ com.google.android.gms.ads.preload.PreloadCallback zza;

    zzen(com.google.android.gms.ads.internal.client.zzeu zzeuVar, com.google.android.gms.ads.preload.PreloadCallback preloadCallback) {
        this.zza = preloadCallback;
        java.util.Objects.requireNonNull(zzeuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zze(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        com.google.android.gms.ads.preload.PreloadConfiguration zzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (zzt != null) {
            this.zza.onAdsAvailable(zzt);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzf(com.google.android.gms.ads.internal.client.zzfp zzfpVar) {
        com.google.android.gms.ads.preload.PreloadConfiguration zzt = com.google.android.gms.ads.internal.util.client.zzf.zzt(zzfpVar);
        if (zzt != null) {
            this.zza.onAdsExhausted(zzt);
        }
    }
}
