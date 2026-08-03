package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzey extends com.google.android.gms.ads.preload.zzb {
    public zzey(android.content.Context context) {
        super(context, com.google.android.gms.ads.AdFormat.REWARDED);
    }

    public final com.google.android.gms.ads.rewarded.RewardedAd zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzcci zzcciVar;
        try {
            zzcciVar = this.zza.zzq(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzcciVar = null;
        }
        if (zzcciVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzccr(zzj(), zzcciVar);
    }
}
