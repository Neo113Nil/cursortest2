package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzel extends com.google.android.gms.ads.preload.zzb {
    public zzel(android.content.Context context) {
        super(context, com.google.android.gms.ads.AdFormat.APP_OPEN_AD);
    }

    public final com.google.android.gms.ads.appopen.AppOpenAd zza(java.lang.String str) {
        com.google.android.gms.internal.ads.zzbgj zzbgjVar;
        try {
            zzbgjVar = this.zza.zzp(str);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            zzbgjVar = null;
        }
        if (zzbgjVar == null) {
            return null;
        }
        return new com.google.android.gms.internal.ads.zzbgf(zzbgjVar);
    }
}
