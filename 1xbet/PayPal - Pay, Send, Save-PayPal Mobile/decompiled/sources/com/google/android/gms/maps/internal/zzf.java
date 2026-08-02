package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public interface zzf extends android.os.IInterface {
    int zzd() throws android.os.RemoteException;

    com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate zze() throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IMapFragmentDelegate zzf(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IMapViewDelegate zzg(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.GoogleMapOptions googleMapOptions) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate zzh(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;

    com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate zzi(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions) throws android.os.RemoteException;

    com.google.android.gms.internal.maps.zzk zzj() throws android.os.RemoteException;

    void zzk(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, java.lang.String str) throws android.os.RemoteException;

    void zzl(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException;

    void zzm(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, int i) throws android.os.RemoteException;

    void zzn(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException;
}
