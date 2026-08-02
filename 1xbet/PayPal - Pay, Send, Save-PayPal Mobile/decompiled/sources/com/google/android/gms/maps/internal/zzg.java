package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzg extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IGoogleMapDelegate {
    zzg(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzn addCircle(com.google.android.gms.maps.model.CircleOptions circleOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, circleOptions);
        android.os.Parcel zzJ = zzJ(35, zza);
        com.google.android.gms.internal.maps.zzn zzb = com.google.android.gms.internal.maps.zzm.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzx addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, groundOverlayOptions);
        android.os.Parcel zzJ = zzJ(12, zza);
        com.google.android.gms.internal.maps.zzx zzb = com.google.android.gms.internal.maps.zzw.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaj addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, markerOptions);
        android.os.Parcel zzJ = zzJ(11, zza);
        com.google.android.gms.internal.maps.zzaj zzb = com.google.android.gms.internal.maps.zzai.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void addOnMapCapabilitiesChangedListener(com.google.android.gms.maps.internal.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzalVar);
        zzc(110, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzao addPolygon(com.google.android.gms.maps.model.PolygonOptions polygonOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, polygonOptions);
        android.os.Parcel zzJ = zzJ(10, zza);
        com.google.android.gms.internal.maps.zzao zzb = com.google.android.gms.internal.maps.zzan.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzar addPolyline(com.google.android.gms.maps.model.PolylineOptions polylineOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, polylineOptions);
        android.os.Parcel zzJ = zzJ(9, zza);
        com.google.android.gms.internal.maps.zzar zzb = com.google.android.gms.internal.maps.zzaq.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaw addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, tileOverlayOptions);
        android.os.Parcel zzJ = zzJ(13, zza);
        com.google.android.gms.internal.maps.zzaw zzb = com.google.android.gms.internal.maps.zzav.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(5, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.internal.zzd zzdVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzdVar);
        zzc(6, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithDurationAndCallback(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i, com.google.android.gms.maps.internal.zzd zzdVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzdVar);
        zzc(7, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() throws android.os.RemoteException {
        zzc(14, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.maps.model.CameraPosition getCameraPosition() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        com.google.android.gms.maps.model.CameraPosition cameraPosition = (com.google.android.gms.maps.model.CameraPosition) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.CameraPosition.CREATOR);
        zzJ.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final java.lang.String getDebugString(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        android.os.Parcel zzJ = zzJ(115, zza);
        java.lang.String readString = zzJ.readString();
        zzJ.recycle();
        return readString;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzu getFeatureLayer(com.google.android.gms.maps.model.FeatureLayerOptions featureLayerOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, featureLayerOptions);
        android.os.Parcel zzJ = zzJ(112, zza);
        com.google.android.gms.internal.maps.zzu zzb = com.google.android.gms.internal.maps.zzt.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzaa getFocusedBuilding() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(44, zza());
        com.google.android.gms.internal.maps.zzaa zzb = com.google.android.gms.internal.maps.zzz.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void getMapAsync(com.google.android.gms.maps.internal.zzat zzatVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzatVar);
        zzc(53, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzag getMapCapabilities() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(109, zza());
        com.google.android.gms.internal.maps.zzag zzb = com.google.android.gms.internal.maps.zzaf.zzb(zzJ.readStrongBinder());
        zzJ.recycle();
        return zzb;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapColorScheme() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(114, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapType() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(15, zza());
        int readInt = zzJ.readInt();
        zzJ.recycle();
        return readInt;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMaxZoomLevel() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMinZoomLevel() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(3, zza());
        float readFloat = zzJ.readFloat();
        zzJ.recycle();
        return readFloat;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final android.location.Location getMyLocation() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(23, zza());
        android.location.Location location = (android.location.Location) com.google.android.gms.internal.maps.zzc.zza(zzJ, android.location.Location.CREATOR);
        zzJ.recycle();
        return location;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.maps.internal.IProjectionDelegate getProjection() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IProjectionDelegate zzbuVar;
        android.os.Parcel zzJ = zzJ(26, zza());
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzbuVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            zzbuVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IProjectionDelegate ? (com.google.android.gms.maps.internal.IProjectionDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzbu(readStrongBinder);
        }
        zzJ.recycle();
        return zzbuVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.maps.internal.IUiSettingsDelegate getUiSettings() throws android.os.RemoteException {
        com.google.android.gms.maps.internal.IUiSettingsDelegate zzcaVar;
        android.os.Parcel zzJ = zzJ(25, zza());
        android.os.IBinder readStrongBinder = zzJ.readStrongBinder();
        if (readStrongBinder == null) {
            zzcaVar = null;
        } else {
            android.os.IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            zzcaVar = queryLocalInterface instanceof com.google.android.gms.maps.internal.IUiSettingsDelegate ? (com.google.android.gms.maps.internal.IUiSettingsDelegate) queryLocalInterface : new com.google.android.gms.maps.internal.zzca(readStrongBinder);
        }
        zzJ.recycle();
        return zzcaVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isBuildingsEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(40, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isIndoorEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(19, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isMyLocationEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(21, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTrafficEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(17, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTransitEnabled() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(116, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void moveCamera(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(4, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onCreate(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        zzc(54, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onDestroy() throws android.os.RemoteException {
        zzc(57, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        zzc(81, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onExitAmbient() throws android.os.RemoteException {
        zzc(82, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onLowMemory() throws android.os.RemoteException {
        zzc(58, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onPause() throws android.os.RemoteException {
        zzc(56, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onResume() throws android.os.RemoteException {
        zzc(55, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, bundle);
        android.os.Parcel zzJ = zzJ(60, zza);
        if (zzJ.readInt() != 0) {
            bundle.readFromParcel(zzJ);
        }
        zzJ.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStart() throws android.os.RemoteException {
        zzc(101, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStop() throws android.os.RemoteException {
        zzc(102, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void removeOnMapCapabilitiesChangedListener(com.google.android.gms.maps.internal.zzal zzalVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzalVar);
        zzc(111, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void resetMinMaxZoomPreference() throws android.os.RemoteException {
        zzc(94, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setBuildingsEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(41, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setContentDescription(java.lang.String str) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeString(str);
        zzc(61, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setIndoorEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        android.os.Parcel zzJ = zzJ(20, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setInfoWindowAdapter(com.google.android.gms.maps.internal.zzi zziVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zziVar);
        zzc(33, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLatLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLngBounds);
        zzc(95, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLocationSource(com.google.android.gms.maps.internal.ILocationSourceDelegate iLocationSourceDelegate) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iLocationSourceDelegate);
        zzc(24, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapColorScheme(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(113, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setMapStyle(com.google.android.gms.maps.model.MapStyleOptions mapStyleOptions) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, mapStyleOptions);
        android.os.Parcel zzJ = zzJ(91, zza);
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapType(int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zzc(16, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMaxZoomPreference(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(93, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMinZoomPreference(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zzc(92, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMyLocationEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(22, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraChangeListener(com.google.android.gms.maps.internal.zzn zznVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zznVar);
        zzc(27, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraIdleListener(com.google.android.gms.maps.internal.zzp zzpVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzpVar);
        zzc(99, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveCanceledListener(com.google.android.gms.maps.internal.zzr zzrVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzrVar);
        zzc(98, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveListener(com.google.android.gms.maps.internal.zzt zztVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zztVar);
        zzc(97, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveStartedListener(com.google.android.gms.maps.internal.zzv zzvVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzvVar);
        zzc(96, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCircleClickListener(com.google.android.gms.maps.internal.zzx zzxVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzxVar);
        zzc(89, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnGroundOverlayClickListener(com.google.android.gms.maps.internal.zzz zzzVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzzVar);
        zzc(83, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnIndoorStateChangeListener(com.google.android.gms.maps.internal.zzab zzabVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzabVar);
        zzc(45, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowClickListener(com.google.android.gms.maps.internal.zzad zzadVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzadVar);
        zzc(32, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowCloseListener(com.google.android.gms.maps.internal.zzaf zzafVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzafVar);
        zzc(86, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowLongClickListener(com.google.android.gms.maps.internal.zzah zzahVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzahVar);
        zzc(84, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapClickListener(com.google.android.gms.maps.internal.zzan zzanVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzanVar);
        zzc(28, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLoadedCallback(com.google.android.gms.maps.internal.zzap zzapVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzapVar);
        zzc(42, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLongClickListener(com.google.android.gms.maps.internal.zzar zzarVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzarVar);
        zzc(29, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerClickListener(com.google.android.gms.maps.internal.zzav zzavVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzavVar);
        zzc(30, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerDragListener(com.google.android.gms.maps.internal.zzax zzaxVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzaxVar);
        zzc(31, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationButtonClickListener(com.google.android.gms.maps.internal.zzaz zzazVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzazVar);
        zzc(37, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationChangeListener(com.google.android.gms.maps.internal.zzbb zzbbVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbbVar);
        zzc(36, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationClickListener(com.google.android.gms.maps.internal.zzbd zzbdVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbdVar);
        zzc(107, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPoiClickListener(com.google.android.gms.maps.internal.zzbf zzbfVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbfVar);
        zzc(80, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolygonClickListener(com.google.android.gms.maps.internal.zzbh zzbhVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbhVar);
        zzc(85, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolylineClickListener(com.google.android.gms.maps.internal.zzbj zzbjVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbjVar);
        zzc(87, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setPadding(int i, int i2, int i3, int i4) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        zza.writeInt(i4);
        zzc(39, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTrafficEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(18, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTransitEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(117, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setWatermarkEnabled(boolean z) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        int i = com.google.android.gms.internal.maps.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zzc(51, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshot(com.google.android.gms.maps.internal.zzbw zzbwVar, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbwVar);
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        zzc(38, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshotForTest(com.google.android.gms.maps.internal.zzbw zzbwVar) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, zzbwVar);
        zzc(71, zza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void stopAnimation() throws android.os.RemoteException {
        zzc(8, zza());
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean useViewLifecycleWhenInFragment() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(59, zza());
        boolean zzh = com.google.android.gms.internal.maps.zzc.zzh(zzJ);
        zzJ.recycle();
        return zzh;
    }
}
