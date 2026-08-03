package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC0856Ln {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"", "5RMLmaPj2fddIFPW54nmiFQPDQKlIy2x", "0506SZgMJJ7sv8mHDOEz9KlkL25eIrXm", "3YZMJbChCuRHZ", "0tP", "k2qiQoSuFgoxV", "", "m4QFNGv2UqCrxsi4qbKPCdwxAuw6y7wM"};

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A01[4].length() != 3) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[2] = "AJnFEtF8h38YXxkoJFDHCzPhEs51Q6lq";
            strArr[1] = "PqTCDiOjjtdJiv33jQVs3cEvP8T1eChE";
            if (i4 >= length) {
                return new java.lang.String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 20);
            i4++;
        }
    }

    public static void A06() {
        A00 = new byte[]{-42, -39, -36, -43, -86, -97, -97};
        java.lang.String[] strArr = A01;
        if (strArr[5].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A01;
        strArr2[6] = "";
        strArr2[0] = "";
    }

    static {
        A06();
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
            options.inSampleSize = A00(options, i, i2);
            options.inJustDecodeBounds = false;
            return android.graphics.BitmapFactory.decodeStream(c0857Lo, null, options);
        }
        return android.graphics.BitmapFactory.decodeStream(c0857Lo);
    }

    public static android.graphics.Bitmap A02(java.lang.String str, int i, int i2) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        android.graphics.BitmapFactory.decodeFile(str, options);
        options.inSampleSize = A00(options, i, i2);
        options.inJustDecodeBounds = false;
        return android.graphics.BitmapFactory.decodeFile(str, options);
    }

    public static android.graphics.Bitmap A03(java.lang.String str, int i, int i2, boolean z) throws java.io.IOException {
        try {
            java.io.FileInputStream fileInputStream = new java.io.FileInputStream(new java.io.File(str));
            if (i > 0 && i2 > 0) {
                if (z) {
                    android.graphics.Bitmap A012 = A01(fileInputStream, i, i2);
                    A07(fileInputStream);
                    return A012;
                }
                android.graphics.Bitmap A02 = A02(str, i, i2);
                A07(fileInputStream);
                return A02;
            }
            android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream(fileInputStream);
            A07(fileInputStream);
            return decodeStream;
        } catch (java.lang.Throwable th) {
            A07(null);
            throw th;
        }
    }

    public static java.lang.String A05(java.io.File file) {
        if (file != null) {
            return A04(0, 7, 92) + file.getPath();
        }
        return null;
    }

    public static void A07(java.io.Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (java.io.IOException unused) {
        }
    }
}
