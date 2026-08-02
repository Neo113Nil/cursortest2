package androidx.room;

@kotlin.Deprecated(message = "Replaced by RoomConnectionManager and no longer used in generated code.")
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 $2\u00020\u0001:\u0003%&$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J'\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0010R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010#\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\""}, d2 = {"Landroidx/room/RoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Landroidx/room/DatabaseConfiguration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/room/RoomOpenHelper$Delegate;", "delegate", "", "identityHash", "legacyHash", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;Ljava/lang/String;)V", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenHelper$Delegate;Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "onConfigure", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "onCreate", "", "oldVersion", "newVersion", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onDowngrade", "onOpen", "getHighSpeedVideoFpsRangesFor", "Landroidx/room/DatabaseConfiguration;", "", "Landroidx/room/RoomDatabase$Callback;", "getHighSpeedVideoSizes", "Ljava/util/List;", "getHighResolutionOutputSizeshNQ4ISI", "Landroidx/room/RoomOpenHelper$Delegate;", "getHighSpeedVideoFpsRanges", "Ljava/lang/String;", "Camera2StreamConfigurationMap", "Companion", "Delegate", "ValidationResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class RoomOpenHelper extends androidx.sqlite.db.SupportSQLiteOpenHelper.Callback {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.room.RoomOpenHelper.Companion INSTANCE = new androidx.room.RoomOpenHelper.Companion(null);
    private final java.lang.String Camera2StreamConfigurationMap;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final androidx.room.RoomOpenHelper.Delegate getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.lang.String getHighSpeedVideoSizes;
    private androidx.room.DatabaseConfiguration getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final java.util.List<androidx.room.RoomDatabase.Callback> getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration, androidx.room.RoomOpenHelper.Delegate delegate, java.lang.String str, java.lang.String str2) {
        super(delegate.version);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        this.getHighResolutionOutputSizeshNQ4ISI = databaseConfiguration.callbacks;
        this.getHighSpeedVideoFpsRangesFor = databaseConfiguration;
        this.getHighSpeedVideoFpsRanges = delegate;
        this.getHighSpeedVideoSizes = str;
        this.Camera2StreamConfigurationMap = str2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(androidx.room.DatabaseConfiguration databaseConfiguration, androidx.room.RoomOpenHelper.Delegate delegate, java.lang.String str) {
        this(databaseConfiguration, delegate, "", str);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(delegate, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onConfigure(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        super.onConfigure(db);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onCreate(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        boolean hasEmptySchema$room_runtime = INSTANCE.hasEmptySchema$room_runtime(db);
        this.getHighSpeedVideoFpsRanges.createAllTables(db);
        if (!hasEmptySchema$room_runtime) {
            androidx.room.RoomOpenHelper.ValidationResult onValidateSchema = this.getHighSpeedVideoFpsRanges.onValidateSchema(db);
            if (!onValidateSchema.isValid) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Pre-packaged database has an invalid schema: ");
                sb.append(onValidateSchema.expectedFoundMsg);
                throw new java.lang.IllegalStateException(sb.toString());
            }
        }
        db.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
        db.execSQL(androidx.room.RoomMasterTable.createInsertQuery(this.getHighSpeedVideoSizes));
        this.getHighSpeedVideoFpsRanges.onCreate(db);
        java.util.List<androidx.room.RoomDatabase.Callback> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((androidx.room.RoomDatabase.Callback) it.next()).onCreate(db);
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onUpgrade(androidx.database.db.SupportSQLiteDatabase db, int oldVersion, int newVersion) {
        java.util.List<androidx.room.migration.Migration> findMigrationPath;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        androidx.room.DatabaseConfiguration databaseConfiguration = this.getHighSpeedVideoFpsRangesFor;
        if (databaseConfiguration != null && (findMigrationPath = databaseConfiguration.migrationContainer.findMigrationPath(oldVersion, newVersion)) != null) {
            this.getHighSpeedVideoFpsRanges.onPreMigrate(db);
            java.util.Iterator<T> it = findMigrationPath.iterator();
            while (it.hasNext()) {
                ((androidx.room.migration.Migration) it.next()).migrate(new androidx.database.driver.SupportSQLiteConnection(db));
            }
            androidx.room.RoomOpenHelper.ValidationResult onValidateSchema = this.getHighSpeedVideoFpsRanges.onValidateSchema(db);
            if (!onValidateSchema.isValid) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("Migration didn't properly handle: ");
                sb.append(onValidateSchema.expectedFoundMsg);
                throw new java.lang.IllegalStateException(sb.toString());
            }
            this.getHighSpeedVideoFpsRanges.onPostMigrate(db);
            db.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
            db.execSQL(androidx.room.RoomMasterTable.createInsertQuery(this.getHighSpeedVideoSizes));
            return;
        }
        androidx.room.DatabaseConfiguration databaseConfiguration2 = this.getHighSpeedVideoFpsRangesFor;
        if (databaseConfiguration2 != null && !databaseConfiguration2.isMigrationRequired(oldVersion, newVersion)) {
            if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
                INSTANCE.dropAllTables$room_runtime(db);
            } else {
                this.getHighSpeedVideoFpsRanges.dropAllTables(db);
            }
            java.util.List<androidx.room.RoomDatabase.Callback> list = this.getHighResolutionOutputSizeshNQ4ISI;
            if (list != null) {
                java.util.Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    ((androidx.room.RoomDatabase.Callback) it2.next()).onDestructiveMigration(db);
                }
            }
            this.getHighSpeedVideoFpsRanges.createAllTables(db);
            return;
        }
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("A migration from ");
        sb2.append(oldVersion);
        sb2.append(" to ");
        sb2.append(newVersion);
        sb2.append(" was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        throw new java.lang.IllegalStateException(sb2.toString());
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onDowngrade(androidx.database.db.SupportSQLiteDatabase db, int oldVersion, int newVersion) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        onUpgrade(db, oldVersion, newVersion);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public void onOpen(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        super.onOpen(db);
        if (INSTANCE.hasRoomMasterTable$room_runtime(db)) {
            android.database.Cursor query = db.query(new androidx.database.db.SimpleSQLiteQuery(androidx.room.RoomMasterTable.READ_QUERY));
            try {
                android.database.Cursor cursor = query;
                java.lang.String string = cursor.moveToFirst() ? cursor.getString(0) : null;
                kotlin.io.CloseableKt.closeFinally(query, null);
                if (!kotlin.jvm.internal.Intrinsics.areEqual(this.getHighSpeedVideoSizes, string) && !kotlin.jvm.internal.Intrinsics.areEqual(this.Camera2StreamConfigurationMap, string)) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: ");
                    sb.append(this.getHighSpeedVideoSizes);
                    sb.append(", found: ");
                    sb.append(string);
                    throw new java.lang.IllegalStateException(sb.toString());
                }
            } finally {
            }
        } else {
            androidx.room.RoomOpenHelper.ValidationResult onValidateSchema = this.getHighSpeedVideoFpsRanges.onValidateSchema(db);
            if (!onValidateSchema.isValid) {
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Pre-packaged database has an invalid schema: ");
                sb2.append(onValidateSchema.expectedFoundMsg);
                throw new java.lang.IllegalStateException(sb2.toString());
            }
            this.getHighSpeedVideoFpsRanges.onPostMigrate(db);
            db.execSQL(androidx.room.RoomMasterTable.CREATE_QUERY);
            db.execSQL(androidx.room.RoomMasterTable.createInsertQuery(this.getHighSpeedVideoSizes));
        }
        this.getHighSpeedVideoFpsRanges.onOpen(db);
        java.util.List<androidx.room.RoomDatabase.Callback> list = this.getHighResolutionOutputSizeshNQ4ISI;
        if (list != null) {
            java.util.Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ((androidx.room.RoomDatabase.Callback) it.next()).onOpen(db);
            }
        }
        this.getHighSpeedVideoFpsRangesFor = null;
    }

    @kotlin.Deprecated(message = "Replaced by OpenDelegate  and no longer used in generated code.")
    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014"}, d2 = {"Landroidx/room/RoomOpenHelper$Delegate;", "", "", "version", "<init>", "(I)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "dropAllTables", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "createAllTables", "onOpen", "onCreate", "validateMigration", "Landroidx/room/RoomOpenHelper$ValidationResult;", "onValidateSchema", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Landroidx/room/RoomOpenHelper$ValidationResult;", "onPreMigrate", "onPostMigrate", com.visa.cbp.getEncExpo.warmup}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Delegate {
        public final int version;

        public abstract void createAllTables(androidx.database.db.SupportSQLiteDatabase db);

        public abstract void dropAllTables(androidx.database.db.SupportSQLiteDatabase db);

        public abstract void onCreate(androidx.database.db.SupportSQLiteDatabase db);

        public abstract void onOpen(androidx.database.db.SupportSQLiteDatabase db);

        public Delegate(int i) {
            this.version = i;
        }

        @kotlin.Deprecated(message = "Use [onValidateSchema(SupportSQLiteDatabase)]")
        protected void validateMigration(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            throw new java.lang.UnsupportedOperationException("validateMigration is deprecated");
        }

        public androidx.room.RoomOpenHelper.ValidationResult onValidateSchema(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            validateMigration(db);
            return new androidx.room.RoomOpenHelper.ValidationResult(true, null);
        }

        public void onPreMigrate(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        }

        public void onPostMigrate(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        }
    }

    @kotlin.Deprecated(message = "Replaced by OpenDelegate.ValidationResult and no longer used in generated code.")
    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\t"}, d2 = {"Landroidx/room/RoomOpenHelper$ValidationResult;", "", "", "isValid", "", "expectedFoundMsg", "<init>", "(ZLjava/lang/String;)V", "Z", "Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class ValidationResult {
        public final java.lang.String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, java.lang.String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/room/RoomOpenHelper$Companion;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "hasRoomMasterTable$room_runtime", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)Z", "hasEmptySchema$room_runtime", "", "dropAllTables$room_runtime", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final boolean hasRoomMasterTable$room_runtime(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            android.database.Cursor query = db.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
            try {
                android.database.Cursor cursor = query;
                boolean z = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) != 0) {
                        z = true;
                    }
                }
                kotlin.io.CloseableKt.closeFinally(query, null);
                return z;
            } finally {
            }
        }

        public final boolean hasEmptySchema$room_runtime(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            android.database.Cursor query = db.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
            try {
                android.database.Cursor cursor = query;
                boolean z = false;
                if (cursor.moveToFirst()) {
                    if (cursor.getInt(0) == 0) {
                        z = true;
                    }
                }
                kotlin.io.CloseableKt.closeFinally(query, null);
                return z;
            } finally {
            }
        }

        public final void dropAllTables$room_runtime(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            android.database.Cursor query = db.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                android.database.Cursor cursor = query;
                java.util.List createListBuilder = kotlin.collections.CollectionsKt.createListBuilder();
                while (cursor.moveToNext()) {
                    java.lang.String string = cursor.getString(0);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(string);
                    if (!kotlin.text.StringsKt.startsWith$default(string, "sqlite_", false, 2, (java.lang.Object) null) && !kotlin.jvm.internal.Intrinsics.areEqual(string, "android_metadata")) {
                        createListBuilder.add(kotlin.TuplesKt.to(string, java.lang.Boolean.valueOf(kotlin.jvm.internal.Intrinsics.areEqual(cursor.getString(1), "view"))));
                    }
                }
                java.util.List<kotlin.Pair> build = kotlin.collections.CollectionsKt.build(createListBuilder);
                kotlin.io.CloseableKt.closeFinally(query, null);
                for (kotlin.Pair pair : build) {
                    java.lang.String str = (java.lang.String) pair.component1();
                    if (((java.lang.Boolean) pair.component2()).booleanValue()) {
                        db.execSQL("DROP VIEW IF EXISTS ".concat(java.lang.String.valueOf(str)));
                    } else {
                        db.execSQL("DROP TABLE IF EXISTS ".concat(java.lang.String.valueOf(str)));
                    }
                }
            } finally {
            }
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
