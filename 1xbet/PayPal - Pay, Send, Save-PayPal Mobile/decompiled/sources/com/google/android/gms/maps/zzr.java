package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzr extends com.google.android.gms.maps.internal.zzbe {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPoiClickListener zza;

    zzr(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPoiClickListener onPoiClickListener) {
        this.zza = onPoiClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzbf
    public final void zzb(com.google.android.gms.maps.model.PointOfInterest pointOfInterest) throws android.os.RemoteException {
        this.zza.onPoiClick(pointOfInterest);
    }
}
