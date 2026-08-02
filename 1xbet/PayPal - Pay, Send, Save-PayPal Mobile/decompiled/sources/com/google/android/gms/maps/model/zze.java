package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
final class zze extends com.google.android.gms.internal.maps.zzak {
    final /* synthetic */ com.google.android.gms.maps.model.FeatureLayer.OnFeatureClickListener zza;

    zze(com.google.android.gms.maps.model.FeatureLayer featureLayer, com.google.android.gms.maps.model.FeatureLayer.OnFeatureClickListener onFeatureClickListener) {
        this.zza = onFeatureClickListener;
        java.util.Objects.requireNonNull(featureLayer);
    }

    @Override // com.google.android.gms.internal.maps.zzal
    public final void zzb(com.google.android.gms.internal.maps.zzo zzoVar) {
        this.zza.onFeatureClick(new com.google.android.gms.maps.model.FeatureClickEvent(zzoVar));
    }
}
