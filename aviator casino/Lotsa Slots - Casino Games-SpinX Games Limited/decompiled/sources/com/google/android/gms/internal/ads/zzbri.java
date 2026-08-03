package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbri extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzbri(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(com.google.android.gms.internal.ads.zzbrc zzbrcVar, com.google.android.gms.internal.ads.zzbrh zzbrhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zzc(zza, zzbrcVar);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbrhVar);
        zzdb(2, zza);
    }
}
