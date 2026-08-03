package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1849kQ implements com.facebook.ads.redexgen.core.InterfaceC0876Mh {
    public static byte[] A04;
    public static final java.lang.String[] A05;
    public java.lang.String A00;
    public java.lang.String A01;
    public final android.util.SparseArray<com.facebook.ads.redexgen.core.C0875Mg> A02 = new android.util.SparseArray<>();
    public final com.facebook.ads.redexgen.core.C5O A03;

    public static java.lang.String A01(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 1);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        A04 = new byte[]{55, 43, 106, 103, 35, 74, 77, 87, 70, 68, 70, 81, 35, 83, 81, 74, 78, 66, 81, 90, 35, 72, 70, 90, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 104, 102, 122, 35, 87, 70, 91, 87, 35, 77, 76, 87, 35, 77, 86, 79, 79, 47, 110, 102, 119, 98, 103, 98, 119, 98, 35, 65, 79, 76, 65, 35, 77, 76, 87, 35, 77, 86, 79, 79, 42, 46, 63, 40, 44, 57, 40, 77, 57, 44, 47, 33, 40, 77, 6, com.google.common.base.Ascii.DLE, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC2, 98, com.google.common.base.Ascii.SYN, 3, 0, com.google.common.base.Ascii.SO, 7, 98, com.google.common.base.Ascii.VT, 4, 98, 7, com.google.common.base.Ascii.SUB, com.google.common.base.Ascii.VT, 17, com.google.common.base.Ascii.SYN, 17, 98, 41, com.google.common.base.Ascii.DC4, 3, 60, 0, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.NAK, 9, com.google.common.base.Ascii.RS, 47, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.SI, 4, 9, 37, 2, 8, 9, com.google.common.base.Ascii.DC4, 88, 85, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.US, 91, 70, 91, 68, 79, 65, 93, 109, 101, 116, 97, 100, 97, 116, 97};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AAs(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap, android.util.SparseArray<java.lang.String> sparseArray) throws java.io.IOException {
        com.facebook.ads.redexgen.core.C1846kN A02;
        com.facebook.ads.redexgen.core.AbstractC04203y.A08(this.A02.size() == 0);
        try {
            if (com.facebook.ads.redexgen.core.C5Q.A00(this.A03.getReadableDatabase(), 1, (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00)) != 1) {
                android.database.sqlite.SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    A04(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            android.database.Cursor A00 = A00();
            while (A00.moveToNext()) {
                try {
                    int i = A00.getInt(0);
                    java.lang.String str = (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(A00.getString(1));
                    A02 = com.facebook.ads.redexgen.core.C0877Mi.A02(new java.io.DataInputStream(new java.io.ByteArrayInputStream(A00.getBlob(2))));
                    com.facebook.ads.redexgen.core.C0875Mg c0875Mg = new com.facebook.ads.redexgen.core.C0875Mg(i, str, A02);
                    hashMap.put(c0875Mg.A02, c0875Mg);
                    sparseArray.put(c0875Mg.A01, c0875Mg.A02);
                } finally {
                }
            }
            if (A00 != null) {
                A00.close();
            }
        } catch (android.database.sqlite.SQLiteException e) {
            hashMap.clear();
            sparseArray.clear();
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AKJ(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap) throws java.io.IOException {
        if (this.A02.size() == 0) {
            return;
        }
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            for (int i = 0; i < this.A02.size(); i++) {
                try {
                    com.facebook.ads.redexgen.core.C0875Mg valueAt = this.A02.valueAt(i);
                    if (valueAt == null) {
                        A05(writableDatabase, this.A02.keyAt(i));
                    } else {
                        A06(writableDatabase, valueAt);
                    }
                } finally {
                    writableDatabase.endTransaction();
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.A02.clear();
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    static {
        A03();
        A05 = new java.lang.String[]{A01(128, 2, 48), A01(136, 3, 37), A01(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 8, 1)};
    }

    public C1849kQ(com.facebook.ads.redexgen.core.C5O c5o) {
        this.A03 = c5o;
    }

    private android.database.Cursor A00() {
        return this.A03.getReadableDatabase().query((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01), A05, null, null, null, null, null);
    }

    public static java.lang.String A02(java.lang.String str) {
        return A01(109, 19, 109) + str;
    }

    private void A04(android.database.sqlite.SQLiteDatabase sQLiteDatabase) throws com.facebook.ads.redexgen.core.C5N {
        com.facebook.ads.redexgen.core.C5Q.A04(sQLiteDatabase, 1, (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00), 1);
        A07(sQLiteDatabase, (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01));
        sQLiteDatabase.execSQL(A01(75, 13, 108) + this.A01 + A01(0, 1, 22) + A01(1, 74, 2));
    }

    private void A05(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i) {
        sQLiteDatabase.delete((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01), A01(130, 6, 122), new java.lang.String[]{java.lang.Integer.toString(i)});
    }

    private void A06(android.database.sqlite.SQLiteDatabase sQLiteDatabase, com.facebook.ads.redexgen.core.C0875Mg c0875Mg) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.facebook.ads.redexgen.core.C0877Mi.A08(c0875Mg.A03(), new java.io.DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(A01(128, 2, 48), java.lang.Integer.valueOf(c0875Mg.A01));
        contentValues.put(A01(136, 3, 37), c0875Mg.A02);
        contentValues.put(A01(androidx.media3.extractor.ts.TsExtractor.TS_STREAM_TYPE_DTS_UHD, 8, 1), byteArray);
        sQLiteDatabase.replaceOrThrow((java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A01), null, contentValues);
    }

    public static void A07(android.database.sqlite.SQLiteDatabase sQLiteDatabase, java.lang.String str) {
        sQLiteDatabase.execSQL(A01(88, 21, 67) + str);
    }

    public static void A08(com.facebook.ads.redexgen.core.C5O c5o, java.lang.String str) throws com.facebook.ads.redexgen.core.C5N {
        try {
            java.lang.String A02 = A02(str);
            android.database.sqlite.SQLiteDatabase writableDatabase = c5o.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                com.facebook.ads.redexgen.core.C5Q.A03(writableDatabase, 1, str);
                A07(writableDatabase, A02);
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void A5p() throws com.facebook.ads.redexgen.core.C5N {
        A08(this.A03, (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final boolean A6S() throws com.facebook.ads.redexgen.core.C5N {
        try {
            return com.facebook.ads.redexgen.core.C5Q.A00(this.A03.getReadableDatabase(), 1, (java.lang.String) com.facebook.ads.redexgen.core.AbstractC04203y.A01(this.A00)) != -1;
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AAF(long j) {
        this.A00 = java.lang.Long.toHexString(j);
        this.A01 = A02(this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AFd(com.facebook.ads.redexgen.core.C0875Mg c0875Mg, boolean z) {
        if (z) {
            this.A02.delete(c0875Mg.A01);
        } else {
            this.A02.put(c0875Mg.A01, null);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AGK(com.facebook.ads.redexgen.core.C0875Mg c0875Mg) {
        this.A02.put(c0875Mg.A01, c0875Mg);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC0876Mh
    public final void AKI(java.util.HashMap<java.lang.String, com.facebook.ads.redexgen.core.C0875Mg> hashMap) throws java.io.IOException {
        try {
            android.database.sqlite.SQLiteDatabase writableDatabase = this.A03.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                A04(writableDatabase);
                java.util.Iterator<com.facebook.ads.redexgen.core.C0875Mg> it = hashMap.values().iterator();
                while (it.hasNext()) {
                    A06(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.A02.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (android.database.SQLException e) {
            throw new com.facebook.ads.redexgen.core.C5N(e);
        }
    }
}
