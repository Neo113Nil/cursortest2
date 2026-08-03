package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzh extends com.google.android.gms.ads.internal.client.zzbj {
    private final com.google.android.gms.ads.AdLoadCallback zza;
    private final java.lang.Object zzb;

    public zzh(com.google.android.gms.ads.AdLoadCallback adLoadCallback, java.lang.Object obj) {
        this.zza = adLoadCallback;
        this.zzb = obj;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzb() {
        java.lang.Object obj;
        com.google.android.gms.ads.AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback == null || (obj = this.zzb) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(obj);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbk
    public final void zzc(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.AdLoadCallback adLoadCallback = this.zza;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }
}
