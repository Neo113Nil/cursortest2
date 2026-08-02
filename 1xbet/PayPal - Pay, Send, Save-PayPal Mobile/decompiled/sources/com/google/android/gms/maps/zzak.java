package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzak extends com.google.android.gms.maps.internal.zzbm {
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener zza;

    zzak(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaChangeListener onStreetViewPanoramaChangeListener) {
        this.zza = onStreetViewPanoramaChangeListener;
        java.util.Objects.requireNonNull(streetViewPanorama);
    }

    @Override // com.google.android.gms.maps.internal.zzbn
    public final void zzb(com.google.android.gms.maps.model.StreetViewPanoramaLocation streetViewPanoramaLocation) {
        this.zza.onStreetViewPanoramaChange(streetViewPanoramaLocation);
    }
}
