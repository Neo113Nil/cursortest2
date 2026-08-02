package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzo extends com.google.android.gms.internal.maps.zza implements android.os.IInterface {
    zzo(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IFeatureClickEventDelegate");
    }

    public final com.google.android.gms.maps.model.LatLng zzd() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    public final java.util.List zze() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        java.util.ArrayList<android.os.IBinder> createBinderArrayList = zzJ.createBinderArrayList();
        zzJ.recycle();
        return createBinderArrayList;
    }
}
