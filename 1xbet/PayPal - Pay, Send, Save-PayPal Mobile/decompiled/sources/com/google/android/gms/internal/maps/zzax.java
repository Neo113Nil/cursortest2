package com.google.android.gms.internal.maps;

/* loaded from: classes8.dex */
public final class zzax extends com.google.android.gms.internal.maps.zza implements com.google.android.gms.internal.maps.zzaz {
    zzax(android.os.IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.ITileProviderDelegate");
    }

    @Override // com.google.android.gms.internal.maps.zzaz
    public final com.google.android.gms.maps.model.Tile zzb(int i, int i2, int i3) throws android.os.RemoteException {
        android.os.Parcel zza = zza();
        zza.writeInt(i);
        zza.writeInt(i2);
        zza.writeInt(i3);
        android.os.Parcel zzJ = zzJ(1, zza);
        com.google.android.gms.maps.model.Tile tile = (com.google.android.gms.maps.model.Tile) com.google.android.gms.internal.maps.zzc.zza(zzJ, com.google.android.gms.maps.model.Tile.CREATOR);
        zzJ.recycle();
        return tile;
    }
}
