package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.pI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2135pI extends android.database.sqlite.SQLiteOpenHelper implements com.facebook.ads.redexgen.core.C5O {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"YuTOcDzSk33WzGuHUm34fIUZdR6FzBSo", "XTKHU7ykX6HxNiJgN0rgjCseZECTQtra", "VEZqd6OFp5mQyS5r43nHHulMPiVDQ9eW", "aLYnSlPQY916exG9yEmf5vg4GfwoTrU7", "tF23Z6GUlh0Fjg1gJR8XevpVUkpWaXM2", "mepItLhmIU8NS8JNKSf8apCSosOFfjC4", "Cz0Pux5KFog27POOTk7sr9rS4XUT", "HqOHPFLqaLH3svqHIBOSrAzDJwUDQThi"};

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 44);
            java.lang.String[] strArr = A01;
            if (strArr[0].charAt(22) == strArr[2].charAt(22)) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr2 = A01;
            strArr2[5] = "n1qaiWHrUpNnLAu01u7Aygvt6fyaUUnG";
            strArr2[3] = "NzqeYJq8DJ4S2vkSjhcMbPo6SDo1HpGr";
            copyOfRange[i4] = b;
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{104, 1, com.google.common.base.Ascii.SO, 104, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DLE, 1, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, 104, 80, 70, 91, 68, 52, 94, 105, 105, 116, 105, 59, 126, 99, 126, 120, 110, 111, 114, 117, 124, 59, 56, 42, 47, 10, com.google.common.base.Ascii.US, 10, 9, 10, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.SO, 59, com.google.common.base.Ascii.EM, 4, com.google.common.base.Ascii.GS, 2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.EM, 116, 105, 126, 97, 125, 112, 104, 116, 99, 78, 120, Byte.MAX_VALUE, 101, 116, 99, Byte.MAX_VALUE, 112, 125, 63, 117, 115, 63, 48, 60, 52, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.ESC, 6, 3, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, 53, 7, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CAN, 34, 32, kotlin.io.encoding.Base64.padSymbol, 56, 37, 52, com.google.common.base.Ascii.SO, 34, 52, 32, 36, 52, 63, 50, 52, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 77, 68, 81};
    }

    static {
        A01();
    }

    public C2135pI(android.content.Context context) {
        super(context.getApplicationContext(), A00(50, 21, 61), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void A02(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor query = sQLiteDatabase.query(A00(75, 13, 70), new java.lang.String[]{A00(103, 4, 24), A00(71, 4, 125)}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                java.lang.String string = query.getString(0);
                java.lang.String string2 = query.getString(1);
                if (!A00(88, 15, 125).equals(string2)) {
                    java.lang.String str = A00(11, 5, 56) + string + A00(0, 11, 100) + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (android.database.SQLException e) {
                        java.lang.String type = A00(32, 18, 71);
                        com.facebook.ads.redexgen.core.AbstractC04284g.A08(type, A00(16, 16, 55) + str, e);
                    }
                }
            } catch (java.lang.Throwable th) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
        if (query != null) {
            query.close();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        A02(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
