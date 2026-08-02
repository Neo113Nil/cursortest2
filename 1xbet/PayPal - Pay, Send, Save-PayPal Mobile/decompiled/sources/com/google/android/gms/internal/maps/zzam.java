package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzam extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzao {
    zzam(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolygonDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzA(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzB(com.google.android.gms.internal.maps.zzao zzaoVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzaoVar);
        android.os.Parcel zzJ = zzJ(19, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzC() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(22, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzD() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(18, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final boolean zzE() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(16, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(14, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(12, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(10, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzh() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(24, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final int zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(20, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final com.google.android.gms.dynamic.IObjectWrapper zzj() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(28, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final java.lang.String zzk() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final java.util.List zzl() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        java.util.ArrayList zzb = com.google.android.gms.internal.maps.zzc.zzb(zzJ);
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final java.util.List zzm() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        java.util.ArrayList createTypedArrayList = zzJ.createTypedArrayList(com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final java.util.List zzn() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(26, zza());
        java.util.ArrayList createTypedArrayList = zzJ.createTypedArrayList(com.google.android.gms.maps.model.PatternItem.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzo() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzp(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzq(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzr(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzs(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeList(list);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzt(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzu(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzv(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzw(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzx(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzy(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzao
    public final void zzz(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(15, zza);
    }
}
