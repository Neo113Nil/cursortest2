package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class TI extends android.database.sqlite.SQLiteOpenHelper {
    public static byte[] A01;
    public static java.lang.String[] A02 = {"XfAyR2vU0BibGbkW5sl", "72EQRqCB7z", "pQj0Q1BmcNSJNmsLpeVJ6qN75i73IOus", "lsxje2C6xdGld5UPkxYO", "GgAbEVzt1AOENmbxI3KXH96Z5ccDQ2lY", "3OXRqiMUeM1s", "WQkJsHQStWfxe", "yOid3ecrxpkgxviYKYk6NUThnYl"};
    public static final java.lang.String A03;
    public final com.facebook.ads.redexgen.core.TH A00;

    public static java.lang.String A00(int i, int i2, int i3) {
        byte[] copyOfRange = java.util.Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 67);
        }
        return new java.lang.String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-105, 101, -119, -118, -117, -122, -102, -111, -103, 101, 117, 0, com.google.common.base.Ascii.VT, 19, 4, 17, -33, 19, 0, 1, com.google.common.base.Ascii.VT, 4, -33, 36, 53, 36, 45, 51, 50, -33, 0, 3, 3, -33, 2, com.google.common.base.Ascii.SO, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.DC4, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.CR, -33, -122, -87, -119, -90, -71, -90, -89, -90, -72, -86, -115, -86, -79, -75, -86, -73, 101, -88, -90, -77, 101, -77, -76, -71, 101, -89, -86, 101, -77, -70, -79, -79, -16, -2, -5, -4, -52, 0, -19, -18, -8, -15, -52, -11, -14, -52, -15, 4, -11, -1, 0, -1, -52, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.RS, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.US, com.google.common.base.Ascii.DC4, 17, com.google.common.base.Ascii.US, -10, -8, -25, -19, -13, -25, -58, com.google.common.base.Ascii.FF, com.google.common.base.Ascii.NAK, com.google.common.base.Ascii.CAN, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.SI, com.google.common.base.Ascii.CR, com.google.common.base.Ascii.DC4, 5, 17, com.google.common.base.Ascii.VT, com.google.common.base.Ascii.US, com.google.common.base.Ascii.EM, -58, -29, -58, -11, -12, -31, -51, -48, -33, -111, -33, -102, -48, -50};
        if (A02[7].length() == 23) {
            throw new java.lang.RuntimeException();
        }
        java.lang.String[] strArr = A02;
        strArr[4] = "z4ETzKVSWwABxmvmOp0bWtQm6ZVGd83i";
        strArr[2] = "IiBR5v01IEKLzmVqyabUzMw7zaZ4VOx3";
    }

    static {
        A02();
        A03 = com.facebook.ads.redexgen.core.TI.class.getSimpleName();
    }

    public TI(com.facebook.ads.redexgen.core.C1632ge c1632ge, com.facebook.ads.redexgen.core.TH th) {
        super(c1632ge, A01(c1632ge), (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 4);
        if (th != null) {
            this.A00 = th;
            return;
        }
        throw new java.lang.IllegalArgumentException(A00(41, 32, 2));
    }

    public static java.lang.String A01(com.facebook.ads.redexgen.core.C1632ge c1632ge) {
        java.util.Locale locale = java.util.Locale.US;
        java.lang.Object[] objArr = {A00(0, 0, 19)};
        java.lang.String A00 = A00(126, 8, 41);
        java.lang.String format = java.lang.String.format(locale, A00, objArr);
        if (!com.facebook.ads.redexgen.core.C1086Up.A2k(c1632ge)) {
            return format;
        }
        java.lang.String defaultDbName = c1632ge.getPackageName();
        java.lang.String processName = com.facebook.ads.internal.util.process.ProcessUtils.getProcessName(c1632ge);
        if (!defaultDbName.equals(processName) && !android.text.TextUtils.isEmpty(processName)) {
            java.lang.String defaultDbName2 = java.lang.String.format(java.util.Locale.US, A00, '_' + processName);
            return defaultDbName2;
        }
        return format;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        for (com.facebook.ads.redexgen.core.TL tl : this.A00.A0M()) {
            tl.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        for (com.facebook.ads.redexgen.core.TL tl : this.A00.A0M()) {
            tl.A08(sQLiteDatabase);
            tl.A07(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        super.onOpen(sQLiteDatabase);
        if (!sQLiteDatabase.isReadOnly()) {
            sQLiteDatabase.execSQL(A00(101, 25, 99));
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 2 && i2 >= 3) {
            sQLiteDatabase.execSQL(A00(73, 28, 105));
        }
        if (i <= 3 && i2 >= 4) {
            com.facebook.ads.redexgen.core.TF tf = com.facebook.ads.redexgen.core.C1584fs.A02;
            sQLiteDatabase.execSQL(A00(11, 30, 124) + tf.A01 + A00(0, 1, 52) + tf.A02 + A00(1, 10, 2));
        }
    }
}
