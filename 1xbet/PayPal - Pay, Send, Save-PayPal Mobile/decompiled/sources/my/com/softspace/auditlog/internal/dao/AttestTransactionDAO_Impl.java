package my.com.softspace.auditlog.internal.dao;

/* loaded from: classes17.dex */
public final class AttestTransactionDAO_Impl implements my.com.softspace.auditlog.internal.dao.AttestTransactionDAO {
    private final androidx.room.EntityInsertionAdapter<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> Camera2StreamConfigurationMap;
    private final androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.room.SharedSQLiteStatement getHighSpeedVideoFpsRanges;
    private final androidx.room.RoomDatabase getHighSpeedVideoFpsRangesFor;
    private final androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> getHighSpeedVideoSizes;

    public AttestTransactionDAO_Impl(androidx.room.RoomDatabase roomDatabase) {
        this.getHighSpeedVideoFpsRangesFor = roomDatabase;
        this.Camera2StreamConfigurationMap = new androidx.room.EntityInsertionAdapter<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry>(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.AttestTransactionDAO_Impl.1
            @Override // androidx.room.EntityInsertionAdapter
            public /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry) {
                my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry2 = attestTransactionEntry;
                if (attestTransactionEntry2.getAttestId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, attestTransactionEntry2.getAttestId().longValue());
                }
                if (attestTransactionEntry2.getKsn() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, attestTransactionEntry2.getKsn());
                }
                if (attestTransactionEntry2.getTimestamp() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindLong(3, attestTransactionEntry2.getTimestamp().longValue());
                }
            }

            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR ABORT INTO `attest_transaction` (`attest_id`,`ksn`,`timestamp`) VALUES (?,?,?)";
            }
        };
        this.getHighResolutionOutputSizeshNQ4ISI = new androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry>(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.AttestTransactionDAO_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry) {
                my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry2 = attestTransactionEntry;
                if (attestTransactionEntry2.getAttestId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, attestTransactionEntry2.getAttestId().longValue());
                }
                if (attestTransactionEntry2.getKsn() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, attestTransactionEntry2.getKsn());
                }
                if (attestTransactionEntry2.getTimestamp() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindLong(3, attestTransactionEntry2.getTimestamp().longValue());
                }
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM `attest_transaction` WHERE `attest_id` = ? AND `ksn` = ? AND `timestamp` = ?";
            }
        };
        this.getHighSpeedVideoSizes = new androidx.room.EntityDeletionOrUpdateAdapter<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry>(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.AttestTransactionDAO_Impl.3
            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public /* synthetic */ void bind(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement, my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry) {
                my.com.softspace.auditlog.internal.dto.AttestTransactionEntry attestTransactionEntry2 = attestTransactionEntry;
                if (attestTransactionEntry2.getAttestId() == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindLong(1, attestTransactionEntry2.getAttestId().longValue());
                }
                if (attestTransactionEntry2.getKsn() == null) {
                    supportSQLiteStatement.bindNull(2);
                } else {
                    supportSQLiteStatement.bindString(2, attestTransactionEntry2.getKsn());
                }
                if (attestTransactionEntry2.getTimestamp() == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindLong(3, attestTransactionEntry2.getTimestamp().longValue());
                }
                if (attestTransactionEntry2.getAttestId() == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindLong(4, attestTransactionEntry2.getAttestId().longValue());
                }
                if (attestTransactionEntry2.getKsn() == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindString(5, attestTransactionEntry2.getKsn());
                }
                if (attestTransactionEntry2.getTimestamp() == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindLong(6, attestTransactionEntry2.getTimestamp().longValue());
                }
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE OR REPLACE `attest_transaction` SET `attest_id` = ?,`ksn` = ?,`timestamp` = ? WHERE `attest_id` = ? AND `ksn` = ? AND `timestamp` = ?";
            }
        };
        this.getHighSpeedVideoFpsRanges = new androidx.room.SharedSQLiteStatement(roomDatabase) { // from class: my.com.softspace.auditlog.internal.dao.AttestTransactionDAO_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "delete from attest_transaction";
            }
        };
    }

    @Override // my.com.softspace.auditlog.internal.dao.AttestTransactionDAO
    public final long[] insertAttestTransaction(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry... attestTransactionEntryArr) {
        this.getHighSpeedVideoFpsRangesFor.assertNotSuspendingTransaction();
        this.getHighSpeedVideoFpsRangesFor.beginTransaction();
        try {
            long[] insertAndReturnIdsArray = this.Camera2StreamConfigurationMap.insertAndReturnIdsArray(attestTransactionEntryArr);
            this.getHighSpeedVideoFpsRangesFor.setTransactionSuccessful();
            return insertAndReturnIdsArray;
        } finally {
            this.getHighSpeedVideoFpsRangesFor.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.AttestTransactionDAO
    public final void delete(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry... attestTransactionEntryArr) {
        this.getHighSpeedVideoFpsRangesFor.assertNotSuspendingTransaction();
        this.getHighSpeedVideoFpsRangesFor.beginTransaction();
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.handleMultiple(attestTransactionEntryArr);
            this.getHighSpeedVideoFpsRangesFor.setTransactionSuccessful();
        } finally {
            this.getHighSpeedVideoFpsRangesFor.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.AttestTransactionDAO
    public final void delete(java.util.Collection<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> collection) {
        this.getHighSpeedVideoFpsRangesFor.assertNotSuspendingTransaction();
        this.getHighSpeedVideoFpsRangesFor.beginTransaction();
        try {
            this.getHighResolutionOutputSizeshNQ4ISI.handleMultiple(collection);
            this.getHighSpeedVideoFpsRangesFor.setTransactionSuccessful();
        } finally {
            this.getHighSpeedVideoFpsRangesFor.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.AttestTransactionDAO
    public final void update(my.com.softspace.auditlog.internal.dto.AttestTransactionEntry... attestTransactionEntryArr) {
        this.getHighSpeedVideoFpsRangesFor.assertNotSuspendingTransaction();
        this.getHighSpeedVideoFpsRangesFor.beginTransaction();
        try {
            this.getHighSpeedVideoSizes.handleMultiple(attestTransactionEntryArr);
            this.getHighSpeedVideoFpsRangesFor.setTransactionSuccessful();
        } finally {
            this.getHighSpeedVideoFpsRangesFor.endTransaction();
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.AttestTransactionDAO
    public final void deleteAll() {
        this.getHighSpeedVideoFpsRangesFor.assertNotSuspendingTransaction();
        androidx.database.db.SupportSQLiteStatement acquire = this.getHighSpeedVideoFpsRanges.acquire();
        this.getHighSpeedVideoFpsRangesFor.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.getHighSpeedVideoFpsRangesFor.setTransactionSuccessful();
        } finally {
            this.getHighSpeedVideoFpsRangesFor.endTransaction();
            this.getHighSpeedVideoFpsRanges.release(acquire);
        }
    }

    @Override // my.com.softspace.auditlog.internal.dao.AttestTransactionDAO
    public final java.util.List<my.com.softspace.auditlog.internal.dto.AttestTransactionEntry> getAll() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("select * from attest_transaction", 0);
        this.getHighSpeedVideoFpsRangesFor.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.getHighSpeedVideoFpsRangesFor, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "attest_id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "ksn");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "timestamp");
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(new my.com.softspace.auditlog.internal.dto.AttestTransactionEntry(query.isNull(columnIndexOrThrow) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow)), query.isNull(columnIndexOrThrow2) ? null : query.getString(columnIndexOrThrow2), query.isNull(columnIndexOrThrow3) ? null : java.lang.Long.valueOf(query.getLong(columnIndexOrThrow3))));
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
