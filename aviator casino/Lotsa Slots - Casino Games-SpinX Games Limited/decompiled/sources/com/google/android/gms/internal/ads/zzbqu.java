package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbqu extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbqw {
    zzbqu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final com.google.android.gms.internal.ads.zzbqt zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i, com.google.android.gms.internal.ads.zzbqq zzbqqVar) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbqt zzbqrVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbqqVar);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbqrVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbqrVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbqt ? (com.google.android.gms.internal.ads.zzbqt) queryLocalInterface : new com.google.android.gms.internal.ads.zzbqr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbqrVar;
    }
}
