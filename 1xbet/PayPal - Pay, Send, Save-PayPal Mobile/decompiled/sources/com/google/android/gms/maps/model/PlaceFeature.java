package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class PlaceFeature extends com.google.android.gms.maps.model.Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public PlaceFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    public final java.lang.String getPlaceId() {
        try {
            return this.zza.zzg();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
