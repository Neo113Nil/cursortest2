package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzede extends com.google.android.gms.ads.AdListener {
    final /* synthetic */ java.lang.String zza;
    final /* synthetic */ com.google.android.gms.ads.BaseAdView zzb;
    final /* synthetic */ com.google.android.gms.internal.ads.zzedo zzc;

    zzede(com.google.android.gms.internal.ads.zzedo zzedoVar, java.lang.String str, com.google.android.gms.ads.BaseAdView baseAdView) {
        this.zza = str;
        this.zzb = baseAdView;
        java.util.Objects.requireNonNull(zzedoVar);
        this.zzc = zzedoVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        java.lang.String zzm;
        com.google.android.gms.internal.ads.zzedo zzedoVar = this.zzc;
        zzm = com.google.android.gms.internal.ads.zzedo.zzm(loadAdError);
        zzedoVar.zzg(zzm);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.zzc.zzf(this.zza, this.zzb);
    }
}
