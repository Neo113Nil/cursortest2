package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzbu extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.IProjectionDelegate {
    zzbu(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IProjectionDelegate");
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.maps.model.LatLng fromScreenLocation(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzg(zza, iObjectWrapper);
        android.os.Parcel zzJ = zzJ(1, zza);
        com.google.android.gms.maps.model.LatLng latLng = (com.google.android.gms.maps.model.LatLng) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.LatLng.CREATOR);
        zzJ.recycle();
        return latLng;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(3, zza());
        com.google.android.gms.maps.model.VisibleRegion visibleRegion = (com.google.android.gms.maps.model.VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.VisibleRegion.CREATOR);
        zzJ.recycle();
        return visibleRegion;
    }

    @Override // com.google.android.gms.maps.internal.IProjectionDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        android.os.Parcel zzJ = zzJ(2, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }
}
