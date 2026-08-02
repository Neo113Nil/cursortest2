package com.google.android.odml.image;

/* loaded from: classes.dex */
public class MlImage implements java.io.Closeable {
    public static final int IMAGE_FORMAT_ALPHA = 8;
    public static final int IMAGE_FORMAT_JPEG = 9;
    public static final int IMAGE_FORMAT_NV12 = 3;
    public static final int IMAGE_FORMAT_NV21 = 4;
    public static final int IMAGE_FORMAT_RGB = 2;
    public static final int IMAGE_FORMAT_RGBA = 1;
    public static final int IMAGE_FORMAT_UNKNOWN = 0;
    public static final int IMAGE_FORMAT_YUV_420_888 = 7;
    public static final int IMAGE_FORMAT_YV12 = 5;
    public static final int IMAGE_FORMAT_YV21 = 6;
    public static final int STORAGE_TYPE_BITMAP = 1;
    public static final int STORAGE_TYPE_BYTEBUFFER = 2;
    public static final int STORAGE_TYPE_MEDIA_IMAGE = 3;
    private final com.google.android.odml.image.zzg zza;
    private final int zzb;
    private final android.graphics.Rect zzc;
    private final int zzd;
    private final int zze;
    private int zzf;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface ImageFormat {
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface StorageType {
    }

    MlImage(com.google.android.odml.image.zzg zzgVar, int i, android.graphics.Rect rect, long j, int i2, int i3) {
        this.zza = zzgVar;
        this.zzb = i;
        android.graphics.Rect rect2 = new android.graphics.Rect();
        this.zzc = rect2;
        rect2.set(rect);
        this.zzd = i2;
        this.zze = i3;
        this.zzf = 1;
    }

    static void zzc(int i) {
        if (i == 0 || i == 90 || i == 180 || i == 270) {
            return;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(68);
        sb.append("Rotation value ");
        sb.append(i);
        sb.append(" is not valid. Use only 0, 90, 180 or 270.");
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            int i = this.zzf - 1;
            this.zzf = i;
            if (i == 0) {
                this.zza.zzc();
            }
        }
    }

    public java.util.List<com.google.android.odml.image.ImageProperties> getContainedImageProperties() {
        return java.util.Collections.singletonList(this.zza.zzb());
    }

    public com.google.android.odml.image.MlImage.Internal getInternal() {
        return new com.google.android.odml.image.MlImage.Internal(this, null);
    }

    final com.google.android.odml.image.zzg zza() {
        return this.zza;
    }

    public int getWidth() {
        return this.zzd;
    }

    public int getRotation() {
        return this.zzb;
    }

    public static final class Internal {
        private final com.google.android.odml.image.MlImage zza;

        public final void acquire() {
            this.zza.zzd();
        }

        /* synthetic */ Internal(com.google.android.odml.image.MlImage mlImage, com.google.android.odml.image.zzj zzjVar) {
            this.zza = mlImage;
        }
    }

    public int getHeight() {
        return this.zze;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzd() {
        synchronized (this) {
            this.zzf++;
        }
    }
}
