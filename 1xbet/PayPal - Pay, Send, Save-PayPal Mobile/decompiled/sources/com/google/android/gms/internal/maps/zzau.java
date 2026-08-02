package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzau extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzaw {
    zzau(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileOverlayDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final float zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(13, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final float zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(5, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(3, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzh() throws android.os.RemoteException {
        zzc(2, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzi() throws android.os.RemoteException {
        zzc(1, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzj(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzk(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzl(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final void zzm(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final boolean zzn(com.google.android.gms.internal.maps.zzaw zzawVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzawVar);
        android.os.Parcel zzJ = zzJ(8, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final boolean zzo() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(11, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaw
    public final boolean zzp() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(7, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
