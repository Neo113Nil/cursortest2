package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzap extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzar {
    zzap(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IPolylineDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzA(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzB(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzC(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzD(com.google.android.gms.internal.maps.zzar zzarVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzarVar);
        android.os.Parcel zzJ = zzJ(15, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzE() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(18, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzF() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(14, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final boolean zzG() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(12, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(10, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final int zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(24, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final int zzh() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(16, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final com.google.android.gms.dynamic.IObjectWrapper zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(28, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final com.google.android.gms.maps.model.Cap zzj() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(22, zza());
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.Cap.CREATOR);
        zzJ.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final com.google.android.gms.maps.model.Cap zzk() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(20, zza());
        com.google.android.gms.maps.model.Cap cap = (com.google.android.gms.maps.model.Cap) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.Cap.CREATOR);
        zzJ.recycle();
        return cap;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final java.lang.String zzl() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final java.util.List zzm() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(26, zza());
        java.util.ArrayList createTypedArrayList = zzJ.createTypedArrayList(com.google.android.gms.maps.model.PatternItem.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final java.util.List zzn() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        java.util.ArrayList createTypedArrayList = zzJ.createTypedArrayList(com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final java.util.List zzo() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(30, zza());
        java.util.ArrayList createTypedArrayList = zzJ.createTypedArrayList(com.google.android.gms.maps.model.StyleSpan.CREATOR);
        zzJ.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzp() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzq(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzr(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzs(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, cap);
        zzc(21, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzt(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzu(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(23, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzv(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(25, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzw(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzx(java.util.List list) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeTypedList(list);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzy(com.google.android.gms.maps.model.Cap cap) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, cap);
        zzc(19, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzar
    public final void zzz(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(27, zza);
    }
}
