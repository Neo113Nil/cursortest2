package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzbx extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate {
    zzbx(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewPanoramaCamera);
        zza.writeLong(j);
        zzc(9, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enablePanning(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(2, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableStreetNames(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableUserNavigation(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(3, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void enableZoom(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(1, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.maps.model.StreetViewPanoramaCamera getPanoramaCamera() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(10, zza());
        com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera = (com.google.android.gms.maps.model.StreetViewPanoramaCamera) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.StreetViewPanoramaCamera.CREATOR);
        zzJ.recycle();
        return streetViewPanoramaCamera;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.maps.model.StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(14, zza());
        com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation = (com.google.android.gms.maps.model.StreetViewPanoramaLocation) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.StreetViewPanoramaLocation.CREATOR);
        zzJ.recycle();
        return streetViewPanoramaLocation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isPanningGesturesEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(6, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isStreetNamesEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(8, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isUserNavigationEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(7, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final boolean isZoomGesturesEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(5, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewPanoramaOrientation);
        android.os.Parcel zzJ = zzJ(19, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final com.google.android.gms.maps.model.StreetViewPanoramaOrientation pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzJ = zzJ(18, zza);
        com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation = (com.google.android.gms.maps.model.StreetViewPanoramaOrientation) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.StreetViewPanoramaOrientation.CREATOR);
        zzJ.recycle();
        return streetViewPanoramaOrientation;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzbl zzblVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzblVar);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzbn zzbnVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbnVar);
        zzc(15, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzbp zzbpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbpVar);
        zzc(17, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzbr zzbrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbrVar);
        zzc(20, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zzc(12, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithID(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzc(11, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadius(com.google.android.gms.maps.model.LatLng latLng, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zza.writeInt(i);
        zzc(13, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithRadiusAndSource(com.google.android.gms.maps.model.LatLng latLng, int i, com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewSource);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate
    public final void setPositionWithSource(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        com.google.android.gms.internal.maps.zzc.zze(zza, streetViewSource);
        zzc(21, zza);
    }
}
