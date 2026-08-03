package androidx.room;

/* compiled from: SQLiteCopyOpenHelper.kt */
@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BA\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0002\u0010\u000fJ\b\u0010\u001f\u001a\u00020 H\u0016J\u0018\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001cH\u0002J\u0010\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\bH\u0002J\u0018\u0010&\u001a\u00020 2\u0006\u0010%\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u001cH\u0002J\u000e\u0010'\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010(\u001a\u00020 2\u0006\u0010)\u001a\u00020\u001cH\u0017J\u0010\u0010*\u001a\u00020 2\u0006\u0010#\u001a\u00020\u001cH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082.¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001a¨\u0006+"}, d2 = {"Landroidx/room/SQLiteCopyOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "context", "Landroid/content/Context;", "copyFromAssetPath", "", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "databaseVersion", "", "delegate", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILandroidx/sqlite/db/SupportSQLiteOpenHelper;)V", "databaseConfiguration", "Landroidx/room/DatabaseConfiguration;", "databaseName", "getDatabaseName", "()Ljava/lang/String;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "readableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getReadableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "verified", "", "writableDatabase", "getWritableDatabase", "close", "", "copyDatabaseFile", "destinationFile", "writable", "createFrameworkOpenHelper", "databaseFile", "dispatchOnOpenPrepackagedDatabase", "setDatabaseConfiguration", "setWriteAheadLoggingEnabled", "enabled", "verifyDatabaseFile", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class SQLiteCopyOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {
    private final android.content.Context context;
    private final java.lang.String copyFromAssetPath;
    private final java.io.File copyFromFile;
    private final java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;
    private androidx.room.DatabaseConfiguration databaseConfiguration;
    private final int databaseVersion;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper delegate;
    private boolean verified;

    public SQLiteCopyOpenHelper(android.content.Context context, java.lang.String str, java.io.File file, java.util.concurrent.Callable<java.io.InputStream> callable, int i, androidx.sqlite.db.SupportSQLiteOpenHelper delegate) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i;
        this.delegate = delegate;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public androidx.sqlite.db.SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName */
    public java.lang.String getName() {
        return getDelegate().getName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        getDelegate().setWriteAheadLoggingEnabled(enabled);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(true);
            this.verified = true;
        }
        return getDelegate().getWritableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        if (!this.verified) {
            verifyDatabaseFile(false);
            this.verified = true;
        }
        return getDelegate().getReadableDatabase();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getDelegate().close();
        this.verified = false;
    }

    public final void setDatabaseConfiguration(androidx.room.DatabaseConfiguration databaseConfiguration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    private final void verifyDatabaseFile(boolean writable) {
        java.lang.String name = getName();
        if (name == null) {
            throw new java.lang.IllegalStateException("Required value was null.".toString());
        }
        java.io.File databaseFile = this.context.getDatabasePath(name);
        androidx.room.DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        androidx.room.DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        androidx.sqlite.util.ProcessLock processLock = new androidx.sqlite.util.ProcessLock(name, this.context.getFilesDir(), databaseConfiguration.multiInstanceInvalidation);
        try {
            androidx.sqlite.util.ProcessLock.lock$default(processLock, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                    copyDatabaseFile(databaseFile, writable);
                    processLock.unlock();
                    return;
                } catch (java.io.IOException e) {
                    throw new java.lang.RuntimeException("Unable to copy database file.", e);
                }
            }
            try {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databaseFile, "databaseFile");
                int readVersion = androidx.room.util.DBUtil.readVersion(databaseFile);
                if (readVersion == this.databaseVersion) {
                    processLock.unlock();
                    return;
                }
                androidx.room.DatabaseConfiguration databaseConfiguration3 = this.databaseConfiguration;
                if (databaseConfiguration3 == null) {
                    kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                } else {
                    databaseConfiguration2 = databaseConfiguration3;
                }
                if (databaseConfiguration2.isMigrationRequired(readVersion, this.databaseVersion)) {
                    processLock.unlock();
                    return;
                }
                if (this.context.deleteDatabase(name)) {
                    try {
                        copyDatabaseFile(databaseFile, writable);
                    } catch (java.io.IOException e2) {
                        android.util.Log.w(androidx.room.Room.LOG_TAG, "Unable to copy database file.", e2);
                    }
                } else {
                    android.util.Log.w(androidx.room.Room.LOG_TAG, "Failed to delete database file (" + name + ") for a copy destructive migration.");
                }
                processLock.unlock();
                return;
            } catch (java.io.IOException e3) {
                android.util.Log.w(androidx.room.Room.LOG_TAG, "Unable to read database version.", e3);
                processLock.unlock();
                return;
            }
        } catch (java.lang.Throwable th) {
            processLock.unlock();
            throw th;
        }
        processLock.unlock();
        throw th;
    }

    private final void copyDatabaseFile(java.io.File destinationFile, boolean writable) throws java.io.IOException {
        java.nio.channels.FileChannel newChannel;
        if (this.copyFromAssetPath != null) {
            newChannel = java.nio.channels.Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            java.nio.channels.FileChannel channel = new java.io.FileInputStream(this.copyFromFile).getChannel();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(channel, "FileInputStream(copyFromFile).channel");
            newChannel = channel;
        } else {
            java.util.concurrent.Callable<java.io.InputStream> callable = this.copyFromInputStream;
            if (callable != null) {
                try {
                    newChannel = java.nio.channels.Channels.newChannel(callable.call());
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(newChannel, "newChannel(inputStream)");
                } catch (java.lang.Exception e) {
                    throw new java.io.IOException("inputStreamCallable exception on call", e);
                }
            } else {
                throw new java.lang.IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
        }
        java.io.File intermediateFile = java.io.File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        java.nio.channels.FileChannel output = new java.io.FileOutputStream(intermediateFile).getChannel();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(output, "output");
        androidx.room.util.FileUtil.copy(newChannel, output);
        java.io.File parentFile = destinationFile.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new java.io.IOException("Failed to create directories for " + destinationFile.getAbsolutePath());
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intermediateFile, "intermediateFile");
        dispatchOnOpenPrepackagedDatabase(intermediateFile, writable);
        if (intermediateFile.renameTo(destinationFile)) {
            return;
        }
        throw new java.io.IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + destinationFile.getAbsolutePath() + ").");
    }

    private final void dispatchOnOpenPrepackagedDatabase(java.io.File databaseFile, boolean writable) {
        androidx.room.DatabaseConfiguration databaseConfiguration = this.databaseConfiguration;
        if (databaseConfiguration == null) {
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
            databaseConfiguration = null;
        }
        if (databaseConfiguration.prepackagedDatabaseCallback == null) {
            return;
        }
        androidx.sqlite.db.SupportSQLiteOpenHelper createFrameworkOpenHelper = createFrameworkOpenHelper(databaseFile);
        try {
            androidx.sqlite.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper = createFrameworkOpenHelper;
            androidx.sqlite.db.SupportSQLiteDatabase writableDatabase = writable ? supportSQLiteOpenHelper.getWritableDatabase() : supportSQLiteOpenHelper.getReadableDatabase();
            androidx.room.DatabaseConfiguration databaseConfiguration2 = this.databaseConfiguration;
            if (databaseConfiguration2 == null) {
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException("databaseConfiguration");
                databaseConfiguration2 = null;
            }
            androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback = databaseConfiguration2.prepackagedDatabaseCallback;
            kotlin.jvm.internal.Intrinsics.checkNotNull(prepackagedDatabaseCallback);
            prepackagedDatabaseCallback.onOpenPrepackagedDatabase(writableDatabase);
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
            kotlin.io.CloseableKt.closeFinally(createFrameworkOpenHelper, null);
        } finally {
        }
    }

    private final androidx.sqlite.db.SupportSQLiteOpenHelper createFrameworkOpenHelper(java.io.File databaseFile) {
        try {
            final int readVersion = androidx.room.util.DBUtil.readVersion(databaseFile);
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory frameworkSQLiteOpenHelperFactory = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory();
            androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder name = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(this.context).name(databaseFile.getAbsolutePath());
            final int coerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(readVersion, 1);
            return frameworkSQLiteOpenHelperFactory.create(name.callback(new androidx.sqlite.db.SupportSQLiteOpenHelper.Callback(coerceAtLeast) { // from class: androidx.room.SQLiteCopyOpenHelper$createFrameworkOpenHelper$configuration$1
                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onCreate(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onUpgrade(androidx.sqlite.db.SupportSQLiteDatabase db, int oldVersion, int newVersion) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                }

                @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
                public void onOpen(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    int i = readVersion;
                    if (i < 1) {
                        db.setVersion(i);
                    }
                }
            }).build());
        } catch (java.io.IOException e) {
            throw new java.lang.RuntimeException("Malformed database file, unable to read version.", e);
        }
    }
}
