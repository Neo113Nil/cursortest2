package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzn extends com.google.android.gms.maps.internal.zzw {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.OnCircleClickListener zza;

    zzn(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.OnCircleClickListener onCircleClickListener) {
        this.zza = onCircleClickListener;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzx
    public final void zzb(com.google.android.gms.internal.maps.zzn zznVar) {
        this.zza.onCircleClick(new com.google.android.gms.maps.model.Circle(zznVar));
    }
}
