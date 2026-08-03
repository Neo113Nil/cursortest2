package androidx.sqlite.db.framework;

/* compiled from: FrameworkSQLiteOpenHelper.kt */
@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0003\"#$B5\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u0010\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\tH\u0017R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014*\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00100\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u000e\u0010\u001d\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "context", "Landroid/content/Context;", "name", "", "callback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "useNoBackupDirectory", "", "allowDataLossOnRecovery", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "databaseName", "getDatabaseName", "()Ljava/lang/String;", "delegate", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "getDelegate$delegate", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper;)Ljava/lang/Object;", "getDelegate", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "lazyDelegate", "Lkotlin/Lazy;", "readableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getReadableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getWritableDatabase", "writeAheadLoggingEnabled", "close", "", "setWriteAheadLoggingEnabled", "enabled", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "DBRefHolder", "OpenHelper", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class FrameworkSQLiteOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper {
    private static final java.lang.String TAG = "SupportSQLite";
    private final boolean allowDataLossOnRecovery;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;
    private final android.content.Context context;
    private final kotlin.Lazy<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper> lazyDelegate;
    private final java.lang.String name;
    private final boolean useNoBackupDirectory;
    private boolean writeAheadLoggingEnabled;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
        this(context, str, callback, false, false, 24, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z) {
        this(context, str, callback, z, false, 16, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z;
        this.allowDataLossOnRecovery = z2;
        this.lazyDelegate = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper>() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$lazyDelegate$1
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper invoke() {
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper openHelper;
                android.content.Context context2;
                java.lang.String str2;
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback2;
                boolean z3;
                boolean z4;
                java.lang.String str3;
                boolean z5;
                android.content.Context context3;
                java.lang.String str4;
                android.content.Context context4;
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback3;
                boolean z6;
                if (android.os.Build.VERSION.SDK_INT >= 23) {
                    str3 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.name;
                    if (str3 != null) {
                        z5 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.useNoBackupDirectory;
                        if (z5) {
                            context3 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.context;
                            java.io.File noBackupFilesDir = androidx.sqlite.db.SupportSQLiteCompat.Api21Impl.getNoBackupFilesDir(context3);
                            str4 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.name;
                            java.io.File file = new java.io.File(noBackupFilesDir, str4);
                            context4 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.context;
                            java.lang.String absolutePath = file.getAbsolutePath();
                            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder(null);
                            callback3 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.callback;
                            z6 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.allowDataLossOnRecovery;
                            openHelper = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper(context4, absolutePath, dBRefHolder, callback3, z6);
                            z4 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.writeAheadLoggingEnabled;
                            androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z4);
                            return openHelper;
                        }
                    }
                }
                context2 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.context;
                str2 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.name;
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dBRefHolder2 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder(null);
                callback2 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.callback;
                z3 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.allowDataLossOnRecovery;
                openHelper = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper(context2, str2, dBRefHolder2, callback2, z3);
                z4 = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.this.writeAheadLoggingEnabled;
                androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(openHelper, z4);
                return openHelper;
            }
        });
    }

    public /* synthetic */ FrameworkSQLiteOpenHelper(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, callback, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper getDelegate() {
        return this.lazyDelegate.getValue();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName, reason: from getter */
    public java.lang.String getName() {
        return this.name;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        if (this.lazyDelegate.isInitialized()) {
            androidx.sqlite.db.SupportSQLiteCompat.Api16Impl.setWriteAheadLoggingEnabled(getDelegate(), enabled);
        }
        this.writeAheadLoggingEnabled = enabled;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        return getDelegate().getSupportDatabase(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        return getDelegate().getSupportDatabase(false);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.lazyDelegate.isInitialized()) {
            getDelegate().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u0000 /2\u00020\u0001:\u0003-./B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000bJ\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010#\u001a\u00020!2\u0006\u0010\u001d\u001a\u00020\u000bH\u0002J\u0010\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020!H\u0016J\u0010\u0010&\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!H\u0016J \u0010'\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020!H\u0016J \u0010,\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020!2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020)H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00060"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "context", "Landroid/content/Context;", "name", "", "dbRef", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "callback", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "allowDataLossOnRecovery", "", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;Z)V", "getAllowDataLossOnRecovery", "()Z", "getCallback", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "getContext", "()Landroid/content/Context;", "getDbRef", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "lock", "Landroidx/sqlite/util/ProcessLock;", "migrated", "opened", "close", "", "getSupportDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "writable", "getWrappedDb", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "sqLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "getWritableOrReadableDatabase", "innerGetDatabase", "onConfigure", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "onCreate", "onDowngrade", "oldVersion", "", "newVersion", "onOpen", "onUpgrade", "CallbackException", "CallbackName", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class OpenHelper extends android.database.sqlite.SQLiteOpenHelper {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion INSTANCE = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion(null);
        private final boolean allowDataLossOnRecovery;
        private final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;
        private final android.content.Context context;
        private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dbRef;
        private final androidx.sqlite.util.ProcessLock lock;
        private boolean migrated;
        private boolean opened;

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "", "(Ljava/lang/String;I)V", "ON_CONFIGURE", "ON_CREATE", "ON_UPGRADE", "ON_DOWNGRADE", "ON_OPEN", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public enum CallbackName {
            ON_CONFIGURE,
            ON_CREATE,
            ON_UPGRADE,
            ON_DOWNGRADE,
            ON_OPEN
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
        public /* synthetic */ class WhenMappings {
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

        public final android.content.Context getContext() {
            return this.context;
        }

        public final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder getDbRef() {
            return this.dbRef;
        }

        public final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback getCallback() {
            return this.callback;
        }

        public final boolean getAllowDataLossOnRecovery() {
            return this.allowDataLossOnRecovery;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(android.content.Context context, java.lang.String str, final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dbRef, final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z) {
            super(context, str, null, callback.version, new android.database.DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$$ExternalSyntheticLambda0
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(android.database.sqlite.SQLiteDatabase sQLiteDatabase) {
                    androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper._init_$lambda$0(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback.this, dbRef, sQLiteDatabase);
                }
            });
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbRef, "dbRef");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "callback");
            this.context = context;
            this.dbRef = dbRef;
            this.callback = callback;
            this.allowDataLossOnRecovery = z;
            if (str == null) {
                str = java.util.UUID.randomUUID().toString();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "randomUUID().toString()");
            }
            this.lock = new androidx.sqlite.util.ProcessLock(str, context.getCacheDir(), false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void _init_$lambda$0(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder dbRef, android.database.sqlite.SQLiteDatabase dbObj) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "$callback");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dbRef, "$dbRef");
            androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.Companion companion = INSTANCE;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(dbObj, "dbObj");
            callback.onCorruption(companion.getWrappedDb(dbRef, dbObj));
        }

        public final androidx.sqlite.db.SupportSQLiteDatabase getSupportDatabase(boolean writable) {
            try {
                this.lock.lock((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                android.database.sqlite.SQLiteDatabase innerGetDatabase = innerGetDatabase(writable);
                if (this.migrated) {
                    close();
                    return getSupportDatabase(writable);
                }
                return getWrappedDb(innerGetDatabase);
            } finally {
                this.lock.unlock();
            }
        }

        private final android.database.sqlite.SQLiteDatabase innerGetDatabase(boolean writable) {
            java.io.File parentFile;
            java.lang.String databaseName = getDatabaseName();
            boolean z = this.opened;
            if (databaseName != null && !z && (parentFile = this.context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    android.util.Log.w(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.TAG, "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                return getWritableOrReadableDatabase(writable);
            } catch (java.lang.Throwable unused) {
                super.close();
                try {
                    java.lang.Thread.sleep(500L);
                } catch (java.lang.InterruptedException unused2) {
                }
                try {
                    return getWritableOrReadableDatabase(writable);
                } catch (java.lang.Throwable th) {
                    super.close();
                    if (th instanceof androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException) {
                        androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException callbackException = th;
                        java.lang.Throwable cause = callbackException.getCause();
                        int i = androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.WhenMappings.$EnumSwitchMapping$0[callbackException.getCallbackName().ordinal()];
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
                        if (!(cause instanceof android.database.sqlite.SQLiteException)) {
                            throw cause;
                        }
                    } else if (th instanceof android.database.sqlite.SQLiteException) {
                        if (databaseName == null || !this.allowDataLossOnRecovery) {
                            throw th;
                        }
                    } else {
                        throw th;
                    }
                    this.context.deleteDatabase(databaseName);
                    try {
                        return getWritableOrReadableDatabase(writable);
                    } catch (androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException e) {
                        throw e.getCause();
                    }
                }
            }
        }

        private final android.database.sqlite.SQLiteDatabase getWritableOrReadableDatabase(boolean writable) {
            if (writable) {
                android.database.sqlite.SQLiteDatabase writableDatabase = super.getWritableDatabase();
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(writableDatabase, "{\n                super.…eDatabase()\n            }");
                return writableDatabase;
            }
            android.database.sqlite.SQLiteDatabase readableDatabase = super.getReadableDatabase();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(readableDatabase, "{\n                super.…eDatabase()\n            }");
            return readableDatabase;
        }

        public final androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            return INSTANCE.getWrappedDb(this.dbRef, sqLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            try {
                this.callback.onCreate(getWrappedDb(sqLiteDatabase));
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(android.database.sqlite.SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
            this.migrated = true;
            try {
                this.callback.onUpgrade(getWrappedDb(sqLiteDatabase), oldVersion, newVersion);
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_UPGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(android.database.sqlite.SQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated && this.callback.version != db.getVersion()) {
                db.setMaxSqlCacheSize(1);
            }
            try {
                this.callback.onConfigure(getWrappedDb(db));
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(android.database.sqlite.SQLiteDatabase db, int oldVersion, int newVersion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
            this.migrated = true;
            try {
                this.callback.onDowngrade(getWrappedDb(db), oldVersion, newVersion);
            } catch (java.lang.Throwable th) {
                throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(android.database.sqlite.SQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
            if (!this.migrated) {
                try {
                    this.callback.onOpen(getWrappedDb(db));
                } catch (java.lang.Throwable th) {
                    throw new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public void close() {
            try {
                androidx.sqlite.util.ProcessLock.lock$default(this.lock, false, 1, null);
                super.close();
                this.dbRef.setDb(null);
                this.opened = false;
            } finally {
                this.lock.unlock();
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "callbackName", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "cause", "", "(Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;Ljava/lang/Throwable;)V", "getCallbackName", "()Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackName;", "getCause", "()Ljava/lang/Throwable;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        private static final class CallbackException extends java.lang.RuntimeException {
            private final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName;
            private final java.lang.Throwable cause;

            public final androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName getCallbackName() {
                return this.callbackName;
            }

            @Override // java.lang.Throwable
            public java.lang.Throwable getCause() {
                return this.cause;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public CallbackException(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.OpenHelper.CallbackName callbackName, java.lang.Throwable cause) {
                super(cause);
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callbackName, "callbackName");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cause, "cause");
                this.callbackName = callbackName;
                this.cause = cause;
            }
        }

        /* compiled from: FrameworkSQLiteOpenHelper.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$Companion;", "", "()V", "getWrappedDb", "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "refHolder", "Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "sqLiteDatabase", "Landroid/database/sqlite/SQLiteDatabase;", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.sqlite.db.framework.FrameworkSQLiteDatabase getWrappedDb(androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper.DBRefHolder refHolder, android.database.sqlite.SQLiteDatabase sqLiteDatabase) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(refHolder, "refHolder");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase db = refHolder.getDb();
                if (db != null && db.isDelegate(sqLiteDatabase)) {
                    return db;
                }
                androidx.sqlite.db.framework.FrameworkSQLiteDatabase frameworkSQLiteDatabase = new androidx.sqlite.db.framework.FrameworkSQLiteDatabase(sqLiteDatabase);
                refHolder.setDb(frameworkSQLiteDatabase);
                return frameworkSQLiteDatabase;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: FrameworkSQLiteOpenHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$DBRefHolder;", "", com.facebook.appevents.UserDataStore.DATE_OF_BIRTH, "Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "(Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;)V", "getDb", "()Landroidx/sqlite/db/framework/FrameworkSQLiteDatabase;", "setDb", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class DBRefHolder {
        private androidx.sqlite.db.framework.FrameworkSQLiteDatabase db;

        public DBRefHolder(androidx.sqlite.db.framework.FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }

        public final androidx.sqlite.db.framework.FrameworkSQLiteDatabase getDb() {
            return this.db;
        }

        public final void setDb(androidx.sqlite.db.framework.FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.db = frameworkSQLiteDatabase;
        }
    }
}
