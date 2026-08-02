package com.google.android.odml.image;

/* loaded from: classes9.dex */
public final class BitmapExtractor {
    public static android.graphics.Bitmap extract(com.google.android.odml.image.MlImage mlImage) {
        com.google.android.odml.image.zzg zza = mlImage.zza();
        if (zza.zzb().getStorageType() == 1) {
            return ((com.google.android.odml.image.zze) zza).zza();
        }
        throw new java.lang.IllegalArgumentException("Extracting Bitmap from an MlImage created by objects other than Bitmap is not supported");
    }

    private BitmapExtractor() {
    }
}
