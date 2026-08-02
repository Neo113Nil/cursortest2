package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public interface IStreetViewPanoramaDelegate extends android.os.IInterface {
    void animateTo(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera, long j) throws android.os.RemoteException;

    void enablePanning(boolean z) throws android.os.RemoteException;

    void enableStreetNames(boolean z) throws android.os.RemoteException;

    void enableUserNavigation(boolean z) throws android.os.RemoteException;

    void enableZoom(boolean z) throws android.os.RemoteException;

    com.google.android.gms.maps.model.StreetViewPanoramaCamera getPanoramaCamera() throws android.os.RemoteException;

    com.google.android.gms.maps.model.StreetViewPanoramaLocation getStreetViewPanoramaLocation() throws android.os.RemoteException;

    boolean isPanningGesturesEnabled() throws android.os.RemoteException;

    boolean isStreetNamesEnabled() throws android.os.RemoteException;

    boolean isUserNavigationEnabled() throws android.os.RemoteException;

    boolean isZoomGesturesEnabled() throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper orientationToPoint(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) throws android.os.RemoteException;

    com.google.android.gms.maps.model.StreetViewPanoramaOrientation pointToOrientation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    void setOnStreetViewPanoramaCameraChangeListener(com.google.android.gms.maps.internal.zzbl zzblVar) throws android.os.RemoteException;

    void setOnStreetViewPanoramaChangeListener(com.google.android.gms.maps.internal.zzbn zzbnVar) throws android.os.RemoteException;

    void setOnStreetViewPanoramaClickListener(com.google.android.gms.maps.internal.zzbp zzbpVar) throws android.os.RemoteException;

    void setOnStreetViewPanoramaLongClickListener(com.google.android.gms.maps.internal.zzbr zzbrVar) throws android.os.RemoteException;

    void setPosition(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException;

    void setPositionWithID(java.lang.String str) throws android.os.RemoteException;

    void setPositionWithRadius(com.google.android.gms.maps.model.LatLng latLng, int i) throws android.os.RemoteException;

    void setPositionWithRadiusAndSource(com.google.android.gms.maps.model.LatLng latLng, int i, com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException;

    void setPositionWithSource(com.google.android.gms.maps.model.LatLng latLng, com.google.android.gms.maps.model.StreetViewSource streetViewSource) throws android.os.RemoteException;
}
