package com.adobe.marketing.mobile.internal.eventhub.history;

@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u0014\u0010\u0016\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001c"}, d2 = {"Lcom/adobe/marketing/mobile/internal/eventhub/history/AndroidEventHistoryDatabase;", "Lcom/adobe/marketing/mobile/internal/eventhub/history/EventHistoryDatabase;", "<init>", "()V", "", "hash", "from", androidx.constraintlayout.core.motion.utils.TypedValues.TransitionType.S_TO, "", com.paypal.oslo.feature.userprofile.api.analytics.UserProfileAnalytics.Actions.DELETE, "(JJJ)I", "timestampMS", "", "insert", "(JJ)Z", "Ljava/io/File;", "getHighSpeedVideoFpsRanges", "()Ljava/io/File;", "Lcom/adobe/marketing/mobile/EventHistoryResult;", "query", "(JJJ)Lcom/adobe/marketing/mobile/EventHistoryResult;", "Landroid/database/sqlite/SQLiteDatabase;", "getHighSpeedVideoSizes", "Landroid/database/sqlite/SQLiteDatabase;", "getHighResolutionOutputSizeshNQ4ISI", "Ljava/io/File;", "Camera2StreamConfigurationMap", "", "Ljava/lang/Object;", "Companion"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class AndroidEventHistoryDatabase implements com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabase {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final java.lang.Object getHighSpeedVideoSizes;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final java.io.File Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private android.database.sqlite.SQLiteDatabase getHighResolutionOutputSizeshNQ4ISI;

    public AndroidEventHistoryDatabase() {
        java.lang.Object obj = new java.lang.Object();
        this.getHighSpeedVideoSizes = obj;
        java.io.File highSpeedVideoFpsRanges = getHighSpeedVideoFpsRanges();
        this.Camera2StreamConfigurationMap = highSpeedVideoFpsRanges;
        synchronized (obj) {
            if (!com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.createTableIfNotExist(highSpeedVideoFpsRanges.getPath(), "CREATE TABLE IF NOT EXISTS Events (eventHash INTEGER, timestamp INTEGER);")) {
                throw new com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabaseCreationException("An error occurred while creating the Events table in the Android Event History database.");
            }
            kotlin.Unit unit = kotlin.Unit.INSTANCE;
        }
    }

    private static java.io.File getHighSpeedVideoFpsRanges() {
        android.content.Context applicationContext = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getAppContextService().getApplicationContext();
        if (applicationContext == null) {
            throw new com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabaseCreationException("Failed to create/open database com.adobe.module.core.eventhistory, error message: ApplicationContext is null");
        }
        java.io.File databasePath = applicationContext.getDatabasePath("com.adobe.module.core.eventhistory");
        if (databasePath.exists()) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databasePath, "");
            return databasePath;
        }
        java.io.File applicationCacheDir = com.adobe.marketing.mobile.services.ServiceProvider.getInstance().getDeviceInfoService().getApplicationCacheDir();
        if (applicationCacheDir == null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databasePath, "");
            return databasePath;
        }
        try {
            java.io.File file = new java.io.File(applicationCacheDir, "EventHistory");
            if (file.exists()) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databasePath, "");
                com.adobe.marketing.mobile.internal.util.FileUtils.moveFile(file, databasePath);
                com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistoryDatabase", "Successfully moved database EventHistory from cache directory to database directory", new java.lang.Object[0]);
            }
        } catch (java.lang.Exception unused) {
            com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistoryDatabase", "Failed to move database EventHistory from cache directory to database directory", new java.lang.Object[0]);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(databasePath, "");
        return databasePath;
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabase
    public final boolean insert(long hash, long timestampMS) {
        boolean z;
        synchronized (this.getHighSpeedVideoSizes) {
            try {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.openDatabase(this.Camera2StreamConfigurationMap.getPath(), com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE);
                    android.content.ContentValues contentValues = new android.content.ContentValues();
                    contentValues.put("eventHash", java.lang.Long.valueOf(hash));
                    contentValues.put("timestamp", java.lang.Long.valueOf(timestampMS));
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.getHighResolutionOutputSizeshNQ4ISI;
                    z = (sQLiteDatabase != null ? sQLiteDatabase.insert("Events", null, contentValues) : -1L) > 0;
                } catch (java.lang.Exception e) {
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistoryDatabase", "Failed to insert rows into the table (%s)", e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.getMessage());
                    return false;
                }
            } finally {
                com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.closeDatabase(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
        return z;
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabase
    public final com.adobe.marketing.mobile.EventHistoryResult query(long hash, long from, long to) {
        synchronized (this.getHighSpeedVideoSizes) {
            try {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.openDatabase(this.Camera2StreamConfigurationMap.getPath(), com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE);
                    java.lang.String[] strArr = {java.lang.String.valueOf(hash), java.lang.String.valueOf(from), java.lang.String.valueOf(to)};
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.getHighResolutionOutputSizeshNQ4ISI;
                    android.database.Cursor rawQuery = sQLiteDatabase != null ? sQLiteDatabase.rawQuery("SELECT COUNT(*) as count, min(timestamp) as oldest, max(timestamp) as newest FROM Events WHERE eventHash = ? AND timestamp >= ? AND timestamp <= ?", strArr) : null;
                    if (rawQuery == null) {
                        return new com.adobe.marketing.mobile.EventHistoryResult(-1, null, null, 6, null);
                    }
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(rawQuery, "");
                    android.database.Cursor cursor = rawQuery;
                    try {
                        android.database.Cursor cursor2 = cursor;
                        rawQuery.moveToFirst();
                        int i = rawQuery.getInt(0);
                        if (i == 0) {
                            com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult = new com.adobe.marketing.mobile.EventHistoryResult(0, null, null, 6, null);
                            kotlin.io.CloseableKt.closeFinally(cursor, null);
                            return eventHistoryResult;
                        }
                        com.adobe.marketing.mobile.EventHistoryResult eventHistoryResult2 = new com.adobe.marketing.mobile.EventHistoryResult(i, java.lang.Long.valueOf(rawQuery.getLong(1)), java.lang.Long.valueOf(rawQuery.getLong(2)));
                        kotlin.io.CloseableKt.closeFinally(cursor, null);
                        return eventHistoryResult2;
                    } finally {
                    }
                } catch (java.lang.Exception e) {
                    com.adobe.marketing.mobile.services.Log.warning(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistoryDatabase", "Failed to execute query (%s)", e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.getMessage());
                    return new com.adobe.marketing.mobile.EventHistoryResult(-1, null, null, 6, null);
                }
            } finally {
                com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.closeDatabase(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
    }

    @Override // com.adobe.marketing.mobile.internal.eventhub.history.EventHistoryDatabase
    public final int delete(long hash, long from, long to) {
        int delete;
        synchronized (this.getHighSpeedVideoSizes) {
            try {
                try {
                    this.getHighResolutionOutputSizeshNQ4ISI = com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.openDatabase(this.Camera2StreamConfigurationMap.getPath(), com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.DatabaseOpenMode.READ_WRITE);
                    java.lang.String[] strArr = {java.lang.String.valueOf(hash), java.lang.String.valueOf(from), java.lang.String.valueOf(to)};
                    android.database.sqlite.SQLiteDatabase sQLiteDatabase = this.getHighResolutionOutputSizeshNQ4ISI;
                    delete = sQLiteDatabase != null ? sQLiteDatabase.delete("Events", "eventHash = ? AND timestamp >= ? AND timestamp <= ?", strArr) : -1;
                    java.lang.StringBuilder sb = new java.lang.StringBuilder("Count of rows deleted in table Events are ");
                    sb.append(delete);
                    com.adobe.marketing.mobile.services.Log.trace(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistoryDatabase", sb.toString(), new java.lang.Object[0]);
                } catch (java.lang.Exception e) {
                    com.adobe.marketing.mobile.services.Log.debug(com.adobe.marketing.mobile.internal.CoreConstants.LOG_TAG, "AndroidEventHistoryDatabase", "Failed to delete table rows (%s)", e.getLocalizedMessage() != null ? e.getLocalizedMessage() : e.getMessage());
                    return -1;
                }
            } finally {
                com.adobe.marketing.mobile.internal.util.SQLiteDatabaseHelper.closeDatabase(this.getHighResolutionOutputSizeshNQ4ISI);
                this.getHighResolutionOutputSizeshNQ4ISI = null;
            }
        }
        return delete;
    }
}
