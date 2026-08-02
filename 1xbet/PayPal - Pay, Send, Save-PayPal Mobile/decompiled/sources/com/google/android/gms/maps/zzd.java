package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzd extends com.google.android.gms.maps.internal.zzag {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener zza;

    zzd(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener) {
        this.zza = onInfoWindowLongClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzah
    public final void zzb(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza.onInfoWindowLongClick(new com.google.android.gms.maps.model.Marker(zzajVar));
    }
}
