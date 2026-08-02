package app.cash.sqldelight.driver.android;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lapp/cash/sqldelight/driver/android/AndroidCursor;", "Lapp/cash/sqldelight/db/SqlCursor;", "Landroid/database/Cursor;", "p0", "", "p1", "<init>", "(Landroid/database/Cursor;Ljava/lang/Long;)V", "", "", "getBoolean", "(I)Ljava/lang/Boolean;", "", "getBytes", "(I)[B", "", "getDouble", "(I)Ljava/lang/Double;", "getLong", "(I)Ljava/lang/Long;", "", "getString", "(I)Ljava/lang/String;", "getHighSpeedVideoSizes", "Landroid/database/Cursor;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AndroidCursor implements app.cash.sqldelight.db.SqlCursor {
    private final android.database.Cursor getHighSpeedVideoSizes;

    public AndroidCursor(android.database.Cursor cursor, java.lang.Long l) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cursor, "");
        this.getHighSpeedVideoSizes = cursor;
        if (android.os.Build.VERSION.SDK_INT < 28 || l == null || !(cursor instanceof android.database.AbstractWindowedCursor)) {
            return;
        }
        app.cash.sqldelight.driver.android.Api28Impl.getHighSpeedVideoFpsRangesFor((android.database.AbstractWindowedCursor) cursor, l.longValue());
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final java.lang.String getString(int p0) {
        if (this.getHighSpeedVideoSizes.isNull(p0)) {
            return null;
        }
        return this.getHighSpeedVideoSizes.getString(p0);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final java.lang.Long getLong(int p0) {
        if (this.getHighSpeedVideoSizes.isNull(p0)) {
            return null;
        }
        return java.lang.Long.valueOf(this.getHighSpeedVideoSizes.getLong(p0));
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final byte[] getBytes(int p0) {
        if (this.getHighSpeedVideoSizes.isNull(p0)) {
            return null;
        }
        return this.getHighSpeedVideoSizes.getBlob(p0);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final java.lang.Double getDouble(int p0) {
        if (this.getHighSpeedVideoSizes.isNull(p0)) {
            return null;
        }
        return java.lang.Double.valueOf(this.getHighSpeedVideoSizes.getDouble(p0));
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final java.lang.Boolean getBoolean(int p0) {
        if (this.getHighSpeedVideoSizes.isNull(p0)) {
            return null;
        }
        return java.lang.Boolean.valueOf(this.getHighSpeedVideoSizes.getLong(p0) == 1);
    }

    @Override // app.cash.sqldelight.db.SqlCursor
    public final /* synthetic */ app.cash.sqldelight.db.QueryResult next() {
        return app.cash.sqldelight.db.QueryResult.Value.m9520boximpl(app.cash.sqldelight.db.QueryResult.Value.m9521constructorimpl(java.lang.Boolean.valueOf(this.getHighSpeedVideoSizes.moveToNext())));
    }
}
