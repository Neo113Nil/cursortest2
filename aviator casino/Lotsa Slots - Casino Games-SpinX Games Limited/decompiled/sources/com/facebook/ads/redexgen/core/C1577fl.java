package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1577fl extends com.facebook.ads.redexgen.core.TL {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"v5MZzRzrTL11f6lKUt2ZQD1OVIavmnrt", "OQAuAlzJEKPfh7ZgcR4xCXzzkMNpdJq1", "ORBVlGZaT9NsACLTU7PLH6nx7c52uYSI", "kFePfToViPIZQeUiwoBs", "eRXXWt8NkKb0AEFThzS2KgPgrvMEJJml", "Br8mzprdPK1S49BanGBC", "SoemqsWiEpTnAycOeZvswJMc9fMJVUnI", "UAbmRevtk8pEhuOi2MMFgEMoVQVmS6xB"};
    public static final com.facebook.ads.redexgen.core.TF A02;
    public static final com.facebook.ads.redexgen.core.TF A03;
    public static final com.facebook.ads.redexgen.core.TF[] A04;
    public static final java.lang.String A05;
    public static final java.lang.String A06;
    public static final java.lang.String A07;
    public static final java.lang.String A08;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 98);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A04() {
        A00 = new byte[]{122, 103, 122, 40, 43, 118, 119, 126, 119, 102, 119, com.google.common.base.Ascii.DC2, 116, 96, 125, Byte.MAX_VALUE, com.google.common.base.Ascii.DC2, 70, 93, 89, 87, 92, 65, com.google.common.base.Ascii.DC2, 101, 122, 119, 96, 119, com.google.common.base.Ascii.DC2, 124, 125, 102, com.google.common.base.Ascii.DC2, 119, 106, 123, 97, 102, 97, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SUB, 97, 119, 126, 119, 113, 102, com.google.common.base.Ascii.DC2, 3, com.google.common.base.Ascii.DC2, 116, 96, 125, Byte.MAX_VALUE, com.google.common.base.Ascii.DC2, 87, 68, 87, 92, 70, 65, com.google.common.base.Ascii.DC2, 101, 122, 119, 96, 119, com.google.common.base.Ascii.DC2, 70, 93, 89, 87, 92, 65, com.google.common.base.Ascii.FS, com.google.common.base.Ascii.ESC, 38, kotlin.io.encoding.Base64.padSymbol, 59, 46, 42, 55, 49, 48, 126, 41, 54, 59, 48, 126, 42, 44, 39, 55, 48, 57, 126, 42, 49, 126, 58, 59, 50, 59, 42, 59, 126, kotlin.io.encoding.Base64.padSymbol, 54, 55, 50, 58, 50, 59, 45, 45, 126, 42, 49, 53, 59, 48, 45, 112, 124, 91, 67, 84, 89, 92, 81, com.google.common.base.Ascii.NAK, 65, 90, 94, 80, 91, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.DC4, 5, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.DC4, 36, 53, 40, 36, 80, 32, 34, 57, kotlin.io.encoding.Base64.padSymbol, 49, 34, 41, 80, 59, 53, 41, 66, 81, 66, 73, 83, 84, 5, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.US, 125, 102, 98, 108, 103, 86, 96, 109, 67, 88, 92, 82, 89, 68};
    }

    static {
        A04();
        A03 = new com.facebook.ads.redexgen.core.TF(0, A00(170, 8, 107), A00(143, 16, 18));
        A02 = new com.facebook.ads.redexgen.core.TF(1, A00(165, 5, 19), A00(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 4, 34));
        A04 = new com.facebook.ads.redexgen.core.TF[]{A03, A02};
        A08 = com.facebook.ads.redexgen.core.C1577fl.class.getSimpleName();
        com.facebook.ads.redexgen.core.TF[] tfArr = A04;
        java.lang.String A002 = A00(178, 6, 85);
        A06 = com.facebook.ads.redexgen.core.TL.A02(A002, tfArr);
        A07 = com.facebook.ads.redexgen.core.TL.A03(A002, A04, A02);
        A05 = A00(5, 71, 80) + A03.A01 + A00(0, 3, 56) + A00(159, 6, 69) + A00(4, 1, 103) + com.facebook.ads.redexgen.core.C1584fs.A09.A01 + A00(3, 1, 99);
    }

    public C1577fl(com.facebook.ads.redexgen.core.TH th) {
        super(th);
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final java.lang.String A06() {
        return A00(178, 6, 85);
    }

    @Override // com.facebook.ads.redexgen.core.TL
    public final com.facebook.ads.redexgen.core.TF[] A0A() {
        return A04;
    }

    public final android.database.Cursor A0B() {
        return A05().rawQuery(A06, null);
    }

    public final java.lang.String A0C(java.lang.String str) throws java.lang.IllegalArgumentException, android.database.sqlite.SQLiteException {
        if (!android.text.TextUtils.isEmpty(str)) {
            android.database.Cursor cursor = null;
            try {
                cursor = A05().rawQuery(A07, new java.lang.String[]{str});
                java.lang.String string = cursor.moveToNext() ? cursor.getString(A03.A00) : null;
                if (!android.text.TextUtils.isEmpty(string)) {
                    return string;
                }
                java.lang.String uuid = java.util.UUID.randomUUID().toString();
                android.content.ContentValues contentValues = new android.content.ContentValues(2);
                contentValues.put(A03.A01, uuid);
                contentValues.put(A02.A01, str);
                A05().insertOrThrow(A00(178, 6, 85), null, contentValues);
                if (cursor != null) {
                    cursor.close();
                }
                return uuid;
            } finally {
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        throw new java.lang.IllegalArgumentException(A00(125, 14, 87));
    }

    public final void A0D(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        try {
            A05().execSQL(A05);
        } catch (android.database.SQLException e) {
            com.facebook.ads.redexgen.core.TD A052 = c1632ge.A05();
            if (A01[0].charAt(14) != 'l') {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A01;
            strArr[7] = "zGpOEoeFk9mKuFaHfebiepQHWPBtYRlV";
            strArr[4] = "gQOnf7kUk2P1iMeHKJrfxPX4gK9wMRl8";
            if (A052.AAO()) {
                android.util.Log.e(A08, A00(76, 49, 60), e);
            }
        }
    }
}
