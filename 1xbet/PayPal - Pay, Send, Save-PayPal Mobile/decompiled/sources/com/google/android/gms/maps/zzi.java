package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzi extends com.google.android.gms.maps.internal.zzbc {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener zza;

    zzi(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationClickListener onMyLocationClickListener) {
        this.zza = onMyLocationClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzbd
    public final void zzb(android.location.Location location) throws android.os.RemoteException {
        this.zza.onMyLocationClick(location);
    }
}
