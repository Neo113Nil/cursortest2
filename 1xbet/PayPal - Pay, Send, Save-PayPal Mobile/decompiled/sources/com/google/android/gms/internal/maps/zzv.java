package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzv extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzx {
    zzv(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IGroundOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzA() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(23, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzB() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(16, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(12, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(18, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(7, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final float zzh() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final int zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(20, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final com.google.android.gms.dynamic.IObjectWrapper zzj() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(25, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final com.google.android.gms.maps.model.LatLng zzk() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final com.google.android.gms.maps.model.LatLngBounds zzl() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(10, zza());
        com.google.android.gms.maps.model.LatLngBounds latLngBounds = (com.google.android.gms.maps.model.LatLngBounds) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.LatLngBounds.CREATOR);
        zzJ.recycle();
        return latLngBounds;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final java.lang.String zzm() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzn() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzo(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzq(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzr(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzs(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzt(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzu(com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLngBounds);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzv(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzw(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzx(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final void zzy(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzx
    public final boolean zzz(com.google.android.gms.internal.maps.zzx zzxVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzxVar);
        android.os.Parcel zzJ = zzJ(19, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
