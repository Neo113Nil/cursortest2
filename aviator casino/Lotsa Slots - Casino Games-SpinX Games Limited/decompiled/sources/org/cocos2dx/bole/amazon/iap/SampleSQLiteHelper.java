package org.cocos2dx.bole.amazon.iap;

/* loaded from: classes6.dex */
public class SampleSQLiteHelper extends android.database.sqlite.SQLiteOpenHelper {
    public static final java.lang.String COLUMN_DATE_FROM = "date_from";
    public static final java.lang.String COLUMN_DATE_TO = "date_to";
    public static final java.lang.String COLUMN_RECEIPT_ID = "receipt_id";
    public static final java.lang.String COLUMN_SKU = "sku";
    public static final java.lang.String COLUMN_STATUS = "status";
    public static final java.lang.String COLUMN_USER_ID = "user_id";
    private static final java.lang.String DATABASE_CREATE = "create table purchases(receipt_id text primary key not null, user_id text not null, status text not null );";
    private static final java.lang.String DATABASE_CREATE_SUBS = "create table subscriptions(receipt_id text primary key not null, user_id text not null, date_from integer not null, date_to integer, sku text not null);";
    private static final java.lang.String DATABASE_NAME = "receipts.db";
    private static final int DATABASE_VERSION = 1;
    public static final java.lang.String TABLE_PURCHASES = "purchases";
    public static final java.lang.String TABLE_SUBSCRIPTIONS = "subscriptions";

    public SampleSQLiteHelper(android.content.Context context) {
        super(context, DATABASE_NAME, (android.database.sqlite.SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DATABASE_CREATE);
        sQLiteDatabase.execSQL(DATABASE_CREATE_SUBS);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        android.util.Log.w(org.cocos2dx.bole.amazon.iap.SampleSQLiteHelper.class.getName(), "Upgrading database from version " + i + " to " + i2);
    }
}
