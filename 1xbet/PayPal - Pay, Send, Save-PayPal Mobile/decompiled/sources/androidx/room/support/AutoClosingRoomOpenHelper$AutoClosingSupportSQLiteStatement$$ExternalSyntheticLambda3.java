package androidx.room.support;

/* loaded from: classes3.dex */
public final /* synthetic */ class AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3 implements kotlin.jvm.functions.Function1 {
    public final /* synthetic */ androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement f$0;
    public final /* synthetic */ kotlin.jvm.functions.Function1 f$1;

    public /* synthetic */ AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3(androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement autoClosingSupportSQLiteStatement, kotlin.jvm.functions.Function1 function1) {
        this.f$0 = autoClosingSupportSQLiteStatement;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final java.lang.Object invoke(java.lang.Object obj) {
        return androidx.room.support.AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.getHighSpeedVideoSizes(this.f$0, this.f$1, (androidx.database.db.SupportSQLiteDatabase) obj);
    }
}
