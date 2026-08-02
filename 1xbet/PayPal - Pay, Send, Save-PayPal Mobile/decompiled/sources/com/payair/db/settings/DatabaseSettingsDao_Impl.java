package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class DatabaseSettingsDao_Impl implements com.payair.db.settings.DatabaseSettingsDao {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.room.RoomDatabase f4355a;
    public final com.payair.db.settings.a b;
    public final com.payair.db.settings.b c;
    public final com.payair.db.settings.c d;

    public DatabaseSettingsDao_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.f4355a = roomDatabase;
        this.b = new com.payair.db.settings.a(roomDatabase);
        this.c = new com.payair.db.settings.b(roomDatabase);
        this.d = new com.payair.db.settings.c(roomDatabase);
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.EMPTY_LIST;
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final java.lang.Object delete(com.payair.db.settings.DatabaseSettingsEntry databaseSettingsEntry, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4355a, true, new com.payair.db.settings.e(this, databaseSettingsEntry), continuation);
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final void deleteAll() {
        this.f4355a.assertNotSuspendingTransaction();
        androidx.database.db.SupportSQLiteStatement acquire = this.d.acquire();
        try {
            this.f4355a.beginTransaction();
            try {
                acquire.executeUpdateDelete();
                this.f4355a.setTransactionSuccessful();
            } finally {
                this.f4355a.endTransaction();
            }
        } finally {
            this.d.release(acquire);
        }
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final java.lang.Object getAll(kotlin.coroutines.Continuation<? super java.util.List<com.payair.db.settings.DatabaseSettingsEntry>> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM databaseSettings", 0);
        return androidx.room.CoroutinesRoom.execute(this.f4355a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.settings.f(this, acquire), continuation);
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final java.lang.Object getTransactionHistoryLastUpdatedTag(kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        return com.payair.db.settings.DatabaseSettingsDao.DefaultImpls.getTransactionHistoryLastUpdatedTag(this, continuation);
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final java.lang.Object getValue(java.lang.String str, kotlin.coroutines.Continuation<? super java.lang.String> continuation) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT value FROM databaseSettings WHERE `key` = ?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        return androidx.room.CoroutinesRoom.execute(this.f4355a, false, androidx.room.util.DBUtil.createCancellationSignal(), new com.payair.db.settings.g(this, acquire), continuation);
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final java.lang.Object insert(com.payair.db.settings.DatabaseSettingsEntry[] databaseSettingsEntryArr, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return androidx.room.CoroutinesRoom.execute(this.f4355a, true, new com.payair.db.settings.d(this, databaseSettingsEntryArr), continuation);
    }

    @Override // com.payair.db.settings.DatabaseSettingsDao
    public final java.lang.Object setTransactionHistoryLastUpdatedTag(java.lang.String str, kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return com.payair.db.settings.DatabaseSettingsDao.DefaultImpls.setTransactionHistoryLastUpdatedTag(this, str, continuation);
    }
}
