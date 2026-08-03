package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzccq extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzccq(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void zze(com.google.android.gms.internal.ads.zzccf zzccfVar, java.lang.String str, java.lang.String str2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzccfVar);
        zza.writeString(str);
        zza.writeString(str2);
        zzda(2, zza);
    }
}
