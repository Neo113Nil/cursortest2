package com.payair.db;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/payair/db/Database;", "", "Landroid/content/Context;", "context", "Lcom/payair/db/CSDKDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "<init>", "(Landroid/content/Context;Lcom/payair/db/CSDKDatabase;)V", "", "clear", "()V", "Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao;", "a", "Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao;", "getTransactionHistoryDao", "()Lcom/payair/db/transactionhistory/TransactionHistoryEntryDao;", "transactionHistoryDao", "Lcom/payair/db/settings/DatabaseSettingsDao;", util.h.xy.cb.b.f1091, "Lcom/payair/db/settings/DatabaseSettingsDao;", "getDatabaseSettingsDao", "()Lcom/payair/db/settings/DatabaseSettingsDao;", "databaseSettingsDao", "Lcom/payair/db/token/TokenDetailsDao;", "c", "Lcom/payair/db/token/TokenDetailsDao;", "getTokenDetailsDao", "()Lcom/payair/db/token/TokenDetailsDao;", "tokenDetailsDao", "Companion", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Database {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.payair.db.Database.Companion INSTANCE = new com.payair.db.Database.Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final com.payair.db.transactionhistory.TransactionHistoryEntryDao transactionHistoryDao;

    /* renamed from: b, reason: from kotlin metadata */
    public final com.payair.db.settings.DatabaseSettingsDao databaseSettingsDao;
    public final com.payair.db.TokenDetailsDaoInternal c;

    @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/payair/db/Database$Companion;", "", "Landroid/content/Context;", "context", "Lcom/payair/db/CSDKDatabase;", "buildCSDKDatabase$core_release", "(Landroid/content/Context;)Lcom/payair/db/CSDKDatabase;", "buildCSDKDatabase", "", "DB_NAME", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        }

        public final com.payair.db.CSDKDatabase buildCSDKDatabase$core_release(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            androidx.room.RoomDatabase.Builder databaseBuilder = androidx.room.Room.databaseBuilder(context, com.payair.db.CSDKDatabase.class, "payair.csdk.db");
            databaseBuilder.addMigrations(com.payair.db.CSDKDatabase.INSTANCE.getMIGRATION_4_5());
            return (com.payair.db.CSDKDatabase) databaseBuilder.build();
        }
    }

    public Database(android.content.Context context, com.payair.db.CSDKDatabase cSDKDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cSDKDatabase, "");
        this.transactionHistoryDao = cSDKDatabase.transactionHistoryDao();
        this.databaseSettingsDao = cSDKDatabase.databaseSettingsDao();
        this.c = new com.payair.db.TokenDetailsDaoInternal(context, cSDKDatabase.tokenDetailsDao());
    }

    public final void clear() {
        this.transactionHistoryDao.deleteAll();
        this.databaseSettingsDao.deleteAll();
        this.c.deleteAll();
    }

    public final com.payair.db.settings.DatabaseSettingsDao getDatabaseSettingsDao() {
        return this.databaseSettingsDao;
    }

    public final com.payair.db.token.TokenDetailsDao getTokenDetailsDao() {
        return this.c;
    }

    public final com.payair.db.transactionhistory.TransactionHistoryEntryDao getTransactionHistoryDao() {
        return this.transactionHistoryDao;
    }
}
