package com.google.android.odml.image;

/* loaded from: classes9.dex */
public class ByteBufferExtractor {
    public static java.nio.ByteBuffer extract(com.google.android.odml.image.MlImage mlImage) {
        com.google.android.odml.image.zzg zza = mlImage.zza();
        if (zza.zzb().getStorageType() == 2) {
            return ((com.google.android.odml.image.zzf) zza).zza().asReadOnlyBuffer();
        }
        throw new java.lang.IllegalArgumentException("Extract ByteBuffer from an MlImage created by objects other than Bytebuffer is not supported");
    }

    private ByteBufferExtractor() {
    }
}
