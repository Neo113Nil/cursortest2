package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzbyv extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzbyx {
    zzbyv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbyx
    public final com.google.android.gms.internal.ads.zzbyu zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzbyu zzbysVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbysVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            zzbysVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzbyu ? (com.google.android.gms.internal.ads.zzbyu) queryLocalInterface : new com.google.android.gms.internal.ads.zzbys(readStrongBinder);
        }
        zzcZ.recycle();
        return zzbysVar;
    }
}
