package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzah extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzaj {
    zzah(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzA(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzB(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(14, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzC(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzD() throws android.os.RemoteException {
        zzc(11, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzE(com.google.android.gms.internal.maps.zzaj zzajVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzajVar);
        android.os.Parcel zzJ = zzJ(16, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzF() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(10, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzG() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(21, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzH() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(13, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final boolean zzI() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(15, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(26, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(23, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final float zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(28, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final int zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(17, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final com.google.android.gms.dynamic.IObjectWrapper zzh() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(34, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(30, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final com.google.android.gms.maps.model.LatLng zzj() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final java.lang.String zzk() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final java.lang.String zzm() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzn() throws android.os.RemoteException {
        zzc(12, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzo() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzp(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzq(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzr(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzs(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzt(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzu(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzv(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzw(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzx(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzy(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaj
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(29, zza);
    }
}
