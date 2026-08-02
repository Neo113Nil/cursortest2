package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public interface IMapViewDelegate extends android.os.IInterface {
    com.google.android.gms.maps.internal.IGoogleMapDelegate getMap() throws android.os.RemoteException;

    void getMapAsync(com.google.android.gms.maps.internal.zzat zzatVar) throws android.os.RemoteException;

    com.google.android.gms.dynamic.IObjectWrapper getView() throws android.os.RemoteException;

    void onCreate(android.os.Bundle bundle) throws android.os.RemoteException;

    void onDestroy() throws android.os.RemoteException;

    void onEnterAmbient(android.os.Bundle bundle) throws android.os.RemoteException;

    void onExitAmbient() throws android.os.RemoteException;

    void onLowMemory() throws android.os.RemoteException;

    void onPause() throws android.os.RemoteException;

    void onResume() throws android.os.RemoteException;

    void onSaveInstanceState(android.os.Bundle bundle) throws android.os.RemoteException;

    void onStart() throws android.os.RemoteException;

    void onStop() throws android.os.RemoteException;
}
