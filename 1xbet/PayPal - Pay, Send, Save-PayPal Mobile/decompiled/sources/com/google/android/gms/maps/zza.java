package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zza extends com.google.android.gms.maps.internal.zzau {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMarkerClickListener zza;

    zza(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener onMarkerClickListener) {
        this.zza = onMarkerClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzav
    public final boolean zzb(com.google.android.gms.internal.maps.zzaj zzajVar) {
        return this.zza.onMarkerClick(new com.google.android.gms.maps.model.Marker(zzajVar));
    }
}
