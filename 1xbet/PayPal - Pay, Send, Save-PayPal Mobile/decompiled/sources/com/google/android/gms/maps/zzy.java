package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzy extends com.google.android.gms.maps.internal.zzo {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraIdleListener zza;

    zzy(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraIdleListener onCameraIdleListener) {
        this.zza = onCameraIdleListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzp
    public final void zzb() {
        this.zza.onCameraIdle();
    }
}
