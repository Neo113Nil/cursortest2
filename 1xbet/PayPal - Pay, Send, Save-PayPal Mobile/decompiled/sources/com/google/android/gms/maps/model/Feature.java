package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public abstract class Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    static com.google.android.gms.maps.model.Feature zza(com.google.android.gms.internal.maps.zzr zzrVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzrVar);
        try {
            int zzd = zzrVar.zzd();
            if (zzd == 1) {
                return new com.google.android.gms.maps.model.PlaceFeature(zzrVar);
            }
            if (zzd == 2) {
                return new com.google.android.gms.maps.model.DatasetFeature(zzrVar);
            }
            return null;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @com.google.android.gms.maps.model.FeatureType
    public java.lang.String getFeatureType() {
        try {
            return this.zza.zzf();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    Feature(com.google.android.gms.internal.maps.zzr zzrVar) {
        this.zza = zzrVar;
    }
}
