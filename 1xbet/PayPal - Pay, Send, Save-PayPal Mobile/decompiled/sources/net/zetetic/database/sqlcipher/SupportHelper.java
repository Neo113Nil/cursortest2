package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public class SupportHelper implements androidx.database.db.SupportSQLiteOpenHelper {
    private net.zetetic.database.sqlcipher.SQLiteOpenHelper openHelper;

    public SupportHelper(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(configuration, bArr, sQLiteDatabaseHook, z, 0);
    }

    public SupportHelper(final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook, boolean z, int i) {
        this.openHelper = new net.zetetic.database.sqlcipher.SQLiteOpenHelper(configuration.context, configuration.name, bArr, null, configuration.callback.version, i, null, sQLiteDatabaseHook, z) { // from class: net.zetetic.database.sqlcipher.SupportHelper.1
            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onCreate(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onCreate(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onUpgrade(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.callback.onUpgrade(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onDowngrade(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, int i2, int i3) {
                configuration.callback.onDowngrade(sQLiteDatabase, i2, i3);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onOpen(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onOpen(sQLiteDatabase);
            }

            @Override // net.zetetic.database.sqlcipher.SQLiteOpenHelper
            public void onConfigure(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase) {
                configuration.callback.onConfigure(sQLiteDatabase);
            }
        };
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public java.lang.String getDatabaseName() {
        return this.openHelper.getDatabaseName();
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        this.openHelper.setWriteAheadLoggingEnabled(z);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public androidx.database.db.SupportSQLiteDatabase getWritableDatabase() {
        return this.openHelper.getWritableDatabase();
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public androidx.database.db.SupportSQLiteDatabase getReadableDatabase() {
        return this.openHelper.getReadableDatabase();
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.openHelper.close();
    }
}
