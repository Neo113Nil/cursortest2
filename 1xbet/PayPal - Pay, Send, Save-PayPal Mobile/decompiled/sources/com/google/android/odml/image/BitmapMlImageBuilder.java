package com.google.android.odml.image;

/* loaded from: classes9.dex */
public class BitmapMlImageBuilder {
    private final android.graphics.Bitmap zza;
    private int zzb;
    private android.graphics.Rect zzc;

    public BitmapMlImageBuilder(android.content.Context context, android.net.Uri uri) throws java.io.IOException {
        this(android.provider.MediaStore.Images.Media.getBitmap(context.getContentResolver(), uri));
    }

    public com.google.android.odml.image.MlImage build() {
        return new com.google.android.odml.image.MlImage(new com.google.android.odml.image.zze(this.zza), this.zzb, this.zzc, 0L, this.zza.getWidth(), this.zza.getHeight());
    }

    public com.google.android.odml.image.BitmapMlImageBuilder setRotation(int i) {
        com.google.android.odml.image.MlImage.zzc(i);
        this.zzb = i;
        return this;
    }

    public BitmapMlImageBuilder(android.graphics.Bitmap bitmap) {
        this.zza = bitmap;
        this.zzb = 0;
        this.zzc = new android.graphics.Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
    }
}
