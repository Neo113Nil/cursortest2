package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class T2 {
    public static byte[] A00;

    static {
        A04();
    }

    public static java.lang.String A03(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 31);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{2, 6, 10, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.SO};
    }

    public static int A00(android.graphics.BitmapFactory.Options options, int halfWidth, int i) {
        int width = options.outHeight;
        int height = options.outWidth;
        int halfHeight = 1;
        if (width > i || height > halfWidth) {
            int inSampleSize = width / 2;
            int width2 = height / 2;
            while (inSampleSize / halfHeight >= i && width2 / halfHeight >= halfWidth) {
                halfHeight *= 2;
            }
        }
        return halfHeight;
    }

    public static android.graphics.Bitmap A01(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C0857Lo c0857Lo = new com.facebook.ads.redexgen.core.C0857Lo(inputStream);
        c0857Lo.mark(8192);
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeStream(c0857Lo, null, options);
        c0857Lo.reset();
        if (!c0857Lo.A00()) {
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return android.graphics.BitmapFactory.decodeStream(c0857Lo, null, options);
        }
        return android.graphics.BitmapFactory.decodeStream(c0857Lo);
    }

    public static android.graphics.Bitmap A02(java.lang.String str, int i, int i2, com.facebook.ads.redexgen.core.T8 t8) {
        try {
            android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            android.graphics.BitmapFactory.decodeFile(str, options);
            options.inSampleSize = A00(options, i2, i);
            options.inJustDecodeBounds = false;
            return android.graphics.BitmapFactory.decodeFile(str, options);
        } catch (java.lang.Throwable t) {
            t8.A08().ABC(A03(0, 5, 116), com.facebook.ads.redexgen.core.AbstractC1048Td.A1h, new com.facebook.ads.redexgen.core.C1049Te(t));
            return null;
        }
    }
}
