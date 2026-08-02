package androidx.database.db;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0003\u0013\u0014\u0015J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0010\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ljava/io/Closeable;", "", "enabled", "", "setWriteAheadLoggingEnabled", "(Z)V", "close", "()V", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "Callback", com.adobe.marketing.mobile.internal.configuration.ConfigurationExtension.TAG, "Factory"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface SupportSQLiteOpenHelper extends java.io.Closeable {

    @kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Factory {
        androidx.database.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    java.lang.String getDatabaseName();

    androidx.database.db.SupportSQLiteDatabase getReadableDatabase();

    androidx.database.db.SupportSQLiteDatabase getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean enabled);

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\b&\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u000b\u0010\nJ'\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", "", "version", "<init>", "(I)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "onConfigure", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "onCreate", "oldVersion", "newVersion", "onUpgrade", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "onDowngrade", "onOpen", "onCorruption", "", "p0", "getHighSpeedVideoFpsRanges", "(Ljava/lang/String;)V", com.visa.cbp.getEncExpo.warmup, "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Callback {
        public final int version;

        public abstract void onCreate(androidx.database.db.SupportSQLiteDatabase db);

        public abstract void onUpgrade(androidx.database.db.SupportSQLiteDatabase db, int oldVersion, int newVersion);

        public Callback(int i) {
            this.version = i;
        }

        public void onDowngrade(androidx.database.db.SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Can't downgrade database from version ");
            sb.append(oldVersion);
            sb.append(" to ");
            sb.append(newVersion);
            throw new android.database.sqlite.SQLiteException(sb.toString());
        }

        public void onCorruption(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
            java.util.Objects.toString(db);
            if (!db.isOpen()) {
                java.lang.String path = db.getPath();
                if (path != null) {
                    getHighSpeedVideoFpsRanges(path);
                    return;
                }
                return;
            }
            java.util.List<android.util.Pair<java.lang.String, java.lang.String>> list = null;
            try {
                try {
                    list = db.getAttachedDbs();
                } catch (android.database.sqlite.SQLiteException unused) {
                }
                try {
                    db.close();
                } catch (java.io.IOException unused2) {
                }
                if (list != null) {
                    return;
                }
            } finally {
                if (list != null) {
                    java.util.Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        java.lang.Object obj = ((android.util.Pair) it.next()).second;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(obj, "");
                        getHighSpeedVideoFpsRanges((java.lang.String) obj);
                    }
                } else {
                    java.lang.String path2 = db.getPath();
                    if (path2 != null) {
                        getHighSpeedVideoFpsRanges(path2);
                    }
                }
            }
        }

        private static void getHighSpeedVideoFpsRanges(java.lang.String p0) {
            if (kotlin.text.StringsKt.equals(p0, net.zetetic.database.sqlcipher.SQLiteDatabaseConfiguration.MEMORY_DB_PATH, true)) {
                return;
            }
            java.lang.String str = p0;
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = kotlin.jvm.internal.Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            if (str.subSequence(i, length + 1).toString().length() == 0) {
                return;
            }
            try {
                android.database.sqlite.SQLiteDatabase.deleteDatabase(new java.io.File(p0));
            } catch (java.lang.Exception e) {
            }
        }

        public void onOpen(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        }

        public void onConfigure(androidx.database.db.SupportSQLiteDatabase db) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\u0018\u0000 \u00112\u00020\u0001:\u0002\u0012\u0011B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0011\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0003\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR\u0011\u0010\t\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0010R\u0011\u0010\n\u001a\u00020\b8\u0006¢\u0006\u0006\n\u0004\b\n\u0010\u0010"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "Landroid/content/Context;", "context", "", "name", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", com.sun.jna.Callback.METHOD_NAME, "", "useNoBackupDirectory", "allowDataLossOnRecovery", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;ZZ)V", "Landroid/content/Context;", "Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Z", "Companion", "Builder"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Configuration {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion INSTANCE = new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion(null);
        public final boolean allowDataLossOnRecovery;
        public final androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback;
        public final android.content.Context context;
        public final java.lang.String name;
        public final boolean useNoBackupDirectory;

        public Configuration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
            this.context = context;
            this.name = str;
            this.callback = callback;
            this.useNoBackupDirectory = z;
            this.allowDataLossOnRecovery = z2;
        }

        public /* synthetic */ Configuration(android.content.Context context, java.lang.String str, androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(context, str, callback, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }

        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0016\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0016\u0010\u0017\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001b\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "build", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", "", "name", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", com.sun.jna.Callback.METHOD_NAME, "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "", "useNoBackupDirectory", "noBackupDirectory", "(Z)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "allowDataLossOnRecovery", "getHighSpeedVideoFpsRanges", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor", "getHighSpeedVideoSizes", "Ljava/lang/String;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Z"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static class Builder {

            /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
            private boolean getHighResolutionOutputSizeshNQ4ISI;

            /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
            private boolean getHighSpeedVideoSizes;

            /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
            private final android.content.Context getHighSpeedVideoFpsRangesFor;

            /* renamed from: getHighSpeedVideoFpsRangesFor, reason: from kotlin metadata */
            private androidx.sqlite.db.SupportSQLiteOpenHelper.Callback Camera2StreamConfigurationMap;

            /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
            private java.lang.String getHighSpeedVideoFpsRanges;

            public Builder(android.content.Context context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                this.getHighSpeedVideoFpsRangesFor = context;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration build() {
                java.lang.String str;
                androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback = this.Camera2StreamConfigurationMap;
                if (callback == null) {
                    throw new java.lang.IllegalArgumentException("Must set a callback to create the configuration.".toString());
                }
                if (this.getHighSpeedVideoSizes && ((str = this.getHighSpeedVideoFpsRanges) == null || str.length() == 0)) {
                    throw new java.lang.IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.".toString());
                }
                return new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration(this.getHighSpeedVideoFpsRangesFor, this.getHighSpeedVideoFpsRanges, callback, this.getHighSpeedVideoSizes, this.getHighResolutionOutputSizeshNQ4ISI);
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder name(java.lang.String name2) {
                this.getHighSpeedVideoFpsRanges = name2;
                return this;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder callback(androidx.sqlite.db.SupportSQLiteOpenHelper.Callback callback) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(callback, "");
                this.Camera2StreamConfigurationMap = callback;
                return this;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder noBackupDirectory(boolean useNoBackupDirectory) {
                this.getHighSpeedVideoSizes = useNoBackupDirectory;
                return this;
            }

            public androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder allowDataLossOnRecovery(boolean allowDataLossOnRecovery) {
                this.getHighResolutionOutputSizeshNQ4ISI = allowDataLossOnRecovery;
                return this;
            }
        }

        @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;", "builder", "(Landroid/content/Context;)Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration$Builder;"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder(android.content.Context context) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
                return new androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder(context);
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        @kotlin.jvm.JvmStatic
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder(android.content.Context context) {
            return INSTANCE.builder(context);
        }
    }
}
