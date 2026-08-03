package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class YN {
    public static android.graphics.Bitmap A00(android.graphics.Bitmap bitmap) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.setScale(-1.0f, 1.0f);
        matrix.postTranslate(bitmap.getWidth(), 0.0f);
        return android.graphics.Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
    }

    public static android.graphics.Bitmap A01(com.facebook.ads.redexgen.core.YM ym) {
        byte[] decode = android.util.Base64.decode(ym.A01(com.facebook.ads.redexgen.core.XX.A02), 0);
        return android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
    }

    public static android.graphics.Bitmap A02(com.facebook.ads.redexgen.core.YM ym) {
        byte[] decode = android.util.Base64.decode(ym.A01(com.facebook.ads.redexgen.core.XX.A02), 0);
        return A00(android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length));
    }

    public static android.graphics.drawable.Drawable A03(com.facebook.ads.redexgen.core.C1636gi c1636gi, com.facebook.ads.redexgen.core.YM ym) {
        return new android.graphics.drawable.BitmapDrawable(c1636gi.getResources(), A01(ym));
    }
}
