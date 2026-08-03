package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbge extends com.google.android.gms.internal.ads.zzbgl {
    private final com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback zza;
    private final java.lang.String zzb;

    public zzbge(com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, java.lang.String str) {
        this.zza = appOpenAdLoadCallback;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzb(com.google.android.gms.internal.ads.zzbgj zzbgjVar) {
        com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdLoaded(new com.google.android.gms.internal.ads.zzbgf(zzbgjVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzc(int i) {
    }

    @Override // com.google.android.gms.internal.ads.zzbgm
    public final void zzd(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.appopen.AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback = this.zza;
        if (appOpenAdLoadCallback != null) {
            appOpenAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
