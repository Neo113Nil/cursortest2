package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
final class zzd extends com.google.android.gms.internal.maps.zzas {
    final /* synthetic */ com.google.android.gms.maps.model.FeatureLayer.StyleFactory zza;

    zzd(com.google.android.gms.maps.model.FeatureLayer featureLayer, com.google.android.gms.maps.model.FeatureLayer.StyleFactory styleFactory) {
        this.zza = styleFactory;
        java.util.Objects.requireNonNull(featureLayer);
    }

    @Override // com.google.android.gms.internal.maps.zzat
    public final com.google.android.gms.maps.model.FeatureStyle zzb(com.google.android.gms.internal.maps.zzr zzrVar) {
        com.google.android.gms.maps.model.Feature zza = com.google.android.gms.maps.model.Feature.zza(zzrVar);
        if (zza == null) {
            return null;
        }
        return this.zza.getStyle(zza);
    }
}
