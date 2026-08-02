package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/sqlite/SQLiteStatement;", "", "p0", "", "columnIndexOf", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
/* loaded from: classes7.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtil_androidKt {
    public static final int columnIndexOf(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int columnIndexOfCommon = androidx.room.util.SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, str);
        if (columnIndexOfCommon >= 0) {
            return columnIndexOfCommon;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("`");
        sb.append(str);
        sb.append('`');
        int columnIndexOfCommon2 = androidx.room.util.SQLiteStatementUtil.columnIndexOfCommon(sQLiteStatement, sb.toString());
        if (columnIndexOfCommon2 >= 0) {
            return columnIndexOfCommon2;
        }
        return -1;
    }
}
