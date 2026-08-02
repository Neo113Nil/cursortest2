package org.betup.model.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomMasterTable;
import androidx.room.RoomOpenHelper;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.betup.model.local.dao.EventDao;
import org.betup.model.local.dao.EventDao_Impl;

/* loaded from: classes2.dex */
public final class AppDatabase_Impl extends AppDatabase {
    private volatile EventDao _eventDao;

    @Override // androidx.room.RoomDatabase
    protected SupportSQLiteOpenHelper createOpenHelper(final DatabaseConfiguration config) {
        return config.sqliteOpenHelperFactory.create(SupportSQLiteOpenHelper.Configuration.builder(config.context).name(config.name).callback(new RoomOpenHelper(config, new RoomOpenHelper.Delegate(3) { // from class: org.betup.model.local.AppDatabase_Impl.1
            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPostMigrate(final SupportSQLiteDatabase db) {
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void createAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("CREATE TABLE IF NOT EXISTS `events` (`eventId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `userId` INTEGER NOT NULL, `title` TEXT, `body` TEXT, `type` TEXT, `sent_timestamp` INTEGER NOT NULL, `got_timestamp` INTEGER NOT NULL, `isNew` INTEGER NOT NULL, `uid` TEXT)");
                db.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_events_uid` ON `events` (`uid`)");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_events_userId` ON `events` (`userId`)");
                db.execSQL("CREATE TABLE IF NOT EXISTS `event_params` (`eventParamId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `key` TEXT, `value` TEXT, `eventId` INTEGER NOT NULL, FOREIGN KEY(`eventId`) REFERENCES `events`(`eventId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
                db.execSQL("CREATE INDEX IF NOT EXISTS `index_event_params_eventId` ON `event_params` (`eventId`)");
                db.execSQL(RoomMasterTable.CREATE_QUERY);
                db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c44ddb02c272cd3fd6f6f6e9fe60a48c')");
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void dropAllTables(final SupportSQLiteDatabase db) {
                db.execSQL("DROP TABLE IF EXISTS `events`");
                db.execSQL("DROP TABLE IF EXISTS `event_params`");
                List list = AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onDestructiveMigration(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onCreate(final SupportSQLiteDatabase db) {
                List list = AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onCreate(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onOpen(final SupportSQLiteDatabase db) {
                AppDatabase_Impl.this.mDatabase = db;
                db.execSQL("PRAGMA foreign_keys = ON");
                AppDatabase_Impl.this.internalInitInvalidationTracker(db);
                List list = AppDatabase_Impl.this.mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((RoomDatabase.Callback) it.next()).onOpen(db);
                    }
                }
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public void onPreMigrate(final SupportSQLiteDatabase db) {
                DBUtil.dropFtsSyncTriggers(db);
            }

            @Override // androidx.room.RoomOpenHelper.Delegate
            public RoomOpenHelper.ValidationResult onValidateSchema(final SupportSQLiteDatabase db) {
                HashMap hashMap = new HashMap(9);
                hashMap.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 1, null, 1));
                hashMap.put("userId", new TableInfo.Column("userId", "INTEGER", true, 0, null, 1));
                hashMap.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, 1));
                hashMap.put("body", new TableInfo.Column("body", "TEXT", false, 0, null, 1));
                hashMap.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, 1));
                hashMap.put("sent_timestamp", new TableInfo.Column("sent_timestamp", "INTEGER", true, 0, null, 1));
                hashMap.put("got_timestamp", new TableInfo.Column("got_timestamp", "INTEGER", true, 0, null, 1));
                hashMap.put("isNew", new TableInfo.Column("isNew", "INTEGER", true, 0, null, 1));
                hashMap.put("uid", new TableInfo.Column("uid", "TEXT", false, 0, null, 1));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(2);
                hashSet2.add(new TableInfo.Index("index_events_uid", true, Arrays.asList("uid"), Arrays.asList("ASC")));
                hashSet2.add(new TableInfo.Index("index_events_userId", false, Arrays.asList("userId"), Arrays.asList("ASC")));
                TableInfo tableInfo = new TableInfo("events", hashMap, hashSet, hashSet2);
                TableInfo read = TableInfo.read(db, "events");
                if (!tableInfo.equals(read)) {
                    return new RoomOpenHelper.ValidationResult(false, "events(org.betup.model.local.entity.Event).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
                }
                HashMap hashMap2 = new HashMap(4);
                hashMap2.put("eventParamId", new TableInfo.Column("eventParamId", "INTEGER", true, 1, null, 1));
                hashMap2.put("key", new TableInfo.Column("key", "TEXT", false, 0, null, 1));
                hashMap2.put("value", new TableInfo.Column("value", "TEXT", false, 0, null, 1));
                hashMap2.put("eventId", new TableInfo.Column("eventId", "INTEGER", true, 0, null, 1));
                HashSet hashSet3 = new HashSet(1);
                hashSet3.add(new TableInfo.ForeignKey("events", "NO ACTION", "NO ACTION", Arrays.asList("eventId"), Arrays.asList("eventId")));
                HashSet hashSet4 = new HashSet(1);
                hashSet4.add(new TableInfo.Index("index_event_params_eventId", false, Arrays.asList("eventId"), Arrays.asList("ASC")));
                TableInfo tableInfo2 = new TableInfo("event_params", hashMap2, hashSet3, hashSet4);
                TableInfo read2 = TableInfo.read(db, "event_params");
                if (!tableInfo2.equals(read2)) {
                    return new RoomOpenHelper.ValidationResult(false, "event_params(org.betup.model.local.entity.EventParam).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
                }
                return new RoomOpenHelper.ValidationResult(true, null);
            }
        }, "c44ddb02c272cd3fd6f6f6e9fe60a48c", "f1d63aa6b36bcae7c37ed8a669539ad1")).build());
    }

    @Override // androidx.room.RoomDatabase
    protected InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "events", "event_params");
    }

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = super.getOpenHelper().getWritableDatabase();
        try {
            super.beginTransaction();
            writableDatabase.execSQL("PRAGMA defer_foreign_keys = TRUE");
            writableDatabase.execSQL("DELETE FROM `event_params`");
            writableDatabase.execSQL("DELETE FROM `events`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        hashMap.put(EventDao.class, EventDao_Impl.getRequiredConverters());
        return hashMap;
    }

    @Override // androidx.room.RoomDatabase
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public List<Migration> getAutoMigrations(final Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        return new ArrayList();
    }

    @Override // org.betup.model.local.AppDatabase
    public EventDao eventDao() {
        EventDao eventDao;
        if (this._eventDao != null) {
            return this._eventDao;
        }
        synchronized (this) {
            if (this._eventDao == null) {
                this._eventDao = new EventDao_Impl(this);
            }
            eventDao = this._eventDao;
        }
        return eventDao;
    }
}
