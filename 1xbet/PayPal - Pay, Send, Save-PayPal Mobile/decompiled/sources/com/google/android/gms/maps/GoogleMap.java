package com.google.android.gms.maps;

/* loaded from: classes.dex */
public class GoogleMap {
    public static final java.lang.String DEMO_MAP_ID = "demo_map_id";
    public static final int MAP_TYPE_HYBRID = 4;
    public static final int MAP_TYPE_NONE = 0;
    public static final int MAP_TYPE_NORMAL = 1;
    public static final int MAP_TYPE_SATELLITE = 2;
    public static final int MAP_TYPE_TERRAIN = 3;
    private final com.google.android.gms.maps.internal.IGoogleMapDelegate zza;
    private com.google.android.gms.maps.model.MapCapabilities zzb;
    private final java.util.Map zzc = new java.util.HashMap();
    private final java.util.Map zzd = new java.util.HashMap();
    private com.google.android.gms.maps.UiSettings zze;

    public interface CancelableCallback {
        void onCancel();

        void onFinish();
    }

    /* loaded from: classes8.dex */
    public interface InfoWindowAdapter {
        android.view.View getInfoContents(com.google.android.gms.maps.model.Marker marker);

        android.view.View getInfoWindow(com.google.android.gms.maps.model.Marker marker);
    }

    @java.lang.Deprecated
    /* loaded from: classes8.dex */
    public interface OnCameraChangeListener {
        void onCameraChange(com.google.android.gms.maps.model.CameraPosition cameraPosition);
    }

    /* loaded from: classes8.dex */
    public interface OnCameraIdleListener {
        void onCameraIdle();
    }

    /* loaded from: classes8.dex */
    public interface OnCameraMoveCanceledListener {
        void onCameraMoveCanceled();
    }

    /* loaded from: classes8.dex */
    public interface OnCameraMoveListener {
        void onCameraMove();
    }

    /* loaded from: classes8.dex */
    public interface OnCameraMoveStartedListener {
        public static final int REASON_API_ANIMATION = 2;
        public static final int REASON_DEVELOPER_ANIMATION = 3;
        public static final int REASON_GESTURE = 1;

        void onCameraMoveStarted(int i);
    }

    /* loaded from: classes8.dex */
    public interface OnCircleClickListener {
        void onCircleClick(com.google.android.gms.maps.model.Circle circle);
    }

    /* loaded from: classes8.dex */
    public interface OnGroundOverlayClickListener {
        void onGroundOverlayClick(com.google.android.gms.maps.model.GroundOverlay groundOverlay);
    }

    /* loaded from: classes8.dex */
    public interface OnIndoorStateChangeListener {
        void onIndoorBuildingFocused();

        void onIndoorLevelActivated(com.google.android.gms.maps.model.IndoorBuilding indoorBuilding);
    }

    /* loaded from: classes8.dex */
    public interface OnInfoWindowClickListener {
        void onInfoWindowClick(com.google.android.gms.maps.model.Marker marker);
    }

    /* loaded from: classes8.dex */
    public interface OnInfoWindowCloseListener {
        void onInfoWindowClose(com.google.android.gms.maps.model.Marker marker);
    }

    /* loaded from: classes8.dex */
    public interface OnInfoWindowLongClickListener {
        void onInfoWindowLongClick(com.google.android.gms.maps.model.Marker marker);
    }

    /* loaded from: classes8.dex */
    public interface OnMapCapabilitiesChangedListener {
        void onMapCapabilitiesChanged(com.google.android.gms.maps.model.MapCapabilities mapCapabilities);
    }

    /* loaded from: classes8.dex */
    public interface OnMapClickListener {
        void onMapClick(com.google.android.gms.maps.model.LatLng latLng);
    }

    public interface OnMapLoadedCallback {
        void onMapLoaded();
    }

    /* loaded from: classes8.dex */
    public interface OnMapLongClickListener {
        void onMapLongClick(com.google.android.gms.maps.model.LatLng latLng);
    }

    /* loaded from: classes8.dex */
    public interface OnMarkerClickListener {
        boolean onMarkerClick(com.google.android.gms.maps.model.Marker marker);
    }

    /* loaded from: classes8.dex */
    public interface OnMarkerDragListener {
        void onMarkerDrag(com.google.android.gms.maps.model.Marker marker);

        void onMarkerDragEnd(com.google.android.gms.maps.model.Marker marker);

        void onMarkerDragStart(com.google.android.gms.maps.model.Marker marker);
    }

