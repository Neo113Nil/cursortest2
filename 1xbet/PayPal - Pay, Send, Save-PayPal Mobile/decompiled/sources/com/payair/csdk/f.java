package com.payair.csdk;

/* loaded from: classes10.dex */
public final class f extends androidx.room.migration.Migration {
    public f() {
        super(5, 6);
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `_new_transactionHistory` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `recordId` TEXT NOT NULL, `transactionId` TEXT, `merchantName` TEXT, `amount` INTEGER NOT NULL, `date` INTEGER NOT NULL, `currencyCode` TEXT NOT NULL, `authorizationStatus` TEXT NOT NULL, `transactionType` TEXT NOT NULL, `networkTokenReference` TEXT NOT NULL, `merchantType` TEXT DEFAULT '', `merchantCity` TEXT DEFAULT '', `transactionCountryCode` TEXT DEFAULT '', `industryCatgCode` TEXT DEFAULT '', `industryCatgName` TEXT DEFAULT '', `industryName` TEXT DEFAULT '')");
        supportSQLiteDatabase.execSQL("INSERT INTO `_new_transactionHistory` (`id`,`recordId`,`transactionId`,`merchantName`,`amount`,`date`,`currencyCode`,`authorizationStatus`,`transactionType`,`networkTokenReference`,`merchantType`,`merchantCity`,`transactionCountryCode`,`industryCatgCode`,`industryCatgName`,`industryName`) SELECT `id`,`recordId`,`transactionId`,`merchantName`,`amount`,`date`,`currencyCode`,`authorizationStatus`,`transactionType`,`networkTokenReference`,`merchantType`,`merchantCity`,`transactionCountryCode`,`industryCatgCode`,`industryCatgName`,`industryName` FROM `transactionHistory`");
        supportSQLiteDatabase.execSQL("DROP TABLE `transactionHistory`");
        supportSQLiteDatabase.execSQL("ALTER TABLE `_new_transactionHistory` RENAME TO `transactionHistory`");
        supportSQLiteDatabase.execSQL("CREATE INDEX IF NOT EXISTS `index_transactionHistory_networkTokenReference` ON `transactionHistory` (`networkTokenReference`)");
        supportSQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_transactionHistory_recordId` ON `transactionHistory` (`recordId`)");
    }
}
