package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroidx/work/impl/WorkMigration9To10;", "Landroidx/room/migration/Migration;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/content/Context;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WorkMigration9To10 extends androidx.room.migration.Migration {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.content.Context getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkMigration9To10(android.content.Context context) {
        super(9, 10);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.getHighSpeedVideoFpsRangesFor = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        db.execSQL(androidx.work.impl.utils.PreferenceUtils.CREATE_PREFERENCE);
        androidx.work.impl.utils.PreferenceUtils.migrateLegacyPreferences(this.getHighSpeedVideoFpsRangesFor, db);
        androidx.work.impl.utils.IdGeneratorKt.migrateLegacyIdGenerator(this.getHighSpeedVideoFpsRangesFor, db);
    }
}
