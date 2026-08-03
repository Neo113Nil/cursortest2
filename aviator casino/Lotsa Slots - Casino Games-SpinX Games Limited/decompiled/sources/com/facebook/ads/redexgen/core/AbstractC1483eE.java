package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.eE, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1483eE {
    public static boolean A00;
    public static byte[] A01;
    public static java.lang.String[] A02 = {"LOnHKZUk03MjG3VYzMMYiec9SpPsFOh7", "Pbkw0DRwc7jrPzgwHcPKSBrc9yMoULer", "Hj", "S7", "LLbZvFImhG4qXHtXSuU8lE9QXb8BQ4aR", "3BEuw5zYnH62E4dXOlScK8tmPuoX0Dzi", "Tjz3D17CMTsDMz51rRXrrUvPJCeC", "mII8e5HllIg"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 60);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A01 = new byte[]{81, 124, 102, 101, 121, 116, 108, 88, 112, 97, 103, 124, 118, 102, 53, 124, 102, 53, 123, 96, 121, 121, 59, com.google.common.base.Ascii.EM, 46, 56, 36, 62, 57, 40, 46, 56, 107, 34, 56, 107, 37, 62, 39, 39, 101, 37, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.GS, 83, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, com.google.common.base.Ascii.ETB, 93, 107, 105, 106};
    }

    static {
        A03();
        A00 = true;
    }

    public static android.graphics.drawable.BitmapDrawable A00(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] decode = android.util.Base64.decode(str, 0);
            android.graphics.Bitmap overlayBm = android.graphics.BitmapFactory.decodeByteArray(decode, 0, decode.length);
            if (overlayBm != null && (!A00 || A05(c1636gi, overlayBm))) {
                android.graphics.drawable.BitmapDrawable overlayRepeat = new android.graphics.drawable.BitmapDrawable(overlayBm);
                overlayRepeat.setTileModeXY(android.graphics.Shader.TileMode.REPEAT, android.graphics.Shader.TileMode.REPEAT);
                android.content.res.Resources resources = c1636gi.getResources();
                if (resources != null) {
                    android.util.DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    if (displayMetrics != null) {
                        overlayRepeat.setTargetDensity(displayMetrics.densityDpi);
                    } else {
                        A04(c1636gi, A02(0, 23, 41));
                    }
                } else {
                    A04(c1636gi, A02(23, 18, 119));
                }
                return overlayRepeat;
            }
            return null;
        } catch (java.lang.Throwable th) {
            c1636gi.A08().ABC(A02(59, 3, 58), com.facebook.ads.redexgen.core.AbstractC1048Td.A1u, new com.facebook.ads.redexgen.core.C1049Te(th));
            return null;
        }
    }

    public static com.facebook.ads.redexgen.core.C1484eF A01(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        android.graphics.drawable.BitmapDrawable A002;
        try {
            if (android.text.TextUtils.isEmpty(str) || (A002 = A00(c1636gi, str)) == null) {
                return null;
            }
            com.facebook.ads.redexgen.core.C1484eF c1484eF = new com.facebook.ads.redexgen.core.C1484eF(c1636gi);
            c1484eF.setBackground(A002);
            c1484eF.setClickable(false);
            c1484eF.setFocusable(false);
            return c1484eF;
        } catch (java.lang.Throwable th) {
            c1636gi.A08().ABC(A02(59, 3, 58), com.facebook.ads.redexgen.core.AbstractC1048Td.A1u, new com.facebook.ads.redexgen.core.C1049Te(th));
            return null;
        }
    }

    public static void A04(com.facebook.ads.redexgen.core.C1636gi c1636gi, java.lang.String str) {
        c1636gi.A08().ABC(A02(59, 3, 58), com.facebook.ads.redexgen.core.AbstractC1048Td.A1u, new com.facebook.ads.redexgen.core.C1049Te(str));
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0005 */
    /* JADX WARN: Incorrect condition in loop: B:6:0x000c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean A05(com.facebook.ads.redexgen.core.C1636gi c1636gi, android.graphics.Bitmap bitmap) {
        for (int i = 0; i < x; i++) {
            for (int pixel = 0; pixel < x; pixel++) {
                int x = bitmap.getPixel(i, pixel);
                if (android.graphics.Color.alpha(x) / 255.0f > 0.03f) {
                    A04(c1636gi, A02(41, 18, 79));
                    return false;
                }
            }
        }
        java.lang.String[] strArr = A02;
        if (strArr[2].length() != strArr[3].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A02;
        strArr2[0] = "LR4kTGqXNNTRbn07qZCCCo1h4xvtCqSD";
        strArr2[4] = "LZTU5gCJod3YylAEiVGeMzo2seGubyq7";
        return true;
    }
}
