package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzy extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzaa {
    zzy(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final int zzf() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final java.util.List zzg() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(3, zza());
        java.util.ArrayList<android.os.IBinder> createBinderArrayList = zzJ.createBinderArrayList();
        zzJ.recycle();
        return createBinderArrayList;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzh(com.google.android.gms.internal.maps.zzaa zzaaVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzaaVar);
        android.os.Parcel zzJ = zzJ(5, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.internal.maps.zzaa
    public final boolean zzi() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(4, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
