package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzaa extends com.google.android.gms.maps.internal.zzaq {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapLongClickListener zza;

    zzaa(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLongClickListener onMapLongClickListener) {
        this.zza = onMapLongClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzar
    public final void zzb(com.google.android.gms.maps.model.LatLng latLng) {
        this.zza.onMapLongClick(latLng);
    }
}
