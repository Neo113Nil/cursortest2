package com.google.android.gms.ads.internal.client;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes3.dex */
public final class zzdu extends com.google.android.gms.internal.ads.zzbee implements android.os.IInterface {
    zzdu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOutOfContextTesterCreator");
    }

    public final com.google.android.gms.ads.internal.client.zzdt zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.ads.internal.client.zzdt zzdrVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(1, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzdrVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOutOfContextTester");
            zzdrVar = queryLocalInterface instanceof com.google.android.gms.ads.internal.client.zzdt ? (com.google.android.gms.ads.internal.client.zzdt) queryLocalInterface : new com.google.android.gms.ads.internal.client.zzdr(readStrongBinder);
        }
        zzcZ.recycle();
        return zzdrVar;
    }
}
