package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public final class FeatureLayer {
    private final com.google.android.gms.internal.maps.zzu zza;
    private com.google.android.gms.maps.model.FeatureLayer.StyleFactory zzb;
    private final java.util.Map zzc = new java.util.HashMap();

    public interface OnFeatureClickListener {
        void onFeatureClick(com.google.android.gms.maps.model.FeatureClickEvent featureClickEvent);
    }

    public interface StyleFactory {
        com.google.android.gms.maps.model.FeatureStyle getStyle(com.google.android.gms.maps.model.Feature feature);
    }

    public FeatureLayer(com.google.android.gms.internal.maps.zzu zzuVar) {
        this.zza = (com.google.android.gms.internal.maps.zzu) com.google.android.gms.common.internal.Preconditions.checkNotNull(zzuVar);
    }

    public final java.lang.String getDatasetId() {
        try {
            return this.zza.zzd();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    @com.google.android.gms.maps.model.FeatureType
    public final java.lang.String getFeatureType() {
        try {
            return this.zza.zze();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final boolean isAvailable() {
        try {
            return this.zza.zzi();
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void removeOnFeatureClickListener(com.google.android.gms.maps.model.FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        try {
            java.util.Map map = this.zzc;
            if (map.containsKey(onFeatureClickListener)) {
                this.zza.zzg((com.google.android.gms.internal.maps.zzal) map.get(onFeatureClickListener));
                map.remove(onFeatureClickListener);
            }
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final void setFeatureStyle(com.google.android.gms.maps.model.FeatureLayer.StyleFactory styleFactory) {
        this.zzb = styleFactory;
        if (styleFactory == null) {
            try {
                this.zza.zzh(null);
            } catch (android.os.RemoteException e) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
            }
        } else {
            try {
                this.zza.zzh(new com.google.android.gms.maps.model.zzd(this, styleFactory));
            } catch (android.os.RemoteException e2) {
                throw new com.google.android.gms.maps.model.RuntimeRemoteException(e2);
            }
        }
    }

    public final void addOnFeatureClickListener(com.google.android.gms.maps.model.FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        try {
            com.google.android.gms.maps.model.zze zzeVar = new com.google.android.gms.maps.model.zze(this, onFeatureClickListener);
            this.zzc.put(onFeatureClickListener, zzeVar);
            this.zza.zzf(zzeVar);
        } catch (android.os.RemoteException e) {
            throw new com.google.android.gms.maps.model.RuntimeRemoteException(e);
        }
    }

    public final com.google.android.gms.maps.model.FeatureLayer.StyleFactory getFeatureStyle() {
        return this.zzb;
    }
}
