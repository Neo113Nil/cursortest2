package com.paypal.oslo.core.persistence.db.config;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0017\u0010\u000f\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/core/persistence/db/config/DbConfig;", "", "<init>", "()V", "", "DB_NAME", "Ljava/lang/String;", "", "DB_VERSION", com.visa.cbp.getEncExpo.warmup, "", "EXPORT_SCHEMA", "Z", "SCHEMA_EXPORT_DIR", "Landroidx/room/RoomDatabase$JournalMode;", "JOURNAL_MODE", "Landroidx/room/RoomDatabase$JournalMode;", "getJOURNAL_MODE", "()Landroidx/room/RoomDatabase$JournalMode;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class DbConfig {
    public static final java.lang.String DB_NAME = "oslo.db";
    public static final int DB_VERSION = 1;
    public static final boolean EXPORT_SCHEMA = true;
    public static final com.paypal.oslo.core.persistence.db.config.DbConfig INSTANCE = new com.paypal.oslo.core.persistence.db.config.DbConfig();
    private static final androidx.room.RoomDatabase.JournalMode JOURNAL_MODE = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
    public static final java.lang.String SCHEMA_EXPORT_DIR = "schemas";

    private DbConfig() {
    }

    public final androidx.room.RoomDatabase.JournalMode getJOURNAL_MODE() {
        return JOURNAL_MODE;
    }
}
