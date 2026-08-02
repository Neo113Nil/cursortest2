package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public class SupportOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {
    private static final int UNCHANGED = -1;
    private final boolean enableWriteAheadLogging;
    private final net.zetetic.database.sqlcipher.SQLiteDatabaseHook hook;
    private final int minimumSupportedVersion;
    private final byte[] password;

    public SupportOpenHelperFactory(byte[] bArr) {
        this(bArr, null, false);
    }

    public SupportOpenHelperFactory(byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(bArr, sQLiteDatabaseHook, z, -1);
    }

    public SupportOpenHelperFactory(byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.password = bArr;
        this.hook = sQLiteDatabaseHook;
        this.enableWriteAheadLogging = z;
        this.minimumSupportedVersion = i;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public androidx.database.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        if (this.minimumSupportedVersion == -1) {
            return new net.zetetic.database.sqlcipher.SupportHelper(configuration, this.password, this.hook, this.enableWriteAheadLogging);
        }
        return new net.zetetic.database.sqlcipher.SupportHelper(configuration, this.password, this.hook, this.enableWriteAheadLogging, this.minimumSupportedVersion);
    }
}
