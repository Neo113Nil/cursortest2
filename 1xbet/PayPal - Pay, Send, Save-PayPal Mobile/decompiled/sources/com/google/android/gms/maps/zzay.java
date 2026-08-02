package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzay extends com.google.android.gms.maps.internal.zzbs {
    final /* synthetic */ com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback zza;

    zzay(com.google.android.gms.maps.zzaz zzazVar, com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        this.zza = onStreetViewPanoramaReadyCallback;
        java.util.Objects.requireNonNull(zzazVar);
    }

    @Override // com.google.android.gms.maps.internal.zzbt
    public final void zzb(com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate iStreetViewPanoramaDelegate) throws android.os.RemoteException {
        this.zza.onStreetViewPanoramaReady(new com.google.android.gms.maps.StreetViewPanorama(iStreetViewPanoramaDelegate));
    }
}
