package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class TL {
    public static byte[] A01;
    public final com.facebook.ads.redexgen.core.TH A00;

    static {
        A04();
    }

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 3);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A01 = new byte[]{85, 93, 87, 74, 87, 72, 54, 80, 68, 89, 91, 54, 84, 35, 60, 49, 38, 49, 84, 95, 4, 8, 79, 94, 73, 77, 88, 73, 44, 88, 77, 78, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 73, 44, 6, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC2, 98, com.google.common.base.Ascii.SYN, 3, 0, com.google.common.base.Ascii.SO, 7, 98, com.google.common.base.Ascii.VT, 4, 98, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.SYN, 17, 98, 34, 52, kotlin.io.encoding.Base64.padSymbol, 52, 50, 37, 81};
    }

    public abstract java.lang.String A06();

    public abstract com.facebook.ads.redexgen.core.TF[] A0A();

    public TL(com.facebook.ads.redexgen.core.TH th) {
        this.A00 = th;
    }

    private java.lang.String A00() {
        com.facebook.ads.redexgen.core.TF[] A0A = A0A();
        if (A0A.length < 1) {
            return null;
        }
        java.lang.String result = A01(0, 0, 12);
        for (int i = 0; i < A0A.length - 1; i++) {
            result = result + A0A[i].A02() + A01(20, 2, 43);
        }
        return result + A0A[A0A.length - 1].A02();
    }

    public static java.lang.String A02(java.lang.String str, com.facebook.ads.redexgen.core.TF[] tfArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(A01(56, 7, 114));
        for (int i = 0; i < tfArr.length - 1; i++) {
            sb.append(tfArr[i].A01);
            sb.append(A01(20, 2, 43));
        }
        sb.append(tfArr[tfArr.length - 1].A01);
        sb.append(A01(6, 6, 21));
        sb.append(str);
        return sb.toString();
    }

    public static java.lang.String A03(java.lang.String str, com.facebook.ads.redexgen.core.TF[] tfArr, com.facebook.ads.redexgen.core.TF tf) {
        return A02(str, tfArr) + A01(12, 7, 119) + tf.A01 + A01(2, 4, 116);
    }

    public final android.database.sqlite.SQLiteDatabase A05() {
        return this.A00.A0E();
    }

    public final void A07(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(22, 13, 15) + A06() + A01(0, 2, 118) + A00() + A01(19, 1, 117));
    }

    public final void A08(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(A01(35, 21, 65) + A06());
    }

    public final boolean A09() {
        return A05().delete(A06(), null, null) > 0;
    }
}
