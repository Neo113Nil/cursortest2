package com.onesignal.core.internal.database.impl;

import B4.r;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.onesignal.core.internal.database.IDatabase;
import com.onesignal.core.internal.database.impl.OneSignalDbContract;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.session.internal.outcomes.impl.OutcomeTableProvider;
import com.onesignal.session.internal.outcomes.impl.OutcomesDbContract;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import t4.InterfaceC1441l;
import u1.AbstractC1477a;

/* loaded from: classes.dex */
public class OSDatabase extends SQLiteOpenHelper implements IDatabase {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final int DB_VERSION = 9;
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private final OutcomeTableProvider _outcomeTableProvider;
    public static final Companion Companion = new Companion(null);
    private static final Object LOCK = new Object();
    private static final String[] SQL_INDEX_ENTRIES = {OneSignalDbContract.NotificationTable.INDEX_CREATE_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_ANDROID_NOTIFICATION_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_GROUP_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_COLLAPSE_ID, OneSignalDbContract.NotificationTable.INDEX_CREATE_CREATED_TIME, OneSignalDbContract.NotificationTable.INDEX_CREATE_EXPIRE_TIME};

    public static final class Companion {
        public /* synthetic */ Companion(e eVar) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ OSDatabase(OutcomeTableProvider outcomeTableProvider, Context context, int i2, int i3, e eVar) {
        this(outcomeTableProvider, context, (i3 & 4) != 0 ? 9 : i2);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                i.b(writableDatabase);
            } catch (SQLiteCantOpenDatabaseException e3) {
                throw e3;
            } catch (SQLiteDatabaseLockedException e6) {
                throw e6;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i2 = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e3) {
                    i2++;
                    if (i2 >= 5) {
                        throw e3;
                    }
                    SystemClock.sleep(i2 * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e6) {
                    i2++;
                    if (i2 >= 5) {
                        throw e6;
                    }
                    SystemClock.sleep(i2 * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i2, int i3) {
        if (i2 < 2 && i3 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i2 < 3 && i3 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i2 < 4 && i3 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i2 < 5 && i3 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i2 == 5 && i3 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i2 < 7 && i3 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i2 < 8 && i3 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i2 < 9 && i3 >= 9) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e3) {
            e3.printStackTrace();
        }
    }

    private final void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        safeExecSQL(sQLiteDatabase, OneSignalDbContract.NotificationTable.INDEX_CREATE_GROUP_ID);
    }

    private final void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        safeExecSQL(sQLiteDatabase, OneSignalDbContract.NotificationTable.INDEX_CREATE_EXPIRE_TIME);
    }

