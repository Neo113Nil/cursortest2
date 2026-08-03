package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
final class zzedi extends com.google.android.gms.ads.AdListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzedo zza;

    zzedi(com.google.android.gms.internal.ads.zzedo zzedoVar) {
        java.util.Objects.requireNonNull(zzedoVar);
        this.zza = zzedoVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(com.google.android.gms.ads.LoadAdError loadAdError) {
        java.lang.String zzm;
        com.google.android.gms.internal.ads.zzedo zzedoVar = this.zza;
        zzm = com.google.android.gms.internal.ads.zzedo.zzm(loadAdError);
        zzedoVar.zzg(zzm);
    }
}
