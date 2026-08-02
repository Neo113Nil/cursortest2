package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzo extends com.google.android.gms.maps.internal.zzbg {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnPolygonClickListener zza;

    zzo(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnPolygonClickListener onPolygonClickListener) {
        this.zza = onPolygonClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzbh
    public final void zzb(com.google.android.gms.internal.maps.zzao zzaoVar) {
        this.zza.onPolygonClick(new com.google.android.gms.maps.model.Polygon(zzaoVar));
    }
}
