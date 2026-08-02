package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzi extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzk {
    zzi(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zze(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        android.os.Parcel zzJ = zzJ(5, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzf(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzJ = zzJ(2, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzg(android.graphics.Bitmap bitmap) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bitmap);
        android.os.Parcel zzJ = zzJ(6, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzh(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzJ = zzJ(3, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzi(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzJ = zzJ(7, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzj(com.google.android.gms.maps.model.PinConfig pinConfig) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, pinConfig);
        android.os.Parcel zzJ = zzJ(8, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzk
    public final com.google.android.gms.dynamic.IObjectWrapper zzk(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        android.os.Parcel zzJ = zzJ(1, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }
}
