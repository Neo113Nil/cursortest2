package com.ironsource.adqualitysdk.sdk.i;

/* loaded from: classes5.dex */
public final class ir {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static boolean f2571 = false;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static boolean f2572 = false;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f2573 = 1;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2574;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2575;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static final java.lang.String[] f2576;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2577;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private final com.ironsource.adqualitysdk.sdk.i.ir.d f2578;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private final android.database.sqlite.SQLiteDatabase f2579;

    /* renamed from: ﻛ, reason: contains not printable characters */
    static void m8094() {
        f2572 = true;
        f2571 = true;
        f2575 = 202;
        f2577 = new char[]{320, 299, 310, 309, 303, 323, 234, 263, 265, 297, 317, 318, 313, 316, 278, 275, 277, 271, 269, 281, 287, 280, 286, 242, 243};
    }

    static {
        m8094();
        java.lang.Object obj = null;
        f2576 = new java.lang.String[]{m8095(null, android.graphics.Color.blue(0) + 127, null, "\u0086\u0085\u0084").intern(), m8095(null, 127 - (android.view.ViewConfiguration.getScrollBarSize() >> 8), null, "\u0083\u0082\u0081").intern()};
        int i = f2573 + 71;
        f2574 = i % 128;
        if (i % 2 == 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    public ir(android.content.Context context, java.lang.String str) {
        com.ironsource.adqualitysdk.sdk.i.ir.d dVar = new com.ironsource.adqualitysdk.sdk.i.ir.d(context, str);
        this.f2578 = dVar;
        this.f2579 = dVar.getWritableDatabase();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m8097(java.lang.String str, java.lang.String str2) {
        int i = 2 % 2;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put(m8095(null, 128 - (android.os.SystemClock.elapsedRealtime() > 0L ? 1 : (android.os.SystemClock.elapsedRealtime() == 0L ? 0 : -1)), null, "\u0083\u0082\u0081").intern(), str2);
        if (this.f2579.update(m8095(null, android.graphics.Color.rgb(0, 0, 0) + 16777343, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), contentValues, m8095(null, 126 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), null, "\u0089\u0087\u0088\u0087\u0086\u0085\u0084").intern(), new java.lang.String[]{str}) == 0) {
            int i2 = f2573 + 99;
            f2574 = i2 % 128;
            int i3 = i2 % 2;
            contentValues.put(m8095(null, (android.view.ViewConfiguration.getEdgeSlop() >> 16) + 127, null, "\u0086\u0085\u0084").intern(), str);
            this.f2579.replace(m8095(null, 127 - android.widget.ExpandableListView.getPackedPositionGroup(0L), null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), null, contentValues);
            int i4 = f2573 + 53;
            f2574 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 2 % 2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0099, code lost:
    
        if (r15 != null) goto L20;
     */
    /* renamed from: ﾇ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final synchronized java.lang.String m8100(java.lang.String str) {
        java.lang.Throwable th;
        android.database.Cursor cursor;
        java.lang.String string;
        int i = 2 % 2;
        int i2 = f2573 + 65;
        f2574 = i2 % 128;
        int i3 = i2 % 2;
        try {
            cursor = this.f2579.query(m8095(null, (android.os.Process.getElapsedCpuTime() > 0L ? 1 : (android.os.Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), f2576, m8095(null, 128 - (android.view.ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (android.view.ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), null, "\u0089\u0087\u0088\u0087\u0086\u0085\u0084").intern(), new java.lang.String[]{str}, null, null, null);
            if (cursor != null) {
                int i4 = f2574 + 81;
                f2573 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    if (cursor.moveToNext()) {
                        int i6 = f2574 + 117;
                        f2573 = i6 % 128;
                        if (i6 % 2 == 0) {
                            string = cursor.getString(cursor.getColumnIndexOrThrow(m8095(null, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 46, null, "\u0083\u0082\u0081").intern()));
                            if (cursor != null) {
                                cursor.close();
                            }
                            return string;
                        }
                        string = cursor.getString(cursor.getColumnIndexOrThrow(m8095(null, (android.os.SystemClock.uptimeMillis() > 0L ? 1 : (android.os.SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 126, null, "\u0083\u0082\u0081").intern()));
                    }
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                        int i7 = f2574 + 63;
                        f2573 = i7 % 128;
                        if (i7 % 2 != 0) {
                            int i8 = 2 % 2;
                        }
                    }
                    throw th;
                }
            }
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (java.lang.Throwable th3) {
            th = th3;
            cursor = null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m8098(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2573 + 37;
        f2574 = i2 % 128;
        int i3 = i2 % 2;
        this.f2579.delete(m8095(null, 127 - (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16), null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), m8095(null, android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 127, null, "\u0089\u0088\u0086\u0085\u0084").intern(), new java.lang.String[]{str});
        int i4 = f2573 + 29;
        f2574 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0050, code lost:
    
        if (r19 <= 0) goto L14;
     */
    /* renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized java.util.HashMap<java.lang.String, java.lang.String> m8099(java.lang.String str, int i) {
        java.lang.String intern;
        java.lang.String[] strArr;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String[] strArr2;
        java.util.HashMap<java.lang.String, java.lang.String> hashMap;
        int i2 = 2 % 2;
        int i3 = f2573 + 21;
        f2574 = i3 % 128;
        android.database.Cursor cursor = null;
        try {
            if (i3 % 2 != 0) {
                java.lang.String replace = str.replace(kotlinx.serialization.json.internal.AbstractJsonLexerKt.UNICODE_ESC, '%');
                intern = m8095(null, 16777343 >> android.graphics.Color.rgb(1, 1, 0), null, "\u0089\u0087\u0092\u0091\u0090\u008f\u0087\u0086\u0085\u0084").intern();
                strArr = new java.lang.String[1];
                strArr[1] = replace;
                if (i <= 0) {
                    str3 = intern;
                    strArr2 = strArr;
                    str2 = null;
                }
                java.lang.String num = java.lang.Integer.toString(i);
                int i4 = f2574 + 15;
                f2573 = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 % 2;
                }
                str2 = num;
                str3 = intern;
                strArr2 = strArr;
            } else {
                java.lang.String replace2 = str.replace(io.ktor.util.date.GMTDateParser.ANY, '%');
                intern = m8095(null, android.graphics.Color.rgb(0, 0, 0) + 16777343, null, "\u0089\u0087\u0092\u0091\u0090\u008f\u0087\u0086\u0085\u0084").intern();
                strArr = new java.lang.String[]{replace2};
            }
            android.database.Cursor query = this.f2579.query(m8095(null, android.graphics.Color.alpha(0) + 127, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), f2576, str3, strArr2, null, null, null, str2);
            try {
                hashMap = new java.util.HashMap<>();
                while (query != null) {
                    if (!query.moveToNext()) {
                        break;
                    }
                    try {
                        hashMap.put(query.getString(query.getColumnIndexOrThrow(m8095(null, 127 - android.view.View.resolveSizeAndState(0, 0, 0), null, "\u0086\u0085\u0084").intern())), query.getString(query.getColumnIndexOrThrow(m8095(null, 127 - (android.view.ViewConfiguration.getDoubleTapTimeout() >> 16), null, "\u0083\u0082\u0081").intern())));
                        int i6 = 2 % 2;
                    } catch (java.lang.IllegalArgumentException unused) {
                    }
                }
                if (query != null) {
                    query.close();
                }
            } catch (java.lang.Throwable th) {
                th = th;
                cursor = query;
                if (cursor != null) {
                    cursor.close();
                    int i7 = f2574 + 21;
                    f2573 = i7 % 128;
                    int i8 = i7 % 2;
                    int i9 = 2 % 2;
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
        return hashMap;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized int m8096(java.lang.String str) {
        int i = 2 % 2;
        int i2 = f2574 + 3;
        f2573 = i2 % 128;
        int i3 = i2 % 2;
        android.database.Cursor cursor = null;
        try {
            cursor = this.f2579.query(m8095(null, android.view.Gravity.getAbsoluteGravity(0, 0) + 127, null, "\u0085\u008e\u008d\u008c\u008b\u008a\u0081\u0084").intern(), new java.lang.String[]{m8095(null, (android.view.ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u0099\u0083\u0082\u0081\u0098\u0097\u0096\u0095\u0094\u0093").intern()}, m8095(null, 127 - android.view.View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0089\u0087\u0092\u0091\u0090\u008f\u0087\u0086\u0085\u0084").intern(), new java.lang.String[]{str.replace(io.ktor.util.date.GMTDateParser.ANY, '%')}, null, null, null);
            if (cursor != null && cursor.moveToFirst()) {
                int i4 = cursor.getInt(0);
                if (cursor != null) {
                    cursor.close();
                    int i5 = 2 % 2;
                }
                return i4;
            }
            if (cursor != null) {
                cursor.close();
                int i6 = f2574 + 61;
                f2573 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 2 % 2;
                }
            }
            return 0;
        } catch (java.lang.Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    static class d extends android.database.sqlite.SQLiteOpenHelper {

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2580 = 1;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2581 = 0;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int f2582 = 0;

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static long f2583 = -2323451121645030069L;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static int f2584;

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            int i3 = 2 % 2;
            int i4 = f2582 + 39;
            f2580 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            java.lang.Object obj = null;
            super.hashCode();
            throw null;
        }

        public d(android.content.Context context, java.lang.String str) {
            super(context, str, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            int i = 2 % 2;
            int i2 = f2580 + 97;
            f2582 = i2 % 128;
            if (i2 % 2 == 0) {
                if (!sQLiteDatabase.isReadOnly()) {
                    int i3 = f2580 + 73;
                    f2582 = i3 % 128;
                    int i4 = i3 % 2;
                    sQLiteDatabase.execSQL(m8101((char) ((android.view.ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), "畋\ud95d熃\udfc1", "\u1f47祆\ue07f㬤", "幹\udf7f叩갃࠼斷ꧪꦷ\udaea湐ᕇ᪼푣䙀\u0d98ਛ늉瑭諐吹ຣ", 2138654239 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern());
                    int i5 = f2582 + 7;
                    f2580 = i5 % 128;
                    int i6 = i5 % 2;
                }
                sQLiteDatabase.execSQL(m8101((char) (4776 - (android.util.TypedValue.complexToFloat(0) > 0.0f ? 1 : (android.util.TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "畋\ud95d熃\udfc1", "鐍\ue7fd\ua8c7\ud912", "錝旞喓Ο\ue0da텲\uef12\uef8c᠓饈鮔솽欇\ue1de瀹\ue058\ue495碥藈ꡏ勖䏸ㄯ뛨㫳ျ䴷\ud8f7♇㜅恲苄敗绣\ud8ec⤂䐄ᨿ\udc24ꍔ䄠Ꭸ㼈켮\ue4a2フ잸Ƈꢗ䮎渒瑨囱웷ꌐ帠성\udfa4誙喇פֿ黋짖̹썄㌈沋", android.view.View.MeasureSpec.makeMeasureSpec(0, 0) - 941097580).intern());
                int i7 = f2582 + 67;
                f2580 = i7 % 128;
                int i8 = i7 % 2;
                return;
            }
            sQLiteDatabase.isReadOnly();
            throw null;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static java.lang.String m8101(char c, java.lang.String str, java.lang.String str2, java.lang.String str3, int i) {
            java.lang.String str4;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = cArr5;
            synchronized (com.ironsource.adqualitysdk.sdk.i.f.f2052) {
                char[] cArr7 = (char[]) cArr4.clone();
                char[] cArr8 = (char[]) cArr6.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr9 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.f.f2051 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.f.f2051 < length) {
                    int i2 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 2) % 4;
                    int i3 = (com.ironsource.adqualitysdk.sdk.i.f.f2051 + 3) % 4;
                    com.ironsource.adqualitysdk.sdk.i.f.f2053 = (char) (((cArr7[com.ironsource.adqualitysdk.sdk.i.f.f2051 % 4] * 32718) + cArr8[i2]) % 65535);
                    cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                    cArr7[i3] = com.ironsource.adqualitysdk.sdk.i.f.f2053;
                    cArr9[com.ironsource.adqualitysdk.sdk.i.f.f2051] = (char) ((((cArr7[i3] ^ cArr2[com.ironsource.adqualitysdk.sdk.i.f.f2051]) ^ f2583) ^ f2584) ^ f2581);
                    com.ironsource.adqualitysdk.sdk.i.f.f2051++;
                }
                str4 = new java.lang.String(cArr9);
            }
            return str4;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static java.lang.String m8095(java.lang.String str, int i, int[] iArr, java.lang.String str2) {
        byte[] bArr = str2;
        if (str2 != null) {
            bArr = str2.getBytes(com.google.android.exoplayer2.C.ISO88591_NAME);
        }
        byte[] bArr2 = bArr;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (com.ironsource.adqualitysdk.sdk.i.k.f2966) {
            char[] cArr3 = f2577;
            int i2 = f2575;
            if (f2571) {
                int length = bArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length;
                char[] cArr4 = new char[length];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr4[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[bArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] + i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr4);
            }
            if (f2572) {
                int length2 = cArr2.length;
                com.ironsource.adqualitysdk.sdk.i.k.f2965 = length2;
                char[] cArr5 = new char[length2];
                com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
                while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                    cArr5[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[cArr2[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                    com.ironsource.adqualitysdk.sdk.i.k.f2967++;
                }
                return new java.lang.String(cArr5);
            }
            int length3 = iArr.length;
            com.ironsource.adqualitysdk.sdk.i.k.f2965 = length3;
            char[] cArr6 = new char[length3];
            com.ironsource.adqualitysdk.sdk.i.k.f2967 = 0;
            while (com.ironsource.adqualitysdk.sdk.i.k.f2967 < com.ironsource.adqualitysdk.sdk.i.k.f2965) {
                cArr6[com.ironsource.adqualitysdk.sdk.i.k.f2967] = (char) (cArr3[iArr[(com.ironsource.adqualitysdk.sdk.i.k.f2965 - 1) - com.ironsource.adqualitysdk.sdk.i.k.f2967] - i] - i2);
                com.ironsource.adqualitysdk.sdk.i.k.f2967++;
            }
            return new java.lang.String(cArr6);
        }
    }
}
