package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zze extends com.google.android.gms.maps.internal.zzae {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener zza;

    zze(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnInfoWindowCloseListener onInfoWindowCloseListener) {
        this.zza = onInfoWindowCloseListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzaf
    public final void zzb(com.google.android.gms.internal.maps.zzaj zzajVar) {
        this.zza.onInfoWindowClose(new com.google.android.gms.maps.model.Marker(zzajVar));
    }
}
