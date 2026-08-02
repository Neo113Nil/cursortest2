package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class FeatureClickEvent {
    private final com.google.android.gms.internal.maps.zzo zza;

    public FeatureClickEvent(com.google.android.gms.internal.maps.zzo zzoVar) {
        this.zza = (com.google.android.gms.internal.maps.zzo) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzoVar);
    }

    public final java.util.List<com.google.android.gms.maps.model.Feature> getFeatures() {
        try {
            java.util.List zze = this.zza.zze();
            java.util.ArrayList arrayList = new java.util.ArrayList(zze.size());
            java.util.Iterator it = zze.iterator();
            while (it.hasNext()) {
                com.google.android.gms.maps.model.Feature zza = com.google.android.gms.maps.model.Feature.zza(com.google.android.gms.internal.maps.zzq.zzb((android.os.IBinder) it.next()));
                if (zza != null) {
                    arrayList.add(zza);
                }
            }
            return arrayList;
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.LatLng getLatLng() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }
}
