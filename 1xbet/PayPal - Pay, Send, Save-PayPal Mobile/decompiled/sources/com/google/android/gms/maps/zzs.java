package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzs extends com.google.android.gms.maps.internal.zzak {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapCapabilitiesChangedListener zza;

    zzs(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapCapabilitiesChangedListener onMapCapabilitiesChangedListener) {
        this.zza = onMapCapabilitiesChangedListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzal
    public final void zzb(com.google.android.gms.internal.maps.zzag zzagVar) {
        this.zza.onMapCapabilitiesChanged(new com.google.android.gms.maps.model.MapCapabilities(zzagVar));
    }
}
