package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.9w, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C9w implements com.facebook.ads.redexgen.core.InterfaceC2052nw {
    public static byte[] A05;
    public static java.lang.String[] A06 = {"xDo36q5CJhNrWsOc4rgAzQVAx", "Zg", "PxE083d5zJ8aaIHABfFNAkkkdmyhAK0f", "IKBV5UeodpiHWCvQ4", "aq", "Dab1stL8zsyR1UyyOB", "bulzcqFjtxPyO4baGqsDfIFqn", "1F8Ca2LGZvQNSSWsKAWhpLL3JBdOfpqY"};
    public static final java.lang.String A07;
    public static final java.lang.String[] A08;
    public boolean A00;
    public final com.facebook.ads.redexgen.core.C5O A01;
    public final java.lang.Object A02;
    public final java.lang.String A03;
    public final java.lang.String A04;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0598Bk A01(android.database.Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        com.facebook.ads.redexgen.core.C8 A02 = new com.facebook.ads.redexgen.core.C8((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(cursor.getString(0)), android.net.Uri.parse((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(cursor.getString(2)))).A01(cursor.getString(1)).A02(A09(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A052 = A02.A04(blob).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        com.facebook.ads.redexgen.core.C6 c6 = new com.facebook.ads.redexgen.core.C6();
        c6.A01 = cursor.getLong(13);
        c6.A00 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new com.facebook.ads.redexgen.core.C0598Bk(A052, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, c6);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 15
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:122)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:636)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:38)
     */
    public static com.facebook.ads.redexgen.core.C0598Bk A02(android.database.Cursor cursor) {
        com.facebook.ads.androidx.media3.exoplayer.offline.DownloadRequest A052 = new com.facebook.ads.redexgen.core.C8((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(cursor.getString(0)), android.net.Uri.parse((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(cursor.getString(2)))).A01(A05(cursor.getString(1))).A02(A09(cursor.getString(3))).A00(cursor.getString(4)).A03(cursor.getBlob(5)).A05();
        com.facebook.ads.redexgen.core.C6 c6 = new com.facebook.ads.redexgen.core.C6();
        c6.A01 = cursor.getLong(13);
        c6.A00 = cursor.getFloat(12);
        int i = cursor.getInt(6);
        return new com.facebook.ads.redexgen.core.C0598Bk(A052, i, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i == 4 ? cursor.getInt(11) : 0, c6);
    }

    public static java.lang.String A04(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 52);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A0B() {
        A05 = new byte[]{51, 66, 35, 44, 38, 66, 77, 36, 35, 77, 69, 78, com.google.common.base.Ascii.SI, 2, 70, 50, 35, 62, 50, 70, 54, 52, 47, 43, 39, 52, 63, 70, 45, 35, 63, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 3, 57, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, com.google.common.base.Ascii.SYN, 3, 70, 50, 35, 62, 50, 74, 19, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.SI, 70, 50, 35, 62, 50, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC4, 3, 7, com.google.common.base.Ascii.VT, 57, com.google.common.base.Ascii.CR, 3, com.google.common.base.Ascii.US, com.google.common.base.Ascii.NAK, 70, 50, 35, 62, 50, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 5, 19, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 9, com.google.common.base.Ascii.VT, 57, 5, 7, 5, com.google.common.base.Ascii.SO, 3, 57, com.google.common.base.Ascii.CR, 3, com.google.common.base.Ascii.US, 70, 50, 35, 62, 50, 74, 2, 7, com.google.common.base.Ascii.DC2, 7, 70, 36, 42, 41, 36, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.DC2, 3, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, 57, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 3, 57, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.NAK, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 19, com.google.common.base.Ascii.SYN, 2, 7, com.google.common.base.Ascii.DC2, 3, 57, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.VT, 3, 57, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.NAK, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 5, 9, 8, com.google.common.base.Ascii.DC2, 3, 8, com.google.common.base.Ascii.DC2, 57, 10, 3, 8, 1, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.SO, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DC2, 9, com.google.common.base.Ascii.SYN, 57, com.google.common.base.Ascii.DC4, 3, 7, com.google.common.base.Ascii.NAK, 9, 8, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 0, 7, com.google.common.base.Ascii.SI, 10, 19, com.google.common.base.Ascii.DC4, 3, 57, com.google.common.base.Ascii.DC4, 3, 7, com.google.common.base.Ascii.NAK, 9, 8, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.SYN, 3, com.google.common.base.Ascii.DC4, 5, 3, 8, com.google.common.base.Ascii.DC2, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 52, 35, 39, 42, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, 4, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC2, 3, com.google.common.base.Ascii.NAK, 57, 2, 9, 17, 8, 10, 9, 7, 2, 3, 2, 70, 47, 40, 50, 35, 33, 35, 52, 70, 40, 41, 50, 70, 40, 51, 42, 42, 74, com.google.common.base.Ascii.CR, 3, com.google.common.base.Ascii.US, 57, com.google.common.base.Ascii.NAK, 3, com.google.common.base.Ascii.DC2, 57, com.google.common.base.Ascii.SI, 2, 70, 36, 42, 41, 36, 70, 40, 41, 50, 70, 40, 51, 42, 42, 79, com.google.common.base.Ascii.EM, com.google.common.base.Ascii.VT, 118, 103, 112, 116, 97, 112, com.google.common.base.Ascii.NAK, 97, 116, 119, 121, 112, com.google.common.base.Ascii.NAK, 115, 101, 120, 103, com.google.common.base.Ascii.ETB, 99, 118, 117, 123, 114, com.google.common.base.Ascii.ETB, 126, 113, com.google.common.base.Ascii.ETB, 114, 111, 126, 100, 99, 100, com.google.common.base.Ascii.ETB, 49, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.ESC, 36, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CR, 17, 6, 48, com.google.common.base.Ascii.ESC, 3, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.ESC, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, 7, 106, com.google.common.base.Ascii.CAN, 50, 35, 35, 63, 58, 48, 50, 39, 58, 60, kotlin.io.encoding.Base64.padSymbol, 124, 55, 50, 32, 59, 120, 43, 62, 63, 121, 104, 104, 116, 113, 123, 121, 108, 113, 119, 118, 55, 110, 118, 124, 54, 117, 107, 53, 107, 107, 108, 106, 51, 96, 117, 116, 117, 100, 100, 120, 125, 119, 117, 96, 125, 123, 122, 59, 108, 57, 121, 100, 113, 115, 65, 70, 88, 70, 93, 80, 65, 87, 123, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 83, 74, 72, 75, 69, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 65, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 70, 74, 75, 81, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 81, 122, 73, com.google.common.primitives.SignedBytes.MAX_POWER_OF_TWO, 75, 66, 81, 77, 115, 101, 99, 100, Byte.MAX_VALUE, 125, 79, 115, 113, 115, 120, 117, 79, 123, 117, 105, com.google.common.base.Ascii.DC4, 17, 3, com.google.common.base.Ascii.CAN, 121, 124, 105, 124, 102, 97, 105, 108, 117, 114, 101, 95, 114, 101, 97, 115, 111, 110, 52, 48, 47, 42, 39, 52, 57, 125, 96, 125, 98, 70, 72, 84, 114, 94, 72, 89, 114, 68, 73, 53, 49, 53, kotlin.io.encoding.Base64.padSymbol, 7, 44, 33, 40, kotlin.io.encoding.Base64.padSymbol, Byte.MAX_VALUE, 106, 125, 108, 106, 97, 123, 80, 107, 96, 120, 97, 99, 96, 110, 107, 106, 107, 119, 119, com.google.common.base.Ascii.SYN, 17, 4, com.google.common.base.Ascii.ETB, 17, 58, 17, com.google.common.base.Ascii.FF, 8, 0, 58, 8, com.google.common.base.Ascii.SYN, 36, 35, 54, 37, 35, 8, 35, 62, 58, 50, 8, 58, 36, 119, com.google.common.base.Ascii.SYN, 4, com.google.common.base.Ascii.DC4, 109, 106, Byte.MAX_VALUE, 106, 123, 99, 100, 113, 100, 117, 48, 45, 48, 34, 51, 52, 47, 48, com.google.common.base.Ascii.US, 50, 37, 33, 51, 47, 46, 70, 65, 71, 80, 84, 88, 106, 94, 80, 76, 70, 79, 82, 79, 87, 94, 73, 76, 88, 93, 72, 89, 99, 72, 85, 81, 89, 99, 81, 79, 77, 74, 81, 38, 57, 52, 53, 63, Byte.MAX_VALUE, 40, 125, 37, 62, 59, 62, 63, 39, 62};
    }

    static {
        A0B();
        A07 = A07(3, 4);
        A08 = new java.lang.String[]{A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 119), A04(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 108), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16), A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 10, 25)};
    }

    public C9w(com.facebook.ads.redexgen.core.C5O c5o) {
        this(c5o, A04(0, 0, 21));
    }

    public C9w(com.facebook.ads.redexgen.core.C5O c5o, java.lang.String str) {
        this.A03 = str;
        this.A01 = c5o;
        this.A04 = A04(448, 18, 64) + str;
        this.A02 = new java.lang.Object();
    }

    private android.database.Cursor A00(java.lang.String str, java.lang.String[] strArr) throws com.facebook.ads.redexgen.core.C5N {
        try {
            java.lang.String sortOrder = A04(667, 17, 99);
            return this.A01.getReadableDatabase().query(this.A04, A08, str, strArr, null, null, sortOrder);
        } catch (android.database.sqlite.SQLiteException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    public static java.lang.String A05(java.lang.String str) {
        if (A04(582, 4, 68).equals(str)) {
            return A04(468, 20, 103);
        }
        if (A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_PLACEMENT_CAPPED, 3, 104).equals(str)) {
            return A04(515, 21, 32);
        }
        if (A04(652, 2, 48).equals(str)) {
            return A04(488, 27, 44);
        }
        return A04(742, 15, 100);
    }

    public static java.lang.String A06(java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> streamKeys) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (int i = 0; i < streamKeys.size(); i++) {
            com.facebook.ads.androidx.media3.common.StreamKey streamKey = streamKeys.get(i);
            java.lang.StringBuilder stringBuilder = sb.append(streamKey.A01);
            stringBuilder.append('.').append(streamKey.A00).append('.').append(streamKey.A02).append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static java.lang.String A07(int... iArr) {
        if (iArr.length == 0) {
            return A04(413, 1, 14);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(A04(684, 5, 42)).append(A04(6, 5, 89));
        for (int i = 0; i < iArr.length; i++) {
            if (i > 0) {
                sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.COMMA);
            }
            int i2 = iArr[i];
            int i3 = A06[5].length();
            if (i3 == 4) {
                throw new java.lang.RuntimeException();
            }
            java.lang.String[] strArr = A06;
            strArr[1] = "Jd";
            strArr[4] = "Ze";
            sb.append(i2);
        }
        sb.append(')');
        java.lang.String sb2 = sb.toString();
        java.lang.String[] strArr2 = A06;
        if (strArr2[0].length() != strArr2[6].length()) {
            return sb2;
        }
        java.lang.String[] strArr3 = A06;
        strArr3[1] = "5c";
        strArr3[4] = "cS";
        return sb2;
    }

    private java.util.List<com.facebook.ads.redexgen.core.C0598Bk> A08(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!com.facebook.ads.redexgen.core.C5C.A19(sQLiteDatabase, this.A04)) {
            return arrayList;
        }
        android.database.Cursor query = sQLiteDatabase.query(this.A04, new java.lang.String[]{A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 119), A04(720, 5, 15), A04(739, 3, 12), A04(709, 11, 1), A04(566, 16, 36), A04(586, 4, 41), A04(684, 5, 42), A04(654, 13, 81), A04(725, 14, 8), A04(552, 14, 17), A04(698, 11, 116), A04(590, 14, 52), A04(634, 18, 59), A04(536, 16, 16)}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                arrayList.add(A02(query));
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
        return arrayList;
    }

    public static java.util.List<com.facebook.ads.androidx.media3.common.StreamKey> A09(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (android.text.TextUtils.isEmpty(str)) {
            return arrayList;
        }
        java.lang.String[] strArr = A06;
        if (strArr[7].length() != strArr[2].length()) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr2 = A06;
        strArr2[0] = "JZKSAdXCo0Lu0XCPfhbdJS2vI";
        strArr2[6] = "3oo0vy2N0OZaC0WsxvSOxloxy";
        for (java.lang.String str2 : com.facebook.ads.redexgen.core.C5C.A1O(str, A04(com.facebook.internal.FacebookRequestErrorClassification.EC_APP_NOT_INSTALLED, 1, 1))) {
            java.lang.String[] A1O = com.facebook.ads.redexgen.core.C5C.A1O(str2, A04(466, 2, 2));
            com.facebook.ads.redexgen.core.AbstractC04203y.A08(A1O.length == 3);
            arrayList.add(new com.facebook.ads.androidx.media3.common.StreamKey(java.lang.Integer.parseInt(A1O[0]), java.lang.Integer.parseInt(A1O[1]), java.lang.Integer.parseInt(A1O[2])));
        }
        return arrayList;
    }

    private void A0A() throws com.facebook.ads.redexgen.core.C5N {
        synchronized (this.A02) {
            if (this.A00) {
                return;
            }
            try {
                android.database.sqlite.SQLiteDatabase readableDatabase = this.A01.getReadableDatabase();
                int A00 = com.facebook.ads.redexgen.core.C5Q.A00(readableDatabase, 0, this.A03);
                if (A00 != 3) {
                    android.database.sqlite.SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        com.facebook.ads.redexgen.core.C5Q.A04(writableDatabase, 0, this.A03, 3);
                        java.util.List<com.facebook.ads.redexgen.core.C0598Bk> A082 = A00 == 2 ? A08(writableDatabase) : new java.util.ArrayList<>();
                        writableDatabase.execSQL(A04(427, 21, 3) + this.A04);
                        writableDatabase.execSQL(A04(414, 13, 1) + this.A04 + A04(0, 1, 39) + A04(11, 401, 82));
                        java.util.Iterator<com.facebook.ads.redexgen.core.C0598Bk> it = A082.iterator();
                        while (it.hasNext()) {
                            A0C(it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                this.A00 = true;
            } catch (android.database.SQLException e) {
                throw new com.facebook.ads.redexgen.core.C5N(e);
            }
        }
    }

    private void A0C(com.facebook.ads.redexgen.core.C0598Bk c0598Bk, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c0598Bk.A07.A06 == null ? com.facebook.ads.redexgen.core.C5C.A07 : c0598Bk.A07.A06;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_INIT_TIMEOUT, 2, 119), c0598Bk.A07.A02);
        contentValues.put(A04(com.unity3d.mediation.LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, 9, 108), c0598Bk.A07.A03);
        contentValues.put(A04(739, 3, 12), c0598Bk.A07.A00.toString());
        contentValues.put(A04(709, 11, 1), A06(c0598Bk.A07.A04));
        contentValues.put(A04(566, 16, 36), c0598Bk.A07.A01);
        contentValues.put(A04(586, 4, 41), c0598Bk.A07.A05);
        contentValues.put(A04(684, 5, 42), java.lang.Integer.valueOf(c0598Bk.A02));
        contentValues.put(A04(654, 13, 81), java.lang.Long.valueOf(c0598Bk.A05));
        contentValues.put(A04(725, 14, 8), java.lang.Long.valueOf(c0598Bk.A06));
        contentValues.put(A04(552, 14, 17), java.lang.Long.valueOf(c0598Bk.A04));
        contentValues.put(A04(698, 11, 116), java.lang.Integer.valueOf(c0598Bk.A03));
        contentValues.put(A04(590, 14, 52), java.lang.Integer.valueOf(c0598Bk.A01));
        contentValues.put(A04(634, 18, 59), java.lang.Float.valueOf(c0598Bk.A00()));
        contentValues.put(A04(536, 16, 16), java.lang.Long.valueOf(c0598Bk.A01()));
        contentValues.put(A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_NO_CONFIG, 10, 25), bArr);
        sQLiteDatabase.replaceOrThrow(this.A04, null, contentValues);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0611Bx
    public final com.facebook.ads.redexgen.core.C0598Bk A7q(java.lang.String str) throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            android.database.Cursor A00 = A00(A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 105), new java.lang.String[]{str});
            try {
                if (A00.getCount() == 0) {
                    if (A00 != null) {
                        A00.close();
                        return null;
                    }
                    return null;
                }
                A00.moveToNext();
                com.facebook.ads.redexgen.core.C0598Bk A01 = A01(A00);
                if (A00 != null) {
                    A00.close();
                }
                return A01;
            } finally {
            }
        } catch (android.database.sqlite.SQLiteException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0611Bx
    public final com.facebook.ads.redexgen.core.C2059o4 A7r(int... iArr) throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        return new com.facebook.ads.redexgen.core.C2059o4(A00(A07(iArr), null));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2052nw
    public final void AHF(com.facebook.ads.redexgen.core.C0598Bk c0598Bk) throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.A01.getWritableDatabase();
            A0C(c0598Bk, writableDatabase);
        } catch (android.database.sqlite.SQLiteException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2052nw
    public final void AIR(java.lang.String str) throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            this.A01.getWritableDatabase().delete(this.A04, A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 105), new java.lang.String[]{str});
        } catch (android.database.sqlite.SQLiteException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2052nw
    public final void AJO() throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(A04(684, 5, 42), (java.lang.Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, A04(689, 9, 36), null);
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2052nw
    public final void AJp() throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(A04(684, 5, 42), (java.lang.Integer) 5);
            contentValues.put(A04(590, 14, 52), (java.lang.Integer) 0);
            this.A01.getWritableDatabase().update(this.A04, contentValues, null, null);
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2052nw
    public final void AJq(int i) throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(A04(698, 11, 116), java.lang.Integer.valueOf(i));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07, null);
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2052nw
    public final void AJr(java.lang.String str, int i) throws com.facebook.ads.redexgen.core.C5N {
        A0A();
        try {
            android.content.ContentValues contentValues = new android.content.ContentValues();
            contentValues.put(A04(698, 11, 116), java.lang.Integer.valueOf(i));
            this.A01.getWritableDatabase().update(this.A04, contentValues, A07 + A04(1, 5, 86) + A04(com.ironsource.mediationsdk.logger.IronSourceError.ERROR_BN_INSTANCE_RELOAD_TIMEOUT, 6, 105), new java.lang.String[]{str});
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }
}
