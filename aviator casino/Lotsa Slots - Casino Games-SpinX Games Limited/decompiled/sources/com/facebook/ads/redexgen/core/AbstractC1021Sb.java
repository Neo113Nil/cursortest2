package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.Sb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1021Sb {
    public static byte[] A00;

    static {
        A02();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 15);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{kotlin.io.encoding.Base64.padSymbol, 53, 56, 79, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 74, 92, 65, 71, 74, 71, 74, Byte.MAX_VALUE, 115, 114, 104, 121, 114, 104, 38, 51, 51, Byte.MAX_VALUE, 115, 113, 50, 122, 125, Byte.MAX_VALUE, 121, 126, 115, 115, 119, 50, 119, 125, 104, 125, 114, 125, 50, 108, 110, 115, 106, 117, 120, 121, 110, 50, 93, 104, 104, 110, 117, 126, 105, 104, 117, 115, 114, 85, 120, 76, 110, 115, 106, 117, 120, 121, 110, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.ETB, 19, com.google.common.base.Ascii.ETB, 10, 33, 10, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.US, com.google.common.base.Ascii.GS, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.EM};
    }

    public static com.facebook.ads.redexgen.core.C1020Sa A00(android.content.ContentResolver contentResolver) {
        java.lang.String A01 = A01(72, 14, 113);
        java.lang.String A012 = A01(3, 9, 33);
        java.lang.String A013 = A01(0, 3, 83);
        android.database.Cursor c = null;
        try {
            c = contentResolver.query(com.facebook.ads.redexgen.core.XB.A00(A01(12, 60, 19)), new java.lang.String[]{A013, A012, A01}, null, null, null);
            if (c == null || !c.moveToFirst()) {
                return new com.facebook.ads.redexgen.core.C1020Sa(null, null, false);
            }
            java.lang.String string = c.getString(c.getColumnIndex(A013));
            java.lang.String attributionId = c.getString(c.getColumnIndex(A012));
            com.facebook.ads.redexgen.core.C1020Sa c1020Sa = new com.facebook.ads.redexgen.core.C1020Sa(string, attributionId, java.lang.Boolean.valueOf(c.getString(c.getColumnIndex(A01))).booleanValue());
            if (c != null) {
                c.close();
            }
            return c1020Sa;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }
}
