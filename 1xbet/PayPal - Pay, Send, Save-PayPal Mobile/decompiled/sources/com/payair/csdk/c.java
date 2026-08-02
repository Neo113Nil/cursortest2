package com.payair.csdk;

/* loaded from: classes10.dex */
public final class c extends androidx.room.migration.Migration {
    public c() {
        super(1, 2);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `_new_transactionHistory` (`transactionId` TEXT NOT NULL, `merchantName` TEXT NOT NULL, `amount` INTEGER NOT NULL, `date` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `authorizationStatus` TEXT NOT NULL, `transactionType` TEXT NOT NULL, `networkTokenReference` TEXT NOT NULL, PRIMARY KEY(`transactionId`, `networkTokenReference`))");
        supportSQLiteDatabase.execSQL("INSERT INTO `_new_transactionHistory` (`transactionId`,`merchantName`,`amount`,`date`,`currencyCode`,`authorizationStatus`,`transactionType`,`networkTokenReference`) SELECT `transactionId`,`merchantName`,`amount`,`date`,`currencyCode`,`authorizationStatus`,`transactionType`,`networkTokenReference` FROM `transactionHistory`");
        supportSQLiteDatabase.execSQL("DROP TABLE `transactionHistory`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `_new_transactionHistory` RENAME TO `transactionHistory`");
    }
}
