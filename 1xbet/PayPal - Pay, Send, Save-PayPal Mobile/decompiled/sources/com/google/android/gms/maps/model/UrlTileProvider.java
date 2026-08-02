package com.google.android.gms.maps.model;

/* loaded from: classes8.dex */
public abstract class UrlTileProvider implements com.google.android.gms.maps.model.TileProvider {
    private final int zza;
    private final int zzb;

    @Override // com.google.android.gms.maps.model.TileProvider
    public final com.google.android.gms.maps.model.Tile getTile(int i, int i2, int i3) {
        java.net.URL tileUrl = getTileUrl(i, i2, i3);
        if (tileUrl == null) {
            return NO_TILE;
        }
        try {
            com.google.android.gms.internal.maps.zzh.zzb(4352);
            int i4 = this.zza;
            int i5 = this.zzb;
            int i6 = com.google.android.gms.internal.maps.zze.zzb;
            java.io.InputStream inputStream = tileUrl.openConnection().getInputStream();
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream, "from must not be null.");
            com.google.android.gms.common.internal.Preconditions.checkNotNull(byteArrayOutputStream, "to must not be null.");
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    com.google.android.gms.maps.model.Tile tile = new com.google.android.gms.maps.model.Tile(i4, i5, byteArrayOutputStream.toByteArray());
                    com.google.android.gms.internal.maps.zzh.zza();
                    return tile;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (java.io.IOException unused) {
            com.google.android.gms.internal.maps.zzh.zza();
            return null;
        } catch (java.lang.Throwable th) {
            com.google.android.gms.internal.maps.zzh.zza();
            throw th;
        }
    }

    public abstract java.net.URL getTileUrl(int i, int i2, int i3);

    public UrlTileProvider(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
    }
}
