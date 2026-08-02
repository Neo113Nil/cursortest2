package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzg extends com.google.android.gms.maps.internal.zzba {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener zza;

    zzg(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationChangeListener onMyLocationChangeListener) {
        this.zza = onMyLocationChangeListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzbb
    public final void zzb(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        this.zza.onMyLocationChange((android.location.Location) com.google.android.gms.dynamic.ObjectWrapper.unwrap(iObjectWrapper));
    }
}
