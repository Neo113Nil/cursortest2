package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzz extends com.google.android.gms.maps.internal.zzam {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapClickListener zza;

    zzz(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapClickListener onMapClickListener) {
        this.zza = onMapClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzan
    public final void zzb(com.google.android.gms.maps.model.LatLng latLng) {
        this.zza.onMapClick(latLng);
    }
}
