package com.helpshift.migrator.database;

/* loaded from: classes2.dex */
public class HSLegacySupportKeyValueStore extends android.database.sqlite.SQLiteOpenHelper {
    public static final java.lang.String KV_STORE_DB_NAME = "__hs__db_support_key_values";

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public HSLegacySupportKeyValueStore(android.content.Context context) {
        super(context, KV_STORE_DB_NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }
}
