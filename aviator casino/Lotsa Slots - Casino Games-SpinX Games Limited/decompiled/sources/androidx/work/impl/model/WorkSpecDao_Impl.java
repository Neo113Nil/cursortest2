package androidx.work.impl.model;

/* loaded from: classes2.dex */
public final class WorkSpecDao_Impl implements androidx.work.impl.model.WorkSpecDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec> __insertionAdapterOfWorkSpec;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfIncrementGeneration;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfIncrementPeriodCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetLastEnqueuedTime;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetState;
    private final androidx.room.EntityDeletionOrUpdateAdapter<androidx.work.impl.model.WorkSpec> __updateAdapterOfWorkSpec;

    public WorkSpecDao_Impl(androidx.room.RoomDatabase __db) {
        this.__db = __db;
        this.__insertionAdapterOfWorkSpec = new androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec>(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.1
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            }

            @Override // androidx.room.EntityInsertionAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, androidx.work.impl.model.WorkSpec workSpec) {
                if (workSpec.id == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workSpec.id);
                }
                androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(2, androidx.work.impl.model.WorkTypeConverters.stateToInt(workSpec.state));
                if (workSpec.workerClassName == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                }
                if (workSpec.inputMergerClassName == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                }
                byte[] byteArrayInternal = androidx.work.Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = androidx.work.Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(11, androidx.work.impl.model.WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(17, androidx.work.impl.model.WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
                supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
                androidx.work.Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    supportSQLiteStatement.bindLong(20, androidx.work.impl.model.WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(21, constraints.getRequiresCharging() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(22, constraints.getRequiresDeviceIdle() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(23, constraints.getRequiresBatteryNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(24, constraints.getRequiresStorageNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(25, constraints.getContentTriggerUpdateDelayMillis());
                    supportSQLiteStatement.bindLong(26, constraints.getContentTriggerMaxDelayMillis());
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    byte[] ofTriggersToByteArray = androidx.work.impl.model.WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                    if (ofTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(27);
                        return;
                    } else {
                        supportSQLiteStatement.bindBlob(27, ofTriggersToByteArray);
                        return;
                    }
                }
                supportSQLiteStatement.bindNull(20);
                supportSQLiteStatement.bindNull(21);
                supportSQLiteStatement.bindNull(22);
                supportSQLiteStatement.bindNull(23);
                supportSQLiteStatement.bindNull(24);
                supportSQLiteStatement.bindNull(25);
                supportSQLiteStatement.bindNull(26);
                supportSQLiteStatement.bindNull(27);
            }
        };
        this.__updateAdapterOfWorkSpec = new androidx.room.EntityDeletionOrUpdateAdapter<androidx.work.impl.model.WorkSpec>(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.2
            @Override // androidx.room.EntityDeletionOrUpdateAdapter, androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`required_network_type` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
            }

            @Override // androidx.room.EntityDeletionOrUpdateAdapter
            public void bind(androidx.sqlite.db.SupportSQLiteStatement supportSQLiteStatement, androidx.work.impl.model.WorkSpec workSpec) {
                if (workSpec.id == null) {
                    supportSQLiteStatement.bindNull(1);
                } else {
                    supportSQLiteStatement.bindString(1, workSpec.id);
                }
                androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(2, androidx.work.impl.model.WorkTypeConverters.stateToInt(workSpec.state));
                if (workSpec.workerClassName == null) {
                    supportSQLiteStatement.bindNull(3);
                } else {
                    supportSQLiteStatement.bindString(3, workSpec.workerClassName);
                }
                if (workSpec.inputMergerClassName == null) {
                    supportSQLiteStatement.bindNull(4);
                } else {
                    supportSQLiteStatement.bindString(4, workSpec.inputMergerClassName);
                }
                byte[] byteArrayInternal = androidx.work.Data.toByteArrayInternal(workSpec.input);
                if (byteArrayInternal == null) {
                    supportSQLiteStatement.bindNull(5);
                } else {
                    supportSQLiteStatement.bindBlob(5, byteArrayInternal);
                }
                byte[] byteArrayInternal2 = androidx.work.Data.toByteArrayInternal(workSpec.output);
                if (byteArrayInternal2 == null) {
                    supportSQLiteStatement.bindNull(6);
                } else {
                    supportSQLiteStatement.bindBlob(6, byteArrayInternal2);
                }
                supportSQLiteStatement.bindLong(7, workSpec.initialDelay);
                supportSQLiteStatement.bindLong(8, workSpec.intervalDuration);
                supportSQLiteStatement.bindLong(9, workSpec.flexDuration);
                supportSQLiteStatement.bindLong(10, workSpec.runAttemptCount);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(11, androidx.work.impl.model.WorkTypeConverters.backoffPolicyToInt(workSpec.backoffPolicy));
                supportSQLiteStatement.bindLong(12, workSpec.backoffDelayDuration);
                supportSQLiteStatement.bindLong(13, workSpec.lastEnqueueTime);
                supportSQLiteStatement.bindLong(14, workSpec.minimumRetentionDuration);
                supportSQLiteStatement.bindLong(15, workSpec.scheduleRequestedAt);
                supportSQLiteStatement.bindLong(16, workSpec.expedited ? 1L : 0L);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                supportSQLiteStatement.bindLong(17, androidx.work.impl.model.WorkTypeConverters.outOfQuotaPolicyToInt(workSpec.outOfQuotaPolicy));
                supportSQLiteStatement.bindLong(18, workSpec.getPeriodCount());
                supportSQLiteStatement.bindLong(19, workSpec.getGeneration());
                androidx.work.Constraints constraints = workSpec.constraints;
                if (constraints != null) {
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    supportSQLiteStatement.bindLong(20, androidx.work.impl.model.WorkTypeConverters.networkTypeToInt(constraints.getRequiredNetworkType()));
                    supportSQLiteStatement.bindLong(21, constraints.getRequiresCharging() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(22, constraints.getRequiresDeviceIdle() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(23, constraints.getRequiresBatteryNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(24, constraints.getRequiresStorageNotLow() ? 1L : 0L);
                    supportSQLiteStatement.bindLong(25, constraints.getContentTriggerUpdateDelayMillis());
                    supportSQLiteStatement.bindLong(26, constraints.getContentTriggerMaxDelayMillis());
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    byte[] ofTriggersToByteArray = androidx.work.impl.model.WorkTypeConverters.setOfTriggersToByteArray(constraints.getContentUriTriggers());
                    if (ofTriggersToByteArray == null) {
                        supportSQLiteStatement.bindNull(27);
                    } else {
                        supportSQLiteStatement.bindBlob(27, ofTriggersToByteArray);
                    }
                } else {
                    supportSQLiteStatement.bindNull(20);
                    supportSQLiteStatement.bindNull(21);
                    supportSQLiteStatement.bindNull(22);
                    supportSQLiteStatement.bindNull(23);
                    supportSQLiteStatement.bindNull(24);
                    supportSQLiteStatement.bindNull(25);
                    supportSQLiteStatement.bindNull(26);
                    supportSQLiteStatement.bindNull(27);
                }
                if (workSpec.id == null) {
                    supportSQLiteStatement.bindNull(28);
                } else {
                    supportSQLiteStatement.bindString(28, workSpec.id);
                }
            }
        };
        this.__preparedStmtOfDelete = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.3
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM workspec WHERE id=?";
            }
        };
        this.__preparedStmtOfSetState = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.4
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET state=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementPeriodCount = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.5
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfSetOutput = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.6
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET output=? WHERE id=?";
            }
        };
        this.__preparedStmtOfSetLastEnqueuedTime = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.7
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
            }
        };
        this.__preparedStmtOfIncrementWorkSpecRunAttemptCount = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.8
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
            }
        };
        this.__preparedStmtOfResetWorkSpecRunAttemptCount = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.9
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
            }
        };
        this.__preparedStmtOfMarkWorkSpecScheduled = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.10
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
            }
        };
        this.__preparedStmtOfResetScheduledState = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.11
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
            }
        };
        this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.12
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
            }
        };
        this.__preparedStmtOfIncrementGeneration = new androidx.room.SharedSQLiteStatement(__db) { // from class: androidx.work.impl.model.WorkSpecDao_Impl.13
            @Override // androidx.room.SharedSQLiteStatement
            public java.lang.String createQuery() {
                return "UPDATE workspec SET generation=generation+1 WHERE id=?";
            }
        };
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(final androidx.work.impl.model.WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__insertionAdapterOfWorkSpec.insert((androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec>) workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void updateWorkSpec(final androidx.work.impl.model.WorkSpec workSpec) {
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            this.__updateAdapterOfWorkSpec.handle(workSpec);
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(final java.lang.String id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfDelete.acquire();
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfDelete.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(final androidx.work.WorkInfo.State state, final java.lang.String id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfSetState.acquire();
        androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
        acquire.bindLong(1, androidx.work.impl.model.WorkTypeConverters.stateToInt(state));
        if (id == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, id);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetState.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementPeriodCount(final java.lang.String id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementPeriodCount.acquire();
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementPeriodCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(final java.lang.String id, final androidx.work.Data output) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfSetOutput.acquire();
        byte[] byteArrayInternal = androidx.work.Data.toByteArrayInternal(output);
        if (byteArrayInternal == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindBlob(1, byteArrayInternal);
        }
        if (id == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, id);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetOutput.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setLastEnqueuedTime(final java.lang.String id, final long enqueueTime) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfSetLastEnqueuedTime.acquire();
        acquire.bindLong(1, enqueueTime);
        if (id == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, id);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfSetLastEnqueuedTime.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(final java.lang.String id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.acquire();
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementWorkSpecRunAttemptCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(final java.lang.String id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfResetWorkSpecRunAttemptCount.acquire();
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetWorkSpecRunAttemptCount.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(final java.lang.String id, final long startTime) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfMarkWorkSpecScheduled.acquire();
        acquire.bindLong(1, startTime);
        if (id == null) {
            acquire.bindNull(2);
        } else {
            acquire.bindString(2, id);
        }
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfMarkWorkSpecScheduled.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfResetScheduledState.acquire();
        this.__db.beginTransaction();
        try {
            int executeUpdateDelete = acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
            return executeUpdateDelete;
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfResetScheduledState.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.acquire();
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void incrementGeneration(final java.lang.String id) {
        this.__db.assertNotSuspendingTransaction();
        androidx.sqlite.db.SupportSQLiteStatement acquire = this.__preparedStmtOfIncrementGeneration.acquire();
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.beginTransaction();
        try {
            acquire.executeUpdateDelete();
            this.__db.setTransactionSuccessful();
        } finally {
            this.__db.endTransaction();
            this.__preparedStmtOfIncrementGeneration.release(acquire);
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.impl.model.WorkSpec getWorkSpec(final java.lang.String id) {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int columnIndexOrThrow;
        int columnIndexOrThrow2;
        int columnIndexOrThrow3;
        int columnIndexOrThrow4;
        int columnIndexOrThrow5;
        int columnIndexOrThrow6;
        int columnIndexOrThrow7;
        int columnIndexOrThrow8;
        int columnIndexOrThrow9;
        int columnIndexOrThrow10;
        int columnIndexOrThrow11;
        int columnIndexOrThrow12;
        int columnIndexOrThrow13;
        int columnIndexOrThrow14;
        androidx.work.impl.model.WorkSpec workSpec;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE id=?", 1);
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "state");
            columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input");
            columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "output");
            columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
        } catch (java.lang.Throwable th) {
            th = th;
            roomSQLiteQuery = acquire;
        }
        try {
            int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
            int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
            int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
            int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "period_count");
            int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
            int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
            int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
            int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
            int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
            int columnIndexOrThrow24 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
            int columnIndexOrThrow25 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
            int columnIndexOrThrow26 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
            int columnIndexOrThrow27 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
            if (query.moveToFirst()) {
                java.lang.String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                int i6 = query.getInt(columnIndexOrThrow2);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i6);
                java.lang.String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                java.lang.String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow5) ? null : query.getBlob(columnIndexOrThrow5));
                androidx.work.Data fromByteArray2 = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow6) ? null : query.getBlob(columnIndexOrThrow6));
                long j = query.getLong(columnIndexOrThrow7);
                long j2 = query.getLong(columnIndexOrThrow8);
                long j3 = query.getLong(columnIndexOrThrow9);
                int i7 = query.getInt(columnIndexOrThrow10);
                int i8 = query.getInt(columnIndexOrThrow11);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(i8);
                long j4 = query.getLong(columnIndexOrThrow12);
                long j5 = query.getLong(columnIndexOrThrow13);
                long j6 = query.getLong(columnIndexOrThrow14);
                long j7 = query.getLong(columnIndexOrThrow15);
                if (query.getInt(columnIndexOrThrow16) != 0) {
                    i = columnIndexOrThrow17;
                    z = true;
                } else {
                    i = columnIndexOrThrow17;
                    z = false;
                }
                int i9 = query.getInt(i);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(i9);
                int i10 = query.getInt(columnIndexOrThrow18);
                int i11 = query.getInt(columnIndexOrThrow19);
                int i12 = query.getInt(columnIndexOrThrow20);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(i12);
                if (query.getInt(columnIndexOrThrow21) != 0) {
                    i2 = columnIndexOrThrow22;
                    z2 = true;
                } else {
                    i2 = columnIndexOrThrow22;
                    z2 = false;
                }
                if (query.getInt(i2) != 0) {
                    i3 = columnIndexOrThrow23;
                    z3 = true;
                } else {
                    i3 = columnIndexOrThrow23;
                    z3 = false;
                }
                if (query.getInt(i3) != 0) {
                    i4 = columnIndexOrThrow24;
                    z4 = true;
                } else {
                    i4 = columnIndexOrThrow24;
                    z4 = false;
                }
                if (query.getInt(i4) != 0) {
                    i5 = columnIndexOrThrow25;
                    z5 = true;
                } else {
                    i5 = columnIndexOrThrow25;
                    z5 = false;
                }
                long j8 = query.getLong(i5);
                long j9 = query.getLong(columnIndexOrThrow26);
                byte[] blob = query.isNull(columnIndexOrThrow27) ? null : query.getBlob(columnIndexOrThrow27);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                workSpec = new androidx.work.impl.model.WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, new androidx.work.Constraints(intToNetworkType, z2, z3, z4, z5, j8, j9, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(blob)), i7, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i10, i11);
            } else {
                workSpec = null;
            }
            query.close();
            roomSQLiteQuery.release();
            return workSpec;
        } catch (java.lang.Throwable th2) {
            th = th2;
            query.close();
            roomSQLiteQuery.release();
            throw th;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(final java.lang.String name) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, name);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                java.lang.String string = query.isNull(0) ? null : query.getString(0);
                int i = query.getInt(1);
                androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                arrayList.add(new androidx.work.impl.model.WorkSpec.IdAndState(string, androidx.work.impl.model.WorkTypeConverters.intToState(i)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getAllWorkSpecIds() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.isNull(0) ? null : query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllWorkSpecIdsLiveData() {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id FROM workspec", 0);
        return this.__db.getInvalidationTracker().createLiveData(new java.lang.String[]{"workspec"}, true, new java.util.concurrent.Callable<java.util.List<java.lang.String>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.14
            @Override // java.util.concurrent.Callable
            public java.util.List<java.lang.String> call() throws java.lang.Exception {
                androidx.work.impl.model.WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    android.database.Cursor query = androidx.room.util.DBUtil.query(androidx.work.impl.model.WorkSpecDao_Impl.this.__db, acquire, false, null);
                    try {
                        java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            arrayList.add(query.isNull(0) ? null : query.getString(0));
                        }
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    androidx.work.impl.model.WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.WorkInfo.State getState(final java.lang.String id) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT state FROM workspec WHERE id=?", 1);
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.assertNotSuspendingTransaction();
        androidx.work.WorkInfo.State state = null;
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                java.lang.Integer valueOf = query.isNull(0) ? null : java.lang.Integer.valueOf(query.getInt(0));
                if (valueOf != null) {
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    state = androidx.work.impl.model.WorkTypeConverters.intToState(valueOf.intValue());
                }
            }
            return state;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.impl.model.WorkSpec.WorkInfoPojo getWorkStatusPojoForId(java.lang.String str) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id=?", 1);
        if (str == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, str);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            androidx.work.impl.model.WorkSpec.WorkInfoPojo workInfoPojo = null;
            byte[] blob = null;
            android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, true, null);
            try {
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
                while (query.moveToNext()) {
                    java.lang.String string = query.getString(0);
                    if (arrayMap.get(string) == null) {
                        arrayMap.put(string, new java.util.ArrayList<>());
                    }
                    java.lang.String string2 = query.getString(0);
                    if (arrayMap2.get(string2) == null) {
                        arrayMap2.put(string2, new java.util.ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                if (query.moveToFirst()) {
                    java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                    int i = query.getInt(1);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                    if (!query.isNull(2)) {
                        blob = query.getBlob(2);
                    }
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(blob);
                    int i2 = query.getInt(3);
                    int i3 = query.getInt(4);
                    java.util.ArrayList<java.lang.String> arrayList = arrayMap.get(query.getString(0));
                    if (arrayList == null) {
                        arrayList = new java.util.ArrayList<>();
                    }
                    java.util.ArrayList<java.lang.String> arrayList2 = arrayList;
                    java.util.ArrayList<androidx.work.Data> arrayList3 = arrayMap2.get(query.getString(0));
                    if (arrayList3 == null) {
                        arrayList3 = new java.util.ArrayList<>();
                    }
                    workInfoPojo = new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i2, i3, arrayList2, arrayList3);
                }
                this.__db.setTransactionSuccessful();
                return workInfoPojo;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(final java.util.List<java.lang.String> ids) {
        java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (java.lang.String str : ids) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, true, null);
            try {
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
                while (query.moveToNext()) {
                    java.lang.String string = query.getString(0);
                    if (arrayMap.get(string) == null) {
                        arrayMap.put(string, new java.util.ArrayList<>());
                    }
                    java.lang.String string2 = query.getString(0);
                    if (arrayMap2.get(string2) == null) {
                        arrayMap2.put(string2, new java.util.ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                    int i2 = query.getInt(1);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i2);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                    int i3 = query.getInt(3);
                    int i4 = query.getInt(4);
                    java.util.ArrayList<java.lang.String> arrayList2 = arrayMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    java.util.ArrayList<java.lang.String> arrayList3 = arrayList2;
                    java.util.ArrayList<androidx.work.Data> arrayList4 = arrayMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList<>();
                    }
                    arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i3, i4, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(final java.util.List<java.lang.String> ids) {
        java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (");
        int size = ids.size();
        androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, size);
        newStringBuilder.append(")");
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(newStringBuilder.toString(), size);
        int i = 1;
        for (java.lang.String str : ids) {
            if (str == null) {
                acquire.bindNull(i);
            } else {
                acquire.bindString(i, str);
            }
            i++;
        }
        return this.__db.getInvalidationTracker().createLiveData(new java.lang.String[]{"WorkTag", "WorkProgress", "workspec"}, true, new java.util.concurrent.Callable<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.15
            @Override // java.util.concurrent.Callable
            public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> call() throws java.lang.Exception {
                androidx.work.impl.model.WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    android.database.Cursor query = androidx.room.util.DBUtil.query(androidx.work.impl.model.WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
                        while (query.moveToNext()) {
                            java.lang.String string = query.getString(0);
                            if (((java.util.ArrayList) arrayMap.get(string)) == null) {
                                arrayMap.put(string, new java.util.ArrayList());
                            }
                            java.lang.String string2 = query.getString(0);
                            if (((java.util.ArrayList) arrayMap2.get(string2)) == null) {
                                arrayMap2.put(string2, new java.util.ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                        java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                            int i2 = query.getInt(1);
                            androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                            androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i2);
                            androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i3 = query.getInt(3);
                            int i4 = query.getInt(4);
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            java.util.ArrayList arrayList3 = arrayList2;
                            java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new java.util.ArrayList();
                            }
                            arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i3, i4, arrayList3, arrayList4));
                        }
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    androidx.work.impl.model.WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(final java.lang.String tag) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, tag);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, true, null);
            try {
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
                while (query.moveToNext()) {
                    java.lang.String string = query.getString(0);
                    if (arrayMap.get(string) == null) {
                        arrayMap.put(string, new java.util.ArrayList<>());
                    }
                    java.lang.String string2 = query.getString(0);
                    if (arrayMap2.get(string2) == null) {
                        arrayMap2.put(string2, new java.util.ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                    int i = query.getInt(1);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                    int i2 = query.getInt(3);
                    int i3 = query.getInt(4);
                    java.util.ArrayList<java.lang.String> arrayList2 = arrayMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    java.util.ArrayList<java.lang.String> arrayList3 = arrayList2;
                    java.util.ArrayList<androidx.work.Data> arrayList4 = arrayMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList<>();
                    }
                    arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i2, i3, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(final java.lang.String tag) {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, tag);
        }
        return this.__db.getInvalidationTracker().createLiveData(new java.lang.String[]{"WorkTag", "WorkProgress", "workspec", "worktag"}, true, new java.util.concurrent.Callable<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.16
            @Override // java.util.concurrent.Callable
            public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> call() throws java.lang.Exception {
                androidx.work.impl.model.WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    android.database.Cursor query = androidx.room.util.DBUtil.query(androidx.work.impl.model.WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
                        while (query.moveToNext()) {
                            java.lang.String string = query.getString(0);
                            if (((java.util.ArrayList) arrayMap.get(string)) == null) {
                                arrayMap.put(string, new java.util.ArrayList());
                            }
                            java.lang.String string2 = query.getString(0);
                            if (((java.util.ArrayList) arrayMap2.get(string2)) == null) {
                                arrayMap2.put(string2, new java.util.ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                        java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                            int i = query.getInt(1);
                            androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                            androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                            androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i2 = query.getInt(3);
                            int i3 = query.getInt(4);
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            java.util.ArrayList arrayList3 = arrayList2;
                            java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new java.util.ArrayList();
                            }
                            arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i2, i3, arrayList3, arrayList4));
                        }
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    androidx.work.impl.model.WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(final java.lang.String name) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, name);
        }
        this.__db.assertNotSuspendingTransaction();
        this.__db.beginTransaction();
        try {
            android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, true, null);
            try {
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>();
                androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap2 = new androidx.collection.ArrayMap<>();
                while (query.moveToNext()) {
                    java.lang.String string = query.getString(0);
                    if (arrayMap.get(string) == null) {
                        arrayMap.put(string, new java.util.ArrayList<>());
                    }
                    java.lang.String string2 = query.getString(0);
                    if (arrayMap2.get(string2) == null) {
                        arrayMap2.put(string2, new java.util.ArrayList<>());
                    }
                }
                query.moveToPosition(-1);
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                    int i = query.getInt(1);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                    int i2 = query.getInt(3);
                    int i3 = query.getInt(4);
                    java.util.ArrayList<java.lang.String> arrayList2 = arrayMap.get(query.getString(0));
                    if (arrayList2 == null) {
                        arrayList2 = new java.util.ArrayList<>();
                    }
                    java.util.ArrayList<java.lang.String> arrayList3 = arrayList2;
                    java.util.ArrayList<androidx.work.Data> arrayList4 = arrayMap2.get(query.getString(0));
                    if (arrayList4 == null) {
                        arrayList4 = new java.util.ArrayList<>();
                    }
                    arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i2, i3, arrayList3, arrayList4));
                }
                this.__db.setTransactionSuccessful();
                return arrayList;
            } finally {
                query.close();
                acquire.release();
            }
        } finally {
            this.__db.endTransaction();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(final java.lang.String name) {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id, state, output, run_attempt_count, generation FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, name);
        }
        return this.__db.getInvalidationTracker().createLiveData(new java.lang.String[]{"WorkTag", "WorkProgress", "workspec", "workname"}, true, new java.util.concurrent.Callable<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.17
            @Override // java.util.concurrent.Callable
            public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> call() throws java.lang.Exception {
                androidx.work.impl.model.WorkSpecDao_Impl.this.__db.beginTransaction();
                try {
                    android.database.Cursor query = androidx.room.util.DBUtil.query(androidx.work.impl.model.WorkSpecDao_Impl.this.__db, acquire, true, null);
                    try {
                        androidx.collection.ArrayMap arrayMap = new androidx.collection.ArrayMap();
                        androidx.collection.ArrayMap arrayMap2 = new androidx.collection.ArrayMap();
                        while (query.moveToNext()) {
                            java.lang.String string = query.getString(0);
                            if (((java.util.ArrayList) arrayMap.get(string)) == null) {
                                arrayMap.put(string, new java.util.ArrayList());
                            }
                            java.lang.String string2 = query.getString(0);
                            if (((java.util.ArrayList) arrayMap2.get(string2)) == null) {
                                arrayMap2.put(string2, new java.util.ArrayList());
                            }
                        }
                        query.moveToPosition(-1);
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap2);
                        java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                        while (query.moveToNext()) {
                            java.lang.String string3 = query.isNull(0) ? null : query.getString(0);
                            int i = query.getInt(1);
                            androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                            androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i);
                            androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(2) ? null : query.getBlob(2));
                            int i2 = query.getInt(3);
                            int i3 = query.getInt(4);
                            java.util.ArrayList arrayList2 = (java.util.ArrayList) arrayMap.get(query.getString(0));
                            if (arrayList2 == null) {
                                arrayList2 = new java.util.ArrayList();
                            }
                            java.util.ArrayList arrayList3 = arrayList2;
                            java.util.ArrayList arrayList4 = (java.util.ArrayList) arrayMap2.get(query.getString(0));
                            if (arrayList4 == null) {
                                arrayList4 = new java.util.ArrayList();
                            }
                            arrayList.add(new androidx.work.impl.model.WorkSpec.WorkInfoPojo(string3, intToState, fromByteArray, i2, i3, arrayList3, arrayList4));
                        }
                        androidx.work.impl.model.WorkSpecDao_Impl.this.__db.setTransactionSuccessful();
                        return arrayList;
                    } finally {
                        query.close();
                    }
                } finally {
                    androidx.work.impl.model.WorkSpecDao_Impl.this.__db.endTransaction();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.Data> getInputsFromPrerequisites(final java.lang.String id) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(androidx.work.Data.fromByteArray(query.isNull(0) ? null : query.getBlob(0)));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getUnfinishedWorkWithTag(final java.lang.String tag) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (tag == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, tag);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.isNull(0) ? null : query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getUnfinishedWorkWithName(final java.lang.String name) {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (name == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, name);
        }
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.isNull(0) ? null : query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getAllUnfinishedWork() {
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
            while (query.moveToNext()) {
                arrayList.add(query.isNull(0) ? null : query.getString(0));
            }
            return arrayList;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
        boolean z = false;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0) {
                    z = true;
                }
            }
            return z;
        } finally {
            query.close();
            acquire.release();
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.lang.Long> getScheduleRequestedAtLiveData(final java.lang.String id) {
        final androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT schedule_requested_at FROM workspec WHERE id=?", 1);
        if (id == null) {
            acquire.bindNull(1);
        } else {
            acquire.bindString(1, id);
        }
        return this.__db.getInvalidationTracker().createLiveData(new java.lang.String[]{"workspec"}, false, new java.util.concurrent.Callable<java.lang.Long>() { // from class: androidx.work.impl.model.WorkSpecDao_Impl.18
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public java.lang.Long call() throws java.lang.Exception {
                android.database.Cursor query = androidx.room.util.DBUtil.query(androidx.work.impl.model.WorkSpecDao_Impl.this.__db, acquire, false, null);
                try {
                    return java.lang.Long.valueOf(query.moveToFirst() ? query.getLong(0) : 0L);
                } finally {
                    query.close();
                }
            }

            protected void finalize() {
                acquire.release();
            }
        });
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(final int schedulerLimit) {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        acquire.bindLong(1, schedulerLimit);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow24 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow25 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow26 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow27 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                    int i7 = query.getInt(columnIndexOrThrow2);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i7);
                    java.lang.String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                    java.lang.String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow5) ? null : query.getBlob(columnIndexOrThrow5));
                    androidx.work.Data fromByteArray2 = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow6) ? null : query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(i9);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i10 = i6;
                    long j6 = query.getLong(i10);
                    int i11 = columnIndexOrThrow;
                    int i12 = columnIndexOrThrow15;
                    long j7 = query.getLong(i12);
                    columnIndexOrThrow15 = i12;
                    int i13 = columnIndexOrThrow16;
                    if (query.getInt(i13) != 0) {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i14 = query.getInt(i);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(i14);
                    columnIndexOrThrow17 = i;
                    int i15 = columnIndexOrThrow18;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow18 = i15;
                    int i17 = columnIndexOrThrow19;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow19 = i17;
                    int i19 = columnIndexOrThrow20;
                    int i20 = query.getInt(i19);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(i20);
                    columnIndexOrThrow20 = i19;
                    int i21 = columnIndexOrThrow21;
                    if (query.getInt(i21) != 0) {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = query.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i22 = columnIndexOrThrow26;
                    long j9 = query.getLong(i22);
                    columnIndexOrThrow26 = i22;
                    int i23 = columnIndexOrThrow27;
                    byte[] blob = query.isNull(i23) ? null : query.getBlob(i23);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.Constraints constraints = new androidx.work.Constraints(intToNetworkType, z2, z3, z4, z5, j8, j9, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(blob));
                    columnIndexOrThrow27 = i23;
                    arrayList.add(new androidx.work.impl.model.WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, constraints, i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i16, i18));
                    columnIndexOrThrow = i11;
                    i6 = i10;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(final int maxLimit) {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        acquire.bindLong(1, maxLimit);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow24 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow25 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow26 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow27 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                    int i7 = query.getInt(columnIndexOrThrow2);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i7);
                    java.lang.String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                    java.lang.String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow5) ? null : query.getBlob(columnIndexOrThrow5));
                    androidx.work.Data fromByteArray2 = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow6) ? null : query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(i9);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i10 = i6;
                    long j6 = query.getLong(i10);
                    int i11 = columnIndexOrThrow;
                    int i12 = columnIndexOrThrow15;
                    long j7 = query.getLong(i12);
                    columnIndexOrThrow15 = i12;
                    int i13 = columnIndexOrThrow16;
                    if (query.getInt(i13) != 0) {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i14 = query.getInt(i);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(i14);
                    columnIndexOrThrow17 = i;
                    int i15 = columnIndexOrThrow18;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow18 = i15;
                    int i17 = columnIndexOrThrow19;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow19 = i17;
                    int i19 = columnIndexOrThrow20;
                    int i20 = query.getInt(i19);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(i20);
                    columnIndexOrThrow20 = i19;
                    int i21 = columnIndexOrThrow21;
                    if (query.getInt(i21) != 0) {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = query.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i22 = columnIndexOrThrow26;
                    long j9 = query.getLong(i22);
                    columnIndexOrThrow26 = i22;
                    int i23 = columnIndexOrThrow27;
                    byte[] blob = query.isNull(i23) ? null : query.getBlob(i23);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.Constraints constraints = new androidx.work.Constraints(intToNetworkType, z2, z3, z4, z5, j8, j9, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(blob));
                    columnIndexOrThrow27 = i23;
                    arrayList.add(new androidx.work.impl.model.WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, constraints, i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i16, i18));
                    columnIndexOrThrow = i11;
                    i6 = i10;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork() {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow24 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow25 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow26 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow27 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                    int i7 = query.getInt(columnIndexOrThrow2);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i7);
                    java.lang.String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                    java.lang.String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow5) ? null : query.getBlob(columnIndexOrThrow5));
                    androidx.work.Data fromByteArray2 = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow6) ? null : query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(i9);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i10 = i6;
                    long j6 = query.getLong(i10);
                    int i11 = columnIndexOrThrow;
                    int i12 = columnIndexOrThrow15;
                    long j7 = query.getLong(i12);
                    columnIndexOrThrow15 = i12;
                    int i13 = columnIndexOrThrow16;
                    if (query.getInt(i13) != 0) {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i14 = query.getInt(i);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(i14);
                    columnIndexOrThrow17 = i;
                    int i15 = columnIndexOrThrow18;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow18 = i15;
                    int i17 = columnIndexOrThrow19;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow19 = i17;
                    int i19 = columnIndexOrThrow20;
                    int i20 = query.getInt(i19);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(i20);
                    columnIndexOrThrow20 = i19;
                    int i21 = columnIndexOrThrow21;
                    if (query.getInt(i21) != 0) {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = query.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i22 = columnIndexOrThrow26;
                    long j9 = query.getLong(i22);
                    columnIndexOrThrow26 = i22;
                    int i23 = columnIndexOrThrow27;
                    byte[] blob = query.isNull(i23) ? null : query.getBlob(i23);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.Constraints constraints = new androidx.work.Constraints(intToNetworkType, z2, z3, z4, z5, j8, j9, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(blob));
                    columnIndexOrThrow27 = i23;
                    arrayList.add(new androidx.work.impl.model.WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, constraints, i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i16, i18));
                    columnIndexOrThrow = i11;
                    i6 = i10;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork() {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE state=1", 0);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow24 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow25 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow26 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow27 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                    int i7 = query.getInt(columnIndexOrThrow2);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i7);
                    java.lang.String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                    java.lang.String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow5) ? null : query.getBlob(columnIndexOrThrow5));
                    androidx.work.Data fromByteArray2 = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow6) ? null : query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(i9);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i10 = i6;
                    long j6 = query.getLong(i10);
                    int i11 = columnIndexOrThrow;
                    int i12 = columnIndexOrThrow15;
                    long j7 = query.getLong(i12);
                    columnIndexOrThrow15 = i12;
                    int i13 = columnIndexOrThrow16;
                    if (query.getInt(i13) != 0) {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i14 = query.getInt(i);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(i14);
                    columnIndexOrThrow17 = i;
                    int i15 = columnIndexOrThrow18;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow18 = i15;
                    int i17 = columnIndexOrThrow19;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow19 = i17;
                    int i19 = columnIndexOrThrow20;
                    int i20 = query.getInt(i19);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(i20);
                    columnIndexOrThrow20 = i19;
                    int i21 = columnIndexOrThrow21;
                    if (query.getInt(i21) != 0) {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = query.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i22 = columnIndexOrThrow26;
                    long j9 = query.getLong(i22);
                    columnIndexOrThrow26 = i22;
                    int i23 = columnIndexOrThrow27;
                    byte[] blob = query.isNull(i23) ? null : query.getBlob(i23);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.Constraints constraints = new androidx.work.Constraints(intToNetworkType, z2, z3, z4, z5, j8, j9, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(blob));
                    columnIndexOrThrow27 = i23;
                    arrayList.add(new androidx.work.impl.model.WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, constraints, i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i16, i18));
                    columnIndexOrThrow = i11;
                    i6 = i10;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(final long startingAt) {
        androidx.room.RoomSQLiteQuery roomSQLiteQuery;
        int i;
        boolean z;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        acquire.bindLong(1, startingAt);
        this.__db.assertNotSuspendingTransaction();
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndexOrThrow = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "id");
            int columnIndexOrThrow2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "state");
            int columnIndexOrThrow3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "worker_class_name");
            int columnIndexOrThrow4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input_merger_class_name");
            int columnIndexOrThrow5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "input");
            int columnIndexOrThrow6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "output");
            int columnIndexOrThrow7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "initial_delay");
            int columnIndexOrThrow8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "interval_duration");
            int columnIndexOrThrow9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "flex_duration");
            int columnIndexOrThrow10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_attempt_count");
            int columnIndexOrThrow11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_policy");
            int columnIndexOrThrow12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "backoff_delay_duration");
            int columnIndexOrThrow13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "last_enqueue_time");
            int columnIndexOrThrow14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "minimum_retention_duration");
            roomSQLiteQuery = acquire;
            try {
                int columnIndexOrThrow15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "schedule_requested_at");
                int columnIndexOrThrow16 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "run_in_foreground");
                int columnIndexOrThrow17 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "out_of_quota_policy");
                int columnIndexOrThrow18 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "period_count");
                int columnIndexOrThrow19 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "generation");
                int columnIndexOrThrow20 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "required_network_type");
                int columnIndexOrThrow21 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_charging");
                int columnIndexOrThrow22 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_device_idle");
                int columnIndexOrThrow23 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_battery_not_low");
                int columnIndexOrThrow24 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "requires_storage_not_low");
                int columnIndexOrThrow25 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_content_update_delay");
                int columnIndexOrThrow26 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "trigger_max_content_delay");
                int columnIndexOrThrow27 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(query, "content_uri_triggers");
                int i6 = columnIndexOrThrow14;
                java.util.ArrayList arrayList = new java.util.ArrayList(query.getCount());
                while (query.moveToNext()) {
                    java.lang.String string = query.isNull(columnIndexOrThrow) ? null : query.getString(columnIndexOrThrow);
                    int i7 = query.getInt(columnIndexOrThrow2);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.WorkInfo.State intToState = androidx.work.impl.model.WorkTypeConverters.intToState(i7);
                    java.lang.String string2 = query.isNull(columnIndexOrThrow3) ? null : query.getString(columnIndexOrThrow3);
                    java.lang.String string3 = query.isNull(columnIndexOrThrow4) ? null : query.getString(columnIndexOrThrow4);
                    androidx.work.Data fromByteArray = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow5) ? null : query.getBlob(columnIndexOrThrow5));
                    androidx.work.Data fromByteArray2 = androidx.work.Data.fromByteArray(query.isNull(columnIndexOrThrow6) ? null : query.getBlob(columnIndexOrThrow6));
                    long j = query.getLong(columnIndexOrThrow7);
                    long j2 = query.getLong(columnIndexOrThrow8);
                    long j3 = query.getLong(columnIndexOrThrow9);
                    int i8 = query.getInt(columnIndexOrThrow10);
                    int i9 = query.getInt(columnIndexOrThrow11);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters2 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.BackoffPolicy intToBackoffPolicy = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(i9);
                    long j4 = query.getLong(columnIndexOrThrow12);
                    long j5 = query.getLong(columnIndexOrThrow13);
                    int i10 = i6;
                    long j6 = query.getLong(i10);
                    int i11 = columnIndexOrThrow;
                    int i12 = columnIndexOrThrow15;
                    long j7 = query.getLong(i12);
                    columnIndexOrThrow15 = i12;
                    int i13 = columnIndexOrThrow16;
                    if (query.getInt(i13) != 0) {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = true;
                    } else {
                        columnIndexOrThrow16 = i13;
                        i = columnIndexOrThrow17;
                        z = false;
                    }
                    int i14 = query.getInt(i);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters3 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.OutOfQuotaPolicy intToOutOfQuotaPolicy = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(i14);
                    columnIndexOrThrow17 = i;
                    int i15 = columnIndexOrThrow18;
                    int i16 = query.getInt(i15);
                    columnIndexOrThrow18 = i15;
                    int i17 = columnIndexOrThrow19;
                    int i18 = query.getInt(i17);
                    columnIndexOrThrow19 = i17;
                    int i19 = columnIndexOrThrow20;
                    int i20 = query.getInt(i19);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters4 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.NetworkType intToNetworkType = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(i20);
                    columnIndexOrThrow20 = i19;
                    int i21 = columnIndexOrThrow21;
                    if (query.getInt(i21) != 0) {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = true;
                    } else {
                        columnIndexOrThrow21 = i21;
                        i2 = columnIndexOrThrow22;
                        z2 = false;
                    }
                    if (query.getInt(i2) != 0) {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = true;
                    } else {
                        columnIndexOrThrow22 = i2;
                        i3 = columnIndexOrThrow23;
                        z3 = false;
                    }
                    if (query.getInt(i3) != 0) {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = true;
                    } else {
                        columnIndexOrThrow23 = i3;
                        i4 = columnIndexOrThrow24;
                        z4 = false;
                    }
                    if (query.getInt(i4) != 0) {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = true;
                    } else {
                        columnIndexOrThrow24 = i4;
                        i5 = columnIndexOrThrow25;
                        z5 = false;
                    }
                    long j8 = query.getLong(i5);
                    columnIndexOrThrow25 = i5;
                    int i22 = columnIndexOrThrow26;
                    long j9 = query.getLong(i22);
                    columnIndexOrThrow26 = i22;
                    int i23 = columnIndexOrThrow27;
                    byte[] blob = query.isNull(i23) ? null : query.getBlob(i23);
                    androidx.work.impl.model.WorkTypeConverters workTypeConverters5 = androidx.work.impl.model.WorkTypeConverters.INSTANCE;
                    androidx.work.Constraints constraints = new androidx.work.Constraints(intToNetworkType, z2, z3, z4, z5, j8, j9, androidx.work.impl.model.WorkTypeConverters.byteArrayToSetOfTriggers(blob));
                    columnIndexOrThrow27 = i23;
                    arrayList.add(new androidx.work.impl.model.WorkSpec(string, intToState, string2, string3, fromByteArray, fromByteArray2, j, j2, j3, constraints, i8, intToBackoffPolicy, j4, j5, j6, j7, z, intToOutOfQuotaPolicy, i16, i18));
                    columnIndexOrThrow = i11;
                    i6 = i10;
                }
                query.close();
                roomSQLiteQuery.release();
                return arrayList;
            } catch (java.lang.Throwable th) {
                th = th;
                query.close();
                roomSQLiteQuery.release();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
            roomSQLiteQuery = acquire;
        }
    }

    public static java.util.List<java.lang.Class<?>> getRequiredConverters() {
        return java.util.Collections.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkTagAsjavaLangString(final androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> _map) {
        int i;
        java.util.Set<java.lang.String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> arrayMap = new androidx.collection.ArrayMap<>(999);
            int size = _map.getSize();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    arrayMap.put(_map.keyAt(i2), _map.valueAt(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                arrayMap = new androidx.collection.ArrayMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkTagAsjavaLangString(arrayMap);
                return;
            }
            return;
        }
        java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2);
        int i3 = 1;
        for (java.lang.String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = androidx.room.util.CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                java.util.ArrayList<java.lang.String> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(query.isNull(0) ? null : query.getString(0));
                }
            }
        } finally {
            query.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void __fetchRelationshipWorkProgressAsandroidxWorkData(final androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> _map) {
        int i;
        java.util.Set<java.lang.String> keySet = _map.keySet();
        if (keySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> arrayMap = new androidx.collection.ArrayMap<>(999);
            int size = _map.getSize();
            int i2 = 0;
            loop0: while (true) {
                i = 0;
                while (i2 < size) {
                    arrayMap.put(_map.keyAt(i2), _map.valueAt(i2));
                    i2++;
                    i++;
                    if (i == 999) {
                        break;
                    }
                }
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap);
                arrayMap = new androidx.collection.ArrayMap<>(999);
            }
            if (i > 0) {
                __fetchRelationshipWorkProgressAsandroidxWorkData(arrayMap);
                return;
            }
            return;
        }
        java.lang.StringBuilder newStringBuilder = androidx.room.util.StringUtil.newStringBuilder();
        newStringBuilder.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size2 = keySet.size();
        androidx.room.util.StringUtil.appendPlaceholders(newStringBuilder, size2);
        newStringBuilder.append(")");
        androidx.room.RoomSQLiteQuery acquire = androidx.room.RoomSQLiteQuery.acquire(newStringBuilder.toString(), size2);
        int i3 = 1;
        for (java.lang.String str : keySet) {
            if (str == null) {
                acquire.bindNull(i3);
            } else {
                acquire.bindString(i3, str);
            }
            i3++;
        }
        android.database.Cursor query = androidx.room.util.DBUtil.query(this.__db, acquire, false, null);
        try {
            int columnIndex = androidx.room.util.CursorUtil.getColumnIndex(query, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (query.moveToNext()) {
                java.util.ArrayList<androidx.work.Data> arrayList = _map.get(query.getString(columnIndex));
                if (arrayList != null) {
                    arrayList.add(androidx.work.Data.fromByteArray(query.isNull(0) ? null : query.getBlob(0)));
                }
            }
        } finally {
            query.close();
        }
    }
}
