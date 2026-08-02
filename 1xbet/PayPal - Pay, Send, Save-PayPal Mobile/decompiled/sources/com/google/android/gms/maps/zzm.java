package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzm extends com.google.android.gms.maps.internal.zzy {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener zza;

    zzm(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnGroundOverlayClickListener onGroundOverlayClickListener) {
        this.zza = onGroundOverlayClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzz
    public final void zzb(com.google.android.gms.internal.maps.zzx zzxVar) {
        this.zza.onGroundOverlayClick(new com.google.android.gms.maps.model.GroundOverlay(zzxVar));
    }
}
