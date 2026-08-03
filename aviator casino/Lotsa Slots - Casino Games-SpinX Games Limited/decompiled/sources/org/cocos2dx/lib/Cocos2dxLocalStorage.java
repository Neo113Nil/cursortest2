package org.cocos2dx.lib;

/* loaded from: classes6.dex */
public class Cocos2dxLocalStorage {
    private static java.lang.String DATABASE_NAME = "jsb.sqlite";
    private static final int DATABASE_VERSION = 1;
    private static java.lang.String TABLE_NAME = "data";
    private static final java.lang.String TAG = "Cocos2dxLocalStorage";
    private static android.database.sqlite.SQLiteDatabase mDatabase;
    private static org.cocos2dx.lib.Cocos2dxLocalStorage.DBOpenHelper mDatabaseOpenHelper;

    public static boolean init(java.lang.String str, java.lang.String str2) {
        if (org.cocos2dx.lib.Cocos2dxActivity.getContext() == null) {
            return false;
        }
        DATABASE_NAME = str;
        TABLE_NAME = str2;
        org.cocos2dx.lib.Cocos2dxLocalStorage.DBOpenHelper dBOpenHelper = new org.cocos2dx.lib.Cocos2dxLocalStorage.DBOpenHelper(org.cocos2dx.lib.Cocos2dxActivity.getContext());
        mDatabaseOpenHelper = dBOpenHelper;
        mDatabase = dBOpenHelper.getWritableDatabase();
        return true;
    }

    public static void destory() {
        android.database.sqlite.SQLiteDatabase sQLiteDatabase = mDatabase;
        if (sQLiteDatabase != null) {
            sQLiteDatabase.close();
        }
    }

    public static void setItem(java.lang.String str, java.lang.String str2) {
        try {
            mDatabase.execSQL("replace into " + TABLE_NAME + "(key,value)values(?,?)", new java.lang.Object[]{str, str2});
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    public static java.lang.String getItem(java.lang.String str) {
        java.lang.String str2 = null;
        try {
            android.database.Cursor rawQuery = mDatabase.rawQuery("select value from " + TABLE_NAME + " where key=?", new java.lang.String[]{str});
            while (true) {
                if (!rawQuery.moveToNext()) {
                    break;
                }
                if (str2 != null) {
                    android.util.Log.e(TAG, "The key contains more than one value.");
                    break;
                }
                str2 = rawQuery.getString(rawQuery.getColumnIndex("value"));
            }
            rawQuery.close();
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        return str2 == null ? "" : str2;
    }

    public static void removeItem(java.lang.String str) {
        try {
            mDatabase.execSQL("delete from " + TABLE_NAME + " where key=?", new java.lang.Object[]{str});
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
    }

    private static class DBOpenHelper extends android.database.sqlite.SQLiteOpenHelper {
        DBOpenHelper(android.content.Context context) {
            super(context, org.cocos2dx.lib.Cocos2dxLocalStorage.DATABASE_NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + org.cocos2dx.lib.Cocos2dxLocalStorage.TABLE_NAME + "(key TEXT PRIMARY KEY,value TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
            android.util.Log.w(org.cocos2dx.lib.Cocos2dxLocalStorage.TAG, "Upgrading database from version " + i + " to " + i2 + ", which will destroy all old data");
        }
    }
}
