package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.5Q, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class C5Q {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"ftBSrscYCZrU1XGsUffOBJlxDQfDqofj", "6A6pNCV2uhgoYcLypb", "8GOV2FUSZps1pTbJ4je5MwftASUnZkM1", "4wRLkwVxN17llLy", "8LQiKKC5rqzUsPzG", "bVt1RMPFhi5Vk9jMxK8mGuGgg99xJtg4", "bUya0H86JSXRIIoahVHYTIdtcqgWtSBf", "i4ePvK4hrBrPNKxpSWALXVVM3"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A00(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, java.lang.String str) throws com.facebook.ads.redexgen.core.C5N {
        try {
            if (!com.facebook.ads.redexgen.core.C5C.A19(sQLiteDatabase, A01(159, 17, 73))) {
                return -1;
            }
            android.database.Cursor query = sQLiteDatabase.query(A01(159, 17, 73), new java.lang.String[]{A01(244, 7, 93)}, A01(183, 32, 22), A05(i, str), null, null, null);
            try {
                if (query.getCount() == 0) {
                    if (query != null) {
                        query.close();
                    }
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                if (query != null) {
                    query.close();
                }
                return i2;
            } finally {
            }
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{53, 36, 51, 55, 34, 51, 86, 34, 55, 52, 58, 51, 86, 63, 48, 86, 56, 57, 34, 86, 51, 46, 63, 37, 34, 37, 86, 51, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 38, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.SI, 19, 4, 32, 19, 4, 5, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 5, 86, 94, com.google.common.base.Ascii.DLE, 19, com.google.common.base.Ascii.ETB, 2, 3, 4, 19, 86, 63, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 5, 2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, 19, 41, 3, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 86, 34, 51, 46, 34, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 0, 19, 4, 5, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.CAN, 86, 63, 56, 34, 51, 49, 51, 36, 86, 56, 57, 34, 86, 56, 35, 58, 58, 90, 38, 36, 63, 59, 55, 36, 47, 86, kotlin.io.encoding.Base64.padSymbol, 51, 47, 86, 94, com.google.common.base.Ascii.DLE, 19, com.google.common.base.Ascii.ETB, 2, 3, 4, 19, 90, 86, com.google.common.base.Ascii.US, com.google.common.base.Ascii.CAN, 5, 2, com.google.common.base.Ascii.ETB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, 19, 41, 3, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 95, 95, com.google.common.base.Ascii.GS, 32, 55, 8, 52, 57, 33, kotlin.io.encoding.Base64.padSymbol, 42, com.google.common.base.Ascii.SO, kotlin.io.encoding.Base64.padSymbol, 42, 43, 49, 55, 54, 43, 103, 100, 96, 117, 116, 115, 100, 97, 98, 102, 115, 114, 117, 98, 39, 58, 39, 56, 39, 70, 73, 67, 39, 110, 105, 116, 115, 102, 105, 100, 98, 88, 114, 110, 99, 39, 58, 39, 56, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 72, 72, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 9, 66, 95, 72, 9, 67, 70, 83, 70, 69, 70, 84, 66, 9, com.google.common.base.Ascii.SO, 19, com.google.common.base.Ascii.DC4, 1, com.google.common.base.Ascii.SO, 3, 5, 63, com.google.common.base.Ascii.NAK, 9, 4, 58, 41, 62, 63, 37, 35, 34};
        java.lang.String[] strArr = A01;
        if (strArr[6].charAt(14) == strArr[5].charAt(14)) {
            throw new java.lang.RuntimeException();
        }
        A01[7] = "SNjSmBwt36dpbjCWXjm4KdaDp";
    }

    static {
        A02();
        com.facebook.ads.redexgen.core.AnonymousClass35.A03(A01(com.vungle.ads.internal.protos.Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE, 17, 54));
    }

    public static void A03(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, java.lang.String str) throws com.facebook.ads.redexgen.core.C5N {
        java.lang.String A012 = A01(159, 17, 73);
        try {
            if (!com.facebook.ads.redexgen.core.C5C.A19(sQLiteDatabase, A012)) {
                return;
            }
            sQLiteDatabase.delete(A012, A01(183, 32, 22), A05(i, str));
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public static void A04(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, java.lang.String str, int i2) throws com.facebook.ads.redexgen.core.C5N {
        try {
            sQLiteDatabase.execSQL(A01(0, 159, 103));
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(A01(176, 7, 16), java.lang.Integer.valueOf(i));
            contentValues.put(A01(232, 12, 113), str);
            contentValues.put(A01(244, 7, 93), java.lang.Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow(A01(159, 17, 73), null, contentValues);
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public static java.lang.String[] A05(int i, java.lang.String str) {
        return new java.lang.String[]{java.lang.Integer.toString(i), str};
    }
}