    /* loaded from: classes8.dex */
    public interface OnMyLocationButtonClickListener {
        boolean onMyLocationButtonClick();
    }

    @java.lang.Deprecated
    /* loaded from: classes8.dex */
    public interface OnMyLocationChangeListener {
        void onMyLocationChange(android.location.Location location);
    }

    /* loaded from: classes8.dex */
    public interface OnMyLocationClickListener {
        void onMyLocationClick(android.location.Location location);
    }

    /* loaded from: classes8.dex */
    public interface OnPoiClickListener {
        void onPoiClick(com.google.android.gms.maps.model.PointOfInterest pointOfInterest);
    }

    /* loaded from: classes8.dex */
    public interface OnPolygonClickListener {
        void onPolygonClick(com.google.android.gms.maps.model.Polygon polygon);
    }

    /* loaded from: classes8.dex */
    public interface OnPolylineClickListener {
        void onPolylineClick(com.google.android.gms.maps.model.Polyline polyline);
    }

    public interface SnapshotReadyCallback {
        void onSnapshotReady(android.graphics.Bitmap bitmap);
    }

    public GoogleMap(com.google.android.gms.maps.internal.IGoogleMapDelegate iGoogleMapDelegate) {
        this.zza = (com.google.android.gms.maps.internal.IGoogleMapDelegate) com.google.android.gms.common.internal.Preconditions.checkNotNull(iGoogleMapDelegate);
    }

