package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzt extends com.google.android.gms.maps.internal.zzj {
    final /* synthetic */ com.google.android.gms.maps.LocationSource zza;

    zzt(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.LocationSource locationSource) {
        this.zza = locationSource;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void activate(com.google.android.gms.maps.internal.zzaj zzajVar) {
        this.zza.activate(new com.google.android.gms.maps.zzl(this, zzajVar));
    }

    @Override // com.google.android.gms.maps.internal.ILocationSourceDelegate
    public final void deactivate() {
        this.zza.deactivate();
    }
}
