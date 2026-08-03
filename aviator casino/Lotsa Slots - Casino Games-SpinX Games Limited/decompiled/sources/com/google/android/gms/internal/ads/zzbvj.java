package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbvj extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbvl {
    zzbvj(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final com.google.android.gms.dynamic.IObjectWrapper zze() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzcZ.readStrongBinder());
        zzcZ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.ads.zzbvl
    public final boolean zzf() throws android.os.RemoteException {
        android.os.Parcel zzcZ = zzcZ(2, zza());
        boolean zza = com.google.android.gms.internal.ads.zzbeg.zza(zzcZ);
        zzcZ.recycle();
        return zza;
    }
}
