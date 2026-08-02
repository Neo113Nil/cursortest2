package com.google.android.odml.image;

/* loaded from: classes9.dex */
public class MediaMlImageBuilder {
    private final android.media.Image zza;
    private int zzb = 0;
    private android.graphics.Rect zzc;

    public MediaMlImageBuilder(android.media.Image image) {
        this.zza = image;
        this.zzc = new android.graphics.Rect(0, 0, image.getWidth(), image.getHeight());
    }

    public com.google.android.odml.image.MlImage build() {
        return new com.google.android.odml.image.MlImage(new com.google.android.odml.image.zzi(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    public com.google.android.odml.image.MediaMlImageBuilder setRotation(int i) {
        com.google.android.odml.image.MlImage.zzc(i);
        this.zzb = i;
        return this;
    }
}
