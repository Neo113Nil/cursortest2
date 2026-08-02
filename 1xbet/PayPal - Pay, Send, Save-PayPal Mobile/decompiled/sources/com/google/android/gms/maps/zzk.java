package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzk extends com.google.android.gms.maps.internal.zzaa {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener zza;

    zzk(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnIndoorStateChangeListener onIndoorStateChangeListener) {
        this.zza = onIndoorStateChangeListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzb() {
        this.zza.onIndoorBuildingFocused();
    }

    @Override // com.google.android.gms.maps.internal.zzab
    public final void zzc(com.google.android.gms.internal.maps.zzaa zzaaVar) {
        this.zza.onIndoorLevelActivated(new com.google.android.gms.maps.model.IndoorBuilding(zzaaVar));
    }
}
