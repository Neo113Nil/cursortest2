package com.google.android.exoplayer2.database;

/* loaded from: classes3.dex */
public class StandaloneDatabaseProvider extends android.database.sqlite.SQLiteOpenHelper implements com.google.android.exoplayer2.database.DatabaseProvider {
    public static final java.lang.String DATABASE_NAME = "exoplayer_internal.db";
    private static final java.lang.String TAG = "SADatabaseProvider";
    private static final int VERSION = 1;

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public StandaloneDatabaseProvider(android.content.Context context) {
        super(context.getApplicationContext(), "exoplayer_internal.db", (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        wipeDatabase(sQLiteDatabase);
    }

    private static void wipeDatabase(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        android.database.Cursor query = sQLiteDatabase.query("sqlite_master", new java.lang.String[]{"type", "name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                java.lang.String string = query.getString(0);
                java.lang.String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    java.lang.String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (android.database.SQLException e) {
                        com.google.android.exoplayer2.util.Log.e(TAG, "Error executing " + str, e);
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
}
