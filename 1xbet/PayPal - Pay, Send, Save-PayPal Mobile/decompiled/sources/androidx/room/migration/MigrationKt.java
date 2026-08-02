package androidx.room.migration;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "startVersion", "endVersion", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "", "migrate", "Landroidx/room/migration/Migration;", "Migration", "(IILkotlin/jvm/functions/Function1;)Landroidx/room/migration/Migration;"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class MigrationKt {
    public static final androidx.room.migration.Migration Migration(int i, int i2, kotlin.jvm.functions.Function1<? super androidx.database.db.SupportSQLiteDatabase, kotlin.Unit> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new androidx.room.migration.MigrationImpl(i, i2, function1);
    }
}
