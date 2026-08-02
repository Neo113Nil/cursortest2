package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
final class zzai extends com.google.android.gms.internal.maps.zzay {
    final /* synthetic */ com.google.android.gms.maps.model.TileProvider zza;

    zzai(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions, com.google.android.gms.maps.model.TileProvider tileProvider) {
        this.zza = tileProvider;
        java.util.Objects.requireNonNull(tileOverlayOptions);
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    public final com.google.android.gms.maps.model.Tile zzb(int i, int i2, int i3) {
        return this.zza.getTile(i, i2, i3);
    }
}
