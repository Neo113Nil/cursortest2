package my.com.softspace.auditlog.internal;

/* loaded from: classes17.dex */
public abstract class AuditLogDatabase extends androidx.room.RoomDatabase {
    private static volatile my.com.softspace.auditlog.internal.AuditLogDatabase Camera2StreamConfigurationMap;

    public abstract my.com.softspace.auditlog.internal.dao.AttestTransactionDAO attestTransactionDAO();

    public abstract my.com.softspace.auditlog.internal.dao.LogEntryDAO logEntryDAO();

    public static my.com.softspace.auditlog.internal.AuditLogDatabase init(android.content.Context context) {
        my.com.softspace.auditlog.internal.AuditLogDatabase auditLogDatabase;
        synchronized (my.com.softspace.auditlog.internal.AuditLogDatabase.class) {
            if (context == null) {
                throw new java.lang.IllegalArgumentException("Context shouldn't be null");
            }
            Camera2StreamConfigurationMap = (my.com.softspace.auditlog.internal.AuditLogDatabase) androidx.room.Room.databaseBuilder(context.getApplicationContext(), my.com.softspace.auditlog.internal.AuditLogDatabase.class, "Audit_Log_DB").fallbackToDestructiveMigration().build();
            auditLogDatabase = Camera2StreamConfigurationMap;
        }
        return auditLogDatabase;
    }

    public static my.com.softspace.auditlog.internal.AuditLogDatabase getInstance() {
        my.com.softspace.auditlog.internal.AuditLogDatabase auditLogDatabase;
        synchronized (my.com.softspace.auditlog.internal.AuditLogDatabase.class) {
            if (Camera2StreamConfigurationMap == null) {
                throw new java.lang.RuntimeException("init method is not called prior to get instance.");
            }
            auditLogDatabase = Camera2StreamConfigurationMap;
        }
        return auditLogDatabase;
    }

    public static boolean isInitDone() {
        return Camera2StreamConfigurationMap != null;
    }

    public static void destroyInstance() {
        Camera2StreamConfigurationMap = null;
    }
}
