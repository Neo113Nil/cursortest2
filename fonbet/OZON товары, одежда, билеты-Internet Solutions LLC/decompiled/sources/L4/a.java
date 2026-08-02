package L4;

import android.database.Cursor;
import android.util.Log;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a {
    public static final int a(@NotNull Cursor c11, @NotNull String name) {
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int columnIndex = c11.getColumnIndex(name);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        int columnIndex2 = c11.getColumnIndex("`" + name + '`');
        if (columnIndex2 >= 0) {
            return columnIndex2;
        }
        return -1;
    }

    public static final int b(@NotNull Cursor c11, @NotNull String name) {
        String str;
        Intrinsics.checkNotNullParameter(c11, "c");
        Intrinsics.checkNotNullParameter(name, "name");
        int a11 = a(c11, name);
        if (a11 >= 0) {
            return a11;
        }
        try {
            String[] columnNames = c11.getColumnNames();
            Intrinsics.checkNotNullExpressionValue(columnNames, "c.columnNames");
            str = C7705l.P(columnNames, null, null, null, null, 63);
        } catch (Exception e11) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e11);
            str = "unknown";
        }
        throw new IllegalArgumentException(Sh.b.c("column '", name, "' does not exist. Available columns: ", str));
    }
}
