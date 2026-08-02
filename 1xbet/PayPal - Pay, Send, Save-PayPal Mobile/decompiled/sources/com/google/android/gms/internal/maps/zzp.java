package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzp extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzr {
    zzp(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final java.lang.String zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final java.lang.String zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(3, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzr
    public final java.util.Map zzh() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(5, zza());
        java.util.HashMap zzc = com.google.android.gms.internal.maps.zzc.zzc(zzJ);
        zzJ.recycle();
        return zzc;
    }
}
