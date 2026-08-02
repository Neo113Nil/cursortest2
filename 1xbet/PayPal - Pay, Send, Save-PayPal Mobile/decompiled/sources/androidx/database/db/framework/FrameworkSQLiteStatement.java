package androidx.database.db.framework;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteStatement;", "Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "Landroid/database/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteStatement;)V", "", "execute", "()V", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "", "simpleQueryForString", "()Ljava/lang/String;", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/database/sqlite/SQLiteStatement;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FrameworkSQLiteStatement extends androidx.database.db.framework.FrameworkSQLiteProgram implements androidx.database.db.SupportSQLiteStatement {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.database.sqlite.SQLiteStatement getHighSpeedVideoFpsRangesFor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrameworkSQLiteStatement(android.database.sqlite.SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        this.getHighSpeedVideoFpsRangesFor = sQLiteStatement;
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final void execute() {
        this.getHighSpeedVideoFpsRangesFor.execute();
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final int executeUpdateDelete() {
        return this.getHighSpeedVideoFpsRangesFor.executeUpdateDelete();
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final long executeInsert() {
        return this.getHighSpeedVideoFpsRangesFor.executeInsert();
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final long simpleQueryForLong() {
        return this.getHighSpeedVideoFpsRangesFor.simpleQueryForLong();
    }

    @Override // androidx.database.db.SupportSQLiteStatement
    public final java.lang.String simpleQueryForString() {
        return this.getHighSpeedVideoFpsRangesFor.simpleQueryForString();
    }
}
