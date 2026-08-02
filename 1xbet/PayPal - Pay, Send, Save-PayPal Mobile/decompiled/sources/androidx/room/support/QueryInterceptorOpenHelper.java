package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010#\u001a\u0004\u0018\u00010 8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b!\u0010\""}, d2 = {"Landroidx/room/support/QueryInterceptorOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "queryCallbackScope", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Lkotlinx/coroutines/CoroutineScope;Landroidx/room/RoomDatabase$QueryCallback;)V", "", "close", "()V", "", "enabled", "setWriteAheadLoggingEnabled", "(Z)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/CoroutineScope;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/room/RoomDatabase$QueryCallback;", "getHighSpeedVideoSizes", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QueryInterceptorOpenHelper implements androidx.database.db.SupportSQLiteOpenHelper, androidx.room.DelegatingOpenHelper {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.database.db.SupportSQLiteOpenHelper delegate;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase.QueryCallback getHighSpeedVideoSizes;

    public QueryInterceptorOpenHelper(androidx.database.db.SupportSQLiteOpenHelper supportSQLiteOpenHelper, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.room.RoomDatabase.QueryCallback queryCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryCallback, "");
        this.delegate = supportSQLiteOpenHelper;
        this.getHighResolutionOutputSizeshNQ4ISI = coroutineScope;
        this.getHighSpeedVideoSizes = queryCallback;
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final androidx.database.db.SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final androidx.database.db.SupportSQLiteDatabase getWritableDatabase() {
        return new androidx.room.support.QueryInterceptorDatabase(getDelegate().getWritableDatabase(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final androidx.database.db.SupportSQLiteDatabase getReadableDatabase() {
        return new androidx.room.support.QueryInterceptorDatabase(getDelegate().getReadableDatabase(), this.getHighResolutionOutputSizeshNQ4ISI, this.getHighSpeedVideoSizes);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean enabled) {
        this.delegate.setWriteAheadLoggingEnabled(enabled);
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    /* renamed from: getDatabaseName */
    public final java.lang.String getGetHighSpeedVideoSizes() {
        return this.delegate.getGetHighSpeedVideoSizes();
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.delegate.close();
    }
}
