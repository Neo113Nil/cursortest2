package com.payair.db.settings;

/* loaded from: classes10.dex */
public final class a extends androidx.room.EntityInsertionAdapter {
    public a(androidx.room.RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    @Override // androidx.room.EntityInsertionAdapter
    public final void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, java.lang.Object obj) {
        com.payair.db.settings.DatabaseSettingsEntry databaseSettingsEntry = (com.payair.db.settings.DatabaseSettingsEntry) obj;
        if (databaseSettingsEntry.getKey() == null) {
            supportSQLiteStatement.bindNull(1);
        } else {
            supportSQLiteStatement.bindString(1, databaseSettingsEntry.getKey());
        }
        if (databaseSettingsEntry.getValue() == null) {
            supportSQLiteStatement.bindNull(2);
        } else {
            supportSQLiteStatement.bindString(2, databaseSettingsEntry.getValue());
        }
    }

    @Override // androidx.room.SharedSQLiteStatement
    public final java.lang.String createQuery() {
        return "INSERT OR REPLACE INTO `databaseSettings` (`key`,`value`) VALUES (?,?)";
    }
}
