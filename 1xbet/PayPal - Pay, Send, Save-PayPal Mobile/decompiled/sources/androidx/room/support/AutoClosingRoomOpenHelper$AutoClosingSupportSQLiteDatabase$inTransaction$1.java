package androidx.room.support;

@kotlin.Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<androidx.database.db.SupportSQLiteDatabase, java.lang.Boolean> {
    public static final androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1 getHighSpeedVideoFpsRangesFor = new androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1();

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: getHighSpeedVideoFpsRanges, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean invoke(androidx.database.db.SupportSQLiteDatabase supportSQLiteDatabase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        return java.lang.Boolean.valueOf(supportSQLiteDatabase.inTransaction());
    }

    AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1() {
        super(1, androidx.database.db.SupportSQLiteDatabase.class, "inTransaction", "inTransaction()Z", 0);
    }
}
