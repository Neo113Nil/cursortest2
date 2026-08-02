package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public interface IStreetViewPanoramaFragmentDelegate extends android.os.IInterface {
    com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate getStreetViewPanorama() throws android.os.RemoteException;

    void getStreetViewPanoramaAsync(com.google.android.gms.maps.internal.zzbt zzbtVar) throws android.os.RemoteException;

    boolean isReady() throws android.os.RemoteException;

    void onCreate(android.os.Bundle bundle) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper onCreateView(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper2, android.os.Bundle bundle) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onDestroyView() throws android.os.RemoteException;

    void onInflate(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper, com.google.android.gms.maps.StreetViewPanoramaOptions streetViewPanoramaOptions, android.os.Bundle bundle) throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;
}
