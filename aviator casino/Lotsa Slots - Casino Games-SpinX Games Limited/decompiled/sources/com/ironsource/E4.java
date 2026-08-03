package com.ironsource;

/* loaded from: classes5.dex */
public class E4 extends android.database.sqlite.SQLiteOpenHelper {

    /* renamed from: a, reason: collision with root package name */
    private static com.ironsource.D4 f5680a = new com.ironsource.D4();

    public E4(android.content.Context context) {
        super(context, "reports", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    public static void a(com.ironsource.K5 k5) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase a2 = f5680a.a(true, new com.ironsource.E4(com.ironsource.C3180n4.d().a()));
            try {
                a2.beginTransaction();
                android.content.ContentValues contentValues = new android.content.ContentValues();
                java.lang.String e = k5.e();
                java.lang.String b = k5.b();
                java.lang.String d = k5.d();
                contentValues.put("stack_trace", e);
                contentValues.put("crash_date", b);
                contentValues.put("crashType", d);
                a2.insert("REPORTS", null, contentValues);
                a2.setTransactionSuccessful();
                a2.endTransaction();
                a2.close();
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = a2;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.endTransaction();
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static com.ironsource.K5 b(int i) {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase a2 = f5680a.a(new com.ironsource.E4(com.ironsource.C3180n4.d().a()));
            try {
                android.database.Cursor rawQuery = a2.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
                int i2 = rawQuery.getInt(0);
                java.lang.String string = rawQuery.getString(1);
                java.lang.String string2 = rawQuery.getString(2);
                java.lang.String string3 = rawQuery.getString(3);
                rawQuery.close();
                com.ironsource.K5 k5 = new com.ironsource.K5(i2, string, string2, string3);
                a2.close();
                return k5;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = a2;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    public static android.database.Cursor c() {
        com.ironsource.E4 e4 = new com.ironsource.E4(com.ironsource.C3180n4.d().a());
        new java.util.ArrayList();
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            android.database.sqlite.SQLiteDatabase a2 = f5680a.a(e4);
            try {
                android.database.Cursor rawQuery = a2.rawQuery("SELECT * FROM REPORTS;", null);
                a2.close();
                return rawQuery;
            } catch (java.lang.Throwable th) {
                th = th;
                sQLiteDatabase = a2;
                if (sQLiteDatabase != null) {
                    sQLiteDatabase.close();
                }
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS REPORTS(id INTEGER PRIMARY KEY AUTOINCREMENT , stack_trace TEXT NOT NULL, crash_date TEXT NOT NULL,crashType TEXT NOT NULL );");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public static android.database.Cursor a(int i) {
        android.database.sqlite.SQLiteDatabase a2;
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            a2 = f5680a.a(new com.ironsource.E4(com.ironsource.C3180n4.d().a()));
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            android.database.Cursor rawQuery = a2.rawQuery("SELECT * FROM REPORTSWHERE id= " + i + ";", null);
            a2.close();
            return rawQuery;
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteDatabase = a2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static java.util.List<com.ironsource.K5> b() {
        android.database.sqlite.SQLiteDatabase a2;
        com.ironsource.E4 e4 = new com.ironsource.E4(com.ironsource.C3180n4.d().a());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            a2 = f5680a.a(e4);
        } catch (java.lang.Throwable th) {
            th = th;
        }
        try {
            android.database.Cursor rawQuery = a2.rawQuery("SELECT * FROM REPORTS ;", null);
            if (rawQuery.moveToFirst()) {
                do {
                    arrayList.add(new com.ironsource.K5(rawQuery.getInt(0), rawQuery.getString(1), rawQuery.getString(2), rawQuery.getString(3)));
                } while (rawQuery.moveToNext());
            }
            rawQuery.close();
            a2.close();
            return arrayList;
        } catch (java.lang.Throwable th2) {
            th = th2;
            sQLiteDatabase = a2;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public static void a() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = null;
        try {
            sQLiteDatabase = f5680a.a(true, new com.ironsource.E4(com.ironsource.C3180n4.d().a()));
            sQLiteDatabase.execSQL("DELETE FROM REPORTS WHERE id >= 0;");
            sQLiteDatabase.close();
        } catch (java.lang.Throwable th) {
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }
}
