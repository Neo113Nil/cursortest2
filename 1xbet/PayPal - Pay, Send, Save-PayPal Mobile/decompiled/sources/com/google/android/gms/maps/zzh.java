package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzh extends com.google.android.gms.maps.internal.zzay {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener zza;

    zzh(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnMyLocationButtonClickListener onMyLocationButtonClickListener) {
        this.zza = onMyLocationButtonClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzaz
    public final boolean zzb() throws android.os.RemoteException {
        return this.zza.onMyLocationButtonClick();
    }
}
