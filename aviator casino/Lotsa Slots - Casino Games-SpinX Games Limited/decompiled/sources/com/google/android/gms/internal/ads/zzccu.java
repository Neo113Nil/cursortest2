package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccu {
    public static final com.google.android.gms.internal.ads.zzcci zza(android.content.Context context, java.lang.String str, com.google.android.gms.internal.ads.zzbvc zzbvcVar) {
        try {
            android.os.IBinder zze = ((com.google.android.gms.internal.ads.zzccm) com.google.android.gms.ads.internal.util.client.zzs.zza(context, "com.google.android.gms.ads.rewarded.ChimeraRewardedAdCreatorImpl", com.google.android.gms.internal.ads.zzcct.zza)).zze(com.google.android.gms.dynamic.ObjectWrapper.wrap(context), str, zzbvcVar, com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
            if (zze == null) {
                return null;
            }
            android.os.IInterface queryLocalInterface = zze.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardedAd");
            return queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcci ? (com.google.android.gms.internal.ads.zzcci) queryLocalInterface : new com.google.android.gms.internal.ads.zzccg(zze);
        } catch (android.os.RemoteException | com.google.android.gms.ads.internal.util.client.zzr e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e);
            return null;
        }
    }
}
