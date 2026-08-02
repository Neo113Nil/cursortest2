package app.cash.sqldelight;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\r\u001aY\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\u0010\u001aY\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\u0014\u001ai\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\u0015"}, d2 = {"", "RowType", "", "identifier", "Lapp/cash/sqldelight/db/SqlDriver;", "driver", "", "query", "Lkotlin/Function1;", "Lapp/cash/sqldelight/db/SqlCursor;", "mapper", "Lapp/cash/sqldelight/ExecutableQuery;", "Query", "(ILapp/cash/sqldelight/db/SqlDriver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/ExecutableQuery;", "fileName", "label", "(ILapp/cash/sqldelight/db/SqlDriver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/ExecutableQuery;", "", "queryKeys", "Lapp/cash/sqldelight/Query;", "(I[Ljava/lang/String;Lapp/cash/sqldelight/db/SqlDriver;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/Query;", "(I[Ljava/lang/String;Lapp/cash/sqldelight/db/SqlDriver;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lapp/cash/sqldelight/Query;"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QueryKt {
    public static final <RowType> app.cash.sqldelight.Query<RowType> Query(int i, java.lang.String[] strArr, app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.String str, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return Query(i, strArr, sqlDriver, "unknown", "unknown", str, function1);
    }

    public static final <RowType> app.cash.sqldelight.Query<RowType> Query(int i, java.lang.String[] strArr, app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new app.cash.sqldelight.SimpleQuery(i, strArr, sqlDriver, str, str2, str3, function1);
    }

    public static final <RowType> app.cash.sqldelight.ExecutableQuery<RowType> Query(int i, app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.String str, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return Query(i, sqlDriver, "unknown", "unknown", str, function1);
    }

    public static final <RowType> app.cash.sqldelight.ExecutableQuery<RowType> Query(int i, app.cash.sqldelight.db.SqlDriver sqlDriver, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.functions.Function1<? super app.cash.sqldelight.db.SqlCursor, ? extends RowType> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sqlDriver, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(function1, "");
        return new app.cash.sqldelight.SimpleExecutableQuery(i, sqlDriver, str, str2, str3, function1);
    }
}
