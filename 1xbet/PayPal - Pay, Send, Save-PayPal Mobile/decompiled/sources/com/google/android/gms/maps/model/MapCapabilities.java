package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class MapCapabilities {
    private final com.google.android.gms.internal.maps.zzag zza;

    public MapCapabilities(com.google.android.gms.internal.maps.zzag zzagVar) {
        this.zza = (com.google.android.gms.internal.maps.zzag) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzagVar);
    }

    public final boolean isAdvancedMarkersAvailable() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isDataDrivenStylingAvailable() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
