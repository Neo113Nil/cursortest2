package com.helpshift.migrator.database;

/* loaded from: classes2.dex */
public class HSNativeSDKUserDBHelper extends android.database.sqlite.SQLiteOpenHelper {
    public static final java.lang.String LEGACY_ANALYTICS_EVENT_ID_TABLE_NAME = "legacy_analytics_event_id_table";
    public static final java.lang.String USER_DB_NAME = "__hs_db_helpshift_users";
    public static final java.lang.String USER_TABLE_NAME = "user_table";

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    public HSNativeSDKUserDBHelper(android.content.Context context) {
        super(context, USER_DB_NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 2);
    }
}
