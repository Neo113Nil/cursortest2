package androidx.room.util;

@kotlin.Metadata(d1 = {"androidx/room/util/SQLiteStatementUtil__StatementUtilKt", "androidx/room/util/SQLiteStatementUtil__StatementUtil_androidKt"}, k = 4, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SQLiteStatementUtil {
    public static final int columnIndexOf(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        return androidx.room.util.SQLiteStatementUtil__StatementUtil_androidKt.columnIndexOf(sQLiteStatement, str);
    }

    public static final int columnIndexOfCommon(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        return androidx.room.util.SQLiteStatementUtil__StatementUtilKt.columnIndexOfCommon(sQLiteStatement, str);
    }

    public static final int getColumnIndex(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        return androidx.room.util.SQLiteStatementUtil__StatementUtilKt.getColumnIndex(sQLiteStatement, str);
    }

    public static final int getColumnIndexOrThrow(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String str) {
        return androidx.room.util.SQLiteStatementUtil__StatementUtilKt.getColumnIndexOrThrow(sQLiteStatement, str);
    }

    public static final androidx.database.SQLiteStatement wrapMappedColumns(androidx.database.SQLiteStatement sQLiteStatement, java.lang.String[] strArr, int[] iArr) {
        return androidx.room.util.SQLiteStatementUtil__StatementUtilKt.wrapMappedColumns(sQLiteStatement, strArr, iArr);
    }
}
