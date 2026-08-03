package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzct extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.ads.internal.client.zzcv {
    zzct(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final com.google.android.gms.internal.ads.zzbvc getAdapterCreator() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        com.google.android.gms.internal.ads.zzbvc zzf = com.google.android.gms.internal.ads.zzbvb.zzf(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return zzf;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcv
    public final com.google.android.gms.ads.internal.client.zzez getLiteSdkVersion() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(1, zza());
        com.google.android.gms.ads.internal.client.zzez zzezVar = (com.google.android.gms.ads.internal.client.zzez) com.google.android.gms.internal.ads.zzbeg.zzb(zzcZ, com.google.android.gms.ads.internal.client.zzez.CREATOR);
        zzcZ.recycle();
        return zzezVar;
    }
}
