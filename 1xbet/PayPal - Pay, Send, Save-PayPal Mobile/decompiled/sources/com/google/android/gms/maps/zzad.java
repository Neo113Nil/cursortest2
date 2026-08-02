package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzad extends com.google.android.gms.maps.internal.zzas {
    final /* synthetic */ com.google.android.gms.maps.OnMapReadyCallback zza;

    zzad(com.google.android.gms.maps.zzae zzaeVar, com.google.android.gms.maps.OnMapReadyCallback onMapReadyCallback) {
        this.zza = onMapReadyCallback;
        java.util.Objects.requireNonNull(zzaeVar);
    }

    @Override // com.google.android.gms.maps.internal.zzat
    public final void zzb(com.google.android.gms.maps.internal.IGoogleMapDelegate iGoogleMapDelegate) throws android.os.RemoteException {
        this.zza.onMapReady(new com.google.android.gms.maps.GoogleMap(iGoogleMapDelegate));
    }
}
