package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H&¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Landroidx/work/impl/WorkDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Landroidx/work/impl/model/WorkSpecDao;", "workSpecDao", "()Landroidx/work/impl/model/WorkSpecDao;", "Landroidx/work/impl/model/DependencyDao;", "dependencyDao", "()Landroidx/work/impl/model/DependencyDao;", "Landroidx/work/impl/model/WorkTagDao;", "workTagDao", "()Landroidx/work/impl/model/WorkTagDao;", "Landroidx/work/impl/model/SystemIdInfoDao;", "systemIdInfoDao", "()Landroidx/work/impl/model/SystemIdInfoDao;", "Landroidx/work/impl/model/WorkNameDao;", "workNameDao", "()Landroidx/work/impl/model/WorkNameDao;", "Landroidx/work/impl/model/WorkProgressDao;", "workProgressDao", "()Landroidx/work/impl/model/WorkProgressDao;", "Landroidx/work/impl/model/PreferenceDao;", "preferenceDao", "()Landroidx/work/impl/model/PreferenceDao;", "Landroidx/work/impl/model/RawWorkInfoDao;", "rawWorkInfoDao", "()Landroidx/work/impl/model/RawWorkInfoDao;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class WorkDatabase extends androidx.room.RoomDatabase {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final androidx.work.impl.WorkDatabase.Companion INSTANCE = new androidx.work.impl.WorkDatabase.Companion(null);

    public abstract androidx.work.impl.model.DependencyDao dependencyDao();

    public abstract androidx.work.impl.model.PreferenceDao preferenceDao();

    public abstract androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao();

    public abstract androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao();

    public abstract androidx.work.impl.model.WorkNameDao workNameDao();

    public abstract androidx.work.impl.model.WorkProgressDao workProgressDao();

    public abstract androidx.work.impl.model.WorkSpecDao workSpecDao();

    public abstract androidx.work.impl.model.WorkTagDao workTagDao();

    @kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/work/impl/WorkDatabase$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "queryExecutor", "Landroidx/work/Clock;", "clock", "", "useTestDatabase", "Landroidx/work/impl/WorkDatabase;", "create", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Landroidx/work/Clock;Z)Landroidx/work/impl/WorkDatabase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @kotlin.jvm.JvmStatic
        public final androidx.work.impl.WorkDatabase create(final android.content.Context context, java.util.concurrent.Executor queryExecutor, androidx.work.Clock clock, boolean useTestDatabase) {
            androidx.room.RoomDatabase.Builder openHelperFactory;
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryExecutor, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
            if (useTestDatabase) {
                openHelperFactory = androidx.room.Room.inMemoryDatabaseBuilder(context, androidx.work.impl.WorkDatabase.class).allowMainThreadQueries();
            } else {
                openHelperFactory = androidx.room.Room.databaseBuilder(context, androidx.work.impl.WorkDatabase.class, androidx.work.impl.WorkDatabasePathHelperKt.WORK_DATABASE_NAME).openHelperFactory(new androidx.sqlite.db.SupportSQLiteOpenHelper.Factory() { // from class: androidx.work.impl.WorkDatabase$Companion$$ExternalSyntheticLambda0
                    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
                    public final androidx.database.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
                        return androidx.work.impl.WorkDatabase.Companion.$r8$lambda$d9uKx9JAMiDvrmcMenix4D379lU(context, configuration);
                    }
                });
            }
            return (androidx.work.impl.WorkDatabase) openHelperFactory.setQueryExecutor(queryExecutor).addCallback(new androidx.work.impl.CleanupCallback(clock)).addMigrations(androidx.work.impl.Migration_1_2.INSTANCE).addMigrations(new androidx.work.impl.RescheduleMigration(context, 2, 3)).addMigrations(androidx.work.impl.Migration_3_4.INSTANCE).addMigrations(androidx.work.impl.Migration_4_5.INSTANCE).addMigrations(new androidx.work.impl.RescheduleMigration(context, 5, 6)).addMigrations(androidx.work.impl.Migration_6_7.INSTANCE).addMigrations(androidx.work.impl.Migration_7_8.INSTANCE).addMigrations(androidx.work.impl.Migration_8_9.INSTANCE).addMigrations(new androidx.work.impl.WorkMigration9To10(context)).addMigrations(new androidx.work.impl.RescheduleMigration(context, 10, 11)).addMigrations(androidx.work.impl.Migration_11_12.INSTANCE).addMigrations(androidx.work.impl.Migration_12_13.INSTANCE).addMigrations(androidx.work.impl.Migration_15_16.INSTANCE).addMigrations(androidx.work.impl.Migration_16_17.INSTANCE).addMigrations(new androidx.work.impl.RescheduleMigration(context, 21, 22)).fallbackToDestructiveMigration(true).build();
        }

        public static /* synthetic */ androidx.database.db.SupportSQLiteOpenHelper $r8$lambda$d9uKx9JAMiDvrmcMenix4D379lU(android.content.Context context, androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
            androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Builder builder = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.INSTANCE.builder(context);
            builder.name(configuration.name).callback(configuration.callback).noBackupDirectory(true).allowDataLossOnRecovery(true);
            return new androidx.database.db.framework.FrameworkSQLiteOpenHelperFactory().create(builder.build());
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.work.impl.WorkDatabase create(android.content.Context context, java.util.concurrent.Executor executor, androidx.work.Clock clock, boolean z) {
        return INSTANCE.create(context, executor, clock, z);
    }
}
