package com.payair.csdk;

/* loaded from: classes10.dex */
public final class e extends androidx.room.migration.Migration {
    public e() {
        super(3, 4);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactionHistory` ADD COLUMN `merchantType` TEXT DEFAULT ''");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactionHistory` ADD COLUMN `merchantCity` TEXT DEFAULT ''");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactionHistory` ADD COLUMN `transactionCountryCode` TEXT DEFAULT ''");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactionHistory` ADD COLUMN `industryCatgCode` TEXT DEFAULT ''");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactionHistory` ADD COLUMN `industryCatgName` TEXT DEFAULT ''");
        supportSQLiteDatabase.execSQL("ALTER TABLE `transactionHistory` ADD COLUMN `industryName` TEXT DEFAULT ''");
        supportSQLiteDatabase.execSQL("ALTER TABLE `TokenDetails` ADD COLUMN `scheme` TEXT NOT NULL DEFAULT 'mastercard'");
    }
}
