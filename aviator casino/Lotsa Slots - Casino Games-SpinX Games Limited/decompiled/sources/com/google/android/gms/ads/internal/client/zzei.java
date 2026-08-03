package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
final class zzei extends com.google.android.gms.ads.internal.client.zzaz {
    final /* synthetic */ com.google.android.gms.ads.internal.client.zzek zza;

    zzei(com.google.android.gms.ads.internal.client.zzek zzekVar) {
        java.util.Objects.requireNonNull(zzekVar);
        this.zza = zzekVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.ads.internal.client.zzaz, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        com.google.android.gms.ads.internal.client.zzek zzekVar = this.zza;
        zzekVar.zzE().zza(zzekVar.zzz());
        super.onAdLoaded();
    }
}
