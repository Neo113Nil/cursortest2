package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
final class zzah implements com.google.android.gms.maps.model.TileProvider {
    final /* synthetic */ com.google.android.gms.maps.model.TileOverlayOptions zza;
    private final com.google.android.gms.internal.maps.zzaz zzb;

    zzah(com.google.android.gms.maps.model.TileOverlayOptions tileOverlayOptions) {
        com.google.android.gms.internal.maps.zzaz zzazVar;
        java.util.Objects.requireNonNull(tileOverlayOptions);
        this.zza = tileOverlayOptions;
        zzazVar = tileOverlayOptions.zza;
        this.zzb = zzazVar;
    }

    @Override // com.google.android.gms.maps.model.TileProvider
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        try {
            return this.zzb.zzb(i, i2, i3);
        } catch (android.os.RemoteException unused) {
            return null;
        }
    }
}
