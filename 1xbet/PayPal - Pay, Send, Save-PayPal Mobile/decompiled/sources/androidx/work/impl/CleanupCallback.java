package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r"}, d2 = {"Landroidx/work/impl/CleanupCallback;", "Landroidx/room/RoomDatabase$Callback;", "Landroidx/work/Clock;", "clock", "<init>", "(Landroidx/work/Clock;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "onOpen", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/work/Clock;", "getClock", "()Landroidx/work/Clock;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CleanupCallback extends androidx.room.RoomDatabase.Callback {
    private final androidx.work.Clock clock;

    public CleanupCallback(androidx.work.Clock clock) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clock, "");
        this.clock = clock;
    }

    public final androidx.work.Clock getClock() {
        return this.clock;
    }

    @Override // androidx.room.RoomDatabase.Callback
    public final void onOpen(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        super.onOpen(db);
        db.beginTransaction();
        try {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (last_enqueue_time + minimum_retention_duration) < ");
            sb.append(this.clock.currentTimeMillis() - androidx.work.impl.WorkDatabaseKt.PRUNE_THRESHOLD_MILLIS);
            sb.append(" AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))");
            db.execSQL(sb.toString());
            db.setTransactionSuccessful();
        } finally {
            db.endTransaction();
        }
    }
}
