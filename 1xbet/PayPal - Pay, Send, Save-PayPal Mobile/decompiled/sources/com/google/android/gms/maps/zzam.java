package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzam extends com.google.android.gms.maps.internal.zzbo {
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener zza;

    zzam(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaClickListener onStreetViewPanoramaClickListener) {
        this.zza = onStreetViewPanoramaClickListener;
        java.util.Objects.requireNonNull(streetViewPanorama);
    }

    @Override // com.google.android.gms.maps.internal.zzbp
    public final void zzb(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zza.onStreetViewPanoramaClick(streetViewPanoramaOrientation);
    }
}
