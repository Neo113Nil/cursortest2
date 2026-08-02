package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzao extends com.google.android.gms.maps.internal.zzbs {
    final /* synthetic */ com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback zza;

    zzao(com.google.android.gms.maps.zzap zzapVar, com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zza = onStreetViewPanoramaReadyCallback;
        java.util.Objects.requireNonNull(zzapVar);
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws android.os.RemoteException {
        this.zza.onStreetViewPanoramaReady(new com.google.android.gms.maps.StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
