package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzw extends com.google.android.gms.maps.internal.zzs {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraMoveListener zza;

    zzw(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraMoveListener onCameraMoveListener) {
        this.zza = onCameraMoveListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzt
    public final void zzb() {
        this.zza.onCameraMove();
    }
}
