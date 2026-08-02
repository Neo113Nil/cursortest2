package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class b extends androidx.room.EntityDeletionOrUpdateAdapter {
    public b(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, java.lang.Object obj) {
        com.payair.db.settings.DatabaseSettingsEntry databaseSettingsEntry = (com.payair.db.settings.DatabaseSettingsEntry) obj;
        if (databaseSettingsEntry.getKey() == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, databaseSettingsEntry.getKey());
        }
    }

    @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "DELETE FROM `databaseSettings` WHERE `key` = ?";
    }
}
