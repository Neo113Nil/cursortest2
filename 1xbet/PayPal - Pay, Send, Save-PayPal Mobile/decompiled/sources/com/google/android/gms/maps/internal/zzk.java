package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzk extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IMapFragmentDelegate {
    zzk(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final java.lang.String getDebugString(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzJ = zzJ(17, zza);
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final com.google.android.gms.maps.internal.IGoogleMapDelegate getMap() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IGoogleMapDelegate zzgVar;
        android.os.Parcel zzJ = zzJ(1, zza());
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzgVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zzgVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IGoogleMapDelegate ? (com.google.android.gms.maps.internal.IGoogleMapDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzg(readStrongBinder);
        }
        zzJ.recycle();
        return zzgVar;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void getMapAsync(com.google.android.gms.maps.internal.zzat zzatVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzatVar);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final boolean isReady() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(11, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onCreate(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper onCreateView(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper2);
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        android.os.Parcel zzJ = zzJ(4, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onDestroy() throws android.os.RemoteException {
        zzc(8, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onDestroyView() throws android.os.RemoteException {
        zzc(7, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onExitAmbient() throws android.os.RemoteException {
        zzc(14, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onInflate(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions, android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zze(zza, googleMapOptions);
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onLowMemory() throws android.os.RemoteException {
        zzc(9, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onPause() throws android.os.RemoteException {
        zzc(6, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onResume() throws android.os.RemoteException {
        zzc(5, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        android.os.Parcel zzJ = zzJ(10, zza);
        if (zzJ.readInt() != 0) {
            bundle.readFromParcel(zzJ);
        }
        zzJ.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onStart() throws android.os.RemoteException {
        zzc(15, zza());
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onStop() throws android.os.RemoteException {
        zzc(16, zza());
    }
}
