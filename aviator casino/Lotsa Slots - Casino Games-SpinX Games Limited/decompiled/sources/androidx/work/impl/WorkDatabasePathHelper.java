package androidx.work.impl;

/* compiled from: WorkDatabasePathHelper.kt */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0003J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\f2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\r"}, d2 = {"Landroidx/work/impl/WorkDatabasePathHelper;", "", "()V", "getDatabasePath", "Ljava/io/File;", "context", "Landroid/content/Context;", "getDefaultDatabasePath", "getNoBackupPath", "migrateDatabase", "", "migrationPaths", "", "work-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class WorkDatabasePathHelper {
    public static final androidx.work.impl.WorkDatabasePathHelper INSTANCE = new androidx.work.impl.WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final void migrateDatabase(android.content.Context context) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        androidx.work.impl.WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        java.io.File defaultDatabasePath = workDatabasePathHelper.getDefaultDatabasePath(context);
        if (android.os.Build.VERSION.SDK_INT < 23 || !defaultDatabasePath.exists()) {
            return;
        }
        androidx.work.Logger logger = androidx.work.Logger.get();
        str = androidx.work.impl.WorkDatabasePathHelperKt.TAG;
        logger.debug(str, "Migrating WorkDatabase to the no-backup directory");
        for (java.util.Map.Entry<java.io.File, java.io.File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
            java.io.File key = entry.getKey();
            java.io.File value = entry.getValue();
            if (key.exists()) {
                if (value.exists()) {
                    androidx.work.Logger logger2 = androidx.work.Logger.get();
                    str3 = androidx.work.impl.WorkDatabasePathHelperKt.TAG;
                    logger2.warning(str3, "Over-writing contents of " + value);
                }
                java.lang.String str4 = key.renameTo(value) ? "Migrated " + key + "to " + value : "Renaming " + key + " to " + value + " failed";
                androidx.work.Logger logger3 = androidx.work.Logger.get();
                str2 = androidx.work.impl.WorkDatabasePathHelperKt.TAG;
                logger3.debug(str2, str4);
            }
        }
    }

    public final java.util.Map<java.io.File, java.io.File> migrationPaths(android.content.Context context) {
        java.lang.String[] strArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            java.io.File defaultDatabasePath = getDefaultDatabasePath(context);
            java.io.File databasePath = getDatabasePath(context);
            strArr = androidx.work.impl.WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(strArr.length), 16));
            for (java.lang.String str : strArr) {
                kotlin.Pair pair = kotlin.TuplesKt.to(new java.io.File(defaultDatabasePath.getPath() + str), new java.io.File(databasePath.getPath() + str));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            return kotlin.collections.MapsKt.plus(linkedHashMap, kotlin.TuplesKt.to(defaultDatabasePath, databasePath));
        }
        return kotlin.collections.MapsKt.emptyMap();
    }

    public final java.io.File getDefaultDatabasePath(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        java.io.File databasePath = context.getDatabasePath(androidx.work.impl.WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        return databasePath;
    }

    public final java.io.File getDatabasePath(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        if (android.os.Build.VERSION.SDK_INT < 23) {
            return getDefaultDatabasePath(context);
        }
        return getNoBackupPath(context);
    }

    private final java.io.File getNoBackupPath(android.content.Context context) {
        return new java.io.File(androidx.work.impl.Api21Impl.INSTANCE.getNoBackupFilesDir(context), androidx.work.impl.WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
    }
}
