package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzem extends com.google.android.gms.ads.preload.zzb {
    public zzem(android.content.Context context) {
        super(context, com.google.android.gms.ads.AdFormat.INTERSTITIAL);
    }

    public final com.google.android.gms.ads.interstitial.InterstitialAd zza(java.lang.String str) {
        com.google.android.gms.ads.internal.client.zzbu zzbuVar;
        try {
            zzbuVar = this.zza.zzo(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbuVar = null;
        }
        if (zzbuVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbsl(zzj(), zzbuVar);
    }
}
