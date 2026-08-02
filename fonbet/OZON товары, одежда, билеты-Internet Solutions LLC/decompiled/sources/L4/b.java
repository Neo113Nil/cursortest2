package L4;

import J4.s;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class b {
    public static final void a(@NotNull O4.b db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Tc.b builder = C7714v.B();
        Cursor N12 = db2.N1("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (N12.moveToNext()) {
            try {
                builder.add(N12.getString(0));
            } finally {
            }
        }
        Unit unit = Unit.f71690a;
        N12.close();
        Intrinsics.checkNotNullParameter(builder, "builder");
        ListIterator listIterator = builder.B().listIterator(0);
        while (listIterator.hasNext()) {
            String triggerName = (String) listIterator.next();
            Intrinsics.checkNotNullExpressionValue(triggerName, "triggerName");
            if (h.e0(triggerName, "room_fts_content_sync_", false)) {
                db2.O0("DROP TRIGGER IF EXISTS ".concat(triggerName));
            }
        }
    }

    @NotNull
    public static final Cursor b(@NotNull s db2, @NotNull O4.e sqLiteQuery, boolean z11) {
        Intrinsics.checkNotNullParameter(db2, "db");
        Intrinsics.checkNotNullParameter(sqLiteQuery, "sqLiteQuery");
        Cursor c11 = db2.query(sqLiteQuery, null);
        if (z11 && (c11 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) c11;
            int count = abstractWindowedCursor.getCount();
            if ((abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count) {
                Intrinsics.checkNotNullParameter(c11, "c");
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(c11.getColumnNames(), c11.getCount());
                    while (c11.moveToNext()) {
                        Object[] objArr = new Object[c11.getColumnCount()];
                        int columnCount = c11.getColumnCount();
                        for (int i11 = 0; i11 < columnCount; i11++) {
                            int type = c11.getType(i11);
                            if (type == 0) {
                                objArr[i11] = null;
                            } else if (type == 1) {
                                objArr[i11] = Long.valueOf(c11.getLong(i11));
                            } else if (type == 2) {
                                objArr[i11] = Double.valueOf(c11.getDouble(i11));
                            } else if (type == 3) {
                                objArr[i11] = c11.getString(i11);
                            } else {
                                if (type != 4) {
                                    throw new IllegalStateException();
                                }
                                objArr[i11] = c11.getBlob(i11);
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    Vd0.b.a(c11, null);
                    return matrixCursor;
                } finally {
                }
            }
        }
        return c11;
    }
}