    public final com.google.android.gms.maps.model.Circle addCircle(com.google.android.gms.maps.model.CircleOptions circleOptions) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(circleOptions, "CircleOptions must not be null.");
            return new com.google.android.gms.maps.model.Circle(this.zza.addCircle(circleOptions));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.GroundOverlay addGroundOverlay(com.google.android.gms.maps.model.GroundOverlayOptions groundOverlayOptions) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(groundOverlayOptions, "GroundOverlayOptions must not be null.");
            com.google.android.gms.internal.maps.zzx addGroundOverlay = this.zza.addGroundOverlay(groundOverlayOptions);
            if (addGroundOverlay != null) {
                return new com.google.android.gms.maps.model.GroundOverlay(addGroundOverlay);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Marker addMarker(com.google.android.gms.maps.model.MarkerOptions markerOptions) {
        if (markerOptions instanceof com.google.android.gms.maps.model.AdvancedMarkerOptions) {
            markerOptions.zzf(1);
        }
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(markerOptions, "MarkerOptions must not be null.");
            com.google.android.gms.internal.maps.zzaj addMarker = this.zza.addMarker(markerOptions);
            if (addMarker != null) {
                return markerOptions.zzb() == 1 ? new com.google.android.gms.maps.model.AdvancedMarker(addMarker) : new com.google.android.gms.maps.model.Marker(addMarker);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Polygon addPolygon(com.google.android.gms.maps.model.PolygonOptions polygonOptions) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(polygonOptions, "PolygonOptions must not be null");
            return new com.google.android.gms.maps.model.Polygon(this.zza.addPolygon(polygonOptions));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.Polyline addPolyline(com.google.android.gms.maps.model.PolylineOptions polylineOptions) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(polylineOptions, "PolylineOptions must not be null");
            return new com.google.android.gms.maps.model.Polyline(this.zza.addPolyline(polylineOptions));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.TileOverlay addTileOverlay(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(tileOverlayOptions, "TileOverlayOptions must not be null.");
            com.google.android.gms.internal.maps.zzaw addTileOverlay = this.zza.addTileOverlay(tileOverlayOptions);
            if (addTileOverlay != null) {
                return new com.google.android.gms.maps.model.TileOverlay(addTileOverlay);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.animateCamera(cameraUpdate.zza());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.CameraPosition getCameraPosition() {
        try {
            return this.zza.getCameraPosition();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.FeatureLayer getFeatureLayer(com.google.android.gms.maps.model.FeatureLayerOptions featureLayerOptions) {
        java.lang.String featureType = featureLayerOptions.getFeatureType();
        java.lang.String datasetId = featureLayerOptions.getDatasetId();
        boolean equals = featureType.equals(com.google.android.gms.maps.model.FeatureType.DATASET);
        com.google.android.gms.maps.model.FeatureLayer featureLayer = equals ? (com.google.android.gms.maps.model.FeatureLayer) this.zzd.get(datasetId) : (com.google.android.gms.maps.model.FeatureLayer) this.zzd.get(featureType);
        if (featureLayer != null) {
            return featureLayer;
        }
        try {
            com.google.android.gms.maps.model.FeatureLayer featureLayer2 = new com.google.android.gms.maps.model.FeatureLayer(this.zza.getFeatureLayer(featureLayerOptions));
            if (equals) {
                this.zzd.put(datasetId, featureLayer2);
                return featureLayer2;
            }
            this.zzd.put(featureType, featureLayer2);
            return featureLayer2;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.IndoorBuilding getFocusedBuilding() {
        try {
            com.google.android.gms.internal.maps.zzaa focusedBuilding = this.zza.getFocusedBuilding();
            if (focusedBuilding != null) {
                return new com.google.android.gms.maps.model.IndoorBuilding(focusedBuilding);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public com.google.android.gms.maps.model.MapCapabilities getMapCapabilities() {
        if (this.zzb == null) {
            try {
                this.zzb = new com.google.android.gms.maps.model.MapCapabilities(this.zza.getMapCapabilities());
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        }
        return this.zzb;
    }

    @com.google.android.gms.maps.model.MapColorScheme
    public int getMapColorScheme() {
        try {
            return this.zza.getMapColorScheme();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final int getMapType() {
        try {
            return this.zza.getMapType();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getMaxZoomLevel() {
        try {
            return this.zza.getMaxZoomLevel();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final float getMinZoomLevel() {
        try {
            return this.zza.getMinZoomLevel();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @java.lang.Deprecated
    public final android.location.Location getMyLocation() {
        try {
            return this.zza.getMyLocation();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.Projection getProjection() {
        try {
            return new com.google.android.gms.maps.Projection(this.zza.getProjection());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.UiSettings getUiSettings() {
        try {
            if (this.zze == null) {
                this.zze = new com.google.android.gms.maps.UiSettings(this.zza.getUiSettings());
            }
            return this.zze;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isBuildingsEnabled() {
        try {
            return this.zza.isBuildingsEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isIndoorEnabled() {
        try {
            return this.zza.isIndoorEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isMyLocationEnabled() {
        try {
            return this.zza.isMyLocationEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isTrafficEnabled() {
        try {
            return this.zza.isTrafficEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isTransitEnabled() {
        try {
            return this.zza.isTransitEnabled();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void moveCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.moveCamera(cameraUpdate.zza());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void removeOnMapCapabilitiesChangedListener(com.google.android.gms.maps.GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            java.util.Map map = this.zzc;
            if (map.containsKey(onMapCapabilitiesChangedListener)) {
                this.zza.removeOnMapCapabilitiesChangedListener((com.google.android.gms.maps.internal.zzal) map.get(onMapCapabilitiesChangedListener));
                map.remove(onMapCapabilitiesChangedListener);
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean setIndoorEnabled(boolean z) {
        try {
            return this.zza.setIndoorEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setInfoWindowAdapter(com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        try {
            if (infoWindowAdapter == null) {
                this.zza.setInfoWindowAdapter(null);
            } else {
                this.zza.setInfoWindowAdapter(new com.google.android.gms.maps.zzf(this, infoWindowAdapter));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setLocationSource(com.google.android.gms.maps.LocationSource locationSource) {
        try {
            if (locationSource == null) {
                this.zza.setLocationSource(null);
            } else {
                this.zza.setLocationSource(new com.google.android.gms.maps.zzt(this, locationSource));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public boolean setMapStyle(com.google.android.gms.maps.model.MapStyleOptions mapStyleOptions) {
        try {
            return this.zza.setMapStyle(mapStyleOptions);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @java.lang.Deprecated
    public final void setOnCameraChangeListener(com.google.android.gms.maps.GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        try {
            if (onCameraChangeListener == null) {
                this.zza.setOnCameraChangeListener(null);
            } else {
                this.zza.setOnCameraChangeListener(new com.google.android.gms.maps.zzu(this, onCameraChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraIdleListener(com.google.android.gms.maps.GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        try {
            if (onCameraIdleListener == null) {
                this.zza.setOnCameraIdleListener(null);
            } else {
                this.zza.setOnCameraIdleListener(new com.google.android.gms.maps.zzy(this, onCameraIdleListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveCanceledListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        try {
            if (onCameraMoveCanceledListener == null) {
                this.zza.setOnCameraMoveCanceledListener(null);
            } else {
                this.zza.setOnCameraMoveCanceledListener(new com.google.android.gms.maps.zzx(this, onCameraMoveCanceledListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        try {
            if (onCameraMoveListener == null) {
                this.zza.setOnCameraMoveListener(null);
            } else {
                this.zza.setOnCameraMoveListener(new com.google.android.gms.maps.zzw(this, onCameraMoveListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCameraMoveStartedListener(com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        try {
            if (onCameraMoveStartedListener == null) {
                this.zza.setOnCameraMoveStartedListener(null);
            } else {
                this.zza.setOnCameraMoveStartedListener(new com.google.android.gms.maps.zzv(this, onCameraMoveStartedListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnCircleClickListener(com.google.android.gms.maps.GoogleMap.OnCircleClickListener onCircleClickListener) {
        try {
            if (onCircleClickListener == null) {
                this.zza.setOnCircleClickListener(null);
            } else {
                this.zza.setOnCircleClickListener(new com.google.android.gms.maps.zzn(this, onCircleClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnGroundOverlayClickListener(com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        try {
            if (onGroundOverlayClickListener == null) {
                this.zza.setOnGroundOverlayClickListener(null);
            } else {
                this.zza.setOnGroundOverlayClickListener(new com.google.android.gms.maps.zzm(this, onGroundOverlayClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnIndoorStateChangeListener(com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        try {
            if (onIndoorStateChangeListener == null) {
                this.zza.setOnIndoorStateChangeListener(null);
            } else {
                this.zza.setOnIndoorStateChangeListener(new com.google.android.gms.maps.zzk(this, onIndoorStateChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnInfoWindowClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        try {
            if (onInfoWindowClickListener == null) {
                this.zza.setOnInfoWindowClickListener(null);
            } else {
                this.zza.setOnInfoWindowClickListener(new com.google.android.gms.maps.zzc(this, onInfoWindowClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnInfoWindowCloseListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        try {
            if (onInfoWindowCloseListener == null) {
                this.zza.setOnInfoWindowCloseListener(null);
            } else {
                this.zza.setOnInfoWindowCloseListener(new com.google.android.gms.maps.zze(this, onInfoWindowCloseListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnInfoWindowLongClickListener(com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        try {
            if (onInfoWindowLongClickListener == null) {
                this.zza.setOnInfoWindowLongClickListener(null);
            } else {
                this.zza.setOnInfoWindowLongClickListener(new com.google.android.gms.maps.zzd(this, onInfoWindowLongClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMapClickListener(com.google.android.gms.maps.GoogleMap.OnMapClickListener onMapClickListener) {
        try {
            if (onMapClickListener == null) {
                this.zza.setOnMapClickListener(null);
            } else {
                this.zza.setOnMapClickListener(new com.google.android.gms.maps.zzz(this, onMapClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setOnMapLoadedCallback(com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        try {
            if (onMapLoadedCallback == null) {
                this.zza.setOnMapLoadedCallback(null);
            } else {
                this.zza.setOnMapLoadedCallback(new com.google.android.gms.maps.zzj(this, onMapLoadedCallback));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMapLongClickListener(com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        try {
            if (onMapLongClickListener == null) {
                this.zza.setOnMapLongClickListener(null);
            } else {
                this.zza.setOnMapLongClickListener(new com.google.android.gms.maps.zzaa(this, onMapLongClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMarkerClickListener(com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        try {
            if (onMarkerClickListener == null) {
                this.zza.setOnMarkerClickListener(null);
            } else {
                this.zza.setOnMarkerClickListener(new com.google.android.gms.maps.zza(this, onMarkerClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMarkerDragListener(com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        try {
            if (onMarkerDragListener == null) {
                this.zza.setOnMarkerDragListener(null);
            } else {
                this.zza.setOnMarkerDragListener(new com.google.android.gms.maps.zzb(this, onMarkerDragListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMyLocationButtonClickListener(com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        try {
            if (onMyLocationButtonClickListener == null) {
                this.zza.setOnMyLocationButtonClickListener(null);
            } else {
                this.zza.setOnMyLocationButtonClickListener(new com.google.android.gms.maps.zzh(this, onMyLocationButtonClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @java.lang.Deprecated
    public final void setOnMyLocationChangeListener(com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        try {
            if (onMyLocationChangeListener == null) {
                this.zza.setOnMyLocationChangeListener(null);
            } else {
                this.zza.setOnMyLocationChangeListener(new com.google.android.gms.maps.zzg(this, onMyLocationChangeListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnMyLocationClickListener(com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        try {
            if (onMyLocationClickListener == null) {
                this.zza.setOnMyLocationClickListener(null);
            } else {
                this.zza.setOnMyLocationClickListener(new com.google.android.gms.maps.zzi(this, onMyLocationClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnPoiClickListener(com.google.android.gms.maps.GoogleMap.OnPoiClickListener onPoiClickListener) {
        try {
            if (onPoiClickListener == null) {
                this.zza.setOnPoiClickListener(null);
            } else {
                this.zza.setOnPoiClickListener(new com.google.android.gms.maps.zzr(this, onPoiClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnPolygonClickListener(com.google.android.gms.maps.GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        try {
            if (onPolygonClickListener == null) {
                this.zza.setOnPolygonClickListener(null);
            } else {
                this.zza.setOnPolygonClickListener(new com.google.android.gms.maps.zzo(this, onPolygonClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setOnPolylineClickListener(com.google.android.gms.maps.GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        try {
            if (onPolylineClickListener == null) {
                this.zza.setOnPolylineClickListener(null);
            } else {
                this.zza.setOnPolylineClickListener(new com.google.android.gms.maps.zzp(this, onPolylineClickListener));
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void snapshot(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(snapshotReadyCallback, "Callback must not be null.");
        snapshot(snapshotReadyCallback, null);
    }

    public final void clear() {
        try {
            this.zza.clear();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void resetMinMaxZoomPreference() {
        try {
            this.zza.resetMinMaxZoomPreference();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setBuildingsEnabled(boolean z) {
        try {
            this.zza.setBuildingsEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setContentDescription(java.lang.String str) {
        try {
            this.zza.setContentDescription(str);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setLatLngBoundsForCameraTarget(com.google.android.gms.maps.model.LatLngBounds latLngBounds) {
        try {
            this.zza.setLatLngBoundsForCameraTarget(latLngBounds);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setMapColorScheme(@com.google.android.gms.maps.model.MapColorScheme int i) {
        try {
            this.zza.setMapColorScheme(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMapType(int i) {
        try {
            this.zza.setMapType(i);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setMaxZoomPreference(float f) {
        try {
            this.zza.setMaxZoomPreference(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public void setMinZoomPreference(float f) {
        try {
            this.zza.setMinZoomPreference(f);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setMyLocationEnabled(boolean z) {
        try {
            this.zza.setMyLocationEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setPadding(int i, int i2, int i3, int i4) {
        try {
            this.zza.setPadding(i, i2, i3, i4);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTrafficEnabled(boolean z) {
        try {
            this.zza.setTrafficEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setTransitEnabled(boolean z) {
        try {
            this.zza.setTransitEnabled(z);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void stopAnimation() {
        try {
            this.zza.stopAnimation();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void snapshot(com.google.android.gms.maps.GoogleMap.SnapshotReadyCallback snapshotReadyCallback, android.graphics.Bitmap bitmap) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(snapshotReadyCallback, "Callback must not be null.");
        try {
            this.zza.snapshot(new com.google.android.gms.maps.zzq(this, snapshotReadyCallback), (com.google.android.gms.dynamic.ObjectWrapper) (bitmap != null ? com.google.android.gms.dynamic.ObjectWrapper.wrap(bitmap) : null));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void addOnMapCapabilitiesChangedListener(com.google.android.gms.maps.GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        try {
            com.google.android.gms.maps.zzs zzsVar = new com.google.android.gms.maps.zzs(this, onMapCapabilitiesChangedListener);
            this.zzc.put(onMapCapabilitiesChangedListener, zzsVar);
            this.zza.addOnMapCapabilitiesChangedListener(zzsVar);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate, int i, com.google.android.gms.maps.GoogleMap.CancelableCallback cancelableCallback) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.animateCameraWithDurationAndCallback(cameraUpdate.zza(), i, cancelableCallback == null ? null : new com.google.android.gms.maps.zzab(cancelableCallback));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void animateCamera(com.google.android.gms.maps.CameraUpdate cameraUpdate, com.google.android.gms.maps.GoogleMap.CancelableCallback cancelableCallback) {
        try {
            com.google.android.gms.common.internal.Preconditions.checkNotNull(cameraUpdate, "CameraUpdate must not be null.");
            this.zza.animateCameraWithCallback(cameraUpdate.zza(), cancelableCallback == null ? null : new com.google.android.gms.maps.zzab(cancelableCallback));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
