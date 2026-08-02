package com.payair.csdk;

/* loaded from: classes10.dex */
public final class d extends androidx.room.migration.Migration {
    public d() {
        super(2, 3);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `TokenDetails` ADD COLUMN `assetPath` TEXT DEFAULT NULL");
    }
}
