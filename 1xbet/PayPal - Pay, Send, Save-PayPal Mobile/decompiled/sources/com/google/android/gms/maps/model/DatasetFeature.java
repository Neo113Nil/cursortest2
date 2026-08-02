package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class DatasetFeature extends com.google.android.gms.maps.model.Feature {
    private final com.google.android.gms.internal.maps.zzr zza;

    public DatasetFeature(com.google.android.gms.internal.maps.zzr zzrVar) {
        super(zzrVar);
        this.zza = zzrVar;
    }

    public final java.util.Map<java.lang.String, java.lang.String> getDatasetAttributes() {
        try {
            return com.google.android.gms.internal.maps.zzbl.zzc(this.zza.zzh().entrySet());
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final java.lang.String getDatasetId() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
