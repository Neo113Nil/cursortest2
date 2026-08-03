package androidx.room;

/* compiled from: AutoClosingRoomOpenHelper.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001a\u001b\u001cB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0011\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0019H\u0097\u0001R\u0010\u0010\u0004\u001a\u00020\u00058\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u0004\u0018\u00010\nX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u0001X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00108WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001d"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "autoCloser", "Landroidx/room/AutoCloser;", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/AutoCloser;)V", "autoClosingDb", "Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "databaseName", "", "getDatabaseName", "()Ljava/lang/String;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "readableDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getReadableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getWritableDatabase", "close", "", "setWriteAheadLoggingEnabled", "enabled", "", "AutoClosingSupportSQLiteDatabase", "AutoClosingSupportSqliteStatement", "KeepAliveCursor", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AutoClosingRoomOpenHelper implements androidx.sqlite.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {
    public final androidx.room.AutoCloser autoCloser;
    private final androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final androidx.sqlite.db.SupportSQLiteOpenHelper delegate;

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName */
    public java.lang.String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    public AutoClosingRoomOpenHelper(androidx.sqlite.db.SupportSQLiteOpenHelper delegate, androidx.room.AutoCloser autoCloser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
        autoCloser.init(getDelegate());
        this.autoClosingDb = new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase(autoCloser);
    }

    @Override // androidx.room.DelegatingOpenHelper
    public androidx.sqlite.db.SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public androidx.sqlite.db.SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.autoClosingDb.close();
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020%H\u0016J\u0010\u0010'\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0016J\u0010\u0010*\u001a\u00020%2\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010+\u001a\u00020%H\u0016J\u0010\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020\bH\u0016J3\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\b2\b\u00101\u001a\u0004\u0018\u00010\b2\u0012\u00102\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u000104\u0018\u000103H\u0016¢\u0006\u0002\u00105J\b\u00106\u001a\u00020%H\u0016J\b\u00107\u001a\u00020\fH\u0016J\b\u00108\u001a\u00020%H\u0016J\u0010\u00109\u001a\u00020%2\u0006\u0010.\u001a\u00020\bH\u0016J'\u00109\u001a\u00020%2\u0006\u0010.\u001a\u00020\b2\u0010\u0010:\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010403H\u0016¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020\fH\u0016J \u0010=\u001a\u00020\u00132\u0006\u00100\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\f2\u0006\u0010B\u001a\u00020\u001fH\u0016J\u0006\u0010C\u001a\u00020%J\u0010\u0010D\u001a\u00020E2\u0006\u0010D\u001a\u00020FH\u0016J\u001a\u0010D\u001a\u00020E2\u0006\u0010D\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010HH\u0017J\u0010\u0010D\u001a\u00020E2\u0006\u0010D\u001a\u00020\bH\u0016J'\u0010D\u001a\u00020E2\u0006\u0010D\u001a\u00020\b2\u0010\u0010:\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010403H\u0016¢\u0006\u0002\u0010IJ\u0010\u0010J\u001a\u00020%2\u0006\u0010K\u001a\u00020\fH\u0017J\u0010\u0010L\u001a\u00020%2\u0006\u0010M\u001a\u00020NH\u0016J\u0010\u0010O\u001a\u00020%2\u0006\u0010P\u001a\u00020\u001fH\u0016J\u0010\u0010Q\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016J\b\u0010R\u001a\u00020%H\u0016JC\u0010S\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\b2\u0006\u0010>\u001a\u00020\u001f2\u0006\u0010?\u001a\u00020@2\b\u00101\u001a\u0004\u0018\u00010\b2\u0012\u00102\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u000104\u0018\u000103H\u0016¢\u0006\u0002\u0010TJ\b\u0010U\u001a\u00020\fH\u0016J\u0010\u0010U\u001a\u00020\f2\u0006\u0010V\u001a\u00020\u0013H\u0016R(\u0010\u0005\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u0007\u0018\u00010\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u000e\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\f8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00138V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR$\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006W"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "autoCloser", "Landroidx/room/AutoCloser;", "(Landroidx/room/AutoCloser;)V", "attachedDbs", "", "Landroid/util/Pair;", "", "getAttachedDbs", "()Ljava/util/List;", "isDatabaseIntegrityOk", "", "()Z", "isDbLockedByCurrentThread", "isOpen", "isReadOnly", "isWriteAheadLoggingEnabled", "maximumSize", "", "getMaximumSize", "()J", "numBytes", "pageSize", "getPageSize", "setPageSize", "(J)V", "path", "getPath", "()Ljava/lang/String;", "version", "", "getVersion", "()I", "setVersion", "(I)V", "beginTransaction", "", "beginTransactionNonExclusive", "beginTransactionWithListener", "transactionListener", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListenerNonExclusive", "close", "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "delete", com.ironsource.B5.R, "whereClause", "whereArgs", "", "", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "disableWriteAheadLogging", "enableWriteAheadLogging", "endTransaction", "execSQL", "bindArgs", "(Ljava/lang/String;[Ljava/lang/Object;)V", "inTransaction", "insert", "conflictAlgorithm", "values", "Landroid/content/ContentValues;", "needUpgrade", "newVersion", "pokeOpen", com.google.android.gms.actions.SearchIntents.EXTRA_QUERY, "Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "cancellationSignal", "Landroid/os/CancellationSignal;", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "setForeignKeyConstraintsEnabled", "enabled", "setLocale", "locale", "Ljava/util/Locale;", "setMaxSqlCacheSize", "cacheSize", "setMaximumSize", "setTransactionSuccessful", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "yieldIfContendedSafely", "sleepAfterYieldDelayMillis", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements androidx.sqlite.db.SupportSQLiteDatabase {
        private final androidx.room.AutoCloser autoCloser;

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ void execPerConnectionSQL(java.lang.String str, java.lang.Object[] objArr) {
            androidx.sqlite.db.SupportSQLiteDatabase.CC.$default$execPerConnectionSQL(this, str, objArr);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            return androidx.sqlite.db.SupportSQLiteDatabase.CC.$default$isExecPerConnectionSQLSupported(this);
        }

        public AutoClosingSupportSQLiteDatabase(androidx.room.AutoCloser autoCloser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.autoCloser = autoCloser;
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pokeOpen$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase it) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(it, "it");
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String sql) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
            return new androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement(sql, this.autoCloser);
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(transactionListener);
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener transactionListener) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transactionListener, "transactionListener");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(transactionListener);
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void endTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                throw new java.lang.IllegalStateException("End transaction called but delegateDb is null".toString());
            }
            try {
                androidx.sqlite.db.SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
                kotlin.jvm.internal.Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setTransactionSuccessful() {
            kotlin.Unit unit;
            androidx.sqlite.db.SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                delegateDatabase.setTransactionSuccessful();
                unit = kotlin.Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                throw new java.lang.IllegalStateException("setTransactionSuccessful called but delegateDb is null".toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Boolean.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely() {
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean yieldIfContendedSafely(long sleepAfterYieldDelayMillis) {
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE)).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int getVersion() {
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Integer.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(java.lang.Object obj, java.lang.Object obj2) {
                    ((androidx.sqlite.db.SupportSQLiteDatabase) obj).setVersion(((java.lang.Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setVersion(final int i) {
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.setVersion(i);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getMaximumSize() {
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.internal.PropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long setMaximumSize(final long numBytes) {
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaximumSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Long invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    return java.lang.Long.valueOf(db.setMaximumSize(numBytes));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long getPageSize() {
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.internal.MutablePropertyReference1Impl() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public java.lang.Object get(java.lang.Object obj) {
                    return java.lang.Long.valueOf(((androidx.sqlite.db.SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public void set(java.lang.Object obj, java.lang.Object obj2) {
                    ((androidx.sqlite.db.SupportSQLiteDatabase) obj).setPageSize(((java.lang.Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setPageSize(final long j) {
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.setPageSize(j);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(java.lang.String query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(java.lang.String query, java.lang.Object[] bindArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, bindArgs), this.autoCloser);
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery query) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query), this.autoCloser);
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery query, android.os.CancellationSignal cancellationSignal) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(query, "query");
            try {
                return new androidx.room.AutoClosingRoomOpenHelper.KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(query, cancellationSignal), this.autoCloser);
            } catch (java.lang.Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public long insert(final java.lang.String table, final int conflictAlgorithm, final android.content.ContentValues values) throws android.database.SQLException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$insert$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Long invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    return java.lang.Long.valueOf(db.insert(table, conflictAlgorithm, values));
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int delete(final java.lang.String table, final java.lang.String whereClause, final java.lang.Object[] whereArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$delete$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Integer invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    return java.lang.Integer.valueOf(db.delete(table, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public int update(final java.lang.String table, final int conflictAlgorithm, final android.content.ContentValues values, final java.lang.String whereClause, final java.lang.Object[] whereArgs) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(table, "table");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(values, "values");
            return ((java.lang.Number) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$update$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Integer invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    return java.lang.Integer.valueOf(db.update(table, conflictAlgorithm, values, whereClause, whereArgs));
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final java.lang.String sql) throws android.database.SQLException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void execSQL(final java.lang.String sql, final java.lang.Object[] bindArgs) throws android.database.SQLException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bindArgs, "bindArgs");
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$execSQL$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.execSQL(sql, bindArgs);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isReadOnly() {
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.sqlite.db.SupportSQLiteDatabase obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return java.lang.Boolean.valueOf(obj.isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isOpen() {
            androidx.sqlite.db.SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase == null) {
                return false;
            }
            return delegateDatabase.isOpen();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean needUpgrade(final int newVersion) {
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$needUpgrade$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    return java.lang.Boolean.valueOf(db.needUpgrade(newVersion));
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public java.lang.String getPath() {
            return (java.lang.String) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(androidx.sqlite.db.SupportSQLiteDatabase obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getPath();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setLocale(final java.util.Locale locale) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setLocale$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.setLocale(locale);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setMaxSqlCacheSize(final int cacheSize) {
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setMaxSqlCacheSize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.setMaxSqlCacheSize(cacheSize);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void setForeignKeyConstraintsEnabled(final boolean enabled) {
            this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$setForeignKeyConstraintsEnabled$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    db.setForeignKeyConstraintsEnabled(enabled);
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean enableWriteAheadLogging() {
            throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public void disableWriteAheadLogging() {
            throw new java.lang.UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isWriteAheadLoggingEnabled() {
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    return java.lang.Boolean.valueOf(db.isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            return (java.util.List) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.util.List<? extends android.util.Pair<java.lang.String, java.lang.String>>>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.functions.Function1
                public final java.util.List<android.util.Pair<java.lang.String, java.lang.String>> invoke(androidx.sqlite.db.SupportSQLiteDatabase obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.getAttachedDbs();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteDatabase
        public boolean isDatabaseIntegrityOk() {
            return ((java.lang.Boolean) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, java.lang.Boolean>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Boolean invoke(androidx.sqlite.db.SupportSQLiteDatabase obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return java.lang.Boolean.valueOf(obj.isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            this.autoCloser.closeDatabaseIfOpen();
        }
    }

    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J!\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fH\u0096\u0001J\t\u0010\u000e\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u000f\u001a\n \r*\u0004\u0018\u00010\u00100\u00102\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u0010\u0011\u001a\u00020\nH\u0096\u0001J\u0019\u0010\u0012\u001a\u00020\n2\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J\u0019\u0010\u0014\u001a\u00020\n2\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010\u00130\u0013H\u0096\u0001J\u0019\u0010\u0015\u001a\n \r*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J4\u0010\u0016\u001a(\u0012\f\u0012\n \r*\u0004\u0018\u00010\u00130\u0013 \r*\u0014\u0012\u000e\b\u0001\u0012\n \r*\u0004\u0018\u00010\u00130\u0013\u0018\u00010\u00170\u0017H\u0096\u0001¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010\u001c\u001a\n \r*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0011\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010 \u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010!\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\b\u0010#\u001a\u00020$H\u0017J\u000e\u0010%\u001a\b\u0012\u0004\u0012\u00020$0&H\u0017J\t\u0010'\u001a\u00020\nH\u0096\u0001J\u0011\u0010(\u001a\u00020)2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0019\u0010*\u001a\n \r*\u0004\u0018\u00010\u00130\u00132\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u0010,\u001a\u00020-H\u0096\u0001J\t\u0010.\u001a\u00020-H\u0096\u0001J\t\u0010/\u001a\u00020-H\u0096\u0001J\t\u00100\u001a\u00020-H\u0096\u0001J\t\u00101\u001a\u00020-H\u0096\u0001J\t\u00102\u001a\u00020-H\u0096\u0001J\u0011\u00103\u001a\u00020-2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\u0011\u00104\u001a\u00020-2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u00105\u001a\u00020-H\u0096\u0001J\t\u00106\u001a\u00020-H\u0096\u0001J\t\u00107\u001a\u00020-H\u0096\u0001J\u0011\u00108\u001a\u00020-2\u0006\u0010\t\u001a\u00020\nH\u0096\u0001J\t\u00109\u001a\u00020-H\u0096\u0001J\u0019\u0010:\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010;0;H\u0096\u0001J\u0019\u0010<\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010=0=H\u0096\u0001J\t\u0010>\u001a\u00020-H\u0097\u0001J!\u0010?\u001a\n \r*\u0004\u0018\u00010\u001d0\u001d2\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010\u001d0\u001dH\u0096\u0001J\u0010\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u001dH\u0017J)\u0010B\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010C0C2\u000e\u0010\u000b\u001a\n \r*\u0004\u0018\u00010$0$H\u0096\u0001J\u001e\u0010D\u001a\u00020\u00072\u0006\u0010E\u001a\u00020C2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020$0&H\u0017J\u0019\u0010G\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010;0;H\u0096\u0001J\u0019\u0010H\u001a\u00020\u00072\u000e\u0010\t\u001a\n \r*\u0004\u0018\u00010=0=H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "delegate", "autoCloser", "Landroidx/room/AutoCloser;", "(Landroid/database/Cursor;Landroidx/room/AutoCloser;)V", "close", "", "copyStringToBuffer", "p0", "", "p1", "Landroid/database/CharArrayBuffer;", "kotlin.jvm.PlatformType", "deactivate", "getBlob", "", "getColumnCount", "getColumnIndex", "", "getColumnIndexOrThrow", "getColumnName", "getColumnNames", "", "()[Ljava/lang/String;", "getCount", "getDouble", "", "getExtras", "Landroid/os/Bundle;", "getFloat", "", "getInt", "getLong", "", "getNotificationUri", "Landroid/net/Uri;", "getNotificationUris", "", "getPosition", "getShort", "", "getString", "getType", "getWantsAllOnMoveCalls", "", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "registerContentObserver", "Landroid/database/ContentObserver;", "registerDataSetObserver", "Landroid/database/DataSetObserver;", "requery", "respond", "setExtras", "extras", "setNotificationUri", "Landroid/content/ContentResolver;", "setNotificationUris", "cr", "uris", "unregisterContentObserver", "unregisterDataSetObserver", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    private static final class KeepAliveCursor implements android.database.Cursor {
        private final androidx.room.AutoCloser autoCloser;
        private final android.database.Cursor delegate;

        @Override // android.database.Cursor
        public void copyStringToBuffer(int p0, android.database.CharArrayBuffer p1) {
            this.delegate.copyStringToBuffer(p0, p1);
        }

        @Override // android.database.Cursor
        @kotlin.Deprecated(message = "Deprecated in Java")
        public void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public byte[] getBlob(int p0) {
            return this.delegate.getBlob(p0);
        }

        @Override // android.database.Cursor
        public int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public int getColumnIndex(java.lang.String p0) {
            return this.delegate.getColumnIndex(p0);
        }

        @Override // android.database.Cursor
        public int getColumnIndexOrThrow(java.lang.String p0) {
            return this.delegate.getColumnIndexOrThrow(p0);
        }

        @Override // android.database.Cursor
        public java.lang.String getColumnName(int p0) {
            return this.delegate.getColumnName(p0);
        }

        @Override // android.database.Cursor
        public java.lang.String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public double getDouble(int p0) {
            return this.delegate.getDouble(p0);
        }

        @Override // android.database.Cursor
        public android.os.Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public float getFloat(int p0) {
            return this.delegate.getFloat(p0);
        }

        @Override // android.database.Cursor
        public int getInt(int p0) {
            return this.delegate.getInt(p0);
        }

        @Override // android.database.Cursor
        public long getLong(int p0) {
            return this.delegate.getLong(p0);
        }

        @Override // android.database.Cursor
        public int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public short getShort(int p0) {
            return this.delegate.getShort(p0);
        }

        @Override // android.database.Cursor
        public java.lang.String getString(int p0) {
            return this.delegate.getString(p0);
        }

        @Override // android.database.Cursor
        public int getType(int p0) {
            return this.delegate.getType(p0);
        }

        @Override // android.database.Cursor
        public boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public boolean isNull(int p0) {
            return this.delegate.isNull(p0);
        }

        @Override // android.database.Cursor
        public boolean move(int p0) {
            return this.delegate.move(p0);
        }

        @Override // android.database.Cursor
        public boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public boolean moveToPosition(int p0) {
            return this.delegate.moveToPosition(p0);
        }

        @Override // android.database.Cursor
        public boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public void registerContentObserver(android.database.ContentObserver p0) {
            this.delegate.registerContentObserver(p0);
        }

        @Override // android.database.Cursor
        public void registerDataSetObserver(android.database.DataSetObserver p0) {
            this.delegate.registerDataSetObserver(p0);
        }

        @Override // android.database.Cursor
        @kotlin.Deprecated(message = "Deprecated in Java")
        public boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public android.os.Bundle respond(android.os.Bundle p0) {
            return this.delegate.respond(p0);
        }

        @Override // android.database.Cursor
        public void setNotificationUri(android.content.ContentResolver p0, android.net.Uri p1) {
            this.delegate.setNotificationUri(p0, p1);
        }

        @Override // android.database.Cursor
        public void unregisterContentObserver(android.database.ContentObserver p0) {
            this.delegate.unregisterContentObserver(p0);
        }

        @Override // android.database.Cursor
        public void unregisterDataSetObserver(android.database.DataSetObserver p0) {
            this.delegate.unregisterDataSetObserver(p0);
        }

        public KeepAliveCursor(android.database.Cursor delegate, androidx.room.AutoCloser autoCloser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "delegate");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.delegate = delegate;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public void setNotificationUris(android.content.ContentResolver cr, java.util.List<? extends android.net.Uri> uris) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cr, "cr");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(uris, "uris");
            androidx.sqlite.db.SupportSQLiteCompat.Api29Impl.setNotificationUris(this.delegate, cr, uris);
        }

        @Override // android.database.Cursor
        public android.net.Uri getNotificationUri() {
            return androidx.sqlite.db.SupportSQLiteCompat.Api19Impl.getNotificationUri(this.delegate);
        }

        @Override // android.database.Cursor
        public java.util.List<android.net.Uri> getNotificationUris() {
            return androidx.sqlite.db.SupportSQLiteCompat.Api29Impl.getNotificationUris(this.delegate);
        }

        @Override // android.database.Cursor
        public void setExtras(android.os.Bundle extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            androidx.sqlite.db.SupportSQLiteCompat.Api23Impl.setExtras(this.delegate, extras);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: AutoClosingRoomOpenHelper.kt */
    @kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\fH\u0016J\b\u0010\u0018\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0001H\u0002J\b\u0010\u001b\u001a\u00020\fH\u0016J\b\u0010\u001c\u001a\u00020\u0014H\u0016J'\u0010\u001d\u001a\u0002H\u001e\"\u0004\b\u0000\u0010\u001e2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u0002H\u001e0 H\u0002¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u000eH\u0016J\u001a\u0010#\u001a\u00020\f2\u0006\u0010$\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010%\u001a\u00020\u0014H\u0016J\n\u0010&\u001a\u0004\u0018\u00010\u0003H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\t0\bj\n\u0012\u0006\u0012\u0004\u0018\u00010\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/room/AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "", "autoCloser", "Landroidx/room/AutoCloser;", "(Ljava/lang/String;Landroidx/room/AutoCloser;)V", "binds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "bindBlob", "", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "", "value", "", "bindDouble", "", "bindLong", "", "bindNull", "bindString", "clearBindings", "close", "doBinds", "supportSQLiteStatement", "execute", "executeInsert", "executeSqliteStatementWithRefCount", "T", "block", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "executeUpdateDelete", "saveBinds", "bindIndex", "simpleQueryForLong", "simpleQueryForString", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    static final class AutoClosingSupportSqliteStatement implements androidx.sqlite.db.SupportSQLiteStatement {
        private final androidx.room.AutoCloser autoCloser;
        private final java.util.ArrayList<java.lang.Object> binds;
        private final java.lang.String sql;

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
        }

        public AutoClosingSupportSqliteStatement(java.lang.String sql, androidx.room.AutoCloser autoCloser) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sql, "sql");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
            this.sql = sql;
            this.autoCloser = autoCloser;
            this.binds = new java.util.ArrayList<>();
        }

        private final <T> T executeSqliteStatementWithRefCount(final kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteStatement, ? extends T> block) {
            return (T) this.autoCloser.executeRefCountingFunction(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteDatabase, T>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeSqliteStatementWithRefCount$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public final T invoke(androidx.sqlite.db.SupportSQLiteDatabase db) {
                    java.lang.String str;
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "db");
                    str = androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.this.sql;
                    androidx.sqlite.db.SupportSQLiteStatement compileStatement = db.compileStatement(str);
                    androidx.room.AutoClosingRoomOpenHelper.AutoClosingSupportSqliteStatement.this.doBinds(compileStatement);
                    return block.invoke(compileStatement);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void doBinds(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement) {
            java.util.Iterator<T> it = this.binds.iterator();
            int i = 0;
            while (it.hasNext()) {
                it.next();
                int i2 = i + 1;
                if (i < 0) {
                    kotlin.collections.CollectionsKt.throwIndexOverflow();
                }
                java.lang.Object obj = this.binds.get(i);
                if (obj == null) {
                    supportSQLiteStatement.bindNull(i2);
                } else if (obj instanceof java.lang.Long) {
                    supportSQLiteStatement.bindLong(i2, ((java.lang.Number) obj).longValue());
                } else if (obj instanceof java.lang.Double) {
                    supportSQLiteStatement.bindDouble(i2, ((java.lang.Number) obj).doubleValue());
                } else if (obj instanceof java.lang.String) {
                    supportSQLiteStatement.bindString(i2, (java.lang.String) obj);
                } else if (obj instanceof byte[]) {
                    supportSQLiteStatement.bindBlob(i2, (byte[]) obj);
                }
                i = i2;
            }
        }

        private final void saveBinds(int bindIndex, java.lang.Object value) {
            int size;
            int i = bindIndex - 1;
            if (i >= this.binds.size() && (size = this.binds.size()) <= i) {
                while (true) {
                    this.binds.add(null);
                    if (size == i) {
                        break;
                    } else {
                        size++;
                    }
                }
            }
            this.binds.set(i, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public void execute() {
            executeSqliteStatementWithRefCount(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteStatement, java.lang.Object>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$execute$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Object invoke(androidx.sqlite.db.SupportSQLiteStatement statement) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(statement, "statement");
                    statement.execute();
                    return null;
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public int executeUpdateDelete() {
            return ((java.lang.Number) executeSqliteStatementWithRefCount(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteStatement, java.lang.Integer>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeUpdateDelete$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Integer invoke(androidx.sqlite.db.SupportSQLiteStatement obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return java.lang.Integer.valueOf(obj.executeUpdateDelete());
                }
            })).intValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long executeInsert() {
            return ((java.lang.Number) executeSqliteStatementWithRefCount(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteStatement, java.lang.Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$executeInsert$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Long invoke(androidx.sqlite.db.SupportSQLiteStatement obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return java.lang.Long.valueOf(obj.executeInsert());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public long simpleQueryForLong() {
            return ((java.lang.Number) executeSqliteStatementWithRefCount(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteStatement, java.lang.Long>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForLong$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.Long invoke(androidx.sqlite.db.SupportSQLiteStatement obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return java.lang.Long.valueOf(obj.simpleQueryForLong());
                }
            })).longValue();
        }

        @Override // androidx.sqlite.db.SupportSQLiteStatement
        public java.lang.String simpleQueryForString() {
            return (java.lang.String) executeSqliteStatementWithRefCount(new kotlin.jvm.functions.Function1<androidx.sqlite.db.SupportSQLiteStatement, java.lang.String>() { // from class: androidx.room.AutoClosingRoomOpenHelper$AutoClosingSupportSqliteStatement$simpleQueryForString$1
                @Override // kotlin.jvm.functions.Function1
                public final java.lang.String invoke(androidx.sqlite.db.SupportSQLiteStatement obj) {
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(obj, "obj");
                    return obj.simpleQueryForString();
                }
            });
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindNull(int index) {
            saveBinds(index, null);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindLong(int index, long value) {
            saveBinds(index, java.lang.Long.valueOf(value));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindDouble(int index, double value) {
            saveBinds(index, java.lang.Double.valueOf(value));
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindString(int index, java.lang.String value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(index, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void bindBlob(int index, byte[] value) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
            saveBinds(index, value);
        }

        @Override // androidx.sqlite.db.SupportSQLiteProgram
        public void clearBindings() {
            this.binds.clear();
        }
    }
}
