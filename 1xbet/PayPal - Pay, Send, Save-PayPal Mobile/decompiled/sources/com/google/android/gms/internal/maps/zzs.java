package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzs extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzu {
    zzs(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureLayerDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final java.lang.String zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final java.lang.String zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzf(com.google.android.gms.internal.maps.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzalVar);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzg(com.google.android.gms.internal.maps.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzalVar);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final void zzh(com.google.android.gms.internal.maps.zzat zzatVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzatVar);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.internal.maps.zzu
    public final boolean zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
