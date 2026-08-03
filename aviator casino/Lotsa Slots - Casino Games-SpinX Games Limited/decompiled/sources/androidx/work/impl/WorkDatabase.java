package androidx.work.impl;

/* compiled from: WorkDatabase.kt */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&¨\u0006\u0014"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "()V", "dependencyDao", "Landroidx/work/impl/model/DependencyDao;", "preferenceDao", "Landroidx/work/impl/model/PreferenceDao;", "rawWorkInfoDao", "Landroidx/work/impl/model/RawWorkInfoDao;", "systemIdInfoDao", "Landroidx/work/impl/model/SystemIdInfoDao;", "workNameDao", "Landroidx/work/impl/model/WorkNameDao;", "workProgressDao", "Landroidx/work/impl/model/WorkProgressDao;", "workSpecDao", "Landroidx/work/impl/model/WorkSpecDao;", "workTagDao", "Landroidx/work/impl/model/WorkTagDao;", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public abstract class WorkDatabase extends androidx.room.RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.WorkDatabase.Companion INSTANCE = new androidx.work.impl.WorkDatabase.Companion(null);

    @kotlin.jvm.JvmStatic
    public static final androidx.work.impl.WorkDatabase create(android.content.Context context, java.util.concurrent.Executor executor, boolean z) {
        return INSTANCE.create(context, executor, z);
    }

    public abstract androidx.work.impl.model.DependencyDao dependencyDao();

    public abstract androidx.work.impl.model.PreferenceDao preferenceDao();

    public abstract androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao();

    public abstract androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao();

    public abstract androidx.work.impl.model.WorkNameDao workNameDao();

    public abstract androidx.work.impl.model.WorkProgressDao workProgressDao();

    public abstract androidx.work.impl.model.WorkSpecDao workSpecDao();

    public abstract androidx.work.impl.model.WorkTagDao workTagDao();

    /* compiled from: WorkDatabase.kt */
    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/WorkDatabase$Companion;", "", "()V", "create", "Landroidx/work/impl/WorkDatabase;", "context", "Landroid/content/Context;", "queryExecutor", "Ljava/util/concurrent/Executor;", "useTestDatabase", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.impl.WorkDatabase create(final android.content.Context context, java.util.concurrent.Executor queryExecutor, boolean useTestDatabase) {
            androidx.room.RoomDatabase.Builder openHelperFactory;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
            if (useTestDatabase) {
                openHelperFactory = androidx.room.Room.inMemoryDatabaseBuilder(context, androidx.work.impl.WorkDatabase.class).allowMainThreadQueries();
            } else {
                openHelperFactory = androidx.room.Room.databaseBuilder(context, androidx.work.impl.WorkDatabase.class, androidx.work.impl.WorkDatabasePathHelperKt.WORK_DATABASE_NAME).openHelperFactory(new androidx.sqlite.db.SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.WorkDatabase$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                    public final androidx.sqlite.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
                        androidx.sqlite.db.SupportSQLiteOpenHelper create$lambda$0;
                        create$lambda$0 = androidx.work.impl.WorkDatabase.Companion.create$lambda$0(context, configuration);
                        return create$lambda$0;
                    }
                });
            }
            return (androidx.work.impl.WorkDatabase) openHelperFactory.setQueryExecutor(queryExecutor).addCallback(androidx.work.impl.CleanupCallback.INSTANCE).addMigrations(androidx.work.impl.Migration_1_2.INSTANCE).addMigrations(new androidx.work.impl.RescheduleMigration(context, 2, 3)).addMigrations(androidx.work.impl.Migration_3_4.INSTANCE).addMigrations(androidx.work.impl.Migration_4_5.INSTANCE).addMigrations(new androidx.work.impl.RescheduleMigration(context, 5, 6)).addMigrations(androidx.work.impl.Migration_6_7.INSTANCE).addMigrations(androidx.work.impl.Migration_7_8.INSTANCE).addMigrations(androidx.work.impl.Migration_8_9.INSTANCE).addMigrations(new androidx.work.impl.WorkMigration9To10(context)).addMigrations(new androidx.work.impl.RescheduleMigration(context, 10, 11)).addMigrations(androidx.work.impl.Migration_11_12.INSTANCE).addMigrations(androidx.work.impl.Migration_12_13.INSTANCE).addMigrations(androidx.work.impl.Migration_15_16.INSTANCE).fallbackToDestructiveMigration().build();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.sqlite.db.SupportSQLiteOpenHelper create$lambda$0(android.content.Context context, androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "$context");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "configuration");
            androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(context);
            builder.name(configuration.name).callback(configuration.callback).noBackupDirectory(true).allowDataLossOnRecovery(true);
            return new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory().create(builder.build());
        }
    }
}
