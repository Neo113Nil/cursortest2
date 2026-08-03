package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyq extends com.google.android.gms.internal.ads.zzbno {
    private final com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener zza;

    public zzbyq(com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.zza = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.zzbnp
    public final void zze(com.google.android.gms.internal.ads.zzbnv zzbnvVar) {
        this.zza.onNativeAdLoaded(new com.google.android.gms.internal.ads.zzbyl(zzbnvVar));
    }
}
