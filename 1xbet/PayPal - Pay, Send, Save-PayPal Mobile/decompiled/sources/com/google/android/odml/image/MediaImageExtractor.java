package com.google.android.odml.image;

/* loaded from: classes9.dex */
public class MediaImageExtractor {
    public static android.media.Image extract(com.google.android.odml.image.MlImage mlImage) {
        com.google.android.odml.image.zzg zza = mlImage.zza();
        if (zza.zzb().getStorageType() == 3) {
            return ((com.google.android.odml.image.zzi) zza).zza();
        }
        throw new java.lang.IllegalArgumentException("Extract Media Image from an MlImage created by objects other than Media Image is not supported");
    }

    private MediaImageExtractor() {
    }
}
