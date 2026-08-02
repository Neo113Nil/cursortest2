package app.cash.sqldelight.driver.android;

@kotlin.Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ/\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001c2\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001f0\u001dH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidPreparedStatement;", "Lapp/cash/sqldelight/driver/android/AndroidStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "p0", "<init>", "(Landroidx/sqlite/db/SupportSQLiteStatement;)V", "", "", "p1", "", "bindBoolean", "(ILjava/lang/Boolean;)V", "", "bindBytes", "(I[B)V", "", "bindDouble", "(ILjava/lang/Double;)V", "", "bindLong", "(ILjava/lang/Long;)V", "", "bindString", "(ILjava/lang/String;)V", "close", "()V", "execute", "()J", com.adobe.marketing.mobile.internal.CoreConstants.Wrapper.Type.REACT_NATIVE, "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "Lapp/cash/sqldelight/db/QueryResult;", "executeQuery", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Camera2StreamConfigurationMap", "Landroidx/sqlite/db/SupportSQLiteStatement;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AndroidPreparedStatement implements app.cash.sqldelight.driver.android.AndroidStatement {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.database.db.SupportSQLiteStatement getHighSpeedVideoFpsRanges;

    public AndroidPreparedStatement(androidx.database.db.SupportSQLiteStatement supportSQLiteStatement) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
        this.getHighSpeedVideoFpsRanges = supportSQLiteStatement;
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindBytes(int p0, byte[] p1) {
        if (p1 == null) {
            this.getHighSpeedVideoFpsRanges.bindNull(p0 + 1);
        } else {
            this.getHighSpeedVideoFpsRanges.bindBlob(p0 + 1, p1);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindLong(int p0, java.lang.Long p1) {
        if (p1 == null) {
            this.getHighSpeedVideoFpsRanges.bindNull(p0 + 1);
        } else {
            this.getHighSpeedVideoFpsRanges.bindLong(p0 + 1, p1.longValue());
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindDouble(int p0, java.lang.Double p1) {
        if (p1 == null) {
            this.getHighSpeedVideoFpsRanges.bindNull(p0 + 1);
        } else {
            this.getHighSpeedVideoFpsRanges.bindDouble(p0 + 1, p1.doubleValue());
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindString(int p0, java.lang.String p1) {
        if (p1 == null) {
            this.getHighSpeedVideoFpsRanges.bindNull(p0 + 1);
        } else {
            this.getHighSpeedVideoFpsRanges.bindString(p0 + 1, p1);
        }
    }

    @Override // app.cash.sqldelight.db.SqlPreparedStatement
    public final void bindBoolean(int p0, java.lang.Boolean p1) {
        if (p1 == null) {
            this.getHighSpeedVideoFpsRanges.bindNull(p0 + 1);
        } else {
            this.getHighSpeedVideoFpsRanges.bindLong(p0 + 1, p1.booleanValue() ? 1L : 0L);
        }
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final <R> R executeQuery(kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends app.cash.sqldelight.db.QueryResult<R>> p0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(p0, "");
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final long execute() {
        return this.getHighSpeedVideoFpsRanges.executeUpdateDelete();
    }

    @Override // app.cash.sqldelight.driver.android.AndroidStatement
    public final void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }
}
