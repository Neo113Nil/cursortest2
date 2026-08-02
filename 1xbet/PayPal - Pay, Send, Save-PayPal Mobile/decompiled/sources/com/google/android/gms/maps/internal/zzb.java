package com.google.android.gms.maps.internal;

/* loaded from: classes8.dex */
public final class zzb extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate {
    zzb(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newCameraPosition(com.google.android.gms.maps.model.CameraPosition cameraPosition) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, cameraPosition);
        android.os.Parcel zzJ = zzJ(7, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLng(com.google.android.gms.maps.model.LatLng latLng) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        android.os.Parcel zzJ = zzJ(8, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLngBounds(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLngBounds);
        zza.writeInt(i);
        android.os.Parcel zzJ = zzJ(10, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLngBoundsWithSize(com.google.android.gms.maps.model.LatLngBounds latLngBounds, int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLngBounds);
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        android.os.Parcel zzJ = zzJ(11, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper newLatLngZoom(com.google.android.gms.maps.model.LatLng latLng, float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zze(zza, latLng);
        zza.writeFloat(f);
        android.os.Parcel zzJ = zzJ(9, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper scrollBy(float f, float f2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeFloat(f2);
        android.os.Parcel zzJ = zzJ(3, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomBy(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        android.os.Parcel zzJ = zzJ(5, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomByWithFocus(float f, int i, int i2) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        zza.writeInt(i);
        zza.writeInt(i2);
        android.os.Parcel zzJ = zzJ(6, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomIn() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(1, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomOut() throws android.os.RemoteException {
        android.os.Parcel zzJ = zzJ(2, zza());
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }

    @Override // com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate
    public final com.google.android.gms.dynamic.IObjectWrapper zoomTo(float f) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeFloat(f);
        android.os.Parcel zzJ = zzJ(4, zza);
        com.google.android.gms.dynamic.IObjectWrapper asInterface = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(zzJ.readStrongBinder());
        zzJ.recycle();
        return asInterface;
    }
}
