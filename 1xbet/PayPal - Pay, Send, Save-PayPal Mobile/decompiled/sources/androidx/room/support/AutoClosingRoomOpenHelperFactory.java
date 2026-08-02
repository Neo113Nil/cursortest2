package androidx.room.support;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelperFactory;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "delegate", "Landroidx/room/support/AutoCloser;", "autoCloser", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/support/AutoCloser;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;", com.miteksystems.misnap.core.serverconnection.MobileVerifyV2Request.CONFIG_KEY, "Landroidx/room/support/AutoClosingRoomOpenHelper;", "create", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Configuration;)Landroidx/room/support/AutoClosingRoomOpenHelper;", "Camera2StreamConfigurationMap", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "getHighResolutionOutputSizeshNQ4ISI", "getHighSpeedVideoFpsRanges", "Landroidx/room/support/AutoCloser;"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutoClosingRoomOpenHelperFactory implements androidx.sqlite.db.SupportSQLiteOpenHelper.Factory {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory getHighResolutionOutputSizeshNQ4ISI;
    private final androidx.room.support.AutoCloser getHighSpeedVideoFpsRanges;

    public AutoClosingRoomOpenHelperFactory(androidx.sqlite.db.SupportSQLiteOpenHelper.Factory factory, androidx.room.support.AutoCloser autoCloser) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(autoCloser, "");
        this.getHighResolutionOutputSizeshNQ4ISI = factory;
        this.getHighSpeedVideoFpsRanges = autoCloser;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Factory
    public final androidx.room.support.AutoClosingRoomOpenHelper create(androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration configuration) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(configuration, "");
        return new androidx.room.support.AutoClosingRoomOpenHelper(this.getHighResolutionOutputSizeshNQ4ISI.create(configuration), this.getHighSpeedVideoFpsRanges);
    }
}
