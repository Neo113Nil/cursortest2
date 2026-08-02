package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzag extends com.google.android.gms.maps.internal.zzas {
    final /* synthetic */ com.google.android.gms.maps.OnMapReadyCallback zza;

    zzag(com.google.android.gms.maps.zzah zzahVar, com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        this.zza = onMapReadyCallback;
        java.util.Objects.requireNonNull(zzahVar);
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(com.google.android.gms.maps.internal.IGoogleMapDelegate iGoogleMapDelegate) throws android.os.RemoteException {
        this.zza.onMapReady(new com.google.android.gms.maps.GoogleMap(iGoogleMapDelegate));
    }
}
