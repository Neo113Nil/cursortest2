package my.com.softspace.auditlog.internal.dao;

/* loaded from: classes17.dex */
public final class LogEntryDAO_Impl implements my.com.softspace.auditlog.internal.dao.LogEntryDAO {
    private final androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.LogEntry> Camera2StreamConfigurationMap;
    private final androidx.room.RoomDatabase getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.room.SharedSQLiteStatement getHighSpeedVideoFpsRanges;
    private final androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.LogEntry> getHighSpeedVideoFpsRangesFor;
    private final androidx.room.EntityInsertionAdapter<my.com.softspace.auditlog.internal.dto.LogEntry> getHighSpeedVideoSizes;

    public LogEntryDAO_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.getHighResolutionOutputSizeshNQ4ISI = roomDatabase;
        this.getHighSpeedVideoSizes = new androidx.room.EntityInsertionAdapter<my.com.softspace.auditlog.internal.dto.LogEntry>(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.LogEntryDAO_Impl.1
            @Override // androidx.room.EntityInsertionAdapter
            public /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, my.com.softspace.auditlog.internal.dto.LogEntry logEntry) {
                my.com.softspace.auditlog.internal.dto.LogEntry logEntry2 = logEntry;
                if (logEntry2.getId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, logEntry2.getId().longValue());
                }
                if (logEntry2.getDateTime() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, logEntry2.getDateTime().longValue());
                }
                if (logEntry2.getAttestID() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, logEntry2.getAttestID());
                }
                if (logEntry2.getUserUuid() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, logEntry2.getUserUuid());
                }
                if (logEntry2.getEvent() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, logEntry2.getEvent());
                }
                if (logEntry2.getStatus() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, logEntry2.getStatus().intValue());
                }
                if (logEntry2.getOrigination() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, logEntry2.getOrigination().intValue());
                }
                if (logEntry2.getLog() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, logEntry2.getLog());
                }
                if (logEntry2.getThrowable() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, logEntry2.getThrowable());
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR ABORT INTO `log_entries` (`id`,`date_time`,`attestID`,`user_uuid`,`event`,`status`,`origination`,`log`,`throwable`) VALUES (?,?,?,?,?,?,?,?,?)";
            }
        };
        this.Camera2StreamConfigurationMap = new androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.LogEntry>(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.LogEntryDAO_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, my.com.softspace.auditlog.internal.dto.LogEntry logEntry) {
                my.com.softspace.auditlog.internal.dto.LogEntry logEntry2 = logEntry;
                if (logEntry2.getId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, logEntry2.getId().longValue());
                }
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM `log_entries` WHERE `id` = ?";
            }
        };
        this.getHighSpeedVideoFpsRangesFor = new androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.LogEntry>(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.LogEntryDAO_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, my.com.softspace.auditlog.internal.dto.LogEntry logEntry) {
                my.com.softspace.auditlog.internal.dto.LogEntry logEntry2 = logEntry;
                if (logEntry2.getId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, logEntry2.getId().longValue());
                }
                if (logEntry2.getDateTime() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindLong(2, logEntry2.getDateTime().longValue());
                }
                if (logEntry2.getAttestID() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, logEntry2.getAttestID());
                }
                if (logEntry2.getUserUuid() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, logEntry2.getUserUuid());
                }
                if (logEntry2.getEvent() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, logEntry2.getEvent());
                }
                if (logEntry2.getStatus() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, logEntry2.getStatus().intValue());
                }
                if (logEntry2.getOrigination() == null) {
                    supportSQLiteStatement.bindNull(7);
                } else {
                    supportSQLiteStatement.bindLong(7, logEntry2.getOrigination().intValue());
                }
                if (logEntry2.getLog() == null) {
                    supportSQLiteStatement.bindNull(8);
                } else {
                    supportSQLiteStatement.bindString(8, logEntry2.getLog());
                }
                if (logEntry2.getThrowable() == null) {
                    supportSQLiteStatement.bindNull(9);
                } else {
                    supportSQLiteStatement.bindString(9, logEntry2.getThrowable());
                }
                if (logEntry2.getId() == null) {
                    supportSQLiteStatement.bindNull(10);
                } else {
                    supportSQLiteStatement.bindLong(10, logEntry2.getId().longValue());
                }
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE OR REPLACE `log_entries` SET `id` = ?,`date_time` = ?,`attestID` = ?,`user_uuid` = ?,`event` = ?,`status` = ?,`origination` = ?,`log` = ?,`throwable` = ? WHERE `id` = ?";
            }
        };
        this.getHighSpeedVideoFpsRanges = new androidx.room.SharedSQLiteStatement(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.LogEntryDAO_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "delete from log_entries";
            }
        };
    }

    @Override // my.com.softspace.auditlog.internal.dao.LogEntryDAO
    public final long[] insertLogEntry(my.com.softspace.auditlog.internal.dto.LogEntry... logEntryArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.assertNotSuspendingTransaction();
        this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
        try {
            long[] insertAndReturnIdsArray = this.getHighSpeedVideoSizes.insertAndReturnIdsArray(logEntryArr);
            this.getHighResolutionOutputSizeshNQ4ISI.setTransactionSuccessful();
            return insertAndReturnIdsArray;
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.LogEntryDAO
    public final void delete(my.com.softspace.auditlog.internal.dto.LogEntry... logEntryArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.assertNotSuspendingTransaction();
        this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
        try {
            this.Camera2StreamConfigurationMap.handleMultiple(logEntryArr);
            this.getHighResolutionOutputSizeshNQ4ISI.setTransactionSuccessful();
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.LogEntryDAO
    public final void delete(java.util.Collection<my.com.softspace.auditlog.internal.dto.LogEntry> collection) {
        this.getHighResolutionOutputSizeshNQ4ISI.assertNotSuspendingTransaction();
        this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
        try {
            this.Camera2StreamConfigurationMap.handleMultiple(collection);
            this.getHighResolutionOutputSizeshNQ4ISI.setTransactionSuccessful();
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.LogEntryDAO
    public final void update(my.com.softspace.auditlog.internal.dto.LogEntry... logEntryArr) {
        this.getHighResolutionOutputSizeshNQ4ISI.assertNotSuspendingTransaction();
        this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
        try {
            this.getHighSpeedVideoFpsRangesFor.handleMultiple(logEntryArr);
            this.getHighResolutionOutputSizeshNQ4ISI.setTransactionSuccessful();
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.LogEntryDAO
    public final void deleteAll() {
        this.getHighResolutionOutputSizeshNQ4ISI.assertNotSuspendingTransaction();
        androidx.database.db.SupportSQLiteStatement acquire = this.getHighSpeedVideoFpsRanges.acquire();
        this.getHighResolutionOutputSizeshNQ4ISI.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.getHighResolutionOutputSizeshNQ4ISI.setTransactionSuccessful();
        } finally {
            this.getHighResolutionOutputSizeshNQ4ISI.endTransaction();
            this.getHighSpeedVideoFpsRanges.release(acquire);
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.LogEntryDAO
    public final java.util.List<my.com.softspace.auditlog.internal.dto.LogEntry> getAll() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from log_entries", 0);
        this.getHighResolutionOutputSizeshNQ4ISI.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.getHighResolutionOutputSizeshNQ4ISI, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "date_time");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "attestID");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "user_uuid");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "event");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "status");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "origination");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "log");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, com.datadog.android.rum.internal.RumFeature.EVENT_THROWABLE_PROPERTY);
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                my.com.softspace.auditlog.internal.dto.LogEntry logEntry = new my.com.softspace.auditlog.internal.dto.LogEntry();
                logEntry.setId(query.isNull(columnIndexOrThrow) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow)));
                logEntry.setDateTime(query.isNull(columnIndexOrThrow2) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow2)));
                logEntry.setAttestID(query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3));
                logEntry.setUserUuid(query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4));
                logEntry.setEvent(query.isNull(columnIndexOrThrow5) ? null : query.getString(columnIndexOrThrow5));
                logEntry.setStatus(query.isNull(columnIndexOrThrow6) ? null : java.lang.Integer.valueOf(query.getInt(columnIndexOrThrow6)));
                logEntry.setOrigination(query.isNull(columnIndexOrThrow7) ? null : java.lang.Integer.valueOf(query.getInt(columnIndexOrThrow7)));
                logEntry.setLog(query.isNull(columnIndexOrThrow8) ? null : query.getString(columnIndexOrThrow8));
                logEntry.setThrowable(query.isNull(columnIndexOrThrow9) ? null : query.getString(columnIndexOrThrow9));
                arrayList.add(logEntry);
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }
}
