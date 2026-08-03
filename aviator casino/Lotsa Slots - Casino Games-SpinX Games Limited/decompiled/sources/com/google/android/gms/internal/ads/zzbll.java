package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbll extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzbll(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.flags.IFlagRetrieverSupplierProxy");
    }

    public final void zze(com.google.android.gms.internal.ads.zzcae zzcaeVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzcaeVar);
        zzda(1, zza);
    }
}
