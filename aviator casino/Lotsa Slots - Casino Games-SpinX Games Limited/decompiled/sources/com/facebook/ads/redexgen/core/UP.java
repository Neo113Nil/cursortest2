package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class UP {
    public static byte[] A00;
    public static java.lang.String[] A01 = {"DnTt6XIWuAOQU1Yv6ovRwSY", "69qI84ufJ2UhBtkQx2IBHzZ", "lNRa3H", "2y2Uq0vrRuc5d5uHsu4hqSSezWuXbHLJ", "zUBzfUPcj8uIEo8tGSc", "tyrfQSxRYtG07uuggB4oX54vdLL3Tqsi", "aO8Ix6JCuD3GiDZZv02FTTQkozyjIQFp", "pMzofq8cn4xP4Da44trMpLQAQtlXLUTp"};

    public static java.lang.String A02(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A03() {
        java.lang.String[] strArr = A01;
        if (strArr[1].length() != strArr[0].length()) {
            throw new java.lang.RuntimeException();
        }
        A01[4] = "";
        A00 = new byte[]{3, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.RS, 3, com.google.common.base.Ascii.NAK, 46, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.DLE, 5, com.google.common.base.Ascii.DLE, 19, com.google.common.base.Ascii.DLE, 2, com.google.common.base.Ascii.DC4};
    }

    static {
        A03();
    }

    public static com.facebook.ads.redexgen.core.UR A00(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        try {
            return new com.facebook.ads.redexgen.core.ZD(c1632ge);
        } catch (java.io.IOException e) {
            c1632ge.A08().ABC(A02(0, 15, 104), com.facebook.ads.redexgen.core.AbstractC1048Td.A2K, new com.facebook.ads.redexgen.core.C1049Te(e));
            return new com.facebook.ads.redexgen.core.ZG();
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.facebook.ads.redexgen.X.71] */
    public static com.facebook.ads.redexgen.core.AnonymousClass71 A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        return new com.facebook.ads.redexgen.core.ZH(c1632ge) { // from class: com.facebook.ads.redexgen.X.71
            public static byte[] A03;
            public static java.lang.String[] A04 = {"u3ex4KQMIW041lf", "3AptpGjhH", "gmUldlaQs1iDW8SjyulR1SveXx4W0WHx", "1qDQcvNZxrP96rda7KCur1LyuVNWU8kp", "CAWPS90lsy", "t8qLCZBFlDEhGKoHyGYF6SljofbMSV", "olmaGtOYwcY5nta5it0d5AQEWYClhN", "QuuHkAQHaV7iF"};
            public boolean A00 = true;
            public final com.facebook.ads.redexgen.core.C1632ge A01;
            public final com.facebook.ads.redexgen.core.TH A02;

            public static java.lang.String A00(int i, int i2, int i3) {
                byte[] copyOfRange = java.util.Arrays.copyOfRange(A03, i, i + i2);
                for (int i4 = 0; i4 < copyOfRange.length; i4++) {
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 64);
                }
                return new java.lang.String(copyOfRange);
            }

            public static void A04() {
                A03 = new byte[]{-37, -7, 6, -65, com.google.common.base.Ascii.FF, -72, -4, -3, 4, -3, com.google.common.base.Ascii.FF, -3, -72, -7, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.FF, -3, 5, 8, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, -72, -3, com.google.common.base.Ascii.DLE, -5, -3, -3, -4, -3, -4, -72, -3, com.google.common.base.Ascii.SO, -3, 6, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.VT, -58, -87, -84, -66, -79, -84, -1, com.google.common.base.Ascii.DC2, com.google.common.base.Ascii.DC2, 3, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.DC2, 8, 5, com.google.common.base.Ascii.CAN, 5, -75, -80, -33, -47, -33, -33, -43, -37, -38, -53, -43, -48, -51, -65, -51, -51, -61, -55, -56, -71, -50, -61, -57, -65, com.google.common.base.Ascii.DC2, 7, com.google.common.base.Ascii.VT, 3, 3, -2, -6, -12, -3, -18, -8, -13, -18, -13, -22, -33};
            }

            static {
                A04();
            }

            {
                this.A01 = c1632ge;
                this.A02 = new com.facebook.ads.redexgen.core.TH(c1632ge);
            }

            private org.json.JSONArray A01(android.database.Cursor cursor) throws org.json.JSONException {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(A00(54, 2, 12), cursor.getString(com.facebook.ads.redexgen.core.C1584fs.A04.A00));
                    jSONObject.put(A00(82, 8, 79), cursor.getString(com.facebook.ads.redexgen.core.C1584fs.A09.A00));
                    jSONObject.put(A00(90, 4, 58), cursor.getString(com.facebook.ads.redexgen.core.C1584fs.A0A.A00));
                    jSONObject.put(A00(78, 4, 94), com.facebook.ads.redexgen.core.Y1.A03(cursor.getDouble(com.facebook.ads.redexgen.core.C1584fs.A08.A00)));
                    jSONObject.put(A00(66, 12, 26), com.facebook.ads.redexgen.core.Y1.A03(cursor.getDouble(com.facebook.ads.redexgen.core.C1584fs.A07.A00)));
                    jSONObject.put(A00(56, 10, 44), cursor.getString(com.facebook.ads.redexgen.core.C1584fs.A06.A00));
                    java.lang.String string = cursor.getString(com.facebook.ads.redexgen.core.C1584fs.A03.A00);
                    jSONObject.put(A00(50, 4, 100), string != null ? new org.json.JSONObject(string) : new org.json.JSONObject());
                    jSONObject.put(A00(43, 7, 94), cursor.getString(com.facebook.ads.redexgen.core.C1584fs.A02.A00));
                    jSONObject.put(A00(38, 5, 8), this.A01.A04().A8N());
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            private org.json.JSONArray A02(android.database.Cursor cursor) throws org.json.JSONException {
                org.json.JSONArray jSONArray = new org.json.JSONArray();
                cursor.moveToPosition(-1);
                while (cursor.moveToNext()) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put(A00(54, 2, 12), cursor.getString(2));
                    jSONObject.put(A00(82, 8, 79), cursor.getString(0));
                    jSONObject.put(A00(90, 4, 58), cursor.getString(4));
                    jSONObject.put(A00(78, 4, 94), com.facebook.ads.redexgen.core.Y1.A03(cursor.getDouble(5)));
                    jSONObject.put(A00(66, 12, 26), com.facebook.ads.redexgen.core.Y1.A03(cursor.getDouble(6)));
                    jSONObject.put(A00(56, 10, 44), cursor.getString(7));
                    java.lang.String string = cursor.getString(8);
                    jSONObject.put(A00(50, 4, 100), string != null ? new org.json.JSONObject(string) : new org.json.JSONObject());
                    jSONObject.put(A00(43, 7, 94), cursor.getString(9));
                    jSONObject.put(A00(38, 5, 8), this.A01.A04().A8N());
                    jSONArray.put(jSONObject);
                }
                return jSONArray;
            }

            public static org.json.JSONObject A03(android.database.Cursor cursor) throws org.json.JSONException {
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                while (cursor.moveToNext()) {
                    jSONObject.put(cursor.getString(com.facebook.ads.redexgen.core.C1577fl.A03.A00), cursor.getString(com.facebook.ads.redexgen.core.C1577fl.A02.A00));
                }
                return jSONObject;
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final int A50(int i) {
                int i2 = 0;
                if (i > -1) {
                    try {
                        i2 = this.A02.A08(i);
                    } catch (java.lang.Exception e) {
                        if (this.A01.A05().AAO()) {
                            android.util.Log.e(com.facebook.ads.redexgen.core.ZH.A00, A00(0, 38, 88), e);
                        }
                    }
                }
                this.A02.A0I();
                if (this.A00) {
                    this.A02.A0J();
                }
                return i2;
            }

            @Override // com.facebook.ads.redexgen.core.UR
            public final void A51() {
                this.A02.A0H();
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final boolean A5q(java.lang.String str) {
                return this.A02.A0K(str);
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final org.json.JSONArray A6s() {
                android.database.Cursor cursor = null;
                try {
                    cursor = this.A02.A0A();
                    org.json.JSONArray jSONArray = null;
                    if (cursor.getCount() > 0) {
                        jSONArray = A01(cursor);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return jSONArray;
                } catch (org.json.JSONException unused) {
                    if (cursor != null) {
                        cursor.close();
                        return null;
                    }
                    return null;
                } catch (java.lang.Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final org.json.JSONObject A6t() {
                android.database.Cursor cursor = null;
                try {
                    cursor = this.A02.A0B();
                    org.json.JSONObject jSONObject = null;
                    if (cursor.getCount() > 0) {
                        jSONObject = A03(cursor);
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return jSONObject;
                } catch (org.json.JSONException unused) {
                    if (cursor != null) {
                        cursor.close();
                        return null;
                    }
                    return null;
                } catch (java.lang.Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final int A82() {
                android.database.Cursor cursor = null;
                try {
                    cursor = this.A02.A09();
                    return cursor.moveToFirst() ? cursor.getInt(0) : 0;
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final java.lang.String A85(java.lang.String str) {
                java.lang.String str2 = null;
                android.database.Cursor A0D = this.A02.A0D(str);
                if (A0D != null) {
                    boolean moveToNext = A0D.moveToNext();
                    java.lang.String[] strArr = A04;
                    java.lang.String str3 = strArr[4];
                    java.lang.String eventType = strArr[0];
                    if (str3.length() == eventType.length()) {
                        throw new java.lang.RuntimeException();
                    }
                    java.lang.String[] strArr2 = A04;
                    strArr2[4] = "rCLG4kGmKo";
                    strArr2[0] = "2rihfjjJxsL3teC";
                    if (moveToNext && A0D.getCount() > 0) {
                        java.lang.String eventType2 = com.facebook.ads.redexgen.core.C1584fs.A0A.A01;
                        str2 = A0D.getString(A0D.getColumnIndex(eventType2));
                    }
                    A0D.close();
                }
                return str2;
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final android.util.Pair<org.json.JSONObject, org.json.JSONArray> A9I(int i) {
                android.database.Cursor cursor = null;
                try {
                    try {
                        cursor = this.A02.A0C(i);
                        org.json.JSONArray events = null;
                        org.json.JSONObject tokens = null;
                        if (cursor.getCount() > 0) {
                            tokens = A03(cursor);
                            events = A02(cursor);
                        }
                        android.util.Pair<org.json.JSONObject, org.json.JSONArray> pair = new android.util.Pair<>(tokens, events);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return pair;
                    } catch (org.json.JSONException unused) {
                        android.util.Pair<org.json.JSONObject, org.json.JSONArray> pair2 = new android.util.Pair<>(null, null);
                        if (cursor != null) {
                            cursor.close();
                        }
                        return pair2;
                    }
                } catch (java.lang.Throwable th) {
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            }

            @Override // com.facebook.ads.redexgen.core.UQ
            public final boolean AA5(java.lang.String str) {
                return this.A02.A0L(str);
            }

            /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.UO != com.facebook.ads.internal.eventstorage.AdEventStorageCallback<java.lang.String> */
            @Override // com.facebook.ads.redexgen.core.UR
            public final void AL6(com.facebook.ads.redexgen.core.V7 v7, com.facebook.ads.redexgen.core.UO<java.lang.String> uo) {
                this.A02.A0G(v7.A08(), v7.A05().A00, v7.A06().toString(), v7.A04(), v7.A03(), v7.A07(), v7.A09(), uo);
            }
        };
    }
}
