package androidx.database.db.framework;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 +2\u00020\u0001:\u0003,+-B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0018\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001fR\u0016\u0010\u001a\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR\u0016\u0010$\u001a\u0004\u0018\u00010\u00048WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010'"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "Ljava/lang/String;", "getHighSpeedVideoSizes", "Camera2StreamConfigurationMap", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "getHighSpeedVideoSizesFor", "Z", "getHighSpeedVideoFpsRanges", "Lkotlin/Lazy;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Lkotlin/Lazy;", "getInputSizeshNQ4ISI", "getInputFormats", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Companion", "OpenHelper", "DBRefHolder"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FrameworkSQLiteOpenHelper implements androidx.database.db.SupportSQLiteOpenHelper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback getHighSpeedVideoFpsRangesFor;
    private final android.content.Context getHighResolutionOutputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final kotlin.Lazy<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper> getInputSizeshNQ4ISI;

    /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final boolean getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizesFor, reason: from kotlin metadata */
    private final boolean Camera2StreamConfigurationMap;

    /* renamed from: getInputFormats, reason: from kotlin metadata */
    private boolean getHighSpeedVideoSizesFor;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\f¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "p0", "<init>", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class DBRefHolder {

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        androidx.database.db.framework.FrameworkSQLiteDatabase getHighSpeedVideoFpsRangesFor = null;
    }

    public FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
        this.getHighResolutionOutputSizeshNQ4ISI = context;
        this.getHighSpeedVideoSizes = str;
        this.getHighSpeedVideoFpsRangesFor = callback;
        this.Camera2StreamConfigurationMap = z;
        this.getHighSpeedVideoFpsRanges = z2;
        this.getInputSizeshNQ4ISI = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Object invoke() {
                return androidx.database.db.framework.FrameworkSQLiteOpenHelper.$r8$lambda$bMXVQYZgPq9YSTqMFpOzwjrmmJ8(androidx.database.db.framework.FrameworkSQLiteOpenHelper.this);
            }
        });
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, callback, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName, reason: from getter */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.getHighSpeedVideoSizes;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.getInputSizeshNQ4ISI.isInitialized()) {
            this.getInputSizeshNQ4ISI.getValue().setWriteAheadLoggingEnabled(enabled);
        }
        this.getHighSpeedVideoSizesFor = enabled;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.getInputSizeshNQ4ISI.isInitialized()) {
            this.getInputSizeshNQ4ISI.getValue().close();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 +2\u00020\u0001:\u0003,-+B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001a\u0010\u0016J'\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00172\u0006\u0010\u0007\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u001c\u0010\u0016J\u000f\u0010\u001d\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0011\u0010!\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b!\u0010\"R\u0011\u0010\u0012\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b#\u0010$R\u0011\u0010\u001f\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010%R\u0016\u0010#\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010%R\u0014\u0010)\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0016\u0010*\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010%"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "p0", "", "p1", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "p2", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "p3", "", "p4", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;Z)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Camera2StreamConfigurationMap", "(Z)Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroid/database/sqlite/SQLiteDatabase;", "getHighSpeedVideoFpsRanges", "(Z)Landroid/database/sqlite/SQLiteDatabase;", "", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "onConfigure", "onDowngrade", "onOpen", "close", "()V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoSizes", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "getHighSpeedVideoFpsRangesFor", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Z", "getInputFormats", "Landroidx/sqlite/util/ProcessLock;", "Landroidx/sqlite/util/ProcessLock;", "getOutputMinFrameDuration", "getHighSpeedVideoSizesFor", "Companion", "CallbackException", "CallbackName"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class OpenHelper extends android.database.sqlite.SQLiteOpenHelper {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion INSTANCE = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion(null);

        /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
        private final boolean getHighResolutionOutputSizeshNQ4ISI;

        /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
        private final android.content.Context Camera2StreamConfigurationMap;

        /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
        private final androidx.database.util.ProcessLock getOutputMinFrameDuration;

        /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
        private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback getHighSpeedVideoFpsRanges;
        private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder getHighSpeedVideoSizes;
        private boolean getHighSpeedVideoSizesFor;

        /* renamed from: getInputFormats, reason: from kotlin metadata */
        private boolean getHighSpeedVideoFpsRangesFor;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(android.content.Context context, java.lang.String str, final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder, final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z) {
            super(context, str, null, callback.version, new android.database.DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$$ExternalSyntheticLambda0
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Camera2StreamConfigurationMap(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback.this, dBRefHolder, sQLiteDatabase);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dBRefHolder, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            this.Camera2StreamConfigurationMap = context;
            this.getHighSpeedVideoSizes = dBRefHolder;
            this.getHighSpeedVideoFpsRanges = callback;
            this.getHighResolutionOutputSizeshNQ4ISI = z;
            if (str == null) {
                str = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "");
            }
            this.getOutputMinFrameDuration = new androidx.database.util.ProcessLock(str, context.getCacheDir(), false);
        }

        public final androidx.database.db.SupportSQLiteDatabase Camera2StreamConfigurationMap(boolean p0) {
            androidx.database.db.framework.FrameworkSQLiteDatabase wrappedDb;
            try {
                this.getOutputMinFrameDuration.lock((this.getHighSpeedVideoSizesFor || getDatabaseName() == null) ? false : true);
                this.getHighSpeedVideoFpsRangesFor = false;
                android.database.sqlite.SQLiteDatabase highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges(p0);
                if (this.getHighSpeedVideoFpsRangesFor) {
                    close();
                    wrappedDb = Camera2StreamConfigurationMap(p0);
                } else {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(highSpeedVideoFpsRanges, "");
                    wrappedDb = INSTANCE.getWrappedDb(this.getHighSpeedVideoSizes, highSpeedVideoFpsRanges);
                }
                return wrappedDb;
            } finally {
                this.getOutputMinFrameDuration.unlock();
            }
        }

        private final android.database.sqlite.SQLiteDatabase getHighSpeedVideoFpsRanges(boolean p0) {
            android.database.sqlite.SQLiteDatabase readableDatabase;
            android.database.sqlite.SQLiteDatabase readableDatabase2;
            android.database.sqlite.SQLiteDatabase readableDatabase3;
            java.io.File parentFile;
            java.lang.String databaseName = getDatabaseName();
            boolean z = this.getHighSpeedVideoSizesFor;
            if (databaseName != null && !z && (parentFile = this.Camera2StreamConfigurationMap.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                parentFile.isDirectory();
            }
            try {
                if (p0) {
                    readableDatabase3 = super.getWritableDatabase();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(readableDatabase3);
                } else {
                    readableDatabase3 = super.getReadableDatabase();
                    kotlin.jvm.internal.Intrinsics.checkNotNull(readableDatabase3);
                }
                return readableDatabase3;
            } catch (java.lang.Throwable unused) {
                try {
                    java.lang.Thread.sleep(500L);
                } catch (java.lang.InterruptedException unused2) {
                }
                try {
                    if (p0) {
                        readableDatabase2 = super.getWritableDatabase();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(readableDatabase2);
                    } else {
                        readableDatabase2 = super.getReadableDatabase();
                        kotlin.jvm.internal.Intrinsics.checkNotNull(readableDatabase2);
                    }
                    return readableDatabase2;
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (th instanceof androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) {
                        androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException callbackException = (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) th;
                        java.lang.Throwable cause = callbackException.getCause();
                        int i = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings.$EnumSwitchMapping$0[callbackException.getCamera2StreamConfigurationMap().ordinal()];
                        if (i == 1) {
                            throw cause;
                        }
                        if (i == 2) {
                            throw cause;
                        }
                        if (i == 3) {
                            throw cause;
                        }
                        if (i == 4) {
                            throw cause;
                        }
                        if (i != 5) {
                            throw new kotlin.NoWhenBranchMatchedException();
                        }
                        if (!(cause instanceof android.database.sqlite.SQLiteException)) {
                            throw cause;
                        }
                        th = cause;
                    }
                    if (!(th instanceof android.database.sqlite.SQLiteException) || databaseName == null || !this.getHighResolutionOutputSizeshNQ4ISI) {
                        throw th;
                    }
                    this.Camera2StreamConfigurationMap.deleteDatabase(databaseName);
                    try {
                        if (p0) {
                            readableDatabase = super.getWritableDatabase();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(readableDatabase);
                        } else {
                            readableDatabase = super.getReadableDatabase();
                            kotlin.jvm.internal.Intrinsics.checkNotNull(readableDatabase);
                        }
                        return readableDatabase;
                    } catch (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(android.database.sqlite.SQLiteDatabase p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            try {
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                callback.onCreate(INSTANCE.getWrappedDb(this.getHighSpeedVideoSizes, p0));
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.getHighSpeedVideoFpsRangesFor = true;
            try {
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                callback.onUpgrade(INSTANCE.getWrappedDb(this.getHighSpeedVideoSizes, p0), p1, p2);
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(android.database.sqlite.SQLiteDatabase p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (!this.getHighSpeedVideoFpsRangesFor && this.getHighSpeedVideoFpsRanges.version != p0.getVersion()) {
                p0.setMaxSqlCacheSize(1);
            }
            try {
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                callback.onConfigure(INSTANCE.getWrappedDb(this.getHighSpeedVideoSizes, p0));
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(android.database.sqlite.SQLiteDatabase p0, int p1, int p2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            this.getHighSpeedVideoFpsRangesFor = true;
            try {
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback = this.getHighSpeedVideoFpsRanges;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                callback.onDowngrade(INSTANCE.getWrappedDb(this.getHighSpeedVideoSizes, p0), p1, p2);
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(android.database.sqlite.SQLiteDatabase p0) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
            if (!this.getHighSpeedVideoFpsRangesFor) {
                try {
                    androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback = this.getHighSpeedVideoFpsRanges;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
                    callback.onOpen(INSTANCE.getWrappedDb(this.getHighSpeedVideoSizes, p0));
                } catch (java.lang.Throwable th) {
                    throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN, th);
                }
            }
            this.getHighSpeedVideoSizesFor = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            try {
                androidx.database.util.ProcessLock.lock$default(this.getOutputMinFrameDuration, false, 1, null);
                super.close();
                this.getHighSpeedVideoSizes.getHighSpeedVideoFpsRangesFor = null;
                this.getHighSpeedVideoSizesFor = false;
            } finally {
                this.getOutputMinFrameDuration.unlock();
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\f\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00038\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00058\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/getHighSpeedVideoFpsRangesFor;", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "p0", "", "p1", "<init>", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "getHighSpeedVideoSizes", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/lang/Throwable;", "getCause", "()Ljava/lang/Throwable;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
        static final class CallbackException extends java.lang.RuntimeException {

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private final java.lang.Throwable getHighSpeedVideoFpsRanges;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName Camera2StreamConfigurationMap;

            /* renamed from: getHighSpeedVideoSizes, reason: from getter */
            public final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName getCamera2StreamConfigurationMap() {
                return this.Camera2StreamConfigurationMap;
            }

            @Override // java.lang.Throwable
            public final java.lang.Throwable getCause() {
                return this.getHighSpeedVideoFpsRanges;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName, java.lang.Throwable th) {
                super(th);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackName, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(th, "");
                this.Camera2StreamConfigurationMap = callbackName;
                this.getHighSpeedVideoFpsRanges = th;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "<init>", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class CallbackName {
            private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_CONFIGURE;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_CREATE;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_DOWNGRADE;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_OPEN;
            public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName ON_UPGRADE;
            private static final /* synthetic */ androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[] getHighResolutionOutputSizeshNQ4ISI;

            private CallbackName(java.lang.String str, int i) {
            }

            static {
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName("ON_CONFIGURE", 0);
                ON_CONFIGURE = callbackName;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName2 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName("ON_CREATE", 1);
                ON_CREATE = callbackName2;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName3 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName("ON_UPGRADE", 2);
                ON_UPGRADE = callbackName3;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName4 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName("ON_DOWNGRADE", 3);
                ON_DOWNGRADE = callbackName4;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName5 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName("ON_OPEN", 4);
                ON_OPEN = callbackName5;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[] callbackNameArr = {callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
                getHighResolutionOutputSizeshNQ4ISI = callbackNameArr;
                Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(callbackNameArr);
            }

            public static androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[] values() {
                return (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName[]) getHighResolutionOutputSizeshNQ4ISI.clone();
            }

            public static androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName valueOf(java.lang.String str) {
                return (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName) java.lang.Enum.valueOf(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.class, str);
            }

            public static kotlin.enums.EnumEntries<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName> getEntries() {
                return Camera2StreamConfigurationMap;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "refHolder", "Landroid/database/sqlite/SQLiteDatabase;", "sqLiteDatabase", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "getWrappedDb", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;Landroid/database/sqlite/SQLiteDatabase;)Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public final androidx.database.db.framework.FrameworkSQLiteDatabase getWrappedDb(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder refHolder, android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refHolder, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "");
                androidx.database.db.framework.FrameworkSQLiteDatabase frameworkSQLiteDatabase = refHolder.getHighSpeedVideoFpsRangesFor;
                if (frameworkSQLiteDatabase != null && frameworkSQLiteDatabase.isDelegate$sqlite_framework(sqLiteDatabase)) {
                    return frameworkSQLiteDatabase;
                }
                androidx.database.db.framework.FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new androidx.database.db.framework.FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.getHighSpeedVideoFpsRangesFor = frameworkSQLiteDatabase2;
                return frameworkSQLiteDatabase2;
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public static /* synthetic */ void Camera2StreamConfigurationMap(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder, android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion companion = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNull(sQLiteDatabase);
            callback.onCorruption(companion.getWrappedDb(dBRefHolder, sQLiteDatabase));
        }

        @kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.values().length];
                try {
                    iArr[androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE.ordinal()] = 1;
                } catch (java.lang.NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE.ordinal()] = 2;
                } catch (java.lang.NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE.ordinal()] = 3;
                } catch (java.lang.NoSuchFieldError unused3) {
                }
                try {
                    iArr[androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE.ordinal()] = 4;
                } catch (java.lang.NoSuchFieldError unused4) {
                }
                try {
                    iArr[androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN.ordinal()] = 5;
                } catch (java.lang.NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }
    }

    public static /* synthetic */ androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper $r8$lambda$bMXVQYZgPq9YSTqMFpOzwjrmmJ8(androidx.database.db.framework.FrameworkSQLiteOpenHelper frameworkSQLiteOpenHelper) {
        androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper openHelper;
        java.lang.String str = frameworkSQLiteOpenHelper.getHighSpeedVideoSizes;
        if (str != null && frameworkSQLiteOpenHelper.Camera2StreamConfigurationMap) {
            openHelper = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.getHighResolutionOutputSizeshNQ4ISI, new java.io.File(androidx.sqlite.db.SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(frameworkSQLiteOpenHelper.getHighResolutionOutputSizeshNQ4ISI), frameworkSQLiteOpenHelper.getHighSpeedVideoSizes).getAbsolutePath(), new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.getHighSpeedVideoFpsRangesFor, frameworkSQLiteOpenHelper.getHighSpeedVideoFpsRanges);
        } else {
            openHelper = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper(frameworkSQLiteOpenHelper.getHighResolutionOutputSizeshNQ4ISI, str, new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder(), frameworkSQLiteOpenHelper.getHighSpeedVideoFpsRangesFor, frameworkSQLiteOpenHelper.getHighSpeedVideoFpsRanges);
        }
        openHelper.setWriteAheadLoggingEnabled(frameworkSQLiteOpenHelper.getHighSpeedVideoSizesFor);
        return openHelper;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final androidx.database.db.SupportSQLiteDatabase getReadableDatabase() {
        return this.getInputSizeshNQ4ISI.getValue().Camera2StreamConfigurationMap(false);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final androidx.database.db.SupportSQLiteDatabase getWritableDatabase() {
        return this.getInputSizeshNQ4ISI.getValue().Camera2StreamConfigurationMap(true);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z) {
        this(context, str, callback, z, false, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
    }
}
