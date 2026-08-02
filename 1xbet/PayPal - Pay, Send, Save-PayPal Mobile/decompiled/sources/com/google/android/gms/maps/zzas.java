package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzas extends com.google.android.gms.maps.internal.zzbs {
    final /* synthetic */ com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback zza;

    zzas(com.google.android.gms.maps.zzat zzatVar, com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zza = onStreetViewPanoramaReadyCallback;
        java.util.Objects.requireNonNull(zzatVar);
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws android.os.RemoteException {
        this.zza.onStreetViewPanoramaReady(new com.google.android.gms.maps.StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
