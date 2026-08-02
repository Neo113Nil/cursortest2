package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzc extends com.google.android.gms.maps.internal.zzac {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener zza;

    zzc(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener onInfoWindowClickListener) {
        this.zza = onInfoWindowClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzad
    public final void zzb(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza.onInfoWindowClick(new com.google.android.gms.maps.model.Marker(zzajVar));
    }
}
