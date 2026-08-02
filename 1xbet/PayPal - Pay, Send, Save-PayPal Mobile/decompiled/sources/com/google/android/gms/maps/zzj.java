package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzj extends com.google.android.gms.maps.internal.zzao {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback zza;

    zzj(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback onMapLoadedCallback) {
        this.zza = onMapLoadedCallback;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzap
    public final void zzb() throws android.os.RemoteException {
        this.zza.onMapLoaded();
    }
}
