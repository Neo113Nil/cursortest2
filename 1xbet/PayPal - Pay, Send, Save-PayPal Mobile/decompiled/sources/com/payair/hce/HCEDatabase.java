package com.payair.hce;

/* loaded from: classes4.dex */
public abstract class HCEDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String ALTER_TABLE_PAYAIR_USER = "ALTER TABLE payairUserData ";
    private static int DigitizedCardProfile = 0;
    public static final androidx.room.migration.Migration MIGRATION_1_2 = new androidx.room.migration.Migration() { // from class: com.payair.hce.HCEDatabase.4
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int valueOf = 1;

        public static /* synthetic */ java.lang.Object valueOf(java.lang.Object[] objArr, int i, int i2, int i3) {
            androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
            int i4 = AlternateContactlessPaymentDataJson;
            int i5 = i4 & 113;
            int i6 = (i4 | 113) & (~i5);
            int i7 = -(-(i5 << 1));
            valueOf = (((i6 | i7) << 1) - (i6 ^ i7)) % 128;
            supportSQLiteDatabase.execSQL("ALTER TABLE payairUserData  ADD COLUMN bankApplicationId VARCHAR(100) default \"PAYAIR\"");
            int i8 = valueOf;
            int i9 = i8 ^ 69;
            int i10 = -(-((i8 & 69) << 1));
            AlternateContactlessPaymentDataJson = (((i9 | i10) << 1) - (i10 ^ i9)) % 128;
            return null;
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            valueOf(new java.lang.Object[]{this, supportSQLiteDatabase}, 30387994, -30387994, java.lang.System.identityHashCode(this));
        }
    };
    public static final androidx.room.migration.Migration MIGRATION_2_3 = new androidx.room.migration.Migration() { // from class: com.payair.hce.HCEDatabase.5
        private static int AlternateContactlessPaymentDataJson = 0;
        private static int writeReplace = 1;

        public static /* synthetic */ java.lang.Object values(java.lang.Object[] objArr, int i, int i2, int i3) {
            androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase = (androidx.database.db.SupportSQLiteDatabase) objArr[1];
            int i4 = writeReplace;
            AlternateContactlessPaymentDataJson = (((i4 ^ 78) + ((i4 & 78) << 1)) - 1) % 128;
            supportSQLiteDatabase.execSQL("ALTER TABLE payairUserData  ADD COLUMN appVersion TEXT default \"1.0.0\"");
            supportSQLiteDatabase.execSQL("ALTER TABLE payairUserData  ADD COLUMN sdkVersion TEXT default \"1.0.0\"");
            supportSQLiteDatabase.execSQL("ALTER TABLE payairUserData  ADD COLUMN mpWalletId INTEGER NOT NULL default 1");
            supportSQLiteDatabase.execSQL("ALTER TABLE payairUserData  ADD COLUMN bankApplicationId TEXT default \"PAYAIR\"");
            int i5 = AlternateContactlessPaymentDataJson;
            int i6 = i5 & 11;
            writeReplace = ((i6 - (~(-(-((i5 ^ 11) | i6))))) - 1) % 128;
            return null;
        }

        @Override // androidx.room.migration.Migration
        public final void migrate(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
            values(new java.lang.Object[]{this, supportSQLiteDatabase}, 843413680, -843413680, java.lang.System.identityHashCode(this));
        }
    };
    private static int values = 1;

    public abstract com.payair.hce.PayairUserDataDao payairUserDataDao();

    public abstract com.payair.hce.SignDataDao signDataDao();

    public abstract com.payair.hce.TemporaryDataDao temporaryDataDao();

    public abstract com.payair.hce.WalletCardIDAndTokenDataDao walletCardIDAndTokenDataDao();

    static {
        int i = values;
        int i2 = i & 45;
        int i3 = (i ^ 45) | i2;
        DigitizedCardProfile = (((i2 | i3) << 1) - (i3 ^ i2)) % 128;
    }
}
