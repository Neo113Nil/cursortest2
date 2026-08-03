package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class TH {
    public static byte[] A04;
    public static final java.lang.String A05;
    public static final java.util.concurrent.locks.Lock A06;
    public static final java.util.concurrent.locks.Lock A07;
    public static final java.util.concurrent.locks.ReentrantReadWriteLock A08;
    public android.database.sqlite.SQLiteOpenHelper A00;
    public final com.facebook.ads.redexgen.core.C1632ge A01;
    public final com.facebook.ads.redexgen.core.C1577fl A03 = new com.facebook.ads.redexgen.core.C1577fl(this);
    public final com.facebook.ads.redexgen.core.C1584fs A02 = new com.facebook.ads.redexgen.core.C1584fs(this);

    public static java.lang.String A05(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 17);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A07() {
        A04 = new byte[]{-82, -53, -82, 109, -117, 109, -116, 85, 118, -120, 120, -102, -64, -52, -55, -57, -102, Byte.MAX_VALUE, -87, -82, -88, -83, Byte.MAX_VALUE, 94, -118, -121, -117, -121, -110, 94, -93, -46, -47, -93, 87, -122, -119, 123, 124, -119, 87, 121, -112, 87, 85, -120, 122, -119, 85, -115, -60, -75, -78, -65, -78, -115, 110, 116, -82, -94, 94, 110, -101, -99, -55, -25, -12, -12, -11, -6, -90, -23, -25, -14, -14, -90, -19, -21, -6, -54, -25, -6, -25, -24, -25, -7, -21, -90, -20, -8, -11, -13, -90, -6, -18, -21, -90, -37, -49, -90, -6, -18, -8, -21, -25, -22, -89, -112, -126, -119, -126, Byte.MIN_VALUE, -111, 93, -79, -84, -88, -94, -85, -80, 107, -64, -69, -81, -84, -65, -80, -117, -29, -32, -13, -32, -31, -32, -14, -28, -112, -95, -112, -103, -97, -98, -116, -121, -125, 125, -122, -117};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final synchronized void A0J() {
        for (int i = 0; i < A0M().length; i++) {
        }
        if (this.A00 != null) {
            this.A00.close();
            this.A00 = null;
        }
    }

    static {
        A07();
        java.lang.StringBuilder append = new java.lang.StringBuilder().append(A05(107, 14, 44)).append(com.facebook.ads.redexgen.core.C1577fl.A03.A01);
        java.lang.String A052 = A05(58, 2, 113);
        java.lang.StringBuilder append2 = append.append(A052);
        java.lang.String A053 = A05(142, 6, 7);
        java.lang.StringBuilder append3 = append2.append(A053);
        java.lang.String A054 = A05(60, 1, 31);
        java.lang.StringBuilder append4 = append3.append(A054).append(com.facebook.ads.redexgen.core.C1577fl.A02.A01).append(A052);
        java.lang.String A055 = A05(136, 6, 26);
        A05 = append4.append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A04.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A05.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A0A.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A08.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A07.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A06.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A03.A01).append(A052).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A02.A01).append(A05(11, 6, 105)).append(A055).append(A05(17, 6, 78)).append(A053).append(A05(30, 4, 114)).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A09.A01).append(A05(0, 3, 125)).append(A053).append(A054).append(com.facebook.ads.redexgen.core.C1577fl.A03.A01).append(A05(34, 10, 38)).append(A055).append(A054).append(com.facebook.ads.redexgen.core.C1584fs.A08.A01).append(A05(7, 4, 36)).toString();
        A08 = new java.util.concurrent.locks.ReentrantReadWriteLock();
        A06 = A08.readLock();
        A07 = A08.writeLock();
    }

    public TH(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        this.A01 = c1632ge;
    }

    private synchronized android.database.sqlite.SQLiteDatabase A00() {
        if (this.A00 == null) {
            this.A00 = new com.facebook.ads.redexgen.core.TI(this.A01, this);
        }
        return this.A00.getWritableDatabase();
    }

    private synchronized android.database.sqlite.SQLiteDatabase A01() {
        android.database.sqlite.SQLiteException e = null;
        for (int i = 0; i < 10; i++) {
            try {
            } catch (android.database.sqlite.SQLiteException e2) {
                e = e2;
                try {
                    java.lang.Thread.sleep(100L);
                } catch (java.lang.InterruptedException unused) {
                }
            }
        }
        this.A01.A08().ABC(A05(128, 8, 110), com.facebook.ads.redexgen.core.AbstractC1048Td.A0v, new com.facebook.ads.redexgen.core.C1049Te(e));
        throw e;
        return A00();
    }

    public final int A08(int i) {
        A07.lock();
        try {
            return A0E().delete(A05(136, 6, 26), com.facebook.ads.redexgen.core.C1584fs.A02.A01 + A05(3, 4, 60), new java.lang.String[]{java.lang.String.valueOf(i - 1)});
        } finally {
            A07.unlock();
        }
    }

    public final android.database.Cursor A09() {
        A06.lock();
        try {
            return this.A02.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0A() {
        A06.lock();
        try {
            return this.A02.A0C();
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0B() {
        A06.lock();
        try {
            return this.A03.A0B();
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0C(int i) {
        A06.lock();
        try {
            return A0E().rawQuery(A05 + A05(23, 7, 45) + java.lang.String.valueOf(i), null);
        } finally {
            A06.unlock();
        }
    }

    public final android.database.Cursor A0D(java.lang.String str) {
        A06.lock();
        try {
            return this.A02.A0D(str);
        } finally {
            A06.unlock();
        }
    }

    public final android.database.sqlite.SQLiteDatabase A0E() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            return A01();
        }
        throw new java.lang.IllegalStateException(A05(64, 43, 117));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.TK != com.facebook.ads.internal.database.AdDatabaseQuery<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<T> */
    public final <T> android.os.AsyncTask A0F(com.facebook.ads.redexgen.core.TK<T> tk, com.facebook.ads.redexgen.core.UO<T> uo) {
        return com.facebook.ads.redexgen.core.YD.A00(com.facebook.ads.redexgen.core.YG.A07, new com.facebook.ads.redexgen.core.TG(this.A01, tk, uo), new java.lang.Void[0]);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
    public final android.os.AsyncTask A0G(final java.lang.String str, final int i, final java.lang.String str2, final double d, final double d2, final java.lang.String str3, final java.util.Map<java.lang.String, java.lang.String> data, com.facebook.ads.redexgen.core.UO<java.lang.String> uo) {
        return A0F(new com.facebook.ads.redexgen.core.AbstractC1544fE<java.lang.String>() { // from class: com.facebook.ads.redexgen.X.75
            public static byte[] A08;
            public static java.lang.String[] A09 = {"ZKW0rplATEIsE5gjt8qXTQnY", "r6HJdeSoORQdJfGxA0AnZWlkU33wQIlK", "lLZOtDHAe6uwMhK1fYaqg", "CFnqFcdcZfU1FaRsph1ThokBMpi4uqZk", "TONJvFd", "LRRDDC4", "oqOd7Km", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST};

            public static java.lang.String A01(int i2, int i3, int i4) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A08, i2, i2 + i3);
                for (int i5 = 0; i5 < copyOfRange.length; i5++) {
                    copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 122);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A02() {
                byte[] bArr = {56, 53, 72, 53, 54, 53, 71, 57};
                if (A09[2].length() == 32) {
                    throw new java.lang.RuntimeException();
                }
                A09[2] = "0lpDBp9tBU8jLddyd5eWZp";
                A08 = bArr;
            }

            static {
                A02();
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.core.TK
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final java.lang.String A03() {
                com.facebook.ads.redexgen.core.C1632ge c1632ge;
                java.util.concurrent.locks.Lock lock;
                java.util.concurrent.locks.Lock lock2;
                com.facebook.ads.redexgen.core.C1632ge c1632ge2;
                com.facebook.ads.redexgen.core.C1632ge c1632ge3;
                java.util.concurrent.locks.Lock lock3;
                com.facebook.ads.redexgen.core.C1632ge c1632ge4;
                com.facebook.ads.redexgen.core.C1584fs c1584fs;
                com.facebook.ads.redexgen.core.C1577fl c1577fl;
                java.util.concurrent.locks.Lock lock4;
                com.facebook.ads.redexgen.core.C1632ge c1632ge5;
                java.lang.String eventId = A01(0, 8, 90);
                c1632ge = com.facebook.ads.redexgen.core.TH.this.A01;
                c1632ge.A08().AA3(str2);
                if (android.text.TextUtils.isEmpty(str)) {
                    return null;
                }
                lock = com.facebook.ads.redexgen.core.TH.A07;
                lock.lock();
                android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
                try {
                    try {
                        sQLiteDatabase = com.facebook.ads.redexgen.core.TH.this.A0E();
                        sQLiteDatabase.beginTransaction();
                        c1584fs = com.facebook.ads.redexgen.core.TH.this.A02;
                        c1577fl = com.facebook.ads.redexgen.core.TH.this.A03;
                        java.lang.String A0E = c1584fs.A0E(c1577fl.A0C(str), i, str2, d, d2, str3, data);
                        sQLiteDatabase.setTransactionSuccessful();
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (java.lang.Exception e) {
                                c1632ge5 = com.facebook.ads.redexgen.core.TH.this.A01;
                                c1632ge5.A08().ABC(eventId, com.facebook.ads.redexgen.core.AbstractC1048Td.A0z, new com.facebook.ads.redexgen.core.C1049Te(e));
                            }
                        }
                        lock4 = com.facebook.ads.redexgen.core.TH.A07;
                        lock4.unlock();
                        return A0E;
                    } catch (java.lang.Exception e2) {
                        A01(com.facebook.ads.redexgen.core.TJ.A05);
                        c1632ge3 = com.facebook.ads.redexgen.core.TH.this.A01;
                        c1632ge3.A08().ABC(eventId, com.facebook.ads.redexgen.core.AbstractC1048Td.A0y, new com.facebook.ads.redexgen.core.C1049Te(e2));
                        if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (java.lang.Exception e3) {
                                c1632ge4 = com.facebook.ads.redexgen.core.TH.this.A01;
                                c1632ge4.A08().ABC(eventId, com.facebook.ads.redexgen.core.AbstractC1048Td.A0z, new com.facebook.ads.redexgen.core.C1049Te(e3));
                            }
                        }
                        lock3 = com.facebook.ads.redexgen.core.TH.A07;
                        lock3.unlock();
                        return null;
                    }
                } catch (java.lang.Throwable th) {
                    if (sQLiteDatabase != null) {
                        boolean isOpen = sQLiteDatabase.isOpen();
                        if (A09[5].length() != 7) {
                            throw new java.lang.RuntimeException();
                        }
                        A09[2] = "rWG930h";
                        if (isOpen) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (java.lang.Exception e4) {
                                c1632ge2 = com.facebook.ads.redexgen.core.TH.this.A01;
                                c1632ge2.A08().ABC(eventId, com.facebook.ads.redexgen.core.AbstractC1048Td.A0z, new com.facebook.ads.redexgen.core.C1049Te(e4));
                            }
                        }
                    }
                    lock2 = com.facebook.ads.redexgen.core.TH.A07;
                    lock2.unlock();
                    throw th;
                }
            }
        }, uo);
    }

    public final void A0H() {
        A07.lock();
        try {
            this.A02.A09();
            this.A03.A09();
        } finally {
            A07.unlock();
        }
    }

    public final void A0I() {
        A07.lock();
        try {
            this.A03.A0D(this.A01);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0K(java.lang.String str) {
        A07.lock();
        try {
            return this.A02.A0F(str);
        } finally {
            A07.unlock();
        }
    }

    public final boolean A0L(java.lang.String str) {
        boolean z;
        A07.lock();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(A05(121, 7, 90)).append(A05(136, 6, 26)).append(A05(44, 5, 36)).append(com.facebook.ads.redexgen.core.C1584fs.A02.A01).append(A05(61, 1, 32)).append(com.facebook.ads.redexgen.core.C1584fs.A02.A01).append(A05(56, 2, 50)).append(A05(49, 7, 92)).append(com.facebook.ads.redexgen.core.C1584fs.A04.A01).append(A05(62, 2, 77));
            A0E().execSQL(sb.toString(), new java.lang.String[]{str});
            z = true;
        } catch (android.database.sqlite.SQLiteException unused) {
            z = false;
        }
        A07.unlock();
        return z;
    }

    public final com.facebook.ads.redexgen.core.TL[] A0M() {
        return new com.facebook.ads.redexgen.core.TL[]{this.A03, this.A02};
    }
}
