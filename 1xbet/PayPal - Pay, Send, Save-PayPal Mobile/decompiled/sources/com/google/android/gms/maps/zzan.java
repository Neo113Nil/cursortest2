package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzan extends com.google.android.gms.maps.internal.zzbq {
    final /* synthetic */ com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener zza;

    zzan(com.google.android.gms.maps.StreetViewPanorama streetViewPanorama, com.google.android.gms.maps.StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener) {
        this.zza = onStreetViewPanoramaLongClickListener;
        java.util.Objects.requireNonNull(streetViewPanorama);
    }

    @Override // com.google.android.gms.maps.internal.zzbr
    public final void zzb(com.google.android.gms.maps.model.StreetViewPanoramaOrientation streetViewPanoramaOrientation) {
        this.zza.onStreetViewPanoramaLongClick(streetViewPanoramaOrientation);
    }
}
