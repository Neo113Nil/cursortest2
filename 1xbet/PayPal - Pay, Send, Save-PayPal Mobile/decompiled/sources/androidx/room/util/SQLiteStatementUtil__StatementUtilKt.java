package androidx.room.util;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0015\n\u0002\b\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001b\u0010\u0007\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u0006\u001a+\u0010\f\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/sqlite/SQLiteStatement;", "p0", "", "p1", "", "getColumnIndexOrThrow", "(Landroidx/sqlite/SQLiteStatement;Ljava/lang/String;)I", "columnIndexOfCommon", "getColumnIndex", "", "", "p2", "wrapMappedColumns", "(Landroidx/sqlite/SQLiteStatement;[Ljava/lang/String;[I)Landroidx/sqlite/SQLiteStatement;"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "androidx/room/util/SQLiteStatementUtil")
/* loaded from: classes7.dex */
final /* synthetic */ class SQLiteStatementUtil__StatementUtilKt {
    public static final int getColumnIndexOrThrow(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        int columnIndexOf = androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, str);
        if (columnIndexOf >= 0) {
            return columnIndexOf;
        }
        int columnCount = sQLiteStatement.getColumnCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(sQLiteStatement.getColumnName(i));
        }
        java.lang.String joinToString$default = kotlin.collections.CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, null, 63, null);
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Column '");
        sb.append(str);
        sb.append("' does not exist. Available columns: [");
        sb.append(joinToString$default);
        sb.append(kotlinx.serialization.json.internal.AbstractJsonLexerKt.END_LIST);
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    public static final int columnIndexOfCommon(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        if (sQLiteStatement instanceof androidx.room.util.MappedColumnsSQLiteStatementWrapper) {
            return ((androidx.room.util.MappedColumnsSQLiteStatementWrapper) sQLiteStatement).getColumnIndex(str);
        }
        int columnCount = sQLiteStatement.getColumnCount();
        for (int i = 0; i < columnCount; i++) {
            if (kotlin.jvm.internal.Intrinsics.areEqual(str, sQLiteStatement.getColumnName(i))) {
                return i;
            }
        }
        return -1;
    }

    public static final int getColumnIndex(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        return androidx.room.util.SQLiteStatementUtil.columnIndexOf(sQLiteStatement, str);
    }

    public static final androidx.database.SQLiteStatement wrapMappedColumns(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr, int[] iArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sQLiteStatement, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(strArr, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(iArr, "");
        return new androidx.room.util.MappedColumnsSQLiteStatementWrapper(sQLiteStatement, strArr, iArr);
    }
}
