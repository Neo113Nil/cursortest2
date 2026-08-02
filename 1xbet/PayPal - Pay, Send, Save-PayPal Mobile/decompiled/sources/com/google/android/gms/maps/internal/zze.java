package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zze extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.zzf {
    zze(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final int zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(9, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zzbVar;
        android.os.Parcel zzJ = zzJ(4, zza());
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            zzbVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate ? (com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzb(readStrongBinder);
        }
        zzJ.recycle();
        return zzbVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IMapFragmentDelegate zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IMapFragmentDelegate zzkVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzJ = zzJ(2, zza);
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzkVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            zzkVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IMapFragmentDelegate ? (com.google.android.gms.maps.internal.IMapFragmentDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzk(readStrongBinder);
        }
        zzJ.recycle();
        return zzkVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IMapViewDelegate zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IMapViewDelegate zzlVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zze(zza, googleMapOptions);
        android.os.Parcel zzJ = zzJ(3, zza);
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzlVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            zzlVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IMapViewDelegate ? (com.google.android.gms.maps.internal.IMapViewDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzl(readStrongBinder);
        }
        zzJ.recycle();
        return zzlVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzbyVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzJ = zzJ(8, zza);
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbyVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            zzbyVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate ? (com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzby(readStrongBinder);
        }
        zzJ.recycle();
        return zzbyVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzbzVar;
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewPanoramaOptions);
        android.os.Parcel zzJ = zzJ(7, zza);
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbzVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
            zzbzVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate ? (com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzbz(readStrongBinder);
        }
        zzJ.recycle();
        return zzbzVar;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final com.google.android.gms.internal.maps.zzk zzj() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(5, zza());
        com.google.android.gms.internal.maps.zzk zzb = com.google.android.gms.internal.maps.zzj.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zza.writeString(str);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zza.writeInt(20000000);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zza.writeInt(i);
        zzc(10, zza);
    }

    @Override // com.google.android.gms.maps.internal.zzf
    public final void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(11, zza);
    }
}
