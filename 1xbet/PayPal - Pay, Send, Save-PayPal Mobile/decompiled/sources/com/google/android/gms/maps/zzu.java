package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzu extends com.google.android.gms.maps.internal.zzm {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraChangeListener zza;

    zzu(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraChangeListener onCameraChangeListener) {
        this.zza = onCameraChangeListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzn
    public final void zzb(com.google.android.gms.maps.model.CameraPosition cameraPosition) {
        this.zza.onCameraChange(cameraPosition);
    }
}
