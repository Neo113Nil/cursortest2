package androidx.work.impl;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/work/impl/RescheduleMigration;", "Landroidx/room/migration/Migration;", "Landroid/content/Context;", "mContext", "", "startVersion", "endVersion", "<init>", "(Landroid/content/Context;II)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", com.datadog.trace.api.DDSpanTypes.COUCHBASE, "", "migrate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroid/content/Context;", "getMContext", "()Landroid/content/Context;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RescheduleMigration extends androidx.room.migration.Migration {
    private final android.content.Context mContext;

    public final android.content.Context getMContext() {
        return this.mContext;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RescheduleMigration(android.content.Context context, int i, int i2) {
        super(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        this.mContext = context;
    }

    @Override // androidx.room.migration.Migration
    public final void migrate(androidx.database.db.SupportSQLiteDatabase db) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(db, "");
        if (this.endVersion >= 10) {
            db.execSQL(androidx.work.impl.utils.PreferenceUtils.INSERT_PREFERENCE, new java.lang.Object[]{androidx.work.impl.utils.PreferenceUtils.KEY_RESCHEDULE_NEEDED, 1});
        } else {
            this.mContext.getSharedPreferences(androidx.work.impl.utils.PreferenceUtils.PREFERENCES_FILE_NAME, 0).edit().putBoolean(androidx.work.impl.utils.PreferenceUtils.KEY_RESCHEDULE_NEEDED, true).apply();
        }
    }
}
