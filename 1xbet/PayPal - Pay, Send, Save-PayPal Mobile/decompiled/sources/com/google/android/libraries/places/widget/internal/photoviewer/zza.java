package com.google.android.libraries.places.widget.internal.photoviewer;

/* loaded from: classes8.dex */
public final class zza extends com.bumptech.glide.load.resource.bitmap.BitmapTransformation {
    private final float zza;
    private final float zzb;
    private final android.content.Context zzc;

    public zza(android.content.Context context, float f, float f2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.zza = 25.0f;
        this.zzb = 0.125f;
        android.content.Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        this.zzc = applicationContext;
    }

    public final boolean equals(java.lang.Object obj) {
        return false;
    }

    public final int hashCode() {
        return java.util.Objects.hash("com.google.android.libraries.places.widget.internal.photoviewer.BlurTransformation", java.lang.Float.valueOf(this.zza), java.lang.Float.valueOf(this.zzb));
    }

    protected final android.graphics.Bitmap transform(com.bumptech.glide.load.engine.bitmap_recycle.BitmapPool bitmapPool, android.graphics.Bitmap bitmap, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmapPool, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bitmap, "");
        float width = bitmap.getWidth();
        float f = this.zzb;
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(bitmap, java.lang.Math.round(width * f), java.lang.Math.round(bitmap.getHeight() * f), false);
        android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(createScaledBitmap);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(createBitmap, "");
        android.renderscript.RenderScript create = android.renderscript.RenderScript.create(this.zzc);
        android.renderscript.ScriptIntrinsicBlur create2 = android.renderscript.ScriptIntrinsicBlur.create(create, android.renderscript.Element.U8_4(create));
        android.renderscript.Allocation createFromBitmap = android.renderscript.Allocation.createFromBitmap(create, createScaledBitmap);
        android.renderscript.Allocation createFromBitmap2 = android.renderscript.Allocation.createFromBitmap(create, createBitmap);
        try {
            create2.setRadius(this.zza);
            create2.setInput(createFromBitmap);
            create2.forEach(createFromBitmap2);
            createFromBitmap2.copyTo(createBitmap);
            return createBitmap;
        } finally {
            createScaledBitmap.recycle();
            createFromBitmap.destroy();
            createFromBitmap2.destroy();
            create2.destroy();
            create.destroy();
        }
    }

    public final void updateDiskCacheKey(java.security.MessageDigest messageDigest) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(messageDigest, "");
        byte[] bytes = "blurred".getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "");
        messageDigest.update(bytes);
        messageDigest.update((byte) (this.zza * 10.0f));
        messageDigest.update((byte) (this.zzb * 10.0f));
    }
}
