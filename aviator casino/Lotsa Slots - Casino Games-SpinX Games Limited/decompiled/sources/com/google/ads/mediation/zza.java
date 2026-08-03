package com.google.ads.mediation;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zza extends com.google.android.gms.ads.mediation.UnifiedNativeAdMapper {
    public zza(com.google.android.gms.ads.formats.UnifiedNativeAd unifiedNativeAd) {
        setHeadline(unifiedNativeAd.zza());
        setImages(unifiedNativeAd.zzb());
        setBody(unifiedNativeAd.zzc());
        setIcon(unifiedNativeAd.zzd());
        setCallToAction(unifiedNativeAd.zze());
        setAdvertiser(unifiedNativeAd.zzf());
        setStarRating(unifiedNativeAd.zzg());
        setStore(unifiedNativeAd.zzh());
        setPrice(unifiedNativeAd.zzi());
        zzb(unifiedNativeAd.zzk());
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        zza(unifiedNativeAd.zzj());
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(android.view.View view, java.util.Map<java.lang.String, android.view.View> map, java.util.Map<java.lang.String, android.view.View> map2) {
        if (view instanceof com.google.android.gms.ads.formats.zzh) {
            throw null;
        }
        if (((com.google.android.gms.ads.formats.zzc) com.google.android.gms.ads.formats.zzc.zza.get(view)) != null) {
            throw null;
        }
    }
}
