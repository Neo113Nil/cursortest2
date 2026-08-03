package com.fyber.inneractive.sdk.rtb.watermark;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public android.widget.ImageView f4262a;

    public b(android.content.Context context, java.lang.String str) {
        android.graphics.Bitmap bitmap;
        android.widget.ImageView imageView = null;
        try {
            byte[] decode = android.util.Base64.decode(str, 0);
            bitmap = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
            try {
                if (bitmap == null) {
                    com.fyber.inneractive.sdk.util.IAlog.a("Failed to decode watermark: Invalid image data", new java.lang.Object[0]);
                } else {
                    android.widget.ImageView imageView2 = new android.widget.ImageView(context);
                    android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
                    android.graphics.Shader.TileMode tileMode = android.graphics.Shader.TileMode.REPEAT;
                    bitmapDrawable.setTileModeXY(tileMode, tileMode);
                    bitmapDrawable.setTargetDensity(context.getResources().getDisplayMetrics());
                    imageView2.setBackground(bitmapDrawable);
                    imageView2.setId(com.fyber.inneractive.sdk.R.id.ia_ext_watermark);
                    imageView = imageView2;
                }
            } catch (java.lang.Throwable th) {
                th = th;
                if (bitmap != null) {
                    bitmap.recycle();
                }
                com.fyber.inneractive.sdk.util.IAlog.a("%s Error occurred when trying to create external watermark", th, "InneractiveWatermark");
                this.f4262a = imageView;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            bitmap = null;
        }
        this.f4262a = imageView;
    }
}
