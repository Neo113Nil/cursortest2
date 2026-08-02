package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzl extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzn {
    zzl(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ICircleDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzA() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(16, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final double zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        double readDouble = zzJ.readDouble();
        zzJ.recycle();
        return readDouble;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final float zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(12, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzh() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(10, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final int zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(18, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final com.google.android.gms.dynamic.IObjectWrapper zzj() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(24, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final com.google.android.gms.maps.model.LatLng zzk() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final java.util.List zzm() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(22, zza());
        java.util.ArrayList createTypedArrayList = zzJ.createTypedArrayList(com.google.android.gms.maps.model.PatternItem.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzn() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzo(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzq(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzr(double d) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeDouble(d);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzs(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzt(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzu(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzv(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzw(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final void zzx(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzy(com.google.android.gms.internal.maps.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zznVar);
        android.os.Parcel zzJ = zzJ(17, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzn
    public final boolean zzz() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(20, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
