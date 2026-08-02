package com.google.android.odml.image;

/* loaded from: classes9.dex */
public class ByteBufferMlImageBuilder {
    private final java.nio.ByteBuffer zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private int zze = 0;
    private android.graphics.Rect zzf;

    public ByteBufferMlImageBuilder(java.nio.ByteBuffer byteBuffer, int i, int i2, int i3) {
        this.zza = byteBuffer;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zzf = new android.graphics.Rect(0, 0, i, i2);
    }

    public com.google.android.odml.image.MlImage build() {
        return new com.google.android.odml.image.MlImage(new com.google.android.odml.image.zzf(this.zza, this.zzd), this.zze, this.zzf, 0L, this.zzb, this.zzc);
    }

    public com.google.android.odml.image.ByteBufferMlImageBuilder setRotation(int i) {
        com.google.android.odml.image.MlImage.zzc(i);
        this.zze = i;
        return this;
    }
}
