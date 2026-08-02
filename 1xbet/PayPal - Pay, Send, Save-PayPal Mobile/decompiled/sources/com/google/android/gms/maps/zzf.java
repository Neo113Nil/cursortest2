package com.google.android.gms.maps;

/* loaded from: classes8.dex */
final class zzf extends com.google.android.gms.maps.internal.zzh {
    final /* synthetic */ com.google.android.gms.maps.GoogleMap.InfoWindowAdapter zza;

    zzf(com.google.android.gms.maps.GoogleMap googleMap, com.google.android.gms.maps.GoogleMap.InfoWindowAdapter infoWindowAdapter) {
        this.zza = infoWindowAdapter;
        java.util.Objects.requireNonNull(googleMap);
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzb(com.google.android.gms.internal.maps.zzaj zzajVar) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getInfoContents(new com.google.android.gms.maps.model.Marker(zzajVar)));
    }

    @Override // com.google.android.gms.maps.internal.zzi
    public final com.google.android.gms.dynamic.IObjectWrapper zzc(com.google.android.gms.internal.maps.zzaj zzajVar) {
        return com.google.android.gms.dynamic.ObjectWrapper.wrap(this.zza.getInfoWindow(new com.google.android.gms.maps.model.Marker(zzajVar)));
    }
}
