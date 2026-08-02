package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzal extends com.google.android.gms.maps.internal.zzbk {
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener zza;

    zzal(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaCameraChangeListener onStreetViewPanoramaCameraChangeListener) {
        this.zza = onStreetViewPanoramaCameraChangeListener;
        java.util.Objects.requireNonNull(streetViewPanorama);
    }

    @Override // com.google.android.gms.maps.internal.zzbl
    public final void zzb(com.google.android.gms.maps.model.StreetViewPanoramaCamera streetViewPanoramaCamera) {
        this.zza.onStreetViewPanoramaCameraChange(streetViewPanoramaCamera);
    }
}
