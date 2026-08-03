package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-api@@25.2.0 */
/* loaded from: classes4.dex */
public final class zzcen extends com.google.android.gms.internal.ads.zzbee implements com.google.android.gms.internal.ads.zzcep {
    zzcen(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzcep
    public final com.google.android.gms.internal.ads.zzcem zze(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.internal.ads.zzbvc zzbvcVar, int i) throws android.os.RemoteException {
        com.google.android.gms.internal.ads.zzcem zzcekVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.ads.zzbeg.zze(zza, iObjectWrapper);
        com.google.android.gms.internal.ads.zzbeg.zze(zza, zzbvcVar);
        zza.writeInt(com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor.MODULE_VERSION);
        android.os.Parcel zzcZ = zzcZ(2, zza);
        android.os.IBinder readStrongBinder = zzcZ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcekVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            zzcekVar = queryLocalInterface instanceof com.google.android.gms.internal.ads.zzcem ? (com.google.android.gms.internal.ads.zzcem) queryLocalInterface : new com.google.android.gms.internal.ads.zzcek(readStrongBinder);
        }
        zzcZ.recycle();
        return zzcekVar;
    }
}
