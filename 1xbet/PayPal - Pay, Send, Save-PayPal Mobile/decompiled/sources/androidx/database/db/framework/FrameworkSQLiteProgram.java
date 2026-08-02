package androidx.database.db.framework;

@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Landroidx/sqlite/db/framework/FrameworkSQLiteProgram;", "Landroidx/sqlite/db/SupportSQLiteProgram;", "Landroid/database/sqlite/SQLiteProgram;", "delegate", "<init>", "(Landroid/database/sqlite/SQLiteProgram;)V", "", "index", "", "bindNull", "(I)V", "", com.datadog.android.rum.internal.metric.ViewEndedMetricDispatcher.KEY_VALUE, "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "()V", "close", "getHighResolutionOutputSizeshNQ4ISI", "Landroid/database/sqlite/SQLiteProgram;", "getHighSpeedVideoFpsRanges"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public class FrameworkSQLiteProgram implements androidx.database.db.SupportSQLiteProgram {

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final android.database.sqlite.SQLiteProgram getHighSpeedVideoFpsRanges;

    public FrameworkSQLiteProgram(android.database.sqlite.SQLiteProgram sQLiteProgram) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteProgram, "");
        this.getHighSpeedVideoFpsRanges = sQLiteProgram;
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindNull(int index) {
        this.getHighSpeedVideoFpsRanges.bindNull(index);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindLong(int index, long value) {
        this.getHighSpeedVideoFpsRanges.bindLong(index, value);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindDouble(int index, double value) {
        this.getHighSpeedVideoFpsRanges.bindDouble(index, value);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindString(int index, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.bindString(index, value);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void bindBlob(int index, byte[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "");
        this.getHighSpeedVideoFpsRanges.bindBlob(index, value);
    }

    @Override // androidx.database.db.SupportSQLiteProgram
    public void clearBindings() {
        this.getHighSpeedVideoFpsRanges.clearBindings();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.getHighSpeedVideoFpsRanges.close();
    }
}
