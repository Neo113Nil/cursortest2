package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzbz extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate {
    zzbz(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate getStreetViewPanorama() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate zzbxVar;
        android.os.Parcel zzJ = zzJ(1, zza());
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbxVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            zzbxVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate ? (com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzbx(readStrongBinder);
        }
        zzJ.recycle();
        return zzbxVar;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzbt zzbtVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbtVar);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper getView() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onCreate(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onDestroy() throws android.os.RemoteException {
        zzc(5, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onLowMemory() throws android.os.RemoteException {
        zzc(6, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onPause() throws android.os.RemoteException {
        zzc(4, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onResume() throws android.os.RemoteException {
        zzc(3, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        android.os.Parcel zzJ = zzJ(7, zza);
        if (zzJ.readInt() != 0) {
            bundle.readFromParcel(zzJ);
        }
        zzJ.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStart() throws android.os.RemoteException {
        zzc(10, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStop() throws android.os.RemoteException {
        zzc(11, zza());
    }
}
