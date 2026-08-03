package com.facebook.ads.redexgen.core;

@com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"NON_FINAL"}, value = "D54147219: For usage in Hero Simple Cache")
/* loaded from: assets/audience_network/classes2.dex */
public final class MV {
    public static byte[] A02;
    public static final java.lang.String[] A03;
    public java.lang.String A00;
    public final com.facebook.ads.redexgen.core.C5O A01;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 44);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A02 = new byte[]{-91, -123, -53, -66, -54, -62, 125, -79, -94, -75, -79, 125, -83, -81, -90, -86, -98, -81, -74, 125, -88, -94, -74, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, -55, -62, -53, -60, -47, -59, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -119, -55, -66, -48, -47, -68, -47, -52, -46, -64, -59, -68, -47, -58, -54, -62, -48, -47, -66, -54, -51, 125, -90, -85, -79, -94, -92, -94, -81, 125, -85, -84, -79, 125, -85, -78, -87, -87, -122, -98, -83, -96, -100, -81, -96, 123, -81, -100, -99, -89, -96, 123, -25, -11, -14, -13, -61, -9, -28, -27, -17, -24, -61, -20, -23, -61, -24, -5, -20, -10, -9, -10, -61, Byte.MAX_VALUE, -78, -87, -118, -90, -101, -77, -97, -84, 125, -101, -99, -94, -97, Byte.MIN_VALUE, -93, -90, -97, -121, -97, -82, -101, -98, -101, -82, -101, com.google.common.base.Ascii.CR, 2, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 0, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.SYN, 4, 9, 0, com.google.common.base.Ascii.NAK, 10, com.google.common.base.Ascii.SO, 6, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.NAK, 2, com.google.common.base.Ascii.SO, 17, -24, -31, -22, -29, -16, -28, -89, -102, -90, -98, -96, -109, -97, -105, 82, 111, 82, 113};
    }

    static {
        A03();
        A03 = new java.lang.String[]{A01(181, 4, 13), A01(175, 6, 80), A01(155, 20, 117)};
    }

    public MV(com.facebook.ads.redexgen.core.C5O c5o) {
        this.A01 = c5o;
    }

    private android.database.Cursor A00() {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        return this.A01.getReadableDatabase().query(this.A00, A03, null, null, null, null, null);
    }

    public static java.lang.String A02(java.lang.String str) {
        return A01(129, 26, 14) + str;
    }

    public static void A04(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.execSQL(A01(108, 21, 119) + str);
    }

    public final java.util.Map<java.lang.String, com.facebook.ads.redexgen.core.MU> A05() throws com.facebook.ads.redexgen.core.C5N {
        try {
            android.database.Cursor A00 = A00();
            try {
                java.util.HashMap hashMap = new java.util.HashMap(A00.getCount());
                while (A00.moveToNext()) {
                    hashMap.put((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A00.getString(0)), new com.facebook.ads.redexgen.core.MU(A00.getLong(1), A00.getLong(2)));
                }
                if (A00 != null) {
                    A00.close();
                }
                return hashMap;
            } finally {
            }
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public final void A06(long j) throws com.facebook.ads.redexgen.core.C5N {
        try {
            java.lang.String hexString = java.lang.Long.toHexString(j);
            java.lang.String hexUid = A02(hexString);
            this.A00 = hexUid;
            if (com.facebook.ads.redexgen.core.C5Q.A00(this.A01.getReadableDatabase(), 2, hexString) != 1) {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    com.facebook.ads.redexgen.core.C5Q.A04(writableDatabase, 2, hexString, 1);
                    java.lang.String hexUid2 = this.A00;
                    A04(writableDatabase, hexUid2);
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.lang.String hexUid3 = A01(95, 13, 47);
                    java.lang.StringBuilder append = sb.append(hexUid3);
                    java.lang.String hexUid4 = this.A00;
                    java.lang.StringBuilder append2 = append.append(hexUid4);
                    java.lang.String hexUid5 = A01(0, 1, 89);
                    java.lang.StringBuilder append3 = append2.append(hexUid5);
                    java.lang.String hexUid6 = A01(1, 94, 49);
                    writableDatabase.execSQL(append3.append(hexUid6).toString());
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (java.lang.Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public final void A07(java.lang.String str) throws com.facebook.ads.redexgen.core.C5N {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        try {
            this.A01.getWritableDatabase().delete(this.A00, A01(185, 8, 6), new java.lang.String[]{str});
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public final void A08(java.lang.String str, long j, long j2) throws com.facebook.ads.redexgen.core.C5N {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(A01(181, 4, 13), str);
            contentValues.put(A01(175, 6, 80), java.lang.Long.valueOf(j));
            contentValues.put(A01(155, 20, 117), java.lang.Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.A00, null, contentValues);
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public final void A09(java.util.Set<java.lang.String> set) throws com.facebook.ads.redexgen.core.C5N {
        com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00);
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                java.util.Iterator<java.lang.String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.A00, A01(185, 8, 6), new java.lang.String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }
}