    private final void upgradeToV4(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, OutcomesDbContract.SQL_CREATE_OUTCOME_ENTRIES_V1);
    }

    private final void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, OutcomesDbContract.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V1);
        upgradeFromV5ToV6(sQLiteDatabase);
    }

    private final void upgradeToV7(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private final synchronized void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
        this._outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV9(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision3To4(sQLiteDatabase);
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void delete(String table, String str, String[] strArr) {
        String str2;
        String str3;
        i.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.delete(table, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e3) {
                Logging.error("Error deleting on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e3);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e6) {
                    e = e6;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                } catch (IllegalStateException e7) {
                    e = e7;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                }
            } catch (IllegalStateException e8) {
                Logging.error("Error under delete transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e8);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e11) {
                e = e11;
                str3 = "Error closing transaction! ";
                Logging.error(str3, e);
            } catch (IllegalStateException e12) {
                e = e12;
                str2 = "Error closing transaction! ";
                Logging.error(str2, e);
            }
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void insert(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        i.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insert(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e3) {
                Logging.error("Error inserting on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e3);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e6) {
                    e = e6;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                } catch (IllegalStateException e7) {
                    e = e7;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                }
            } catch (IllegalStateException e8) {
                Logging.error("Error under inserting transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e8);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e11) {
                e = e11;
                str3 = "Error closing transaction! ";
                Logging.error(str3, e);
            } catch (IllegalStateException e12) {
                e = e12;
                str2 = "Error closing transaction! ";
                Logging.error(str2, e);
            }
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void insertOrThrow(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        i.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insertOrThrow(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e3) {
                Logging.error("Error inserting or throw on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e3);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e6) {
                    e = e6;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                } catch (IllegalStateException e7) {
                    e = e7;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                }
            } catch (IllegalStateException e8) {
                Logging.error("Error under inserting or throw transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e8);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e11) {
                e = e11;
                str3 = "Error closing transaction! ";
                Logging.error(str3, e);
            } catch (IllegalStateException e12) {
                e = e12;
                str2 = "Error closing transaction! ";
                Logging.error(str2, e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        i.e(db, "db");
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL(OutcomesDbContract.SQL_CREATE_OUTCOME_ENTRIES_V4);
        db.execSQL(OutcomesDbContract.SQL_CREATE_UNIQUE_OUTCOME_ENTRIES_V2);
        db.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            db.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int i2, int i3) {
        i.e(db, "db");
        Logging.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor rawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            Cursor cursor = rawQuery;
            ArrayList arrayList = new ArrayList(cursor.getCount());
            while (cursor.moveToNext()) {
                String string = cursor.getString(0);
                i.d(string, "getString(...)");
                arrayList.add(string);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!r.O(str, "sqlite_", false)) {
                    db.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            AbstractC1477a.e(rawQuery, null);
            onCreate(db);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int i2, int i3) {
        i.e(db, "db");
        Logging.debug$default("OneSignal Database onUpgrade from: " + i2 + " to: " + i3, null, 2, null);
        try {
            internalOnUpgrade(db, i2, i3);
        } catch (SQLiteException e3) {
            Logging.error("Error in upgrade, migration may have already run! Skipping!", e3);
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public void query(String table, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, InterfaceC1441l action) {
        Cursor query;
        i.e(table, "table");
        i.e(action, "action");
        synchronized (LOCK) {
            try {
                if (str5 == null) {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4);
                    i.d(query, "query(...)");
                } else {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4, str5);
                    i.d(query, "query(...)");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Cursor cursor = query;
        try {
            action.invoke(new DatabaseCursor(cursor));
            AbstractC1477a.e(cursor, null);
        } finally {
        }
    }

    @Override // com.onesignal.core.internal.database.IDatabase
    public int update(String table, ContentValues values, String str, String[] strArr) {
        String str2;
        String str3;
        i.e(table, "table");
        i.e(values, "values");
        String contentValues = values.toString();
        i.d(contentValues, "toString(...)");
        int i2 = 0;
        if (contentValues.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    i2 = sQLiteDatabaseWithRetries.update(table, values, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e3) {
                        e = e3;
                        str3 = "Error closing transaction! ";
                        Logging.error(str3, e);
                        return i2;
                    } catch (IllegalStateException e6) {
                        e = e6;
                        str2 = "Error closing transaction! ";
                        Logging.error(str2, e);
                        return i2;
                    }
                } finally {
                }
            } catch (SQLiteException e7) {
                Logging.error("Error updating on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e7);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e8) {
                    e = e8;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                    return i2;
                } catch (IllegalStateException e9) {
                    e = e9;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                    return i2;
                }
            } catch (IllegalStateException e10) {
                Logging.error("Error under update transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e10);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = "Error closing transaction! ";
                    Logging.error(str3, e);
                    return i2;
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = "Error closing transaction! ";
                    Logging.error(str2, e);
                    return i2;
                }
            }
        }
        return i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OSDatabase(OutcomeTableProvider _outcomeTableProvider, Context context, int i2) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i2);
        i.e(_outcomeTableProvider, "_outcomeTableProvider");
        this._outcomeTableProvider = _outcomeTableProvider;
    }
}
