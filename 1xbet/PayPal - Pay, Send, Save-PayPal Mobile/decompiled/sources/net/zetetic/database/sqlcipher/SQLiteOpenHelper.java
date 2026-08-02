package net.zetetic.database.sqlcipher;

/* loaded from: classes5.dex */
public abstract class SQLiteOpenHelper implements androidx.database.db.SupportSQLiteOpenHelper {
    private static final boolean DEBUG_STRICT_READONLY = false;
    private static final java.lang.String TAG = "SQLiteOpenHelper";
    private final android.content.Context mContext;
    private net.zetetic.database.sqlcipher.SQLiteDatabase mDatabase;
    private final net.zetetic.database.sqlcipher.SQLiteDatabaseHook mDatabaseHook;
    private boolean mEnableWriteAheadLogging;
    private final net.zetetic.database.DatabaseErrorHandler mErrorHandler;
    private final net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory mFactory;
    private boolean mIsInitializing;
    private final int mMinimumSupportedVersion;
    private final java.lang.String mName;
    private final int mNewVersion;
    private byte[] mPassword;

    public void onBeforeDelete(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase) {
    }

    public void onConfigure(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onCreate(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase);

    public void onOpen(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase) {
    }

    public abstract void onUpgrade(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, int i, int i2);

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i) {
        this(context, str, cursorFactory, i, null);
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, cursorFactory, i, 0, databaseErrorHandler);
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler) {
        this(context, str, new byte[0], cursorFactory, i, i2, databaseErrorHandler, (net.zetetic.database.sqlcipher.SQLiteDatabaseHook) null, false);
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, java.lang.String str2, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        this(context, str, getBytes(str2), cursorFactory, i, i2, databaseErrorHandler, sQLiteDatabaseHook, z);
    }

    public SQLiteOpenHelper(android.content.Context context, java.lang.String str, byte[] bArr, net.zetetic.database.sqlcipher.SQLiteDatabase.CursorFactory cursorFactory, int i, int i2, net.zetetic.database.DatabaseErrorHandler databaseErrorHandler, net.zetetic.database.sqlcipher.SQLiteDatabaseHook sQLiteDatabaseHook, boolean z) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("Version must be >= 1, was ".concat(java.lang.String.valueOf(i)));
        }
        this.mContext = context;
        this.mName = str;
        this.mPassword = bArr;
        this.mFactory = cursorFactory;
        this.mNewVersion = i;
        this.mErrorHandler = databaseErrorHandler;
        this.mDatabaseHook = sQLiteDatabaseHook;
        this.mEnableWriteAheadLogging = z;
        this.mMinimumSupportedVersion = java.lang.Math.max(0, i2);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName */
    public java.lang.String getGetHighSpeedVideoSizes() {
        return this.mName;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this) {
            if (this.mEnableWriteAheadLogging != z) {
                net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase = this.mDatabase;
                if (sQLiteDatabase != null && sQLiteDatabase.isOpen() && !this.mDatabase.isReadOnly()) {
                    if (z) {
                        this.mDatabase.enableWriteAheadLogging();
                    } else {
                        this.mDatabase.disableWriteAheadLogging();
                    }
                }
                this.mEnableWriteAheadLogging = z;
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public net.zetetic.database.sqlcipher.SQLiteDatabase getWritableDatabase() {
        net.zetetic.database.sqlcipher.SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(true);
        }
        return databaseLocked;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public net.zetetic.database.sqlcipher.SQLiteDatabase getReadableDatabase() {
        net.zetetic.database.sqlcipher.SQLiteDatabase databaseLocked;
        synchronized (this) {
            databaseLocked = getDatabaseLocked(false);
        }
        return databaseLocked;
    }

    private net.zetetic.database.sqlcipher.SQLiteDatabase getDatabaseLocked(boolean z) {
        net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase = this.mDatabase;
        if (sQLiteDatabase != null) {
            if (!sQLiteDatabase.isOpen()) {
                this.mDatabase = null;
            } else if (!z || !this.mDatabase.isReadOnly()) {
                return this.mDatabase;
            }
        }
        if (this.mIsInitializing) {
            throw new java.lang.IllegalStateException("getDatabase called recursively");
        }
        net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase2 = this.mDatabase;
        try {
            this.mIsInitializing = true;
            if (sQLiteDatabase2 != null) {
                if (z && sQLiteDatabase2.isReadOnly()) {
                    sQLiteDatabase2.reopenReadWrite();
                }
            } else {
                java.lang.String str = this.mName;
                if (str == null) {
                    sQLiteDatabase2 = net.zetetic.database.sqlcipher.SQLiteDatabase.create(null);
                } else {
                    try {
                        if (!str.startsWith("file:")) {
                            str = this.mContext.getDatabasePath(str).getPath();
                        }
                        java.lang.String str2 = str;
                        java.io.File file = new java.io.File(new java.io.File(str2).getParent());
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        sQLiteDatabase2 = net.zetetic.database.sqlcipher.SQLiteDatabase.openDatabase(str2, this.mPassword, this.mFactory, this.mEnableWriteAheadLogging ? 805306368 : 268435456, this.mErrorHandler, this.mDatabaseHook);
                    } catch (android.database.sqlite.SQLiteException e) {
                        if (z) {
                            throw e;
                        }
                        java.lang.String str3 = TAG;
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Couldn't open ");
                        sb.append(this.mName);
                        sb.append(" for writing (will try read-only):");
                        net.zetetic.database.Logger.e(str3, sb.toString(), e);
                        sQLiteDatabase2 = net.zetetic.database.sqlcipher.SQLiteDatabase.openDatabase(this.mContext.getDatabasePath(this.mName).getPath(), this.mPassword, this.mFactory, 1, this.mErrorHandler, this.mDatabaseHook);
                    }
                }
            }
            onConfigure(sQLiteDatabase2);
            int version = sQLiteDatabase2.getVersion();
            if (version != this.mNewVersion) {
                if (sQLiteDatabase2.isReadOnly()) {
                    java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Can't upgrade read-only database from version ");
                    sb2.append(sQLiteDatabase2.getVersion());
                    sb2.append(" to ");
                    sb2.append(this.mNewVersion);
                    sb2.append(": ");
                    sb2.append(this.mName);
                    throw new android.database.sqlite.SQLiteException(sb2.toString());
                }
                if (version > 0 && version < this.mMinimumSupportedVersion) {
                    java.io.File file2 = new java.io.File(sQLiteDatabase2.getPath());
                    onBeforeDelete(sQLiteDatabase2);
                    sQLiteDatabase2.close();
                    if (net.zetetic.database.sqlcipher.SQLiteDatabase.deleteDatabase(file2)) {
                        this.mIsInitializing = false;
                        return getDatabaseLocked(z);
                    }
                    java.lang.StringBuilder sb3 = new java.lang.StringBuilder("Unable to delete obsolete database ");
                    sb3.append(this.mName);
                    sb3.append(" with version ");
                    sb3.append(version);
                    throw new java.lang.IllegalStateException(sb3.toString());
                }
                sQLiteDatabase2.beginTransaction();
                try {
                    if (version == 0) {
                        onCreate(sQLiteDatabase2);
                    } else {
                        int i = this.mNewVersion;
                        if (version > i) {
                            onDowngrade(sQLiteDatabase2, version, i);
                        } else {
                            onUpgrade(sQLiteDatabase2, version, i);
                        }
                    }
                    sQLiteDatabase2.setVersion(this.mNewVersion);
                    sQLiteDatabase2.setTransactionSuccessful();
                    sQLiteDatabase2.endTransaction();
                } catch (java.lang.Throwable th) {
                    sQLiteDatabase2.endTransaction();
                    throw th;
                }
            }
            onOpen(sQLiteDatabase2);
            if (sQLiteDatabase2.isReadOnly()) {
                java.lang.String str4 = TAG;
                java.lang.StringBuilder sb4 = new java.lang.StringBuilder("Opened ");
                sb4.append(this.mName);
                sb4.append(" in read-only mode");
                net.zetetic.database.Logger.w(str4, sb4.toString());
            }
            this.mDatabase = sQLiteDatabase2;
            this.mIsInitializing = false;
            return sQLiteDatabase2;
        } finally {
            this.mIsInitializing = false;
            if (sQLiteDatabase2 != null && sQLiteDatabase2 != this.mDatabase) {
                sQLiteDatabase2.close();
            }
        }
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.mIsInitializing) {
                throw new java.lang.IllegalStateException("Closed during initialization");
            }
            net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase = this.mDatabase;
            if (sQLiteDatabase != null && sQLiteDatabase.isOpen()) {
                this.mDatabase.close();
                this.mDatabase = null;
            }
        }
    }

    public void onDowngrade(net.zetetic.database.sqlcipher.SQLiteDatabase sQLiteDatabase, int i, int i2) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't downgrade database from version ");
        sb.append(i);
        sb.append(" to ");
        sb.append(i2);
        throw new android.database.sqlite.SQLiteException(sb.toString());
    }

    private static byte[] getBytes(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        java.nio.ByteBuffer encode = java.nio.charset.Charset.forName("UTF-8").encode(java.nio.CharBuffer.wrap(str));
        byte[] bArr = new byte[encode.limit()];
        encode.get(bArr);
        return bArr;
    }
}
