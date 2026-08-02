package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u000e"}, d2 = {"Landroidx/work/impl/WorkDatabasePathHelper;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "migrateDatabase", "(Landroid/content/Context;)V", "", "Ljava/io/File;", "migrationPaths", "(Landroid/content/Context;)Ljava/util/Map;", "getDefaultDatabasePath", "(Landroid/content/Context;)Ljava/io/File;", "getDatabasePath"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkDatabasePathHelper {
    public static final androidx.work.impl.WorkDatabasePathHelper INSTANCE = new androidx.work.impl.WorkDatabasePathHelper();

    private WorkDatabasePathHelper() {
    }

    @kotlin.jvm.JvmStatic
    public static final void migrateDatabase(android.content.Context context) {
        java.lang.String str;
        java.lang.String obj;
        java.lang.String str2;
        java.lang.String str3;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        androidx.work.impl.WorkDatabasePathHelper workDatabasePathHelper = INSTANCE;
        if (workDatabasePathHelper.getDefaultDatabasePath(context).exists()) {
            androidx.work.Logger logger = androidx.work.Logger.get();
            str = androidx.work.impl.WorkDatabasePathHelperKt.getHighSpeedVideoFpsRanges;
            logger.debug(str, "Migrating WorkDatabase to the no-backup directory");
            for (java.util.Map.Entry<java.io.File, java.io.File> entry : workDatabasePathHelper.migrationPaths(context).entrySet()) {
                java.io.File key = entry.getKey();
                java.io.File value = entry.getValue();
                if (key.exists()) {
                    if (value.exists()) {
                        androidx.work.Logger logger2 = androidx.work.Logger.get();
                        str3 = androidx.work.impl.WorkDatabasePathHelperKt.getHighSpeedVideoFpsRanges;
                        logger2.warning(str3, "Over-writing contents of ".concat(java.lang.String.valueOf(value)));
                    }
                    if (key.renameTo(value)) {
                        java.lang.StringBuilder sb = new java.lang.StringBuilder("Migrated ");
                        sb.append(key);
                        sb.append("to ");
                        sb.append(value);
                        obj = sb.toString();
                    } else {
                        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Renaming ");
                        sb2.append(key);
                        sb2.append(" to ");
                        sb2.append(value);
                        sb2.append(" failed");
                        obj = sb2.toString();
                    }
                    androidx.work.Logger logger3 = androidx.work.Logger.get();
                    str2 = androidx.work.impl.WorkDatabasePathHelperKt.getHighSpeedVideoFpsRanges;
                    logger3.debug(str2, obj);
                }
            }
        }
    }

    public final java.util.Map<java.io.File, java.io.File> migrationPaths(android.content.Context context) {
        java.lang.String[] strArr;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.io.File defaultDatabasePath = getDefaultDatabasePath(context);
        java.io.File databasePath = getDatabasePath(context);
        strArr = androidx.work.impl.WorkDatabasePathHelperKt.getHighSpeedVideoFpsRangesFor;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(kotlin.ranges.RangesKt.coerceAtLeast(kotlin.collections.MapsKt.mapCapacity(strArr.length), 16));
        for (java.lang.String str : strArr) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(defaultDatabasePath.getPath());
            sb.append(str);
            java.io.File file = new java.io.File(sb.toString());
            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
            sb2.append(databasePath.getPath());
            sb2.append(str);
            kotlin.Pair pair = kotlin.TuplesKt.to(file, new java.io.File(sb2.toString()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return kotlin.collections.MapsKt.plus(linkedHashMap, kotlin.TuplesKt.to(defaultDatabasePath, databasePath));
    }

    public final java.io.File getDefaultDatabasePath(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.io.File databasePath = context.getDatabasePath(androidx.work.impl.WorkDatabasePathHelperKt.WORK_DATABASE_NAME);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databasePath, "");
        return databasePath;
    }

    public final java.io.File getDatabasePath(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        java.io.File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(noBackupFilesDir, "");
        return noBackupFilesDir;
    }
}
