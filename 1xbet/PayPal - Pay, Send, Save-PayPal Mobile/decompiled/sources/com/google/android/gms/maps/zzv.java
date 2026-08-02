package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzv extends com.google.android.gms.maps.internal.zzu {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener zza;

    zzv(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCameraMoveStartedListener onCameraMoveStartedListener) {
        this.zza = onCameraMoveStartedListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzv
    public final void zzb(int i) {
        this.zza.onCameraMoveStarted(i);
    }
}
