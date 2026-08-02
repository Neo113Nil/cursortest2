package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzab extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzad {
    zzab(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorLevelDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(5, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final java.lang.String zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final void zzg() throws android.os.RemoteException {
        zzc(3, zza());
    }

    @Override // com.google.android.gms.internal.maps.zzad
    public final boolean zzh(com.google.android.gms.internal.maps.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzadVar);
        android.os.Parcel zzJ = zzJ(4, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
