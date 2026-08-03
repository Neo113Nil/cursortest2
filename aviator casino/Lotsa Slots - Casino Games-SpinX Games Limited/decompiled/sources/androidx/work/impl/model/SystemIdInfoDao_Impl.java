package androidx.work.impl.model;

/* loaded from: classes2.dex */
public final class SystemIdInfoDao_Impl implements androidx.work.impl.model.SystemIdInfoDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.SystemIdInfo> __insertionAdapterOfSystemIdInfo;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfRemoveSystemIdInfo_1;

    public SystemIdInfoDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfSystemIdInfo = new androidx.room.EntityInsertionAdapter<androidx.work.impl.model.SystemIdInfo>(__db) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement stmt, androidx.work.impl.model.SystemIdInfo value) {
                if (value.workSpecId == null) {
                    stmt.bindNull(1);
                } else {
                    stmt.bindString(1, value.workSpecId);
                }
                stmt.bindLong(2, value.getGeneration());
                stmt.bindLong(3, value.systemId);
            }
        };
        this.__preparedStmtOfRemoveSystemIdInfo = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.2
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=? AND generation=?";
            }
        };
        this.__preparedStmtOfRemoveSystemIdInfo_1 = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.SystemIdInfoDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM SystemIdInfo where work_spec_id=?";
            }
        };
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void insertSystemIdInfo(final androidx.work.impl.model.SystemIdInfo systemIdInfo) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfSystemIdInfo.insert((androidx.room.EntityInsertionAdapter<androidx.work.impl.model.SystemIdInfo>) systemIdInfo);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(final java.lang.String workSpecId, final int generation) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfRemoveSystemIdInfo.acquire();
        if (workSpecId == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, workSpecId);
        }
        acquire.bindLong(2, generation);
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveSystemIdInfo.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(final java.lang.String workSpecId) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfRemoveSystemIdInfo_1.acquire();
        if (workSpecId == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, workSpecId);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfRemoveSystemIdInfo_1.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public androidx.work.impl.model.SystemIdInfo getSystemIdInfo(java.lang.String str, int i) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?", 2);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        acquire.bindLong(2, i);
        this.__db.assertNotSuspendingTransaction();
        androidx.work.impl.model.SystemIdInfo systemIdInfo = null;
        java.lang.String string = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "work_spec_id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "system_id");
            if (query.moveToFirst()) {
                if (!query.isNull(columnIndexOrThrow)) {
                    string = query.getString(columnIndexOrThrow);
                }
                systemIdInfo = new androidx.work.impl.model.SystemIdInfo(string, query.getInt(columnIndexOrThrow2), query.getInt(columnIndexOrThrow3));
            }
            return systemIdInfo;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public java.util.List<java.lang.String> getWorkSpecIds() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT DISTINCT work_spec_id FROM SystemIdInfo", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.isNull(0) ? null : query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public androidx.work.impl.model.SystemIdInfo getSystemIdInfo(final androidx.work.impl.model.WorkGenerationalId id) {
        return androidx.work.impl.model.SystemIdInfoDao.DefaultImpls.getSystemIdInfo(this, id);
    }

    @Override // androidx.work.impl.model.SystemIdInfoDao
    public void removeSystemIdInfo(final androidx.work.impl.model.WorkGenerationalId id) {
        androidx.work.impl.model.SystemIdInfoDao.DefaultImpls.removeSystemIdInfo(this, id);
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
