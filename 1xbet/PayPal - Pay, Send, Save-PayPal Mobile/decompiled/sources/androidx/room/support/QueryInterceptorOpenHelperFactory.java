package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014"}, d2 = {"Landroidx/room/support/QueryInterceptorOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "delegate", "Lkotlinx/coroutines/CoroutineScope;", "queryCallbackScope", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Lkotlinx/coroutines/CoroutineScope;Landroidx/room/RoomDatabase$QueryCallback;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "create", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getHighSpeedVideoSizes", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Camera2StreamConfigurationMap", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/CoroutineScope;", "getHighSpeedVideoFpsRanges", "Landroidx/room/RoomDatabase$QueryCallback;", "getHighSpeedVideoFpsRangesFor"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class QueryInterceptorOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.room.RoomDatabase.QueryCallback getHighSpeedVideoFpsRangesFor;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final kotlinx.coroutines.CoroutineScope getHighSpeedVideoFpsRanges;

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory Camera2StreamConfigurationMap;

    public QueryInterceptorOpenHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, kotlinx.coroutines.CoroutineScope coroutineScope, androidx.room.RoomDatabase.QueryCallback queryCallback) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(coroutineScope, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(queryCallback, "");
        this.Camera2StreamConfigurationMap = factory;
        this.getHighSpeedVideoFpsRanges = coroutineScope;
        this.getHighSpeedVideoFpsRangesFor = queryCallback;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final androidx.database.db.SupportSQLiteOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return new androidx.room.support.QueryInterceptorOpenHelper(this.Camera2StreamConfigurationMap.create(configuration), this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoFpsRangesFor);
    }
}
