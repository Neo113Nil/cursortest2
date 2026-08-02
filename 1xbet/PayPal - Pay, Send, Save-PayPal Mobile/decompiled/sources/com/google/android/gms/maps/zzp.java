package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzp extends com.google.android.gms.maps.internal.zzbi {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPolylineClickListener zza;

    zzp(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPolylineClickListener onPolylineClickListener) {
        this.zza = onPolylineClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzbj
    public final void zzb(com.google.android.gms.internal.maps.zzar zzarVar) {
        this.zza.onPolylineClick(new com.google.android.gms.maps.model.Polyline(zzarVar));
    }
}
