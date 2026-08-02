package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzx extends com.google.android.gms.maps.internal.zzq {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener zza;

    zzx(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraMoveCanceledListener onCameraMoveCanceledListener) {
        this.zza = onCameraMoveCanceledListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzr
    public final void zzb() {
        this.zza.onCameraMoveCanceled();
    }
}
