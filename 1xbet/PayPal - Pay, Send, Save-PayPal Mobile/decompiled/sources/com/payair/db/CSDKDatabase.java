package com.payair.db;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b \u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/payair/db/CSDKDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/payair/db/settings/DatabaseSettingsDao;", "databaseSettingsDao", "()Lcom/payair/db/settings/DatabaseSettingsDao;", "Lcom/payair/db/token/TokenDetailsDao;", "tokenDetailsDao", "()Lcom/payair/db/token/TokenDetailsDao;", "Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao;", "transactionHistoryDao", "()Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao;", "Companion"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class CSDKDatabase extends androidx.room.RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.db.CSDKDatabase.Companion INSTANCE = new com.payair.db.CSDKDatabase.Companion(null);

    /* renamed from: a, reason: collision with root package name */
    public static final com.payair.db.CSDKDatabase$Companion$MIGRATION_4_5$1 f4346a = new androidx.room.migration.Migration() { // from class: com.payair.db.CSDKDatabase$Companion$MIGRATION_4_5$1
        @Override // androidx.room.migration.Migration
        public final void migrate(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            db.execSQL("CREATE TABLE TransactionHistoryDb_new (\n    id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,\n    recordId TEXT,\n    transactionId TEXT,\n    merchantName TEXT NOT NULL,\n    amount INTEGER NOT NULL,\n    date INTEGER NOT NULL,\n    currencyCode TEXT NOT NULL,\n    authorizationStatus TEXT NOT NULL,\n    transactionType TEXT NOT NULL,\n    networkTokenReference TEXT NOT NULL,\n    merchantType TEXT DEFAULT '',\n    merchantCity TEXT DEFAULT '',\n    transactionCountryCode TEXT DEFAULT '',\n    industryCatgCode TEXT DEFAULT '',\n    industryCatgName TEXT DEFAULT '',\n    industryName TEXT DEFAULT ''\n)");
            db.execSQL("INSERT INTO TransactionHistoryDb_new (\n    recordId, transactionId, merchantName, amount, date, currencyCode, \n    authorizationStatus, transactionType, networkTokenReference, \n    merchantType, merchantCity, transactionCountryCode, \n    industryCatgCode, industryCatgName, industryName\n)\nSELECT \n    recordId, transactionId, merchantName, amount, date, currencyCode, \n    authorizationStatus, transactionType, networkTokenReference, \n    merchantType, merchantCity, transactionCountryCode, \n    industryCatgCode, industryCatgName, industryName\nFROM transactionHistory");
            db.execSQL("DROP TABLE transactionHistory");
            db.execSQL("ALTER TABLE TransactionHistoryDb_new RENAME TO transactionHistory");
            db.execSQL("CREATE INDEX index_transactionHistory_networkTokenReference ON transactionHistory (networkTokenReference)");
        }
    };

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/payair/db/CSDKDatabase$Companion;", "", "Landroidx/room/migration/Migration;", "MIGRATION_4_5", "Landroidx/room/migration/Migration;", "getMIGRATION_4_5", "()Landroidx/room/migration/Migration;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final androidx.room.migration.Migration getMIGRATION_4_5() {
            return com.payair.db.CSDKDatabase.f4346a;
        }
    }

    public abstract com.payair.db.settings.DatabaseSettingsDao databaseSettingsDao();

    public abstract com.payair.db.token.TokenDetailsDao tokenDetailsDao();

    public abstract com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryDao();
}
