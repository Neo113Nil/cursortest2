package com.google.android.gms.maps;

/* loaded from: classes8.dex */
public final class Projection {
    private final com.google.android.gms.maps.internal.IProjectionDelegate zza;

    public final com.google.android.gms.maps.model.LatLng fromScreenLocation(android.graphics.Point point) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(point);
        try {
            return this.zza.fromScreenLocation(com.google.android.gms.dynamic.ObjectWrapper.wrap(point));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.VisibleRegion getVisibleRegion() {
        try {
            return this.zza.getVisibleRegion();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final android.graphics.Point toScreenLocation(com.google.android.gms.maps.model.LatLng latLng) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(latLng);
        try {
            return (android.graphics.Point) com.google.android.gms.dynamic.ObjectWrapper.unwrap(this.zza.toScreenLocation(latLng));
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    Projection(com.google.android.gms.maps.internal.IProjectionDelegate iProjectionDelegate) {
        this.zza = iProjectionDelegate;
    }
}
