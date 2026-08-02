package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzb extends com.google.android.gms.maps.internal.zzaw {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMarkerDragListener zza;

    zzb(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMarkerDragListener onMarkerDragListener) {
        this.zza = onMarkerDragListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zzb(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza.onMarkerDrag(new com.google.android.gms.maps.model.Marker(zzajVar));
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zzc(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza.onMarkerDragEnd(new com.google.android.gms.maps.model.Marker(zzajVar));
    }

    @Override // com.google.android.gms.maps.internal.zzax
    public final void zzd(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza.onMarkerDragStart(new com.google.android.gms.maps.model.Marker(zzajVar));
    }
}
